package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_mainpage{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
((anywheresoftware.b4a.keywords.LayoutBuilder.DesignerTextSizeMethod)views.get("label1").vw).setTextSize((float)(18d));
((anywheresoftware.b4a.keywords.LayoutBuilder.DesignerTextSizeMethod)views.get("label3").vw).setTextSize((float)(18d));
((anywheresoftware.b4a.keywords.LayoutBuilder.DesignerTextSizeMethod)views.get("label5").vw).setTextSize((float)(18d));

}
}