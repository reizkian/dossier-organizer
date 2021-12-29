package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_listdossier{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("listviewdossier").vw.setLeft((int)((0d / 100 * width)));
views.get("listviewdossier").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("listviewdossier").vw.setTop((int)((10d / 100 * height)));
views.get("listviewdossier").vw.setHeight((int)((100d / 100 * height) - ((10d / 100 * height))));
views.get("searchdossier").vw.setLeft((int)((15d / 100 * width)));
views.get("searchdossier").vw.setWidth((int)((97d / 100 * width) - ((15d / 100 * width))));
views.get("searchdossier").vw.setTop((int)((0d / 100 * height)));
views.get("searchdossier").vw.setHeight((int)((10d / 100 * height) - ((0d / 100 * height))));
views.get("searchicon").vw.setLeft((int)((3d / 100 * width)));
views.get("searchicon").vw.setWidth((int)((15d / 100 * width) - ((3d / 100 * width))));
views.get("searchicon").vw.setTop((int)((0d / 100 * height)));
views.get("searchicon").vw.setHeight((int)((10d / 100 * height) - ((0d / 100 * height))));
views.get("adddossierbtn").vw.setLeft((int)((60d / 100 * width)));
views.get("adddossierbtn").vw.setWidth((int)((95d / 100 * width) - ((60d / 100 * width))));
views.get("adddossierbtn").vw.setTop((int)((85d / 100 * width)));
views.get("adddossierbtn").vw.setHeight((int)((95d / 100 * width) - ((85d / 100 * width))));
views.get("adddossierbtn").vw.setLeft((int)((78d / 100 * width) - (views.get("adddossierbtn").vw.getWidth() / 2)));
views.get("adddossierbtn").vw.setTop((int)((93d / 100 * height) - (views.get("adddossierbtn").vw.getHeight() / 2)));
views.get("addicon").vw.setLeft((int)((8d / 100 * width)));
views.get("addicon").vw.setWidth((int)((18d / 100 * width) - ((8d / 100 * width))));
views.get("addlabel").vw.setLeft((int)((15d / 100 * width)));
views.get("addlabel").vw.setWidth((int)((35d / 100 * width) - ((15d / 100 * width))));
views.get("documentslistview").vw.setLeft((int)((0d / 100 * width)));
views.get("documentslistview").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("documentslistview").vw.setTop((int)((15d / 100 * height)));
views.get("documentslistview").vw.setHeight((int)((100d / 100 * height) - ((15d / 100 * height))));
views.get("dossierpropertiespanel").vw.setLeft((int)((0d / 100 * width)));
views.get("dossierpropertiespanel").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("dossierpropertiespanel").vw.setTop((int)((0d / 100 * height)));
views.get("dossierpropertiespanel").vw.setHeight((int)((15d / 100 * height) - ((0d / 100 * height))));
views.get("edittextdossiername").vw.setLeft((int)((10d / 100 * width)));
views.get("edittextdossiername").vw.setWidth((int)((90d / 100 * width) - ((10d / 100 * width))));
//BA.debugLineNum = 30;BA.debugLine="saveDossierBtn.SetLeftAndRight(60%x,95%x)"[listdossier/General script]
views.get("savedossierbtn").vw.setLeft((int)((60d / 100 * width)));
views.get("savedossierbtn").vw.setWidth((int)((95d / 100 * width) - ((60d / 100 * width))));
//BA.debugLineNum = 31;BA.debugLine="saveDossierBtn.SetTopAndBottom(85%x,95%x)"[listdossier/General script]
views.get("savedossierbtn").vw.setTop((int)((85d / 100 * width)));
views.get("savedossierbtn").vw.setHeight((int)((95d / 100 * width) - ((85d / 100 * width))));
//BA.debugLineNum = 32;BA.debugLine="saveDossierBtn.HorizontalCenter = 78%x"[listdossier/General script]
views.get("savedossierbtn").vw.setLeft((int)((78d / 100 * width) - (views.get("savedossierbtn").vw.getWidth() / 2)));
//BA.debugLineNum = 33;BA.debugLine="saveDossierBtn.VerticalCenter = 93%y"[listdossier/General script]
views.get("savedossierbtn").vw.setTop((int)((93d / 100 * height) - (views.get("savedossierbtn").vw.getHeight() / 2)));
//BA.debugLineNum = 35;BA.debugLine="saveIcon.SetLeftAndRight(8%x,18%x)"[listdossier/General script]
views.get("saveicon").vw.setLeft((int)((8d / 100 * width)));
views.get("saveicon").vw.setWidth((int)((18d / 100 * width) - ((8d / 100 * width))));
//BA.debugLineNum = 36;BA.debugLine="saveLabel.SetLeftAndRight(15%x,35%x)"[listdossier/General script]
views.get("savelabel").vw.setLeft((int)((15d / 100 * width)));
views.get("savelabel").vw.setWidth((int)((35d / 100 * width) - ((15d / 100 * width))));

}
}