
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xmainpage {
    public static RemoteObject myClass;
	public b4xmainpage() {
	}
    public static PCBA staticBA = new PCBA(null, b4xmainpage.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _lblback = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _scrollview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _scandocument = RemoteObject.declareNull("b4a.example.scandocumentpage");
public static RemoteObject _scandocumentbtn = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _listdocument = RemoteObject.declareNull("b4a.example.listdocumentpage");
public static RemoteObject _listdocumentbtn = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _dossier = RemoteObject.declareNull("b4a.example.dossierpage");
public static RemoteObject _dossierbtn = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.main _main = null;
public static b4a.example.dbutils _dbutils = null;
public static b4a.example.mdlconnection _mdlconnection = null;
public static b4a.example.starter _starter = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static b4a.example.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"DateUtils",_ref.getField(false, "_dateutils"),"Dossier",_ref.getField(false, "_dossier"),"DossierBtn",_ref.getField(false, "_dossierbtn"),"lblBack",_ref.getField(false, "_lblback"),"ListDocument",_ref.getField(false, "_listdocument"),"ListDocumentBtn",_ref.getField(false, "_listdocumentbtn"),"Root",_ref.getField(false, "_root"),"ScanDocument",_ref.getField(false, "_scandocument"),"ScanDocumentBtn",_ref.getField(false, "_scandocumentbtn"),"ScrollView1",_ref.getField(false, "_scrollview1"),"xui",_ref.getField(false, "_xui")};
}
}