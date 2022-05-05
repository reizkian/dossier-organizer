
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class dossierpage {
    public static RemoteObject myClass;
	public dossierpage() {
	}
    public static PCBA staticBA = new PCBA(null, dossierpage.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _scrollview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _panel1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _lblback = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _bitmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
public static RemoteObject _buffer = null;
public static RemoteObject _stringutils = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
public static RemoteObject _inputstream = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
public static RemoteObject _adddossierbtn = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _adddossierpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _dossierlistpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _idlabel = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _picture = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _documentlabel = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _documentslistview = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _listviewdossier = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
public static RemoteObject _checkboxselect = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
public static RemoteObject _searchdossier = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _edittextdossiername = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _dossiername = RemoteObject.createImmutable("");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.main _main = null;
public static b4a.example.dbutils _dbutils = null;
public static b4a.example.mdlconnection _mdlconnection = null;
public static b4a.example.starter _starter = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static b4a.example.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"addDossierBtn",_ref.getField(false, "_adddossierbtn"),"AddDossierPanel",_ref.getField(false, "_adddossierpanel"),"bitMap",_ref.getField(false, "_bitmap"),"Buffer",_ref.getField(false, "_buffer"),"CheckBoxSelect",_ref.getField(false, "_checkboxselect"),"DateUtils",_ref.getField(false, "_dateutils"),"documentLabel",_ref.getField(false, "_documentlabel"),"DocumentsListView",_ref.getField(false, "_documentslistview"),"DossierListPanel",_ref.getField(false, "_dossierlistpanel"),"DossierName",_ref.getField(false, "_dossiername"),"EditTextDossierName",_ref.getField(false, "_edittextdossiername"),"idLabel",_ref.getField(false, "_idlabel"),"inputStream",_ref.getField(false, "_inputstream"),"lblBack",_ref.getField(false, "_lblback"),"ListViewDossier",_ref.getField(false, "_listviewdossier"),"Panel1",_ref.getField(false, "_panel1"),"picture",_ref.getField(false, "_picture"),"Root",_ref.getField(false, "_root"),"ScrollView1",_ref.getField(false, "_scrollview1"),"searchDossier",_ref.getField(false, "_searchdossier"),"stringUtils",_ref.getField(false, "_stringutils"),"xui",_ref.getField(false, "_xui")};
}
}