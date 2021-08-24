package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class dossierpage_subs_0 {


public static RemoteObject  _activity_keypress(RemoteObject __ref,RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (dossierpage) ","dossierpage",4,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("activity_keypress")) { return __ref.runUserSub(false, "dossierpage","activity_keypress", __ref, _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 57;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, dossierpage.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 59;BA.debugLine="AddDossierPanel.Visible = False";
Debug.ShouldStop(67108864);
__ref.getField(false,"_adddossierpanel" /*RemoteObject*/ ).runMethod(true,"setVisible",dossierpage.__c.getField(true,"False"));
 BA.debugLineNum = 60;BA.debugLine="DossierListPanel.Visible = True";
Debug.ShouldStop(134217728);
__ref.getField(false,"_dossierlistpanel" /*RemoteObject*/ ).runMethod(true,"setVisible",dossierpage.__c.getField(true,"True"));
 BA.debugLineNum = 61;BA.debugLine="addDossierBtn.Visible = True";
Debug.ShouldStop(268435456);
__ref.getField(false,"_adddossierbtn" /*RemoteObject*/ ).runMethod(true,"setVisible",dossierpage.__c.getField(true,"True"));
 BA.debugLineNum = 62;BA.debugLine="Return False";
Debug.ShouldStop(536870912);
if (true) return dossierpage.__c.getField(true,"False");
 }else {
 BA.debugLineNum = 64;BA.debugLine="Return True";
Debug.ShouldStop(-2147483648);
if (true) return dossierpage.__c.getField(true,"True");
 };
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _adddossierbtn_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("addDossierBtn_Click (dossierpage) ","dossierpage",4,__ref.getField(false, "ba"),__ref,49);
if (RapidSub.canDelegate("adddossierbtn_click")) { return __ref.runUserSub(false, "dossierpage","adddossierbtn_click", __ref);}
 BA.debugLineNum = 49;BA.debugLine="Private Sub addDossierBtn_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="DossierListPanel.Visible = False";
Debug.ShouldStop(131072);
__ref.getField(false,"_dossierlistpanel" /*RemoteObject*/ ).runMethod(true,"setVisible",dossierpage.__c.getField(true,"False"));
 BA.debugLineNum = 51;BA.debugLine="addDossierBtn.Visible = False";
Debug.ShouldStop(262144);
__ref.getField(false,"_adddossierbtn" /*RemoteObject*/ ).runMethod(true,"setVisible",dossierpage.__c.getField(true,"False"));
 BA.debugLineNum = 52;BA.debugLine="AddDossierPanel.Visible = True";
Debug.ShouldStop(524288);
__ref.getField(false,"_adddossierpanel" /*RemoteObject*/ ).runMethod(true,"setVisible",dossierpage.__c.getField(true,"True"));
 BA.debugLineNum = 53;BA.debugLine="renderDocumentsList";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4a.example.dossierpage.class, "_renderdocumentslist" /*RemoteObject*/ );
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (dossierpage) ","dossierpage",4,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "dossierpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 29;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="Root = Root1";
Debug.ShouldStop(536870912);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 32;BA.debugLine="Root.LoadLayout(\"Header\")";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("Header")),__ref.getField(false, "ba"));
 BA.debugLineNum = 33;BA.debugLine="lblBack.Visible=True";
Debug.ShouldStop(1);
__ref.getField(false,"_lblback" /*RemoteObject*/ ).runMethod(true,"setVisible",dossierpage.__c.getField(true,"True"));
 BA.debugLineNum = 34;BA.debugLine="Panel1.LoadLayout(\"listdossier\")";
Debug.ShouldStop(2);
__ref.getField(false,"_panel1" /*RemoteObject*/ ).runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("listdossier")),__ref.getField(false, "ba"));
 BA.debugLineNum = 35;BA.debugLine="DossierListPanel.Visible = True";
Debug.ShouldStop(4);
__ref.getField(false,"_dossierlistpanel" /*RemoteObject*/ ).runMethod(true,"setVisible",dossierpage.__c.getField(true,"True"));
 BA.debugLineNum = 36;BA.debugLine="AddDossierPanel.Visible = False";
Debug.ShouldStop(8);
__ref.getField(false,"_adddossierpanel" /*RemoteObject*/ ).runMethod(true,"setVisible",dossierpage.__c.getField(true,"False"));
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkboxselect_checkedchange(RemoteObject __ref,RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("CheckBoxSelect_CheckedChange (dossierpage) ","dossierpage",4,__ref.getField(false, "ba"),__ref,97);
if (RapidSub.canDelegate("checkboxselect_checkedchange")) { return __ref.runUserSub(false, "dossierpage","checkboxselect_checkedchange", __ref, _checked);}
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _panel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _check = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 97;BA.debugLine="Private Sub CheckBoxSelect_CheckedChange(Checked A";
Debug.ShouldStop(1);
 BA.debugLineNum = 98;BA.debugLine="Dim index As Int = DocumentsListView.GetItemFromV";
Debug.ShouldStop(2);
_index = __ref.getField(false,"_documentslistview" /*RemoteObject*/ ).runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), dossierpage.__c.runMethod(false,"Sender",__ref.getField(false, "ba"))));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 99;BA.debugLine="Dim panel As B4XView = DocumentsListView.GetPanel";
Debug.ShouldStop(4);
_panel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_panel = __ref.getField(false,"_documentslistview" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(_index));Debug.locals.put("panel", _panel);Debug.locals.put("panel", _panel);
 BA.debugLineNum = 100;BA.debugLine="Dim check As B4XView = panel.GetView(0).GetView(0";
Debug.ShouldStop(8);
_check = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_check = _panel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("check", _check);Debug.locals.put("check", _check);
 BA.debugLineNum = 101;BA.debugLine="MsgboxAsync($\"Item value: ${DocumentsListView.Get";
Debug.ShouldStop(16);
dossierpage.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("Item value: "),dossierpage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(__ref.getField(false,"_documentslistview" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(_index)))),RemoteObject.createImmutable(" Check value: "),dossierpage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_check.runMethod(true,"getChecked")))),RemoteObject.createImmutable(""))))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),__ref.getField(false, "ba"));
 BA.debugLineNum = 102;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
dossierpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",dossierpage._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
dossierpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",dossierpage._xui);
 //BA.debugLineNum = 4;BA.debugLine="Dim ScrollView1 As ScrollView";
dossierpage._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");__ref.setField("_scrollview1",dossierpage._scrollview1);
 //BA.debugLineNum = 5;BA.debugLine="Dim Panel1 As Panel";
dossierpage._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel1",dossierpage._panel1);
 //BA.debugLineNum = 6;BA.debugLine="Dim lblBack As Label";
dossierpage._lblback = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblback",dossierpage._lblback);
 //BA.debugLineNum = 8;BA.debugLine="Dim bitMap As Bitmap";
dossierpage._bitmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");__ref.setField("_bitmap",dossierpage._bitmap);
 //BA.debugLineNum = 9;BA.debugLine="Dim Buffer() As Byte";
dossierpage._buffer = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});__ref.setField("_buffer",dossierpage._buffer);
 //BA.debugLineNum = 10;BA.debugLine="Dim stringUtils As StringUtils";
dossierpage._stringutils = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");__ref.setField("_stringutils",dossierpage._stringutils);
 //BA.debugLineNum = 11;BA.debugLine="Dim inputStream As InputStream";
dossierpage._inputstream = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");__ref.setField("_inputstream",dossierpage._inputstream);
 //BA.debugLineNum = 13;BA.debugLine="Private addDossierBtn As Panel";
dossierpage._adddossierbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_adddossierbtn",dossierpage._adddossierbtn);
 //BA.debugLineNum = 14;BA.debugLine="Private AddDossierPanel As Panel";
dossierpage._adddossierpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_adddossierpanel",dossierpage._adddossierpanel);
 //BA.debugLineNum = 15;BA.debugLine="Private DossierListPanel As Panel";
dossierpage._dossierlistpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_dossierlistpanel",dossierpage._dossierlistpanel);
 //BA.debugLineNum = 16;BA.debugLine="Private idLabel As Label";
dossierpage._idlabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_idlabel",dossierpage._idlabel);
 //BA.debugLineNum = 17;BA.debugLine="Private picture As ImageView";
dossierpage._picture = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_picture",dossierpage._picture);
 //BA.debugLineNum = 18;BA.debugLine="Private documentLabel As Label";
dossierpage._documentlabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_documentlabel",dossierpage._documentlabel);
 //BA.debugLineNum = 19;BA.debugLine="Private DocumentsListView As CustomListView";
dossierpage._documentslistview = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_documentslistview",dossierpage._documentslistview);
 //BA.debugLineNum = 20;BA.debugLine="Private CheckBoxSelect As CheckBox";
dossierpage._checkboxselect = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");__ref.setField("_checkboxselect",dossierpage._checkboxselect);
 //BA.debugLineNum = 21;BA.debugLine="Private selectedDocuments() As String = Array As";
dossierpage._selecteddocuments = RemoteObject.createNewArray("String",new int[] {0},new Object[] {});__ref.setField("_selecteddocuments",dossierpage._selecteddocuments);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createdocumentslistitem(RemoteObject __ref,RemoteObject _id,RemoteObject _docname,RemoteObject _docscan,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("createDocumentsListItem (dossierpage) ","dossierpage",4,__ref.getField(false, "ba"),__ref,86);
if (RapidSub.canDelegate("createdocumentslistitem")) { return __ref.runUserSub(false, "dossierpage","createdocumentslistitem", __ref, _id, _docname, _docscan, _width, _height);}
RemoteObject _item = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("ID", _id);
Debug.locals.put("docName", _docname);
Debug.locals.put("docScan", _docscan);
Debug.locals.put("width", _width);
Debug.locals.put("height", _height);
 BA.debugLineNum = 86;BA.debugLine="Sub createDocumentsListItem(ID As String, docName";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 87;BA.debugLine="Dim item As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(4194304);
_item = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_item = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 88;BA.debugLine="item.SetLayoutAnimated(0,0,0, width, height)";
Debug.ShouldStop(8388608);
_item.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_width),(Object)(_height));
 BA.debugLineNum = 89;BA.debugLine="item.LoadLayout(\"listview_element\")";
Debug.ShouldStop(16777216);
_item.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("listview_element")),__ref.getField(false, "ba"));
 BA.debugLineNum = 90;BA.debugLine="idLabel.Text = ID";
Debug.ShouldStop(33554432);
__ref.getField(false,"_idlabel" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_id));
 BA.debugLineNum = 91;BA.debugLine="documentLabel.Text = docName";
Debug.ShouldStop(67108864);
__ref.getField(false,"_documentlabel" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_docname));
 BA.debugLineNum = 92;BA.debugLine="picture.Bitmap = docScan";
Debug.ShouldStop(134217728);
__ref.getField(false,"_picture" /*RemoteObject*/ ).runMethod(false,"setBitmap",(_docscan.getObject()));
 BA.debugLineNum = 93;BA.debugLine="Return item";
Debug.ShouldStop(268435456);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _item.getObject());
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (dossierpage) ","dossierpage",4,__ref.getField(false, "ba"),__ref,25);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "dossierpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 25;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 26;BA.debugLine="Return Me";
Debug.ShouldStop(33554432);
if (true) return __ref;
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("lblBack_Click (dossierpage) ","dossierpage",4,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("lblback_click")) { return __ref.runUserSub(false, "dossierpage","lblback_click", __ref);}
 BA.debugLineNum = 39;BA.debugLine="Sub lblBack_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="If AddDossierPanel.Visible = True Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_adddossierpanel" /*RemoteObject*/ ).runMethod(true,"getVisible"),dossierpage.__c.getField(true,"True"))) { 
 BA.debugLineNum = 41;BA.debugLine="AddDossierPanel.Visible = False";
Debug.ShouldStop(256);
__ref.getField(false,"_adddossierpanel" /*RemoteObject*/ ).runMethod(true,"setVisible",dossierpage.__c.getField(true,"False"));
 BA.debugLineNum = 42;BA.debugLine="DossierListPanel.Visible = True";
Debug.ShouldStop(512);
__ref.getField(false,"_dossierlistpanel" /*RemoteObject*/ ).runMethod(true,"setVisible",dossierpage.__c.getField(true,"True"));
 BA.debugLineNum = 43;BA.debugLine="addDossierBtn.Visible = True";
Debug.ShouldStop(1024);
__ref.getField(false,"_adddossierbtn" /*RemoteObject*/ ).runMethod(true,"setVisible",dossierpage.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 45;BA.debugLine="B4XPages.ClosePage(Me)";
Debug.ShouldStop(4096);
dossierpage._b4xpages.runVoidMethod ("_closepage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref));
 };
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("readBlob (dossierpage) ","dossierpage",4,__ref.getField(false, "ba"),__ref,79);
if (RapidSub.canDelegate("readblob")) { return __ref.runUserSub(false, "dossierpage","readblob", __ref);}
 BA.debugLineNum = 79;BA.debugLine="Sub readBlob";
Debug.ShouldStop(16384);
 BA.debugLineNum = 80;BA.debugLine="Buffer = stringUtils.DecodeBase64(MdlConnection.d";
Debug.ShouldStop(32768);
__ref.setField ("_buffer" /*RemoteObject*/ ,__ref.getField(false,"_stringutils" /*RemoteObject*/ ).runMethod(false,"DecodeBase64",(Object)(dossierpage._mdlconnection._dbcursor /*RemoteObject*/ .runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("SCAN"))))));
 BA.debugLineNum = 81;BA.debugLine="inputStream.InitializeFromBytesArray(Buffer, 0, B";
Debug.ShouldStop(65536);
__ref.getField(false,"_inputstream" /*RemoteObject*/ ).runVoidMethod ("InitializeFromBytesArray",(Object)(__ref.getField(false,"_buffer" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_buffer" /*RemoteObject*/ ).getField(true,"length")));
 BA.debugLineNum = 82;BA.debugLine="bitMap.Initialize2(inputStream)";
Debug.ShouldStop(131072);
__ref.getField(false,"_bitmap" /*RemoteObject*/ ).runVoidMethod ("Initialize2",(Object)((__ref.getField(false,"_inputstream" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 83;BA.debugLine="inputStream.Close";
Debug.ShouldStop(262144);
__ref.getField(false,"_inputstream" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 84;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _renderdocumentslist(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("renderDocumentsList (dossierpage) ","dossierpage",4,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("renderdocumentslist")) { return __ref.runUserSub(false, "dossierpage","renderdocumentslist", __ref);}
int _i = 0;
 BA.debugLineNum = 68;BA.debugLine="Sub renderDocumentsList";
Debug.ShouldStop(8);
 BA.debugLineNum = 69;BA.debugLine="DocumentsListView.Clear";
Debug.ShouldStop(16);
__ref.getField(false,"_documentslistview" /*RemoteObject*/ ).runVoidMethod ("_clear");
 BA.debugLineNum = 70;BA.debugLine="MdlConnection.dbCursor = MdlConnection.dbSQL.Exec";
Debug.ShouldStop(32);
dossierpage._mdlconnection._dbcursor /*RemoteObject*/  = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), dossierpage._mdlconnection._dbsql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM documents"))));
 BA.debugLineNum = 71;BA.debugLine="For i=0 To MdlConnection.dbCursor.RowCount-1";
Debug.ShouldStop(64);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {dossierpage._mdlconnection._dbcursor /*RemoteObject*/ .runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 72;BA.debugLine="Log(i)";
Debug.ShouldStop(128);
dossierpage.__c.runVoidMethod ("LogImpl","82818052",BA.NumberToString(_i),0);
 BA.debugLineNum = 73;BA.debugLine="MdlConnection.dbCursor.Position = i";
Debug.ShouldStop(256);
dossierpage._mdlconnection._dbcursor /*RemoteObject*/ .runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 74;BA.debugLine="readBlob";
Debug.ShouldStop(512);
__ref.runClassMethod (b4a.example.dossierpage.class, "_readblob" /*RemoteObject*/ );
 BA.debugLineNum = 75;BA.debugLine="DocumentsListView.Add(createDocumentsListItem(Md";
Debug.ShouldStop(1024);
__ref.getField(false,"_documentslistview" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (b4a.example.dossierpage.class, "_createdocumentslistitem" /*RemoteObject*/ ,(Object)(dossierpage._mdlconnection._dbcursor /*RemoteObject*/ .runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("DOCUMENT_ID")))),(Object)(dossierpage._mdlconnection._dbcursor /*RemoteObject*/ .runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("NAME")))),(Object)(__ref.getField(false,"_bitmap" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_documentslistview" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getWidth")),(Object)(dossierpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 95))))).getObject()),(Object)(((RemoteObject.concat(RemoteObject.createImmutable("ID #"),dossierpage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable(""))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}