B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10.7
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Dim ScrollView1 As ScrollView
	Dim lblBack As Label
	
	Private ListViewDocuments As ListView
	Private searchDocument As EditText
	
	Dim bitMap As Bitmap
	Dim Buffer() As Byte
	Dim stringUtils As StringUtils
	Dim inputStream As InputStream
	
	Private ID As Int
	Private docID As EditText
	Private docName As EditText
	Private docType As EditText
	Private docExpiry As EditText
	
	Private ListPanel As Panel
	Private UpdatePanel As Panel
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Root.LoadLayout("Header")
	lblBack.Visible=True
	ScrollView1.Panel.LoadLayout("listdocument")

	UpdatePanel.Visible = False
	ListPanel.Visible = True
	renderDataListView
End Sub

Private Sub lblBack_Click
	If UpdatePanel.Visible = True Then
		UpdatePanel.Visible = False
		ListPanel.Visible = True
	Else
		B4XPages.ClosePage(Me)
	End If
End Sub

Sub renderDataListView
	ListViewDocuments.Clear
	MdlConnection.dbCursor = MdlConnection.dbSQL.ExecQuery("SELECT * FROM documents")
	For i = 0 To MdlConnection.dbCursor.RowCount-1
		MdlConnection.dbCursor.Position = i
		'call readBlob sub'
		readBlob
		ListViewDocuments.AddTwoLinesAndBitmap(MdlConnection.dbCursor.GetString("DOCUMENT_ID"), MdlConnection.dbCursor.GetString("NAME"), bitMap)
		ID = MdlConnection.dbCursor.GetInt("ID")
		Log(ID)
	Next
	ListViewDocuments.TwoLinesAndBitmap.Label.TextColor = Colors.Black
	ListViewDocuments.TwoLinesAndBitmap.SecondLabel.TextColor = Colors.Black
End Sub

Sub readBlob
	Buffer = stringUtils.DecodeBase64(MdlConnection.dbCursor.GetString("SCAN"))
	inputStream.InitializeFromBytesArray(Buffer, 0, Buffer.Length)
	bitMap.Initialize2(inputStream)
	inputStream.Close
End Sub

Private Sub ListViewDocuments_ItemClick(Position As Int, Value As Object)
	ListPanel.Visible = False
	UpdatePanel.Visible = True
	docID.Text = Value
End Sub

Private Sub listViewDocuments_ItemLongClick (Position As Int, Value As Object)
	Dim x As Int
	x = Msgbox2("Delete document?","info", "Yes","", "No", Null)
	If x = DialogResponse.POSITIVE Then
		MdlConnection.dbSQL.ExecNonQuery("DELETE FROM documents WHERE DOCUMENT_ID='"& Value & "'")
	End If
	'refresh listView with new data'
	renderDataListView
End Sub

Private Sub searchDocument_TextChanged (Old As String, New As String)
	searchingDocument
End Sub

Sub searchingDocument
	ListViewDocuments.Clear
	MdlConnection.dbCursor = MdlConnection.dbSQL.ExecQuery("SELECT * FROM documents WHERE NAME LIKE '" & searchDocument.Text & "%'")
	For i = 0 To MdlConnection.dbCursor.RowCount-1
		MdlConnection.dbCursor.Position = i
		'call readBlob sub'
		readBlob
		ListViewDocuments.AddTwoLinesAndBitmap(MdlConnection.dbCursor.GetString("ID"), MdlConnection.dbCursor.GetString("NAME"), bitMap)
	Next
	ListViewDocuments.TwoLinesAndBitmap.Label.TextColor = Colors.Black
	ListViewDocuments.TwoLinesAndBitmap.SecondLabel.TextColor = Colors.Black
End Sub

Private Sub UpdatePropertiesButton_Click
	Try
		MdlConnection.dbSQL.ExecNonQuery("UPDATE documents SET NAME='"& docName.Text & "', TYPE='"& docType.Text & "', EXPIRED='"& docExpiry.Text & "'WHERE DOCUMENT_ID ='" & docID.Text & "'")
		ToastMessageShow("sucessfully saved document",False)
		renderDataListView
		B4XPages.ClosePage(Me)
	Catch
		ToastMessageShow("failed",False)
	End Try
End Sub