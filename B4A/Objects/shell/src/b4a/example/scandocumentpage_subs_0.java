package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class scandocumentpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (scandocumentpage) ","scandocumentpage",2,__ref.getField(false, "ba"),__ref,49);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "scandocumentpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 49;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="Root = Root1";
Debug.ShouldStop(131072);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 52;BA.debugLine="Root.LoadLayout(\"Header\")";
Debug.ShouldStop(524288);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("Header")),__ref.getField(false, "ba"));
 BA.debugLineNum = 53;BA.debugLine="lblBack.Visible=True";
Debug.ShouldStop(1048576);
__ref.getField(false,"_lblback" /*RemoteObject*/ ).runMethod(true,"setVisible",scandocumentpage.__c.getField(true,"True"));
 BA.debugLineNum = 54;BA.debugLine="Panel1.LoadLayout(\"scandocument\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_panel1" /*RemoteObject*/ ).runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("scandocument")),__ref.getField(false, "ba"));
 BA.debugLineNum = 55;BA.debugLine="scanView.Visible=False";
Debug.ShouldStop(4194304);
__ref.getField(false,"_scanview" /*RemoteObject*/ ).runMethod(true,"setVisible",scandocumentpage.__c.getField(true,"False"));
 BA.debugLineNum = 56;BA.debugLine="PropertiesPanel.Visible = False";
Debug.ShouldStop(8388608);
__ref.getField(false,"_propertiespanel" /*RemoteObject*/ ).runMethod(true,"setVisible",scandocumentpage.__c.getField(true,"False"));
 BA.debugLineNum = 58;BA.debugLine="Provider.Initialize";
Debug.ShouldStop(33554432);
__ref.getField(false,"_provider" /*RemoteObject*/ ).runClassMethod (b4a.example.fileprovider.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
 //BA.debugLineNum = 9;BA.debugLine="Private tempImageFile As String = \"tempimage.jpg\"";
scandocumentpage._tempimagefile = BA.ObjectToString("tempimage.jpg");__ref.setField("_tempimagefile",scandocumentpage._tempimagefile);
 //BA.debugLineNum = 10;BA.debugLine="Private Provider As FileProvider";
scandocumentpage._provider = RemoteObject.createNew ("b4a.example.fileprovider");__ref.setField("_provider",scandocumentpage._provider);
 //BA.debugLineNum = 11;BA.debugLine="Private ion As Object";
scandocumentpage._ion = RemoteObject.createNew ("Object");__ref.setField("_ion",scandocumentpage._ion);
 //BA.debugLineNum = 16;BA.debugLine="Private ScanDocumentButton As Panel";
scandocumentpage._scandocumentbutton = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_scandocumentbutton",scandocumentpage._scandocumentbutton);
 //BA.debugLineNum = 17;BA.debugLine="Private DocumentPropertiesButton As Panel";
scandocumentpage._documentpropertiesbutton = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_documentpropertiesbutton",scandocumentpage._documentpropertiesbutton);
 //BA.debugLineNum = 18;BA.debugLine="Private SaveDocumentButton As Panel";
scandocumentpage._savedocumentbutton = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_savedocumentbutton",scandocumentpage._savedocumentbutton);
 //BA.debugLineNum = 19;BA.debugLine="Private scanView As B4XView";
scandocumentpage._scanview = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_scanview",scandocumentpage._scanview);
 //BA.debugLineNum = 20;BA.debugLine="Private PropertiesPanel As Panel";
scandocumentpage._propertiespanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_propertiespanel",scandocumentpage._propertiespanel);
 //BA.debugLineNum = 21;BA.debugLine="Private ScrollViewProperties As ScrollView";
scandocumentpage._scrollviewproperties = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");__ref.setField("_scrollviewproperties",scandocumentpage._scrollviewproperties);
 //BA.debugLineNum = 23;BA.debugLine="Private OpenGalleryButton As Panel";
scandocumentpage._opengallerybutton = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_opengallerybutton",scandocumentpage._opengallerybutton);
 //BA.debugLineNum = 24;BA.debugLine="Private docID As EditText";
scandocumentpage._docid = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_docid",scandocumentpage._docid);
 //BA.debugLineNum = 25;BA.debugLine="Private docName As EditText";
scandocumentpage._docname = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_docname",scandocumentpage._docname);
 //BA.debugLineNum = 26;BA.debugLine="Private docType As EditText";
scandocumentpage._doctype = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_doctype",scandocumentpage._doctype);
 //BA.debugLineNum = 27;BA.debugLine="Private docExpiry As EditText";
scandocumentpage._docexpiry = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_docexpiry",scandocumentpage._docexpiry);
 //BA.debugLineNum = 28;BA.debugLine="Private SavePropertiesButton As Panel";
scandocumentpage._savepropertiesbutton = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_savepropertiesbutton",scandocumentpage._savepropertiesbutton);
 //BA.debugLineNum = 30;BA.debugLine="Dim documentID As String";
scandocumentpage._documentid = RemoteObject.createImmutable("");__ref.setField("_documentid",scandocumentpage._documentid);
 //BA.debugLineNum = 31;BA.debugLine="Dim documentName As String";
scandocumentpage._documentname = RemoteObject.createImmutable("");__ref.setField("_documentname",scandocumentpage._documentname);
 //BA.debugLineNum = 32;BA.debugLine="Dim documentType As String";
scandocumentpage._documenttype = RemoteObject.createImmutable("");__ref.setField("_documenttype",scandocumentpage._documenttype);
 //BA.debugLineNum = 33;BA.debugLine="Dim documentExpiry As String";
scandocumentpage._documentexpiry = RemoteObject.createImmutable("");__ref.setField("_documentexpiry",scandocumentpage._documentexpiry);
 //BA.debugLineNum = 36;BA.debugLine="Dim bitMap As B4XBitmap";
scandocumentpage._bitmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");__ref.setField("_bitmap",scandocumentpage._bitmap);
 //BA.debugLineNum = 37;BA.debugLine="Dim stringUtils As StringUtils";
scandocumentpage._stringutils = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");__ref.setField("_stringutils",scandocumentpage._stringutils);
 //BA.debugLineNum = 38;BA.debugLine="Dim Buffer() As Byte";
scandocumentpage._buffer = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});__ref.setField("_buffer",scandocumentpage._buffer);
 //BA.debugLineNum = 39;BA.debugLine="Dim outputStream As OutputStream";
scandocumentpage._outputstream = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");__ref.setField("_outputstream",scandocumentpage._outputstream);
 //BA.debugLineNum = 40;BA.debugLine="Dim imgStr As String";
scandocumentpage._imgstr = RemoteObject.createImmutable("");__ref.setField("_imgstr",scandocumentpage._imgstr);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _documentpropertiesbutton_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DocumentPropertiesButton_Click (scandocumentpage) ","scandocumentpage",2,__ref.getField(false, "ba"),__ref,148);
if (RapidSub.canDelegate("documentpropertiesbutton_click")) { return __ref.runUserSub(false, "scandocumentpage","documentpropertiesbutton_click", __ref);}
 BA.debugLineNum = 148;BA.debugLine="Private Sub DocumentPropertiesButton_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 149;BA.debugLine="If PropertiesPanel.Visible == False Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_propertiespanel" /*RemoteObject*/ ).runMethod(true,"getVisible"),scandocumentpage.__c.getField(true,"False"))) { 
 BA.debugLineNum = 150;BA.debugLine="PropertiesPanel.Visible = True";
Debug.ShouldStop(2097152);
__ref.getField(false,"_propertiespanel" /*RemoteObject*/ ).runMethod(true,"setVisible",scandocumentpage.__c.getField(true,"True"));
 BA.debugLineNum = 151;BA.debugLine="ScrollViewProperties.Panel.LoadLayout(\"propertie";
Debug.ShouldStop(4194304);
__ref.getField(false,"_scrollviewproperties" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("properties_panel")),__ref.getField(false, "ba"));
 }else {
 BA.debugLineNum = 153;BA.debugLine="PropertiesPanel.Visible = False";
Debug.ShouldStop(16777216);
__ref.getField(false,"_propertiespanel" /*RemoteObject*/ ).runMethod(true,"setVisible",scandocumentpage.__c.getField(true,"False"));
 };
 BA.debugLineNum = 155;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("Initialize (scandocumentpage) ","scandocumentpage",2,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "scandocumentpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 44;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="Return Me";
Debug.ShouldStop(4096);
if (true) return __ref;
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("lblBack_Click (scandocumentpage) ","scandocumentpage",2,__ref.getField(false, "ba"),__ref,65);
if (RapidSub.canDelegate("lblback_click")) { return __ref.runUserSub(false, "scandocumentpage","lblback_click", __ref);}
 BA.debugLineNum = 65;BA.debugLine="Sub lblBack_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 66;BA.debugLine="B4XPages.ClosePage(Me)";
Debug.ShouldStop(2);
scandocumentpage._b4xpages.runVoidMethod ("_closepage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref));
 BA.debugLineNum = 67;BA.debugLine="scanView.SetBitmap(Null)";
Debug.ShouldStop(4);
__ref.getField(false,"_scanview" /*RemoteObject*/ ).runVoidMethod ("SetBitmap",(Object)((scandocumentpage.__c.getField(false,"Null"))));
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("saveBlob (scandocumentpage) ","scandocumentpage",2,__ref.getField(false, "ba"),__ref,182);
if (RapidSub.canDelegate("saveblob")) { return __ref.runUserSub(false, "scandocumentpage","saveblob", __ref);}
 BA.debugLineNum = 182;BA.debugLine="Sub saveBlob";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 183;BA.debugLine="outputStream.InitializeToBytesArray(0)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_outputstream" /*RemoteObject*/ ).runVoidMethod ("InitializeToBytesArray",(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 184;BA.debugLine="bitMap.WriteToStream(outputStream,100,\"JPEG\")";
Debug.ShouldStop(8388608);
__ref.getField(false,"_bitmap" /*RemoteObject*/ ).runVoidMethod ("WriteToStream",(Object)((__ref.getField(false,"_outputstream" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 100)),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Bitmap.CompressFormat"),RemoteObject.createImmutable("JPEG"))));
 BA.debugLineNum = 185;BA.debugLine="outputStream.Close";
Debug.ShouldStop(16777216);
__ref.getField(false,"_outputstream" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 186;BA.debugLine="Buffer = outputStream.ToBytesArray";
Debug.ShouldStop(33554432);
__ref.setField ("_buffer" /*RemoteObject*/ ,__ref.getField(false,"_outputstream" /*RemoteObject*/ ).runMethod(false,"ToBytesArray"));
 BA.debugLineNum = 187;BA.debugLine="imgStr = stringUtils.EncodeBase64(Buffer)";
Debug.ShouldStop(67108864);
__ref.setField ("_imgstr" /*RemoteObject*/ ,__ref.getField(false,"_stringutils" /*RemoteObject*/ ).runMethod(true,"EncodeBase64",(Object)(__ref.getField(false,"_buffer" /*RemoteObject*/ ))));
 BA.debugLineNum = 188;BA.debugLine="Log(imgStr)";
Debug.ShouldStop(134217728);
scandocumentpage.__c.runVoidMethod ("LogImpl","81572870",__ref.getField(true,"_imgstr" /*RemoteObject*/ ),0);
 BA.debugLineNum = 189;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("SaveDocumentButton_Click (scandocumentpage) ","scandocumentpage",2,__ref.getField(false, "ba"),__ref,192);
if (RapidSub.canDelegate("savedocumentbutton_click")) { return __ref.runUserSub(false, "scandocumentpage","savedocumentbutton_click", __ref);}
 BA.debugLineNum = 192;BA.debugLine="Private Sub SaveDocumentButton_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 194;BA.debugLine="If documentName=\"\" Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_documentname" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 195;BA.debugLine="MsgboxAsync(\"Please insert document name propert";
Debug.ShouldStop(4);
scandocumentpage.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Please insert document name properties")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Info"))),__ref.getField(false, "ba"));
 BA.debugLineNum = 196;BA.debugLine="Return";
Debug.ShouldStop(8);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 198;BA.debugLine="If documentType=\"\" Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_documenttype" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 199;BA.debugLine="MsgboxAsync(\"Please insert document type propert";
Debug.ShouldStop(64);
scandocumentpage.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Please insert document type properties")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Info"))),__ref.getField(false, "ba"));
 BA.debugLineNum = 200;BA.debugLine="Return";
Debug.ShouldStop(128);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 203;BA.debugLine="saveBlob";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4a.example.scandocumentpage.class, "_saveblob" /*RemoteObject*/ );
 BA.debugLineNum = 205;BA.debugLine="MdlConnection.dbSQL.ExecNonQuery(\"INSERT INTO doc";
Debug.ShouldStop(4096);
scandocumentpage._mdlconnection._dbsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO documents(DOCUMENT_ID, NAME, TYPE, EXPIRED, SCAN) VALUES('"),__ref.getField(true,"_documentid" /*RemoteObject*/ ),RemoteObject.createImmutable("','"),__ref.getField(true,"_documentname" /*RemoteObject*/ ),RemoteObject.createImmutable("','"),__ref.getField(true,"_documenttype" /*RemoteObject*/ ),RemoteObject.createImmutable("','"),__ref.getField(true,"_documentexpiry" /*RemoteObject*/ ),RemoteObject.createImmutable("','"),__ref.getField(true,"_imgstr" /*RemoteObject*/ ),RemoteObject.createImmutable("')"))));
 BA.debugLineNum = 206;BA.debugLine="ToastMessageShow(\"sucessfully saved document\",Fal";
Debug.ShouldStop(8192);
scandocumentpage.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("sucessfully saved document")),(Object)(scandocumentpage.__c.getField(true,"False")));
 BA.debugLineNum = 208;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("SavePropertiesButton_Click (scandocumentpage) ","scandocumentpage",2,__ref.getField(false, "ba"),__ref,159);
if (RapidSub.canDelegate("savepropertiesbutton_click")) { return __ref.runUserSub(false, "scandocumentpage","savepropertiesbutton_click", __ref);}
 BA.debugLineNum = 159;BA.debugLine="Private Sub SavePropertiesButton_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 161;BA.debugLine="If docName.Text=\"\" Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_docname" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 162;BA.debugLine="MsgboxAsync(\"Please insert document name\",\"Info\"";
Debug.ShouldStop(2);
scandocumentpage.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Please insert document name")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Info"))),__ref.getField(false, "ba"));
 BA.debugLineNum = 163;BA.debugLine="Return";
Debug.ShouldStop(4);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 165;BA.debugLine="If docType.Text=\"\" Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_doctype" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 166;BA.debugLine="MsgboxAsync(\"Please insert document type\", \"Info";
Debug.ShouldStop(32);
scandocumentpage.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Please insert document type")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Info"))),__ref.getField(false, "ba"));
 BA.debugLineNum = 167;BA.debugLine="Return";
Debug.ShouldStop(64);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 170;BA.debugLine="documentID = docID.Text";
Debug.ShouldStop(512);
__ref.setField ("_documentid" /*RemoteObject*/ ,__ref.getField(false,"_docid" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 171;BA.debugLine="documentName = docName.Text";
Debug.ShouldStop(1024);
__ref.setField ("_documentname" /*RemoteObject*/ ,__ref.getField(false,"_docname" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 172;BA.debugLine="documentType = docType.Text";
Debug.ShouldStop(2048);
__ref.setField ("_documenttype" /*RemoteObject*/ ,__ref.getField(false,"_doctype" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 173;BA.debugLine="documentExpiry = docExpiry.Text";
Debug.ShouldStop(4096);
__ref.setField ("_documentexpiry" /*RemoteObject*/ ,__ref.getField(false,"_docexpiry" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 175;BA.debugLine="ToastMessageShow(\"properties saved\", False)";
Debug.ShouldStop(16384);
scandocumentpage.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("properties saved")),(Object)(scandocumentpage.__c.getField(true,"False")));
 BA.debugLineNum = 176;BA.debugLine="Log(documentID)";
Debug.ShouldStop(32768);
scandocumentpage.__c.runVoidMethod ("LogImpl","81507345",__ref.getField(true,"_documentid" /*RemoteObject*/ ),0);
 BA.debugLineNum = 177;BA.debugLine="Log(documentName)";
Debug.ShouldStop(65536);
scandocumentpage.__c.runVoidMethod ("LogImpl","81507346",__ref.getField(true,"_documentname" /*RemoteObject*/ ),0);
 BA.debugLineNum = 179;BA.debugLine="PropertiesPanel.Visible=False";
Debug.ShouldStop(262144);
__ref.getField(false,"_propertiespanel" /*RemoteObject*/ ).runMethod(true,"setVisible",scandocumentpage.__c.getField(true,"False"));
 BA.debugLineNum = 180;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("ScanDocumentButton_Click (scandocumentpage) ","scandocumentpage",2,__ref.getField(false, "ba"),__ref,71);
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
		Debug.PushSubsStack("ScanDocumentButton_Click (scandocumentpage) ","scandocumentpage",2,__ref.getField(false, "ba"),__ref,71);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 72;BA.debugLine="TakePicture (scanView.Width, scanView.Height)";
Debug.ShouldStop(128);
__ref.runClassMethod (b4a.example.scandocumentpage.class, "_takepicture" /*void*/ ,(Object)(__ref.getField(false,"_scanview" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_scanview" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 73;BA.debugLine="Wait For Image_Available(Success As Boolean, bmp";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","image_available", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "scandocumentpage", "scandocumentbutton_click"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
_bmp = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(2));Debug.locals.put("bmp", _bmp);
;
 BA.debugLineNum = 74;BA.debugLine="If Success Then";
Debug.ShouldStop(512);
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
 BA.debugLineNum = 75;BA.debugLine="PropertiesPanel.Visible = False";
Debug.ShouldStop(1024);
__ref.getField(false,"_propertiespanel" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 BA.debugLineNum = 76;BA.debugLine="scanView.Visible=True";
Debug.ShouldStop(2048);
__ref.getField(false,"_scanview" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"True"));
 BA.debugLineNum = 77;BA.debugLine="scanView.SetBitmap(bmp)";
Debug.ShouldStop(4096);
__ref.getField(false,"_scanview" /*RemoteObject*/ ).runVoidMethod ("SetBitmap",(Object)((_bmp.getObject())));
 BA.debugLineNum = 78;BA.debugLine="bitMap = bmp";
Debug.ShouldStop(8192);
__ref.setField ("_bitmap" /*RemoteObject*/ ,_bmp);
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("StartActivityForResult (scandocumentpage) ","scandocumentpage",2,__ref.getField(false, "ba"),__ref,126);
if (RapidSub.canDelegate("startactivityforresult")) { return __ref.runUserSub(false, "scandocumentpage","startactivityforresult", __ref, _i);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("i", _i);
 BA.debugLineNum = 126;BA.debugLine="Sub StartActivityForResult(i As Intent)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 127;BA.debugLine="Dim jo As JavaObject = Me";
Debug.ShouldStop(1073741824);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 128;BA.debugLine="jo = jo.RunMethod(\"getBA\", Null)";
Debug.ShouldStop(-2147483648);
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getBA")),(Object)((scandocumentpage.__c.getField(false,"Null")))));
 BA.debugLineNum = 129;BA.debugLine="ion = jo.CreateEvent(\"anywheresoftware.b4a.IOnAct";
Debug.ShouldStop(1);
__ref.setField ("_ion" /*RemoteObject*/ ,_jo.runMethod(false,"CreateEvent",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("anywheresoftware.b4a.IOnActivityResult")),(Object)(BA.ObjectToString("ion")),(Object)(scandocumentpage.__c.getField(false,"Null"))));
 BA.debugLineNum = 130;BA.debugLine="jo.RunMethod(\"startActivityForResult\", Array(ion,";
Debug.ShouldStop(2);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("startActivityForResult")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {__ref.getField(false,"_ion" /*RemoteObject*/ ),(_i.getObject())})));
 BA.debugLineNum = 131;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("TakePicture (scandocumentpage) ","scandocumentpage",2,__ref.getField(false, "ba"),__ref,83);
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
		Debug.PushSubsStack("TakePicture (scandocumentpage) ","scandocumentpage",2,__ref.getField(false, "ba"),__ref,83);
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
 BA.debugLineNum = 84;BA.debugLine="Dim i As Intent";
Debug.ShouldStop(524288);
_i = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("i", _i);
 BA.debugLineNum = 85;BA.debugLine="i.Initialize(\"android.media.action.IMAGE_CAPTURE\"";
Debug.ShouldStop(1048576);
_i.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("android.media.action.IMAGE_CAPTURE")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 86;BA.debugLine="File.Delete(Provider.SharedFolder, tempImageFile)";
Debug.ShouldStop(2097152);
parent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(__ref.getField(false,"_provider" /*RemoteObject*/ ).getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_tempimagefile" /*RemoteObject*/ )));
 BA.debugLineNum = 87;BA.debugLine="Dim u As Object = Provider.GetFileUri(tempImageFi";
Debug.ShouldStop(4194304);
_u = __ref.getField(false,"_provider" /*RemoteObject*/ ).runClassMethod (b4a.example.fileprovider.class, "_getfileuri" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_tempimagefile" /*RemoteObject*/ )));Debug.locals.put("u", _u);Debug.locals.put("u", _u);
 BA.debugLineNum = 88;BA.debugLine="i.PutExtra(\"output\", u) 'the image will be saved";
Debug.ShouldStop(8388608);
_i.runVoidMethod ("PutExtra",(Object)(BA.ObjectToString("output")),(Object)(_u));
 BA.debugLineNum = 89;BA.debugLine="Try";
Debug.ShouldStop(16777216);
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
 BA.debugLineNum = 90;BA.debugLine="StartActivityForResult(i)";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4a.example.scandocumentpage.class, "_startactivityforresult" /*RemoteObject*/ ,(Object)(_i));
 BA.debugLineNum = 91;BA.debugLine="Wait For ion_Event (MethodName As String, Args()";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","ion_event", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "scandocumentpage", "takepicture"), null);
this.state = 31;
return;
case 31:
//C
this.state = 4;
_methodname = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("MethodName", _methodname);
_args = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(2));Debug.locals.put("Args", _args);
;
 BA.debugLineNum = 92;BA.debugLine="Dim bmp As B4XBitmap";
Debug.ShouldStop(134217728);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 93;BA.debugLine="If -1 = Args(0) Then";
Debug.ShouldStop(268435456);
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
 BA.debugLineNum = 94;BA.debugLine="Try";
Debug.ShouldStop(536870912);
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
 BA.debugLineNum = 95;BA.debugLine="Dim in As Intent = Args(1)";
Debug.ShouldStop(1073741824);
_in = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");
_in = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.IntentWrapper"), _args.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("in", _in);
 BA.debugLineNum = 96;BA.debugLine="If File.Exists(Provider.SharedFolder, tempImag";
Debug.ShouldStop(-2147483648);
if (true) break;

case 10:
//if
this.state = 23;
if (parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(__ref.getField(false,"_provider" /*RemoteObject*/ ).getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_tempimagefile" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
this.state = 12;
}else 
{ BA.debugLineNum = 110;BA.debugLine="Else If in.HasExtra(\"data\") Then 'try to get t";
Debug.ShouldStop(8192);
if (_in.runMethod(true,"HasExtra",(Object)(RemoteObject.createImmutable("data"))).<Boolean>get().booleanValue()) { 
this.state = 22;
}}
if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 97;BA.debugLine="Dim Exif As ExifData";
Debug.ShouldStop(1);
_exif = RemoteObject.createNew ("anywheresoftware.b4a.agraham.jpegutils.ExifUtils");Debug.locals.put("Exif", _exif);
 BA.debugLineNum = 98;BA.debugLine="Exif.Initialize(Provider.SharedFolder, tempIm";
Debug.ShouldStop(2);
_exif.runVoidMethod ("Initialize",(Object)(__ref.getField(false,"_provider" /*RemoteObject*/ ).getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_tempimagefile" /*RemoteObject*/ )));
 BA.debugLineNum = 99;BA.debugLine="bmp = LoadBitmapSample(Provider.SharedFolder,";
Debug.ShouldStop(4);
_bmp = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), parent.__c.runMethod(false,"LoadBitmapSample",(Object)(__ref.getField(false,"_provider" /*RemoteObject*/ ).getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_tempimagefile" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, parent.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, _targetwidth)),(Object)(BA.numberCast(double.class, _targetheight))))),(Object)(BA.numberCast(int.class, parent.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, _targetwidth)),(Object)(BA.numberCast(double.class, _targetheight)))))).getObject());
 BA.debugLineNum = 100;BA.debugLine="Log(\"Orientation: \" & Exif.getAttribute(Exif.";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("LogImpl","81310737",RemoteObject.concat(RemoteObject.createImmutable("Orientation: "),_exif.runMethod(true,"getAttribute",(Object)(_exif.getField(true,"TAG_ORIENTATION")))),0);
 BA.debugLineNum = 101;BA.debugLine="Select Exif.getAttribute(Exif.TAG_ORIENTATION";
Debug.ShouldStop(16);
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
 BA.debugLineNum = 103;BA.debugLine="bmp = bmp.Rotate(180)";
Debug.ShouldStop(64);
_bmp = _bmp.runMethod(false,"Rotate",(Object)(BA.numberCast(int.class, 180)));Debug.locals.put("bmp", _bmp);
 if (true) break;

case 17:
//C
this.state = 20;
 BA.debugLineNum = 105;BA.debugLine="bmp = bmp.Rotate(90)";
Debug.ShouldStop(256);
_bmp = _bmp.runMethod(false,"Rotate",(Object)(BA.numberCast(int.class, 90)));Debug.locals.put("bmp", _bmp);
 if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 107;BA.debugLine="bmp = bmp.Rotate(270)";
Debug.ShouldStop(1024);
_bmp = _bmp.runMethod(false,"Rotate",(Object)(BA.numberCast(int.class, 270)));Debug.locals.put("bmp", _bmp);
 if (true) break;

case 20:
//C
this.state = 23;
;
 BA.debugLineNum = 109;BA.debugLine="bmp = bmp.Resize(TargetWidth, TargetHeight, T";
Debug.ShouldStop(4096);
_bmp = _bmp.runMethod(false,"Resize",(Object)(_targetwidth),(Object)(_targetheight),(Object)(parent.__c.getField(true,"True")));Debug.locals.put("bmp", _bmp);
 if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 111;BA.debugLine="Dim jo As JavaObject = in";
Debug.ShouldStop(16384);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _in.getObject());Debug.locals.put("jo", _jo);
 BA.debugLineNum = 112;BA.debugLine="bmp = jo.RunMethodJO(\"getExtras\", Null).RunMe";
Debug.ShouldStop(32768);
_bmp = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), _jo.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getExtras")),(Object)((parent.__c.getField(false,"Null")))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("get")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("data"))}))));
 if (true) break;

case 23:
//C
this.state = 26;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 25:
//C
this.state = 26;
this.catchState = 29;
 BA.debugLineNum = 115;BA.debugLine="Log(LastException)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("LogImpl","81310752",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
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
 BA.debugLineNum = 118;BA.debugLine="CallSubDelayed3(Me, \"Image_Available\", bmp.IsIni";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("Image_Available")),(Object)((_bmp.runMethod(true,"IsInitialized"))),(Object)((_bmp)));
 Debug.CheckDeviceExceptions();
if (true) break;

case 29:
//C
this.state = 30;
this.catchState = 0;
 BA.debugLineNum = 120;BA.debugLine="ToastMessageShow(\"Camera is not available.\", Tru";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Camera is not available.")),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 121;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("LogImpl","81310758",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 122;BA.debugLine="CallSubDelayed3(Me, \"Image_Available\", False, Nu";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("Image_Available")),(Object)((parent.__c.getField(true,"False"))),(Object)(parent.__c.getField(false,"Null")));
 if (true) break;
if (true) break;

case 30:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 124;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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