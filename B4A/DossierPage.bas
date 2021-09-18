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
	Private CheckBoxSelect As CheckBox	
	Private selectedDocuments() As String = Array As String()
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
		Log(i)
		MdlConnection.dbCursor.Position = i
		readBlob
		DocumentsListView.Add(createDocumentsListItem(MdlConnection.dbCursor.GetString("DOCUMENT_ID"), MdlConnection.dbCursor.GetString("NAME"), bitMap, DocumentsListView.AsView.Width, 95dip), $"ID #${i}"$)
	Next
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
	MsgboxAsync($"Item value: ${DocumentsListView.GetValue(index)} Check value: ${check.Checked}"$, "")
End Sub