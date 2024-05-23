package jd0;

import android.graphics.Matrix;

/* renamed from: jd0.a */
/* loaded from: classes4.dex */
public abstract class AbstractC21227a {

    /* renamed from: a */
    static Matrix f103492a;

    /* renamed from: b */
    static float[] f103493b;

    /* renamed from: c */
    static float[] f103494c;

    /* renamed from: a */
    public static Matrix m110000a(int i11, int i12, int i13, int i14, int i15, float f11) {
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        if (f103492a == null) {
            f103492a = new Matrix();
            f103493b = new float[9];
            f103494c = new float[16];
        }
        if (i13 != 0) {
            double d11 = (i13 * 3.141592653589793d) / 180.0d;
            f12 = (float) Math.sin(d11);
            f13 = (float) Math.cos(d11);
        } else {
            f12 = 0.0f;
            f13 = 1.0f;
        }
        if (i14 != 0) {
            double d12 = (i14 * 3.141592653589793d) / 180.0d;
            f14 = (float) Math.sin(d12);
            f15 = (float) Math.cos(d12);
        } else {
            f14 = 0.0f;
            f15 = 1.0f;
        }
        if (i15 != 0) {
            double d13 = (i15 * 3.141592653589793d) / 180.0d;
            f16 = (float) Math.sin(d13);
            f17 = (float) Math.cos(d13);
        } else {
            f16 = 0.0f;
            f17 = 1.0f;
        }
        float f18 = -i11;
        float f19 = i12;
        float f21 = (f18 * f17) + (f19 * f16);
        float f22 = (f18 * f16) - (f19 * f17);
        float f23 = ((-f17) * f14) + (f16 * f12 * f14);
        float f24 = (f16 * f14) + (f17 * f12 * f15);
        float f25 = f12 * f22;
        float f26 = ((((-f21) * f14) + (f25 * f15)) * f11) + 1.0f;
        float[] fArr = f103494c;
        float f27 = f23 * f11;
        float f28 = i11;
        float f29 = (f17 * f15) + (f27 * f28);
        fArr[0] = f29;
        float f31 = f24 * f11;
        float f32 = ((-f16) * f15) + (f31 * f28);
        fArr[1] = f32;
        fArr[3] = (f21 * f15) + (f25 * f14) + (f28 * f26);
        float f33 = (f16 * f13) + (f27 * f19);
        fArr[4] = f33;
        float f34 = (f17 * f13) + (f31 * f19);
        fArr[5] = f34;
        fArr[7] = (f22 * f13) + (f19 * f26);
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = f27;
        fArr[13] = f31;
        fArr[15] = f26;
        float[] fArr2 = f103493b;
        fArr2[0] = f29;
        fArr2[3] = f33;
        fArr2[6] = f27;
        fArr2[1] = f32;
        fArr2[4] = f34;
        fArr2[7] = f31;
        fArr2[2] = fArr[3];
        fArr2[5] = fArr[7];
        fArr2[8] = f26;
        f103492a.setValues(fArr2);
        return f103492a;
    }
}
