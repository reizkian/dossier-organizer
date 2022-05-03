package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_scandocument{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("imagepanel").vw.setLeft((int)((0d / 100 * width)));
views.get("imagepanel").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("imagepanel").vw.setTop((int)((0d / 100 * height)));
views.get("imagepanel").vw.setHeight((int)((85d / 100 * height) - ((0d / 100 * height))));
views.get("imagepanel").vw.setLeft((int)((50d / 100 * width) - (views.get("imagepanel").vw.getWidth() / 2)));
views.get("scanview").vw.setLeft((int)((50d / 100 * width) - (views.get("scanview").vw.getWidth() / 2)));
views.get("scanview").vw.setTop((int)(0d));
views.get("scanview").vw.setHeight((int)((85d / 100 * height) - (0d)));
views.get("controlpanel").vw.setTop((int)((85d / 100 * height)));
views.get("controlpanel").vw.setHeight((int)((100d / 100 * height) - ((85d / 100 * height))));
views.get("documentpropertiesbutton").vw.setTop((int)((0d / 100 * height)));
views.get("documentpropertiesbutton").vw.setHeight((int)((15d / 100 * height) - ((0d / 100 * height))));
views.get("documentpropertiesbutton").vw.setLeft((int)((38d / 100 * width)));
views.get("documentpropertiesbutton").vw.setWidth((int)((63d / 100 * width) - ((38d / 100 * width))));
views.get("icondocumentproperties").vw.setTop((int)((1d / 100 * height)));
views.get("icondocumentproperties").vw.setHeight((int)((10d / 100 * height) - ((1d / 100 * height))));
views.get("icondocumentproperties").vw.setLeft((int)((0d / 100 * width)));
views.get("icondocumentproperties").vw.setWidth((int)((25d / 100 * width) - ((0d / 100 * width))));
views.get("labeldocumentproperties").vw.setTop((int)((7d / 100 * height)));
views.get("labeldocumentproperties").vw.setHeight((int)((15d / 100 * height) - ((7d / 100 * height))));
views.get("labeldocumentproperties").vw.setLeft((int)((0d / 100 * width)));
views.get("labeldocumentproperties").vw.setWidth((int)((25d / 100 * width) - ((0d / 100 * width))));
views.get("scandocumentbutton").vw.setTop((int)((0d / 100 * height)));
views.get("scandocumentbutton").vw.setHeight((int)((15d / 100 * height) - ((0d / 100 * height))));
views.get("scandocumentbutton").vw.setLeft((int)((25d / 100 * width)));
views.get("scandocumentbutton").vw.setWidth((int)((50d / 100 * width) - ((25d / 100 * width))));
views.get("iconscandocument").vw.setTop((int)((7d / 100 * height)));
views.get("iconscandocument").vw.setHeight((int)((15d / 100 * height) - ((7d / 100 * height))));
views.get("iconscandocument").vw.setLeft((int)((0d / 100 * width)));
views.get("iconscandocument").vw.setWidth((int)((25d / 100 * width) - ((0d / 100 * width))));
views.get("labelscandocument").vw.setTop((int)((1d / 100 * height)));
views.get("labelscandocument").vw.setHeight((int)((10d / 100 * height) - ((1d / 100 * height))));
views.get("labelscandocument").vw.setLeft((int)((0d / 100 * width)));
views.get("labelscandocument").vw.setWidth((int)((25d / 100 * width) - ((0d / 100 * width))));
views.get("savedocumentbutton").vw.setTop((int)((0d / 100 * height)));
views.get("savedocumentbutton").vw.setHeight((int)((15d / 100 * height) - ((0d / 100 * height))));
views.get("savedocumentbutton").vw.setLeft((int)((38d / 100 * width)));
views.get("savedocumentbutton").vw.setWidth((int)((63d / 100 * width) - ((38d / 100 * width))));
views.get("iconsavedocument").vw.setTop((int)((1d / 100 * height)));
views.get("iconsavedocument").vw.setHeight((int)((10d / 100 * height) - ((1d / 100 * height))));
views.get("iconsavedocument").vw.setLeft((int)((0d / 100 * width)));
views.get("iconsavedocument").vw.setWidth((int)((25d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 29;BA.debugLine="labelSaveDocument.SetTopAndBottom(7%y,15%y)"[ScanDocument/General script]
views.get("labelsavedocument").vw.setTop((int)((7d / 100 * height)));
views.get("labelsavedocument").vw.setHeight((int)((15d / 100 * height) - ((7d / 100 * height))));
//BA.debugLineNum = 30;BA.debugLine="labelSaveDocument.SetLeftAndRight(0%x,25%x)"[ScanDocument/General script]
views.get("labelsavedocument").vw.setLeft((int)((0d / 100 * width)));
views.get("labelsavedocument").vw.setWidth((int)((25d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 32;BA.debugLine="OpenGalleryButton.SetTopAndBottom(0%y,15%y)"[ScanDocument/General script]
views.get("opengallerybutton").vw.setTop((int)((0d / 100 * height)));
views.get("opengallerybutton").vw.setHeight((int)((15d / 100 * height) - ((0d / 100 * height))));
//BA.debugLineNum = 33;BA.debugLine="OpenGalleryButton.SetLeftAndRight(50%x,75%x)"[ScanDocument/General script]
views.get("opengallerybutton").vw.setLeft((int)((50d / 100 * width)));
views.get("opengallerybutton").vw.setWidth((int)((75d / 100 * width) - ((50d / 100 * width))));
//BA.debugLineNum = 34;BA.debugLine="iconOpenGallery.SetTopAndBottom(1%y,10%y)"[ScanDocument/General script]
views.get("iconopengallery").vw.setTop((int)((1d / 100 * height)));
views.get("iconopengallery").vw.setHeight((int)((10d / 100 * height) - ((1d / 100 * height))));
//BA.debugLineNum = 35;BA.debugLine="iconOpenGallery.SetLeftAndRight(0%x,25%x)"[ScanDocument/General script]
views.get("iconopengallery").vw.setLeft((int)((0d / 100 * width)));
views.get("iconopengallery").vw.setWidth((int)((25d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 36;BA.debugLine="labelOpenGallery.SetTopAndBottom(7%y,15%y)"[ScanDocument/General script]
views.get("labelopengallery").vw.setTop((int)((7d / 100 * height)));
views.get("labelopengallery").vw.setHeight((int)((15d / 100 * height) - ((7d / 100 * height))));
//BA.debugLineNum = 37;BA.debugLine="labelOpenGallery.SetLeftAndRight(0%x,25%x)"[ScanDocument/General script]
views.get("labelopengallery").vw.setLeft((int)((0d / 100 * width)));
views.get("labelopengallery").vw.setWidth((int)((25d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 39;BA.debugLine="PropertiesPanel.SetTopAndBottom(0%y,85%y)"[ScanDocument/General script]
views.get("propertiespanel").vw.setTop((int)((0d / 100 * height)));
views.get("propertiespanel").vw.setHeight((int)((85d / 100 * height) - ((0d / 100 * height))));
//BA.debugLineNum = 40;BA.debugLine="labelPropertiesPanel.SetTopAndBottom(0%y,8%y)"[ScanDocument/General script]
views.get("labelpropertiespanel").vw.setTop((int)((0d / 100 * height)));
views.get("labelpropertiespanel").vw.setHeight((int)((8d / 100 * height) - ((0d / 100 * height))));
//BA.debugLineNum = 41;BA.debugLine="ScrollViewProperties.SetTopAndBottom(8%y,78%y)"[ScanDocument/General script]
views.get("scrollviewproperties").vw.setTop((int)((8d / 100 * height)));
views.get("scrollviewproperties").vw.setHeight((int)((78d / 100 * height) - ((8d / 100 * height))));
//BA.debugLineNum = 42;BA.debugLine="SavePropertiesButton.SetTopAndBottom(78%y,85%y)"[ScanDocument/General script]
views.get("savepropertiesbutton").vw.setTop((int)((78d / 100 * height)));
views.get("savepropertiesbutton").vw.setHeight((int)((85d / 100 * height) - ((78d / 100 * height))));
//BA.debugLineNum = 43;BA.debugLine="SavePropertiesButton.SetLeftAndRight(0%x,55%x)"[ScanDocument/General script]
views.get("savepropertiesbutton").vw.setLeft((int)((0d / 100 * width)));
views.get("savepropertiesbutton").vw.setWidth((int)((55d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 44;BA.debugLine="SavePropertiesButton.HorizontalCenter=50%x"[ScanDocument/General script]
views.get("savepropertiesbutton").vw.setLeft((int)((50d / 100 * width) - (views.get("savepropertiesbutton").vw.getWidth() / 2)));

}
}