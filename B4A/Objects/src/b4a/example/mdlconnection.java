package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class mdlconnection {
private static mdlconnection mostCurrent = new mdlconnection();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.sql.SQL _dbsql = null;
public static anywheresoftware.b4a.sql.SQL.CursorWrapper _dbcursor = null;
public b4a.example.main _main = null;
public b4a.example.dbutils _dbutils = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public static String  _connection(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="mdlconnection";
if (Debug.shouldDelegate(null, "connection", false))
	 {return ((String) Debug.delegate(null, "connection", new Object[] {_ba}));}
String _str = "";
RDebugUtils.currentLine=11730944;
 //BA.debugLineNum = 11730944;BA.debugLine="Sub connection";
RDebugUtils.currentLine=11730945;
 //BA.debugLineNum = 11730945;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=11730946;
 //BA.debugLineNum = 11730946;BA.debugLine="str = DBUtils.CopyDBFromAssets(\"dossier_organizer";
_str = mostCurrent._dbutils._copydbfromassets /*String*/ (_ba,"dossier_organizer.db");
RDebugUtils.currentLine=11730947;
 //BA.debugLineNum = 11730947;BA.debugLine="dbSQL.Initialize(str, \"dossier_organizer.db\", Tru";
_dbsql.Initialize(_str,"dossier_organizer.db",anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=11730948;
 //BA.debugLineNum = 11730948;BA.debugLine="End Sub";
return "";
}
}