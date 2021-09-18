package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class dbutils_subs_0 {


public static RemoteObject  _copydbfromassets(RemoteObject _ba,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("CopyDBFromAssets (dbutils) ","dbutils",5,_ba,dbutils.mostCurrent,21);
if (RapidSub.canDelegate("copydbfromassets")) { return b4a.example.dbutils.remoteMe.runUserSub(false, "dbutils","copydbfromassets", _ba, _filename);}
RemoteObject _runtimepermission = RemoteObject.declareNull("anywheresoftware.b4a.objects.RuntimePermissions");
RemoteObject _targetdir = RemoteObject.createImmutable("");
;
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 21;BA.debugLine="Sub CopyDBFromAssets (FileName As String) As Strin";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="Dim runtimePermission As RuntimePermissions";
Debug.ShouldStop(2097152);
_runtimepermission = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");Debug.locals.put("runtimePermission", _runtimepermission);
 BA.debugLineNum = 23;BA.debugLine="Dim TargetDir As String";
Debug.ShouldStop(4194304);
_targetdir = RemoteObject.createImmutable("");Debug.locals.put("TargetDir", _targetdir);
 BA.debugLineNum = 24;BA.debugLine="If File.ExternalWritable Then";
Debug.ShouldStop(8388608);
if (dbutils.mostCurrent.__c.getField(false,"File").runMethod(true,"getExternalWritable").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 25;BA.debugLine="TargetDir = runtimePermission.GetSafeDirDefaultE";
Debug.ShouldStop(16777216);
_targetdir = _runtimepermission.runMethod(true,"GetSafeDirDefaultExternal",(Object)(RemoteObject.createImmutable("")));Debug.locals.put("TargetDir", _targetdir);
 }else {
 BA.debugLineNum = 27;BA.debugLine="TargetDir = File.DirInternal";
Debug.ShouldStop(67108864);
_targetdir = dbutils.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal");Debug.locals.put("TargetDir", _targetdir);
 };
 BA.debugLineNum = 29;BA.debugLine="If File.Exists(TargetDir, FileName) = False Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",dbutils.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(_targetdir),(Object)(_filename)),dbutils.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 30;BA.debugLine="File.Copy(File.DirAssets, FileName, TargetDir, F";
Debug.ShouldStop(536870912);
dbutils.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(dbutils.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(_filename),(Object)(_targetdir),(Object)(_filename));
 };
 BA.debugLineNum = 32;BA.debugLine="Return TargetDir";
Debug.ShouldStop(-2147483648);
Debug.CheckDeviceExceptions();if (true) return _targetdir;
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}