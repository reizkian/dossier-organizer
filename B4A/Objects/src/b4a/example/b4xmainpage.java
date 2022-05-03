package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xmainpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.b4xmainpage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xmainpage.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.LabelWrapper _lblback = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _scrollview1 = null;
public b4a.example.scandocumentpage _scandocument = null;
public anywheresoftware.b4a.objects.PanelWrapper _scandocumentbtn = null;
public b4a.example.listdocumentpage _listdocument = null;
public anywheresoftware.b4a.objects.PanelWrapper _listdocumentbtn = null;
public b4a.example.dossierpage _dossier = null;
public anywheresoftware.b4a.objects.PanelWrapper _dossierbtn = null;
public b4a.example.main _main = null;
public b4a.example.dbutils _dbutils = null;
public b4a.example.mdlconnection _mdlconnection = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public String  _b4xpage_created(b4a.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="Root.LoadLayout(\"header\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("header",ba);
RDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="ScrollView1.Panel.LoadLayout(\"mainpage\")";
__ref._scrollview1 /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().LoadLayout("mainpage",ba);
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="lblBack.Visible = False";
__ref._lblback /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=458759;
 //BA.debugLineNum = 458759;BA.debugLine="MdlConnection.connection";
_mdlconnection._connection /*String*/ (ba);
RDebugUtils.currentLine=458761;
 //BA.debugLineNum = 458761;BA.debugLine="ScanDocument.Initialize";
__ref._scandocument /*b4a.example.scandocumentpage*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=458762;
 //BA.debugLineNum = 458762;BA.debugLine="B4XPages.AddPage(\"ScanDocument\", ScanDocument)";
_b4xpages._addpage /*String*/ (ba,"ScanDocument",(Object)(__ref._scandocument /*b4a.example.scandocumentpage*/ ));
RDebugUtils.currentLine=458763;
 //BA.debugLineNum = 458763;BA.debugLine="ListDocument.Initialize";
__ref._listdocument /*b4a.example.listdocumentpage*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=458764;
 //BA.debugLineNum = 458764;BA.debugLine="B4XPages.AddPage(\"ListDocument\", ListDocument)";
_b4xpages._addpage /*String*/ (ba,"ListDocument",(Object)(__ref._listdocument /*b4a.example.listdocumentpage*/ ));
RDebugUtils.currentLine=458765;
 //BA.debugLineNum = 458765;BA.debugLine="Dossier.Initialize";
__ref._dossier /*b4a.example.dossierpage*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=458766;
 //BA.debugLineNum = 458766;BA.debugLine="B4XPages.AddPage(\"Dossier\", Dossier)";
_b4xpages._addpage /*String*/ (ba,"Dossier",(Object)(__ref._dossier /*b4a.example.dossierpage*/ ));
RDebugUtils.currentLine=458767;
 //BA.debugLineNum = 458767;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=327685;
 //BA.debugLineNum = 327685;BA.debugLine="Dim lblBack As Label";
_lblback = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=327686;
 //BA.debugLineNum = 327686;BA.debugLine="Dim ScrollView1 As ScrollView";
_scrollview1 = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=327689;
 //BA.debugLineNum = 327689;BA.debugLine="Dim ScanDocument As ScanDocumentPage";
_scandocument = new b4a.example.scandocumentpage();
RDebugUtils.currentLine=327690;
 //BA.debugLineNum = 327690;BA.debugLine="Private ScanDocumentBtn As Panel";
_scandocumentbtn = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=327693;
 //BA.debugLineNum = 327693;BA.debugLine="Dim ListDocument As ListDocumentPage";
_listdocument = new b4a.example.listdocumentpage();
RDebugUtils.currentLine=327694;
 //BA.debugLineNum = 327694;BA.debugLine="Private ListDocumentBtn As Panel";
_listdocumentbtn = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=327697;
 //BA.debugLineNum = 327697;BA.debugLine="Dim Dossier As DossierPage";
_dossier = new b4a.example.dossierpage();
RDebugUtils.currentLine=327698;
 //BA.debugLineNum = 327698;BA.debugLine="Private DossierBtn As Panel";
_dossierbtn = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=327700;
 //BA.debugLineNum = 327700;BA.debugLine="End Sub";
return "";
}
public String  _dossierbtn_click(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "dossierbtn_click", false))
	 {return ((String) Debug.delegate(ba, "dossierbtn_click", null));}
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Private Sub DossierBtn_Click";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="B4XPages.ShowPage(\"Dossier\")";
_b4xpages._showpage /*String*/ (ba,"Dossier");
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.b4xmainpage __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="End Sub";
return "";
}
public String  _listdocumentbtn_click(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "listdocumentbtn_click", false))
	 {return ((String) Debug.delegate(ba, "listdocumentbtn_click", null));}
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Private Sub ListDocumentBtn_Click";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="B4XPages.ShowPage(\"ListDocument\")";
_b4xpages._showpage /*String*/ (ba,"ListDocument");
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="End Sub";
return "";
}
public String  _scandocumentbtn_click(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "scandocumentbtn_click", false))
	 {return ((String) Debug.delegate(ba, "scandocumentbtn_click", null));}
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Private Sub ScanDocumentBtn_Click";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="B4XPages.ShowPage(\"ScanDocument\")";
_b4xpages._showpage /*String*/ (ba,"ScanDocument");
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="End Sub";
return "";
}
}