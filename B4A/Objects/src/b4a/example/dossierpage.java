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
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _checkboxselect = null;
public String[] _selecteddocuments = null;
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
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="End Sub";
return null;
}
public boolean  _activity_keypress(b4a.example.dossierpage __ref,int _keycode) throws Exception{
__ref = this;
RDebugUtils.currentModule="dossierpage";
if (Debug.shouldDelegate(ba, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(ba, "activity_keypress", new Object[] {_keycode}));}
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==__c.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="AddDossierPanel.Visible = False";
__ref._adddossierpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="DossierListPanel.Visible = True";
__ref._dossierlistpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=2752516;
 //BA.debugLineNum = 2752516;BA.debugLine="addDossierBtn.Visible = True";
__ref._adddossierbtn /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=2752517;
 //BA.debugLineNum = 2752517;BA.debugLine="Return False";
if (true) return __c.False;
 }else {
RDebugUtils.currentLine=2752519;
 //BA.debugLineNum = 2752519;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=2752521;
 //BA.debugLineNum = 2752521;BA.debugLine="End Sub";
return false;
}
public String  _adddossierbtn_click(b4a.example.dossierpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dossierpage";
if (Debug.shouldDelegate(ba, "adddossierbtn_click", false))
	 {return ((String) Debug.delegate(ba, "adddossierbtn_click", null));}
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Private Sub addDossierBtn_Click";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="DossierListPanel.Visible = False";
__ref._dossierlistpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="addDossierBtn.Visible = False";
__ref._adddossierbtn /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="AddDossierPanel.Visible = True";
__ref._adddossierpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=2686980;
 //BA.debugLineNum = 2686980;BA.debugLine="renderDocumentsList";
__ref._renderdocumentslist /*String*/ (null);
RDebugUtils.currentLine=2686981;
 //BA.debugLineNum = 2686981;BA.debugLine="End Sub";
return "";
}
public String  _renderdocumentslist(b4a.example.dossierpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dossierpage";
if (Debug.shouldDelegate(ba, "renderdocumentslist", false))
	 {return ((String) Debug.delegate(ba, "renderdocumentslist", null));}
int _i = 0;
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Sub renderDocumentsList";
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="DocumentsListView.Clear";
__ref._documentslistview /*b4a.example3.customlistview*/ ._clear();
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="MdlConnection.dbCursor = MdlConnection.dbSQL.Exec";
_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/  = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_mdlconnection._dbsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM documents")));
RDebugUtils.currentLine=2818051;
 //BA.debugLineNum = 2818051;BA.debugLine="For i=0 To MdlConnection.dbCursor.RowCount-1";
{
final int step3 = 1;
final int limit3 = (int) (_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=2818052;
 //BA.debugLineNum = 2818052;BA.debugLine="Log(i)";
__c.LogImpl("52818052",BA.NumberToString(_i),0);
RDebugUtils.currentLine=2818053;
 //BA.debugLineNum = 2818053;BA.debugLine="MdlConnection.dbCursor.Position = i";
_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .setPosition(_i);
RDebugUtils.currentLine=2818054;
 //BA.debugLineNum = 2818054;BA.debugLine="readBlob";
__ref._readblob /*String*/ (null);
RDebugUtils.currentLine=2818055;
 //BA.debugLineNum = 2818055;BA.debugLine="DocumentsListView.Add(createDocumentsListItem(Md";
__ref._documentslistview /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createdocumentslistitem /*anywheresoftware.b4a.objects.PanelWrapper*/ (null,_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetString("DOCUMENT_ID"),_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetString("NAME"),__ref._bitmap /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ ,__ref._documentslistview /*b4a.example3.customlistview*/ ._asview().getWidth(),__c.DipToCurrent((int) (95))).getObject())),(Object)(("ID #"+__c.SmartStringFormatter("",(Object)(_i))+"")));
 }
};
RDebugUtils.currentLine=2818057;
 //BA.debugLineNum = 2818057;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(b4a.example.dossierpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="dossierpage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=2555907;
 //BA.debugLineNum = 2555907;BA.debugLine="Root.LoadLayout(\"Header\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("Header",ba);
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="lblBack.Visible=True";
__ref._lblback /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=2555909;
 //BA.debugLineNum = 2555909;BA.debugLine="Panel1.LoadLayout(\"listdossier\")";
__ref._panel1 /*anywheresoftware.b4a.objects.PanelWrapper*/ .LoadLayout("listdossier",ba);
RDebugUtils.currentLine=2555910;
 //BA.debugLineNum = 2555910;BA.debugLine="DossierListPanel.Visible = True";
__ref._dossierlistpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=2555911;
 //BA.debugLineNum = 2555911;BA.debugLine="AddDossierPanel.Visible = False";
__ref._adddossierpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=2555912;
 //BA.debugLineNum = 2555912;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Private Sub CheckBoxSelect_CheckedChange(Checked A";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="Dim index As Int = DocumentsListView.GetItemFromV";
_index = __ref._documentslistview /*b4a.example3.customlistview*/ ._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))));
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="Dim panel As B4XView = DocumentsListView.GetPanel";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._documentslistview /*b4a.example3.customlistview*/ ._getpanel(_index);
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="Dim check As B4XView = panel.GetView(0).GetView(0";
_check = new anywheresoftware.b4a.objects.B4XViewWrapper();
_check = _panel.GetView((int) (0)).GetView((int) (0));
RDebugUtils.currentLine=3014660;
 //BA.debugLineNum = 3014660;BA.debugLine="MsgboxAsync($\"Item value: ${DocumentsListView.Get";
__c.MsgboxAsync(BA.ObjectToCharSequence(("Item value: "+__c.SmartStringFormatter("",__ref._documentslistview /*b4a.example3.customlistview*/ ._getvalue(_index))+" Check value: "+__c.SmartStringFormatter("",(Object)(_check.getChecked()))+"")),BA.ObjectToCharSequence(""),ba);
RDebugUtils.currentLine=3014661;
 //BA.debugLineNum = 3014661;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.dossierpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dossierpage";
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="Dim ScrollView1 As ScrollView";
_scrollview1 = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="Dim Panel1 As Panel";
_panel1 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2424837;
 //BA.debugLineNum = 2424837;BA.debugLine="Dim lblBack As Label";
_lblback = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2424839;
 //BA.debugLineNum = 2424839;BA.debugLine="Dim bitMap As Bitmap";
_bitmap = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=2424840;
 //BA.debugLineNum = 2424840;BA.debugLine="Dim Buffer() As Byte";
_buffer = new byte[(int) (0)];
;
RDebugUtils.currentLine=2424841;
 //BA.debugLineNum = 2424841;BA.debugLine="Dim stringUtils As StringUtils";
_stringutils = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=2424842;
 //BA.debugLineNum = 2424842;BA.debugLine="Dim inputStream As InputStream";
_inputstream = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=2424844;
 //BA.debugLineNum = 2424844;BA.debugLine="Private addDossierBtn As Panel";
_adddossierbtn = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2424845;
 //BA.debugLineNum = 2424845;BA.debugLine="Private AddDossierPanel As Panel";
_adddossierpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2424846;
 //BA.debugLineNum = 2424846;BA.debugLine="Private DossierListPanel As Panel";
_dossierlistpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2424847;
 //BA.debugLineNum = 2424847;BA.debugLine="Private idLabel As Label";
_idlabel = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2424848;
 //BA.debugLineNum = 2424848;BA.debugLine="Private picture As ImageView";
_picture = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=2424849;
 //BA.debugLineNum = 2424849;BA.debugLine="Private documentLabel As Label";
_documentlabel = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2424850;
 //BA.debugLineNum = 2424850;BA.debugLine="Private DocumentsListView As CustomListView";
_documentslistview = new b4a.example3.customlistview();
RDebugUtils.currentLine=2424851;
 //BA.debugLineNum = 2424851;BA.debugLine="Private CheckBoxSelect As CheckBox";
_checkboxselect = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=2424852;
 //BA.debugLineNum = 2424852;BA.debugLine="Private selectedDocuments() As String = Array As";
_selecteddocuments = new String[]{};
RDebugUtils.currentLine=2424853;
 //BA.debugLineNum = 2424853;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _createdocumentslistitem(b4a.example.dossierpage __ref,String _id,String _docname,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _docscan,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="dossierpage";
if (Debug.shouldDelegate(ba, "createdocumentslistitem", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createdocumentslistitem", new Object[] {_id,_docname,_docscan,_width,_height}));}
anywheresoftware.b4a.objects.B4XViewWrapper _item = null;
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Sub createDocumentsListItem(ID As String, docName";
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="Dim item As B4XView = xui.CreatePanel(\"\")";
_item = new anywheresoftware.b4a.objects.B4XViewWrapper();
_item = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="item.SetLayoutAnimated(0,0,0, width, height)";
_item.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_width,_height);
RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="item.LoadLayout(\"listview_element\")";
_item.LoadLayout("listview_element",ba);
RDebugUtils.currentLine=2949124;
 //BA.debugLineNum = 2949124;BA.debugLine="idLabel.Text = ID";
__ref._idlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_id));
RDebugUtils.currentLine=2949125;
 //BA.debugLineNum = 2949125;BA.debugLine="documentLabel.Text = docName";
__ref._documentlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_docname));
RDebugUtils.currentLine=2949126;
 //BA.debugLineNum = 2949126;BA.debugLine="picture.Bitmap = docScan";
__ref._picture /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setBitmap((android.graphics.Bitmap)(_docscan.getObject()));
RDebugUtils.currentLine=2949127;
 //BA.debugLineNum = 2949127;BA.debugLine="Return item";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_item.getObject()));
RDebugUtils.currentLine=2949128;
 //BA.debugLineNum = 2949128;BA.debugLine="End Sub";
return null;
}
public String  _lblback_click(b4a.example.dossierpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dossierpage";
if (Debug.shouldDelegate(ba, "lblback_click", false))
	 {return ((String) Debug.delegate(ba, "lblback_click", null));}
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Sub lblBack_Click";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="If AddDossierPanel.Visible = True Then";
if (__ref._adddossierpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getVisible()==__c.True) { 
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="AddDossierPanel.Visible = False";
__ref._adddossierpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="DossierListPanel.Visible = True";
__ref._dossierlistpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="addDossierBtn.Visible = True";
__ref._adddossierbtn /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
 }else {
RDebugUtils.currentLine=2621446;
 //BA.debugLineNum = 2621446;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
 };
RDebugUtils.currentLine=2621448;
 //BA.debugLineNum = 2621448;BA.debugLine="End Sub";
return "";
}
public String  _readblob(b4a.example.dossierpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dossierpage";
if (Debug.shouldDelegate(ba, "readblob", false))
	 {return ((String) Debug.delegate(ba, "readblob", null));}
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Sub readBlob";
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="Buffer = stringUtils.DecodeBase64(MdlConnection.d";
__ref._buffer /*byte[]*/  = __ref._stringutils /*anywheresoftware.b4a.objects.StringUtils*/ .DecodeBase64(_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetString("SCAN"));
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="inputStream.InitializeFromBytesArray(Buffer, 0, B";
__ref._inputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ .InitializeFromBytesArray(__ref._buffer /*byte[]*/ ,(int) (0),__ref._buffer /*byte[]*/ .length);
RDebugUtils.currentLine=2883587;
 //BA.debugLineNum = 2883587;BA.debugLine="bitMap.Initialize2(inputStream)";
__ref._bitmap /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .Initialize2((java.io.InputStream)(__ref._inputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ .getObject()));
RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="inputStream.Close";
__ref._inputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ .Close();
RDebugUtils.currentLine=2883589;
 //BA.debugLineNum = 2883589;BA.debugLine="End Sub";
return "";
}
}