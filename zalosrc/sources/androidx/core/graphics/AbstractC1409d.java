package androidx.core.graphics;

import android.graphics.Color;

/* renamed from: androidx.core.graphics.d */
/* loaded from: classes2.dex */
public abstract class AbstractC1409d {

    /* renamed from: a */
    private static final ThreadLocal f6201a = new ThreadLocal();

    /* renamed from: a */
    public static void m7132a(int i11, int i12, int i13, float[] fArr) {
        float f11;
        float abs;
        float f12 = i11 / 255.0f;
        float f13 = i12 / 255.0f;
        float f14 = i13 / 255.0f;
        float max = Math.max(f12, Math.max(f13, f14));
        float min = Math.min(f12, Math.min(f13, f14));
        float f15 = max - min;
        float f16 = (max + min) / 2.0f;
        if (max == min) {
            f11 = 0.0f;
            abs = 0.0f;
        } else {
            if (max == f12) {
                f11 = ((f13 - f14) / f15) % 6.0f;
            } else if (max == f13) {
                f11 = ((f14 - f12) / f15) + 2.0f;
            } else {
                f11 = 4.0f + ((f12 - f13) / f15);
            }
            abs = f15 / (1.0f - Math.abs((2.0f * f16) - 1.0f));
        }
        float f17 = (f11 * 60.0f) % 360.0f;
        if (f17 < 0.0f) {
            f17 += 360.0f;
        }
        fArr[0] = m7144m(f17, 0.0f, 360.0f);
        fArr[1] = m7144m(abs, 0.0f, 1.0f);
        fArr[2] = m7144m(f16, 0.0f, 1.0f);
    }

    /* renamed from: b */
    public static void m7133b(int i11, int i12, int i13, double[] dArr) {
        double pow;
        double pow2;
        double pow3;
        if (dArr.length == 3) {
            double d11 = i11 / 255.0d;
            if (d11 < 0.04045d) {
                pow = d11 / 12.92d;
            } else {
                pow = Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
            }
            double d12 = i12 / 255.0d;
            if (d12 < 0.04045d) {
                pow2 = d12 / 12.92d;
            } else {
                pow2 = Math.pow((d12 + 0.055d) / 1.055d, 2.4d);
            }
            double d13 = i13 / 255.0d;
            if (d13 < 0.04045d) {
                pow3 = d13 / 12.92d;
            } else {
                pow3 = Math.pow((d13 + 0.055d) / 1.055d, 2.4d);
            }
            dArr[0] = ((0.4124d * pow) + (0.3576d * pow2) + (0.1805d * pow3)) * 100.0d;
            dArr[1] = ((0.2126d * pow) + (0.7152d * pow2) + (0.0722d * pow3)) * 100.0d;
            dArr[2] = ((pow * 0.0193d) + (pow2 * 0.1192d) + (pow3 * 0.9505d)) * 100.0d;
            return;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }

    /* renamed from: c */
    public static int m7134c(double d11, double d12, double d13) {
        double d14;
        double d15;
        double d16;
        double d17 = (((3.2406d * d11) + ((-1.5372d) * d12)) + ((-0.4986d) * d13)) / 100.0d;
        double d18 = ((((-0.9689d) * d11) + (1.8758d * d12)) + (0.0415d * d13)) / 100.0d;
        double d19 = (((0.0557d * d11) + ((-0.204d) * d12)) + (1.057d * d13)) / 100.0d;
        if (d17 > 0.0031308d) {
            d14 = (Math.pow(d17, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d14 = d17 * 12.92d;
        }
        if (d18 > 0.0031308d) {
            d15 = (Math.pow(d18, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d15 = d18 * 12.92d;
        }
        if (d19 > 0.0031308d) {
            d16 = (Math.pow(d19, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d16 = 12.92d * d19;
        }
        return Color.rgb(m7145n((int) Math.round(d14 * 255.0d), 0, 255), m7145n((int) Math.round(d15 * 255.0d), 0, 255), m7145n((int) Math.round(d16 * 255.0d), 0, 255));
    }

    /* renamed from: d */
    public static int m7135d(int i11, int i12, float f11) {
        float f12 = 1.0f - f11;
        return Color.argb((int) ((Color.alpha(i11) * f12) + (Color.alpha(i12) * f11)), (int) ((Color.red(i11) * f12) + (Color.red(i12) * f11)), (int) ((Color.green(i11) * f12) + (Color.green(i12) * f11)), (int) ((Color.blue(i11) * f12) + (Color.blue(i12) * f11)));
    }

    /* renamed from: e */
    public static double m7136e(int i11, int i12) {
        if (Color.alpha(i12) == 255) {
            if (Color.alpha(i11) < 255) {
                i11 = m7142k(i11, i12);
            }
            double m7137f = m7137f(i11) + 0.05d;
            double m7137f2 = m7137f(i12) + 0.05d;
            return Math.max(m7137f, m7137f2) / Math.min(m7137f, m7137f2);
        }
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i12));
    }

    /* renamed from: f */
    public static double m7137f(int i11) {
        double[] m7146o = m7146o();
        m7140i(i11, m7146o);
        return m7146o[1] / 100.0d;
    }

    /* renamed from: g */
    public static int m7138g(int i11, int i12, float f11) {
        int i13 = 255;
        if (Color.alpha(i12) == 255) {
            double d11 = f11;
            if (m7136e(m7147p(i11, 255), i12) < d11) {
                return -1;
            }
            int i14 = 0;
            for (int i15 = 0; i15 <= 10 && i13 - i14 > 1; i15++) {
                int i16 = (i14 + i13) / 2;
                if (m7136e(m7147p(i11, i16), i12) < d11) {
                    i14 = i16;
                } else {
                    i13 = i16;
                }
            }
            return i13;
        }
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i12));
    }

    /* renamed from: h */
    public static void m7139h(int i11, float[] fArr) {
        m7132a(Color.red(i11), Color.green(i11), Color.blue(i11), fArr);
    }

    /* renamed from: i */
    public static void m7140i(int i11, double[] dArr) {
        m7133b(Color.red(i11), Color.green(i11), Color.blue(i11), dArr);
    }

    /* renamed from: j */
    private static int m7141j(int i11, int i12) {
        return 255 - (((255 - i12) * (255 - i11)) / 255);
    }

    /* renamed from: k */
    public static int m7142k(int i11, int i12) {
        int alpha = Color.alpha(i12);
        int alpha2 = Color.alpha(i11);
        int m7141j = m7141j(alpha2, alpha);
        return Color.argb(m7141j, m7143l(Color.red(i11), alpha2, Color.red(i12), alpha, m7141j), m7143l(Color.green(i11), alpha2, Color.green(i12), alpha, m7141j), m7143l(Color.blue(i11), alpha2, Color.blue(i12), alpha, m7141j));
    }

    /* renamed from: l */
    private static int m7143l(int i11, int i12, int i13, int i14, int i15) {
        if (i15 == 0) {
            return 0;
        }
        return (((i11 * 255) * i12) + ((i13 * i14) * (255 - i12))) / (i15 * 255);
    }

    /* renamed from: m */
    private static float m7144m(float f11, float f12, float f13) {
        if (f11 >= f12) {
            return Math.min(f11, f13);
        }
        return f12;
    }

    /* renamed from: n */
    private static int m7145n(int i11, int i12, int i13) {
        if (i11 >= i12) {
            return Math.min(i11, i13);
        }
        return i12;
    }

    /* renamed from: o */
    private static double[] m7146o() {
        ThreadLocal threadLocal = f6201a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            double[] dArr2 = new double[3];
            threadLocal.set(dArr2);
            return dArr2;
        }
        return dArr;
    }

    /* renamed from: p */
    public static int m7147p(int i11, int i12) {
        if (i12 >= 0 && i12 <= 255) {
            return (i11 & 16777215) | (i12 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}
