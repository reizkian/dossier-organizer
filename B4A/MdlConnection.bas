B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=10.7
@EndOfDesignText@
'Code module
'Subs in this code module will be accessible from all modules.
Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	
	Dim dbSQL As SQL
	Dim dbCursor As Cursor
	
End Sub

Sub connection
	Dim str As String
	str = DBUtils.CopyDBFromAssets("dossier_organizer.db")
	dbSQL.Initialize(str, "dossier_organizer.db", True)
End Sub