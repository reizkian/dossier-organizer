
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class scandocumentpage {
    public static RemoteObject myClass;
	public scandocumentpage() {
	}
    public static PCBA staticBA = new PCBA(null, scandocumentpage.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _scrollview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _panel1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _lblback = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _tempimagefile = RemoteObject.createImmutable("");
public static RemoteObject _provider = RemoteObject.declareNull("b4a.example.fileprovider");
public static RemoteObject _ion = RemoteObject.declareNull("Object");
public static RemoteObject _scandocumentbutton = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _documentpropertiesbutton = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _savedocumentbutton = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _scanview = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _propertiespanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _scrollviewproperties = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _opengallerybutton = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _docid = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _docname = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _doctype = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _docexpiry = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _savepropertiesbutton = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _documentid = RemoteObject.createImmutable("");
public static RemoteObject _documentname = RemoteObject.createImmutable("");
public static RemoteObject _documenttype = RemoteObject.createImmutable("");
public static RemoteObject _documentexpiry = RemoteObject.createImmutable("");
public static RemoteObject _bitmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
public static RemoteObject _stringutils = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
public static RemoteObject _buffer = null;
public static RemoteObject _outputstream = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
public static RemoteObject _imgstr = RemoteObject.createImmutable("");
public static b4a.example.main _main = null;
public static b4a.example.dbutils _dbutils = null;
public static b4a.example.mdlconnection _mdlconnection = null;
public static b4a.example.starter _starter = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"bitMap",_ref.getField(false, "_bitmap"),"Buffer",_ref.getField(false, "_buffer"),"docExpiry",_ref.getField(false, "_docexpiry"),"docID",_ref.getField(false, "_docid"),"docName",_ref.getField(false, "_docname"),"docType",_ref.getField(false, "_doctype"),"documentExpiry",_ref.getField(false, "_documentexpiry"),"documentID",_ref.getField(false, "_documentid"),"documentName",_ref.getField(false, "_documentname"),"DocumentPropertiesButton",_ref.getField(false, "_documentpropertiesbutton"),"documentType",_ref.getField(false, "_documenttype"),"imgStr",_ref.getField(false, "_imgstr"),"ion",_ref.getField(false, "_ion"),"lblBack",_ref.getField(false, "_lblback"),"OpenGalleryButton",_ref.getField(false, "_opengallerybutton"),"outputStream",_ref.getField(false, "_outputstream"),"Panel1",_ref.getField(false, "_panel1"),"PropertiesPanel",_ref.getField(false, "_propertiespanel"),"Provider",_ref.getField(false, "_provider"),"Root",_ref.getField(false, "_root"),"SaveDocumentButton",_ref.getField(false, "_savedocumentbutton"),"SavePropertiesButton",_ref.getField(false, "_savepropertiesbutton"),"ScanDocumentButton",_ref.getField(false, "_scandocumentbutton"),"scanView",_ref.getField(false, "_scanview"),"ScrollView1",_ref.getField(false, "_scrollview1"),"ScrollViewProperties",_ref.getField(false, "_scrollviewproperties"),"stringUtils",_ref.getField(false, "_stringutils"),"tempImageFile",_ref.getField(false, "_tempimagefile"),"xui",_ref.getField(false, "_xui")};
}
}