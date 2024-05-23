package androidx.core.content.res;

import androidx.core.graphics.AbstractC1409d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.content.res.a */
/* loaded from: classes2.dex */
public class C1394a {

    /* renamed from: a */
    private final float f6114a;

    /* renamed from: b */
    private final float f6115b;

    /* renamed from: c */
    private final float f6116c;

    /* renamed from: d */
    private final float f6117d;

    /* renamed from: e */
    private final float f6118e;

    /* renamed from: f */
    private final float f6119f;

    /* renamed from: g */
    private final float f6120g;

    /* renamed from: h */
    private final float f6121h;

    /* renamed from: i */
    private final float f6122i;

    C1394a(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
        this.f6114a = f11;
        this.f6115b = f12;
        this.f6116c = f13;
        this.f6117d = f14;
        this.f6118e = f15;
        this.f6119f = f16;
        this.f6120g = f17;
        this.f6121h = f18;
        this.f6122i = f19;
    }

    /* renamed from: b */
    private static C1394a m7006b(float f11, float f12, float f13) {
        float f14 = 100.0f;
        float f15 = 1000.0f;
        C1394a c1394a = null;
        float f16 = 1000.0f;
        float f17 = 0.0f;
        while (Math.abs(f17 - f14) > 0.01f) {
            float f18 = ((f14 - f17) / 2.0f) + f17;
            int m7021p = m7009e(f18, f12, f11).m7021p();
            float m7023b = AbstractC1395b.m7023b(m7021p);
            float abs = Math.abs(f13 - m7023b);
            if (abs < 0.2f) {
                C1394a m7007c = m7007c(m7021p);
                float m7013a = m7007c.m7013a(m7009e(m7007c.m7018k(), m7007c.m7016i(), f11));
                if (m7013a <= 1.0f) {
                    c1394a = m7007c;
                    f15 = abs;
                    f16 = m7013a;
                }
            }
            if (f15 == 0.0f && f16 == 0.0f) {
                break;
            }
            if (m7023b < f13) {
                f17 = f18;
            } else {
                f14 = f18;
            }
        }
        return c1394a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C1394a m7007c(int i11) {
        return m7008d(i11, C1405l.f6159k);
    }

    /* renamed from: d */
    static C1394a m7008d(int i11, C1405l c1405l) {
        float f11;
        float[] m7027f = AbstractC1395b.m7027f(i11);
        float[][] fArr = AbstractC1395b.f6123a;
        float f12 = m7027f[0];
        float[] fArr2 = fArr[0];
        float f13 = fArr2[0] * f12;
        float f14 = m7027f[1];
        float f15 = f13 + (fArr2[1] * f14);
        float f16 = m7027f[2];
        float f17 = f15 + (fArr2[2] * f16);
        float[] fArr3 = fArr[1];
        float f18 = (fArr3[0] * f12) + (fArr3[1] * f14) + (fArr3[2] * f16);
        float[] fArr4 = fArr[2];
        float f19 = (f12 * fArr4[0]) + (f14 * fArr4[1]) + (f16 * fArr4[2]);
        float f21 = c1405l.m7126i()[0] * f17;
        float f22 = c1405l.m7126i()[1] * f18;
        float f23 = c1405l.m7126i()[2] * f19;
        float pow = (float) Math.pow((c1405l.m7120c() * Math.abs(f21)) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((c1405l.m7120c() * Math.abs(f22)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((c1405l.m7120c() * Math.abs(f23)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f21) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f22) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f23) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d11 = signum3;
        float f24 = ((float) (((signum * 11.0d) + (signum2 * (-12.0d))) + d11)) / 11.0f;
        float f25 = ((float) ((signum + signum2) - (d11 * 2.0d))) / 9.0f;
        float f26 = signum2 * 20.0f;
        float f27 = (((signum * 20.0f) + f26) + (21.0f * signum3)) / 20.0f;
        float f28 = (((signum * 40.0f) + f26) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f25, f24)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f29 = atan2;
        float f31 = (3.1415927f * f29) / 180.0f;
        float pow4 = ((float) Math.pow((f28 * c1405l.m7123f()) / c1405l.m7118a(), c1405l.m7119b() * c1405l.m7127j())) * 100.0f;
        float m7121d = c1405l.m7121d() * (4.0f / c1405l.m7119b()) * ((float) Math.sqrt(pow4 / 100.0f)) * (c1405l.m7118a() + 4.0f);
        if (f29 < 20.14d) {
            f11 = 360.0f + f29;
        } else {
            f11 = f29;
        }
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, c1405l.m7122e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((f11 * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * c1405l.m7124g()) * c1405l.m7125h()) * ((float) Math.sqrt((f24 * f24) + (f25 * f25)))) / (f27 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        float m7121d2 = pow5 * c1405l.m7121d();
        float sqrt = ((float) Math.sqrt((r3 * c1405l.m7119b()) / (c1405l.m7118a() + 4.0f))) * 50.0f;
        float f32 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((0.0228f * m7121d2) + 1.0f)) * 43.85965f;
        double d12 = f31;
        return new C1394a(f29, pow5, pow4, m7121d, m7121d2, sqrt, f32, log * ((float) Math.cos(d12)), log * ((float) Math.sin(d12)));
    }

    /* renamed from: e */
    private static C1394a m7009e(float f11, float f12, float f13) {
        return m7010f(f11, f12, f13, C1405l.f6159k);
    }

    /* renamed from: f */
    private static C1394a m7010f(float f11, float f12, float f13, C1405l c1405l) {
        float m7119b = (4.0f / c1405l.m7119b()) * ((float) Math.sqrt(f11 / 100.0d)) * (c1405l.m7118a() + 4.0f) * c1405l.m7121d();
        float m7121d = f12 * c1405l.m7121d();
        float sqrt = ((float) Math.sqrt(((f12 / ((float) Math.sqrt(r4))) * c1405l.m7119b()) / (c1405l.m7118a() + 4.0f))) * 50.0f;
        float f14 = (1.7f * f11) / ((0.007f * f11) + 1.0f);
        float log = ((float) Math.log((m7121d * 0.0228d) + 1.0d)) * 43.85965f;
        double d11 = (3.1415927f * f13) / 180.0f;
        return new C1394a(f13, f12, f11, m7119b, m7121d, sqrt, f14, log * ((float) Math.cos(d11)), log * ((float) Math.sin(d11)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static int m7011m(float f11, float f12, float f13) {
        return m7012n(f11, f12, f13, C1405l.f6159k);
    }

    /* renamed from: n */
    static int m7012n(float f11, float f12, float f13, C1405l c1405l) {
        float min;
        if (f12 >= 1.0d && Math.round(f13) > 0.0d && Math.round(f13) < 100.0d) {
            if (f11 < 0.0f) {
                min = 0.0f;
            } else {
                min = Math.min(360.0f, f11);
            }
            float f14 = f12;
            C1394a c1394a = null;
            float f15 = 0.0f;
            boolean z11 = true;
            while (Math.abs(f15 - f12) >= 0.4f) {
                C1394a m7006b = m7006b(min, f14, f13);
                if (z11) {
                    if (m7006b != null) {
                        return m7006b.m7020o(c1405l);
                    }
                    f14 = ((f12 - f15) / 2.0f) + f15;
                    z11 = false;
                } else {
                    if (m7006b == null) {
                        f12 = f14;
                    } else {
                        f15 = f14;
                        c1394a = m7006b;
                    }
                    f14 = ((f12 - f15) / 2.0f) + f15;
                }
            }
            if (c1394a == null) {
                return AbstractC1395b.m7022a(f13);
            }
            return c1394a.m7020o(c1405l);
        }
        return AbstractC1395b.m7022a(f13);
    }

    /* renamed from: a */
    float m7013a(C1394a c1394a) {
        float m7019l = m7019l() - c1394a.m7019l();
        float m7014g = m7014g() - c1394a.m7014g();
        float m7015h = m7015h() - c1394a.m7015h();
        return (float) (Math.pow(Math.sqrt((m7019l * m7019l) + (m7014g * m7014g) + (m7015h * m7015h)), 0.63d) * 1.41d);
    }

    /* renamed from: g */
    float m7014g() {
        return this.f6121h;
    }

    /* renamed from: h */
    float m7015h() {
        return this.f6122i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public float m7016i() {
        return this.f6115b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public float m7017j() {
        return this.f6114a;
    }

    /* renamed from: k */
    float m7018k() {
        return this.f6116c;
    }

    /* renamed from: l */
    float m7019l() {
        return this.f6120g;
    }

    /* renamed from: o */
    int m7020o(C1405l c1405l) {
        float f11;
        if (m7016i() != 0.0d && m7018k() != 0.0d) {
            f11 = m7016i() / ((float) Math.sqrt(m7018k() / 100.0d));
        } else {
            f11 = 0.0f;
        }
        float pow = (float) Math.pow(f11 / Math.pow(1.64d - Math.pow(0.29d, c1405l.m7122e()), 0.73d), 1.1111111111111112d);
        double m7017j = (m7017j() * 3.1415927f) / 180.0f;
        float cos = ((float) (Math.cos(2.0d + m7017j) + 3.8d)) * 0.25f;
        float m7118a = c1405l.m7118a() * ((float) Math.pow(m7018k() / 100.0d, (1.0d / c1405l.m7119b()) / c1405l.m7127j()));
        float m7124g = cos * 3846.1538f * c1405l.m7124g() * c1405l.m7125h();
        float m7123f = m7118a / c1405l.m7123f();
        float sin = (float) Math.sin(m7017j);
        float cos2 = (float) Math.cos(m7017j);
        float f12 = (((0.305f + m7123f) * 23.0f) * pow) / (((m7124g * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f13 = cos2 * f12;
        float f14 = f12 * sin;
        float f15 = m7123f * 460.0f;
        float f16 = (((451.0f * f13) + f15) + (288.0f * f14)) / 1403.0f;
        float f17 = ((f15 - (891.0f * f13)) - (261.0f * f14)) / 1403.0f;
        float signum = Math.signum(f16) * (100.0f / c1405l.m7120c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f16) * 27.13d) / (400.0d - Math.abs(f16))), 2.380952380952381d));
        float signum2 = Math.signum(f17) * (100.0f / c1405l.m7120c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f17) * 27.13d) / (400.0d - Math.abs(f17))), 2.380952380952381d));
        float signum3 = Math.signum(((f15 - (f13 * 220.0f)) - (f14 * 6300.0f)) / 1403.0f) * (100.0f / c1405l.m7120c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(r8) * 27.13d) / (400.0d - Math.abs(r8))), 2.380952380952381d));
        float f18 = signum / c1405l.m7126i()[0];
        float f19 = signum2 / c1405l.m7126i()[1];
        float f21 = signum3 / c1405l.m7126i()[2];
        float[][] fArr = AbstractC1395b.f6124b;
        float[] fArr2 = fArr[0];
        float f22 = (fArr2[0] * f18) + (fArr2[1] * f19) + (fArr2[2] * f21);
        float[] fArr3 = fArr[1];
        float f23 = (fArr3[0] * f18) + (fArr3[1] * f19) + (fArr3[2] * f21);
        float[] fArr4 = fArr[2];
        return AbstractC1409d.m7134c(f22, f23, (f18 * fArr4[0]) + (f19 * fArr4[1]) + (f21 * fArr4[2]));
    }

    /* renamed from: p */
    int m7021p() {
        return m7020o(C1405l.f6159k);
    }
}
