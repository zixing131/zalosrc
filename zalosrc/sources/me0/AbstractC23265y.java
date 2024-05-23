package me0;

import android.graphics.Color;

/* renamed from: me0.y */
/* loaded from: classes4.dex */
public abstract class AbstractC23265y {

    /* renamed from: a */
    private static float[] f112764a;

    /* renamed from: a */
    public static int m120014a(float[] fArr) {
        return Color.argb((int) (fArr[3] * 255.0f), (int) (fArr[0] * 255.0f), (int) (fArr[1] * 255.0f), (int) (fArr[2] * 255.0f));
    }

    /* renamed from: b */
    public static int m120015b(int i11, float f11) {
        if (f11 < 0.0f) {
            return i11;
        }
        if (f112764a == null) {
            f112764a = new float[3];
        }
        Color.colorToHSV(i11, f112764a);
        float[] fArr = f112764a;
        fArr[2] = fArr[2] * f11;
        return Color.HSVToColor(fArr);
    }

    /* renamed from: c */
    public static void m120016c(float[] fArr, int i11) {
        fArr[0] = Color.red(i11) / 255.0f;
        fArr[1] = Color.green(i11) / 255.0f;
        fArr[2] = Color.blue(i11) / 255.0f;
        fArr[3] = Color.alpha(i11) / 255.0f;
    }

    /* renamed from: d */
    public static String m120017d(int i11) {
        return String.format("#%06X", Integer.valueOf(i11 & 16777215));
    }

    /* renamed from: e */
    public static String m120018e(float[] fArr) {
        return m120017d(m120014a(fArr));
    }

    /* renamed from: f */
    public static int m120019f(int i11, float f11) {
        try {
            return Color.argb(Math.round(Color.alpha(i11) * f11), Color.red(i11), Color.green(i11), Color.blue(i11));
        } catch (Exception unused) {
            return i11;
        }
    }

    /* renamed from: g */
    public static int m120020g(int i11) {
        if ((((Color.red(i11) * 299) + (Color.green(i11) * 587)) + (Color.blue(i11) * 114)) / 1000 >= 140.0d) {
            return -16381850;
        }
        return -1;
    }

    /* renamed from: h */
    public static String m120021h(int i11) {
        if (i11 >= 0 && i11 < 16) {
            return Integer.toHexString(i11);
        }
        return "f";
    }

    /* renamed from: i */
    public static int m120022i(int i11, int i12) {
        return (i11 & 16777215) | (i12 << 24);
    }
}
