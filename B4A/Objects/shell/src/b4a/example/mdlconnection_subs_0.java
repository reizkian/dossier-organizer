package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class mdlconnection_subs_0 {


public static RemoteObject  _connection(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("connection (mdlconnection) ","mdlconnection",6,_ba,mdlconnection.mostCurrent,12);
if (RapidSub.canDelegate("connection")) { return b4a.example.mdlconnection.remoteMe.runUserSub(false, "mdlconnection","connection", _ba);}
RemoteObject _str = RemoteObject.createImmutable("");
;
 BA.debugLineNum = 12;BA.debugLine="Sub connection";
Debug.ShouldStop(2048);
 BA.debugLineNum = 13;BA.debugLine="Dim str As String";
Debug.ShouldStop(4096);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 14;BA.debugLine="str = DBUtils.CopyDBFromAssets(\"dossier_organizer";
Debug.ShouldStop(8192);
_str = mdlconnection.mostCurrent._dbutils.runMethod(true,"_copydbfromassets" /*RemoteObject*/ ,_ba,(Object)(RemoteObject.createImmutable("dossier_organizer.db")));Debug.locals.put("str", _str);
 BA.debugLineNum = 15;BA.debugLine="dbSQL.Initialize(str, \"dossier_organizer.db\", Tru";
Debug.ShouldStop(16384);
mdlconnection._dbsql.runVoidMethod ("Initialize",(Object)(_str),(Object)(BA.ObjectToString("dossier_organizer.db")),(Object)(mdlconnection.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 16;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Dim dbSQL As SQL";
mdlconnection._dbsql = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 8;BA.debugLine="Dim dbCursor As Cursor";
mdlconnection._dbcursor = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}