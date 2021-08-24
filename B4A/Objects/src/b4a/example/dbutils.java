package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class dbutils {
private static dbutils mostCurrent = new dbutils();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.example.main _main = null;
public b4a.example.mdlconnection _mdlconnection = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public static String  _copydbfromassets(anywheresoftware.b4a.BA _ba,String _filename) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "copydbfromassets", false))
	 {return ((String) Debug.delegate(null, "copydbfromassets", new Object[] {_ba,_filename}));}
anywheresoftware.b4a.objects.RuntimePermissions _runtimepermission = null;
String _targetdir = "";
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Sub CopyDBFromAssets (FileName As String) As Strin";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="Dim runtimePermission As RuntimePermissions";
_runtimepermission = new anywheresoftware.b4a.objects.RuntimePermissions();
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="Dim TargetDir As String";
_targetdir = "";
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="If File.ExternalWritable Then";
if (anywheresoftware.b4a.keywords.Common.File.getExternalWritable()) { 
RDebugUtils.currentLine=3145732;
 //BA.debugLineNum = 3145732;BA.debugLine="TargetDir = runtimePermission.GetSafeDirDefaultE";
_targetdir = _runtimepermission.GetSafeDirDefaultExternal("");
 }else {
RDebugUtils.currentLine=3145734;
 //BA.debugLineNum = 3145734;BA.debugLine="TargetDir = File.DirInternal";
_targetdir = anywheresoftware.b4a.keywords.Common.File.getDirInternal();
 };
RDebugUtils.currentLine=3145736;
 //BA.debugLineNum = 3145736;BA.debugLine="If File.Exists(TargetDir, FileName) = False Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_targetdir,_filename)==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=3145737;
 //BA.debugLineNum = 3145737;BA.debugLine="File.Copy(File.DirAssets, FileName, TargetDir, F";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_filename,_targetdir,_filename);
 };
RDebugUtils.currentLine=3145739;
 //BA.debugLineNum = 3145739;BA.debugLine="Return TargetDir";
if (true) return _targetdir;
RDebugUtils.currentLine=3145740;
 //BA.debugLineNum = 3145740;BA.debugLine="End Sub";
return "";
}
}