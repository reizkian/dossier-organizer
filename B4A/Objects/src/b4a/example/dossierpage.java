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
public b4a.example.main _main = null;
public b4a.example.dbutils _dbutils = null;
public b4a.example.mdlconnection _mdlconnection = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public Object  _initialize(b4a.example.dossierpage __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="dossierpage";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=10092544;
 //BA.debugLineNum = 10092544;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=10092545;
 //BA.debugLineNum = 10092545;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=10092546;
 //BA.debugLineNum = 10092546;BA.debugLine="End Sub";
return null;
}
public boolean  _activity_keypress(b4a.example.dossierpage __ref,int _keycode) throws Exception{
__ref = this;
RDebugUtils.currentModule="dossierpage";
if (Debug.shouldDelegate(ba, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(ba, "activity_keypress", new Object[] {_keycode}));}
RDebugUtils.currentLine=10354688;
 //BA.debugLineNum = 10354688;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=10354689;
 //BA.debugLineNum = 10354689;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==__c.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=10354690;
 //BA.debugLineNum = 10354690;BA.debugLine="AddDossierPanel.Visible = False";
__ref._adddossierpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=10354691;
 //BA.debugLineNum = 10354691;BA.debugLine="DossierListPanel.Visible = True";
__ref._dossierlistpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=10354692;
 //BA.debugLineNum = 10354692;BA.debugLine="addDossierBtn.Visible = True";
__ref._adddossierbtn /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=10354693;
 //BA.debugLineNum = 10354693;BA.debugLine="Return False";
if (true) return __c.False;
 }else {
RDebugUtils.currentLine=10354695;
 //BA.debugLineNum = 10354695;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=10354697;
 //BA.debugLineNum = 10354697;BA.debugLine="End Sub";
return false;
}
public String  _adddossierbtn_click(b4a.example.dossierpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dossierpage";
if (Debug.shouldDelegate(ba, "adddossierbtn_click", false))
	 {return ((String) Debug.delegate(ba, "adddossierbtn_click", null));}
RDebugUtils.currentLine=10289152;
 //BA.debugLineNum = 10289152;BA.debugLine="Private Sub addDossierBtn_Click";
RDebugUtils.currentLine=10289153;
 //BA.debugLineNum = 10289153;BA.debugLine="resetSelectedDocuments";
__ref._resetselecteddocuments /*String*/ (null);
RDebugUtils.currentLine=10289154;
 //BA.debugLineNum = 10289154;BA.debugLine="DossierListPanel.Visible = False";
__ref._dossierlistpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=10289155;
 //BA.debugLineNum = 10289155;BA.debugLine="addDossierBtn.Visible = False";
__ref._adddossierbtn /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=10289156;
 //BA.debugLineNum = 10289156;BA.debugLine="AddDossierPanel.Visible = True";
__ref._adddossierpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=10289157;
 //BA.debugLineNum = 10289157;BA.debugLine="renderDocumentsList";
__ref._renderdocumentslist /*String*/ (null);
RDebugUtils.currentLine=10289158;
 //BA.debugLineNum = 10289158;BA.debugLine="End Sub";
return "";
}
public String  _resetselecteddocuments(b4a.example.dossierpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dossierpage";
if (Debug.shouldDelegate(ba, "resetselecteddocuments", false))
	 {return ((String) Debug.delegate(ba, "resetselecteddocuments", null));}
RDebugUtils.currentLine=11337728;
 //BA.debugLineNum = 11337728;BA.debugLine="Private Sub resetSelectedDocuments";
RDebugUtils.currentLine=11337729;
 //BA.debugLineNum = 11337729;BA.debugLine="MdlConnection.dbSQL.ExecNonQuery(\"DROP TABLE IF E";
_mdlconnection._dbsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("DROP TABLE IF EXISTS selected_docs");
RDebugUtils.currentLine=11337730;
 //BA.debugLineNum = 11337730;BA.debugLine="MdlConnection.dbSQL.ExecNonQuery(\"CREATE TABLE se";
_mdlconnection._dbsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("CREATE TABLE selected_docs (ID INTEGER PRIMARY KEY,DOCUMENT_ID INTEGER, SELECTED INTEGER)");
RDebugUtils.currentLine=11337737;
 //BA.debugLineNum = 11337737;BA.debugLine="Log(\"------ RESET DATABASE: selected_doc ------\")";
__c.LogImpl("011337737","------ RESET DATABASE: selected_doc ------",0);
RDebugUtils.currentLine=11337738;
 //BA.debugLineNum = 11337738;BA.debugLine="End Sub";
return "";
}
public String  _renderdocumentslist(b4a.example.dossierpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dossierpage";
if (Debug.shouldDelegate(ba, "renderdocumentslist", false))
	 {return ((String) Debug.delegate(ba, "renderdocumentslist", null));}
int _i = 0;
RDebugUtils.currentLine=10420224;
 //BA.debugLineNum = 10420224;BA.debugLine="Sub renderDocumentsList";
RDebugUtils.currentLine=10420225;
 //BA.debugLineNum = 10420225;BA.debugLine="DocumentsListView.Clear";
__ref._documentslistview /*b4a.example3.customlistview*/ ._clear();
RDebugUtils.currentLine=10420226;
 //BA.debugLineNum = 10420226;BA.debugLine="MdlConnection.dbCursor = MdlConnection.dbSQL.Exec";
_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/  = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_mdlconnection._dbsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM documents")));
RDebugUtils.currentLine=10420227;
 //BA.debugLineNum = 10420227;BA.debugLine="For i=0 To MdlConnection.dbCursor.RowCount-1";
{
final int step3 = 1;
final int limit3 = (int) (_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=10420228;
 //BA.debugLineNum = 10420228;BA.debugLine="MdlConnection.dbCursor.Position = i";
_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .setPosition(_i);
RDebugUtils.currentLine=10420229;
 //BA.debugLineNum = 10420229;BA.debugLine="readBlob";
__ref._readblob /*String*/ (null);
RDebugUtils.currentLine=10420230;
 //BA.debugLineNum = 10420230;BA.debugLine="DocumentsListView.Add(createDocumentsListItem(Md";
__ref._documentslistview /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createdocumentslistitem /*anywheresoftware.b4a.objects.PanelWrapper*/ (null,_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetString("DOCUMENT_ID"),_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetString("NAME"),__ref._bitmap /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ ,__ref._documentslistview /*b4a.example3.customlistview*/ ._asview().getWidth(),__c.DipToCurrent((int) (95))).getObject())),(Object)(("ID #"+__c.SmartStringFormatter("",(Object)(_i))+"")));
 }
};
RDebugUtils.currentLine=10420232;
 //BA.debugLineNum = 10420232;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(b4a.example.dossierpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="dossierpage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=10158080;
 //BA.debugLineNum = 10158080;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=10158081;
 //BA.debugLineNum = 10158081;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=10158083;
 //BA.debugLineNum = 10158083;BA.debugLine="Root.LoadLayout(\"Header\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("Header",ba);
RDebugUtils.currentLine=10158084;
 //BA.debugLineNum = 10158084;BA.debugLine="lblBack.Visible=True";
__ref._lblback /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=10158085;
 //BA.debugLineNum = 10158085;BA.debugLine="Panel1.LoadLayout(\"listdossier\")";
__ref._panel1 /*anywheresoftware.b4a.objects.PanelWrapper*/ .LoadLayout("listdossier",ba);
RDebugUtils.currentLine=10158086;
 //BA.debugLineNum = 10158086;BA.debugLine="DossierListPanel.Visible = True";
__ref._dossierlistpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=10158087;
 //BA.debugLineNum = 10158087;BA.debugLine="AddDossierPanel.Visible = False";
__ref._adddossierpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=10158089;
 //BA.debugLineNum = 10158089;BA.debugLine="logBridgeTable";
__ref._logbridgetable /*String*/ (null);
RDebugUtils.currentLine=10158090;
 //BA.debugLineNum = 10158090;BA.debugLine="renderDossierList";
__ref._renderdossierlist /*String*/ (null);
RDebugUtils.currentLine=10158091;
 //BA.debugLineNum = 10158091;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=11468800;
 //BA.debugLineNum = 11468800;BA.debugLine="Sub logBridgeTable";
RDebugUtils.currentLine=11468801;
 //BA.debugLineNum = 11468801;BA.debugLine="ListViewDossier.Clear";
__ref._listviewdossier /*anywheresoftware.b4a.objects.ListViewWrapper*/ .Clear();
RDebugUtils.currentLine=11468802;
 //BA.debugLineNum = 11468802;BA.debugLine="MdlConnection.dbCursor = MdlConnection.dbSQL.Exec";
_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/  = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_mdlconnection._dbsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM bridge")));
RDebugUtils.currentLine=11468803;
 //BA.debugLineNum = 11468803;BA.debugLine="Log(\"bridge table content: \")";
__c.LogImpl("011468803","bridge table content: ",0);
RDebugUtils.currentLine=11468804;
 //BA.debugLineNum = 11468804;BA.debugLine="For i=0 To MdlConnection.dbCursor.RowCount-1";
{
final int step4 = 1;
final int limit4 = (int) (_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=11468805;
 //BA.debugLineNum = 11468805;BA.debugLine="MdlConnection.dbCursor.Position = i";
_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .setPosition(_i);
RDebugUtils.currentLine=11468807;
 //BA.debugLineNum = 11468807;BA.debugLine="Dim dossierID As Int = MdlConnection.dbCursor.Ge";
_dossierid = _mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetInt("DOSSIER_ID");
RDebugUtils.currentLine=11468808;
 //BA.debugLineNum = 11468808;BA.debugLine="Dim docID As Int = MdlConnection.dbCursor.GetInt";
_docid = _mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetInt("DOCUMENT_ID");
RDebugUtils.currentLine=11468810;
 //BA.debugLineNum = 11468810;BA.debugLine="Log($\"dossierID: ${dossierID} includedDocs: ${do";
__c.LogImpl("011468810",("dossierID: "+__c.SmartStringFormatter("",(Object)(_dossierid))+" includedDocs: "+__c.SmartStringFormatter("",(Object)(_docid))+""),0);
 }
};
RDebugUtils.currentLine=11468812;
 //BA.debugLineNum = 11468812;BA.debugLine="End Sub";
return "";
}
public String  _renderdossierlist(b4a.example.dossierpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dossierpage";
if (Debug.shouldDelegate(ba, "renderdossierlist", false))
	 {return ((String) Debug.delegate(ba, "renderdossierlist", null));}
int _i = 0;
RDebugUtils.currentLine=10485760;
 //BA.debugLineNum = 10485760;BA.debugLine="Sub renderDossierList";
RDebugUtils.currentLine=10485761;
 //BA.debugLineNum = 10485761;BA.debugLine="ListViewDossier.Clear";
__ref._listviewdossier /*anywheresoftware.b4a.objects.ListViewWrapper*/ .Clear();
RDebugUtils.currentLine=10485762;
 //BA.debugLineNum = 10485762;BA.debugLine="MdlConnection.dbCursor = MdlConnection.dbSQL.Exec";
_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/  = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_mdlconnection._dbsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM dossier")));
RDebugUtils.currentLine=10485763;
 //BA.debugLineNum = 10485763;BA.debugLine="For i = 0 To MdlConnection.dbCursor.RowCount-1";
{
final int step3 = 1;
final int limit3 = (int) (_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=10485764;
 //BA.debugLineNum = 10485764;BA.debugLine="MdlConnection.dbCursor.Position = i";
_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .setPosition(_i);
RDebugUtils.currentLine=10485765;
 //BA.debugLineNum = 10485765;BA.debugLine="ListViewDossier.AddSingleLine(MdlConnection.dbCu";
__ref._listviewdossier /*anywheresoftware.b4a.objects.ListViewWrapper*/ .AddSingleLine(BA.ObjectToCharSequence(_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetString("NAME")));
 }
};
RDebugUtils.currentLine=10485767;
 //BA.debugLineNum = 10485767;BA.debugLine="MdlConnection.dbCursor.Close";
_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .Close();
RDebugUtils.currentLine=10485768;
 //BA.debugLineNum = 10485768;BA.debugLine="ListViewDossier.SingleLineLayout.Label.TextColor";
__ref._listviewdossier /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getSingleLineLayout().Label.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=10485769;
 //BA.debugLineNum = 10485769;BA.debugLine="End Sub";
return "";
}
public String  _booltoint(b4a.example.dossierpage __ref,boolean _boolinput) throws Exception{
__ref = this;
RDebugUtils.currentModule="dossierpage";
if (Debug.shouldDelegate(ba, "booltoint", false))
	 {return ((String) Debug.delegate(ba, "booltoint", new Object[] {_boolinput}));}
int _intoutput = 0;
RDebugUtils.currentLine=11075584;
 //BA.debugLineNum = 11075584;BA.debugLine="Private Sub BoolToInt(boolInput As Boolean)";
RDebugUtils.currentLine=11075585;
 //BA.debugLineNum = 11075585;BA.debugLine="Dim intOutput As Int";
_intoutput = 0;
RDebugUtils.currentLine=11075587;
 //BA.debugLineNum = 11075587;BA.debugLine="If boolInput Then";
if (_boolinput) { 
RDebugUtils.currentLine=11075588;
 //BA.debugLineNum = 11075588;BA.debugLine="intOutput = 1";
_intoutput = (int) (1);
RDebugUtils.currentLine=11075589;
 //BA.debugLineNum = 11075589;BA.debugLine="Return intOutput";
if (true) return BA.NumberToString(_intoutput);
 }else {
RDebugUtils.currentLine=11075591;
 //BA.debugLineNum = 11075591;BA.debugLine="intOutput = 0";
_intoutput = (int) (0);
RDebugUtils.currentLine=11075592;
 //BA.debugLineNum = 11075592;BA.debugLine="Return intOutput";
if (true) return BA.NumberToString(_intoutput);
 };
RDebugUtils.currentLine=11075595;
 //BA.debugLineNum = 11075595;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=10944512;
 //BA.debugLineNum = 10944512;BA.debugLine="Private Sub CheckBoxSelect_CheckedChange(Checked A";
RDebugUtils.currentLine=10944513;
 //BA.debugLineNum = 10944513;BA.debugLine="Dim index As Int = DocumentsListView.GetItemFromV";
_index = __ref._documentslistview /*b4a.example3.customlistview*/ ._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))));
RDebugUtils.currentLine=10944514;
 //BA.debugLineNum = 10944514;BA.debugLine="Dim panel As B4XView = DocumentsListView.GetPanel";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._documentslistview /*b4a.example3.customlistview*/ ._getpanel(_index);
RDebugUtils.currentLine=10944515;
 //BA.debugLineNum = 10944515;BA.debugLine="Dim check As B4XView = panel.GetView(0).GetView(0";
_check = new anywheresoftware.b4a.objects.B4XViewWrapper();
_check = _panel.GetView((int) (0)).GetView((int) (0));
RDebugUtils.currentLine=10944519;
 //BA.debugLineNum = 10944519;BA.debugLine="WriteSelectedDocs(index,check.Checked)";
__ref._writeselecteddocs /*String*/ (null,_index,_check.getChecked());
RDebugUtils.currentLine=10944520;
 //BA.debugLineNum = 10944520;BA.debugLine="Log(\"------ selected documents ------\")";
__c.LogImpl("010944520","------ selected documents ------",0);
RDebugUtils.currentLine=10944521;
 //BA.debugLineNum = 10944521;BA.debugLine="MdlConnection.dbCursor = MdlConnection.dbSQL.Exec";
_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/  = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_mdlconnection._dbsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM selected_docs")));
RDebugUtils.currentLine=10944522;
 //BA.debugLineNum = 10944522;BA.debugLine="For i=0 To MdlConnection.dbCursor.RowCount-1";
{
final int step7 = 1;
final int limit7 = (int) (_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=10944523;
 //BA.debugLineNum = 10944523;BA.debugLine="MdlConnection.dbCursor.Position = i";
_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .setPosition(_i);
RDebugUtils.currentLine=10944524;
 //BA.debugLineNum = 10944524;BA.debugLine="Log(MdlConnection.dbCursor.GetString(\"DOCUMENT_I";
__c.LogImpl("010944524",_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetString("DOCUMENT_ID"),0);
 }
};
RDebugUtils.currentLine=10944527;
 //BA.debugLineNum = 10944527;BA.debugLine="End Sub";
return "";
}
public String  _writeselecteddocs(b4a.example.dossierpage __ref,int _documentid,boolean _selected) throws Exception{
__ref = this;
RDebugUtils.currentModule="dossierpage";
if (Debug.shouldDelegate(ba, "writeselecteddocs", false))
	 {return ((String) Debug.delegate(ba, "writeselecteddocs", new Object[] {_documentid,_selected}));}
RDebugUtils.currentLine=11010048;
 //BA.debugLineNum = 11010048;BA.debugLine="Private Sub WriteSelectedDocs(documentID As Int, S";
RDebugUtils.currentLine=11010049;
 //BA.debugLineNum = 11010049;BA.debugLine="If Selected Then";
if (_selected) { 
RDebugUtils.currentLine=11010050;
 //BA.debugLineNum = 11010050;BA.debugLine="MdlConnection.dbSQL.ExecNonQuery(\"INSERT INTO se";
_mdlconnection._dbsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("INSERT INTO selected_docs(DOCUMENT_ID, SELECTED) VALUES('"+BA.NumberToString(_documentid)+"','"+BA.NumberToString(1)+"')");
 }else {
RDebugUtils.currentLine=11010052;
 //BA.debugLineNum = 11010052;BA.debugLine="MdlConnection.dbSQL.ExecNonQuery(\"DELETE FROM se";
_mdlconnection._dbsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("DELETE FROM selected_docs WHERE DOCUMENT_ID='"+BA.NumberToString(_documentid)+"'");
 };
RDebugUtils.currentLine=11010054;
 //BA.debugLineNum = 11010054;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.dossierpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dossierpage";
RDebugUtils.currentLine=10027008;
 //BA.debugLineNum = 10027008;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=10027009;
 //BA.debugLineNum = 10027009;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=10027010;
 //BA.debugLineNum = 10027010;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=10027011;
 //BA.debugLineNum = 10027011;BA.debugLine="Dim ScrollView1 As ScrollView";
_scrollview1 = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=10027012;
 //BA.debugLineNum = 10027012;BA.debugLine="Dim Panel1 As Panel";
_panel1 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=10027013;
 //BA.debugLineNum = 10027013;BA.debugLine="Dim lblBack As Label";
_lblback = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=10027015;
 //BA.debugLineNum = 10027015;BA.debugLine="Dim bitMap As Bitmap";
_bitmap = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=10027016;
 //BA.debugLineNum = 10027016;BA.debugLine="Dim Buffer() As Byte";
_buffer = new byte[(int) (0)];
;
RDebugUtils.currentLine=10027017;
 //BA.debugLineNum = 10027017;BA.debugLine="Dim stringUtils As StringUtils";
_stringutils = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=10027018;
 //BA.debugLineNum = 10027018;BA.debugLine="Dim inputStream As InputStream";
_inputstream = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=10027020;
 //BA.debugLineNum = 10027020;BA.debugLine="Private addDossierBtn As Panel";
_adddossierbtn = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=10027021;
 //BA.debugLineNum = 10027021;BA.debugLine="Private AddDossierPanel As Panel";
_adddossierpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=10027022;
 //BA.debugLineNum = 10027022;BA.debugLine="Private DossierListPanel As Panel";
_dossierlistpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=10027023;
 //BA.debugLineNum = 10027023;BA.debugLine="Private idLabel As Label";
_idlabel = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=10027024;
 //BA.debugLineNum = 10027024;BA.debugLine="Private picture As ImageView";
_picture = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=10027025;
 //BA.debugLineNum = 10027025;BA.debugLine="Private documentLabel As Label";
_documentlabel = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=10027026;
 //BA.debugLineNum = 10027026;BA.debugLine="Private DocumentsListView As CustomListView";
_documentslistview = new b4a.example3.customlistview();
RDebugUtils.currentLine=10027027;
 //BA.debugLineNum = 10027027;BA.debugLine="Private ListViewDossier As ListView";
_listviewdossier = new anywheresoftware.b4a.objects.ListViewWrapper();
RDebugUtils.currentLine=10027028;
 //BA.debugLineNum = 10027028;BA.debugLine="Private CheckBoxSelect As CheckBox";
_checkboxselect = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=10027029;
 //BA.debugLineNum = 10027029;BA.debugLine="Private searchDossier As EditText";
_searchdossier = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=10027031;
 //BA.debugLineNum = 10027031;BA.debugLine="Private EditTextDossierName As EditText";
_edittextdossiername = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=10027032;
 //BA.debugLineNum = 10027032;BA.debugLine="Dim DossierName As String";
_dossiername = "";
RDebugUtils.currentLine=10027033;
 //BA.debugLineNum = 10027033;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _createdocumentslistitem(b4a.example.dossierpage __ref,String _id,String _docname,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _docscan,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="dossierpage";
if (Debug.shouldDelegate(ba, "createdocumentslistitem", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createdocumentslistitem", new Object[] {_id,_docname,_docscan,_width,_height}));}
anywheresoftware.b4a.objects.B4XViewWrapper _item = null;
RDebugUtils.currentLine=10878976;
 //BA.debugLineNum = 10878976;BA.debugLine="Sub createDocumentsListItem(ID As String, docName";
RDebugUtils.currentLine=10878977;
 //BA.debugLineNum = 10878977;BA.debugLine="Dim item As B4XView = xui.CreatePanel(\"\")";
_item = new anywheresoftware.b4a.objects.B4XViewWrapper();
_item = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=10878978;
 //BA.debugLineNum = 10878978;BA.debugLine="item.SetLayoutAnimated(0,0,0, width, height)";
_item.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_width,_height);
RDebugUtils.currentLine=10878979;
 //BA.debugLineNum = 10878979;BA.debugLine="item.LoadLayout(\"listview_element\")";
_item.LoadLayout("listview_element",ba);
RDebugUtils.currentLine=10878980;
 //BA.debugLineNum = 10878980;BA.debugLine="idLabel.Text = ID";
__ref._idlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_id));
RDebugUtils.currentLine=10878981;
 //BA.debugLineNum = 10878981;BA.debugLine="documentLabel.Text = docName";
__ref._documentlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_docname));
RDebugUtils.currentLine=10878982;
 //BA.debugLineNum = 10878982;BA.debugLine="picture.Bitmap = docScan";
__ref._picture /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setBitmap((android.graphics.Bitmap)(_docscan.getObject()));
RDebugUtils.currentLine=10878983;
 //BA.debugLineNum = 10878983;BA.debugLine="Return item";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_item.getObject()));
RDebugUtils.currentLine=10878984;
 //BA.debugLineNum = 10878984;BA.debugLine="End Sub";
return null;
}
public String  _lblback_click(b4a.example.dossierpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dossierpage";
if (Debug.shouldDelegate(ba, "lblback_click", false))
	 {return ((String) Debug.delegate(ba, "lblback_click", null));}
RDebugUtils.currentLine=10223616;
 //BA.debugLineNum = 10223616;BA.debugLine="Sub lblBack_Click";
RDebugUtils.currentLine=10223617;
 //BA.debugLineNum = 10223617;BA.debugLine="If AddDossierPanel.Visible = True Then";
if (__ref._adddossierpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getVisible()==__c.True) { 
RDebugUtils.currentLine=10223618;
 //BA.debugLineNum = 10223618;BA.debugLine="AddDossierPanel.Visible = False";
__ref._adddossierpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=10223619;
 //BA.debugLineNum = 10223619;BA.debugLine="DossierListPanel.Visible = True";
__ref._dossierlistpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=10223620;
 //BA.debugLineNum = 10223620;BA.debugLine="addDossierBtn.Visible = True";
__ref._adddossierbtn /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
 }else {
RDebugUtils.currentLine=10223622;
 //BA.debugLineNum = 10223622;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
 };
RDebugUtils.currentLine=10223624;
 //BA.debugLineNum = 10223624;BA.debugLine="End Sub";
return "";
}
public String  _listviewdossier_itemclick(b4a.example.dossierpage __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="dossierpage";
if (Debug.shouldDelegate(ba, "listviewdossier_itemclick", false))
	 {return ((String) Debug.delegate(ba, "listviewdossier_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=10551296;
 //BA.debugLineNum = 10551296;BA.debugLine="Private Sub ListViewDossier_ItemCLick(Position As";
RDebugUtils.currentLine=10551298;
 //BA.debugLineNum = 10551298;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=10616832;
 //BA.debugLineNum = 10616832;BA.debugLine="Private Sub ListViewDossier_ItemLongClick (Positio";
RDebugUtils.currentLine=10616833;
 //BA.debugLineNum = 10616833;BA.debugLine="Dim x As Int";
_x = 0;
RDebugUtils.currentLine=10616834;
 //BA.debugLineNum = 10616834;BA.debugLine="Dim DossierID As Int";
_dossierid = 0;
RDebugUtils.currentLine=10616835;
 //BA.debugLineNum = 10616835;BA.debugLine="Dim DossierName As String = Value";
_dossiername = BA.ObjectToString(_value);
RDebugUtils.currentLine=10616836;
 //BA.debugLineNum = 10616836;BA.debugLine="x = Msgbox2($\"Delete dossier ${DossierName}?\"$,\"i";
_x = __c.Msgbox2(BA.ObjectToCharSequence(("Delete dossier "+__c.SmartStringFormatter("",(Object)(__ref._dossiername /*String*/ ))+"?")),BA.ObjectToCharSequence("info"),"Yes","","No",(android.graphics.Bitmap)(__c.Null),ba);
RDebugUtils.currentLine=10616837;
 //BA.debugLineNum = 10616837;BA.debugLine="If x = DialogResponse.POSITIVE Then";
if (_x==__c.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=10616838;
 //BA.debugLineNum = 10616838;BA.debugLine="MdlConnection.dbCursor = MdlConnection.dbSQL.Exe";
_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/  = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_mdlconnection._dbsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT ID,NAME FROM dossier")));
RDebugUtils.currentLine=10616839;
 //BA.debugLineNum = 10616839;BA.debugLine="For i = 0 To MdlConnection.dbCursor.RowCount-1";
{
final int step7 = 1;
final int limit7 = (int) (_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=10616840;
 //BA.debugLineNum = 10616840;BA.debugLine="MdlConnection.dbCursor.Position = i";
_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .setPosition(_i);
RDebugUtils.currentLine=10616841;
 //BA.debugLineNum = 10616841;BA.debugLine="If MdlConnection.dbCursor.GetString(\"NAME\") = D";
if ((_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetString("NAME")).equals(__ref._dossiername /*String*/ )) { 
RDebugUtils.currentLine=10616842;
 //BA.debugLineNum = 10616842;BA.debugLine="DossierID = MdlConnection.dbCursor.GetInt(\"ID\"";
_dossierid = _mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetInt("ID");
 };
 }
};
RDebugUtils.currentLine=10616845;
 //BA.debugLineNum = 10616845;BA.debugLine="MdlConnection.dbCursor.Close";
_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .Close();
RDebugUtils.currentLine=10616846;
 //BA.debugLineNum = 10616846;BA.debugLine="MdlConnection.dbSQL.ExecNonQuery(\"DELETE FROM br";
_mdlconnection._dbsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("DELETE FROM bridge WHERE DOSSIER_ID='"+BA.NumberToString(_dossierid)+"'");
RDebugUtils.currentLine=10616847;
 //BA.debugLineNum = 10616847;BA.debugLine="MdlConnection.dbSQL.ExecNonQuery(\"DELETE FROM do";
_mdlconnection._dbsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("DELETE FROM dossier WHERE NAME='"+__ref._dossiername /*String*/ +"'");
 };
RDebugUtils.currentLine=10616850;
 //BA.debugLineNum = 10616850;BA.debugLine="logBridgeTable";
__ref._logbridgetable /*String*/ (null);
RDebugUtils.currentLine=10616851;
 //BA.debugLineNum = 10616851;BA.debugLine="renderDossierList";
__ref._renderdossierlist /*String*/ (null);
RDebugUtils.currentLine=10616852;
 //BA.debugLineNum = 10616852;BA.debugLine="End Sub";
return "";
}
public String  _readblob(b4a.example.dossierpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dossierpage";
if (Debug.shouldDelegate(ba, "readblob", false))
	 {return ((String) Debug.delegate(ba, "readblob", null));}
RDebugUtils.currentLine=10813440;
 //BA.debugLineNum = 10813440;BA.debugLine="Sub readBlob";
RDebugUtils.currentLine=10813441;
 //BA.debugLineNum = 10813441;BA.debugLine="Buffer = stringUtils.DecodeBase64(MdlConnection.d";
__ref._buffer /*byte[]*/  = __ref._stringutils /*anywheresoftware.b4a.objects.StringUtils*/ .DecodeBase64(_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetString("SCAN"));
RDebugUtils.currentLine=10813442;
 //BA.debugLineNum = 10813442;BA.debugLine="inputStream.InitializeFromBytesArray(Buffer, 0, B";
__ref._inputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ .InitializeFromBytesArray(__ref._buffer /*byte[]*/ ,(int) (0),__ref._buffer /*byte[]*/ .length);
RDebugUtils.currentLine=10813443;
 //BA.debugLineNum = 10813443;BA.debugLine="bitMap.Initialize2(inputStream)";
__ref._bitmap /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .Initialize2((java.io.InputStream)(__ref._inputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ .getObject()));
RDebugUtils.currentLine=10813444;
 //BA.debugLineNum = 10813444;BA.debugLine="inputStream.Close";
__ref._inputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ .Close();
RDebugUtils.currentLine=10813445;
 //BA.debugLineNum = 10813445;BA.debugLine="End Sub";
return "";
}
public String  _resetdatabase(b4a.example.dossierpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dossierpage";
if (Debug.shouldDelegate(ba, "resetdatabase", false))
	 {return ((String) Debug.delegate(ba, "resetdatabase", null));}
RDebugUtils.currentLine=11403264;
 //BA.debugLineNum = 11403264;BA.debugLine="Private Sub resetDatabase";
RDebugUtils.currentLine=11403265;
 //BA.debugLineNum = 11403265;BA.debugLine="MdlConnection.dbSQL.ExecNonQuery(\"DROP TABLE IF E";
_mdlconnection._dbsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("DROP TABLE IF EXISTS selected_docs");
RDebugUtils.currentLine=11403266;
 //BA.debugLineNum = 11403266;BA.debugLine="MdlConnection.dbSQL.ExecNonQuery(\"CREATE TABLE se";
_mdlconnection._dbsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("CREATE TABLE selected_docs (ID INTEGER PRIMARY KEY,DOCUMENT_ID INTEGER, SELECTED INTEGER)");
RDebugUtils.currentLine=11403268;
 //BA.debugLineNum = 11403268;BA.debugLine="MdlConnection.dbSQL.ExecNonQuery(\"DROP TABLE IF E";
_mdlconnection._dbsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("DROP TABLE IF EXISTS dossier");
RDebugUtils.currentLine=11403269;
 //BA.debugLineNum = 11403269;BA.debugLine="MdlConnection.dbSQL.ExecNonQuery(\"CREATE TABLE do";
_mdlconnection._dbsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("CREATE TABLE dossier (ID INTEGER PRIMARY KEY,NAME TEXT)");
RDebugUtils.currentLine=11403271;
 //BA.debugLineNum = 11403271;BA.debugLine="MdlConnection.dbSQL.ExecNonQuery(\"DROP TABLE IF E";
_mdlconnection._dbsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("DROP TABLE IF EXISTS bridge");
RDebugUtils.currentLine=11403272;
 //BA.debugLineNum = 11403272;BA.debugLine="MdlConnection.dbSQL.ExecNonQuery(\"CREATE TABLE br";
_mdlconnection._dbsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("CREATE TABLE bridge (ID INTEGER PRIMARY KEY,DOSSIER_ID INTEGER, DOCUMENT_ID INTEGER)");
RDebugUtils.currentLine=11403273;
 //BA.debugLineNum = 11403273;BA.debugLine="Log(\"------ RESET DATABASE: hard ------\")";
__c.LogImpl("011403273","------ RESET DATABASE: hard ------",0);
RDebugUtils.currentLine=11403274;
 //BA.debugLineNum = 11403274;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=11272192;
 //BA.debugLineNum = 11272192;BA.debugLine="Private Sub saveDossierBridge";
RDebugUtils.currentLine=11272193;
 //BA.debugLineNum = 11272193;BA.debugLine="Dim DossierID As Int";
_dossierid = 0;
RDebugUtils.currentLine=11272194;
 //BA.debugLineNum = 11272194;BA.debugLine="DossierName = EditTextDossierName.Text";
__ref._dossiername /*String*/  = __ref._edittextdossiername /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=11272195;
 //BA.debugLineNum = 11272195;BA.debugLine="MdlConnection.dbCursor = MdlConnection.dbSQL.Exec";
_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/  = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_mdlconnection._dbsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT ID,NAME FROM dossier")));
RDebugUtils.currentLine=11272197;
 //BA.debugLineNum = 11272197;BA.debugLine="For i = 0 To MdlConnection.dbCursor.RowCount-1";
{
final int step4 = 1;
final int limit4 = (int) (_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=11272198;
 //BA.debugLineNum = 11272198;BA.debugLine="MdlConnection.dbCursor.Position = i";
_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .setPosition(_i);
RDebugUtils.currentLine=11272199;
 //BA.debugLineNum = 11272199;BA.debugLine="If MdlConnection.dbCursor.GetString(\"NAME\") = Do";
if ((_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetString("NAME")).equals(__ref._dossiername /*String*/ )) { 
RDebugUtils.currentLine=11272200;
 //BA.debugLineNum = 11272200;BA.debugLine="DossierID = MdlConnection.dbCursor.GetInt(\"ID\")";
_dossierid = _mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetInt("ID");
 };
 }
};
RDebugUtils.currentLine=11272203;
 //BA.debugLineNum = 11272203;BA.debugLine="MdlConnection.dbCursor.Close";
_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .Close();
RDebugUtils.currentLine=11272204;
 //BA.debugLineNum = 11272204;BA.debugLine="Log($\"get dossier ID: ${DossierID} of ${DossierNa";
__c.LogImpl("011272204",("get dossier ID: "+__c.SmartStringFormatter("",(Object)(_dossierid))+" of "+__c.SmartStringFormatter("",(Object)(__ref._dossiername /*String*/ ))+" "),0);
RDebugUtils.currentLine=11272206;
 //BA.debugLineNum = 11272206;BA.debugLine="MdlConnection.dbCursor = MdlConnection.dbSQL.Exec";
_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/  = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_mdlconnection._dbsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT DOCUMENT_ID,SELECTED FROM selected_docs")));
RDebugUtils.currentLine=11272207;
 //BA.debugLineNum = 11272207;BA.debugLine="For i = 0 To MdlConnection.dbCursor.RowCount-1";
{
final int step13 = 1;
final int limit13 = (int) (_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit13 ;_i = _i + step13 ) {
RDebugUtils.currentLine=11272208;
 //BA.debugLineNum = 11272208;BA.debugLine="MdlConnection.dbCursor.Position = i";
_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .setPosition(_i);
RDebugUtils.currentLine=11272209;
 //BA.debugLineNum = 11272209;BA.debugLine="Dim docID As Int = MdlConnection.dbCursor.GetInt";
_docid = _mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetInt("DOCUMENT_ID");
RDebugUtils.currentLine=11272210;
 //BA.debugLineNum = 11272210;BA.debugLine="MdlConnection.dbSQL.ExecNonQuery(\"INSERT INTO br";
_mdlconnection._dbsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("INSERT INTO bridge(DOSSIER_ID, DOCUMENT_ID) VALUES('"+BA.NumberToString(_dossierid)+"','"+BA.NumberToString(_docid)+"')");
RDebugUtils.currentLine=11272211;
 //BA.debugLineNum = 11272211;BA.debugLine="Log($\"put value to bridge table, dossierID:${Dos";
__c.LogImpl("011272211",("put value to bridge table, dossierID:"+__c.SmartStringFormatter("",(Object)(_dossierid))+"  docID:"+__c.SmartStringFormatter("",(Object)(_docid))+" "),0);
 }
};
RDebugUtils.currentLine=11272213;
 //BA.debugLineNum = 11272213;BA.debugLine="MdlConnection.dbCursor.Close";
_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .Close();
RDebugUtils.currentLine=11272214;
 //BA.debugLineNum = 11272214;BA.debugLine="End Sub";
return "";
}
public String  _savedossierbtn_click(b4a.example.dossierpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dossierpage";
if (Debug.shouldDelegate(ba, "savedossierbtn_click", false))
	 {return ((String) Debug.delegate(ba, "savedossierbtn_click", null));}
RDebugUtils.currentLine=11141120;
 //BA.debugLineNum = 11141120;BA.debugLine="Private Sub saveDossierBtn_Click";
RDebugUtils.currentLine=11141121;
 //BA.debugLineNum = 11141121;BA.debugLine="saveDossierName";
__ref._savedossiername /*String*/ (null);
RDebugUtils.currentLine=11141122;
 //BA.debugLineNum = 11141122;BA.debugLine="saveDossierBridge";
__ref._savedossierbridge /*String*/ (null);
RDebugUtils.currentLine=11141123;
 //BA.debugLineNum = 11141123;BA.debugLine="End Sub";
return "";
}
public String  _savedossiername(b4a.example.dossierpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dossierpage";
if (Debug.shouldDelegate(ba, "savedossiername", false))
	 {return ((String) Debug.delegate(ba, "savedossiername", null));}
RDebugUtils.currentLine=11206656;
 //BA.debugLineNum = 11206656;BA.debugLine="Private Sub saveDossierName";
RDebugUtils.currentLine=11206657;
 //BA.debugLineNum = 11206657;BA.debugLine="DossierName = EditTextDossierName.Text";
__ref._dossiername /*String*/  = __ref._edittextdossiername /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=11206658;
 //BA.debugLineNum = 11206658;BA.debugLine="MdlConnection.dbSQL.ExecNonQuery(\"INSERT INTO dos";
_mdlconnection._dbsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("INSERT INTO dossier(NAME) VALUES('"+__ref._dossiername /*String*/ +"')");
RDebugUtils.currentLine=11206659;
 //BA.debugLineNum = 11206659;BA.debugLine="End Sub";
return "";
}
public String  _searchdossier_textchanged(b4a.example.dossierpage __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="dossierpage";
if (Debug.shouldDelegate(ba, "searchdossier_textchanged", false))
	 {return ((String) Debug.delegate(ba, "searchdossier_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=10682368;
 //BA.debugLineNum = 10682368;BA.debugLine="Private Sub searchDossier_TextChanged (Old As Stri";
RDebugUtils.currentLine=10682369;
 //BA.debugLineNum = 10682369;BA.debugLine="searchingDossier";
__ref._searchingdossier /*String*/ (null);
RDebugUtils.currentLine=10682370;
 //BA.debugLineNum = 10682370;BA.debugLine="End Sub";
return "";
}
public String  _searchingdossier(b4a.example.dossierpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dossierpage";
if (Debug.shouldDelegate(ba, "searchingdossier", false))
	 {return ((String) Debug.delegate(ba, "searchingdossier", null));}
int _i = 0;
RDebugUtils.currentLine=10747904;
 //BA.debugLineNum = 10747904;BA.debugLine="Private Sub searchingDossier";
RDebugUtils.currentLine=10747905;
 //BA.debugLineNum = 10747905;BA.debugLine="ListViewDossier.Clear";
__ref._listviewdossier /*anywheresoftware.b4a.objects.ListViewWrapper*/ .Clear();
RDebugUtils.currentLine=10747906;
 //BA.debugLineNum = 10747906;BA.debugLine="MdlConnection.dbCursor = MdlConnection.dbSQL.Exec";
_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/  = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_mdlconnection._dbsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM dossier WHERE NAME LIKE '"+__ref._searchdossier /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()+"%'")));
RDebugUtils.currentLine=10747907;
 //BA.debugLineNum = 10747907;BA.debugLine="For i = 0 To MdlConnection.dbCursor.RowCount-1";
{
final int step3 = 1;
final int limit3 = (int) (_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=10747908;
 //BA.debugLineNum = 10747908;BA.debugLine="MdlConnection.dbCursor.Position = i";
_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .setPosition(_i);
RDebugUtils.currentLine=10747909;
 //BA.debugLineNum = 10747909;BA.debugLine="ListViewDossier.AddSingleLine(MdlConnection.dbCu";
__ref._listviewdossier /*anywheresoftware.b4a.objects.ListViewWrapper*/ .AddSingleLine(BA.ObjectToCharSequence(_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetString("NAME")));
 }
};
RDebugUtils.currentLine=10747911;
 //BA.debugLineNum = 10747911;BA.debugLine="MdlConnection.dbCursor.Close";
_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .Close();
RDebugUtils.currentLine=10747912;
 //BA.debugLineNum = 10747912;BA.debugLine="ListViewDossier.SingleLineLayout.Label.TextColor";
__ref._listviewdossier /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getSingleLineLayout().Label.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=10747913;
 //BA.debugLineNum = 10747913;BA.debugLine="End Sub";
return "";
}
}