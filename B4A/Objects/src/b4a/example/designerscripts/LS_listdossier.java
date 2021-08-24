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

}
}