package p098dc;

import android.util.AttributeSet;
import android.view.animation.Animation;
import java.io.File;

/* renamed from: dc.h */
/* loaded from: classes3.dex */
public abstract class AbstractC17874h {

    /* renamed from: dc.h$a */
    /* loaded from: classes3.dex */
    protected static class a {

        /* renamed from: a */
        public int f90319a;

        /* renamed from: b */
        public float f90320b;

        protected a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public static a m94405a(String str) {
            a aVar = new a();
            aVar.f90319a = 0;
            aVar.f90320b = 0.0f;
            if (str != null) {
                if (str.endsWith("%")) {
                    aVar.f90319a = 1;
                    aVar.f90320b = Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
                    return aVar;
                }
                if (str.endsWith("%p")) {
                    aVar.f90319a = 2;
                    aVar.f90320b = Float.parseFloat(str.substring(0, str.length() - 2)) / 100.0f;
                    return aVar;
                }
                aVar.f90319a = 0;
                aVar.f90320b = Float.parseFloat(str);
            }
            return aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m94404a(AttributeSet attributeSet, Animation animation, File file) {
        if (attributeSet.getAttributeValue(null, "android:duration") != null) {
            animation.setDuration(attributeSet.getAttributeIntValue(null, "android:duration", 0));
        }
        if (attributeSet.getAttributeValue(null, "android:startOffset") != null) {
            animation.setStartOffset(attributeSet.getAttributeIntValue(null, "android:startOffset", 0));
        }
        if (attributeSet.getAttributeValue(null, "android:fillEnabled") != null) {
            animation.setFillEnabled(attributeSet.getAttributeBooleanValue(null, "android:fillEnabled", false));
        }
        if (attributeSet.getAttributeValue(null, "android:fillBefore") != null) {
            animation.setFillBefore(attributeSet.getAttributeBooleanValue(null, "android:fillBefore", true));
        }
        if (attributeSet.getAttributeValue(null, "android:fillAfter") != null) {
            animation.setFillAfter(attributeSet.getAttributeBooleanValue(null, "android:fillAfter", false));
        }
        String attributeValue = attributeSet.getAttributeValue(null, "android:repeatCount");
        if (attributeValue != null) {
            if (attributeValue.equals("infinite")) {
                animation.setRepeatCount(-1);
            } else {
                animation.setRepeatCount(Integer.parseInt(attributeValue));
            }
        }
        String attributeValue2 = attributeSet.getAttributeValue(null, "android:repeatMode");
        if (attributeValue2 != null) {
            if (attributeValue2.equals("reverse")) {
                animation.setRepeatMode(2);
            } else {
                animation.setRepeatMode(1);
            }
        }
        String attributeValue3 = attributeSet.getAttributeValue(null, "android:zAdjustment");
        if (attributeValue3 != null) {
            if (attributeValue3.equals("top")) {
                animation.setZAdjustment(1);
            } else if (attributeValue3.equals("bottom")) {
                animation.setZAdjustment(-1);
            } else {
                animation.setZAdjustment(0);
            }
        }
        if (attributeSet.getAttributeValue(null, "android:background") != null) {
            animation.setBackgroundColor(attributeSet.getAttributeIntValue(null, "android:background", 0));
        }
        if (attributeSet.getAttributeValue(null, "android:detachWallpaper") != null) {
            animation.setDetachWallpaper(attributeSet.getAttributeBooleanValue(null, "android:detachWallpaper", false));
        }
        String attributeValue4 = attributeSet.getAttributeValue(null, "android:interpolator");
        if (attributeValue4 != null) {
            File file2 = new File(file, attributeValue4);
            if (file2.exists()) {
                animation.setInterpolator(AbstractC17867a.m94396d(file2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract Animation mo94403b();
}
