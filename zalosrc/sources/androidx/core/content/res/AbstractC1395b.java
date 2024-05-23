package androidx.core.content.res;

import android.graphics.Color;
import androidx.core.graphics.AbstractC1409d;

/* renamed from: androidx.core.content.res.b */
/* loaded from: classes2.dex */
abstract class AbstractC1395b {

    /* renamed from: a */
    static final float[][] f6123a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: b */
    static final float[][] f6124b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: c */
    static final float[] f6125c = {95.047f, 100.0f, 108.883f};

    /* renamed from: d */
    static final float[][] f6126d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m7022a(float f11) {
        float f12;
        boolean z11;
        float f13;
        if (f11 < 1.0f) {
            return -16777216;
        }
        if (f11 > 99.0f) {
            return -1;
        }
        float f14 = (f11 + 16.0f) / 116.0f;
        if (f11 > 8.0f) {
            f12 = f14 * f14 * f14;
        } else {
            f12 = f11 / 903.2963f;
        }
        float f15 = f14 * f14 * f14;
        if (f15 > 0.008856452f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            f13 = f15;
        } else {
            f13 = ((f14 * 116.0f) - 16.0f) / 903.2963f;
        }
        if (!z11) {
            f15 = ((f14 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f6125c;
        return AbstractC1409d.m7134c(f13 * fArr[0], f12 * fArr[1], f15 * fArr[2]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static float m7023b(int i11) {
        return m7024c(m7028g(i11));
    }

    /* renamed from: c */
    static float m7024c(float f11) {
        float f12 = f11 / 100.0f;
        if (f12 <= 0.008856452f) {
            return f12 * 903.2963f;
        }
        return (((float) Math.cbrt(f12)) * 116.0f) - 16.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static float m7025d(float f11, float f12, float f13) {
        return f11 + ((f12 - f11) * f13);
    }

    /* renamed from: e */
    static float m7026e(int i11) {
        float pow;
        float f11 = i11 / 255.0f;
        if (f11 <= 0.04045f) {
            pow = f11 / 12.92f;
        } else {
            pow = (float) Math.pow((f11 + 0.055f) / 1.055f, 2.4000000953674316d);
        }
        return pow * 100.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static float[] m7027f(int i11) {
        float m7026e = m7026e(Color.red(i11));
        float m7026e2 = m7026e(Color.green(i11));
        float m7026e3 = m7026e(Color.blue(i11));
        float[][] fArr = f6126d;
        float[] fArr2 = fArr[0];
        float f11 = (fArr2[0] * m7026e) + (fArr2[1] * m7026e2) + (fArr2[2] * m7026e3);
        float[] fArr3 = fArr[1];
        float f12 = (fArr3[0] * m7026e) + (fArr3[1] * m7026e2) + (fArr3[2] * m7026e3);
        float[] fArr4 = fArr[2];
        return new float[]{f11, f12, (m7026e * fArr4[0]) + (m7026e2 * fArr4[1]) + (m7026e3 * fArr4[2])};
    }

    /* renamed from: g */
    static float m7028g(int i11) {
        float m7026e = m7026e(Color.red(i11));
        float m7026e2 = m7026e(Color.green(i11));
        float m7026e3 = m7026e(Color.blue(i11));
        float[] fArr = f6126d[1];
        return (m7026e * fArr[0]) + (m7026e2 * fArr[1]) + (m7026e3 * fArr[2]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static float m7029h(float f11) {
        float f12;
        if (f11 > 8.0f) {
            f12 = (float) Math.pow((f11 + 16.0d) / 116.0d, 3.0d);
        } else {
            f12 = f11 / 903.2963f;
        }
        return f12 * 100.0f;
    }
}
