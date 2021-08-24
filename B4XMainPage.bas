B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.85
@EndOfDesignText@
#Region Shared Files
#CustomBuildAction: folders ready, %WINDIR%\System32\Robocopy.exe,"..\..\Shared Files" "..\Files"
'Ctrl + click to sync files: ide://run?file=%WINDIR%\System32\Robocopy.exe&args=..\..\Shared+Files&args=..\Files&FilesSync=True
#End Region

'Ctrl + click to export as zip: ide://run?File=%B4X%\Zipper.jar&Args=Project.zip

Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	
	'// * MAIN PAGE VARIABLES * //'
	Dim lblBack As Label
	Dim ScrollView1 As ScrollView
	
	'Scan Document'
	Dim ScanDocument As ScanDocumentPage
	Private ScanDocumentBtn As Panel
	
	'List Documet'
	Dim ListDocument As ListDocumentPage
	Private ListDocumentBtn As Panel
	
	'Dossier'
	Dim Dossier As DossierPage
	Private DossierBtn As Panel
	
End Sub

Public Sub Initialize
	
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("header")
	ScrollView1.Panel.LoadLayout("mainpage")
	lblBack.Visible = False
	
	'call database connection'
	MdlConnection.connection
	
	ScanDocument.Initialize
	B4XPages.AddPage("ScanDocument", ScanDocument)
	ListDocument.Initialize
	B4XPages.AddPage("ListDocument", ListDocument)
	Dossier.Initialize
	B4XPages.AddPage("Dossier", Dossier)
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.


Private Sub ScanDocumentBtn_Click
	B4XPages.ShowPage("ScanDocument")
End Sub

Private Sub ListDocumentBtn_Click
	B4XPages.ShowPage("ListDocument")
End Sub

Private Sub DossierBtn_Click
	B4XPages.ShowPage("Dossier")
End Sub