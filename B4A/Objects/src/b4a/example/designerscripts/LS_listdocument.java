package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_listdocument{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("listviewdocuments").vw.setLeft((int)((0d / 100 * width)));
views.get("listviewdocuments").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("listviewdocuments").vw.setTop((int)((10d / 100 * height)));
views.get("listviewdocuments").vw.setHeight((int)((100d / 100 * height) - ((10d / 100 * height))));
views.get("searchdocument").vw.setLeft((int)((15d / 100 * width)));
views.get("searchdocument").vw.setWidth((int)((97d / 100 * width) - ((15d / 100 * width))));
views.get("searchdocument").vw.setTop((int)((0d / 100 * height)));
views.get("searchdocument").vw.setHeight((int)((10d / 100 * height) - ((0d / 100 * height))));
views.get("searchicon").vw.setLeft((int)((3d / 100 * width)));
views.get("searchicon").vw.setWidth((int)((15d / 100 * width) - ((3d / 100 * width))));
views.get("searchicon").vw.setTop((int)((0d / 100 * height)));
views.get("searchicon").vw.setHeight((int)((10d / 100 * height) - ((0d / 100 * height))));
views.get("docid").vw.setLeft((int)((5d / 100 * width)));
views.get("docid").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("docid").vw.setTop((int)((3d / 100 * height)));
views.get("docid").vw.setHeight((int)((13d / 100 * height) - ((3d / 100 * height))));
views.get("docname").vw.setLeft((int)((5d / 100 * width)));
views.get("docname").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
//BA.debugLineNum = 16;BA.debugLine="docName.SetTopAndBottom(16%y, 26%y)"[listdocument/General script]
views.get("docname").vw.setTop((int)((16d / 100 * height)));
views.get("docname").vw.setHeight((int)((26d / 100 * height) - ((16d / 100 * height))));
//BA.debugLineNum = 17;BA.debugLine="docType.SetLeftAndRight(5%x, 95%x)"[listdocument/General script]
views.get("doctype").vw.setLeft((int)((5d / 100 * width)));
views.get("doctype").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
//BA.debugLineNum = 18;BA.debugLine="docType.SetTopAndBottom(29%y, 39%y)"[listdocument/General script]
views.get("doctype").vw.setTop((int)((29d / 100 * height)));
views.get("doctype").vw.setHeight((int)((39d / 100 * height) - ((29d / 100 * height))));
//BA.debugLineNum = 19;BA.debugLine="docExpiry.SetLeftAndRight(5%x, 95%x)"[listdocument/General script]
views.get("docexpiry").vw.setLeft((int)((5d / 100 * width)));
views.get("docexpiry").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
//BA.debugLineNum = 20;BA.debugLine="docExpiry.SetTopAndBottom(42%y, 52%y)"[listdocument/General script]
views.get("docexpiry").vw.setTop((int)((42d / 100 * height)));
views.get("docexpiry").vw.setHeight((int)((52d / 100 * height) - ((42d / 100 * height))));
//BA.debugLineNum = 22;BA.debugLine="UpdatePropertiesButton.SetLeftAndRight(20%x, 80%x)"[listdocument/General script]
views.get("updatepropertiesbutton").vw.setLeft((int)((20d / 100 * width)));
views.get("updatepropertiesbutton").vw.setWidth((int)((80d / 100 * width) - ((20d / 100 * width))));
//BA.debugLineNum = 23;BA.debugLine="UpdatePropertiesButton.SetTopAndBottom(57%y, 67%y)"[listdocument/General script]
views.get("updatepropertiesbutton").vw.setTop((int)((57d / 100 * height)));
views.get("updatepropertiesbutton").vw.setHeight((int)((67d / 100 * height) - ((57d / 100 * height))));
//BA.debugLineNum = 24;BA.debugLine="iconSaveProperties.SetLeftAndRight(0%x, 10%x)"[listdocument/General script]
views.get("iconsaveproperties").vw.setLeft((int)((0d / 100 * width)));
views.get("iconsaveproperties").vw.setWidth((int)((10d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 25;BA.debugLine="iconSaveLabel.SetLeftAndRight(12%x,60%x)"[listdocument/General script]
views.get("iconsavelabel").vw.setLeft((int)((12d / 100 * width)));
views.get("iconsavelabel").vw.setWidth((int)((60d / 100 * width) - ((12d / 100 * width))));

}
}