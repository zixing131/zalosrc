package p007a1;

/* renamed from: a1.k */
/* loaded from: classes2.dex */
public class C0030k implements InterfaceC0032m {

    /* renamed from: c */
    private double f120c;

    /* renamed from: d */
    private double f121d;

    /* renamed from: e */
    private double f122e;

    /* renamed from: f */
    private float f123f;

    /* renamed from: g */
    private float f124g;

    /* renamed from: h */
    private float f125h;

    /* renamed from: i */
    private float f126i;

    /* renamed from: j */
    private float f127j;

    /* renamed from: a */
    double f118a = 0.5d;

    /* renamed from: b */
    private boolean f119b = false;

    /* renamed from: k */
    private int f128k = 0;

    /* renamed from: c */
    private void m96c(double d11) {
        double d12 = this.f120c;
        double d13 = this.f118a;
        int sqrt = (int) ((9.0d / ((Math.sqrt(d12 / this.f126i) * d11) * 4.0d)) + 1.0d);
        double d14 = d11 / sqrt;
        int i11 = 0;
        while (i11 < sqrt) {
            float f11 = this.f124g;
            double d15 = this.f121d;
            float f12 = this.f125h;
            double d16 = d12;
            double d17 = ((-d12) * (f11 - d15)) - (f12 * d13);
            float f13 = this.f126i;
            double d18 = d13;
            double d19 = f12 + (((d17 / f13) * d14) / 2.0d);
            double d21 = ((((-((f11 + ((d14 * d19) / 2.0d)) - d15)) * d16) - (d19 * d18)) / f13) * d14;
            float f14 = (float) (f12 + d21);
            this.f125h = f14;
            float f15 = (float) (f11 + ((f12 + (d21 / 2.0d)) * d14));
            this.f124g = f15;
            int i12 = this.f128k;
            if (i12 > 0) {
                if (f15 < 0.0f && (i12 & 1) == 1) {
                    this.f124g = -f15;
                    this.f125h = -f14;
                }
                float f16 = this.f124g;
                if (f16 > 1.0f && (i12 & 2) == 2) {
                    this.f124g = 2.0f - f16;
                    this.f125h = -this.f125h;
                }
            }
            i11++;
            d12 = d16;
            d13 = d18;
        }
    }

    @Override // p007a1.InterfaceC0032m
    /* renamed from: a */
    public boolean mo97a() {
        double d11 = this.f124g - this.f121d;
        double d12 = this.f120c;
        double d13 = this.f125h;
        if (Math.sqrt((((d13 * d13) * this.f126i) + ((d12 * d11) * d11)) / d12) <= this.f127j) {
            return true;
        }
        return false;
    }

    @Override // p007a1.InterfaceC0032m
    /* renamed from: b */
    public float mo98b() {
        return 0.0f;
    }

    /* renamed from: d */
    public void m99d(float f11, float f12, float f13, float f14, float f15, float f16, float f17, int i11) {
        this.f121d = f12;
        this.f118a = f16;
        this.f119b = false;
        this.f124g = f11;
        this.f122e = f13;
        this.f120c = f15;
        this.f126i = f14;
        this.f127j = f17;
        this.f128k = i11;
        this.f123f = 0.0f;
    }

    @Override // p007a1.InterfaceC0032m
    public float getInterpolation(float f11) {
        m96c(f11 - this.f123f);
        this.f123f = f11;
        return this.f124g;
    }
}
