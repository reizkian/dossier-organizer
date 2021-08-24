
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class listdocumentpage {
    public static RemoteObject myClass;
	public listdocumentpage() {
	}
    public static PCBA staticBA = new PCBA(null, listdocumentpage.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _scrollview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _lblback = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _listviewdocuments = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
public static RemoteObject _searchdocument = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _bitmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
public static RemoteObject _buffer = null;
public static RemoteObject _stringutils = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
public static RemoteObject _inputstream = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
public static RemoteObject _id = RemoteObject.createImmutable(0);
public static RemoteObject _docid = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _docname = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _doctype = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _docexpiry = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _listpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _updatepanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static b4a.example.main _main = null;
public static b4a.example.dbutils _dbutils = null;
public static b4a.example.mdlconnection _mdlconnection = null;
public static b4a.example.starter _starter = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"bitMap",_ref.getField(false, "_bitmap"),"Buffer",_ref.getField(false, "_buffer"),"docExpiry",_ref.getField(false, "_docexpiry"),"docID",_ref.getField(false, "_docid"),"docName",_ref.getField(false, "_docname"),"docType",_ref.getField(false, "_doctype"),"ID",_ref.getField(false, "_id"),"inputStream",_ref.getField(false, "_inputstream"),"lblBack",_ref.getField(false, "_lblback"),"ListPanel",_ref.getField(false, "_listpanel"),"ListViewDocuments",_ref.getField(false, "_listviewdocuments"),"Root",_ref.getField(false, "_root"),"ScrollView1",_ref.getField(false, "_scrollview1"),"searchDocument",_ref.getField(false, "_searchdocument"),"stringUtils",_ref.getField(false, "_stringutils"),"UpdatePanel",_ref.getField(false, "_updatepanel"),"xui",_ref.getField(false, "_xui")};
}
}