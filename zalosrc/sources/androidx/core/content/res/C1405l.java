package androidx.core.content.res;

/* renamed from: androidx.core.content.res.l */
/* loaded from: classes2.dex */
final class C1405l {

    /* renamed from: k */
    static final C1405l f6159k = m7117k(AbstractC1395b.f6125c, (float) ((AbstractC1395b.m7029h(50.0f) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* renamed from: a */
    private final float f6160a;

    /* renamed from: b */
    private final float f6161b;

    /* renamed from: c */
    private final float f6162c;

    /* renamed from: d */
    private final float f6163d;

    /* renamed from: e */
    private final float f6164e;

    /* renamed from: f */
    private final float f6165f;

    /* renamed from: g */
    private final float[] f6166g;

    /* renamed from: h */
    private final float f6167h;

    /* renamed from: i */
    private final float f6168i;

    /* renamed from: j */
    private final float f6169j;

    private C1405l(float f11, float f12, float f13, float f14, float f15, float f16, float[] fArr, float f17, float f18, float f19) {
        this.f6165f = f11;
        this.f6160a = f12;
        this.f6161b = f13;
        this.f6162c = f14;
        this.f6163d = f15;
        this.f6164e = f16;
        this.f6166g = fArr;
        this.f6167h = f17;
        this.f6168i = f18;
        this.f6169j = f19;
    }

    /* renamed from: k */
    static C1405l m7117k(float[] fArr, float f11, float f12, float f13, boolean z11) {
        float m7025d;
        float exp;
        float[][] fArr2 = AbstractC1395b.f6123a;
        float f14 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f15 = fArr3[0] * f14;
        float f16 = fArr[1];
        float f17 = f15 + (fArr3[1] * f16);
        float f18 = fArr[2];
        float f19 = f17 + (fArr3[2] * f18);
        float[] fArr4 = fArr2[1];
        float f21 = (fArr4[0] * f14) + (fArr4[1] * f16) + (fArr4[2] * f18);
        float[] fArr5 = fArr2[2];
        float f22 = (f14 * fArr5[0]) + (f16 * fArr5[1]) + (f18 * fArr5[2]);
        float f23 = (f13 / 10.0f) + 0.8f;
        if (f23 >= 0.9d) {
            m7025d = AbstractC1395b.m7025d(0.59f, 0.69f, (f23 - 0.9f) * 10.0f);
        } else {
            m7025d = AbstractC1395b.m7025d(0.525f, 0.59f, (f23 - 0.8f) * 10.0f);
        }
        float f24 = m7025d;
        if (z11) {
            exp = 1.0f;
        } else {
            exp = (1.0f - (((float) Math.exp(((-f11) - 42.0f) / 92.0f)) * 0.2777778f)) * f23;
        }
        double d11 = exp;
        if (d11 > 1.0d) {
            exp = 1.0f;
        } else if (d11 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f19) * exp) + 1.0f) - exp, (((100.0f / f21) * exp) + 1.0f) - exp, (((100.0f / f22) * exp) + 1.0f) - exp};
        float f25 = 1.0f / ((5.0f * f11) + 1.0f);
        float f26 = f25 * f25 * f25 * f25;
        float f27 = 1.0f - f26;
        float cbrt = (f26 * f11) + (0.1f * f27 * f27 * ((float) Math.cbrt(f11 * 5.0d)));
        float m7029h = AbstractC1395b.m7029h(f12) / fArr[1];
        double d12 = m7029h;
        float sqrt = ((float) Math.sqrt(d12)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d12, 0.2d));
        float pow2 = (float) Math.pow(((fArr6[2] * cbrt) * f22) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f19) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f21) / 100.0d, 0.42d), pow2};
        float f28 = fArr7[0];
        float f29 = fArr7[1];
        return new C1405l(m7029h, ((((f28 * 400.0f) / (f28 + 27.13f)) * 2.0f) + ((f29 * 400.0f) / (f29 + 27.13f)) + (((400.0f * pow2) / (pow2 + 27.13f)) * 0.05f)) * pow, pow, pow, f24, f23, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public float m7118a() {
        return this.f6160a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public float m7119b() {
        return this.f6163d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public float m7120c() {
        return this.f6167h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public float m7121d() {
        return this.f6168i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public float m7122e() {
        return this.f6165f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public float m7123f() {
        return this.f6161b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public float m7124g() {
        return this.f6164e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public float m7125h() {
        return this.f6162c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public float[] m7126i() {
        return this.f6166g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public float m7127j() {
        return this.f6169j;
    }
}
