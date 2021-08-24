package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class listdocumentpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.listdocumentpage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.listdocumentpage.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.LabelWrapper _lblback = null;
public anywheresoftware.b4a.objects.ListViewWrapper _listviewdocuments = null;
public anywheresoftware.b4a.objects.EditTextWrapper _searchdocument = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bitmap = null;
public byte[] _buffer = null;
public anywheresoftware.b4a.objects.StringUtils _stringutils = null;
public anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _inputstream = null;
public int _id = 0;
public anywheresoftware.b4a.objects.EditTextWrapper _docid = null;
public anywheresoftware.b4a.objects.EditTextWrapper _docname = null;
public anywheresoftware.b4a.objects.EditTextWrapper _doctype = null;
public anywheresoftware.b4a.objects.EditTextWrapper _docexpiry = null;
public anywheresoftware.b4a.objects.PanelWrapper _listpanel = null;
public anywheresoftware.b4a.objects.PanelWrapper _updatepanel = null;
public b4a.example.main _main = null;
public b4a.example.dbutils _dbutils = null;
public b4a.example.mdlconnection _mdlconnection = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public Object  _initialize(b4a.example.listdocumentpage __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="listdocumentpage";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_created(b4a.example.listdocumentpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdocumentpage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="Root.LoadLayout(\"Header\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("Header",ba);
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="lblBack.Visible=True";
__ref._lblback /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=1835013;
 //BA.debugLineNum = 1835013;BA.debugLine="ScrollView1.Panel.LoadLayout(\"listdocument\")";
__ref._scrollview1 /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().LoadLayout("listdocument",ba);
RDebugUtils.currentLine=1835015;
 //BA.debugLineNum = 1835015;BA.debugLine="UpdatePanel.Visible = False";
__ref._updatepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=1835016;
 //BA.debugLineNum = 1835016;BA.debugLine="ListPanel.Visible = True";
__ref._listpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=1835017;
 //BA.debugLineNum = 1835017;BA.debugLine="renderDataListView";
__ref._renderdatalistview /*String*/ (null);
RDebugUtils.currentLine=1835018;
 //BA.debugLineNum = 1835018;BA.debugLine="End Sub";
return "";
}
public String  _renderdatalistview(b4a.example.listdocumentpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdocumentpage";
if (Debug.shouldDelegate(ba, "renderdatalistview", false))
	 {return ((String) Debug.delegate(ba, "renderdatalistview", null));}
int _i = 0;
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Sub renderDataListView";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="ListViewDocuments.Clear";
__ref._listviewdocuments /*anywheresoftware.b4a.objects.ListViewWrapper*/ .Clear();
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="MdlConnection.dbCursor = MdlConnection.dbSQL.Exec";
_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/  = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_mdlconnection._dbsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM documents")));
RDebugUtils.currentLine=1966083;
 //BA.debugLineNum = 1966083;BA.debugLine="For i = 0 To MdlConnection.dbCursor.RowCount-1";
{
final int step3 = 1;
final int limit3 = (int) (_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=1966084;
 //BA.debugLineNum = 1966084;BA.debugLine="MdlConnection.dbCursor.Position = i";
_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .setPosition(_i);
RDebugUtils.currentLine=1966086;
 //BA.debugLineNum = 1966086;BA.debugLine="readBlob";
__ref._readblob /*String*/ (null);
RDebugUtils.currentLine=1966087;
 //BA.debugLineNum = 1966087;BA.debugLine="ListViewDocuments.AddTwoLinesAndBitmap(MdlConnec";
__ref._listviewdocuments /*anywheresoftware.b4a.objects.ListViewWrapper*/ .AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetString("DOCUMENT_ID")),BA.ObjectToCharSequence(_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetString("NAME")),(android.graphics.Bitmap)(__ref._bitmap /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .getObject()));
RDebugUtils.currentLine=1966088;
 //BA.debugLineNum = 1966088;BA.debugLine="ID = MdlConnection.dbCursor.GetInt(\"ID\")";
__ref._id /*int*/  = _mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetInt("ID");
RDebugUtils.currentLine=1966089;
 //BA.debugLineNum = 1966089;BA.debugLine="Log(ID)";
__c.LogImpl("81966089",BA.NumberToString(__ref._id /*int*/ ),0);
 }
};
RDebugUtils.currentLine=1966091;
 //BA.debugLineNum = 1966091;BA.debugLine="ListViewDocuments.TwoLinesAndBitmap.Label.TextCol";
__ref._listviewdocuments /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getTwoLinesAndBitmap().Label.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=1966092;
 //BA.debugLineNum = 1966092;BA.debugLine="ListViewDocuments.TwoLinesAndBitmap.SecondLabel.T";
__ref._listviewdocuments /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getTwoLinesAndBitmap().SecondLabel.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=1966093;
 //BA.debugLineNum = 1966093;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.listdocumentpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdocumentpage";
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="Dim ScrollView1 As ScrollView";
_scrollview1 = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=1703940;
 //BA.debugLineNum = 1703940;BA.debugLine="Dim lblBack As Label";
_lblback = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=1703942;
 //BA.debugLineNum = 1703942;BA.debugLine="Private ListViewDocuments As ListView";
_listviewdocuments = new anywheresoftware.b4a.objects.ListViewWrapper();
RDebugUtils.currentLine=1703943;
 //BA.debugLineNum = 1703943;BA.debugLine="Private searchDocument As EditText";
_searchdocument = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=1703945;
 //BA.debugLineNum = 1703945;BA.debugLine="Dim bitMap As Bitmap";
_bitmap = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=1703946;
 //BA.debugLineNum = 1703946;BA.debugLine="Dim Buffer() As Byte";
_buffer = new byte[(int) (0)];
;
RDebugUtils.currentLine=1703947;
 //BA.debugLineNum = 1703947;BA.debugLine="Dim stringUtils As StringUtils";
_stringutils = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=1703948;
 //BA.debugLineNum = 1703948;BA.debugLine="Dim inputStream As InputStream";
_inputstream = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=1703950;
 //BA.debugLineNum = 1703950;BA.debugLine="Private ID As Int";
_id = 0;
RDebugUtils.currentLine=1703951;
 //BA.debugLineNum = 1703951;BA.debugLine="Private docID As EditText";
_docid = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=1703952;
 //BA.debugLineNum = 1703952;BA.debugLine="Private docName As EditText";
_docname = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=1703953;
 //BA.debugLineNum = 1703953;BA.debugLine="Private docType As EditText";
_doctype = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=1703954;
 //BA.debugLineNum = 1703954;BA.debugLine="Private docExpiry As EditText";
_docexpiry = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=1703956;
 //BA.debugLineNum = 1703956;BA.debugLine="Private ListPanel As Panel";
_listpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=1703957;
 //BA.debugLineNum = 1703957;BA.debugLine="Private UpdatePanel As Panel";
_updatepanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=1703958;
 //BA.debugLineNum = 1703958;BA.debugLine="End Sub";
return "";
}
public String  _lblback_click(b4a.example.listdocumentpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdocumentpage";
if (Debug.shouldDelegate(ba, "lblback_click", false))
	 {return ((String) Debug.delegate(ba, "lblback_click", null));}
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Private Sub lblBack_Click";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="If UpdatePanel.Visible = True Then";
if (__ref._updatepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getVisible()==__c.True) { 
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="UpdatePanel.Visible = False";
__ref._updatepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="ListPanel.Visible = True";
__ref._listpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
 }else {
RDebugUtils.currentLine=1900549;
 //BA.debugLineNum = 1900549;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
 };
RDebugUtils.currentLine=1900551;
 //BA.debugLineNum = 1900551;BA.debugLine="End Sub";
return "";
}
public String  _listviewdocuments_itemclick(b4a.example.listdocumentpage __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdocumentpage";
if (Debug.shouldDelegate(ba, "listviewdocuments_itemclick", false))
	 {return ((String) Debug.delegate(ba, "listviewdocuments_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Private Sub ListViewDocuments_ItemClick(Position A";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="ListPanel.Visible = False";
__ref._listpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="UpdatePanel.Visible = True";
__ref._updatepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="docID.Text = Value";
__ref._docid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_value));
RDebugUtils.currentLine=2097156;
 //BA.debugLineNum = 2097156;BA.debugLine="End Sub";
return "";
}
public String  _listviewdocuments_itemlongclick(b4a.example.listdocumentpage __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdocumentpage";
if (Debug.shouldDelegate(ba, "listviewdocuments_itemlongclick", false))
	 {return ((String) Debug.delegate(ba, "listviewdocuments_itemlongclick", new Object[] {_position,_value}));}
int _x = 0;
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Private Sub listViewDocuments_ItemLongClick (Posit";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="Dim x As Int";
_x = 0;
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="x = Msgbox2(\"Delete document?\",\"info\", \"Yes\",\"\",";
_x = __c.Msgbox2(BA.ObjectToCharSequence("Delete document?"),BA.ObjectToCharSequence("info"),"Yes","","No",(android.graphics.Bitmap)(__c.Null),ba);
RDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="If x = DialogResponse.POSITIVE Then";
if (_x==__c.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=2162692;
 //BA.debugLineNum = 2162692;BA.debugLine="MdlConnection.dbSQL.ExecNonQuery(\"DELETE FROM do";
_mdlconnection._dbsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("DELETE FROM documents WHERE DOCUMENT_ID='"+BA.ObjectToString(_value)+"'");
 };
RDebugUtils.currentLine=2162695;
 //BA.debugLineNum = 2162695;BA.debugLine="renderDataListView";
__ref._renderdatalistview /*String*/ (null);
RDebugUtils.currentLine=2162696;
 //BA.debugLineNum = 2162696;BA.debugLine="End Sub";
return "";
}
public String  _readblob(b4a.example.listdocumentpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdocumentpage";
if (Debug.shouldDelegate(ba, "readblob", false))
	 {return ((String) Debug.delegate(ba, "readblob", null));}
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Sub readBlob";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="Buffer = stringUtils.DecodeBase64(MdlConnection.d";
__ref._buffer /*byte[]*/  = __ref._stringutils /*anywheresoftware.b4a.objects.StringUtils*/ .DecodeBase64(_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetString("SCAN"));
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="inputStream.InitializeFromBytesArray(Buffer, 0, B";
__ref._inputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ .InitializeFromBytesArray(__ref._buffer /*byte[]*/ ,(int) (0),__ref._buffer /*byte[]*/ .length);
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="bitMap.Initialize2(inputStream)";
__ref._bitmap /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .Initialize2((java.io.InputStream)(__ref._inputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ .getObject()));
RDebugUtils.currentLine=2031620;
 //BA.debugLineNum = 2031620;BA.debugLine="inputStream.Close";
__ref._inputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ .Close();
RDebugUtils.currentLine=2031621;
 //BA.debugLineNum = 2031621;BA.debugLine="End Sub";
return "";
}
public String  _searchdocument_textchanged(b4a.example.listdocumentpage __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdocumentpage";
if (Debug.shouldDelegate(ba, "searchdocument_textchanged", false))
	 {return ((String) Debug.delegate(ba, "searchdocument_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Private Sub searchDocument_TextChanged (Old As Str";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="searchingDocument";
__ref._searchingdocument /*String*/ (null);
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="End Sub";
return "";
}
public String  _searchingdocument(b4a.example.listdocumentpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdocumentpage";
if (Debug.shouldDelegate(ba, "searchingdocument", false))
	 {return ((String) Debug.delegate(ba, "searchingdocument", null));}
int _i = 0;
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Sub searchingDocument";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="ListViewDocuments.Clear";
__ref._listviewdocuments /*anywheresoftware.b4a.objects.ListViewWrapper*/ .Clear();
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="MdlConnection.dbCursor = MdlConnection.dbSQL.Exec";
_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/  = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_mdlconnection._dbsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM documents WHERE NAME LIKE '"+__ref._searchdocument /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()+"%'")));
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="For i = 0 To MdlConnection.dbCursor.RowCount-1";
{
final int step3 = 1;
final int limit3 = (int) (_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="MdlConnection.dbCursor.Position = i";
_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .setPosition(_i);
RDebugUtils.currentLine=2293766;
 //BA.debugLineNum = 2293766;BA.debugLine="readBlob";
__ref._readblob /*String*/ (null);
RDebugUtils.currentLine=2293767;
 //BA.debugLineNum = 2293767;BA.debugLine="ListViewDocuments.AddTwoLinesAndBitmap(MdlConnec";
__ref._listviewdocuments /*anywheresoftware.b4a.objects.ListViewWrapper*/ .AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetString("ID")),BA.ObjectToCharSequence(_mdlconnection._dbcursor /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetString("NAME")),(android.graphics.Bitmap)(__ref._bitmap /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .getObject()));
 }
};
RDebugUtils.currentLine=2293769;
 //BA.debugLineNum = 2293769;BA.debugLine="ListViewDocuments.TwoLinesAndBitmap.Label.TextCol";
__ref._listviewdocuments /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getTwoLinesAndBitmap().Label.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=2293770;
 //BA.debugLineNum = 2293770;BA.debugLine="ListViewDocuments.TwoLinesAndBitmap.SecondLabel.T";
__ref._listviewdocuments /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getTwoLinesAndBitmap().SecondLabel.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=2293771;
 //BA.debugLineNum = 2293771;BA.debugLine="End Sub";
return "";
}
public String  _updatepropertiesbutton_click(b4a.example.listdocumentpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="listdocumentpage";
if (Debug.shouldDelegate(ba, "updatepropertiesbutton_click", false))
	 {return ((String) Debug.delegate(ba, "updatepropertiesbutton_click", null));}
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Private Sub UpdatePropertiesButton_Click";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="Try";
try {RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="MdlConnection.dbSQL.ExecNonQuery(\"UPDATE documen";
_mdlconnection._dbsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("UPDATE documents SET NAME='"+__ref._docname /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()+"', TYPE='"+__ref._doctype /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()+"', EXPIRED='"+__ref._docexpiry /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()+"'WHERE DOCUMENT_ID ='"+__ref._docid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()+"'");
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="ToastMessageShow(\"sucessfully saved document\",Fa";
__c.ToastMessageShow(BA.ObjectToCharSequence("sucessfully saved document"),__c.False);
RDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="renderDataListView";
__ref._renderdatalistview /*String*/ (null);
RDebugUtils.currentLine=2359301;
 //BA.debugLineNum = 2359301;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
 } 
       catch (Exception e7) {
			ba.setLastException(e7);RDebugUtils.currentLine=2359303;
 //BA.debugLineNum = 2359303;BA.debugLine="ToastMessageShow(\"failed\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("failed"),__c.False);
 };
RDebugUtils.currentLine=2359305;
 //BA.debugLineNum = 2359305;BA.debugLine="End Sub";
return "";
}
}