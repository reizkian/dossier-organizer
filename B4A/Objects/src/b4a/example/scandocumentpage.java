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
public b4a.example.b4xdialog _dialog = null;
public b4a.example.b4xdatetemplate _datetemplate = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.dbutils _dbutils = null;
public b4a.example.mdlconnection _mdlconnection = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
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
RDebugUtils.currentLine=1114122;
 //BA.debugLineNum = 1114122;BA.debugLine="DocumentPropertiesButton.Visible = False";
__ref._documentpropertiesbutton /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=1114123;
 //BA.debugLineNum = 1114123;BA.debugLine="SaveDocumentButton.Visible = False";
__ref._savedocumentbutton /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=1114126;
 //BA.debugLineNum = 1114126;BA.debugLine="Dialog.Initialize(Root)";
__ref._dialog /*b4a.example.b4xdialog*/ ._initialize /*String*/ (null,ba,__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=1114127;
 //BA.debugLineNum = 1114127;BA.debugLine="DateTemplate.Initialize";
__ref._datetemplate /*b4a.example.b4xdatetemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1114128;
 //BA.debugLineNum = 1114128;BA.debugLine="DateTemplate.MinYear = 2016";
__ref._datetemplate /*b4a.example.b4xdatetemplate*/ ._minyear /*int*/  = (int) (2016);
RDebugUtils.currentLine=1114129;
 //BA.debugLineNum = 1114129;BA.debugLine="DateTemplate.MaxYear = 2030";
__ref._datetemplate /*b4a.example.b4xdatetemplate*/ ._maxyear /*int*/  = (int) (2030);
RDebugUtils.currentLine=1114131;
 //BA.debugLineNum = 1114131;BA.debugLine="Provider.Initialize";
__ref._provider /*b4a.example.fileprovider*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1114135;
 //BA.debugLineNum = 1114135;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="Dim ScrollView1 As ScrollView";
_scrollview1 = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="Dim Panel1 As Panel";
_panel1 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=983046;
 //BA.debugLineNum = 983046;BA.debugLine="Dim lblBack As Label";
_lblback = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=983048;
 //BA.debugLineNum = 983048;BA.debugLine="Dim OpenGalleryButton As Panel";
_opengallerybutton = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=983049;
 //BA.debugLineNum = 983049;BA.debugLine="Dim Chooser As ContentChooser";
_chooser = new anywheresoftware.b4a.phone.Phone.ContentChooser();
RDebugUtils.currentLine=983050;
 //BA.debugLineNum = 983050;BA.debugLine="Dim rp As RuntimePermissions";
_rp = new anywheresoftware.b4a.objects.RuntimePermissions();
RDebugUtils.currentLine=983053;
 //BA.debugLineNum = 983053;BA.debugLine="Private tempImageFile As String = \"tempimage.jpg\"";
_tempimagefile = "tempimage.jpg";
RDebugUtils.currentLine=983054;
 //BA.debugLineNum = 983054;BA.debugLine="Private Provider As FileProvider";
_provider = new b4a.example.fileprovider();
RDebugUtils.currentLine=983055;
 //BA.debugLineNum = 983055;BA.debugLine="Private ion As Object";
_ion = new Object();
RDebugUtils.currentLine=983060;
 //BA.debugLineNum = 983060;BA.debugLine="Private ScanDocumentButton As Panel";
_scandocumentbutton = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=983061;
 //BA.debugLineNum = 983061;BA.debugLine="Private DocumentPropertiesButton As Panel";
_documentpropertiesbutton = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=983062;
 //BA.debugLineNum = 983062;BA.debugLine="Private SaveDocumentButton As Panel";
_savedocumentbutton = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=983063;
 //BA.debugLineNum = 983063;BA.debugLine="Private scanView As B4XView";
_scanview = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=983064;
 //BA.debugLineNum = 983064;BA.debugLine="Private PropertiesPanel As Panel";
_propertiespanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=983065;
 //BA.debugLineNum = 983065;BA.debugLine="Private OpenGalleryButton As Panel";
_opengallerybutton = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=983067;
 //BA.debugLineNum = 983067;BA.debugLine="Private ScrollViewProperties As ScrollView";
_scrollviewproperties = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=983068;
 //BA.debugLineNum = 983068;BA.debugLine="Private docID As EditText";
_docid = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=983069;
 //BA.debugLineNum = 983069;BA.debugLine="Private docName As EditText";
_docname = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=983070;
 //BA.debugLineNum = 983070;BA.debugLine="Private docType As EditText";
_doctype = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=983071;
 //BA.debugLineNum = 983071;BA.debugLine="Private docExpiry As EditText";
_docexpiry = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=983072;
 //BA.debugLineNum = 983072;BA.debugLine="Private SavePropertiesButton As Panel";
_savepropertiesbutton = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=983074;
 //BA.debugLineNum = 983074;BA.debugLine="Dim documentID As String";
_documentid = "";
RDebugUtils.currentLine=983075;
 //BA.debugLineNum = 983075;BA.debugLine="Dim documentName As String";
_documentname = "";
RDebugUtils.currentLine=983076;
 //BA.debugLineNum = 983076;BA.debugLine="Dim documentType As String";
_documenttype = "";
RDebugUtils.currentLine=983077;
 //BA.debugLineNum = 983077;BA.debugLine="Dim documentExpiry As String";
_documentexpiry = "";
RDebugUtils.currentLine=983080;
 //BA.debugLineNum = 983080;BA.debugLine="Dim bitMap As B4XBitmap";
_bitmap = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
RDebugUtils.currentLine=983081;
 //BA.debugLineNum = 983081;BA.debugLine="Dim stringUtils As StringUtils";
_stringutils = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=983082;
 //BA.debugLineNum = 983082;BA.debugLine="Dim Buffer() As Byte";
_buffer = new byte[(int) (0)];
;
RDebugUtils.currentLine=983083;
 //BA.debugLineNum = 983083;BA.debugLine="Dim outputStream As OutputStream";
_outputstream = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=983084;
 //BA.debugLineNum = 983084;BA.debugLine="Dim imgStr As String";
_imgstr = "";
RDebugUtils.currentLine=983085;
 //BA.debugLineNum = 983085;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new b4a.example.b4xdialog();
RDebugUtils.currentLine=983086;
 //BA.debugLineNum = 983086;BA.debugLine="Private DateTemplate As B4XDateTemplate";
_datetemplate = new b4a.example.b4xdatetemplate();
RDebugUtils.currentLine=983087;
 //BA.debugLineNum = 983087;BA.debugLine="End Sub";
return "";
}
public String  _docexpiry_enterpressed(b4a.example.scandocumentpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="scandocumentpage";
if (Debug.shouldDelegate(ba, "docexpiry_enterpressed", false))
	 {return ((String) Debug.delegate(ba, "docexpiry_enterpressed", null));}
RDebugUtils.currentLine=34209792;
 //BA.debugLineNum = 34209792;BA.debugLine="Private Sub docExpiry_EnterPressed";
RDebugUtils.currentLine=34209793;
 //BA.debugLineNum = 34209793;BA.debugLine="Log(\"Enter Pressed\")";
__c.LogImpl("034209793","Enter Pressed",0);
RDebugUtils.currentLine=34209794;
 //BA.debugLineNum = 34209794;BA.debugLine="End Sub";
return "";
}
public void  _docexpiry_focuschanged(b4a.example.scandocumentpage __ref,boolean _hasfocus) throws Exception{
RDebugUtils.currentModule="scandocumentpage";
if (Debug.shouldDelegate(ba, "docexpiry_focuschanged", false))
	 {Debug.delegate(ba, "docexpiry_focuschanged", new Object[] {_hasfocus}); return;}
ResumableSub_docExpiry_FocusChanged rsub = new ResumableSub_docExpiry_FocusChanged(this,__ref,_hasfocus);
rsub.resume(ba, null);
}
public static class ResumableSub_docExpiry_FocusChanged extends BA.ResumableSub {
public ResumableSub_docExpiry_FocusChanged(b4a.example.scandocumentpage parent,b4a.example.scandocumentpage __ref,boolean _hasfocus) {
this.parent = parent;
this.__ref = __ref;
this._hasfocus = _hasfocus;
this.__ref = parent;
}
b4a.example.scandocumentpage __ref;
b4a.example.scandocumentpage parent;
boolean _hasfocus;
int _result = 0;

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
RDebugUtils.currentLine=34996225;
 //BA.debugLineNum = 34996225;BA.debugLine="If HasFocus Then";
if (true) break;

case 1:
//if
this.state = 8;
if (_hasfocus) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=34996226;
 //BA.debugLineNum = 34996226;BA.debugLine="Wait For (Dialog.ShowTemplate(DateTemplate, \"\",";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "scandocumentpage", "docexpiry_focuschanged"), __ref._dialog /*b4a.example.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._datetemplate /*b4a.example.b4xdatetemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 9;
return;
case 9:
//C
this.state = 4;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=34996227;
 //BA.debugLineNum = 34996227;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_result==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=34996228;
 //BA.debugLineNum = 34996228;BA.debugLine="docExpiry.Text = DateTime.Date(DateTemplate.Dat";
__ref._docexpiry /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(parent.__c.DateTime.Date(__ref._datetemplate /*b4a.example.b4xdatetemplate*/ ._getdate /*long*/ (null))));
 if (true) break;

case 7:
//C
this.state = 8;
;
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=34996231;
 //BA.debugLineNum = 34996231;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _documentpropertiesbutton_click(b4a.example.scandocumentpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="scandocumentpage";
if (Debug.shouldDelegate(ba, "documentpropertiesbutton_click", false))
	 {return ((String) Debug.delegate(ba, "documentpropertiesbutton_click", null));}
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Private Sub DocumentPropertiesButton_Click";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="If PropertiesPanel.Visible == False Then";
if (__ref._propertiespanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getVisible()==__c.False) { 
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="PropertiesPanel.Visible = True";
__ref._propertiespanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="ScrollViewProperties.Panel.LoadLayout(\"propertie";
__ref._scrollviewproperties /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().LoadLayout("properties_panel",ba);
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="SavePropertiesButton.Visible = False";
__ref._savepropertiesbutton /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=1507333;
 //BA.debugLineNum = 1507333;BA.debugLine="DocumentPropertiesButton.Visible = False";
__ref._documentpropertiesbutton /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=1507334;
 //BA.debugLineNum = 1507334;BA.debugLine="SaveDocumentButton.Visible = True";
__ref._savedocumentbutton /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
 }else {
RDebugUtils.currentLine=1507337;
 //BA.debugLineNum = 1507337;BA.debugLine="PropertiesPanel.Visible = False";
__ref._propertiespanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=1507338;
 //BA.debugLineNum = 1507338;BA.debugLine="SavePropertiesButton.Visible = False";
__ref._savepropertiesbutton /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
 };
RDebugUtils.currentLine=1507340;
 //BA.debugLineNum = 1507340;BA.debugLine="End Sub";
return "";
}
public String  _image_chooser_result(b4a.example.scandocumentpage __ref,boolean _success,String _pdir,String _pfilename) throws Exception{
__ref = this;
RDebugUtils.currentModule="scandocumentpage";
if (Debug.shouldDelegate(ba, "image_chooser_result", false))
	 {return ((String) Debug.delegate(ba, "image_chooser_result", new Object[] {_success,_pdir,_pfilename}));}
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Sub image_chooser_Result (Success As Boolean, pDir";
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="Log(\"execute Chooser_Result\")";
__c.LogImpl("01376258","execute Chooser_Result",0);
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="If Success = True Then";
if (_success==__c.True) { 
RDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="Log(\"fileDir: \" & pDir)";
__c.LogImpl("01376260","fileDir: "+_pdir,0);
RDebugUtils.currentLine=1376261;
 //BA.debugLineNum = 1376261;BA.debugLine="Log(\"fileName: \" & pFileName)";
__c.LogImpl("01376261","fileName: "+_pfilename,0);
RDebugUtils.currentLine=1376263;
 //BA.debugLineNum = 1376263;BA.debugLine="Dim bmp As B4XBitmap";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
RDebugUtils.currentLine=1376264;
 //BA.debugLineNum = 1376264;BA.debugLine="Try";
try {RDebugUtils.currentLine=1376265;
 //BA.debugLineNum = 1376265;BA.debugLine="bmp = LoadBitmapSample(pDir,pFileName, Max(scan";
_bmp = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(__c.LoadBitmapSample(_pdir,_pfilename,(int) (__c.Max(__ref._scanview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._scanview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight())),(int) (__c.Max(__ref._scanview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._scanview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()))).getObject()));
RDebugUtils.currentLine=1376266;
 //BA.debugLineNum = 1376266;BA.debugLine="bmp = bmp.Resize(scanView.Width, scanView.Heigh";
_bmp = _bmp.Resize(__ref._scanview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._scanview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),__c.True);
RDebugUtils.currentLine=1376267;
 //BA.debugLineNum = 1376267;BA.debugLine="scanView.Visible = True";
__ref._scanview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=1376268;
 //BA.debugLineNum = 1376268;BA.debugLine="scanView.SetBitmap(bmp)";
__ref._scanview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((android.graphics.Bitmap)(_bmp.getObject()));
RDebugUtils.currentLine=1376269;
 //BA.debugLineNum = 1376269;BA.debugLine="bitMap = bmp";
__ref._bitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = _bmp;
RDebugUtils.currentLine=1376271;
 //BA.debugLineNum = 1376271;BA.debugLine="DocumentPropertiesButton.Visible = True";
__ref._documentpropertiesbutton /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=1376272;
 //BA.debugLineNum = 1376272;BA.debugLine="SaveDocumentButton.Visible = False";
__ref._savedocumentbutton /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=1376274;
 //BA.debugLineNum = 1376274;BA.debugLine="ScanDocumentButton.Visible = False";
__ref._scandocumentbutton /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=1376275;
 //BA.debugLineNum = 1376275;BA.debugLine="OpenGalleryButton.Visible = False";
__ref._opengallerybutton /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=1376276;
 //BA.debugLineNum = 1376276;BA.debugLine="Log(\"success read image file\")";
__c.LogImpl("01376276","success read image file",0);
 } 
       catch (Exception e18) {
			ba.setLastException(e18);RDebugUtils.currentLine=1376278;
 //BA.debugLineNum = 1376278;BA.debugLine="Log(LastException)";
__c.LogImpl("01376278",BA.ObjectToString(__c.LastException(ba)),0);
 };
 }else {
RDebugUtils.currentLine=1376281;
 //BA.debugLineNum = 1376281;BA.debugLine="ToastMessageShow(\"failed read image file\",True)";
__c.ToastMessageShow(BA.ObjectToCharSequence("failed read image file"),__c.True);
 };
RDebugUtils.currentLine=1376283;
 //BA.debugLineNum = 1376283;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 1179649;BA.debugLine="If PropertiesPanel.Visible Then";
if (__ref._propertiespanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getVisible()) { 
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="PropertiesPanel.Visible=False";
__ref._propertiespanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=1179654;
 //BA.debugLineNum = 1179654;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
RDebugUtils.currentLine=1179655;
 //BA.debugLineNum = 1179655;BA.debugLine="scanView.SetBitmap(Null)";
__ref._scanview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((android.graphics.Bitmap)(__c.Null));
RDebugUtils.currentLine=1179658;
 //BA.debugLineNum = 1179658;BA.debugLine="DocumentPropertiesButton.Visible = False";
__ref._documentpropertiesbutton /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=1179659;
 //BA.debugLineNum = 1179659;BA.debugLine="SaveDocumentButton.Visible = False";
__ref._savedocumentbutton /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=1179661;
 //BA.debugLineNum = 1179661;BA.debugLine="ScanDocumentButton.Visible = True";
__ref._scandocumentbutton /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=1179662;
 //BA.debugLineNum = 1179662;BA.debugLine="OpenGalleryButton.Visible = True";
__ref._opengallerybutton /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=1179663;
 //BA.debugLineNum = 1179663;BA.debugLine="End Sub";
return "";
}
public String  _opengallerybutton_click(b4a.example.scandocumentpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="scandocumentpage";
if (Debug.shouldDelegate(ba, "opengallerybutton_click", false))
	 {return ((String) Debug.delegate(ba, "opengallerybutton_click", null));}
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Private Sub OpenGalleryButton_Click";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="Log(\"clicked OpenGalleryButton\")";
__c.LogImpl("01638401","clicked OpenGalleryButton",0);
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="Chooser.Initialize(\"image_chooser\")";
__ref._chooser /*anywheresoftware.b4a.phone.Phone.ContentChooser*/ .Initialize("image_chooser");
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_READ_EXTERNAL_ST";
__ref._rp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .CheckAndRequest(ba,__ref._rp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .PERMISSION_READ_EXTERNAL_STORAGE);
RDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="Chooser.Show(\"image/*\", \"choose image\")";
__ref._chooser /*anywheresoftware.b4a.phone.Phone.ContentChooser*/ .Show(ba,"image/*","choose image");
RDebugUtils.currentLine=1638405;
 //BA.debugLineNum = 1638405;BA.debugLine="End Sub";
return "";
}
public String  _saveblob(b4a.example.scandocumentpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="scandocumentpage";
if (Debug.shouldDelegate(ba, "saveblob", false))
	 {return ((String) Debug.delegate(ba, "saveblob", null));}
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Sub saveBlob";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="outputStream.InitializeToBytesArray(0)";
__ref._outputstream /*anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper*/ .InitializeToBytesArray((int) (0));
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="bitMap.WriteToStream(outputStream,100,\"JPEG\")";
__ref._bitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .WriteToStream((java.io.OutputStream)(__ref._outputstream /*anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper*/ .getObject()),(int) (100),BA.getEnumFromString(android.graphics.Bitmap.CompressFormat.class,"JPEG"));
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="outputStream.Close";
__ref._outputstream /*anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper*/ .Close();
RDebugUtils.currentLine=1703940;
 //BA.debugLineNum = 1703940;BA.debugLine="Buffer = outputStream.ToBytesArray";
__ref._buffer /*byte[]*/  = __ref._outputstream /*anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper*/ .ToBytesArray();
RDebugUtils.currentLine=1703941;
 //BA.debugLineNum = 1703941;BA.debugLine="imgStr = stringUtils.EncodeBase64(Buffer)";
__ref._imgstr /*String*/  = __ref._stringutils /*anywheresoftware.b4a.objects.StringUtils*/ .EncodeBase64(__ref._buffer /*byte[]*/ );
RDebugUtils.currentLine=1703942;
 //BA.debugLineNum = 1703942;BA.debugLine="Log(imgStr)";
__c.LogImpl("01703942",__ref._imgstr /*String*/ ,0);
RDebugUtils.currentLine=1703943;
 //BA.debugLineNum = 1703943;BA.debugLine="End Sub";
return "";
}
public String  _savedocumentbutton_click(b4a.example.scandocumentpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="scandocumentpage";
if (Debug.shouldDelegate(ba, "savedocumentbutton_click", false))
	 {return ((String) Debug.delegate(ba, "savedocumentbutton_click", null));}
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Private Sub SaveDocumentButton_Click";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="SaveProperties";
__ref._saveproperties /*String*/ (null);
RDebugUtils.currentLine=1769475;
 //BA.debugLineNum = 1769475;BA.debugLine="If documentName=\"\" Then";
if ((__ref._documentname /*String*/ ).equals("")) { 
RDebugUtils.currentLine=1769476;
 //BA.debugLineNum = 1769476;BA.debugLine="MsgboxAsync(\"Please insert document name propert";
__c.MsgboxAsync(BA.ObjectToCharSequence("Please insert document name properties"),BA.ObjectToCharSequence("Info"),ba);
RDebugUtils.currentLine=1769477;
 //BA.debugLineNum = 1769477;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=1769479;
 //BA.debugLineNum = 1769479;BA.debugLine="If documentType=\"\" Then";
if ((__ref._documenttype /*String*/ ).equals("")) { 
RDebugUtils.currentLine=1769480;
 //BA.debugLineNum = 1769480;BA.debugLine="MsgboxAsync(\"Please insert document type propert";
__c.MsgboxAsync(BA.ObjectToCharSequence("Please insert document type properties"),BA.ObjectToCharSequence("Info"),ba);
RDebugUtils.currentLine=1769481;
 //BA.debugLineNum = 1769481;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=1769484;
 //BA.debugLineNum = 1769484;BA.debugLine="saveBlob";
__ref._saveblob /*String*/ (null);
RDebugUtils.currentLine=1769486;
 //BA.debugLineNum = 1769486;BA.debugLine="MdlConnection.dbSQL.ExecNonQuery(\"INSERT INTO doc";
_mdlconnection._dbsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("INSERT INTO documents(DOCUMENT_ID, NAME, TYPE, EXPIRED, SCAN) VALUES('"+__ref._documentid /*String*/ +"','"+__ref._documentname /*String*/ +"','"+__ref._documenttype /*String*/ +"','"+__ref._documentexpiry /*String*/ +"','"+__ref._imgstr /*String*/ +"')");
RDebugUtils.currentLine=1769487;
 //BA.debugLineNum = 1769487;BA.debugLine="ToastMessageShow(\"sucessfully saved document\",Fal";
__c.ToastMessageShow(BA.ObjectToCharSequence("sucessfully saved document"),__c.False);
RDebugUtils.currentLine=1769489;
 //BA.debugLineNum = 1769489;BA.debugLine="SavePropertiesButton.Visible = False";
__ref._savepropertiesbutton /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=1769491;
 //BA.debugLineNum = 1769491;BA.debugLine="DocumentPropertiesButton.Visible = False";
__ref._documentpropertiesbutton /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=1769492;
 //BA.debugLineNum = 1769492;BA.debugLine="SaveDocumentButton.Visible = False";
__ref._savedocumentbutton /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=1769494;
 //BA.debugLineNum = 1769494;BA.debugLine="ScanDocumentButton.Visible = True";
__ref._scandocumentbutton /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=1769495;
 //BA.debugLineNum = 1769495;BA.debugLine="OpenGalleryButton.Visible = True";
__ref._opengallerybutton /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=1769496;
 //BA.debugLineNum = 1769496;BA.debugLine="End Sub";
return "";
}
public String  _saveproperties(b4a.example.scandocumentpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="scandocumentpage";
if (Debug.shouldDelegate(ba, "saveproperties", false))
	 {return ((String) Debug.delegate(ba, "saveproperties", null));}
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Private Sub SaveProperties";
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="If docName.Text=\"\" Then";
if ((__ref._docname /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()).equals("")) { 
RDebugUtils.currentLine=1572867;
 //BA.debugLineNum = 1572867;BA.debugLine="MsgboxAsync(\"Please insert document name\",\"Info\"";
__c.MsgboxAsync(BA.ObjectToCharSequence("Please insert document name"),BA.ObjectToCharSequence("Info"),ba);
RDebugUtils.currentLine=1572868;
 //BA.debugLineNum = 1572868;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=1572870;
 //BA.debugLineNum = 1572870;BA.debugLine="If docType.Text=\"\" Then";
if ((__ref._doctype /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()).equals("")) { 
RDebugUtils.currentLine=1572871;
 //BA.debugLineNum = 1572871;BA.debugLine="MsgboxAsync(\"Please insert document type\", \"Info";
__c.MsgboxAsync(BA.ObjectToCharSequence("Please insert document type"),BA.ObjectToCharSequence("Info"),ba);
RDebugUtils.currentLine=1572872;
 //BA.debugLineNum = 1572872;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=1572875;
 //BA.debugLineNum = 1572875;BA.debugLine="documentID = docID.Text";
__ref._documentid /*String*/  = __ref._docid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=1572876;
 //BA.debugLineNum = 1572876;BA.debugLine="documentName = docName.Text";
__ref._documentname /*String*/  = __ref._docname /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=1572877;
 //BA.debugLineNum = 1572877;BA.debugLine="documentType = docType.Text";
__ref._documenttype /*String*/  = __ref._doctype /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=1572878;
 //BA.debugLineNum = 1572878;BA.debugLine="documentExpiry = docExpiry.Text";
__ref._documentexpiry /*String*/  = __ref._docexpiry /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=1572880;
 //BA.debugLineNum = 1572880;BA.debugLine="Log(documentID)";
__c.LogImpl("01572880",__ref._documentid /*String*/ ,0);
RDebugUtils.currentLine=1572881;
 //BA.debugLineNum = 1572881;BA.debugLine="Log(documentName)";
__c.LogImpl("01572881",__ref._documentname /*String*/ ,0);
RDebugUtils.currentLine=1572883;
 //BA.debugLineNum = 1572883;BA.debugLine="PropertiesPanel.Visible=False";
__ref._propertiespanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=1572884;
 //BA.debugLineNum = 1572884;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=1245192;
 //BA.debugLineNum = 1245192;BA.debugLine="SavePropertiesButton.Visible = False";
__ref._savepropertiesbutton /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(parent.__c.False);
RDebugUtils.currentLine=1245194;
 //BA.debugLineNum = 1245194;BA.debugLine="DocumentPropertiesButton.Visible = True";
__ref._documentpropertiesbutton /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(parent.__c.True);
RDebugUtils.currentLine=1245195;
 //BA.debugLineNum = 1245195;BA.debugLine="SaveDocumentButton.Visible = False";
__ref._savedocumentbutton /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(parent.__c.False);
RDebugUtils.currentLine=1245197;
 //BA.debugLineNum = 1245197;BA.debugLine="ScanDocumentButton.Visible = False";
__ref._scandocumentbutton /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(parent.__c.False);
RDebugUtils.currentLine=1245198;
 //BA.debugLineNum = 1245198;BA.debugLine="OpenGalleryButton.Visible = False";
__ref._opengallerybutton /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(parent.__c.False);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=1245200;
 //BA.debugLineNum = 1245200;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="Dim i As Intent";
_i = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="i.Initialize(\"android.media.action.IMAGE_CAPTURE\"";
_i.Initialize("android.media.action.IMAGE_CAPTURE","");
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="File.Delete(Provider.SharedFolder, tempImageFile)";
parent.__c.File.Delete(__ref._provider /*b4a.example.fileprovider*/ ._sharedfolder /*String*/ ,__ref._tempimagefile /*String*/ );
RDebugUtils.currentLine=1310725;
 //BA.debugLineNum = 1310725;BA.debugLine="Dim u As Object = Provider.GetFileUri(tempImageFi";
_u = __ref._provider /*b4a.example.fileprovider*/ ._getfileuri /*Object*/ (null,__ref._tempimagefile /*String*/ );
RDebugUtils.currentLine=1310726;
 //BA.debugLineNum = 1310726;BA.debugLine="i.PutExtra(\"output\", u) 'the image will be saved";
_i.PutExtra("output",_u);
RDebugUtils.currentLine=1310727;
 //BA.debugLineNum = 1310727;BA.debugLine="Try";
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
RDebugUtils.currentLine=1310728;
 //BA.debugLineNum = 1310728;BA.debugLine="StartActivityForResult(i)";
__ref._startactivityforresult /*String*/ (null,_i);
RDebugUtils.currentLine=1310729;
 //BA.debugLineNum = 1310729;BA.debugLine="Wait For ion_Event (MethodName As String, Args()";
parent.__c.WaitFor("ion_event", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "scandocumentpage", "takepicture"), null);
this.state = 31;
return;
case 31:
//C
this.state = 4;
_methodname = (String) result[1];
_args = (Object[]) result[2];
;
RDebugUtils.currentLine=1310730;
 //BA.debugLineNum = 1310730;BA.debugLine="Dim bmp As B4XBitmap";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
RDebugUtils.currentLine=1310731;
 //BA.debugLineNum = 1310731;BA.debugLine="If -1 = Args(0) Then";
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
RDebugUtils.currentLine=1310732;
 //BA.debugLineNum = 1310732;BA.debugLine="Try";
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
RDebugUtils.currentLine=1310733;
 //BA.debugLineNum = 1310733;BA.debugLine="Dim in As Intent = Args(1)";
_in = new anywheresoftware.b4a.objects.IntentWrapper();
_in = (anywheresoftware.b4a.objects.IntentWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.IntentWrapper(), (android.content.Intent)(_args[(int) (1)]));
RDebugUtils.currentLine=1310734;
 //BA.debugLineNum = 1310734;BA.debugLine="If File.Exists(Provider.SharedFolder, tempImag";
if (true) break;

case 10:
//if
this.state = 23;
if (parent.__c.File.Exists(__ref._provider /*b4a.example.fileprovider*/ ._sharedfolder /*String*/ ,__ref._tempimagefile /*String*/ )) { 
this.state = 12;
}else 
{RDebugUtils.currentLine=1310748;
 //BA.debugLineNum = 1310748;BA.debugLine="Else If in.HasExtra(\"data\") Then 'try to get t";
if (_in.HasExtra("data")) { 
this.state = 22;
}}
if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=1310735;
 //BA.debugLineNum = 1310735;BA.debugLine="Dim Exif As ExifData";
_exif = new anywheresoftware.b4a.agraham.jpegutils.ExifUtils();
RDebugUtils.currentLine=1310736;
 //BA.debugLineNum = 1310736;BA.debugLine="Exif.Initialize(Provider.SharedFolder, tempIm";
_exif.Initialize(__ref._provider /*b4a.example.fileprovider*/ ._sharedfolder /*String*/ ,__ref._tempimagefile /*String*/ );
RDebugUtils.currentLine=1310737;
 //BA.debugLineNum = 1310737;BA.debugLine="bmp = LoadBitmapSample(Provider.SharedFolder,";
_bmp = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(parent.__c.LoadBitmapSample(__ref._provider /*b4a.example.fileprovider*/ ._sharedfolder /*String*/ ,__ref._tempimagefile /*String*/ ,(int) (parent.__c.Max(_targetwidth,_targetheight)),(int) (parent.__c.Max(_targetwidth,_targetheight))).getObject()));
RDebugUtils.currentLine=1310738;
 //BA.debugLineNum = 1310738;BA.debugLine="Log(\"Orientation: \" & Exif.getAttribute(Exif.";
parent.__c.LogImpl("01310738","Orientation: "+_exif.getAttribute(_exif.TAG_ORIENTATION),0);
RDebugUtils.currentLine=1310739;
 //BA.debugLineNum = 1310739;BA.debugLine="Select Exif.getAttribute(Exif.TAG_ORIENTATION";
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
RDebugUtils.currentLine=1310741;
 //BA.debugLineNum = 1310741;BA.debugLine="bmp = bmp.Rotate(180)";
_bmp = _bmp.Rotate((int) (180));
 if (true) break;

case 17:
//C
this.state = 20;
RDebugUtils.currentLine=1310743;
 //BA.debugLineNum = 1310743;BA.debugLine="bmp = bmp.Rotate(90)";
_bmp = _bmp.Rotate((int) (90));
 if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=1310745;
 //BA.debugLineNum = 1310745;BA.debugLine="bmp = bmp.Rotate(270)";
_bmp = _bmp.Rotate((int) (270));
 if (true) break;

case 20:
//C
this.state = 23;
;
RDebugUtils.currentLine=1310747;
 //BA.debugLineNum = 1310747;BA.debugLine="bmp = bmp.Resize(TargetWidth, TargetHeight, T";
_bmp = _bmp.Resize(_targetwidth,_targetheight,parent.__c.True);
 if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=1310749;
 //BA.debugLineNum = 1310749;BA.debugLine="Dim jo As JavaObject = in";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_in.getObject()));
RDebugUtils.currentLine=1310750;
 //BA.debugLineNum = 1310750;BA.debugLine="bmp = jo.RunMethodJO(\"getExtras\", Null).RunMe";
_bmp = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_jo.RunMethodJO("getExtras",(Object[])(parent.__c.Null)).RunMethod("get",new Object[]{(Object)("data")})));
 if (true) break;

case 23:
//C
this.state = 26;
;
RDebugUtils.currentLine=1310752;
 //BA.debugLineNum = 1310752;BA.debugLine="bitMap = bmp";
__ref._bitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = _bmp;
 if (true) break;

case 25:
//C
this.state = 26;
this.catchState = 29;
RDebugUtils.currentLine=1310754;
 //BA.debugLineNum = 1310754;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("01310754",BA.ObjectToString(parent.__c.LastException(ba)),0);
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
RDebugUtils.currentLine=1310757;
 //BA.debugLineNum = 1310757;BA.debugLine="CallSubDelayed3(Me, \"Image_Available\", bmp.IsIni";
parent.__c.CallSubDelayed3(ba,parent,"Image_Available",(Object)(_bmp.IsInitialized()),(Object)(_bmp));
 if (true) break;

case 29:
//C
this.state = 30;
this.catchState = 0;
RDebugUtils.currentLine=1310759;
 //BA.debugLineNum = 1310759;BA.debugLine="ToastMessageShow(\"Camera is not available.\", Tru";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Camera is not available."),parent.__c.True);
RDebugUtils.currentLine=1310760;
 //BA.debugLineNum = 1310760;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("01310760",BA.ObjectToString(parent.__c.LastException(ba)),0);
RDebugUtils.currentLine=1310761;
 //BA.debugLineNum = 1310761;BA.debugLine="CallSubDelayed3(Me, \"Image_Available\", False, Nu";
parent.__c.CallSubDelayed3(ba,parent,"Image_Available",(Object)(parent.__c.False),parent.__c.Null);
 if (true) break;
if (true) break;

case 30:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=1310763;
 //BA.debugLineNum = 1310763;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Sub StartActivityForResult(i As Intent)";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="Dim jo As JavaObject = Me";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="jo = jo.RunMethod(\"getBA\", Null)";
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.RunMethod("getBA",(Object[])(__c.Null))));
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="ion = jo.CreateEvent(\"anywheresoftware.b4a.IOnAct";
__ref._ion /*Object*/  = _jo.CreateEvent(ba,"anywheresoftware.b4a.IOnActivityResult","ion",__c.Null);
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="jo.RunMethod(\"startActivityForResult\", Array(ion,";
_jo.RunMethod("startActivityForResult",new Object[]{__ref._ion /*Object*/ ,(Object)(_i.getObject())});
RDebugUtils.currentLine=1441797;
 //BA.debugLineNum = 1441797;BA.debugLine="End Sub";
return "";
}
}