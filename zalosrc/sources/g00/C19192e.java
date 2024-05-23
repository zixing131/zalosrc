package g00;

import d00.C17687a;

/* renamed from: g00.e */
/* loaded from: classes4.dex */
public class C19192e {

    /* renamed from: a */
    protected float[] f95322a;

    public C19192e() {
        this(2.5f);
    }

    /* renamed from: a */
    public static float[] m100644a(float f11, float f12) {
        float f13 = 0.0f;
        if (f11 == 0.0f) {
            return new float[]{1.0f};
        }
        int i11 = (int) ((f12 * 2.0f * f11) + 1.0f);
        if (i11 % 2 == 0) {
            i11++;
        }
        float[] fArr = new float[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            float f14 = i12 - (i11 / 2.0f);
            double d11 = f11;
            float exp = (float) Math.exp(((-f14) * f14) / ((2.0d * d11) * d11));
            fArr[i12] = exp;
            f13 += exp;
        }
        for (int i13 = 0; i13 < i11; i13++) {
            fArr[i13] = fArr[i13] / f13;
        }
        return fArr;
    }

    /* renamed from: b */
    public void m100645b(C17687a c17687a) {
        AbstractC19193f.m100646a(c17687a, this.f95322a);
        AbstractC19193f.m100647b(c17687a, this.f95322a);
    }

    public C19192e(float f11) {
        this(f11, 4.0f);
    }

    public C19192e(float f11, float f12) {
        this.f95322a = m100644a(f11, f12);
    }
}
