package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class scandocumentpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (scandocumentpage) ","scandocumentpage",2,__ref.getField(false, "ba"),__ref,53);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "scandocumentpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 53;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 54;BA.debugLine="Root = Root1";
Debug.ShouldStop(2097152);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 56;BA.debugLine="Root.LoadLayout(\"Header\")";
Debug.ShouldStop(8388608);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("Header")),__ref.getField(false, "ba"));
 BA.debugLineNum = 57;BA.debugLine="lblBack.Visible=True";
Debug.ShouldStop(16777216);
__ref.getField(false,"_lblback" /*RemoteObject*/ ).runMethod(true,"setVisible",scandocumentpage.__c.getField(true,"True"));
 BA.debugLineNum = 58;BA.debugLine="Panel1.LoadLayout(\"scandocument\")";
Debug.ShouldStop(33554432);
__ref.getField(false,"_panel1" /*RemoteObject*/ ).runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("scandocument")),__ref.getField(false, "ba"));
 BA.debugLineNum = 59;BA.debugLine="scanView.Visible=False";
Debug.ShouldStop(67108864);
__ref.getField(false,"_scanview" /*RemoteObject*/ ).runMethod(true,"setVisible",scandocumentpage.__c.getField(true,"False"));
 BA.debugLineNum = 60;BA.debugLine="PropertiesPanel.Visible = False";
Debug.ShouldStop(134217728);
__ref.getField(false,"_propertiespanel" /*RemoteObject*/ ).runMethod(true,"setVisible",scandocumentpage.__c.getField(true,"False"));
 BA.debugLineNum = 62;BA.debugLine="Provider.Initialize";
Debug.ShouldStop(536870912);
__ref.getField(false,"_provider" /*RemoteObject*/ ).runClassMethod (b4a.example.fileprovider.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
scandocumentpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",scandocumentpage._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
scandocumentpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",scandocumentpage._xui);
 //BA.debugLineNum = 4;BA.debugLine="Dim ScrollView1 As ScrollView";
scandocumentpage._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");__ref.setField("_scrollview1",scandocumentpage._scrollview1);
 //BA.debugLineNum = 5;BA.debugLine="Dim Panel1 As Panel";
scandocumentpage._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel1",scandocumentpage._panel1);
 //BA.debugLineNum = 6;BA.debugLine="Dim lblBack As Label";
scandocumentpage._lblback = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblback",scandocumentpage._lblback);
 //BA.debugLineNum = 8;BA.debugLine="Dim OpenGalleryButton As Panel";
scandocumentpage._opengallerybutton = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_opengallerybutton",scandocumentpage._opengallerybutton);
 //BA.debugLineNum = 9;BA.debugLine="Dim Chooser As ContentChooser";
scandocumentpage._chooser = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.ContentChooser");__ref.setField("_chooser",scandocumentpage._chooser);
 //BA.debugLineNum = 10;BA.debugLine="Dim rp As RuntimePermissions";
scandocumentpage._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");__ref.setField("_rp",scandocumentpage._rp);
 //BA.debugLineNum = 13;BA.debugLine="Private tempImageFile As String = \"tempimage.jpg\"";
scandocumentpage._tempimagefile = BA.ObjectToString("tempimage.jpg");__ref.setField("_tempimagefile",scandocumentpage._tempimagefile);
 //BA.debugLineNum = 14;BA.debugLine="Private Provider As FileProvider";
scandocumentpage._provider = RemoteObject.createNew ("b4a.example.fileprovider");__ref.setField("_provider",scandocumentpage._provider);
 //BA.debugLineNum = 15;BA.debugLine="Private ion As Object";
scandocumentpage._ion = RemoteObject.createNew ("Object");__ref.setField("_ion",scandocumentpage._ion);
 //BA.debugLineNum = 20;BA.debugLine="Private ScanDocumentButton As Panel";
scandocumentpage._scandocumentbutton = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_scandocumentbutton",scandocumentpage._scandocumentbutton);
 //BA.debugLineNum = 21;BA.debugLine="Private DocumentPropertiesButton As Panel";
scandocumentpage._documentpropertiesbutton = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_documentpropertiesbutton",scandocumentpage._documentpropertiesbutton);
 //BA.debugLineNum = 22;BA.debugLine="Private SaveDocumentButton As Panel";
scandocumentpage._savedocumentbutton = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_savedocumentbutton",scandocumentpage._savedocumentbutton);
 //BA.debugLineNum = 23;BA.debugLine="Private scanView As B4XView";
scandocumentpage._scanview = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_scanview",scandocumentpage._scanview);
 //BA.debugLineNum = 24;BA.debugLine="Private PropertiesPanel As Panel";
scandocumentpage._propertiespanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_propertiespanel",scandocumentpage._propertiespanel);
 //BA.debugLineNum = 25;BA.debugLine="Private ScrollViewProperties As ScrollView";
scandocumentpage._scrollviewproperties = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");__ref.setField("_scrollviewproperties",scandocumentpage._scrollviewproperties);
 //BA.debugLineNum = 27;BA.debugLine="Private OpenGalleryButton As Panel";
scandocumentpage._opengallerybutton = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_opengallerybutton",scandocumentpage._opengallerybutton);
 //BA.debugLineNum = 28;BA.debugLine="Private docID As EditText";
scandocumentpage._docid = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_docid",scandocumentpage._docid);
 //BA.debugLineNum = 29;BA.debugLine="Private docName As EditText";
scandocumentpage._docname = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_docname",scandocumentpage._docname);
 //BA.debugLineNum = 30;BA.debugLine="Private docType As EditText";
scandocumentpage._doctype = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_doctype",scandocumentpage._doctype);
 //BA.debugLineNum = 31;BA.debugLine="Private docExpiry As EditText";
scandocumentpage._docexpiry = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_docexpiry",scandocumentpage._docexpiry);
 //BA.debugLineNum = 32;BA.debugLine="Private SavePropertiesButton As Panel";
scandocumentpage._savepropertiesbutton = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_savepropertiesbutton",scandocumentpage._savepropertiesbutton);
 //BA.debugLineNum = 34;BA.debugLine="Dim documentID As String";
scandocumentpage._documentid = RemoteObject.createImmutable("");__ref.setField("_documentid",scandocumentpage._documentid);
 //BA.debugLineNum = 35;BA.debugLine="Dim documentName As String";
scandocumentpage._documentname = RemoteObject.createImmutable("");__ref.setField("_documentname",scandocumentpage._documentname);
 //BA.debugLineNum = 36;BA.debugLine="Dim documentType As String";
scandocumentpage._documenttype = RemoteObject.createImmutable("");__ref.setField("_documenttype",scandocumentpage._documenttype);
 //BA.debugLineNum = 37;BA.debugLine="Dim documentExpiry As String";
scandocumentpage._documentexpiry = RemoteObject.createImmutable("");__ref.setField("_documentexpiry",scandocumentpage._documentexpiry);
 //BA.debugLineNum = 40;BA.debugLine="Dim bitMap As B4XBitmap";
scandocumentpage._bitmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");__ref.setField("_bitmap",scandocumentpage._bitmap);
 //BA.debugLineNum = 41;BA.debugLine="Dim stringUtils As StringUtils";
scandocumentpage._stringutils = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");__ref.setField("_stringutils",scandocumentpage._stringutils);
 //BA.debugLineNum = 42;BA.debugLine="Dim Buffer() As Byte";
scandocumentpage._buffer = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});__ref.setField("_buffer",scandocumentpage._buffer);
 //BA.debugLineNum = 43;BA.debugLine="Dim outputStream As OutputStream";
scandocumentpage._outputstream = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");__ref.setField("_outputstream",scandocumentpage._outputstream);
 //BA.debugLineNum = 44;BA.debugLine="Dim imgStr As String";
scandocumentpage._imgstr = RemoteObject.createImmutable("");__ref.setField("_imgstr",scandocumentpage._imgstr);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _documentpropertiesbutton_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DocumentPropertiesButton_Click (scandocumentpage) ","scandocumentpage",2,__ref.getField(false, "ba"),__ref,177);
if (RapidSub.canDelegate("documentpropertiesbutton_click")) { return __ref.runUserSub(false, "scandocumentpage","documentpropertiesbutton_click", __ref);}
 BA.debugLineNum = 177;BA.debugLine="Private Sub DocumentPropertiesButton_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 178;BA.debugLine="If PropertiesPanel.Visible == False Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_propertiespanel" /*RemoteObject*/ ).runMethod(true,"getVisible"),scandocumentpage.__c.getField(true,"False"))) { 
 BA.debugLineNum = 179;BA.debugLine="PropertiesPanel.Visible = True";
Debug.ShouldStop(262144);
__ref.getField(false,"_propertiespanel" /*RemoteObject*/ ).runMethod(true,"setVisible",scandocumentpage.__c.getField(true,"True"));
 BA.debugLineNum = 180;BA.debugLine="ScrollViewProperties.Panel.LoadLayout(\"propertie";
Debug.ShouldStop(524288);
__ref.getField(false,"_scrollviewproperties" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("properties_panel")),__ref.getField(false, "ba"));
 }else {
 BA.debugLineNum = 182;BA.debugLine="PropertiesPanel.Visible = False";
Debug.ShouldStop(2097152);
__ref.getField(false,"_propertiespanel" /*RemoteObject*/ ).runMethod(true,"setVisible",scandocumentpage.__c.getField(true,"False"));
 };
 BA.debugLineNum = 184;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _image_chooser_result(RemoteObject __ref,RemoteObject _success,RemoteObject _pdir,RemoteObject _pfilename) throws Exception{
try {
		Debug.PushSubsStack("image_chooser_Result (scandocumentpage) ","scandocumentpage",2,__ref.getField(false, "ba"),__ref,132);
if (RapidSub.canDelegate("image_chooser_result")) { return __ref.runUserSub(false, "scandocumentpage","image_chooser_result", __ref, _success, _pdir, _pfilename);}
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
Debug.locals.put("Success", _success);
Debug.locals.put("pDir", _pdir);
Debug.locals.put("pFileName", _pfilename);
 BA.debugLineNum = 132;BA.debugLine="Sub image_chooser_Result (Success As Boolean, pDir";
Debug.ShouldStop(8);
 BA.debugLineNum = 134;BA.debugLine="Log(\"execute Chooser_Result\")";
Debug.ShouldStop(32);
scandocumentpage.__c.runVoidMethod ("LogImpl","71376258",RemoteObject.createImmutable("execute Chooser_Result"),0);
 BA.debugLineNum = 135;BA.debugLine="If Success = True Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_success,scandocumentpage.__c.getField(true,"True"))) { 
 BA.debugLineNum = 136;BA.debugLine="Log(\"fileDir: \" & pDir)";
Debug.ShouldStop(128);
scandocumentpage.__c.runVoidMethod ("LogImpl","71376260",RemoteObject.concat(RemoteObject.createImmutable("fileDir: "),_pdir),0);
 BA.debugLineNum = 137;BA.debugLine="Log(\"fileName: \" & pFileName)";
Debug.ShouldStop(256);
scandocumentpage.__c.runVoidMethod ("LogImpl","71376261",RemoteObject.concat(RemoteObject.createImmutable("fileName: "),_pfilename),0);
 BA.debugLineNum = 139;BA.debugLine="Dim bmp As B4XBitmap";
Debug.ShouldStop(1024);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 140;BA.debugLine="Try";
Debug.ShouldStop(2048);
try { BA.debugLineNum = 141;BA.debugLine="bmp = LoadBitmapSample(pDir,pFileName, Max(scan";
Debug.ShouldStop(4096);
_bmp = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), scandocumentpage.__c.runMethod(false,"LoadBitmapSample",(Object)(_pdir),(Object)(_pfilename),(Object)(BA.numberCast(int.class, scandocumentpage.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, __ref.getField(false,"_scanview" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_scanview" /*RemoteObject*/ ).runMethod(true,"getHeight")))))),(Object)(BA.numberCast(int.class, scandocumentpage.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, __ref.getField(false,"_scanview" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_scanview" /*RemoteObject*/ ).runMethod(true,"getHeight"))))))).getObject());
 BA.debugLineNum = 142;BA.debugLine="bmp = bmp.Resize(scanView.Width, scanView.Heigh";
Debug.ShouldStop(8192);
_bmp = _bmp.runMethod(false,"Resize",(Object)(__ref.getField(false,"_scanview" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_scanview" /*RemoteObject*/ ).runMethod(true,"getHeight")),(Object)(scandocumentpage.__c.getField(true,"True")));Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 143;BA.debugLine="scanView.Visible = True";
Debug.ShouldStop(16384);
__ref.getField(false,"_scanview" /*RemoteObject*/ ).runMethod(true,"setVisible",scandocumentpage.__c.getField(true,"True"));
 BA.debugLineNum = 144;BA.debugLine="scanView.SetBitmap(bmp)";
Debug.ShouldStop(32768);
__ref.getField(false,"_scanview" /*RemoteObject*/ ).runVoidMethod ("SetBitmap",(Object)((_bmp.getObject())));
 BA.debugLineNum = 145;BA.debugLine="bitMap = bmp";
Debug.ShouldStop(65536);
__ref.setField ("_bitmap" /*RemoteObject*/ ,_bmp);
 BA.debugLineNum = 146;BA.debugLine="Log(\"success read image file\")";
Debug.ShouldStop(131072);
scandocumentpage.__c.runVoidMethod ("LogImpl","71376270",RemoteObject.createImmutable("success read image file"),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e14) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e14.toString()); BA.debugLineNum = 148;BA.debugLine="Log(LastException)";
Debug.ShouldStop(524288);
scandocumentpage.__c.runVoidMethod ("LogImpl","71376272",BA.ObjectToString(scandocumentpage.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 }else {
 BA.debugLineNum = 151;BA.debugLine="ToastMessageShow(\"failed read image file\",True)";
Debug.ShouldStop(4194304);
scandocumentpage.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("failed read image file")),(Object)(scandocumentpage.__c.getField(true,"True")));
 };
 BA.debugLineNum = 153;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("Initialize (scandocumentpage) ","scandocumentpage",2,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "scandocumentpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 48;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="Return Me";
Debug.ShouldStop(65536);
if (true) return __ref;
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("lblBack_Click (scandocumentpage) ","scandocumentpage",2,__ref.getField(false, "ba"),__ref,69);
if (RapidSub.canDelegate("lblback_click")) { return __ref.runUserSub(false, "scandocumentpage","lblback_click", __ref);}
 BA.debugLineNum = 69;BA.debugLine="Sub lblBack_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="B4XPages.ClosePage(Me)";
Debug.ShouldStop(32);
scandocumentpage._b4xpages.runVoidMethod ("_closepage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref));
 BA.debugLineNum = 71;BA.debugLine="scanView.SetBitmap(Null)";
Debug.ShouldStop(64);
__ref.getField(false,"_scanview" /*RemoteObject*/ ).runVoidMethod ("SetBitmap",(Object)((scandocumentpage.__c.getField(false,"Null"))));
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
public static RemoteObject  _opengallerybutton_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("OpenGalleryButton_Click (scandocumentpage) ","scandocumentpage",2,__ref.getField(false, "ba"),__ref,210);
if (RapidSub.canDelegate("opengallerybutton_click")) { return __ref.runUserSub(false, "scandocumentpage","opengallerybutton_click", __ref);}
 BA.debugLineNum = 210;BA.debugLine="Private Sub OpenGalleryButton_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 211;BA.debugLine="Log(\"clicked OpenGalleryButton\")";
Debug.ShouldStop(262144);
scandocumentpage.__c.runVoidMethod ("LogImpl","71638401",RemoteObject.createImmutable("clicked OpenGalleryButton"),0);
 BA.debugLineNum = 212;BA.debugLine="Chooser.Initialize(\"image_chooser\")";
Debug.ShouldStop(524288);
__ref.getField(false,"_chooser" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("image_chooser")));
 BA.debugLineNum = 213;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_READ_EXTERNAL_ST";
Debug.ShouldStop(1048576);
__ref.getField(false,"_rp" /*RemoteObject*/ ).runVoidMethod ("CheckAndRequest",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_rp" /*RemoteObject*/ ).getField(true,"PERMISSION_READ_EXTERNAL_STORAGE")));
 BA.debugLineNum = 214;BA.debugLine="Chooser.Show(\"image/*\", \"choose image\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_chooser" /*RemoteObject*/ ).runVoidMethod ("Show",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("image/*")),(Object)(RemoteObject.createImmutable("choose image")));
 BA.debugLineNum = 215;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _saveblob(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("saveBlob (scandocumentpage) ","scandocumentpage",2,__ref.getField(false, "ba"),__ref,217);
if (RapidSub.canDelegate("saveblob")) { return __ref.runUserSub(false, "scandocumentpage","saveblob", __ref);}
 BA.debugLineNum = 217;BA.debugLine="Sub saveBlob";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 218;BA.debugLine="outputStream.InitializeToBytesArray(0)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_outputstream" /*RemoteObject*/ ).runVoidMethod ("InitializeToBytesArray",(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 219;BA.debugLine="bitMap.WriteToStream(outputStream,100,\"JPEG\")";
Debug.ShouldStop(67108864);
__ref.getField(false,"_bitmap" /*RemoteObject*/ ).runVoidMethod ("WriteToStream",(Object)((__ref.getField(false,"_outputstream" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 100)),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Bitmap.CompressFormat"),RemoteObject.createImmutable("JPEG"))));
 BA.debugLineNum = 220;BA.debugLine="outputStream.Close";
Debug.ShouldStop(134217728);
__ref.getField(false,"_outputstream" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 221;BA.debugLine="Buffer = outputStream.ToBytesArray";
Debug.ShouldStop(268435456);
__ref.setField ("_buffer" /*RemoteObject*/ ,__ref.getField(false,"_outputstream" /*RemoteObject*/ ).runMethod(false,"ToBytesArray"));
 BA.debugLineNum = 222;BA.debugLine="imgStr = stringUtils.EncodeBase64(Buffer)";
Debug.ShouldStop(536870912);
__ref.setField ("_imgstr" /*RemoteObject*/ ,__ref.getField(false,"_stringutils" /*RemoteObject*/ ).runMethod(true,"EncodeBase64",(Object)(__ref.getField(false,"_buffer" /*RemoteObject*/ ))));
 BA.debugLineNum = 223;BA.debugLine="Log(imgStr)";
Debug.ShouldStop(1073741824);
scandocumentpage.__c.runVoidMethod ("LogImpl","71703942",__ref.getField(true,"_imgstr" /*RemoteObject*/ ),0);
 BA.debugLineNum = 224;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _savedocumentbutton_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SaveDocumentButton_Click (scandocumentpage) ","scandocumentpage",2,__ref.getField(false, "ba"),__ref,226);
if (RapidSub.canDelegate("savedocumentbutton_click")) { return __ref.runUserSub(false, "scandocumentpage","savedocumentbutton_click", __ref);}
 BA.debugLineNum = 226;BA.debugLine="Private Sub SaveDocumentButton_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 228;BA.debugLine="If documentName=\"\" Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_documentname" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 229;BA.debugLine="MsgboxAsync(\"Please insert document name propert";
Debug.ShouldStop(16);
scandocumentpage.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Please insert document name properties")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Info"))),__ref.getField(false, "ba"));
 BA.debugLineNum = 230;BA.debugLine="Return";
Debug.ShouldStop(32);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 232;BA.debugLine="If documentType=\"\" Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_documenttype" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 233;BA.debugLine="MsgboxAsync(\"Please insert document type propert";
Debug.ShouldStop(256);
scandocumentpage.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Please insert document type properties")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Info"))),__ref.getField(false, "ba"));
 BA.debugLineNum = 234;BA.debugLine="Return";
Debug.ShouldStop(512);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 237;BA.debugLine="saveBlob";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4a.example.scandocumentpage.class, "_saveblob" /*RemoteObject*/ );
 BA.debugLineNum = 239;BA.debugLine="MdlConnection.dbSQL.ExecNonQuery(\"INSERT INTO doc";
Debug.ShouldStop(16384);
scandocumentpage._mdlconnection._dbsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO documents(DOCUMENT_ID, NAME, TYPE, EXPIRED, SCAN) VALUES('"),__ref.getField(true,"_documentid" /*RemoteObject*/ ),RemoteObject.createImmutable("','"),__ref.getField(true,"_documentname" /*RemoteObject*/ ),RemoteObject.createImmutable("','"),__ref.getField(true,"_documenttype" /*RemoteObject*/ ),RemoteObject.createImmutable("','"),__ref.getField(true,"_documentexpiry" /*RemoteObject*/ ),RemoteObject.createImmutable("','"),__ref.getField(true,"_imgstr" /*RemoteObject*/ ),RemoteObject.createImmutable("')"))));
 BA.debugLineNum = 240;BA.debugLine="ToastMessageShow(\"sucessfully saved document\",Fal";
Debug.ShouldStop(32768);
scandocumentpage.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("sucessfully saved document")),(Object)(scandocumentpage.__c.getField(true,"False")));
 BA.debugLineNum = 241;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _savepropertiesbutton_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SavePropertiesButton_Click (scandocumentpage) ","scandocumentpage",2,__ref.getField(false, "ba"),__ref,186);
if (RapidSub.canDelegate("savepropertiesbutton_click")) { return __ref.runUserSub(false, "scandocumentpage","savepropertiesbutton_click", __ref);}
 BA.debugLineNum = 186;BA.debugLine="Private Sub SavePropertiesButton_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 188;BA.debugLine="If docName.Text=\"\" Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_docname" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 189;BA.debugLine="MsgboxAsync(\"Please insert document name\",\"Info\"";
Debug.ShouldStop(268435456);
scandocumentpage.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Please insert document name")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Info"))),__ref.getField(false, "ba"));
 BA.debugLineNum = 190;BA.debugLine="Return";
Debug.ShouldStop(536870912);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 192;BA.debugLine="If docType.Text=\"\" Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_doctype" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 193;BA.debugLine="MsgboxAsync(\"Please insert document type\", \"Info";
Debug.ShouldStop(1);
scandocumentpage.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Please insert document type")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Info"))),__ref.getField(false, "ba"));
 BA.debugLineNum = 194;BA.debugLine="Return";
Debug.ShouldStop(2);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 197;BA.debugLine="documentID = docID.Text";
Debug.ShouldStop(16);
__ref.setField ("_documentid" /*RemoteObject*/ ,__ref.getField(false,"_docid" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 198;BA.debugLine="documentName = docName.Text";
Debug.ShouldStop(32);
__ref.setField ("_documentname" /*RemoteObject*/ ,__ref.getField(false,"_docname" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 199;BA.debugLine="documentType = docType.Text";
Debug.ShouldStop(64);
__ref.setField ("_documenttype" /*RemoteObject*/ ,__ref.getField(false,"_doctype" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 200;BA.debugLine="documentExpiry = docExpiry.Text";
Debug.ShouldStop(128);
__ref.setField ("_documentexpiry" /*RemoteObject*/ ,__ref.getField(false,"_docexpiry" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 202;BA.debugLine="ToastMessageShow(\"properties saved\", False)";
Debug.ShouldStop(512);
scandocumentpage.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("properties saved")),(Object)(scandocumentpage.__c.getField(true,"False")));
 BA.debugLineNum = 203;BA.debugLine="Log(documentID)";
Debug.ShouldStop(1024);
scandocumentpage.__c.runVoidMethod ("LogImpl","71572881",__ref.getField(true,"_documentid" /*RemoteObject*/ ),0);
 BA.debugLineNum = 204;BA.debugLine="Log(documentName)";
Debug.ShouldStop(2048);
scandocumentpage.__c.runVoidMethod ("LogImpl","71572882",__ref.getField(true,"_documentname" /*RemoteObject*/ ),0);
 BA.debugLineNum = 206;BA.debugLine="PropertiesPanel.Visible=False";
Debug.ShouldStop(8192);
__ref.getField(false,"_propertiespanel" /*RemoteObject*/ ).runMethod(true,"setVisible",scandocumentpage.__c.getField(true,"False"));
 BA.debugLineNum = 207;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _scandocumentbutton_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ScanDocumentButton_Click (scandocumentpage) ","scandocumentpage",2,__ref.getField(false, "ba"),__ref,75);
if (RapidSub.canDelegate("scandocumentbutton_click")) { __ref.runUserSub(false, "scandocumentpage","scandocumentbutton_click", __ref); return;}
ResumableSub_ScanDocumentButton_Click rsub = new ResumableSub_ScanDocumentButton_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ScanDocumentButton_Click extends BA.ResumableSub {
public ResumableSub_ScanDocumentButton_Click(b4a.example.scandocumentpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.scandocumentpage parent;
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ScanDocumentButton_Click (scandocumentpage) ","scandocumentpage",2,__ref.getField(false, "ba"),__ref,75);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 76;BA.debugLine="TakePicture (scanView.Width, scanView.Height)";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4a.example.scandocumentpage.class, "_takepicture" /*void*/ ,(Object)(__ref.getField(false,"_scanview" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_scanview" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 77;BA.debugLine="Wait For Image_Available(Success As Boolean, bmp";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","image_available", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "scandocumentpage", "scandocumentbutton_click"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
_bmp = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(2));Debug.locals.put("bmp", _bmp);
;
 BA.debugLineNum = 78;BA.debugLine="If Success Then";
Debug.ShouldStop(8192);
if (true) break;

case 1:
//if
this.state = 4;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 79;BA.debugLine="PropertiesPanel.Visible = False";
Debug.ShouldStop(16384);
__ref.getField(false,"_propertiespanel" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 BA.debugLineNum = 80;BA.debugLine="scanView.Visible=True";
Debug.ShouldStop(32768);
__ref.getField(false,"_scanview" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"True"));
 BA.debugLineNum = 81;BA.debugLine="scanView.SetBitmap(bmp)";
Debug.ShouldStop(65536);
__ref.getField(false,"_scanview" /*RemoteObject*/ ).runVoidMethod ("SetBitmap",(Object)((_bmp.getObject())));
 BA.debugLineNum = 82;BA.debugLine="bitMap = bmp";
Debug.ShouldStop(131072);
__ref.setField ("_bitmap" /*RemoteObject*/ ,_bmp);
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 84;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _image_available(RemoteObject __ref,RemoteObject _success,RemoteObject _bmp) throws Exception{
}
public static RemoteObject  _startactivityforresult(RemoteObject __ref,RemoteObject _i) throws Exception{
try {
		Debug.PushSubsStack("StartActivityForResult (scandocumentpage) ","scandocumentpage",2,__ref.getField(false, "ba"),__ref,155);
if (RapidSub.canDelegate("startactivityforresult")) { return __ref.runUserSub(false, "scandocumentpage","startactivityforresult", __ref, _i);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("i", _i);
 BA.debugLineNum = 155;BA.debugLine="Sub StartActivityForResult(i As Intent)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 156;BA.debugLine="Dim jo As JavaObject = Me";
Debug.ShouldStop(134217728);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 157;BA.debugLine="jo = jo.RunMethod(\"getBA\", Null)";
Debug.ShouldStop(268435456);
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getBA")),(Object)((scandocumentpage.__c.getField(false,"Null")))));
 BA.debugLineNum = 158;BA.debugLine="ion = jo.CreateEvent(\"anywheresoftware.b4a.IOnAct";
Debug.ShouldStop(536870912);
__ref.setField ("_ion" /*RemoteObject*/ ,_jo.runMethod(false,"CreateEvent",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("anywheresoftware.b4a.IOnActivityResult")),(Object)(BA.ObjectToString("ion")),(Object)(scandocumentpage.__c.getField(false,"Null"))));
 BA.debugLineNum = 159;BA.debugLine="jo.RunMethod(\"startActivityForResult\", Array(ion,";
Debug.ShouldStop(1073741824);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("startActivityForResult")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {__ref.getField(false,"_ion" /*RemoteObject*/ ),(_i.getObject())})));
 BA.debugLineNum = 160;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _takepicture(RemoteObject __ref,RemoteObject _targetwidth,RemoteObject _targetheight) throws Exception{
try {
		Debug.PushSubsStack("TakePicture (scandocumentpage) ","scandocumentpage",2,__ref.getField(false, "ba"),__ref,87);
if (RapidSub.canDelegate("takepicture")) { __ref.runUserSub(false, "scandocumentpage","takepicture", __ref, _targetwidth, _targetheight); return;}
ResumableSub_TakePicture rsub = new ResumableSub_TakePicture(null,__ref,_targetwidth,_targetheight);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_TakePicture extends BA.ResumableSub {
public ResumableSub_TakePicture(b4a.example.scandocumentpage parent,RemoteObject __ref,RemoteObject _targetwidth,RemoteObject _targetheight) {
this.parent = parent;
this.__ref = __ref;
this._targetwidth = _targetwidth;
this._targetheight = _targetheight;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.scandocumentpage parent;
RemoteObject _targetwidth;
RemoteObject _targetheight;
RemoteObject _i = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
RemoteObject _u = RemoteObject.declareNull("Object");
RemoteObject _methodname = RemoteObject.createImmutable("");
RemoteObject _args = null;
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject _in = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
RemoteObject _exif = RemoteObject.declareNull("anywheresoftware.b4a.agraham.jpegutils.ExifUtils");
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("TakePicture (scandocumentpage) ","scandocumentpage",2,__ref.getField(false, "ba"),__ref,87);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("TargetWidth", _targetwidth);
Debug.locals.put("TargetHeight", _targetheight);
 BA.debugLineNum = 89;BA.debugLine="Dim i As Intent";
Debug.ShouldStop(16777216);
_i = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("i", _i);
 BA.debugLineNum = 90;BA.debugLine="i.Initialize(\"android.media.action.IMAGE_CAPTURE\"";
Debug.ShouldStop(33554432);
_i.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("android.media.action.IMAGE_CAPTURE")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 91;BA.debugLine="File.Delete(Provider.SharedFolder, tempImageFile)";
Debug.ShouldStop(67108864);
parent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(__ref.getField(false,"_provider" /*RemoteObject*/ ).getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_tempimagefile" /*RemoteObject*/ )));
 BA.debugLineNum = 92;BA.debugLine="Dim u As Object = Provider.GetFileUri(tempImageFi";
Debug.ShouldStop(134217728);
_u = __ref.getField(false,"_provider" /*RemoteObject*/ ).runClassMethod (b4a.example.fileprovider.class, "_getfileuri" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_tempimagefile" /*RemoteObject*/ )));Debug.locals.put("u", _u);Debug.locals.put("u", _u);
 BA.debugLineNum = 93;BA.debugLine="i.PutExtra(\"output\", u) 'the image will be saved";
Debug.ShouldStop(268435456);
_i.runVoidMethod ("PutExtra",(Object)(BA.ObjectToString("output")),(Object)(_u));
 BA.debugLineNum = 94;BA.debugLine="Try";
Debug.ShouldStop(536870912);
if (true) break;

case 1:
//try
this.state = 30;
this.catchState = 29;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 29;
 BA.debugLineNum = 95;BA.debugLine="StartActivityForResult(i)";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4a.example.scandocumentpage.class, "_startactivityforresult" /*RemoteObject*/ ,(Object)(_i));
 BA.debugLineNum = 96;BA.debugLine="Wait For ion_Event (MethodName As String, Args()";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","ion_event", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "scandocumentpage", "takepicture"), null);
this.state = 31;
return;
case 31:
//C
this.state = 4;
_methodname = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("MethodName", _methodname);
_args = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(2));Debug.locals.put("Args", _args);
;
 BA.debugLineNum = 97;BA.debugLine="Dim bmp As B4XBitmap";
Debug.ShouldStop(1);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 98;BA.debugLine="If -1 = Args(0) Then";
Debug.ShouldStop(2);
if (true) break;

case 4:
//if
this.state = 27;
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(-(double) (0 + 1)),BA.numberCast(double.class, _args.getArrayElement(false,BA.numberCast(int.class, 0))))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 99;BA.debugLine="Try";
Debug.ShouldStop(4);
if (true) break;

case 7:
//try
this.state = 26;
this.catchState = 25;
this.state = 9;
if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 25;
 BA.debugLineNum = 100;BA.debugLine="Dim in As Intent = Args(1)";
Debug.ShouldStop(8);
_in = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");
_in = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.IntentWrapper"), _args.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("in", _in);
 BA.debugLineNum = 101;BA.debugLine="If File.Exists(Provider.SharedFolder, tempImag";
Debug.ShouldStop(16);
if (true) break;

case 10:
//if
this.state = 23;
if (parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(__ref.getField(false,"_provider" /*RemoteObject*/ ).getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_tempimagefile" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
this.state = 12;
}else 
{ BA.debugLineNum = 115;BA.debugLine="Else If in.HasExtra(\"data\") Then 'try to get t";
Debug.ShouldStop(262144);
if (_in.runMethod(true,"HasExtra",(Object)(RemoteObject.createImmutable("data"))).<Boolean>get().booleanValue()) { 
this.state = 22;
}}
if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 102;BA.debugLine="Dim Exif As ExifData";
Debug.ShouldStop(32);
_exif = RemoteObject.createNew ("anywheresoftware.b4a.agraham.jpegutils.ExifUtils");Debug.locals.put("Exif", _exif);
 BA.debugLineNum = 103;BA.debugLine="Exif.Initialize(Provider.SharedFolder, tempIm";
Debug.ShouldStop(64);
_exif.runVoidMethod ("Initialize",(Object)(__ref.getField(false,"_provider" /*RemoteObject*/ ).getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_tempimagefile" /*RemoteObject*/ )));
 BA.debugLineNum = 104;BA.debugLine="bmp = LoadBitmapSample(Provider.SharedFolder,";
Debug.ShouldStop(128);
_bmp = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), parent.__c.runMethod(false,"LoadBitmapSample",(Object)(__ref.getField(false,"_provider" /*RemoteObject*/ ).getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_tempimagefile" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, parent.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, _targetwidth)),(Object)(BA.numberCast(double.class, _targetheight))))),(Object)(BA.numberCast(int.class, parent.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, _targetwidth)),(Object)(BA.numberCast(double.class, _targetheight)))))).getObject());
 BA.debugLineNum = 105;BA.debugLine="Log(\"Orientation: \" & Exif.getAttribute(Exif.";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("LogImpl","71310738",RemoteObject.concat(RemoteObject.createImmutable("Orientation: "),_exif.runMethod(true,"getAttribute",(Object)(_exif.getField(true,"TAG_ORIENTATION")))),0);
 BA.debugLineNum = 106;BA.debugLine="Select Exif.getAttribute(Exif.TAG_ORIENTATION";
Debug.ShouldStop(512);
if (true) break;

case 13:
//select
this.state = 20;
switch (BA.switchObjectToInt(_exif.runMethod(true,"getAttribute",(Object)(_exif.getField(true,"TAG_ORIENTATION"))),BA.NumberToString(_exif.getField(true,"ORIENTATION_ROTATE_180")),BA.NumberToString(_exif.getField(true,"ORIENTATION_ROTATE_90")),BA.NumberToString(_exif.getField(true,"ORIENTATION_ROTATE_270")))) {
case 0: {
this.state = 15;
if (true) break;
}
case 1: {
this.state = 17;
if (true) break;
}
case 2: {
this.state = 19;
if (true) break;
}
}
if (true) break;

case 15:
//C
this.state = 20;
 BA.debugLineNum = 108;BA.debugLine="bmp = bmp.Rotate(180)";
Debug.ShouldStop(2048);
_bmp = _bmp.runMethod(false,"Rotate",(Object)(BA.numberCast(int.class, 180)));Debug.locals.put("bmp", _bmp);
 if (true) break;

case 17:
//C
this.state = 20;
 BA.debugLineNum = 110;BA.debugLine="bmp = bmp.Rotate(90)";
Debug.ShouldStop(8192);
_bmp = _bmp.runMethod(false,"Rotate",(Object)(BA.numberCast(int.class, 90)));Debug.locals.put("bmp", _bmp);
 if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 112;BA.debugLine="bmp = bmp.Rotate(270)";
Debug.ShouldStop(32768);
_bmp = _bmp.runMethod(false,"Rotate",(Object)(BA.numberCast(int.class, 270)));Debug.locals.put("bmp", _bmp);
 if (true) break;

case 20:
//C
this.state = 23;
;
 BA.debugLineNum = 114;BA.debugLine="bmp = bmp.Resize(TargetWidth, TargetHeight, T";
Debug.ShouldStop(131072);
_bmp = _bmp.runMethod(false,"Resize",(Object)(_targetwidth),(Object)(_targetheight),(Object)(parent.__c.getField(true,"True")));Debug.locals.put("bmp", _bmp);
 if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 116;BA.debugLine="Dim jo As JavaObject = in";
Debug.ShouldStop(524288);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _in.getObject());Debug.locals.put("jo", _jo);
 BA.debugLineNum = 117;BA.debugLine="bmp = jo.RunMethodJO(\"getExtras\", Null).RunMe";
Debug.ShouldStop(1048576);
_bmp = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), _jo.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getExtras")),(Object)((parent.__c.getField(false,"Null")))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("get")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("data"))}))));
 if (true) break;

case 23:
//C
this.state = 26;
;
 BA.debugLineNum = 119;BA.debugLine="bitMap = bmp";
Debug.ShouldStop(4194304);
__ref.setField ("_bitmap" /*RemoteObject*/ ,_bmp);
 Debug.CheckDeviceExceptions();
if (true) break;

case 25:
//C
this.state = 26;
this.catchState = 29;
 BA.debugLineNum = 121;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("LogImpl","71310754",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 if (true) break;
if (true) break;

case 26:
//C
this.state = 27;
this.catchState = 29;
;
 if (true) break;

case 27:
//C
this.state = 30;
;
 BA.debugLineNum = 124;BA.debugLine="CallSubDelayed3(Me, \"Image_Available\", bmp.IsIni";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("Image_Available")),(Object)((_bmp.runMethod(true,"IsInitialized"))),(Object)((_bmp)));
 Debug.CheckDeviceExceptions();
if (true) break;

case 29:
//C
this.state = 30;
this.catchState = 0;
 BA.debugLineNum = 126;BA.debugLine="ToastMessageShow(\"Camera is not available.\", Tru";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Camera is not available.")),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 127;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("LogImpl","71310760",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 128;BA.debugLine="CallSubDelayed3(Me, \"Image_Available\", False, Nu";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("Image_Available")),(Object)((parent.__c.getField(true,"False"))),(Object)(parent.__c.getField(false,"Null")));
 if (true) break;
if (true) break;

case 30:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 130;BA.debugLine="End Sub";
Debug.ShouldStop(2);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _ion_event(RemoteObject __ref,RemoteObject _methodname,RemoteObject _args) throws Exception{
}
}