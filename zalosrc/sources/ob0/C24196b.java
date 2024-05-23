package ob0;

import android.view.animation.AnimationUtils;

/* renamed from: ob0.b */
/* loaded from: classes6.dex */
public class C24196b {

    /* renamed from: a */
    private double f116784a;

    /* renamed from: b */
    private double f116785b;

    /* renamed from: c */
    private long f116786c;

    /* renamed from: d */
    private double f116787d;

    /* renamed from: e */
    private double f116788e;

    /* renamed from: f */
    private boolean f116789f = true;

    /* renamed from: g */
    private int f116790g;

    /* renamed from: h */
    private boolean f116791h;

    /* renamed from: i */
    private int f116792i;

    /* renamed from: j */
    private double f116793j;

    /* renamed from: k */
    private double f116794k;

    /* renamed from: l */
    private double f116795l;

    /* renamed from: m */
    private C24195a f116796m;

    /* renamed from: n */
    private long f116797n;

    /* renamed from: o */
    private double f116798o;

    /* renamed from: p */
    private double f116799p;

    /* renamed from: q */
    private double f116800q;

    /* renamed from: a */
    public boolean m126137a() {
        if (this.f116796m == null || this.f116789f) {
            return false;
        }
        int i11 = this.f116790g;
        if (i11 != 0) {
            if (this.f116792i == 1) {
                double d11 = i11;
                this.f116784a = d11;
                this.f116798o = d11;
            } else {
                double d12 = i11;
                this.f116785b = d12;
                this.f116799p = d12;
            }
            this.f116790g = 0;
            return true;
        }
        if (this.f116791h) {
            this.f116789f = true;
            return true;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        this.f116786c = currentAnimationTimeMillis;
        float f11 = 0.016f;
        float min = Math.min(((float) (currentAnimationTimeMillis - this.f116797n)) / 1000.0f, 0.016f);
        if (min != 0.0f) {
            f11 = min;
        }
        this.f116797n = this.f116786c;
        if (this.f116792i == 2) {
            double m126136a = this.f116796m.m126136a(this.f116800q, f11, this.f116788e, this.f116799p);
            double d13 = this.f116799p + (f11 * m126136a);
            this.f116785b = d13;
            this.f116800q = m126136a;
            if (m126141e(d13, this.f116794k, this.f116788e)) {
                this.f116791h = true;
                this.f116785b = this.f116788e;
            } else {
                this.f116799p = this.f116785b;
            }
        } else {
            double m126136a2 = this.f116796m.m126136a(this.f116800q, f11, this.f116787d, this.f116798o);
            double d14 = this.f116798o + (f11 * m126136a2);
            this.f116784a = d14;
            this.f116800q = m126136a2;
            if (m126141e(d14, this.f116793j, this.f116787d)) {
                this.f116791h = true;
                this.f116784a = this.f116787d;
            } else {
                this.f116798o = this.f116784a;
            }
        }
        return true;
    }

    /* renamed from: b */
    public final void m126138b() {
        this.f116789f = true;
        this.f116790g = 0;
    }

    /* renamed from: c */
    public final int m126139c() {
        return (int) this.f116784a;
    }

    /* renamed from: d */
    public final int m126140d() {
        return (int) this.f116785b;
    }

    /* renamed from: e */
    public boolean m126141e(double d11, double d12, double d13) {
        char c11;
        if (d12 < d13 && d11 > d13) {
            return true;
        }
        if (d12 > d13) {
            c11 = 1;
        } else if (d12 == d13) {
            c11 = 0;
        } else {
            c11 = 65535;
        }
        if (c11 > 0 && d11 < d13) {
            return true;
        }
        if ((c11 == 0 && Math.signum(this.f116795l) != Math.signum(d11)) || Math.abs(d11 - d13) < 1.0d) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m126142f() {
        return this.f116789f;
    }

    /* renamed from: g */
    public void m126143g(float f11, float f12, float f13, float f14, float f15, int i11, boolean z11) {
        this.f116789f = false;
        this.f116791h = false;
        double d11 = f11;
        this.f116798o = d11;
        this.f116793j = d11;
        this.f116787d = f12;
        double d12 = f13;
        this.f116799p = d12;
        this.f116794k = d12;
        this.f116785b = (int) d12;
        this.f116788e = f14;
        double d13 = f15;
        this.f116795l = d13;
        this.f116800q = d13;
        if (Math.abs(d13) > 5000.0d && !z11) {
            this.f116796m = new C24195a(1.0f, 0.55f);
        } else {
            this.f116796m = new C24195a(1.0f, 0.4f);
        }
        this.f116792i = i11;
        this.f116797n = AnimationUtils.currentAnimationTimeMillis();
    }

    /* renamed from: h */
    public void m126144h(int i11) {
        this.f116790g = i11;
    }
}
