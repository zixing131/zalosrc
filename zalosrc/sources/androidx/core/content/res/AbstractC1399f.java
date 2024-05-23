package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p176g1.AbstractC19202d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.content.res.f */
/* loaded from: classes2.dex */
public abstract class AbstractC1399f {
    /* renamed from: a */
    private static a m7070a(a aVar, int i11, int i12, boolean z11, int i13) {
        if (aVar != null) {
            return aVar;
        }
        if (z11) {
            return new a(i11, i13, i12);
        }
        return new a(i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Shader m7071b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            TypedArray m7115k = AbstractC1404k.m7115k(resources, theme, attributeSet, AbstractC19202d.GradientColor);
            float m7110f = AbstractC1404k.m7110f(m7115k, xmlPullParser, "startX", AbstractC19202d.GradientColor_android_startX, 0.0f);
            float m7110f2 = AbstractC1404k.m7110f(m7115k, xmlPullParser, "startY", AbstractC19202d.GradientColor_android_startY, 0.0f);
            float m7110f3 = AbstractC1404k.m7110f(m7115k, xmlPullParser, "endX", AbstractC19202d.GradientColor_android_endX, 0.0f);
            float m7110f4 = AbstractC1404k.m7110f(m7115k, xmlPullParser, "endY", AbstractC19202d.GradientColor_android_endY, 0.0f);
            float m7110f5 = AbstractC1404k.m7110f(m7115k, xmlPullParser, "centerX", AbstractC19202d.GradientColor_android_centerX, 0.0f);
            float m7110f6 = AbstractC1404k.m7110f(m7115k, xmlPullParser, "centerY", AbstractC19202d.GradientColor_android_centerY, 0.0f);
            int m7111g = AbstractC1404k.m7111g(m7115k, xmlPullParser, ZinstantMetaConstant.IMPRESSION_META_TYPE, AbstractC19202d.GradientColor_android_type, 0);
            int m7106b = AbstractC1404k.m7106b(m7115k, xmlPullParser, "startColor", AbstractC19202d.GradientColor_android_startColor, 0);
            boolean m7114j = AbstractC1404k.m7114j(xmlPullParser, "centerColor");
            int m7106b2 = AbstractC1404k.m7106b(m7115k, xmlPullParser, "centerColor", AbstractC19202d.GradientColor_android_centerColor, 0);
            int m7106b3 = AbstractC1404k.m7106b(m7115k, xmlPullParser, "endColor", AbstractC19202d.GradientColor_android_endColor, 0);
            int m7111g2 = AbstractC1404k.m7111g(m7115k, xmlPullParser, "tileMode", AbstractC19202d.GradientColor_android_tileMode, 0);
            float m7110f7 = AbstractC1404k.m7110f(m7115k, xmlPullParser, "gradientRadius", AbstractC19202d.GradientColor_android_gradientRadius, 0.0f);
            m7115k.recycle();
            a m7070a = m7070a(m7072c(resources, xmlPullParser, attributeSet, theme), m7106b, m7106b3, m7114j, m7106b2);
            if (m7111g != 1) {
                if (m7111g != 2) {
                    return new LinearGradient(m7110f, m7110f2, m7110f3, m7110f4, m7070a.f6142a, m7070a.f6143b, m7073d(m7111g2));
                }
                return new SweepGradient(m7110f5, m7110f6, m7070a.f6142a, m7070a.f6143b);
            }
            if (m7110f7 > 0.0f) {
                return new RadialGradient(m7110f5, m7110f6, m7110f7, m7070a.f6142a, m7070a.f6143b, m7073d(m7111g2));
            }
            throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:            throw new org.xmlpull.v1.XmlPullParserException(r9.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static a m7072c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int depth2 = xmlPullParser.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray m7115k = AbstractC1404k.m7115k(resources, theme, attributeSet, AbstractC19202d.GradientColorItem);
                boolean hasValue = m7115k.hasValue(AbstractC19202d.GradientColorItem_android_color);
                boolean hasValue2 = m7115k.hasValue(AbstractC19202d.GradientColorItem_android_offset);
                if (!hasValue || !hasValue2) {
                    break;
                }
                int color = m7115k.getColor(AbstractC19202d.GradientColorItem_android_color, 0);
                float f11 = m7115k.getFloat(AbstractC19202d.GradientColorItem_android_offset, 0.0f);
                m7115k.recycle();
                arrayList2.add(Integer.valueOf(color));
                arrayList.add(Float.valueOf(f11));
            }
        }
        if (arrayList2.size() > 0) {
            return new a(arrayList2, arrayList);
        }
        return null;
    }

    /* renamed from: d */
    private static Shader.TileMode m7073d(int i11) {
        if (i11 != 1) {
            if (i11 != 2) {
                return Shader.TileMode.CLAMP;
            }
            return Shader.TileMode.MIRROR;
        }
        return Shader.TileMode.REPEAT;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.content.res.f$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        final int[] f6142a;

        /* renamed from: b */
        final float[] f6143b;

        a(List list, List list2) {
            int size = list.size();
            this.f6142a = new int[size];
            this.f6143b = new float[size];
            for (int i11 = 0; i11 < size; i11++) {
                this.f6142a[i11] = ((Integer) list.get(i11)).intValue();
                this.f6143b[i11] = ((Float) list2.get(i11)).floatValue();
            }
        }

        a(int i11, int i12) {
            this.f6142a = new int[]{i11, i12};
            this.f6143b = new float[]{0.0f, 1.0f};
        }

        a(int i11, int i12, int i13) {
            this.f6142a = new int[]{i11, i12, i13};
            this.f6143b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
