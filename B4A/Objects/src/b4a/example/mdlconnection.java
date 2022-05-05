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
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.dbutils _dbutils = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public static String  _connection(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="mdlconnection";
if (Debug.shouldDelegate(null, "connection", false))
	 {return ((String) Debug.delegate(null, "connection", new Object[] {_ba}));}
String _str = "";
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Sub connection";
RDebugUtils.currentLine=4259841;
 //BA.debugLineNum = 4259841;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="str = DBUtils.CopyDBFromAssets(\"dossier_organizer";
_str = mostCurrent._dbutils._copydbfromassets /*String*/ (_ba,"dossier_organizer.db");
RDebugUtils.currentLine=4259843;
 //BA.debugLineNum = 4259843;BA.debugLine="dbSQL.Initialize(str, \"dossier_organizer.db\", Tru";
_dbsql.Initialize(_str,"dossier_organizer.db",anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=4259844;
 //BA.debugLineNum = 4259844;BA.debugLine="End Sub";
return "";
}
}