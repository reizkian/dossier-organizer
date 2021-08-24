
package b4a.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class mdlconnection implements IRemote{
	public static mdlconnection mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public mdlconnection() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
     private static PCBA pcBA = new PCBA(null, mdlconnection.class);
    static {
		mostCurrent = new mdlconnection();
        remoteMe = RemoteObject.declareNull("b4a.example.mdlconnection");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("mdlconnection"), "b4a.example.mdlconnection");
        RDebug.INSTANCE.eventTargets.put(new DeviceClass("b4a.example.mdlconnection"), new java.lang.ref.WeakReference<PCBA> (pcBA));
	}
   
	public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
	public PCBA create(Object[] args) throws ClassNotFoundException{
        throw new RuntimeException("CREATE is not supported.");
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _dbsql = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
public static RemoteObject _dbcursor = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
public static b4a.example.main _main = null;
public static b4a.example.dbutils _dbutils = null;
public static b4a.example.starter _starter = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
  public Object[] GetGlobals() {
		return new Object[] {"B4XCollections",Debug.moduleToString(b4a.example.b4xcollections.class),"B4XPages",Debug.moduleToString(b4a.example.b4xpages.class),"dbCursor",mdlconnection._dbcursor,"dbSQL",mdlconnection._dbsql,"DBUtils",Debug.moduleToString(b4a.example.dbutils.class),"Main",Debug.moduleToString(b4a.example.main.class),"Starter",Debug.moduleToString(b4a.example.starter.class)};
}
}