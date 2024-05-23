package p007a1;

/* renamed from: a1.n */
/* loaded from: classes2.dex */
public class C0033n implements InterfaceC0032m {

    /* renamed from: a */
    private float f130a;

    /* renamed from: b */
    private float f131b;

    /* renamed from: c */
    private float f132c;

    /* renamed from: d */
    private float f133d;

    /* renamed from: e */
    private float f134e;

    /* renamed from: f */
    private float f135f;

    /* renamed from: g */
    private float f136g;

    /* renamed from: h */
    private float f137h;

    /* renamed from: i */
    private float f138i;

    /* renamed from: j */
    private int f139j;

    /* renamed from: k */
    private String f140k;

    /* renamed from: m */
    private float f142m;

    /* renamed from: n */
    private float f143n;

    /* renamed from: l */
    private boolean f141l = false;

    /* renamed from: o */
    private boolean f144o = false;

    /* renamed from: c */
    private float m101c(float f11) {
        this.f144o = false;
        float f12 = this.f133d;
        if (f11 <= f12) {
            float f13 = this.f130a;
            return (f13 * f11) + ((((this.f131b - f13) * f11) * f11) / (f12 * 2.0f));
        }
        int i11 = this.f139j;
        if (i11 == 1) {
            return this.f136g;
        }
        float f14 = f11 - f12;
        float f15 = this.f134e;
        if (f14 < f15) {
            float f16 = this.f136g;
            float f17 = this.f131b;
            return f16 + (f17 * f14) + ((((this.f132c - f17) * f14) * f14) / (f15 * 2.0f));
        }
        if (i11 == 2) {
            return this.f137h;
        }
        float f18 = f14 - f15;
        float f19 = this.f135f;
        if (f18 > f19) {
            this.f144o = true;
            return this.f138i;
        }
        float f21 = this.f137h;
        float f22 = this.f132c;
        return (f21 + (f22 * f18)) - (((f22 * f18) * f18) / (f19 * 2.0f));
    }

    /* renamed from: f */
    private void m102f(float f11, float f12, float f13, float f14, float f15) {
        this.f144o = false;
        if (f11 == 0.0f) {
            f11 = 1.0E-4f;
        }
        this.f130a = f11;
        float f16 = f11 / f13;
        float f17 = (f16 * f11) / 2.0f;
        if (f11 < 0.0f) {
            float sqrt = (float) Math.sqrt((f12 - ((((-f11) / f13) * f11) / 2.0f)) * f13);
            if (sqrt < f14) {
                this.f140k = "backward accelerate, decelerate";
                this.f139j = 2;
                this.f130a = f11;
                this.f131b = sqrt;
                this.f132c = 0.0f;
                float f18 = (sqrt - f11) / f13;
                this.f133d = f18;
                this.f134e = sqrt / f13;
                this.f136g = ((f11 + sqrt) * f18) / 2.0f;
                this.f137h = f12;
                this.f138i = f12;
                return;
            }
            this.f140k = "backward accelerate cruse decelerate";
            this.f139j = 3;
            this.f130a = f11;
            this.f131b = f14;
            this.f132c = f14;
            float f19 = (f14 - f11) / f13;
            this.f133d = f19;
            float f21 = f14 / f13;
            this.f135f = f21;
            float f22 = ((f11 + f14) * f19) / 2.0f;
            float f23 = (f21 * f14) / 2.0f;
            this.f134e = ((f12 - f22) - f23) / f14;
            this.f136g = f22;
            this.f137h = f12 - f23;
            this.f138i = f12;
            return;
        }
        if (f17 >= f12) {
            this.f140k = "hard stop";
            this.f139j = 1;
            this.f130a = f11;
            this.f131b = 0.0f;
            this.f136g = f12;
            this.f133d = (2.0f * f12) / f11;
            return;
        }
        float f24 = f12 - f17;
        float f25 = f24 / f11;
        if (f25 + f16 < f15) {
            this.f140k = "cruse decelerate";
            this.f139j = 2;
            this.f130a = f11;
            this.f131b = f11;
            this.f132c = 0.0f;
            this.f136g = f24;
            this.f137h = f12;
            this.f133d = f25;
            this.f134e = f16;
            return;
        }
        float sqrt2 = (float) Math.sqrt((f13 * f12) + ((f11 * f11) / 2.0f));
        float f26 = (sqrt2 - f11) / f13;
        this.f133d = f26;
        float f27 = sqrt2 / f13;
        this.f134e = f27;
        if (sqrt2 < f14) {
            this.f140k = "accelerate decelerate";
            this.f139j = 2;
            this.f130a = f11;
            this.f131b = sqrt2;
            this.f132c = 0.0f;
            this.f133d = f26;
            this.f134e = f27;
            this.f136g = ((f11 + sqrt2) * f26) / 2.0f;
            this.f137h = f12;
            return;
        }
        this.f140k = "accelerate cruse decelerate";
        this.f139j = 3;
        this.f130a = f11;
        this.f131b = f14;
        this.f132c = f14;
        float f28 = (f14 - f11) / f13;
        this.f133d = f28;
        float f29 = f14 / f13;
        this.f135f = f29;
        float f31 = ((f11 + f14) * f28) / 2.0f;
        float f32 = (f29 * f14) / 2.0f;
        this.f134e = ((f12 - f31) - f32) / f14;
        this.f136g = f31;
        this.f137h = f12 - f32;
        this.f138i = f12;
    }

    @Override // p007a1.InterfaceC0032m
    /* renamed from: a */
    public boolean mo97a() {
        if (mo98b() < 1.0E-5f && Math.abs(this.f138i - this.f143n) < 1.0E-5f) {
            return true;
        }
        return false;
    }

    @Override // p007a1.InterfaceC0032m
    /* renamed from: b */
    public float mo98b() {
        if (this.f141l) {
            return -m104e(this.f143n);
        }
        return m104e(this.f143n);
    }

    /* renamed from: d */
    public void m103d(float f11, float f12, float f13, float f14, float f15, float f16) {
        boolean z11 = false;
        this.f144o = false;
        this.f142m = f11;
        if (f11 > f12) {
            z11 = true;
        }
        this.f141l = z11;
        if (z11) {
            m102f(-f13, f11 - f12, f15, f16, f14);
        } else {
            m102f(f13, f12 - f11, f15, f16, f14);
        }
    }

    /* renamed from: e */
    public float m104e(float f11) {
        float f12 = this.f133d;
        if (f11 <= f12) {
            float f13 = this.f130a;
            return f13 + (((this.f131b - f13) * f11) / f12);
        }
        int i11 = this.f139j;
        if (i11 == 1) {
            return 0.0f;
        }
        float f14 = f11 - f12;
        float f15 = this.f134e;
        if (f14 < f15) {
            float f16 = this.f131b;
            return f16 + (((this.f132c - f16) * f14) / f15);
        }
        if (i11 == 2) {
            return this.f137h;
        }
        float f17 = f14 - f15;
        float f18 = this.f135f;
        if (f17 >= f18) {
            return this.f138i;
        }
        float f19 = this.f132c;
        return f19 - ((f17 * f19) / f18);
    }

    @Override // p007a1.InterfaceC0032m
    public float getInterpolation(float f11) {
        float m101c = m101c(f11);
        this.f143n = f11;
        if (this.f141l) {
            return this.f142m - m101c;
        }
        return this.f142m + m101c;
    }
}
