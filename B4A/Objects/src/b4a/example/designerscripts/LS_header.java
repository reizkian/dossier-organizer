package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_header{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 1;BA.debugLine="imgTECHHeader.HorizontalCenter = 50%x"[header/General script]
views.get("imgtechheader").vw.setLeft((int)((50d / 100 * width) - (views.get("imgtechheader").vw.getWidth() / 2)));
//BA.debugLineNum = 2;BA.debugLine="pnlHeader.SetTopAndBottom(0%y, 11%y)"[header/General script]
views.get("pnlheader").vw.setTop((int)((0d / 100 * height)));
views.get("pnlheader").vw.setHeight((int)((11d / 100 * height) - ((0d / 100 * height))));
//BA.debugLineNum = 3;BA.debugLine="lblBack.SetTopAndBottom(0%y, 11%y)"[header/General script]
views.get("lblback").vw.setTop((int)((0d / 100 * height)));
views.get("lblback").vw.setHeight((int)((11d / 100 * height) - ((0d / 100 * height))));
//BA.debugLineNum = 4;BA.debugLine="lblBack.SetLeftAndRight(0%y, 9%y)"[header/General script]
views.get("lblback").vw.setLeft((int)((0d / 100 * height)));
views.get("lblback").vw.setWidth((int)((9d / 100 * height) - ((0d / 100 * height))));
//BA.debugLineNum = 5;BA.debugLine="imgTECHHeader.SetLeftAndRight(29%y,60%y)"[header/General script]
views.get("imgtechheader").vw.setLeft((int)((29d / 100 * height)));
views.get("imgtechheader").vw.setWidth((int)((60d / 100 * height) - ((29d / 100 * height))));
//BA.debugLineNum = 6;BA.debugLine="imgTECHHeader.SetTopAndBottom(5%x,15%x)"[header/General script]
views.get("imgtechheader").vw.setTop((int)((5d / 100 * width)));
views.get("imgtechheader").vw.setHeight((int)((15d / 100 * width) - ((5d / 100 * width))));
//BA.debugLineNum = 7;BA.debugLine="imgTECHHeader.HorizontalCenter=50%x"[header/General script]
views.get("imgtechheader").vw.setLeft((int)((50d / 100 * width) - (views.get("imgtechheader").vw.getWidth() / 2)));
//BA.debugLineNum = 8;BA.debugLine="ScrollView1.SetTopAndBottom(0%y, 89%y)"[header/General script]
views.get("scrollview1").vw.setTop((int)((0d / 100 * height)));
views.get("scrollview1").vw.setHeight((int)((89d / 100 * height) - ((0d / 100 * height))));
//BA.debugLineNum = 9;BA.debugLine="ScrollView1.SetLeftAndRight(0%x,100%x)"[header/General script]
views.get("scrollview1").vw.setLeft((int)((0d / 100 * width)));
views.get("scrollview1").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 10;BA.debugLine="Panel1.SetTopAndBottom(11%y, 100%y)"[header/General script]
views.get("panel1").vw.setTop((int)((11d / 100 * height)));
views.get("panel1").vw.setHeight((int)((100d / 100 * height) - ((11d / 100 * height))));
//BA.debugLineNum = 11;BA.debugLine="Panel1.SetLeftAndRight(0%x,100%x)"[header/General script]
views.get("panel1").vw.setLeft((int)((0d / 100 * width)));
views.get("panel1").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));

}
}