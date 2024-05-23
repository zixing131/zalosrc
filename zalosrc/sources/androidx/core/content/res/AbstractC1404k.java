package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.core.content.res.k */
/* loaded from: classes2.dex */
public abstract class AbstractC1404k {
    /* renamed from: a */
    public static boolean m7105a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i11, boolean z11) {
        if (!m7114j(xmlPullParser, str)) {
            return z11;
        }
        return typedArray.getBoolean(i11, z11);
    }

    /* renamed from: b */
    public static int m7106b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i11, int i12) {
        if (!m7114j(xmlPullParser, str)) {
            return i12;
        }
        return typedArray.getColor(i11, i12);
    }

    /* renamed from: c */
    public static ColorStateList m7107c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i11) {
        if (m7114j(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i11, typedValue);
            int i12 = typedValue.type;
            if (i12 != 2) {
                if (i12 >= 28 && i12 <= 31) {
                    return m7108d(typedValue);
                }
                return AbstractC1396c.m7033d(typedArray.getResources(), typedArray.getResourceId(i11, 0), theme);
            }
            throw new UnsupportedOperationException("Failed to resolve attribute at index " + i11 + ": " + typedValue);
        }
        return null;
    }

    /* renamed from: d */
    private static ColorStateList m7108d(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    /* renamed from: e */
    public static C1397d m7109e(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i11, int i12) {
        if (m7114j(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i11, typedValue);
            int i13 = typedValue.type;
            if (i13 >= 28 && i13 <= 31) {
                return C1397d.m7039b(typedValue.data);
            }
            C1397d m7042g = C1397d.m7042g(typedArray.getResources(), typedArray.getResourceId(i11, 0), theme);
            if (m7042g != null) {
                return m7042g;
            }
        }
        return C1397d.m7039b(i12);
    }

    /* renamed from: f */
    public static float m7110f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i11, float f11) {
        if (!m7114j(xmlPullParser, str)) {
            return f11;
        }
        return typedArray.getFloat(i11, f11);
    }

    /* renamed from: g */
    public static int m7111g(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i11, int i12) {
        if (!m7114j(xmlPullParser, str)) {
            return i12;
        }
        return typedArray.getInt(i11, i12);
    }

    /* renamed from: h */
    public static int m7112h(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i11, int i12) {
        if (!m7114j(xmlPullParser, str)) {
            return i12;
        }
        return typedArray.getResourceId(i11, i12);
    }

    /* renamed from: i */
    public static String m7113i(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i11) {
        if (!m7114j(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i11);
    }

    /* renamed from: j */
    public static boolean m7114j(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public static TypedArray m7115k(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: l */
    public static TypedValue m7116l(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i11) {
        if (!m7114j(xmlPullParser, str)) {
            return null;
        }
        return typedArray.peekValue(i11);
    }
}
