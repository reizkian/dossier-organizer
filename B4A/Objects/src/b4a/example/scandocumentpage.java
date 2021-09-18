package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class scandocumentpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.scandocumentpage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.scandocumentpage.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.PanelWrapper _opengallerybutton = null;
public anywheresoftware.b4a.phone.Phone.ContentChooser _chooser = null;
public anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
public String _tempimagefile = "";
public b4a.example.fileprovider _provider = null;
public Object _ion = null;
public anywheresoftware.b4a.objects.PanelWrapper _scandocumentbutton = null;
public anywheresoftware.b4a.objects.PanelWrapper _documentpropertiesbutton = null;
public anywheresoftware.b4a.objects.PanelWrapper _savedocumentbutton = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _scanview = null;
public anywheresoftware.b4a.objects.PanelWrapper _propertiespanel = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _scrollviewproperties = null;
public anywheresoftware.b4a.objects.EditTextWrapper _docid = null;
public anywheresoftware.b4a.objects.EditTextWrapper _docname = null;
public anywheresoftware.b4a.objects.EditTextWrapper _doctype = null;
public anywheresoftware.b4a.objects.EditTextWrapper _docexpiry = null;
public anywheresoftware.b4a.objects.PanelWrapper _savepropertiesbutton = null;
public String _documentid = "";
public String _documentname = "";
public String _documenttype = "";
public String _documentexpiry = "";
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bitmap = null;
public anywheresoftware.b4a.objects.StringUtils _stringutils = null;
public byte[] _buffer = null;
public anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _outputstream = null;
public String _imgstr = "";
public b4a.example.main _main = null;
public b4a.example.dbutils _dbutils = null;
public b4a.example.mdlconnection _mdlconnection = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public Object  _initialize(b4a.example.scandocumentpage __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="scandocumentpage";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_created(b4a.example.scandocumentpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="scandocumentpage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="Root.LoadLayout(\"Header\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("Header",ba);
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="lblBack.Visible=True";
__ref._lblback /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=1114117;
 //BA.debugLineNum = 1114117;BA.debugLine="Panel1.LoadLayout(\"scandocument\")";
__ref._panel1 /*anywheresoftware.b4a.objects.PanelWrapper*/ .LoadLayout("scandocument",ba);
RDebugUtils.currentLine=1114118;
 //BA.debugLineNum = 1114118;BA.debugLine="scanView.Visible=False";
__ref._scanview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=1114119;
 //BA.debugLineNum = 1114119;BA.debugLine="PropertiesPanel.Visible = False";
__ref._propertiespanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=1114121;
 //BA.debugLineNum = 1114121;BA.debugLine="Provider.Initialize";
__ref._provider /*b4a.example.fileprovider*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1114126;
 //BA.debugLineNum = 1114126;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.scandocumentpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="scandocumentpage";
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="Dim ScrollView1 As ScrollView";
_scrollview1 = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="Dim Panel1 As Panel";
_panel1 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="Dim lblBack As Label";
_lblback = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=983047;
 //BA.debugLineNum = 983047;BA.debugLine="Dim OpenGalleryButton As Panel";
_opengallerybutton = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=983048;
 //BA.debugLineNum = 983048;BA.debugLine="Dim Chooser As ContentChooser";
_chooser = new anywheresoftware.b4a.phone.Phone.ContentChooser();
RDebugUtils.currentLine=983049;
 //BA.debugLineNum = 983049;BA.debugLine="Dim rp As RuntimePermissions";
_rp = new anywheresoftware.b4a.objects.RuntimePermissions();
RDebugUtils.currentLine=983052;
 //BA.debugLineNum = 983052;BA.debugLine="Private tempImageFile As String = \"tempimage.jpg\"";
_tempimagefile = "tempimage.jpg";
RDebugUtils.currentLine=983053;
 //BA.debugLineNum = 983053;BA.debugLine="Private Provider As FileProvider";
_provider = new b4a.example.fileprovider();
RDebugUtils.currentLine=983054;
 //BA.debugLineNum = 983054;BA.debugLine="Private ion As Object";
_ion = new Object();
RDebugUtils.currentLine=983059;
 //BA.debugLineNum = 983059;BA.debugLine="Private ScanDocumentButton As Panel";
_scandocumentbutton = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=983060;
 //BA.debugLineNum = 983060;BA.debugLine="Private DocumentPropertiesButton As Panel";
_documentpropertiesbutton = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=983061;
 //BA.debugLineNum = 983061;BA.debugLine="Private SaveDocumentButton As Panel";
_savedocumentbutton = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=983062;
 //BA.debugLineNum = 983062;BA.debugLine="Private scanView As B4XView";
_scanview = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=983063;
 //BA.debugLineNum = 983063;BA.debugLine="Private PropertiesPanel As Panel";
_propertiespanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=983064;
 //BA.debugLineNum = 983064;BA.debugLine="Private ScrollViewProperties As ScrollView";
_scrollviewproperties = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=983066;
 //BA.debugLineNum = 983066;BA.debugLine="Private OpenGalleryButton As Panel";
_opengallerybutton = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=983067;
 //BA.debugLineNum = 983067;BA.debugLine="Private docID As EditText";
_docid = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=983068;
 //BA.debugLineNum = 983068;BA.debugLine="Private docName As EditText";
_docname = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=983069;
 //BA.debugLineNum = 983069;BA.debugLine="Private docType As EditText";
_doctype = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=983070;
 //BA.debugLineNum = 983070;BA.debugLine="Private docExpiry As EditText";
_docexpiry = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=983071;
 //BA.debugLineNum = 983071;BA.debugLine="Private SavePropertiesButton As Panel";
_savepropertiesbutton = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=983073;
 //BA.debugLineNum = 983073;BA.debugLine="Dim documentID As String";
_documentid = "";
RDebugUtils.currentLine=983074;
 //BA.debugLineNum = 983074;BA.debugLine="Dim documentName As String";
_documentname = "";
RDebugUtils.currentLine=983075;
 //BA.debugLineNum = 983075;BA.debugLine="Dim documentType As String";
_documenttype = "";
RDebugUtils.currentLine=983076;
 //BA.debugLineNum = 983076;BA.debugLine="Dim documentExpiry As String";
_documentexpiry = "";
RDebugUtils.currentLine=983079;
 //BA.debugLineNum = 983079;BA.debugLine="Dim bitMap As B4XBitmap";
_bitmap = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
RDebugUtils.currentLine=983080;
 //BA.debugLineNum = 983080;BA.debugLine="Dim stringUtils As StringUtils";
_stringutils = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=983081;
 //BA.debugLineNum = 983081;BA.debugLine="Dim Buffer() As Byte";
_buffer = new byte[(int) (0)];
;
RDebugUtils.currentLine=983082;
 //BA.debugLineNum = 983082;BA.debugLine="Dim outputStream As OutputStream";
_outputstream = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=983083;
 //BA.debugLineNum = 983083;BA.debugLine="Dim imgStr As String";
_imgstr = "";
RDebugUtils.currentLine=983084;
 //BA.debugLineNum = 983084;BA.debugLine="End Sub";
return "";
}
public String  _documentpropertiesbutton_click(b4a.example.scandocumentpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="scandocumentpage";
if (Debug.shouldDelegate(ba, "documentpropertiesbutton_click", false))
	 {return ((String) Debug.delegate(ba, "documentpropertiesbutton_click", null));}
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Private Sub DocumentPropertiesButton_Click";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="If PropertiesPanel.Visible == False Then";
if (__ref._propertiespanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getVisible()==__c.False) { 
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="PropertiesPanel.Visible = True";
__ref._propertiespanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="ScrollViewProperties.Panel.LoadLayout(\"propertie";
__ref._scrollviewproperties /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().LoadLayout("properties_panel",ba);
 }else {
RDebugUtils.currentLine=1441797;
 //BA.debugLineNum = 1441797;BA.debugLine="PropertiesPanel.Visible = False";
__ref._propertiespanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
 };
RDebugUtils.currentLine=1441799;
 //BA.debugLineNum = 1441799;BA.debugLine="End Sub";
return "";
}
public String  _image_chooser_result(b4a.example.scandocumentpage __ref,boolean _success,String _pdir,String _pfilename) throws Exception{
__ref = this;
RDebugUtils.currentModule="scandocumentpage";
if (Debug.shouldDelegate(ba, "image_chooser_result", false))
	 {return ((String) Debug.delegate(ba, "image_chooser_result", new Object[] {_success,_pdir,_pfilename}));}
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
RDebugUtils.currentLine=13762560;
 //BA.debugLineNum = 13762560;BA.debugLine="Sub image_chooser_Result (Success As Boolean, pDir";
RDebugUtils.currentLine=13762561;
 //BA.debugLineNum = 13762561;BA.debugLine="Log(\"execute Chooser_Result\")";
__c.LogImpl("513762561","execute Chooser_Result",0);
RDebugUtils.currentLine=13762562;
 //BA.debugLineNum = 13762562;BA.debugLine="If Success = True Then";
if (_success==__c.True) { 
RDebugUtils.currentLine=13762563;
 //BA.debugLineNum = 13762563;BA.debugLine="Log(\"fileDir: \" & pDir)";
__c.LogImpl("513762563","fileDir: "+_pdir,0);
RDebugUtils.currentLine=13762564;
 //BA.debugLineNum = 13762564;BA.debugLine="Log(\"fileName: \" & pFileName)";
__c.LogImpl("513762564","fileName: "+_pfilename,0);
RDebugUtils.currentLine=13762566;
 //BA.debugLineNum = 13762566;BA.debugLine="Dim bmp As B4XBitmap";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
RDebugUtils.currentLine=13762567;
 //BA.debugLineNum = 13762567;BA.debugLine="Try";
try {RDebugUtils.currentLine=13762568;
 //BA.debugLineNum = 13762568;BA.debugLine="bmp = LoadBitmapSample(pDir,pFileName, Max(scan";
_bmp = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(__c.LoadBitmapSample(_pdir,_pfilename,(int) (__c.Max(__ref._scanview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._scanview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight())),(int) (__c.Max(__ref._scanview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._scanview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()))).getObject()));
RDebugUtils.currentLine=13762569;
 //BA.debugLineNum = 13762569;BA.debugLine="bmp = bmp.Resize(scanView.Width, scanView.Heigh";
_bmp = _bmp.Resize(__ref._scanview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._scanview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),__c.True);
RDebugUtils.currentLine=13762570;
 //BA.debugLineNum = 13762570;BA.debugLine="scanView.Visible = True";
__ref._scanview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=13762571;
 //BA.debugLineNum = 13762571;BA.debugLine="scanView.SetBitmap(bmp)";
__ref._scanview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((android.graphics.Bitmap)(_bmp.getObject()));
RDebugUtils.currentLine=13762572;
 //BA.debugLineNum = 13762572;BA.debugLine="Log(\"success read image file\")";
__c.LogImpl("513762572","success read image file",0);
 } 
       catch (Exception e13) {
			ba.setLastException(e13);RDebugUtils.currentLine=13762574;
 //BA.debugLineNum = 13762574;BA.debugLine="Log(LastException)";
__c.LogImpl("513762574",BA.ObjectToString(__c.LastException(ba)),0);
 };
 }else {
RDebugUtils.currentLine=13762577;
 //BA.debugLineNum = 13762577;BA.debugLine="ToastMessageShow(\"failed read image file\",True)";
__c.ToastMessageShow(BA.ObjectToCharSequence("failed read image file"),__c.True);
 };
RDebugUtils.currentLine=13762579;
 //BA.debugLineNum = 13762579;BA.debugLine="End Sub";
return "";
}
public String  _lblback_click(b4a.example.scandocumentpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="scandocumentpage";
if (Debug.shouldDelegate(ba, "lblback_click", false))
	 {return ((String) Debug.delegate(ba, "lblback_click", null));}
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Sub lblBack_Click";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="scanView.SetBitmap(Null)";
__ref._scanview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((android.graphics.Bitmap)(__c.Null));
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="End Sub";
return "";
}
public String  _opengallerybutton_click(b4a.example.scandocumentpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="scandocumentpage";
if (Debug.shouldDelegate(ba, "opengallerybutton_click", false))
	 {return ((String) Debug.delegate(ba, "opengallerybutton_click", null));}
RDebugUtils.currentLine=12845056;
 //BA.debugLineNum = 12845056;BA.debugLine="Private Sub OpenGalleryButton_Click";
RDebugUtils.currentLine=12845057;
 //BA.debugLineNum = 12845057;BA.debugLine="Log(\"clicked OpenGalleryButton\")";
__c.LogImpl("512845057","clicked OpenGalleryButton",0);
RDebugUtils.currentLine=12845058;
 //BA.debugLineNum = 12845058;BA.debugLine="Chooser.Initialize(\"image_chooser\")";
__ref._chooser /*anywheresoftware.b4a.phone.Phone.ContentChooser*/ .Initialize("image_chooser");
RDebugUtils.currentLine=12845059;
 //BA.debugLineNum = 12845059;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_READ_EXTERNAL_ST";
__ref._rp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .CheckAndRequest(ba,__ref._rp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .PERMISSION_READ_EXTERNAL_STORAGE);
RDebugUtils.currentLine=12845060;
 //BA.debugLineNum = 12845060;BA.debugLine="Chooser.Show(\"image/*\", \"choose image\")";
__ref._chooser /*anywheresoftware.b4a.phone.Phone.ContentChooser*/ .Show(ba,"image/*","choose image");
RDebugUtils.currentLine=12845061;
 //BA.debugLineNum = 12845061;BA.debugLine="End Sub";
return "";
}
public String  _saveblob(b4a.example.scandocumentpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="scandocumentpage";
if (Debug.shouldDelegate(ba, "saveblob", false))
	 {return ((String) Debug.delegate(ba, "saveblob", null));}
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Sub saveBlob";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="outputStream.InitializeToBytesArray(0)";
__ref._outputstream /*anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper*/ .InitializeToBytesArray((int) (0));
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="bitMap.WriteToStream(outputStream,100,\"JPEG\")";
__ref._bitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .WriteToStream((java.io.OutputStream)(__ref._outputstream /*anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper*/ .getObject()),(int) (100),BA.getEnumFromString(android.graphics.Bitmap.CompressFormat.class,"JPEG"));
RDebugUtils.currentLine=1572867;
 //BA.debugLineNum = 1572867;BA.debugLine="outputStream.Close";
__ref._outputstream /*anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper*/ .Close();
RDebugUtils.currentLine=1572868;
 //BA.debugLineNum = 1572868;BA.debugLine="Buffer = outputStream.ToBytesArray";
__ref._buffer /*byte[]*/  = __ref._outputstream /*anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper*/ .ToBytesArray();
RDebugUtils.currentLine=1572869;
 //BA.debugLineNum = 1572869;BA.debugLine="imgStr = stringUtils.EncodeBase64(Buffer)";
__ref._imgstr /*String*/  = __ref._stringutils /*anywheresoftware.b4a.objects.StringUtils*/ .EncodeBase64(__ref._buffer /*byte[]*/ );
RDebugUtils.currentLine=1572870;
 //BA.debugLineNum = 1572870;BA.debugLine="Log(imgStr)";
__c.LogImpl("51572870",__ref._imgstr /*String*/ ,0);
RDebugUtils.currentLine=1572871;
 //BA.debugLineNum = 1572871;BA.debugLine="End Sub";
return "";
}
public String  _savedocumentbutton_click(b4a.example.scandocumentpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="scandocumentpage";
if (Debug.shouldDelegate(ba, "savedocumentbutton_click", false))
	 {return ((String) Debug.delegate(ba, "savedocumentbutton_click", null));}
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Private Sub SaveDocumentButton_Click";
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="If documentName=\"\" Then";
if ((__ref._documentname /*String*/ ).equals("")) { 
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="MsgboxAsync(\"Please insert document name propert";
__c.MsgboxAsync(BA.ObjectToCharSequence("Please insert document name properties"),BA.ObjectToCharSequence("Info"),ba);
RDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=1638406;
 //BA.debugLineNum = 1638406;BA.debugLine="If documentType=\"\" Then";
if ((__ref._documenttype /*String*/ ).equals("")) { 
RDebugUtils.currentLine=1638407;
 //BA.debugLineNum = 1638407;BA.debugLine="MsgboxAsync(\"Please insert document type propert";
__c.MsgboxAsync(BA.ObjectToCharSequence("Please insert document type properties"),BA.ObjectToCharSequence("Info"),ba);
RDebugUtils.currentLine=1638408;
 //BA.debugLineNum = 1638408;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=1638411;
 //BA.debugLineNum = 1638411;BA.debugLine="saveBlob";
__ref._saveblob /*String*/ (null);
RDebugUtils.currentLine=1638413;
 //BA.debugLineNum = 1638413;BA.debugLine="MdlConnection.dbSQL.ExecNonQuery(\"INSERT INTO doc";
_mdlconnection._dbsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("INSERT INTO documents(DOCUMENT_ID, NAME, TYPE, EXPIRED, SCAN) VALUES('"+__ref._documentid /*String*/ +"','"+__ref._documentname /*String*/ +"','"+__ref._documenttype /*String*/ +"','"+__ref._documentexpiry /*String*/ +"','"+__ref._imgstr /*String*/ +"')");
RDebugUtils.currentLine=1638414;
 //BA.debugLineNum = 1638414;BA.debugLine="ToastMessageShow(\"sucessfully saved document\",Fal";
__c.ToastMessageShow(BA.ObjectToCharSequence("sucessfully saved document"),__c.False);
RDebugUtils.currentLine=1638415;
 //BA.debugLineNum = 1638415;BA.debugLine="End Sub";
return "";
}
public String  _savepropertiesbutton_click(b4a.example.scandocumentpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="scandocumentpage";
if (Debug.shouldDelegate(ba, "savepropertiesbutton_click", false))
	 {return ((String) Debug.delegate(ba, "savepropertiesbutton_click", null));}
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Private Sub SavePropertiesButton_Click";
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="If docName.Text=\"\" Then";
if ((__ref._docname /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()).equals("")) { 
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="MsgboxAsync(\"Please insert document name\",\"Info\"";
__c.MsgboxAsync(BA.ObjectToCharSequence("Please insert document name"),BA.ObjectToCharSequence("Info"),ba);
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=1507334;
 //BA.debugLineNum = 1507334;BA.debugLine="If docType.Text=\"\" Then";
if ((__ref._doctype /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()).equals("")) { 
RDebugUtils.currentLine=1507335;
 //BA.debugLineNum = 1507335;BA.debugLine="MsgboxAsync(\"Please insert document type\", \"Info";
__c.MsgboxAsync(BA.ObjectToCharSequence("Please insert document type"),BA.ObjectToCharSequence("Info"),ba);
RDebugUtils.currentLine=1507336;
 //BA.debugLineNum = 1507336;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=1507339;
 //BA.debugLineNum = 1507339;BA.debugLine="documentID = docID.Text";
__ref._documentid /*String*/  = __ref._docid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=1507340;
 //BA.debugLineNum = 1507340;BA.debugLine="documentName = docName.Text";
__ref._documentname /*String*/  = __ref._docname /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=1507341;
 //BA.debugLineNum = 1507341;BA.debugLine="documentType = docType.Text";
__ref._documenttype /*String*/  = __ref._doctype /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=1507342;
 //BA.debugLineNum = 1507342;BA.debugLine="documentExpiry = docExpiry.Text";
__ref._documentexpiry /*String*/  = __ref._docexpiry /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=1507344;
 //BA.debugLineNum = 1507344;BA.debugLine="ToastMessageShow(\"properties saved\", False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("properties saved"),__c.False);
RDebugUtils.currentLine=1507345;
 //BA.debugLineNum = 1507345;BA.debugLine="Log(documentID)";
__c.LogImpl("51507345",__ref._documentid /*String*/ ,0);
RDebugUtils.currentLine=1507346;
 //BA.debugLineNum = 1507346;BA.debugLine="Log(documentName)";
__c.LogImpl("51507346",__ref._documentname /*String*/ ,0);
RDebugUtils.currentLine=1507348;
 //BA.debugLineNum = 1507348;BA.debugLine="PropertiesPanel.Visible=False";
__ref._propertiespanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=1507349;
 //BA.debugLineNum = 1507349;BA.debugLine="End Sub";
return "";
}
public void  _scandocumentbutton_click(b4a.example.scandocumentpage __ref) throws Exception{
RDebugUtils.currentModule="scandocumentpage";
if (Debug.shouldDelegate(ba, "scandocumentbutton_click", false))
	 {Debug.delegate(ba, "scandocumentbutton_click", null); return;}
ResumableSub_ScanDocumentButton_Click rsub = new ResumableSub_ScanDocumentButton_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_ScanDocumentButton_Click extends BA.ResumableSub {
public ResumableSub_ScanDocumentButton_Click(b4a.example.scandocumentpage parent,b4a.example.scandocumentpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.scandocumentpage __ref;
b4a.example.scandocumentpage parent;
boolean _success = false;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="scandocumentpage";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="TakePicture (scanView.Width, scanView.Height)";
__ref._takepicture /*void*/ (null,__ref._scanview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._scanview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="Wait For Image_Available(Success As Boolean, bmp";
parent.__c.WaitFor("image_available", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "scandocumentpage", "scandocumentbutton_click"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_success = (Boolean) result[1];
_bmp = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) result[2];
;
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="If Success Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_success) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=1245188;
 //BA.debugLineNum = 1245188;BA.debugLine="PropertiesPanel.Visible = False";
__ref._propertiespanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(parent.__c.False);
RDebugUtils.currentLine=1245189;
 //BA.debugLineNum = 1245189;BA.debugLine="scanView.Visible=True";
__ref._scanview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(parent.__c.True);
RDebugUtils.currentLine=1245190;
 //BA.debugLineNum = 1245190;BA.debugLine="scanView.SetBitmap(bmp)";
__ref._scanview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((android.graphics.Bitmap)(_bmp.getObject()));
RDebugUtils.currentLine=1245191;
 //BA.debugLineNum = 1245191;BA.debugLine="bitMap = bmp";
__ref._bitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = _bmp;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=1245193;
 //BA.debugLineNum = 1245193;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _takepicture(b4a.example.scandocumentpage __ref,int _targetwidth,int _targetheight) throws Exception{
RDebugUtils.currentModule="scandocumentpage";
if (Debug.shouldDelegate(ba, "takepicture", false))
	 {Debug.delegate(ba, "takepicture", new Object[] {_targetwidth,_targetheight}); return;}
ResumableSub_TakePicture rsub = new ResumableSub_TakePicture(this,__ref,_targetwidth,_targetheight);
rsub.resume(ba, null);
}
public static class ResumableSub_TakePicture extends BA.ResumableSub {
public ResumableSub_TakePicture(b4a.example.scandocumentpage parent,b4a.example.scandocumentpage __ref,int _targetwidth,int _targetheight) {
this.parent = parent;
this.__ref = __ref;
this._targetwidth = _targetwidth;
this._targetheight = _targetheight;
this.__ref = parent;
}
b4a.example.scandocumentpage __ref;
b4a.example.scandocumentpage parent;
int _targetwidth;
int _targetheight;
anywheresoftware.b4a.objects.IntentWrapper _i = null;
Object _u = null;
String _methodname = "";
Object[] _args = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
anywheresoftware.b4a.objects.IntentWrapper _in = null;
anywheresoftware.b4a.agraham.jpegutils.ExifUtils _exif = null;
anywheresoftware.b4j.object.JavaObject _jo = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="scandocumentpage";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="Dim i As Intent";
_i = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="i.Initialize(\"android.media.action.IMAGE_CAPTURE\"";
_i.Initialize("android.media.action.IMAGE_CAPTURE","");
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="File.Delete(Provider.SharedFolder, tempImageFile)";
parent.__c.File.Delete(__ref._provider /*b4a.example.fileprovider*/ ._sharedfolder /*String*/ ,__ref._tempimagefile /*String*/ );
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="Dim u As Object = Provider.GetFileUri(tempImageFi";
_u = __ref._provider /*b4a.example.fileprovider*/ ._getfileuri /*Object*/ (null,__ref._tempimagefile /*String*/ );
RDebugUtils.currentLine=1310725;
 //BA.debugLineNum = 1310725;BA.debugLine="i.PutExtra(\"output\", u) 'the image will be saved";
_i.PutExtra("output",_u);
RDebugUtils.currentLine=1310726;
 //BA.debugLineNum = 1310726;BA.debugLine="Try";
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
RDebugUtils.currentLine=1310727;
 //BA.debugLineNum = 1310727;BA.debugLine="StartActivityForResult(i)";
__ref._startactivityforresult /*String*/ (null,_i);
RDebugUtils.currentLine=1310728;
 //BA.debugLineNum = 1310728;BA.debugLine="Wait For ion_Event (MethodName As String, Args()";
parent.__c.WaitFor("ion_event", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "scandocumentpage", "takepicture"), null);
this.state = 31;
return;
case 31:
//C
this.state = 4;
_methodname = (String) result[1];
_args = (Object[]) result[2];
;
RDebugUtils.currentLine=1310729;
 //BA.debugLineNum = 1310729;BA.debugLine="Dim bmp As B4XBitmap";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
RDebugUtils.currentLine=1310730;
 //BA.debugLineNum = 1310730;BA.debugLine="If -1 = Args(0) Then";
if (true) break;

case 4:
//if
this.state = 27;
if (-1==(double)(BA.ObjectToNumber(_args[(int) (0)]))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=1310731;
 //BA.debugLineNum = 1310731;BA.debugLine="Try";
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
RDebugUtils.currentLine=1310732;
 //BA.debugLineNum = 1310732;BA.debugLine="Dim in As Intent = Args(1)";
_in = new anywheresoftware.b4a.objects.IntentWrapper();
_in = (anywheresoftware.b4a.objects.IntentWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.IntentWrapper(), (android.content.Intent)(_args[(int) (1)]));
RDebugUtils.currentLine=1310733;
 //BA.debugLineNum = 1310733;BA.debugLine="If File.Exists(Provider.SharedFolder, tempImag";
if (true) break;

case 10:
//if
this.state = 23;
if (parent.__c.File.Exists(__ref._provider /*b4a.example.fileprovider*/ ._sharedfolder /*String*/ ,__ref._tempimagefile /*String*/ )) { 
this.state = 12;
}else 
{RDebugUtils.currentLine=1310747;
 //BA.debugLineNum = 1310747;BA.debugLine="Else If in.HasExtra(\"data\") Then 'try to get t";
if (_in.HasExtra("data")) { 
this.state = 22;
}}
if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=1310734;
 //BA.debugLineNum = 1310734;BA.debugLine="Dim Exif As ExifData";
_exif = new anywheresoftware.b4a.agraham.jpegutils.ExifUtils();
RDebugUtils.currentLine=1310735;
 //BA.debugLineNum = 1310735;BA.debugLine="Exif.Initialize(Provider.SharedFolder, tempIm";
_exif.Initialize(__ref._provider /*b4a.example.fileprovider*/ ._sharedfolder /*String*/ ,__ref._tempimagefile /*String*/ );
RDebugUtils.currentLine=1310736;
 //BA.debugLineNum = 1310736;BA.debugLine="bmp = LoadBitmapSample(Provider.SharedFolder,";
_bmp = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(parent.__c.LoadBitmapSample(__ref._provider /*b4a.example.fileprovider*/ ._sharedfolder /*String*/ ,__ref._tempimagefile /*String*/ ,(int) (parent.__c.Max(_targetwidth,_targetheight)),(int) (parent.__c.Max(_targetwidth,_targetheight))).getObject()));
RDebugUtils.currentLine=1310737;
 //BA.debugLineNum = 1310737;BA.debugLine="Log(\"Orientation: \" & Exif.getAttribute(Exif.";
parent.__c.LogImpl("51310737","Orientation: "+_exif.getAttribute(_exif.TAG_ORIENTATION),0);
RDebugUtils.currentLine=1310738;
 //BA.debugLineNum = 1310738;BA.debugLine="Select Exif.getAttribute(Exif.TAG_ORIENTATION";
if (true) break;

case 13:
//select
this.state = 20;
switch (BA.switchObjectToInt(_exif.getAttribute(_exif.TAG_ORIENTATION),BA.NumberToString(_exif.ORIENTATION_ROTATE_180),BA.NumberToString(_exif.ORIENTATION_ROTATE_90),BA.NumberToString(_exif.ORIENTATION_ROTATE_270))) {
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
RDebugUtils.currentLine=1310740;
 //BA.debugLineNum = 1310740;BA.debugLine="bmp = bmp.Rotate(180)";
_bmp = _bmp.Rotate((int) (180));
 if (true) break;

case 17:
//C
this.state = 20;
RDebugUtils.currentLine=1310742;
 //BA.debugLineNum = 1310742;BA.debugLine="bmp = bmp.Rotate(90)";
_bmp = _bmp.Rotate((int) (90));
 if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=1310744;
 //BA.debugLineNum = 1310744;BA.debugLine="bmp = bmp.Rotate(270)";
_bmp = _bmp.Rotate((int) (270));
 if (true) break;

case 20:
//C
this.state = 23;
;
RDebugUtils.currentLine=1310746;
 //BA.debugLineNum = 1310746;BA.debugLine="bmp = bmp.Resize(TargetWidth, TargetHeight, T";
_bmp = _bmp.Resize(_targetwidth,_targetheight,parent.__c.True);
 if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=1310748;
 //BA.debugLineNum = 1310748;BA.debugLine="Dim jo As JavaObject = in";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_in.getObject()));
RDebugUtils.currentLine=1310749;
 //BA.debugLineNum = 1310749;BA.debugLine="bmp = jo.RunMethodJO(\"getExtras\", Null).RunMe";
_bmp = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_jo.RunMethodJO("getExtras",(Object[])(parent.__c.Null)).RunMethod("get",new Object[]{(Object)("data")})));
 if (true) break;

case 23:
//C
this.state = 26;
;
 if (true) break;

case 25:
//C
this.state = 26;
this.catchState = 29;
RDebugUtils.currentLine=1310752;
 //BA.debugLineNum = 1310752;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("51310752",BA.ObjectToString(parent.__c.LastException(ba)),0);
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
RDebugUtils.currentLine=1310755;
 //BA.debugLineNum = 1310755;BA.debugLine="CallSubDelayed3(Me, \"Image_Available\", bmp.IsIni";
parent.__c.CallSubDelayed3(ba,parent,"Image_Available",(Object)(_bmp.IsInitialized()),(Object)(_bmp));
 if (true) break;

case 29:
//C
this.state = 30;
this.catchState = 0;
RDebugUtils.currentLine=1310757;
 //BA.debugLineNum = 1310757;BA.debugLine="ToastMessageShow(\"Camera is not available.\", Tru";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Camera is not available."),parent.__c.True);
RDebugUtils.currentLine=1310758;
 //BA.debugLineNum = 1310758;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("51310758",BA.ObjectToString(parent.__c.LastException(ba)),0);
RDebugUtils.currentLine=1310759;
 //BA.debugLineNum = 1310759;BA.debugLine="CallSubDelayed3(Me, \"Image_Available\", False, Nu";
parent.__c.CallSubDelayed3(ba,parent,"Image_Available",(Object)(parent.__c.False),parent.__c.Null);
 if (true) break;
if (true) break;

case 30:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=1310761;
 //BA.debugLineNum = 1310761;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public String  _startactivityforresult(b4a.example.scandocumentpage __ref,anywheresoftware.b4a.objects.IntentWrapper _i) throws Exception{
__ref = this;
RDebugUtils.currentModule="scandocumentpage";
if (Debug.shouldDelegate(ba, "startactivityforresult", false))
	 {return ((String) Debug.delegate(ba, "startactivityforresult", new Object[] {_i}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Sub StartActivityForResult(i As Intent)";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="Dim jo As JavaObject = Me";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="jo = jo.RunMethod(\"getBA\", Null)";
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.RunMethod("getBA",(Object[])(__c.Null))));
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="ion = jo.CreateEvent(\"anywheresoftware.b4a.IOnAct";
__ref._ion /*Object*/  = _jo.CreateEvent(ba,"anywheresoftware.b4a.IOnActivityResult","ion",__c.Null);
RDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="jo.RunMethod(\"startActivityForResult\", Array(ion,";
_jo.RunMethod("startActivityForResult",new Object[]{__ref._ion /*Object*/ ,(Object)(_i.getObject())});
RDebugUtils.currentLine=1376261;
 //BA.debugLineNum = 1376261;BA.debugLine="End Sub";
return "";
}
}