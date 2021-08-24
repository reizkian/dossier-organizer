package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 35;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="Root = Root1";
Debug.ShouldStop(8);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 37;BA.debugLine="Root.LoadLayout(\"header\")";
Debug.ShouldStop(16);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("header")),__ref.getField(false, "ba"));
 BA.debugLineNum = 38;BA.debugLine="ScrollView1.Panel.LoadLayout(\"mainpage\")";
Debug.ShouldStop(32);
__ref.getField(false,"_scrollview1" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("mainpage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 39;BA.debugLine="lblBack.Visible = False";
Debug.ShouldStop(64);
__ref.getField(false,"_lblback" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xmainpage.__c.getField(true,"False"));
 BA.debugLineNum = 42;BA.debugLine="MdlConnection.connection";
Debug.ShouldStop(512);
b4xmainpage._mdlconnection.runVoidMethod ("_connection" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 44;BA.debugLine="ScanDocument.Initialize";
Debug.ShouldStop(2048);
__ref.getField(false,"_scandocument" /*RemoteObject*/ ).runClassMethod (b4a.example.scandocumentpage.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 45;BA.debugLine="B4XPages.AddPage(\"ScanDocument\", ScanDocument)";
Debug.ShouldStop(4096);
b4xmainpage._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("ScanDocument")),(Object)((__ref.getField(false,"_scandocument" /*RemoteObject*/ ))));
 BA.debugLineNum = 46;BA.debugLine="ListDocument.Initialize";
Debug.ShouldStop(8192);
__ref.getField(false,"_listdocument" /*RemoteObject*/ ).runClassMethod (b4a.example.listdocumentpage.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 47;BA.debugLine="B4XPages.AddPage(\"ListDocument\", ListDocument)";
Debug.ShouldStop(16384);
b4xmainpage._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("ListDocument")),(Object)((__ref.getField(false,"_listdocument" /*RemoteObject*/ ))));
 BA.debugLineNum = 48;BA.debugLine="Dossier.Initialize";
Debug.ShouldStop(32768);
__ref.getField(false,"_dossier" /*RemoteObject*/ ).runClassMethod (b4a.example.dossierpage.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 49;BA.debugLine="B4XPages.AddPage(\"Dossier\", Dossier)";
Debug.ShouldStop(65536);
b4xmainpage._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Dossier")),(Object)((__ref.getField(false,"_dossier" /*RemoteObject*/ ))));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
b4xmainpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xmainpage._root);
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
b4xmainpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xmainpage._xui);
 //BA.debugLineNum = 13;BA.debugLine="Dim lblBack As Label";
b4xmainpage._lblback = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblback",b4xmainpage._lblback);
 //BA.debugLineNum = 14;BA.debugLine="Dim ScrollView1 As ScrollView";
b4xmainpage._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");__ref.setField("_scrollview1",b4xmainpage._scrollview1);
 //BA.debugLineNum = 17;BA.debugLine="Dim ScanDocument As ScanDocumentPage";
b4xmainpage._scandocument = RemoteObject.createNew ("b4a.example.scandocumentpage");__ref.setField("_scandocument",b4xmainpage._scandocument);
 //BA.debugLineNum = 18;BA.debugLine="Private ScanDocumentBtn As Panel";
b4xmainpage._scandocumentbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_scandocumentbtn",b4xmainpage._scandocumentbtn);
 //BA.debugLineNum = 21;BA.debugLine="Dim ListDocument As ListDocumentPage";
b4xmainpage._listdocument = RemoteObject.createNew ("b4a.example.listdocumentpage");__ref.setField("_listdocument",b4xmainpage._listdocument);
 //BA.debugLineNum = 22;BA.debugLine="Private ListDocumentBtn As Panel";
b4xmainpage._listdocumentbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_listdocumentbtn",b4xmainpage._listdocumentbtn);
 //BA.debugLineNum = 25;BA.debugLine="Dim Dossier As DossierPage";
b4xmainpage._dossier = RemoteObject.createNew ("b4a.example.dossierpage");__ref.setField("_dossier",b4xmainpage._dossier);
 //BA.debugLineNum = 26;BA.debugLine="Private DossierBtn As Panel";
b4xmainpage._dossierbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_dossierbtn",b4xmainpage._dossierbtn);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _dossierbtn_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DossierBtn_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,63);
if (RapidSub.canDelegate("dossierbtn_click")) { return __ref.runUserSub(false, "b4xmainpage","dossierbtn_click", __ref);}
 BA.debugLineNum = 63;BA.debugLine="Private Sub DossierBtn_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 64;BA.debugLine="B4XPages.ShowPage(\"Dossier\")";
Debug.ShouldStop(-2147483648);
b4xmainpage._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Dossier")));
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,30);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 30;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listdocumentbtn_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ListDocumentBtn_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,59);
if (RapidSub.canDelegate("listdocumentbtn_click")) { return __ref.runUserSub(false, "b4xmainpage","listdocumentbtn_click", __ref);}
 BA.debugLineNum = 59;BA.debugLine="Private Sub ListDocumentBtn_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 60;BA.debugLine="B4XPages.ShowPage(\"ListDocument\")";
Debug.ShouldStop(134217728);
b4xmainpage._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("ListDocument")));
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _scandocumentbtn_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ScanDocumentBtn_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("scandocumentbtn_click")) { return __ref.runUserSub(false, "b4xmainpage","scandocumentbtn_click", __ref);}
 BA.debugLineNum = 55;BA.debugLine="Private Sub ScanDocumentBtn_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="B4XPages.ShowPage(\"ScanDocument\")";
Debug.ShouldStop(8388608);
b4xmainpage._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("ScanDocument")));
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}