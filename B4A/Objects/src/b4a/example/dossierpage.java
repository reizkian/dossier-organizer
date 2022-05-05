package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class dossierpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.dossierpage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.dossierpage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _scrollview1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblback = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bitmap = null;
public byte[] _buffer = null;
public anywheresoftware.b4a.objects.StringUtils _stringutils = null;
public anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _inputstream = null;
public anywheresoftware.b4a.objects.PanelWrapper _adddossierbtn = null;
public anywheresoftware.b4a.objects.PanelWrapper _adddossierpanel = null;
public anywheresoftware.b4a.objects.PanelWrapper _dossierlistpanel = null;
public anywheresoftware.b4a.objects.LabelWrapper _idlabel = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _picture = null;
public anywheresoftware.b4a.objects.LabelWrapper _documentlabel = null;
public b4a.example3.customlistview _documentslistview = null;
public anywheresoftware.b4a.objects.ListViewWrapper _listviewdossier = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _checkboxselect = null;
public anywheresoftware.b4a.objects.EditTextWrapper _searchdossier = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextdossiername = null;
public String _dossiername = "";
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.dbutils _dbutils = null;
public b4a.example.mdlconnection _mdlconnection = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public Object  _initialize(b4a.example.dossierpage __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="dossierpage";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="End Sub";
return null;
}
public boolean  _activity_keypress(b4a.example.dossierpage __ref,int _keycode) throws Exception{
__ref = this;
RDebugUtils.currentModule="dossierpage";
if (Debug.shouldDelegate(ba, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(ba, "activity_keypress", new Object[] {_keycode}));}
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==__c.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="AddDossierPanel.Visible = False";
__ref._adddossierpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=2883587;
 //BA.debugLineNum = 2883587;BA.debugLine="DossierListPanel.Visible = True";
__ref._dossierlistpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="addDossierBtn.Visible = True";
__ref._adddossierbtn /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=2883589;
 //BA.debugLineNum = 2883589;BA.debugLine="Return False";
if (true) return __c.False;
 }else {
RDebugUtils.currentLine=2883591;
 //BA.debugLineNum = 2883591;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=2883593;
 //BA.debugLineNum = 2883593;BA.debugLine="End Sub";
return false;
}
public String  _adddossierbtn_click(b4a.example.dossierpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dossierpage";
if (Debug.shouldDelegate(ba, "adddossierbtn_click", false))
	 {return ((String) Debug.delegate(ba, "adddossierbtn_click", null));}
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Private Sub addDossierBtn_Click";
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="resetSelectedDocuments";
__ref._resetselecteddocuments /*String*/ (null);
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="DossierListPanel.Visible = False";
__ref._dossierlistpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=2818051;
 //BA.debugLineNum = 2818051;BA.debugLine="addDossierBtn.Visible = False";
__ref._adddossierbtn /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=2818052;
 //BA.debugLineNum = 2818052;BA.debugLine="AddDossierPanel.Visible = True";
__ref._adddossierpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=2818053;
 //BA.debugLineNum = 2818053;BA.debugLine="renderDocumentsList";
__ref._renderdocumentslist /*String*/ (null);
RDebugUtils.currentLine=2818054;
 //BA.debugLineNum = 2818054;BA.debugLine="End Sub";
return "";
}
public String  _resetselecteddocuments(b4a.example.dossierpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dossierpage";
if (Debug.shouldDelegate(ba, "resetselecteddocuments", false))
	 {return ((String) Debug.delegate(ba, "resetselecteddocuments", null));}
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Private Sub resetSelectedDocuments";
RDebugUtils.currentLine=3866625;
 //BA.debugLineNum = 3866625;BA.debugLine="MdlConnection.dbSQL.ExecNonQuery(\"DROP TABLE IF E";
_mdlconnection._dbsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("DROP TABLE IF EXISTS selected_docs");
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="MdlConnection.dbSQL.ExecNonQuery(\"CREATE TABLE se";
_mdlconnection._dbsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("CREATE TABLE selected_docs (ID INTEGER PRIMARY KEY,DOCUMENT_ID INTEGER, SELECTED INTEGER)");
RDebugUtils.currentLine=3866633;
 //BA.debugLineNum = 3866633;BA.debugLine="Log(\"------ RESET DATABASE: selected_doc ------\")";
__c.LogImpl("03866633","------ RESET DATABASE: selected_doc ------",0);
RDebugUtils.currentLine=3866634;
 //BA.debugLineNum = 3866634;BA.debugLine="End Sub";
return "";
}
public String  _renderdocumentslist(b4a.example.dossierpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dossierpage";
if (Debug.shouldDelegate(ba, "renderdocumentslist", false))
	 {return ((String) Debug.delegate(ba, "renderdocumentslist", null));}
int _i = 0;
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Sub renderDocumentsList";
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="DocumentsListView.Clear";
__ref._documentslistview /*b4a.example3.customlistview*/ ._clear();
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="MdlConnection.dbCursor = MdlConnection.dbSQL.Exec";
_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/  = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_mdlconnection._dbsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM documents")));
RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="For i=0 To MdlConnection.dbCursor.RowCount-1";
{
final int step3 = 1;
final int limit3 = (int) (_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=2949124;
 //BA.debugLineNum = 2949124;BA.debugLine="MdlConnection.dbCursor.Position = i";
_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .setPosition(_i);
RDebugUtils.currentLine=2949125;
 //BA.debugLineNum = 2949125;BA.debugLine="readBlob";
__ref._readblob /*String*/ (null);
RDebugUtils.currentLine=2949126;
 //BA.debugLineNum = 2949126;BA.debugLine="DocumentsListView.Add(createDocumentsListItem(Md";
__ref._documentslistview /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createdocumentslistitem /*anywheresoftware.b4a.objects.PanelWrapper*/ (null,_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetString("DOCUMENT_ID"),_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetString("NAME"),__ref._bitmap /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ ,__ref._documentslistview /*b4a.example3.customlistview*/ ._asview().getWidth(),__c.DipToCurrent((int) (95))).getObject())),(Object)(("ID #"+__c.SmartStringFormatter("",(Object)(_i))+"")));
 }
};
RDebugUtils.currentLine=2949128;
 //BA.debugLineNum = 2949128;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(b4a.example.dossierpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="dossierpage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="Root.LoadLayout(\"Header\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("Header",ba);
RDebugUtils.currentLine=2686980;
 //BA.debugLineNum = 2686980;BA.debugLine="lblBack.Visible=True";
__ref._lblback /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=2686981;
 //BA.debugLineNum = 2686981;BA.debugLine="Panel1.LoadLayout(\"listdossier\")";
__ref._panel1 /*anywheresoftware.b4a.objects.PanelWrapper*/ .LoadLayout("listdossier",ba);
RDebugUtils.currentLine=2686982;
 //BA.debugLineNum = 2686982;BA.debugLine="DossierListPanel.Visible = True";
__ref._dossierlistpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=2686983;
 //BA.debugLineNum = 2686983;BA.debugLine="AddDossierPanel.Visible = False";
__ref._adddossierpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=2686985;
 //BA.debugLineNum = 2686985;BA.debugLine="logBridgeTable";
__ref._logbridgetable /*String*/ (null);
RDebugUtils.currentLine=2686986;
 //BA.debugLineNum = 2686986;BA.debugLine="renderDossierList";
__ref._renderdossierlist /*String*/ (null);
RDebugUtils.currentLine=2686987;
 //BA.debugLineNum = 2686987;BA.debugLine="End Sub";
return "";
}
public String  _logbridgetable(b4a.example.dossierpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dossierpage";
if (Debug.shouldDelegate(ba, "logbridgetable", false))
	 {return ((String) Debug.delegate(ba, "logbridgetable", null));}
int _i = 0;
int _dossierid = 0;
int _docid = 0;
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Sub logBridgeTable";
RDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="ListViewDossier.Clear";
__ref._listviewdossier /*anywheresoftware.b4a.objects.ListViewWrapper*/ .Clear();
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="MdlConnection.dbCursor = MdlConnection.dbSQL.Exec";
_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/  = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_mdlconnection._dbsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM bridge")));
RDebugUtils.currentLine=3997699;
 //BA.debugLineNum = 3997699;BA.debugLine="Log(\"bridge table content: \")";
__c.LogImpl("03997699","bridge table content: ",0);
RDebugUtils.currentLine=3997700;
 //BA.debugLineNum = 3997700;BA.debugLine="For i=0 To MdlConnection.dbCursor.RowCount-1";
{
final int step4 = 1;
final int limit4 = (int) (_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=3997701;
 //BA.debugLineNum = 3997701;BA.debugLine="MdlConnection.dbCursor.Position = i";
_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .setPosition(_i);
RDebugUtils.currentLine=3997703;
 //BA.debugLineNum = 3997703;BA.debugLine="Dim dossierID As Int = MdlConnection.dbCursor.Ge";
_dossierid = _mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetInt("DOSSIER_ID");
RDebugUtils.currentLine=3997704;
 //BA.debugLineNum = 3997704;BA.debugLine="Dim docID As Int = MdlConnection.dbCursor.GetInt";
_docid = _mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetInt("DOCUMENT_ID");
RDebugUtils.currentLine=3997706;
 //BA.debugLineNum = 3997706;BA.debugLine="Log($\"dossierID: ${dossierID} includedDocs: ${do";
__c.LogImpl("03997706",("dossierID: "+__c.SmartStringFormatter("",(Object)(_dossierid))+" includedDocs: "+__c.SmartStringFormatter("",(Object)(_docid))+""),0);
 }
};
RDebugUtils.currentLine=3997708;
 //BA.debugLineNum = 3997708;BA.debugLine="End Sub";
return "";
}
public String  _renderdossierlist(b4a.example.dossierpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dossierpage";
if (Debug.shouldDelegate(ba, "renderdossierlist", false))
	 {return ((String) Debug.delegate(ba, "renderdossierlist", null));}
int _i = 0;
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Sub renderDossierList";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="ListViewDossier.Clear";
__ref._listviewdossier /*anywheresoftware.b4a.objects.ListViewWrapper*/ .Clear();
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="MdlConnection.dbCursor = MdlConnection.dbSQL.Exec";
_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/  = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_mdlconnection._dbsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM dossier")));
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="For i = 0 To MdlConnection.dbCursor.RowCount-1";
{
final int step3 = 1;
final int limit3 = (int) (_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=3014660;
 //BA.debugLineNum = 3014660;BA.debugLine="MdlConnection.dbCursor.Position = i";
_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .setPosition(_i);
RDebugUtils.currentLine=3014661;
 //BA.debugLineNum = 3014661;BA.debugLine="ListViewDossier.AddSingleLine(MdlConnection.dbCu";
__ref._listviewdossier /*anywheresoftware.b4a.objects.ListViewWrapper*/ .AddSingleLine(BA.ObjectToCharSequence(_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetString("NAME")));
 }
};
RDebugUtils.currentLine=3014663;
 //BA.debugLineNum = 3014663;BA.debugLine="MdlConnection.dbCursor.Close";
_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .Close();
RDebugUtils.currentLine=3014664;
 //BA.debugLineNum = 3014664;BA.debugLine="ListViewDossier.SingleLineLayout.Label.TextColor";
__ref._listviewdossier /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getSingleLineLayout().Label.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=3014665;
 //BA.debugLineNum = 3014665;BA.debugLine="End Sub";
return "";
}
public String  _booltoint(b4a.example.dossierpage __ref,boolean _boolinput) throws Exception{
__ref = this;
RDebugUtils.currentModule="dossierpage";
if (Debug.shouldDelegate(ba, "booltoint", false))
	 {return ((String) Debug.delegate(ba, "booltoint", new Object[] {_boolinput}));}
int _intoutput = 0;
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Private Sub BoolToInt(boolInput As Boolean)";
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="Dim intOutput As Int";
_intoutput = 0;
RDebugUtils.currentLine=3604483;
 //BA.debugLineNum = 3604483;BA.debugLine="If boolInput Then";
if (_boolinput) { 
RDebugUtils.currentLine=3604484;
 //BA.debugLineNum = 3604484;BA.debugLine="intOutput = 1";
_intoutput = (int) (1);
RDebugUtils.currentLine=3604485;
 //BA.debugLineNum = 3604485;BA.debugLine="Return intOutput";
if (true) return BA.NumberToString(_intoutput);
 }else {
RDebugUtils.currentLine=3604487;
 //BA.debugLineNum = 3604487;BA.debugLine="intOutput = 0";
_intoutput = (int) (0);
RDebugUtils.currentLine=3604488;
 //BA.debugLineNum = 3604488;BA.debugLine="Return intOutput";
if (true) return BA.NumberToString(_intoutput);
 };
RDebugUtils.currentLine=3604491;
 //BA.debugLineNum = 3604491;BA.debugLine="End Sub";
return "";
}
public String  _checkboxselect_checkedchange(b4a.example.dossierpage __ref,boolean _checked) throws Exception{
__ref = this;
RDebugUtils.currentModule="dossierpage";
if (Debug.shouldDelegate(ba, "checkboxselect_checkedchange", false))
	 {return ((String) Debug.delegate(ba, "checkboxselect_checkedchange", new Object[] {_checked}));}
int _index = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
anywheresoftware.b4a.objects.B4XViewWrapper _check = null;
int _i = 0;
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Private Sub CheckBoxSelect_CheckedChange(Checked A";
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="Dim index As Int = DocumentsListView.GetItemFromV";
_index = __ref._documentslistview /*b4a.example3.customlistview*/ ._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))));
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="Dim panel As B4XView = DocumentsListView.GetPanel";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._documentslistview /*b4a.example3.customlistview*/ ._getpanel(_index);
RDebugUtils.currentLine=3473411;
 //BA.debugLineNum = 3473411;BA.debugLine="Dim check As B4XView = panel.GetView(0).GetView(0";
_check = new anywheresoftware.b4a.objects.B4XViewWrapper();
_check = _panel.GetView((int) (0)).GetView((int) (0));
RDebugUtils.currentLine=3473415;
 //BA.debugLineNum = 3473415;BA.debugLine="WriteSelectedDocs(index,check.Checked)";
__ref._writeselecteddocs /*String*/ (null,_index,_check.getChecked());
RDebugUtils.currentLine=3473416;
 //BA.debugLineNum = 3473416;BA.debugLine="Log(\"------ selected documents ------\")";
__c.LogImpl("03473416","------ selected documents ------",0);
RDebugUtils.currentLine=3473417;
 //BA.debugLineNum = 3473417;BA.debugLine="MdlConnection.dbCursor = MdlConnection.dbSQL.Exec";
_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/  = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_mdlconnection._dbsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM selected_docs")));
RDebugUtils.currentLine=3473418;
 //BA.debugLineNum = 3473418;BA.debugLine="For i=0 To MdlConnection.dbCursor.RowCount-1";
{
final int step7 = 1;
final int limit7 = (int) (_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=3473419;
 //BA.debugLineNum = 3473419;BA.debugLine="MdlConnection.dbCursor.Position = i";
_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .setPosition(_i);
RDebugUtils.currentLine=3473420;
 //BA.debugLineNum = 3473420;BA.debugLine="Log(MdlConnection.dbCursor.GetString(\"DOCUMENT_I";
__c.LogImpl("03473420",_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetString("DOCUMENT_ID"),0);
 }
};
RDebugUtils.currentLine=3473423;
 //BA.debugLineNum = 3473423;BA.debugLine="End Sub";
return "";
}
public String  _writeselecteddocs(b4a.example.dossierpage __ref,int _documentid,boolean _selected) throws Exception{
__ref = this;
RDebugUtils.currentModule="dossierpage";
if (Debug.shouldDelegate(ba, "writeselecteddocs", false))
	 {return ((String) Debug.delegate(ba, "writeselecteddocs", new Object[] {_documentid,_selected}));}
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Private Sub WriteSelectedDocs(documentID As Int, S";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="If Selected Then";
if (_selected) { 
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="MdlConnection.dbSQL.ExecNonQuery(\"INSERT INTO se";
_mdlconnection._dbsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("INSERT INTO selected_docs(DOCUMENT_ID, SELECTED) VALUES('"+BA.NumberToString(_documentid)+"','"+BA.NumberToString(1)+"')");
 }else {
RDebugUtils.currentLine=3538948;
 //BA.debugLineNum = 3538948;BA.debugLine="MdlConnection.dbSQL.ExecNonQuery(\"DELETE FROM se";
_mdlconnection._dbsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("DELETE FROM selected_docs WHERE DOCUMENT_ID='"+BA.NumberToString(_documentid)+"'");
 };
RDebugUtils.currentLine=3538950;
 //BA.debugLineNum = 3538950;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.dossierpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dossierpage";
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=2555907;
 //BA.debugLineNum = 2555907;BA.debugLine="Dim ScrollView1 As ScrollView";
_scrollview1 = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="Dim Panel1 As Panel";
_panel1 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2555909;
 //BA.debugLineNum = 2555909;BA.debugLine="Dim lblBack As Label";
_lblback = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2555911;
 //BA.debugLineNum = 2555911;BA.debugLine="Dim bitMap As Bitmap";
_bitmap = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=2555912;
 //BA.debugLineNum = 2555912;BA.debugLine="Dim Buffer() As Byte";
_buffer = new byte[(int) (0)];
;
RDebugUtils.currentLine=2555913;
 //BA.debugLineNum = 2555913;BA.debugLine="Dim stringUtils As StringUtils";
_stringutils = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=2555914;
 //BA.debugLineNum = 2555914;BA.debugLine="Dim inputStream As InputStream";
_inputstream = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=2555916;
 //BA.debugLineNum = 2555916;BA.debugLine="Private addDossierBtn As Panel";
_adddossierbtn = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2555917;
 //BA.debugLineNum = 2555917;BA.debugLine="Private AddDossierPanel As Panel";
_adddossierpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2555918;
 //BA.debugLineNum = 2555918;BA.debugLine="Private DossierListPanel As Panel";
_dossierlistpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2555919;
 //BA.debugLineNum = 2555919;BA.debugLine="Private idLabel As Label";
_idlabel = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2555920;
 //BA.debugLineNum = 2555920;BA.debugLine="Private picture As ImageView";
_picture = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=2555921;
 //BA.debugLineNum = 2555921;BA.debugLine="Private documentLabel As Label";
_documentlabel = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2555922;
 //BA.debugLineNum = 2555922;BA.debugLine="Private DocumentsListView As CustomListView";
_documentslistview = new b4a.example3.customlistview();
RDebugUtils.currentLine=2555923;
 //BA.debugLineNum = 2555923;BA.debugLine="Private ListViewDossier As ListView";
_listviewdossier = new anywheresoftware.b4a.objects.ListViewWrapper();
RDebugUtils.currentLine=2555924;
 //BA.debugLineNum = 2555924;BA.debugLine="Private CheckBoxSelect As CheckBox";
_checkboxselect = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=2555925;
 //BA.debugLineNum = 2555925;BA.debugLine="Private searchDossier As EditText";
_searchdossier = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=2555927;
 //BA.debugLineNum = 2555927;BA.debugLine="Private EditTextDossierName As EditText";
_edittextdossiername = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=2555928;
 //BA.debugLineNum = 2555928;BA.debugLine="Dim DossierName As String";
_dossiername = "";
RDebugUtils.currentLine=2555929;
 //BA.debugLineNum = 2555929;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _createdocumentslistitem(b4a.example.dossierpage __ref,String _id,String _docname,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _docscan,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="dossierpage";
if (Debug.shouldDelegate(ba, "createdocumentslistitem", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createdocumentslistitem", new Object[] {_id,_docname,_docscan,_width,_height}));}
anywheresoftware.b4a.objects.B4XViewWrapper _item = null;
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Sub createDocumentsListItem(ID As String, docName";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="Dim item As B4XView = xui.CreatePanel(\"\")";
_item = new anywheresoftware.b4a.objects.B4XViewWrapper();
_item = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="item.SetLayoutAnimated(0,0,0, width, height)";
_item.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_width,_height);
RDebugUtils.currentLine=3407875;
 //BA.debugLineNum = 3407875;BA.debugLine="item.LoadLayout(\"listview_element\")";
_item.LoadLayout("listview_element",ba);
RDebugUtils.currentLine=3407876;
 //BA.debugLineNum = 3407876;BA.debugLine="idLabel.Text = ID";
__ref._idlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_id));
RDebugUtils.currentLine=3407877;
 //BA.debugLineNum = 3407877;BA.debugLine="documentLabel.Text = docName";
__ref._documentlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_docname));
RDebugUtils.currentLine=3407878;
 //BA.debugLineNum = 3407878;BA.debugLine="picture.Bitmap = docScan";
__ref._picture /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setBitmap((android.graphics.Bitmap)(_docscan.getObject()));
RDebugUtils.currentLine=3407879;
 //BA.debugLineNum = 3407879;BA.debugLine="Return item";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_item.getObject()));
RDebugUtils.currentLine=3407880;
 //BA.debugLineNum = 3407880;BA.debugLine="End Sub";
return null;
}
public String  _lblback_click(b4a.example.dossierpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dossierpage";
if (Debug.shouldDelegate(ba, "lblback_click", false))
	 {return ((String) Debug.delegate(ba, "lblback_click", null));}
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Sub lblBack_Click";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="If AddDossierPanel.Visible = True Then";
if (__ref._adddossierpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getVisible()==__c.True) { 
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="AddDossierPanel.Visible = False";
__ref._adddossierpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="DossierListPanel.Visible = True";
__ref._dossierlistpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=2752516;
 //BA.debugLineNum = 2752516;BA.debugLine="addDossierBtn.Visible = True";
__ref._adddossierbtn /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
 }else {
RDebugUtils.currentLine=2752518;
 //BA.debugLineNum = 2752518;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
 };
RDebugUtils.currentLine=2752520;
 //BA.debugLineNum = 2752520;BA.debugLine="End Sub";
return "";
}
public String  _listviewdossier_itemclick(b4a.example.dossierpage __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="dossierpage";
if (Debug.shouldDelegate(ba, "listviewdossier_itemclick", false))
	 {return ((String) Debug.delegate(ba, "listviewdossier_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Private Sub ListViewDossier_ItemCLick(Position As";
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="End Sub";
return "";
}
public String  _listviewdossier_itemlongclick(b4a.example.dossierpage __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="dossierpage";
if (Debug.shouldDelegate(ba, "listviewdossier_itemlongclick", false))
	 {return ((String) Debug.delegate(ba, "listviewdossier_itemlongclick", new Object[] {_position,_value}));}
int _x = 0;
int _dossierid = 0;
int _i = 0;
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Private Sub ListViewDossier_ItemLongClick (Positio";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="Dim x As Int";
_x = 0;
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="Dim DossierID As Int";
_dossierid = 0;
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="Dim DossierName As String = Value";
_dossiername = BA.ObjectToString(_value);
RDebugUtils.currentLine=3145732;
 //BA.debugLineNum = 3145732;BA.debugLine="x = Msgbox2($\"Delete dossier ${DossierName}?\"$,\"i";
_x = __c.Msgbox2(BA.ObjectToCharSequence(("Delete dossier "+__c.SmartStringFormatter("",(Object)(__ref._dossiername /*String*/ ))+"?")),BA.ObjectToCharSequence("info"),"Yes","","No",(android.graphics.Bitmap)(__c.Null),ba);
RDebugUtils.currentLine=3145733;
 //BA.debugLineNum = 3145733;BA.debugLine="If x = DialogResponse.POSITIVE Then";
if (_x==__c.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=3145734;
 //BA.debugLineNum = 3145734;BA.debugLine="MdlConnection.dbCursor = MdlConnection.dbSQL.Exe";
_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/  = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_mdlconnection._dbsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT ID,NAME FROM dossier")));
RDebugUtils.currentLine=3145735;
 //BA.debugLineNum = 3145735;BA.debugLine="For i = 0 To MdlConnection.dbCursor.RowCount-1";
{
final int step7 = 1;
final int limit7 = (int) (_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=3145736;
 //BA.debugLineNum = 3145736;BA.debugLine="MdlConnection.dbCursor.Position = i";
_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .setPosition(_i);
RDebugUtils.currentLine=3145737;
 //BA.debugLineNum = 3145737;BA.debugLine="If MdlConnection.dbCursor.GetString(\"NAME\") = D";
if ((_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetString("NAME")).equals(__ref._dossiername /*String*/ )) { 
RDebugUtils.currentLine=3145738;
 //BA.debugLineNum = 3145738;BA.debugLine="DossierID = MdlConnection.dbCursor.GetInt(\"ID\"";
_dossierid = _mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetInt("ID");
 };
 }
};
RDebugUtils.currentLine=3145741;
 //BA.debugLineNum = 3145741;BA.debugLine="MdlConnection.dbCursor.Close";
_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .Close();
RDebugUtils.currentLine=3145742;
 //BA.debugLineNum = 3145742;BA.debugLine="MdlConnection.dbSQL.ExecNonQuery(\"DELETE FROM br";
_mdlconnection._dbsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("DELETE FROM bridge WHERE DOSSIER_ID='"+BA.NumberToString(_dossierid)+"'");
RDebugUtils.currentLine=3145743;
 //BA.debugLineNum = 3145743;BA.debugLine="MdlConnection.dbSQL.ExecNonQuery(\"DELETE FROM do";
_mdlconnection._dbsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("DELETE FROM dossier WHERE NAME='"+__ref._dossiername /*String*/ +"'");
 };
RDebugUtils.currentLine=3145746;
 //BA.debugLineNum = 3145746;BA.debugLine="logBridgeTable";
__ref._logbridgetable /*String*/ (null);
RDebugUtils.currentLine=3145747;
 //BA.debugLineNum = 3145747;BA.debugLine="renderDossierList";
__ref._renderdossierlist /*String*/ (null);
RDebugUtils.currentLine=3145748;
 //BA.debugLineNum = 3145748;BA.debugLine="End Sub";
return "";
}
public String  _readblob(b4a.example.dossierpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dossierpage";
if (Debug.shouldDelegate(ba, "readblob", false))
	 {return ((String) Debug.delegate(ba, "readblob", null));}
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Sub readBlob";
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="Buffer = stringUtils.DecodeBase64(MdlConnection.d";
__ref._buffer /*byte[]*/  = __ref._stringutils /*anywheresoftware.b4a.objects.StringUtils*/ .DecodeBase64(_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetString("SCAN"));
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="inputStream.InitializeFromBytesArray(Buffer, 0, B";
__ref._inputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ .InitializeFromBytesArray(__ref._buffer /*byte[]*/ ,(int) (0),__ref._buffer /*byte[]*/ .length);
RDebugUtils.currentLine=3342339;
 //BA.debugLineNum = 3342339;BA.debugLine="bitMap.Initialize2(inputStream)";
__ref._bitmap /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .Initialize2((java.io.InputStream)(__ref._inputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ .getObject()));
RDebugUtils.currentLine=3342340;
 //BA.debugLineNum = 3342340;BA.debugLine="inputStream.Close";
__ref._inputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ .Close();
RDebugUtils.currentLine=3342341;
 //BA.debugLineNum = 3342341;BA.debugLine="End Sub";
return "";
}
public String  _resetdatabase(b4a.example.dossierpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dossierpage";
if (Debug.shouldDelegate(ba, "resetdatabase", false))
	 {return ((String) Debug.delegate(ba, "resetdatabase", null));}
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Private Sub resetDatabase";
RDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="MdlConnection.dbSQL.ExecNonQuery(\"DROP TABLE IF E";
_mdlconnection._dbsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("DROP TABLE IF EXISTS selected_docs");
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="MdlConnection.dbSQL.ExecNonQuery(\"CREATE TABLE se";
_mdlconnection._dbsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("CREATE TABLE selected_docs (ID INTEGER PRIMARY KEY,DOCUMENT_ID INTEGER, SELECTED INTEGER)");
RDebugUtils.currentLine=3932164;
 //BA.debugLineNum = 3932164;BA.debugLine="MdlConnection.dbSQL.ExecNonQuery(\"DROP TABLE IF E";
_mdlconnection._dbsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("DROP TABLE IF EXISTS dossier");
RDebugUtils.currentLine=3932165;
 //BA.debugLineNum = 3932165;BA.debugLine="MdlConnection.dbSQL.ExecNonQuery(\"CREATE TABLE do";
_mdlconnection._dbsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("CREATE TABLE dossier (ID INTEGER PRIMARY KEY,NAME TEXT)");
RDebugUtils.currentLine=3932167;
 //BA.debugLineNum = 3932167;BA.debugLine="MdlConnection.dbSQL.ExecNonQuery(\"DROP TABLE IF E";
_mdlconnection._dbsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("DROP TABLE IF EXISTS bridge");
RDebugUtils.currentLine=3932168;
 //BA.debugLineNum = 3932168;BA.debugLine="MdlConnection.dbSQL.ExecNonQuery(\"CREATE TABLE br";
_mdlconnection._dbsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("CREATE TABLE bridge (ID INTEGER PRIMARY KEY,DOSSIER_ID INTEGER, DOCUMENT_ID INTEGER)");
RDebugUtils.currentLine=3932169;
 //BA.debugLineNum = 3932169;BA.debugLine="Log(\"------ RESET DATABASE: hard ------\")";
__c.LogImpl("03932169","------ RESET DATABASE: hard ------",0);
RDebugUtils.currentLine=3932170;
 //BA.debugLineNum = 3932170;BA.debugLine="End Sub";
return "";
}
public String  _savedossierbridge(b4a.example.dossierpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dossierpage";
if (Debug.shouldDelegate(ba, "savedossierbridge", false))
	 {return ((String) Debug.delegate(ba, "savedossierbridge", null));}
int _dossierid = 0;
int _i = 0;
int _docid = 0;
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Private Sub saveDossierBridge";
RDebugUtils.currentLine=3801089;
 //BA.debugLineNum = 3801089;BA.debugLine="Dim DossierID As Int";
_dossierid = 0;
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="DossierName = EditTextDossierName.Text";
__ref._dossiername /*String*/  = __ref._edittextdossiername /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=3801091;
 //BA.debugLineNum = 3801091;BA.debugLine="MdlConnection.dbCursor = MdlConnection.dbSQL.Exec";
_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/  = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_mdlconnection._dbsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT ID,NAME FROM dossier")));
RDebugUtils.currentLine=3801093;
 //BA.debugLineNum = 3801093;BA.debugLine="For i = 0 To MdlConnection.dbCursor.RowCount-1";
{
final int step4 = 1;
final int limit4 = (int) (_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=3801094;
 //BA.debugLineNum = 3801094;BA.debugLine="MdlConnection.dbCursor.Position = i";
_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .setPosition(_i);
RDebugUtils.currentLine=3801095;
 //BA.debugLineNum = 3801095;BA.debugLine="If MdlConnection.dbCursor.GetString(\"NAME\") = Do";
if ((_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetString("NAME")).equals(__ref._dossiername /*String*/ )) { 
RDebugUtils.currentLine=3801096;
 //BA.debugLineNum = 3801096;BA.debugLine="DossierID = MdlConnection.dbCursor.GetInt(\"ID\")";
_dossierid = _mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetInt("ID");
 };
 }
};
RDebugUtils.currentLine=3801099;
 //BA.debugLineNum = 3801099;BA.debugLine="MdlConnection.dbCursor.Close";
_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .Close();
RDebugUtils.currentLine=3801100;
 //BA.debugLineNum = 3801100;BA.debugLine="Log($\"get dossier ID: ${DossierID} of ${DossierNa";
__c.LogImpl("03801100",("get dossier ID: "+__c.SmartStringFormatter("",(Object)(_dossierid))+" of "+__c.SmartStringFormatter("",(Object)(__ref._dossiername /*String*/ ))+" "),0);
RDebugUtils.currentLine=3801102;
 //BA.debugLineNum = 3801102;BA.debugLine="MdlConnection.dbCursor = MdlConnection.dbSQL.Exec";
_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/  = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_mdlconnection._dbsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT DOCUMENT_ID,SELECTED FROM selected_docs")));
RDebugUtils.currentLine=3801103;
 //BA.debugLineNum = 3801103;BA.debugLine="For i = 0 To MdlConnection.dbCursor.RowCount-1";
{
final int step13 = 1;
final int limit13 = (int) (_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit13 ;_i = _i + step13 ) {
RDebugUtils.currentLine=3801104;
 //BA.debugLineNum = 3801104;BA.debugLine="MdlConnection.dbCursor.Position = i";
_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .setPosition(_i);
RDebugUtils.currentLine=3801105;
 //BA.debugLineNum = 3801105;BA.debugLine="Dim docID As Int = MdlConnection.dbCursor.GetInt";
_docid = _mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetInt("DOCUMENT_ID");
RDebugUtils.currentLine=3801106;
 //BA.debugLineNum = 3801106;BA.debugLine="MdlConnection.dbSQL.ExecNonQuery(\"INSERT INTO br";
_mdlconnection._dbsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("INSERT INTO bridge(DOSSIER_ID, DOCUMENT_ID) VALUES('"+BA.NumberToString(_dossierid)+"','"+BA.NumberToString(_docid)+"')");
RDebugUtils.currentLine=3801107;
 //BA.debugLineNum = 3801107;BA.debugLine="Log($\"put value to bridge table, dossierID:${Dos";
__c.LogImpl("03801107",("put value to bridge table, dossierID:"+__c.SmartStringFormatter("",(Object)(_dossierid))+"  docID:"+__c.SmartStringFormatter("",(Object)(_docid))+" "),0);
 }
};
RDebugUtils.currentLine=3801109;
 //BA.debugLineNum = 3801109;BA.debugLine="MdlConnection.dbCursor.Close";
_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .Close();
RDebugUtils.currentLine=3801110;
 //BA.debugLineNum = 3801110;BA.debugLine="End Sub";
return "";
}
public String  _savedossierbtn_click(b4a.example.dossierpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dossierpage";
if (Debug.shouldDelegate(ba, "savedossierbtn_click", false))
	 {return ((String) Debug.delegate(ba, "savedossierbtn_click", null));}
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Private Sub saveDossierBtn_Click";
RDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="saveDossierName";
__ref._savedossiername /*String*/ (null);
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="saveDossierBridge";
__ref._savedossierbridge /*String*/ (null);
RDebugUtils.currentLine=3670019;
 //BA.debugLineNum = 3670019;BA.debugLine="End Sub";
return "";
}
public String  _savedossiername(b4a.example.dossierpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dossierpage";
if (Debug.shouldDelegate(ba, "savedossiername", false))
	 {return ((String) Debug.delegate(ba, "savedossiername", null));}
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Private Sub saveDossierName";
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="DossierName = EditTextDossierName.Text";
__ref._dossiername /*String*/  = __ref._edittextdossiername /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="MdlConnection.dbSQL.ExecNonQuery(\"INSERT INTO dos";
_mdlconnection._dbsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("INSERT INTO dossier(NAME) VALUES('"+__ref._dossiername /*String*/ +"')");
RDebugUtils.currentLine=3735555;
 //BA.debugLineNum = 3735555;BA.debugLine="End Sub";
return "";
}
public String  _searchdossier_textchanged(b4a.example.dossierpage __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="dossierpage";
if (Debug.shouldDelegate(ba, "searchdossier_textchanged", false))
	 {return ((String) Debug.delegate(ba, "searchdossier_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Private Sub searchDossier_TextChanged (Old As Stri";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="searchingDossier";
__ref._searchingdossier /*String*/ (null);
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="End Sub";
return "";
}
public String  _searchingdossier(b4a.example.dossierpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dossierpage";
if (Debug.shouldDelegate(ba, "searchingdossier", false))
	 {return ((String) Debug.delegate(ba, "searchingdossier", null));}
int _i = 0;
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Private Sub searchingDossier";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="ListViewDossier.Clear";
__ref._listviewdossier /*anywheresoftware.b4a.objects.ListViewWrapper*/ .Clear();
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="MdlConnection.dbCursor = MdlConnection.dbSQL.Exec";
_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/  = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_mdlconnection._dbsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM dossier WHERE NAME LIKE '"+__ref._searchdossier /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()+"%'")));
RDebugUtils.currentLine=3276803;
 //BA.debugLineNum = 3276803;BA.debugLine="For i = 0 To MdlConnection.dbCursor.RowCount-1";
{
final int step3 = 1;
final int limit3 = (int) (_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=3276804;
 //BA.debugLineNum = 3276804;BA.debugLine="MdlConnection.dbCursor.Position = i";
_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .setPosition(_i);
RDebugUtils.currentLine=3276805;
 //BA.debugLineNum = 3276805;BA.debugLine="ListViewDossier.AddSingleLine(MdlConnection.dbCu";
__ref._listviewdossier /*anywheresoftware.b4a.objects.ListViewWrapper*/ .AddSingleLine(BA.ObjectToCharSequence(_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetString("NAME")));
 }
};
RDebugUtils.currentLine=3276807;
 //BA.debugLineNum = 3276807;BA.debugLine="MdlConnection.dbCursor.Close";
_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .Close();
RDebugUtils.currentLine=3276808;
 //BA.debugLineNum = 3276808;BA.debugLine="ListViewDossier.SingleLineLayout.Label.TextColor";
__ref._listviewdossier /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getSingleLineLayout().Label.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=3276809;
 //BA.debugLineNum = 3276809;BA.debugLine="End Sub";
return "";
}
}