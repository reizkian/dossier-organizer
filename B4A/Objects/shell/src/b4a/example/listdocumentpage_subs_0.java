package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class listdocumentpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (listdocumentpage) ","listdocumentpage",3,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "listdocumentpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 31;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="Root = Root1";
Debug.ShouldStop(-2147483648);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 34;BA.debugLine="Root.LoadLayout(\"Header\")";
Debug.ShouldStop(2);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("Header")),__ref.getField(false, "ba"));
 BA.debugLineNum = 35;BA.debugLine="lblBack.Visible=True";
Debug.ShouldStop(4);
__ref.getField(false,"_lblback" /*RemoteObject*/ ).runMethod(true,"setVisible",listdocumentpage.__c.getField(true,"True"));
 BA.debugLineNum = 36;BA.debugLine="ScrollView1.Panel.LoadLayout(\"listdocument\")";
Debug.ShouldStop(8);
__ref.getField(false,"_scrollview1" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("listdocument")),__ref.getField(false, "ba"));
 BA.debugLineNum = 38;BA.debugLine="UpdatePanel.Visible = False";
Debug.ShouldStop(32);
__ref.getField(false,"_updatepanel" /*RemoteObject*/ ).runMethod(true,"setVisible",listdocumentpage.__c.getField(true,"False"));
 BA.debugLineNum = 39;BA.debugLine="ListPanel.Visible = True";
Debug.ShouldStop(64);
__ref.getField(false,"_listpanel" /*RemoteObject*/ ).runMethod(true,"setVisible",listdocumentpage.__c.getField(true,"True"));
 BA.debugLineNum = 40;BA.debugLine="renderDataListView";
Debug.ShouldStop(128);
__ref.runClassMethod (b4a.example.listdocumentpage.class, "_renderdatalistview" /*RemoteObject*/ );
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
listdocumentpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",listdocumentpage._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
listdocumentpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",listdocumentpage._xui);
 //BA.debugLineNum = 4;BA.debugLine="Dim ScrollView1 As ScrollView";
listdocumentpage._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");__ref.setField("_scrollview1",listdocumentpage._scrollview1);
 //BA.debugLineNum = 5;BA.debugLine="Dim lblBack As Label";
listdocumentpage._lblback = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblback",listdocumentpage._lblback);
 //BA.debugLineNum = 7;BA.debugLine="Private ListViewDocuments As ListView";
listdocumentpage._listviewdocuments = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");__ref.setField("_listviewdocuments",listdocumentpage._listviewdocuments);
 //BA.debugLineNum = 8;BA.debugLine="Private searchDocument As EditText";
listdocumentpage._searchdocument = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_searchdocument",listdocumentpage._searchdocument);
 //BA.debugLineNum = 10;BA.debugLine="Dim bitMap As Bitmap";
listdocumentpage._bitmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");__ref.setField("_bitmap",listdocumentpage._bitmap);
 //BA.debugLineNum = 11;BA.debugLine="Dim Buffer() As Byte";
listdocumentpage._buffer = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});__ref.setField("_buffer",listdocumentpage._buffer);
 //BA.debugLineNum = 12;BA.debugLine="Dim stringUtils As StringUtils";
listdocumentpage._stringutils = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");__ref.setField("_stringutils",listdocumentpage._stringutils);
 //BA.debugLineNum = 13;BA.debugLine="Dim inputStream As InputStream";
listdocumentpage._inputstream = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");__ref.setField("_inputstream",listdocumentpage._inputstream);
 //BA.debugLineNum = 15;BA.debugLine="Private ID As Int";
listdocumentpage._id = RemoteObject.createImmutable(0);__ref.setField("_id",listdocumentpage._id);
 //BA.debugLineNum = 16;BA.debugLine="Private docID As EditText";
listdocumentpage._docid = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_docid",listdocumentpage._docid);
 //BA.debugLineNum = 17;BA.debugLine="Private docName As EditText";
listdocumentpage._docname = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_docname",listdocumentpage._docname);
 //BA.debugLineNum = 18;BA.debugLine="Private docType As EditText";
listdocumentpage._doctype = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_doctype",listdocumentpage._doctype);
 //BA.debugLineNum = 19;BA.debugLine="Private docExpiry As EditText";
listdocumentpage._docexpiry = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_docexpiry",listdocumentpage._docexpiry);
 //BA.debugLineNum = 21;BA.debugLine="Private ListPanel As Panel";
listdocumentpage._listpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_listpanel",listdocumentpage._listpanel);
 //BA.debugLineNum = 22;BA.debugLine="Private UpdatePanel As Panel";
listdocumentpage._updatepanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_updatepanel",listdocumentpage._updatepanel);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (listdocumentpage) ","listdocumentpage",3,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "listdocumentpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 26;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="Return Me";
Debug.ShouldStop(67108864);
if (true) return __ref;
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblback_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("lblBack_Click (listdocumentpage) ","listdocumentpage",3,__ref.getField(false, "ba"),__ref,43);
if (RapidSub.canDelegate("lblback_click")) { return __ref.runUserSub(false, "listdocumentpage","lblback_click", __ref);}
 BA.debugLineNum = 43;BA.debugLine="Private Sub lblBack_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 44;BA.debugLine="If UpdatePanel.Visible = True Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_updatepanel" /*RemoteObject*/ ).runMethod(true,"getVisible"),listdocumentpage.__c.getField(true,"True"))) { 
 BA.debugLineNum = 45;BA.debugLine="UpdatePanel.Visible = False";
Debug.ShouldStop(4096);
__ref.getField(false,"_updatepanel" /*RemoteObject*/ ).runMethod(true,"setVisible",listdocumentpage.__c.getField(true,"False"));
 BA.debugLineNum = 46;BA.debugLine="ListPanel.Visible = True";
Debug.ShouldStop(8192);
__ref.getField(false,"_listpanel" /*RemoteObject*/ ).runMethod(true,"setVisible",listdocumentpage.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 48;BA.debugLine="B4XPages.ClosePage(Me)";
Debug.ShouldStop(32768);
listdocumentpage._b4xpages.runVoidMethod ("_closepage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref));
 };
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listviewdocuments_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ListViewDocuments_ItemClick (listdocumentpage) ","listdocumentpage",3,__ref.getField(false, "ba"),__ref,74);
if (RapidSub.canDelegate("listviewdocuments_itemclick")) { return __ref.runUserSub(false, "listdocumentpage","listviewdocuments_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 74;BA.debugLine="Private Sub ListViewDocuments_ItemClick(Position A";
Debug.ShouldStop(512);
 BA.debugLineNum = 75;BA.debugLine="ListPanel.Visible = False";
Debug.ShouldStop(1024);
__ref.getField(false,"_listpanel" /*RemoteObject*/ ).runMethod(true,"setVisible",listdocumentpage.__c.getField(true,"False"));
 BA.debugLineNum = 76;BA.debugLine="UpdatePanel.Visible = True";
Debug.ShouldStop(2048);
__ref.getField(false,"_updatepanel" /*RemoteObject*/ ).runMethod(true,"setVisible",listdocumentpage.__c.getField(true,"True"));
 BA.debugLineNum = 77;BA.debugLine="docID.Text = Value";
Debug.ShouldStop(4096);
__ref.getField(false,"_docid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_value));
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listviewdocuments_itemlongclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("listViewDocuments_ItemLongClick (listdocumentpage) ","listdocumentpage",3,__ref.getField(false, "ba"),__ref,80);
if (RapidSub.canDelegate("listviewdocuments_itemlongclick")) { return __ref.runUserSub(false, "listdocumentpage","listviewdocuments_itemlongclick", __ref, _position, _value);}
RemoteObject _x = RemoteObject.createImmutable(0);
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 80;BA.debugLine="Private Sub listViewDocuments_ItemLongClick (Posit";
Debug.ShouldStop(32768);
 BA.debugLineNum = 81;BA.debugLine="Dim x As Int";
Debug.ShouldStop(65536);
_x = RemoteObject.createImmutable(0);Debug.locals.put("x", _x);
 BA.debugLineNum = 82;BA.debugLine="x = Msgbox2(\"Delete document?\",\"info\", \"Yes\",\"\",";
Debug.ShouldStop(131072);
_x = listdocumentpage.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Delete document?")),(Object)(BA.ObjectToCharSequence("info")),(Object)(BA.ObjectToString("Yes")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((listdocumentpage.__c.getField(false,"Null"))),__ref.getField(false, "ba"));Debug.locals.put("x", _x);
 BA.debugLineNum = 83;BA.debugLine="If x = DialogResponse.POSITIVE Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_x,BA.numberCast(double.class, listdocumentpage.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 84;BA.debugLine="MdlConnection.dbSQL.ExecNonQuery(\"DELETE FROM do";
Debug.ShouldStop(524288);
listdocumentpage._mdlconnection._dbsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("DELETE FROM documents WHERE DOCUMENT_ID='"),_value,RemoteObject.createImmutable("'"))));
 };
 BA.debugLineNum = 87;BA.debugLine="renderDataListView";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4a.example.listdocumentpage.class, "_renderdatalistview" /*RemoteObject*/ );
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _readblob(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("readBlob (listdocumentpage) ","listdocumentpage",3,__ref.getField(false, "ba"),__ref,67);
if (RapidSub.canDelegate("readblob")) { return __ref.runUserSub(false, "listdocumentpage","readblob", __ref);}
 BA.debugLineNum = 67;BA.debugLine="Sub readBlob";
Debug.ShouldStop(4);
 BA.debugLineNum = 68;BA.debugLine="Buffer = stringUtils.DecodeBase64(MdlConnection.d";
Debug.ShouldStop(8);
__ref.setField ("_buffer" /*RemoteObject*/ ,__ref.getField(false,"_stringutils" /*RemoteObject*/ ).runMethod(false,"DecodeBase64",(Object)(listdocumentpage._mdlconnection._dbcursor /*RemoteObject*/ .runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("SCAN"))))));
 BA.debugLineNum = 69;BA.debugLine="inputStream.InitializeFromBytesArray(Buffer, 0, B";
Debug.ShouldStop(16);
__ref.getField(false,"_inputstream" /*RemoteObject*/ ).runVoidMethod ("InitializeFromBytesArray",(Object)(__ref.getField(false,"_buffer" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_buffer" /*RemoteObject*/ ).getField(true,"length")));
 BA.debugLineNum = 70;BA.debugLine="bitMap.Initialize2(inputStream)";
Debug.ShouldStop(32);
__ref.getField(false,"_bitmap" /*RemoteObject*/ ).runVoidMethod ("Initialize2",(Object)((__ref.getField(false,"_inputstream" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 71;BA.debugLine="inputStream.Close";
Debug.ShouldStop(64);
__ref.getField(false,"_inputstream" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _renderdatalistview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("renderDataListView (listdocumentpage) ","listdocumentpage",3,__ref.getField(false, "ba"),__ref,52);
if (RapidSub.canDelegate("renderdatalistview")) { return __ref.runUserSub(false, "listdocumentpage","renderdatalistview", __ref);}
int _i = 0;
 BA.debugLineNum = 52;BA.debugLine="Sub renderDataListView";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="ListViewDocuments.Clear";
Debug.ShouldStop(1048576);
__ref.getField(false,"_listviewdocuments" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 54;BA.debugLine="MdlConnection.dbCursor = MdlConnection.dbSQL.Exec";
Debug.ShouldStop(2097152);
listdocumentpage._mdlconnection._dbcursor /*RemoteObject*/  = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), listdocumentpage._mdlconnection._dbsql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM documents"))));
 BA.debugLineNum = 55;BA.debugLine="For i = 0 To MdlConnection.dbCursor.RowCount-1";
Debug.ShouldStop(4194304);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {listdocumentpage._mdlconnection._dbcursor /*RemoteObject*/ .runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 56;BA.debugLine="MdlConnection.dbCursor.Position = i";
Debug.ShouldStop(8388608);
listdocumentpage._mdlconnection._dbcursor /*RemoteObject*/ .runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 58;BA.debugLine="readBlob";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4a.example.listdocumentpage.class, "_readblob" /*RemoteObject*/ );
 BA.debugLineNum = 59;BA.debugLine="ListViewDocuments.AddTwoLinesAndBitmap(MdlConnec";
Debug.ShouldStop(67108864);
__ref.getField(false,"_listviewdocuments" /*RemoteObject*/ ).runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(listdocumentpage._mdlconnection._dbcursor /*RemoteObject*/ .runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("DOCUMENT_ID"))))),(Object)(BA.ObjectToCharSequence(listdocumentpage._mdlconnection._dbcursor /*RemoteObject*/ .runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("NAME"))))),(Object)((__ref.getField(false,"_bitmap" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 60;BA.debugLine="ID = MdlConnection.dbCursor.GetInt(\"ID\")";
Debug.ShouldStop(134217728);
__ref.setField ("_id" /*RemoteObject*/ ,listdocumentpage._mdlconnection._dbcursor /*RemoteObject*/ .runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ID"))));
 BA.debugLineNum = 61;BA.debugLine="Log(ID)";
Debug.ShouldStop(268435456);
listdocumentpage.__c.runVoidMethod ("LogImpl","81966089",BA.NumberToString(__ref.getField(true,"_id" /*RemoteObject*/ )),0);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 63;BA.debugLine="ListViewDocuments.TwoLinesAndBitmap.Label.TextCol";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_listviewdocuments" /*RemoteObject*/ ).runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(true,"setTextColor",listdocumentpage.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 64;BA.debugLine="ListViewDocuments.TwoLinesAndBitmap.SecondLabel.T";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_listviewdocuments" /*RemoteObject*/ ).runMethod(false,"getTwoLinesAndBitmap").getField(false,"SecondLabel").runMethod(true,"setTextColor",listdocumentpage.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _searchdocument_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("searchDocument_TextChanged (listdocumentpage) ","listdocumentpage",3,__ref.getField(false, "ba"),__ref,90);
if (RapidSub.canDelegate("searchdocument_textchanged")) { return __ref.runUserSub(false, "listdocumentpage","searchdocument_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 90;BA.debugLine="Private Sub searchDocument_TextChanged (Old As Str";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 91;BA.debugLine="searchingDocument";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4a.example.listdocumentpage.class, "_searchingdocument" /*RemoteObject*/ );
 BA.debugLineNum = 92;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _searchingdocument(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("searchingDocument (listdocumentpage) ","listdocumentpage",3,__ref.getField(false, "ba"),__ref,94);
if (RapidSub.canDelegate("searchingdocument")) { return __ref.runUserSub(false, "listdocumentpage","searchingdocument", __ref);}
int _i = 0;
 BA.debugLineNum = 94;BA.debugLine="Sub searchingDocument";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 95;BA.debugLine="ListViewDocuments.Clear";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_listviewdocuments" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 96;BA.debugLine="MdlConnection.dbCursor = MdlConnection.dbSQL.Exec";
Debug.ShouldStop(-2147483648);
listdocumentpage._mdlconnection._dbcursor /*RemoteObject*/  = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), listdocumentpage._mdlconnection._dbsql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM documents WHERE NAME LIKE '"),__ref.getField(false,"_searchdocument" /*RemoteObject*/ ).runMethod(true,"getText"),RemoteObject.createImmutable("%'")))));
 BA.debugLineNum = 97;BA.debugLine="For i = 0 To MdlConnection.dbCursor.RowCount-1";
Debug.ShouldStop(1);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {listdocumentpage._mdlconnection._dbcursor /*RemoteObject*/ .runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 98;BA.debugLine="MdlConnection.dbCursor.Position = i";
Debug.ShouldStop(2);
listdocumentpage._mdlconnection._dbcursor /*RemoteObject*/ .runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 100;BA.debugLine="readBlob";
Debug.ShouldStop(8);
__ref.runClassMethod (b4a.example.listdocumentpage.class, "_readblob" /*RemoteObject*/ );
 BA.debugLineNum = 101;BA.debugLine="ListViewDocuments.AddTwoLinesAndBitmap(MdlConnec";
Debug.ShouldStop(16);
__ref.getField(false,"_listviewdocuments" /*RemoteObject*/ ).runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(listdocumentpage._mdlconnection._dbcursor /*RemoteObject*/ .runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ID"))))),(Object)(BA.ObjectToCharSequence(listdocumentpage._mdlconnection._dbcursor /*RemoteObject*/ .runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("NAME"))))),(Object)((__ref.getField(false,"_bitmap" /*RemoteObject*/ ).getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 103;BA.debugLine="ListViewDocuments.TwoLinesAndBitmap.Label.TextCol";
Debug.ShouldStop(64);
__ref.getField(false,"_listviewdocuments" /*RemoteObject*/ ).runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(true,"setTextColor",listdocumentpage.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 104;BA.debugLine="ListViewDocuments.TwoLinesAndBitmap.SecondLabel.T";
Debug.ShouldStop(128);
__ref.getField(false,"_listviewdocuments" /*RemoteObject*/ ).runMethod(false,"getTwoLinesAndBitmap").getField(false,"SecondLabel").runMethod(true,"setTextColor",listdocumentpage.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatepropertiesbutton_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("UpdatePropertiesButton_Click (listdocumentpage) ","listdocumentpage",3,__ref.getField(false, "ba"),__ref,107);
if (RapidSub.canDelegate("updatepropertiesbutton_click")) { return __ref.runUserSub(false, "listdocumentpage","updatepropertiesbutton_click", __ref);}
 BA.debugLineNum = 107;BA.debugLine="Private Sub UpdatePropertiesButton_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 108;BA.debugLine="Try";
Debug.ShouldStop(2048);
try { BA.debugLineNum = 109;BA.debugLine="MdlConnection.dbSQL.ExecNonQuery(\"UPDATE documen";
Debug.ShouldStop(4096);
listdocumentpage._mdlconnection._dbsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE documents SET NAME='"),__ref.getField(false,"_docname" /*RemoteObject*/ ).runMethod(true,"getText"),RemoteObject.createImmutable("', TYPE='"),__ref.getField(false,"_doctype" /*RemoteObject*/ ).runMethod(true,"getText"),RemoteObject.createImmutable("', EXPIRED='"),__ref.getField(false,"_docexpiry" /*RemoteObject*/ ).runMethod(true,"getText"),RemoteObject.createImmutable("'WHERE DOCUMENT_ID ='"),__ref.getField(false,"_docid" /*RemoteObject*/ ).runMethod(true,"getText"),RemoteObject.createImmutable("'"))));
 BA.debugLineNum = 110;BA.debugLine="ToastMessageShow(\"sucessfully saved document\",Fa";
Debug.ShouldStop(8192);
listdocumentpage.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("sucessfully saved document")),(Object)(listdocumentpage.__c.getField(true,"False")));
 BA.debugLineNum = 111;BA.debugLine="renderDataListView";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4a.example.listdocumentpage.class, "_renderdatalistview" /*RemoteObject*/ );
 BA.debugLineNum = 112;BA.debugLine="B4XPages.ClosePage(Me)";
Debug.ShouldStop(32768);
listdocumentpage._b4xpages.runVoidMethod ("_closepage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e7) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e7.toString()); BA.debugLineNum = 114;BA.debugLine="ToastMessageShow(\"failed\",False)";
Debug.ShouldStop(131072);
listdocumentpage.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("failed")),(Object)(listdocumentpage.__c.getField(true,"False")));
 };
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}