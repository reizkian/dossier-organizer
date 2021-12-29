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
	Dim Panel1 As Panel
	Dim lblBack As Label
	
	Dim bitMap As Bitmap
	Dim Buffer() As Byte
	Dim stringUtils As StringUtils
	Dim inputStream As InputStream
	
	Private addDossierBtn As Panel
	Private AddDossierPanel As Panel
	Private DossierListPanel As Panel
	Private idLabel As Label
	Private picture As ImageView
	Private documentLabel As Label
	Private DocumentsListView As CustomListView
	Private ListViewDossier As ListView
	Private CheckBoxSelect As CheckBox
	Private searchDossier As EditText
	
	Private EditTextDossierName As EditText
	Dim DossierName As String
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize As Object
	Return Me
End Sub

Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Root.LoadLayout("Header")
	lblBack.Visible=True
	Panel1.LoadLayout("listdossier")
	DossierListPanel.Visible = True
	AddDossierPanel.Visible = False
	'resetDatabase
	logBridgeTable
	renderDossierList
End Sub

Sub lblBack_Click
	If AddDossierPanel.Visible = True Then
		AddDossierPanel.Visible = False
		DossierListPanel.Visible = True
		addDossierBtn.Visible = True
	Else
		B4XPages.ClosePage(Me)
	End If
End Sub

Private Sub addDossierBtn_Click
	resetSelectedDocuments
	DossierListPanel.Visible = False
	addDossierBtn.Visible = False
	AddDossierPanel.Visible = True
	renderDocumentsList
End Sub

'Overide Back Press'
Sub Activity_KeyPress (KeyCode As Int) As Boolean
	If KeyCode = KeyCodes.KEYCODE_BACK Then
		AddDossierPanel.Visible = False
		DossierListPanel.Visible = True
		addDossierBtn.Visible = True
		Return False                                   
	Else
		Return True
	End If
End Sub

Sub renderDocumentsList
	DocumentsListView.Clear
	MdlConnection.dbCursor = MdlConnection.dbSQL.ExecQuery("SELECT * FROM documents")
	For i=0 To MdlConnection.dbCursor.RowCount-1
		MdlConnection.dbCursor.Position = i
		readBlob
		DocumentsListView.Add(createDocumentsListItem(MdlConnection.dbCursor.GetString("DOCUMENT_ID"), MdlConnection.dbCursor.GetString("NAME"), bitMap, DocumentsListView.AsView.Width, 95dip), $"ID #${i}"$)
	Next
End Sub

Sub renderDossierList
	ListViewDossier.Clear
	MdlConnection.dbCursor = MdlConnection.dbSQL.ExecQuery("SELECT * FROM dossier")
	For i = 0 To MdlConnection.dbCursor.RowCount-1
		MdlConnection.dbCursor.Position = i
		ListViewDossier.AddSingleLine(MdlConnection.dbCursor.GetString("NAME"))
	Next
	MdlConnection.dbCursor.Close
	ListViewDossier.SingleLineLayout.Label.TextColor = Colors.Black
End Sub

Private Sub ListViewDossier_ItemCLick(Position As Int, Value As Object)
	
End Sub

Private Sub ListViewDossier_ItemLongClick (Position As Int, Value As Object)
	Dim x As Int
	Dim DossierID As Int
	Dim DossierName As String = Value
	x = Msgbox2($"Delete dossier ${DossierName}?"$,"info", "Yes","", "No", Null)
	If x = DialogResponse.POSITIVE Then
		MdlConnection.dbCursor = MdlConnection.dbSQL.ExecQuery("SELECT ID,NAME FROM dossier")
		For i = 0 To MdlConnection.dbCursor.RowCount-1
			MdlConnection.dbCursor.Position = i
			If MdlConnection.dbCursor.GetString("NAME") = DossierName Then
				DossierID = MdlConnection.dbCursor.GetInt("ID")
			End If
		Next
		MdlConnection.dbCursor.Close
		MdlConnection.dbSQL.ExecNonQuery("DELETE FROM bridge WHERE DOSSIER_ID='"& DossierID & "'")
		MdlConnection.dbSQL.ExecNonQuery("DELETE FROM dossier WHERE NAME='"& DossierName & "'")
	End If
	'refresh listView with new data'
	logBridgeTable
	renderDossierList
End Sub

Private Sub searchDossier_TextChanged (Old As String, New As String)
	searchingDossier
End Sub

Private Sub searchingDossier
	ListViewDossier.Clear
	MdlConnection.dbCursor = MdlConnection.dbSQL.ExecQuery("SELECT * FROM dossier WHERE NAME LIKE '" & searchDossier.Text & "%'")
	For i = 0 To MdlConnection.dbCursor.RowCount-1
		MdlConnection.dbCursor.Position = i
		ListViewDossier.AddSingleLine(MdlConnection.dbCursor.GetString("NAME"))
	Next
	MdlConnection.dbCursor.Close
	ListViewDossier.SingleLineLayout.Label.TextColor = Colors.Black
End Sub

Sub readBlob
	Buffer = stringUtils.DecodeBase64(MdlConnection.dbCursor.GetString("SCAN"))
	inputStream.InitializeFromBytesArray(Buffer, 0, Buffer.Length)
	bitMap.Initialize2(inputStream)
	inputStream.Close
End Sub

Sub createDocumentsListItem(ID As String, docName As String, docScan As Bitmap, width As Int, height As Int) As Panel
	Dim item As B4XView = xui.CreatePanel("")
	item.SetLayoutAnimated(0,0,0, width, height)
	item.LoadLayout("listview_element")
	idLabel.Text = ID
	documentLabel.Text = docName
	picture.Bitmap = docScan
	Return item
End Sub

Private Sub CheckBoxSelect_CheckedChange(Checked As Boolean)
	Dim index As Int = DocumentsListView.GetItemFromView(Sender)
	Dim panel As B4XView = DocumentsListView.GetPanel(index)
	Dim check As B4XView = panel.GetView(0).GetView(0)
	
	'MsgboxAsync($"Item value: ${DocumentsListView.GetValue(index)} Check value: ${BoolToInt(check.Checked)}"$, "")
	
	WriteSelectedDocs(index,check.Checked)
	Log("------ selected documents ------")
	MdlConnection.dbCursor = MdlConnection.dbSQL.ExecQuery("SELECT * FROM selected_docs")
	For i=0 To MdlConnection.dbCursor.RowCount-1
		MdlConnection.dbCursor.Position = i
		Log(MdlConnection.dbCursor.GetString("DOCUMENT_ID"))
	Next
	
End Sub

Private Sub WriteSelectedDocs(documentID As Int, Selected As Boolean)
	If Selected Then
		MdlConnection.dbSQL.ExecNonQuery("INSERT INTO selected_docs(DOCUMENT_ID, SELECTED) VALUES('" & documentID & "','" & 1 & "')")'
	Else
		MdlConnection.dbSQL.ExecNonQuery("DELETE FROM selected_docs WHERE DOCUMENT_ID='"& documentID & "'")
	End If
End Sub

Private Sub BoolToInt(boolInput As Boolean)
	Dim intOutput As Int
	
	If boolInput Then
		intOutput = 1
		Return intOutput
	Else
		intOutput = 0
		Return intOutput
	End If
	
End Sub

Private Sub saveDossierBtn_Click
	saveDossierName
	saveDossierBridge
End Sub

Private Sub saveDossierName
	DossierName = EditTextDossierName.Text
	MdlConnection.dbSQL.ExecNonQuery("INSERT INTO dossier(NAME) VALUES('" & DossierName &"')")'
End Sub

Private Sub saveDossierBridge
	Dim DossierID As Int
	DossierName = EditTextDossierName.Text
	MdlConnection.dbCursor = MdlConnection.dbSQL.ExecQuery("SELECT ID,NAME FROM dossier")
	
	
	For i = 0 To MdlConnection.dbCursor.RowCount-1
		MdlConnection.dbCursor.Position = i
		If MdlConnection.dbCursor.GetString("NAME") = DossierName Then
			DossierID = MdlConnection.dbCursor.GetInt("ID")
		End If
	Next
	MdlConnection.dbCursor.Close
	Log($"get dossier ID: ${DossierID} of ${DossierName} "$)
	
	MdlConnection.dbCursor = MdlConnection.dbSQL.ExecQuery("SELECT DOCUMENT_ID,SELECTED FROM selected_docs")
	For i = 0 To MdlConnection.dbCursor.RowCount-1
		MdlConnection.dbCursor.Position = i
		Dim docID As Int = MdlConnection.dbCursor.GetInt("DOCUMENT_ID")
		MdlConnection.dbSQL.ExecNonQuery("INSERT INTO bridge(DOSSIER_ID, DOCUMENT_ID) VALUES('" & DossierID & "','" & docID & "')")
		Log($"put value to bridge table, dossierID:${DossierID}  docID:${docID} "$)
	Next
	MdlConnection.dbCursor.Close
End Sub

Private Sub resetSelectedDocuments
	MdlConnection.dbSQL.ExecNonQuery("DROP TABLE IF EXISTS selected_docs")
	MdlConnection.dbSQL.ExecNonQuery("CREATE TABLE selected_docs (ID INTEGER PRIMARY KEY,DOCUMENT_ID INTEGER, SELECTED INTEGER)")
	
	'MdlConnection.dbSQL.ExecNonQuery("DROP TABLE IF EXISTS dossier")
	'MdlConnection.dbSQL.ExecNonQuery("CREATE TABLE dossier (ID INTEGER PRIMARY KEY,NAME TEXT)")
	
	'dlConnection.dbSQL.ExecNonQuery("DROP TABLE IF EXISTS bridge")
	'MdlConnection.dbSQL.ExecNonQuery("CREATE TABLE bridge (ID INTEGER PRIMARY KEY,DOSSIER_ID INTEGER, DOCUMENT_ID INTEGER)")
	Log("------ RESET DATABASE: selected_doc ------")
End Sub

Private Sub resetDatabase
	MdlConnection.dbSQL.ExecNonQuery("DROP TABLE IF EXISTS selected_docs")
	MdlConnection.dbSQL.ExecNonQuery("CREATE TABLE selected_docs (ID INTEGER PRIMARY KEY,DOCUMENT_ID INTEGER, SELECTED INTEGER)")
	
	MdlConnection.dbSQL.ExecNonQuery("DROP TABLE IF EXISTS dossier")
	MdlConnection.dbSQL.ExecNonQuery("CREATE TABLE dossier (ID INTEGER PRIMARY KEY,NAME TEXT)")
	
	MdlConnection.dbSQL.ExecNonQuery("DROP TABLE IF EXISTS bridge")
	MdlConnection.dbSQL.ExecNonQuery("CREATE TABLE bridge (ID INTEGER PRIMARY KEY,DOSSIER_ID INTEGER, DOCUMENT_ID INTEGER)")
	Log("------ RESET DATABASE: hard ------")
End Sub

Sub logBridgeTable
	ListViewDossier.Clear
	MdlConnection.dbCursor = MdlConnection.dbSQL.ExecQuery("SELECT * FROM bridge")
	Log("bridge table content: ")
	For i=0 To MdlConnection.dbCursor.RowCount-1
		MdlConnection.dbCursor.Position = i
		
		Dim dossierID As Int = MdlConnection.dbCursor.GetInt("DOSSIER_ID")
		Dim docID As Int = MdlConnection.dbCursor.GetInt("DOCUMENT_ID")
		
		Log($"dossierID: ${dossierID} includedDocs: ${docID}"$)
	Next
End Sub

