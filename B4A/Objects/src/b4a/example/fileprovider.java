package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class fileprovider extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.fileprovider");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.fileprovider.class).invoke(this, new Object[] {null});
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
public String _sharedfolder = "";
public boolean _usefileprovider = false;
public anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
public b4a.example.main _main = null;
public b4a.example.dbutils _dbutils = null;
public b4a.example.mdlconnection _mdlconnection = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public String  _initialize(b4a.example.fileprovider __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="fileprovider";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
anywheresoftware.b4a.phone.Phone _p = null;
RDebugUtils.currentLine=11010048;
 //BA.debugLineNum = 11010048;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=11010049;
 //BA.debugLineNum = 11010049;BA.debugLine="Dim p As Phone";
_p = new anywheresoftware.b4a.phone.Phone();
RDebugUtils.currentLine=11010050;
 //BA.debugLineNum = 11010050;BA.debugLine="If p.SdkVersion >= 24 Or File.ExternalWritable =";
if (_p.getSdkVersion()>=24 || __c.File.getExternalWritable()==__c.False) { 
RDebugUtils.currentLine=11010051;
 //BA.debugLineNum = 11010051;BA.debugLine="UseFileProvider = True";
__ref._usefileprovider /*boolean*/  = __c.True;
RDebugUtils.currentLine=11010052;
 //BA.debugLineNum = 11010052;BA.debugLine="SharedFolder = File.Combine(File.DirInternal, \"s";
__ref._sharedfolder /*String*/  = __c.File.Combine(__c.File.getDirInternal(),"shared");
RDebugUtils.currentLine=11010053;
 //BA.debugLineNum = 11010053;BA.debugLine="File.MakeDir(\"\", SharedFolder)";
__c.File.MakeDir("",__ref._sharedfolder /*String*/ );
 }else {
RDebugUtils.currentLine=11010055;
 //BA.debugLineNum = 11010055;BA.debugLine="UseFileProvider = False";
__ref._usefileprovider /*boolean*/  = __c.False;
RDebugUtils.currentLine=11010056;
 //BA.debugLineNum = 11010056;BA.debugLine="SharedFolder = rp.GetSafeDirDefaultExternal(\"sha";
__ref._sharedfolder /*String*/  = __ref._rp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .GetSafeDirDefaultExternal("shared");
 };
RDebugUtils.currentLine=11010058;
 //BA.debugLineNum = 11010058;BA.debugLine="Log($\"Using FileProvider? ${UseFileProvider}\"$)";
__c.LogImpl("911010058",("Using FileProvider? "+__c.SmartStringFormatter("",(Object)(__ref._usefileprovider /*boolean*/ ))+""),0);
RDebugUtils.currentLine=11010059;
 //BA.debugLineNum = 11010059;BA.debugLine="End Sub";
return "";
}
public Object  _getfileuri(b4a.example.fileprovider __ref,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="fileprovider";
if (Debug.shouldDelegate(ba, "getfileuri", true))
	 {return ((Object) Debug.delegate(ba, "getfileuri", new Object[] {_filename}));}
anywheresoftware.b4j.object.JavaObject _uri = null;
anywheresoftware.b4j.object.JavaObject _f = null;
anywheresoftware.b4j.object.JavaObject _fp = null;
anywheresoftware.b4j.object.JavaObject _context = null;
RDebugUtils.currentLine=11075584;
 //BA.debugLineNum = 11075584;BA.debugLine="Public Sub GetFileUri (FileName As String) As Obje";
RDebugUtils.currentLine=11075586;
 //BA.debugLineNum = 11075586;BA.debugLine="If UseFileProvider = False Then";
if (__ref._usefileprovider /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=11075587;
 //BA.debugLineNum = 11075587;BA.debugLine="Dim uri As JavaObject";
_uri = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=11075588;
 //BA.debugLineNum = 11075588;BA.debugLine="Return uri.InitializeStatic(\"android.net.Uri\").R";
if (true) return _uri.InitializeStatic("android.net.Uri").RunMethod("parse",new Object[]{(Object)("file://"+__c.File.Combine(__ref._sharedfolder /*String*/ ,_filename))});
 }else {
RDebugUtils.currentLine=11075590;
 //BA.debugLineNum = 11075590;BA.debugLine="Dim f As JavaObject";
_f = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=11075591;
 //BA.debugLineNum = 11075591;BA.debugLine="f.InitializeNewInstance(\"java.io.File\", Array(Sh";
_f.InitializeNewInstance("java.io.File",new Object[]{(Object)(__ref._sharedfolder /*String*/ ),(Object)(_filename)});
RDebugUtils.currentLine=11075592;
 //BA.debugLineNum = 11075592;BA.debugLine="Dim fp As JavaObject";
_fp = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=11075593;
 //BA.debugLineNum = 11075593;BA.debugLine="Dim context As JavaObject";
_context = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=11075594;
 //BA.debugLineNum = 11075594;BA.debugLine="context.InitializeContext";
_context.InitializeContext(ba);
RDebugUtils.currentLine=11075595;
 //BA.debugLineNum = 11075595;BA.debugLine="fp.InitializeStatic(\"android.support.v4.content.";
_fp.InitializeStatic("androidx.core.content.FileProvider");
RDebugUtils.currentLine=11075596;
 //BA.debugLineNum = 11075596;BA.debugLine="Return fp.RunMethod(\"getUriForFile\", Array(conte";
if (true) return _fp.RunMethod("getUriForFile",new Object[]{(Object)(_context.getObject()),(Object)(__c.Application.getPackageName()+".provider"),(Object)(_f.getObject())});
 };
RDebugUtils.currentLine=11075598;
 //BA.debugLineNum = 11075598;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4a.example.fileprovider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="fileprovider";
RDebugUtils.currentLine=10944512;
 //BA.debugLineNum = 10944512;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=10944513;
 //BA.debugLineNum = 10944513;BA.debugLine="Public SharedFolder As String";
_sharedfolder = "";
RDebugUtils.currentLine=10944514;
 //BA.debugLineNum = 10944514;BA.debugLine="Public UseFileProvider As Boolean";
_usefileprovider = false;
RDebugUtils.currentLine=10944515;
 //BA.debugLineNum = 10944515;BA.debugLine="Private rp As RuntimePermissions";
_rp = new anywheresoftware.b4a.objects.RuntimePermissions();
RDebugUtils.currentLine=10944516;
 //BA.debugLineNum = 10944516;BA.debugLine="End Sub";
return "";
}
public String  _setfileuriasintentdata(b4a.example.fileprovider __ref,anywheresoftware.b4a.objects.IntentWrapper _intent,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="fileprovider";
if (Debug.shouldDelegate(ba, "setfileuriasintentdata", true))
	 {return ((String) Debug.delegate(ba, "setfileuriasintentdata", new Object[] {_intent,_filename}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=11141120;
 //BA.debugLineNum = 11141120;BA.debugLine="Public Sub SetFileUriAsIntentData (Intent As Inten";
RDebugUtils.currentLine=11141121;
 //BA.debugLineNum = 11141121;BA.debugLine="Dim jo As JavaObject = Intent";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_intent.getObject()));
RDebugUtils.currentLine=11141122;
 //BA.debugLineNum = 11141122;BA.debugLine="jo.RunMethod(\"setData\", Array(GetFileUri(FileName";
_jo.RunMethod("setData",new Object[]{__ref._getfileuri /*Object*/ (null,_filename)});
RDebugUtils.currentLine=11141123;
 //BA.debugLineNum = 11141123;BA.debugLine="Intent.Flags = Bit.Or(Intent.Flags, 1) 'FLAG_GRAN";
_intent.setFlags(__c.Bit.Or(_intent.getFlags(),(int) (1)));
RDebugUtils.currentLine=11141124;
 //BA.debugLineNum = 11141124;BA.debugLine="End Sub";
return "";
}
}