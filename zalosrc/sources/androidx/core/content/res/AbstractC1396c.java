package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p176g1.AbstractC19199a;
import p176g1.AbstractC19202d;
import p252j1.AbstractC20900a;

/* renamed from: androidx.core.content.res.c */
/* loaded from: classes2.dex */
public abstract class AbstractC1396c {

    /* renamed from: a */
    private static final ThreadLocal f6127a = new ThreadLocal();

    /* renamed from: a */
    public static ColorStateList m7030a(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m7031b(resources, xmlPullParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: b */
    public static ColorStateList m7031b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return m7034e(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    /* renamed from: c */
    private static TypedValue m7032c() {
        ThreadLocal threadLocal = f6127a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    /* renamed from: d */
    public static ColorStateList m7033d(Resources resources, int i11, Resources.Theme theme) {
        try {
            return m7030a(resources, resources.getXml(i11), theme);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static ColorStateList m7034e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int color;
        float f11;
        Resources resources2 = resources;
        int i11 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20];
        int[] iArr2 = new int[20];
        int i12 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i11 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray m7037h = m7037h(resources2, theme, attributeSet, AbstractC19202d.ColorStateListItem);
                int resourceId = m7037h.getResourceId(AbstractC19202d.ColorStateListItem_android_color, -1);
                if (resourceId != -1 && !m7035f(resources2, resourceId)) {
                    try {
                        color = m7030a(resources2, resources2.getXml(resourceId), theme).getDefaultColor();
                    } catch (Exception unused) {
                        color = m7037h.getColor(AbstractC19202d.ColorStateListItem_android_color, -65281);
                    }
                } else {
                    color = m7037h.getColor(AbstractC19202d.ColorStateListItem_android_color, -65281);
                }
                float f12 = 1.0f;
                if (m7037h.hasValue(AbstractC19202d.ColorStateListItem_android_alpha)) {
                    f12 = m7037h.getFloat(AbstractC19202d.ColorStateListItem_android_alpha, 1.0f);
                } else if (m7037h.hasValue(AbstractC19202d.ColorStateListItem_alpha)) {
                    f12 = m7037h.getFloat(AbstractC19202d.ColorStateListItem_alpha, 1.0f);
                }
                if (Build.VERSION.SDK_INT >= 31 && m7037h.hasValue(AbstractC19202d.ColorStateListItem_android_lStar)) {
                    f11 = m7037h.getFloat(AbstractC19202d.ColorStateListItem_android_lStar, -1.0f);
                } else {
                    f11 = m7037h.getFloat(AbstractC19202d.ColorStateListItem_lStar, -1.0f);
                }
                m7037h.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr3 = new int[attributeCount];
                int i13 = 0;
                for (int i14 = 0; i14 < attributeCount; i14++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i14);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != AbstractC19199a.alpha && attributeNameResource != AbstractC19199a.lStar) {
                        int i15 = i13 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i14, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr3[i13] = attributeNameResource;
                        i13 = i15;
                    }
                }
                int[] trimStateSet = StateSet.trimStateSet(iArr3, i13);
                iArr2 = AbstractC1400g.m7074a(iArr2, i12, m7036g(color, f12, f11));
                iArr = (int[][]) AbstractC1400g.m7075b(iArr, i12, trimStateSet);
                i12++;
            }
            i11 = 1;
            resources2 = resources;
        }
        int[] iArr4 = new int[i12];
        int[][] iArr5 = new int[i12];
        System.arraycopy(iArr2, 0, iArr4, 0, i12);
        System.arraycopy(iArr, 0, iArr5, 0, i12);
        return new ColorStateList(iArr5, iArr4);
    }

    /* renamed from: f */
    private static boolean m7035f(Resources resources, int i11) {
        TypedValue m7032c = m7032c();
        resources.getValue(i11, m7032c, true);
        int i12 = m7032c.type;
        if (i12 >= 28 && i12 <= 31) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private static int m7036g(int i11, float f11, float f12) {
        boolean z11;
        if (f12 >= 0.0f && f12 <= 100.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (f11 == 1.0f && !z11) {
            return i11;
        }
        int m109345b = AbstractC20900a.m109345b((int) ((Color.alpha(i11) * f11) + 0.5f), 0, 255);
        if (z11) {
            C1394a m7007c = C1394a.m7007c(i11);
            i11 = C1394a.m7011m(m7007c.m7017j(), m7007c.m7016i(), f12);
        }
        return (i11 & 16777215) | (m109345b << 24);
    }

    /* renamed from: h */
    private static TypedArray m7037h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
