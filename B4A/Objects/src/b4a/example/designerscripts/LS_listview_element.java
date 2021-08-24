package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_listview_element{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("panel1").vw.setLeft((int)((0d / 100 * width)));
views.get("panel1").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("panel1").vw.setTop((int)((0d / 100 * height)));
views.get("panel1").vw.setHeight((int)((100d / 100 * height) - ((0d / 100 * height))));
views.get("picture").vw.setLeft((int)((0d / 100 * width)));
views.get("picture").vw.setWidth((int)((25d / 100 * width) - ((0d / 100 * width))));
views.get("picture").vw.setTop((int)((0d / 100 * height)));
views.get("picture").vw.setHeight((int)((100d / 100 * height) - ((0d / 100 * height))));
views.get("idlabel").vw.setLeft((int)((30d / 100 * width)));
views.get("idlabel").vw.setWidth((int)((88d / 100 * width) - ((30d / 100 * width))));
views.get("idlabel").vw.setTop((int)((0d / 100 * height)));
views.get("idlabel").vw.setHeight((int)((50d / 100 * height) - ((0d / 100 * height))));
views.get("documentlabel").vw.setLeft((int)((30d / 100 * width)));
views.get("documentlabel").vw.setWidth((int)((88d / 100 * width) - ((30d / 100 * width))));
views.get("documentlabel").vw.setTop((int)((50d / 100 * height)));
views.get("documentlabel").vw.setHeight((int)((100d / 100 * height) - ((50d / 100 * height))));
views.get("checkboxselect").vw.setLeft((int)((88d / 100 * width)));
views.get("checkboxselect").vw.setWidth((int)((100d / 100 * width) - ((88d / 100 * width))));
views.get("checkboxselect").vw.setTop((int)((50d / 100 * height)));
views.get("checkboxselect").vw.setHeight((int)((100d / 100 * height) - ((50d / 100 * height))));

}
}