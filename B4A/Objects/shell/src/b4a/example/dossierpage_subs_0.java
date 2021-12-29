package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class dossierpage_subs_0 {


public static RemoteObject  _activity_keypress(RemoteObject __ref,RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (dossierpage) ","dossierpage",4,__ref.getField(false, "ba"),__ref,65);
if (RapidSub.canDelegate("activity_keypress")) { return __ref.runUserSub(false, "dossierpage","activity_keypress", __ref, _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 65;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(1);
 BA.debugLineNum = 66;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, dossierpage.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 67;BA.debugLine="AddDossierPanel.Visible = False";
Debug.ShouldStop(4);
__ref.getField(false,"_adddossierpanel" /*RemoteObject*/ ).runMethod(true,"setVisible",dossierpage.__c.getField(true,"False"));
 BA.debugLineNum = 68;BA.debugLine="DossierListPanel.Visible = True";
Debug.ShouldStop(8);
__ref.getField(false,"_dossierlistpanel" /*RemoteObject*/ ).runMethod(true,"setVisible",dossierpage.__c.getField(true,"True"));
 BA.debugLineNum = 69;BA.debugLine="addDossierBtn.Visible = True";
Debug.ShouldStop(16);
__ref.getField(false,"_adddossierbtn" /*RemoteObject*/ ).runMethod(true,"setVisible",dossierpage.__c.getField(true,"True"));
 BA.debugLineNum = 70;BA.debugLine="Return False";
Debug.ShouldStop(32);
if (true) return dossierpage.__c.getField(true,"False");
 }else {
 BA.debugLineNum = 72;BA.debugLine="Return True";
Debug.ShouldStop(128);
if (true) return dossierpage.__c.getField(true,"True");
 };
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("addDossierBtn_Click (dossierpage) ","dossierpage",4,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("adddossierbtn_click")) { return __ref.runUserSub(false, "dossierpage","adddossierbtn_click", __ref);}
 BA.debugLineNum = 56;BA.debugLine="Private Sub addDossierBtn_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="resetSelectedDocuments";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4a.example.dossierpage.class, "_resetselecteddocuments" /*RemoteObject*/ );
 BA.debugLineNum = 58;BA.debugLine="DossierListPanel.Visible = False";
Debug.ShouldStop(33554432);
__ref.getField(false,"_dossierlistpanel" /*RemoteObject*/ ).runMethod(true,"setVisible",dossierpage.__c.getField(true,"False"));
 BA.debugLineNum = 59;BA.debugLine="addDossierBtn.Visible = False";
Debug.ShouldStop(67108864);
__ref.getField(false,"_adddossierbtn" /*RemoteObject*/ ).runMethod(true,"setVisible",dossierpage.__c.getField(true,"False"));
 BA.debugLineNum = 60;BA.debugLine="AddDossierPanel.Visible = True";
Debug.ShouldStop(134217728);
__ref.getField(false,"_adddossierpanel" /*RemoteObject*/ ).runMethod(true,"setVisible",dossierpage.__c.getField(true,"True"));
 BA.debugLineNum = 61;BA.debugLine="renderDocumentsList";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4a.example.dossierpage.class, "_renderdocumentslist" /*RemoteObject*/ );
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("B4XPage_Created (dossierpage) ","dossierpage",4,__ref.getField(false, "ba"),__ref,33);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "dossierpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 33;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(1);
 BA.debugLineNum = 34;BA.debugLine="Root = Root1";
Debug.ShouldStop(2);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 36;BA.debugLine="Root.LoadLayout(\"Header\")";
Debug.ShouldStop(8);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("Header")),__ref.getField(false, "ba"));
 BA.debugLineNum = 37;BA.debugLine="lblBack.Visible=True";
Debug.ShouldStop(16);
__ref.getField(false,"_lblback" /*RemoteObject*/ ).runMethod(true,"setVisible",dossierpage.__c.getField(true,"True"));
 BA.debugLineNum = 38;BA.debugLine="Panel1.LoadLayout(\"listdossier\")";
Debug.ShouldStop(32);
__ref.getField(false,"_panel1" /*RemoteObject*/ ).runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("listdossier")),__ref.getField(false, "ba"));
 BA.debugLineNum = 39;BA.debugLine="DossierListPanel.Visible = True";
Debug.ShouldStop(64);
__ref.getField(false,"_dossierlistpanel" /*RemoteObject*/ ).runMethod(true,"setVisible",dossierpage.__c.getField(true,"True"));
 BA.debugLineNum = 40;BA.debugLine="AddDossierPanel.Visible = False";
Debug.ShouldStop(128);
__ref.getField(false,"_adddossierpanel" /*RemoteObject*/ ).runMethod(true,"setVisible",dossierpage.__c.getField(true,"False"));
 BA.debugLineNum = 42;BA.debugLine="logBridgeTable";
Debug.ShouldStop(512);
__ref.runClassMethod (b4a.example.dossierpage.class, "_logbridgetable" /*RemoteObject*/ );
 BA.debugLineNum = 43;BA.debugLine="renderDossierList";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4a.example.dossierpage.class, "_renderdossierlist" /*RemoteObject*/ );
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _booltoint(RemoteObject __ref,RemoteObject _boolinput) throws Exception{
try {
		Debug.PushSubsStack("BoolToInt (dossierpage) ","dossierpage",4,__ref.getField(false, "ba"),__ref,180);
if (RapidSub.canDelegate("booltoint")) { return __ref.runUserSub(false, "dossierpage","booltoint", __ref, _boolinput);}
RemoteObject _intoutput = RemoteObject.createImmutable(0);
Debug.locals.put("boolInput", _boolinput);
 BA.debugLineNum = 180;BA.debugLine="Private Sub BoolToInt(boolInput As Boolean)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 181;BA.debugLine="Dim intOutput As Int";
Debug.ShouldStop(1048576);
_intoutput = RemoteObject.createImmutable(0);Debug.locals.put("intOutput", _intoutput);
 BA.debugLineNum = 183;BA.debugLine="If boolInput Then";
Debug.ShouldStop(4194304);
if (_boolinput.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 184;BA.debugLine="intOutput = 1";
Debug.ShouldStop(8388608);
_intoutput = BA.numberCast(int.class, 1);Debug.locals.put("intOutput", _intoutput);
 BA.debugLineNum = 185;BA.debugLine="Return intOutput";
Debug.ShouldStop(16777216);
if (true) return BA.NumberToString(_intoutput);
 }else {
 BA.debugLineNum = 187;BA.debugLine="intOutput = 0";
Debug.ShouldStop(67108864);
_intoutput = BA.numberCast(int.class, 0);Debug.locals.put("intOutput", _intoutput);
 BA.debugLineNum = 188;BA.debugLine="Return intOutput";
Debug.ShouldStop(134217728);
if (true) return BA.NumberToString(_intoutput);
 };
 BA.debugLineNum = 191;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("CheckBoxSelect_CheckedChange (dossierpage) ","dossierpage",4,__ref.getField(false, "ba"),__ref,155);
if (RapidSub.canDelegate("checkboxselect_checkedchange")) { return __ref.runUserSub(false, "dossierpage","checkboxselect_checkedchange", __ref, _checked);}
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _panel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _check = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
int _i = 0;
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 155;BA.debugLine="Private Sub CheckBoxSelect_CheckedChange(Checked A";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 156;BA.debugLine="Dim index As Int = DocumentsListView.GetItemFromV";
Debug.ShouldStop(134217728);
_index = __ref.getField(false,"_documentslistview" /*RemoteObject*/ ).runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), dossierpage.__c.runMethod(false,"Sender",__ref.getField(false, "ba"))));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 157;BA.debugLine="Dim panel As B4XView = DocumentsListView.GetPanel";
Debug.ShouldStop(268435456);
_panel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_panel = __ref.getField(false,"_documentslistview" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(_index));Debug.locals.put("panel", _panel);Debug.locals.put("panel", _panel);
 BA.debugLineNum = 158;BA.debugLine="Dim check As B4XView = panel.GetView(0).GetView(0";
Debug.ShouldStop(536870912);
_check = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_check = _panel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("check", _check);Debug.locals.put("check", _check);
 BA.debugLineNum = 162;BA.debugLine="WriteSelectedDocs(index,check.Checked)";
Debug.ShouldStop(2);
__ref.runClassMethod (b4a.example.dossierpage.class, "_writeselecteddocs" /*RemoteObject*/ ,(Object)(_index),(Object)(_check.runMethod(true,"getChecked")));
 BA.debugLineNum = 163;BA.debugLine="Log(\"------ selected documents ------\")";
Debug.ShouldStop(4);
dossierpage.__c.runVoidMethod ("LogImpl","73145736",RemoteObject.createImmutable("------ selected documents ------"),0);
 BA.debugLineNum = 164;BA.debugLine="MdlConnection.dbCursor = MdlConnection.dbSQL.Exec";
Debug.ShouldStop(8);
dossierpage._mdlconnection._dbcursor /*RemoteObject*/  = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), dossierpage._mdlconnection._dbsql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM selected_docs"))));
 BA.debugLineNum = 165;BA.debugLine="For i=0 To MdlConnection.dbCursor.RowCount-1";
Debug.ShouldStop(16);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {dossierpage._mdlconnection._dbcursor /*RemoteObject*/ .runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 166;BA.debugLine="MdlConnection.dbCursor.Position = i";
Debug.ShouldStop(32);
dossierpage._mdlconnection._dbcursor /*RemoteObject*/ .runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 167;BA.debugLine="Log(MdlConnection.dbCursor.GetString(\"DOCUMENT_I";
Debug.ShouldStop(64);
dossierpage.__c.runVoidMethod ("LogImpl","73145740",dossierpage._mdlconnection._dbcursor /*RemoteObject*/ .runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("DOCUMENT_ID"))),0);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 170;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
 //BA.debugLineNum = 20;BA.debugLine="Private ListViewDossier As ListView";
dossierpage._listviewdossier = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");__ref.setField("_listviewdossier",dossierpage._listviewdossier);
 //BA.debugLineNum = 21;BA.debugLine="Private CheckBoxSelect As CheckBox";
dossierpage._checkboxselect = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");__ref.setField("_checkboxselect",dossierpage._checkboxselect);
 //BA.debugLineNum = 22;BA.debugLine="Private searchDossier As EditText";
dossierpage._searchdossier = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_searchdossier",dossierpage._searchdossier);
 //BA.debugLineNum = 24;BA.debugLine="Private EditTextDossierName As EditText";
dossierpage._edittextdossiername = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_edittextdossiername",dossierpage._edittextdossiername);
 //BA.debugLineNum = 25;BA.debugLine="Dim DossierName As String";
dossierpage._dossiername = RemoteObject.createImmutable("");__ref.setField("_dossiername",dossierpage._dossiername);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createdocumentslistitem(RemoteObject __ref,RemoteObject _id,RemoteObject _docname,RemoteObject _docscan,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("createDocumentsListItem (dossierpage) ","dossierpage",4,__ref.getField(false, "ba"),__ref,145);
if (RapidSub.canDelegate("createdocumentslistitem")) { return __ref.runUserSub(false, "dossierpage","createdocumentslistitem", __ref, _id, _docname, _docscan, _width, _height);}
RemoteObject _item = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("ID", _id);
Debug.locals.put("docName", _docname);
Debug.locals.put("docScan", _docscan);
Debug.locals.put("width", _width);
Debug.locals.put("height", _height);
 BA.debugLineNum = 145;BA.debugLine="Sub createDocumentsListItem(ID As String, docName";
Debug.ShouldStop(65536);
 BA.debugLineNum = 146;BA.debugLine="Dim item As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(131072);
_item = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_item = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 147;BA.debugLine="item.SetLayoutAnimated(0,0,0, width, height)";
Debug.ShouldStop(262144);
_item.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_width),(Object)(_height));
 BA.debugLineNum = 148;BA.debugLine="item.LoadLayout(\"listview_element\")";
Debug.ShouldStop(524288);
_item.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("listview_element")),__ref.getField(false, "ba"));
 BA.debugLineNum = 149;BA.debugLine="idLabel.Text = ID";
Debug.ShouldStop(1048576);
__ref.getField(false,"_idlabel" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_id));
 BA.debugLineNum = 150;BA.debugLine="documentLabel.Text = docName";
Debug.ShouldStop(2097152);
__ref.getField(false,"_documentlabel" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_docname));
 BA.debugLineNum = 151;BA.debugLine="picture.Bitmap = docScan";
Debug.ShouldStop(4194304);
__ref.getField(false,"_picture" /*RemoteObject*/ ).runMethod(false,"setBitmap",(_docscan.getObject()));
 BA.debugLineNum = 152;BA.debugLine="Return item";
Debug.ShouldStop(8388608);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _item.getObject());
 BA.debugLineNum = 153;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("Initialize (dossierpage) ","dossierpage",4,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "dossierpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 29;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="Return Me";
Debug.ShouldStop(536870912);
if (true) return __ref;
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("lblBack_Click (dossierpage) ","dossierpage",4,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("lblback_click")) { return __ref.runUserSub(false, "dossierpage","lblback_click", __ref);}
 BA.debugLineNum = 46;BA.debugLine="Sub lblBack_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="If AddDossierPanel.Visible = True Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_adddossierpanel" /*RemoteObject*/ ).runMethod(true,"getVisible"),dossierpage.__c.getField(true,"True"))) { 
 BA.debugLineNum = 48;BA.debugLine="AddDossierPanel.Visible = False";
Debug.ShouldStop(32768);
__ref.getField(false,"_adddossierpanel" /*RemoteObject*/ ).runMethod(true,"setVisible",dossierpage.__c.getField(true,"False"));
 BA.debugLineNum = 49;BA.debugLine="DossierListPanel.Visible = True";
Debug.ShouldStop(65536);
__ref.getField(false,"_dossierlistpanel" /*RemoteObject*/ ).runMethod(true,"setVisible",dossierpage.__c.getField(true,"True"));
 BA.debugLineNum = 50;BA.debugLine="addDossierBtn.Visible = True";
Debug.ShouldStop(131072);
__ref.getField(false,"_adddossierbtn" /*RemoteObject*/ ).runMethod(true,"setVisible",dossierpage.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 52;BA.debugLine="B4XPages.ClosePage(Me)";
Debug.ShouldStop(524288);
dossierpage._b4xpages.runVoidMethod ("_closepage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref));
 };
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
public static RemoteObject  _listviewdossier_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ListViewDossier_ItemCLick (dossierpage) ","dossierpage",4,__ref.getField(false, "ba"),__ref,97);
if (RapidSub.canDelegate("listviewdossier_itemclick")) { return __ref.runUserSub(false, "dossierpage","listviewdossier_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 97;BA.debugLine="Private Sub ListViewDossier_ItemCLick(Position As";
Debug.ShouldStop(1);
 BA.debugLineNum = 99;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listviewdossier_itemlongclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ListViewDossier_ItemLongClick (dossierpage) ","dossierpage",4,__ref.getField(false, "ba"),__ref,101);
if (RapidSub.canDelegate("listviewdossier_itemlongclick")) { return __ref.runUserSub(false, "dossierpage","listviewdossier_itemlongclick", __ref, _position, _value);}
RemoteObject _x = RemoteObject.createImmutable(0);
RemoteObject _dossierid = RemoteObject.createImmutable(0);
int _i = 0;
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 101;BA.debugLine="Private Sub ListViewDossier_ItemLongClick (Positio";
Debug.ShouldStop(16);
 BA.debugLineNum = 102;BA.debugLine="Dim x As Int";
Debug.ShouldStop(32);
_x = RemoteObject.createImmutable(0);Debug.locals.put("x", _x);
 BA.debugLineNum = 103;BA.debugLine="Dim DossierID As Int";
Debug.ShouldStop(64);
_dossierid = RemoteObject.createImmutable(0);Debug.locals.put("DossierID", _dossierid);
 BA.debugLineNum = 104;BA.debugLine="Dim DossierName As String = Value";
Debug.ShouldStop(128);
dossierpage._dossiername = BA.ObjectToString(_value);__ref.setField("_dossiername",dossierpage._dossiername);
 BA.debugLineNum = 105;BA.debugLine="x = Msgbox2($\"Delete dossier ${DossierName}?\"$,\"i";
Debug.ShouldStop(256);
_x = dossierpage.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("Delete dossier "),dossierpage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_dossiername" /*RemoteObject*/ )))),RemoteObject.createImmutable("?"))))),(Object)(BA.ObjectToCharSequence("info")),(Object)(BA.ObjectToString("Yes")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((dossierpage.__c.getField(false,"Null"))),__ref.getField(false, "ba"));Debug.locals.put("x", _x);
 BA.debugLineNum = 106;BA.debugLine="If x = DialogResponse.POSITIVE Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_x,BA.numberCast(double.class, dossierpage.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 107;BA.debugLine="MdlConnection.dbCursor = MdlConnection.dbSQL.Exe";
Debug.ShouldStop(1024);
dossierpage._mdlconnection._dbcursor /*RemoteObject*/  = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), dossierpage._mdlconnection._dbsql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT ID,NAME FROM dossier"))));
 BA.debugLineNum = 108;BA.debugLine="For i = 0 To MdlConnection.dbCursor.RowCount-1";
Debug.ShouldStop(2048);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {dossierpage._mdlconnection._dbcursor /*RemoteObject*/ .runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 109;BA.debugLine="MdlConnection.dbCursor.Position = i";
Debug.ShouldStop(4096);
dossierpage._mdlconnection._dbcursor /*RemoteObject*/ .runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 110;BA.debugLine="If MdlConnection.dbCursor.GetString(\"NAME\") = D";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",dossierpage._mdlconnection._dbcursor /*RemoteObject*/ .runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("NAME"))),__ref.getField(true,"_dossiername" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 111;BA.debugLine="DossierID = MdlConnection.dbCursor.GetInt(\"ID\"";
Debug.ShouldStop(16384);
_dossierid = dossierpage._mdlconnection._dbcursor /*RemoteObject*/ .runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ID")));Debug.locals.put("DossierID", _dossierid);
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 114;BA.debugLine="MdlConnection.dbCursor.Close";
Debug.ShouldStop(131072);
dossierpage._mdlconnection._dbcursor /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 115;BA.debugLine="MdlConnection.dbSQL.ExecNonQuery(\"DELETE FROM br";
Debug.ShouldStop(262144);
dossierpage._mdlconnection._dbsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("DELETE FROM bridge WHERE DOSSIER_ID='"),_dossierid,RemoteObject.createImmutable("'"))));
 BA.debugLineNum = 116;BA.debugLine="MdlConnection.dbSQL.ExecNonQuery(\"DELETE FROM do";
Debug.ShouldStop(524288);
dossierpage._mdlconnection._dbsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("DELETE FROM dossier WHERE NAME='"),__ref.getField(true,"_dossiername" /*RemoteObject*/ ),RemoteObject.createImmutable("'"))));
 };
 BA.debugLineNum = 119;BA.debugLine="logBridgeTable";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4a.example.dossierpage.class, "_logbridgetable" /*RemoteObject*/ );
 BA.debugLineNum = 120;BA.debugLine="renderDossierList";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4a.example.dossierpage.class, "_renderdossierlist" /*RemoteObject*/ );
 BA.debugLineNum = 121;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _logbridgetable(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("logBridgeTable (dossierpage) ","dossierpage",4,__ref.getField(false, "ba"),__ref,252);
if (RapidSub.canDelegate("logbridgetable")) { return __ref.runUserSub(false, "dossierpage","logbridgetable", __ref);}
int _i = 0;
RemoteObject _dossierid = RemoteObject.createImmutable(0);
RemoteObject _docid = RemoteObject.createImmutable(0);
 BA.debugLineNum = 252;BA.debugLine="Sub logBridgeTable";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 253;BA.debugLine="ListViewDossier.Clear";
Debug.ShouldStop(268435456);
__ref.getField(false,"_listviewdossier" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 254;BA.debugLine="MdlConnection.dbCursor = MdlConnection.dbSQL.Exec";
Debug.ShouldStop(536870912);
dossierpage._mdlconnection._dbcursor /*RemoteObject*/  = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), dossierpage._mdlconnection._dbsql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM bridge"))));
 BA.debugLineNum = 255;BA.debugLine="Log(\"bridge table content: \")";
Debug.ShouldStop(1073741824);
dossierpage.__c.runVoidMethod ("LogImpl","719988483",RemoteObject.createImmutable("bridge table content: "),0);
 BA.debugLineNum = 256;BA.debugLine="For i=0 To MdlConnection.dbCursor.RowCount-1";
Debug.ShouldStop(-2147483648);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {dossierpage._mdlconnection._dbcursor /*RemoteObject*/ .runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 257;BA.debugLine="MdlConnection.dbCursor.Position = i";
Debug.ShouldStop(1);
dossierpage._mdlconnection._dbcursor /*RemoteObject*/ .runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 259;BA.debugLine="Dim dossierID As Int = MdlConnection.dbCursor.Ge";
Debug.ShouldStop(4);
_dossierid = dossierpage._mdlconnection._dbcursor /*RemoteObject*/ .runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("DOSSIER_ID")));Debug.locals.put("dossierID", _dossierid);Debug.locals.put("dossierID", _dossierid);
 BA.debugLineNum = 260;BA.debugLine="Dim docID As Int = MdlConnection.dbCursor.GetInt";
Debug.ShouldStop(8);
_docid = dossierpage._mdlconnection._dbcursor /*RemoteObject*/ .runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("DOCUMENT_ID")));Debug.locals.put("docID", _docid);Debug.locals.put("docID", _docid);
 BA.debugLineNum = 262;BA.debugLine="Log($\"dossierID: ${dossierID} includedDocs: ${do";
Debug.ShouldStop(32);
dossierpage.__c.runVoidMethod ("LogImpl","719988490",(RemoteObject.concat(RemoteObject.createImmutable("dossierID: "),dossierpage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dossierid))),RemoteObject.createImmutable(" includedDocs: "),dossierpage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_docid))),RemoteObject.createImmutable(""))),0);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 264;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("readBlob (dossierpage) ","dossierpage",4,__ref.getField(false, "ba"),__ref,138);
if (RapidSub.canDelegate("readblob")) { return __ref.runUserSub(false, "dossierpage","readblob", __ref);}
 BA.debugLineNum = 138;BA.debugLine="Sub readBlob";
Debug.ShouldStop(512);
 BA.debugLineNum = 139;BA.debugLine="Buffer = stringUtils.DecodeBase64(MdlConnection.d";
Debug.ShouldStop(1024);
__ref.setField ("_buffer" /*RemoteObject*/ ,__ref.getField(false,"_stringutils" /*RemoteObject*/ ).runMethod(false,"DecodeBase64",(Object)(dossierpage._mdlconnection._dbcursor /*RemoteObject*/ .runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("SCAN"))))));
 BA.debugLineNum = 140;BA.debugLine="inputStream.InitializeFromBytesArray(Buffer, 0, B";
Debug.ShouldStop(2048);
__ref.getField(false,"_inputstream" /*RemoteObject*/ ).runVoidMethod ("InitializeFromBytesArray",(Object)(__ref.getField(false,"_buffer" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_buffer" /*RemoteObject*/ ).getField(true,"length")));
 BA.debugLineNum = 141;BA.debugLine="bitMap.Initialize2(inputStream)";
Debug.ShouldStop(4096);
__ref.getField(false,"_bitmap" /*RemoteObject*/ ).runVoidMethod ("Initialize2",(Object)((__ref.getField(false,"_inputstream" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 142;BA.debugLine="inputStream.Close";
Debug.ShouldStop(8192);
__ref.getField(false,"_inputstream" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 143;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("renderDocumentsList (dossierpage) ","dossierpage",4,__ref.getField(false, "ba"),__ref,76);
if (RapidSub.canDelegate("renderdocumentslist")) { return __ref.runUserSub(false, "dossierpage","renderdocumentslist", __ref);}
int _i = 0;
 BA.debugLineNum = 76;BA.debugLine="Sub renderDocumentsList";
Debug.ShouldStop(2048);
 BA.debugLineNum = 77;BA.debugLine="DocumentsListView.Clear";
Debug.ShouldStop(4096);
__ref.getField(false,"_documentslistview" /*RemoteObject*/ ).runVoidMethod ("_clear");
 BA.debugLineNum = 78;BA.debugLine="MdlConnection.dbCursor = MdlConnection.dbSQL.Exec";
Debug.ShouldStop(8192);
dossierpage._mdlconnection._dbcursor /*RemoteObject*/  = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), dossierpage._mdlconnection._dbsql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM documents"))));
 BA.debugLineNum = 79;BA.debugLine="For i=0 To MdlConnection.dbCursor.RowCount-1";
Debug.ShouldStop(16384);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {dossierpage._mdlconnection._dbcursor /*RemoteObject*/ .runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 80;BA.debugLine="MdlConnection.dbCursor.Position = i";
Debug.ShouldStop(32768);
dossierpage._mdlconnection._dbcursor /*RemoteObject*/ .runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 81;BA.debugLine="readBlob";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4a.example.dossierpage.class, "_readblob" /*RemoteObject*/ );
 BA.debugLineNum = 82;BA.debugLine="DocumentsListView.Add(createDocumentsListItem(Md";
Debug.ShouldStop(131072);
__ref.getField(false,"_documentslistview" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (b4a.example.dossierpage.class, "_createdocumentslistitem" /*RemoteObject*/ ,(Object)(dossierpage._mdlconnection._dbcursor /*RemoteObject*/ .runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("DOCUMENT_ID")))),(Object)(dossierpage._mdlconnection._dbcursor /*RemoteObject*/ .runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("NAME")))),(Object)(__ref.getField(false,"_bitmap" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_documentslistview" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getWidth")),(Object)(dossierpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 95))))).getObject()),(Object)(((RemoteObject.concat(RemoteObject.createImmutable("ID #"),dossierpage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable(""))))));
 }
}Debug.locals.put("i", _i);
;
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
public static RemoteObject  _renderdossierlist(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("renderDossierList (dossierpage) ","dossierpage",4,__ref.getField(false, "ba"),__ref,86);
if (RapidSub.canDelegate("renderdossierlist")) { return __ref.runUserSub(false, "dossierpage","renderdossierlist", __ref);}
int _i = 0;
 BA.debugLineNum = 86;BA.debugLine="Sub renderDossierList";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 87;BA.debugLine="ListViewDossier.Clear";
Debug.ShouldStop(4194304);
__ref.getField(false,"_listviewdossier" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 88;BA.debugLine="MdlConnection.dbCursor = MdlConnection.dbSQL.Exec";
Debug.ShouldStop(8388608);
dossierpage._mdlconnection._dbcursor /*RemoteObject*/  = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), dossierpage._mdlconnection._dbsql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM dossier"))));
 BA.debugLineNum = 89;BA.debugLine="For i = 0 To MdlConnection.dbCursor.RowCount-1";
Debug.ShouldStop(16777216);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {dossierpage._mdlconnection._dbcursor /*RemoteObject*/ .runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 90;BA.debugLine="MdlConnection.dbCursor.Position = i";
Debug.ShouldStop(33554432);
dossierpage._mdlconnection._dbcursor /*RemoteObject*/ .runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 91;BA.debugLine="ListViewDossier.AddSingleLine(MdlConnection.dbCu";
Debug.ShouldStop(67108864);
__ref.getField(false,"_listviewdossier" /*RemoteObject*/ ).runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(dossierpage._mdlconnection._dbcursor /*RemoteObject*/ .runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("NAME"))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 93;BA.debugLine="MdlConnection.dbCursor.Close";
Debug.ShouldStop(268435456);
dossierpage._mdlconnection._dbcursor /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 94;BA.debugLine="ListViewDossier.SingleLineLayout.Label.TextColor";
Debug.ShouldStop(536870912);
__ref.getField(false,"_listviewdossier" /*RemoteObject*/ ).runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextColor",dossierpage.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 95;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resetdatabase(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("resetDatabase (dossierpage) ","dossierpage",4,__ref.getField(false, "ba"),__ref,240);
if (RapidSub.canDelegate("resetdatabase")) { return __ref.runUserSub(false, "dossierpage","resetdatabase", __ref);}
 BA.debugLineNum = 240;BA.debugLine="Private Sub resetDatabase";
Debug.ShouldStop(32768);
 BA.debugLineNum = 241;BA.debugLine="MdlConnection.dbSQL.ExecNonQuery(\"DROP TABLE IF E";
Debug.ShouldStop(65536);
dossierpage._mdlconnection._dbsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("DROP TABLE IF EXISTS selected_docs")));
 BA.debugLineNum = 242;BA.debugLine="MdlConnection.dbSQL.ExecNonQuery(\"CREATE TABLE se";
Debug.ShouldStop(131072);
dossierpage._mdlconnection._dbsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("CREATE TABLE selected_docs (ID INTEGER PRIMARY KEY,DOCUMENT_ID INTEGER, SELECTED INTEGER)")));
 BA.debugLineNum = 244;BA.debugLine="MdlConnection.dbSQL.ExecNonQuery(\"DROP TABLE IF E";
Debug.ShouldStop(524288);
dossierpage._mdlconnection._dbsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("DROP TABLE IF EXISTS dossier")));
 BA.debugLineNum = 245;BA.debugLine="MdlConnection.dbSQL.ExecNonQuery(\"CREATE TABLE do";
Debug.ShouldStop(1048576);
dossierpage._mdlconnection._dbsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("CREATE TABLE dossier (ID INTEGER PRIMARY KEY,NAME TEXT)")));
 BA.debugLineNum = 247;BA.debugLine="MdlConnection.dbSQL.ExecNonQuery(\"DROP TABLE IF E";
Debug.ShouldStop(4194304);
dossierpage._mdlconnection._dbsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("DROP TABLE IF EXISTS bridge")));
 BA.debugLineNum = 248;BA.debugLine="MdlConnection.dbSQL.ExecNonQuery(\"CREATE TABLE br";
Debug.ShouldStop(8388608);
dossierpage._mdlconnection._dbsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("CREATE TABLE bridge (ID INTEGER PRIMARY KEY,DOSSIER_ID INTEGER, DOCUMENT_ID INTEGER)")));
 BA.debugLineNum = 249;BA.debugLine="Log(\"------ RESET DATABASE: hard ------\")";
Debug.ShouldStop(16777216);
dossierpage.__c.runVoidMethod ("LogImpl","717235977",RemoteObject.createImmutable("------ RESET DATABASE: hard ------"),0);
 BA.debugLineNum = 250;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resetselecteddocuments(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("resetSelectedDocuments (dossierpage) ","dossierpage",4,__ref.getField(false, "ba"),__ref,228);
if (RapidSub.canDelegate("resetselecteddocuments")) { return __ref.runUserSub(false, "dossierpage","resetselecteddocuments", __ref);}
 BA.debugLineNum = 228;BA.debugLine="Private Sub resetSelectedDocuments";
Debug.ShouldStop(8);
 BA.debugLineNum = 229;BA.debugLine="MdlConnection.dbSQL.ExecNonQuery(\"DROP TABLE IF E";
Debug.ShouldStop(16);
dossierpage._mdlconnection._dbsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("DROP TABLE IF EXISTS selected_docs")));
 BA.debugLineNum = 230;BA.debugLine="MdlConnection.dbSQL.ExecNonQuery(\"CREATE TABLE se";
Debug.ShouldStop(32);
dossierpage._mdlconnection._dbsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("CREATE TABLE selected_docs (ID INTEGER PRIMARY KEY,DOCUMENT_ID INTEGER, SELECTED INTEGER)")));
 BA.debugLineNum = 237;BA.debugLine="Log(\"------ RESET DATABASE: selected_doc ------\")";
Debug.ShouldStop(4096);
dossierpage.__c.runVoidMethod ("LogImpl","715400969",RemoteObject.createImmutable("------ RESET DATABASE: selected_doc ------"),0);
 BA.debugLineNum = 238;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _savedossierbridge(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("saveDossierBridge (dossierpage) ","dossierpage",4,__ref.getField(false, "ba"),__ref,203);
if (RapidSub.canDelegate("savedossierbridge")) { return __ref.runUserSub(false, "dossierpage","savedossierbridge", __ref);}
RemoteObject _dossierid = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _docid = RemoteObject.createImmutable(0);
 BA.debugLineNum = 203;BA.debugLine="Private Sub saveDossierBridge";
Debug.ShouldStop(1024);
 BA.debugLineNum = 204;BA.debugLine="Dim DossierID As Int";
Debug.ShouldStop(2048);
_dossierid = RemoteObject.createImmutable(0);Debug.locals.put("DossierID", _dossierid);
 BA.debugLineNum = 205;BA.debugLine="DossierName = EditTextDossierName.Text";
Debug.ShouldStop(4096);
__ref.setField ("_dossiername" /*RemoteObject*/ ,__ref.getField(false,"_edittextdossiername" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 206;BA.debugLine="MdlConnection.dbCursor = MdlConnection.dbSQL.Exec";
Debug.ShouldStop(8192);
dossierpage._mdlconnection._dbcursor /*RemoteObject*/  = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), dossierpage._mdlconnection._dbsql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT ID,NAME FROM dossier"))));
 BA.debugLineNum = 209;BA.debugLine="For i = 0 To MdlConnection.dbCursor.RowCount-1";
Debug.ShouldStop(65536);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {dossierpage._mdlconnection._dbcursor /*RemoteObject*/ .runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 210;BA.debugLine="MdlConnection.dbCursor.Position = i";
Debug.ShouldStop(131072);
dossierpage._mdlconnection._dbcursor /*RemoteObject*/ .runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 211;BA.debugLine="If MdlConnection.dbCursor.GetString(\"NAME\") = Do";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",dossierpage._mdlconnection._dbcursor /*RemoteObject*/ .runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("NAME"))),__ref.getField(true,"_dossiername" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 212;BA.debugLine="DossierID = MdlConnection.dbCursor.GetInt(\"ID\")";
Debug.ShouldStop(524288);
_dossierid = dossierpage._mdlconnection._dbcursor /*RemoteObject*/ .runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ID")));Debug.locals.put("DossierID", _dossierid);
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 215;BA.debugLine="MdlConnection.dbCursor.Close";
Debug.ShouldStop(4194304);
dossierpage._mdlconnection._dbcursor /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 216;BA.debugLine="Log($\"get dossier ID: ${DossierID} of ${DossierNa";
Debug.ShouldStop(8388608);
dossierpage.__c.runVoidMethod ("LogImpl","715728653",(RemoteObject.concat(RemoteObject.createImmutable("get dossier ID: "),dossierpage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dossierid))),RemoteObject.createImmutable(" of "),dossierpage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_dossiername" /*RemoteObject*/ )))),RemoteObject.createImmutable(" "))),0);
 BA.debugLineNum = 218;BA.debugLine="MdlConnection.dbCursor = MdlConnection.dbSQL.Exec";
Debug.ShouldStop(33554432);
dossierpage._mdlconnection._dbcursor /*RemoteObject*/  = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), dossierpage._mdlconnection._dbsql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT DOCUMENT_ID,SELECTED FROM selected_docs"))));
 BA.debugLineNum = 219;BA.debugLine="For i = 0 To MdlConnection.dbCursor.RowCount-1";
Debug.ShouldStop(67108864);
{
final int step13 = 1;
final int limit13 = RemoteObject.solve(new RemoteObject[] {dossierpage._mdlconnection._dbcursor /*RemoteObject*/ .runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step13 > 0 && _i <= limit13) || (step13 < 0 && _i >= limit13) ;_i = ((int)(0 + _i + step13))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 220;BA.debugLine="MdlConnection.dbCursor.Position = i";
Debug.ShouldStop(134217728);
dossierpage._mdlconnection._dbcursor /*RemoteObject*/ .runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 221;BA.debugLine="Dim docID As Int = MdlConnection.dbCursor.GetInt";
Debug.ShouldStop(268435456);
_docid = dossierpage._mdlconnection._dbcursor /*RemoteObject*/ .runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("DOCUMENT_ID")));Debug.locals.put("docID", _docid);Debug.locals.put("docID", _docid);
 BA.debugLineNum = 222;BA.debugLine="MdlConnection.dbSQL.ExecNonQuery(\"INSERT INTO br";
Debug.ShouldStop(536870912);
dossierpage._mdlconnection._dbsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO bridge(DOSSIER_ID, DOCUMENT_ID) VALUES('"),_dossierid,RemoteObject.createImmutable("','"),_docid,RemoteObject.createImmutable("')"))));
 BA.debugLineNum = 223;BA.debugLine="Log($\"put value to bridge table, dossierID:${Dos";
Debug.ShouldStop(1073741824);
dossierpage.__c.runVoidMethod ("LogImpl","715728660",(RemoteObject.concat(RemoteObject.createImmutable("put value to bridge table, dossierID:"),dossierpage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dossierid))),RemoteObject.createImmutable("  docID:"),dossierpage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_docid))),RemoteObject.createImmutable(" "))),0);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 225;BA.debugLine="MdlConnection.dbCursor.Close";
Debug.ShouldStop(1);
dossierpage._mdlconnection._dbcursor /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 226;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _savedossierbtn_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("saveDossierBtn_Click (dossierpage) ","dossierpage",4,__ref.getField(false, "ba"),__ref,193);
if (RapidSub.canDelegate("savedossierbtn_click")) { return __ref.runUserSub(false, "dossierpage","savedossierbtn_click", __ref);}
 BA.debugLineNum = 193;BA.debugLine="Private Sub saveDossierBtn_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 194;BA.debugLine="saveDossierName";
Debug.ShouldStop(2);
__ref.runClassMethod (b4a.example.dossierpage.class, "_savedossiername" /*RemoteObject*/ );
 BA.debugLineNum = 195;BA.debugLine="saveDossierBridge";
Debug.ShouldStop(4);
__ref.runClassMethod (b4a.example.dossierpage.class, "_savedossierbridge" /*RemoteObject*/ );
 BA.debugLineNum = 196;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _savedossiername(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("saveDossierName (dossierpage) ","dossierpage",4,__ref.getField(false, "ba"),__ref,198);
if (RapidSub.canDelegate("savedossiername")) { return __ref.runUserSub(false, "dossierpage","savedossiername", __ref);}
 BA.debugLineNum = 198;BA.debugLine="Private Sub saveDossierName";
Debug.ShouldStop(32);
 BA.debugLineNum = 199;BA.debugLine="DossierName = EditTextDossierName.Text";
Debug.ShouldStop(64);
__ref.setField ("_dossiername" /*RemoteObject*/ ,__ref.getField(false,"_edittextdossiername" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 200;BA.debugLine="MdlConnection.dbSQL.ExecNonQuery(\"INSERT INTO dos";
Debug.ShouldStop(128);
dossierpage._mdlconnection._dbsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO dossier(NAME) VALUES('"),__ref.getField(true,"_dossiername" /*RemoteObject*/ ),RemoteObject.createImmutable("')"))));
 BA.debugLineNum = 201;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _searchdossier_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("searchDossier_TextChanged (dossierpage) ","dossierpage",4,__ref.getField(false, "ba"),__ref,123);
if (RapidSub.canDelegate("searchdossier_textchanged")) { return __ref.runUserSub(false, "dossierpage","searchdossier_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 123;BA.debugLine="Private Sub searchDossier_TextChanged (Old As Stri";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 124;BA.debugLine="searchingDossier";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4a.example.dossierpage.class, "_searchingdossier" /*RemoteObject*/ );
 BA.debugLineNum = 125;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _searchingdossier(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("searchingDossier (dossierpage) ","dossierpage",4,__ref.getField(false, "ba"),__ref,127);
if (RapidSub.canDelegate("searchingdossier")) { return __ref.runUserSub(false, "dossierpage","searchingdossier", __ref);}
int _i = 0;
 BA.debugLineNum = 127;BA.debugLine="Private Sub searchingDossier";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 128;BA.debugLine="ListViewDossier.Clear";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_listviewdossier" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 129;BA.debugLine="MdlConnection.dbCursor = MdlConnection.dbSQL.Exec";
Debug.ShouldStop(1);
dossierpage._mdlconnection._dbcursor /*RemoteObject*/  = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), dossierpage._mdlconnection._dbsql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM dossier WHERE NAME LIKE '"),__ref.getField(false,"_searchdossier" /*RemoteObject*/ ).runMethod(true,"getText"),RemoteObject.createImmutable("%'")))));
 BA.debugLineNum = 130;BA.debugLine="For i = 0 To MdlConnection.dbCursor.RowCount-1";
Debug.ShouldStop(2);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {dossierpage._mdlconnection._dbcursor /*RemoteObject*/ .runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 131;BA.debugLine="MdlConnection.dbCursor.Position = i";
Debug.ShouldStop(4);
dossierpage._mdlconnection._dbcursor /*RemoteObject*/ .runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 132;BA.debugLine="ListViewDossier.AddSingleLine(MdlConnection.dbCu";
Debug.ShouldStop(8);
__ref.getField(false,"_listviewdossier" /*RemoteObject*/ ).runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(dossierpage._mdlconnection._dbcursor /*RemoteObject*/ .runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("NAME"))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 134;BA.debugLine="MdlConnection.dbCursor.Close";
Debug.ShouldStop(32);
dossierpage._mdlconnection._dbcursor /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 135;BA.debugLine="ListViewDossier.SingleLineLayout.Label.TextColor";
Debug.ShouldStop(64);
__ref.getField(false,"_listviewdossier" /*RemoteObject*/ ).runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextColor",dossierpage.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 136;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _writeselecteddocs(RemoteObject __ref,RemoteObject _documentid,RemoteObject _selected) throws Exception{
try {
		Debug.PushSubsStack("WriteSelectedDocs (dossierpage) ","dossierpage",4,__ref.getField(false, "ba"),__ref,172);
if (RapidSub.canDelegate("writeselecteddocs")) { return __ref.runUserSub(false, "dossierpage","writeselecteddocs", __ref, _documentid, _selected);}
Debug.locals.put("documentID", _documentid);
Debug.locals.put("Selected", _selected);
 BA.debugLineNum = 172;BA.debugLine="Private Sub WriteSelectedDocs(documentID As Int, S";
Debug.ShouldStop(2048);
 BA.debugLineNum = 173;BA.debugLine="If Selected Then";
Debug.ShouldStop(4096);
if (_selected.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 174;BA.debugLine="MdlConnection.dbSQL.ExecNonQuery(\"INSERT INTO se";
Debug.ShouldStop(8192);
dossierpage._mdlconnection._dbsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO selected_docs(DOCUMENT_ID, SELECTED) VALUES('"),_documentid,RemoteObject.createImmutable("','"),RemoteObject.createImmutable(1),RemoteObject.createImmutable("')"))));
 }else {
 BA.debugLineNum = 176;BA.debugLine="MdlConnection.dbSQL.ExecNonQuery(\"DELETE FROM se";
Debug.ShouldStop(32768);
dossierpage._mdlconnection._dbsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("DELETE FROM selected_docs WHERE DOCUMENT_ID='"),_documentid,RemoteObject.createImmutable("'"))));
 };
 BA.debugLineNum = 178;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}