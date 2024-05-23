package r20;

import r20.AbstractC25622b;

/* renamed from: r20.h */
/* loaded from: classes5.dex */
public final class C25628h {

    /* renamed from: a */
    double f122539a;

    /* renamed from: b */
    double f122540b;

    /* renamed from: c */
    private boolean f122541c;

    /* renamed from: d */
    private double f122542d;

    /* renamed from: e */
    private double f122543e;

    /* renamed from: f */
    private double f122544f;

    /* renamed from: g */
    private double f122545g;

    /* renamed from: h */
    private double f122546h;

    /* renamed from: i */
    private double f122547i;

    /* renamed from: j */
    private final AbstractC25622b.p f122548j;

    public C25628h() {
        this.f122539a = Math.sqrt(1500.0d);
        this.f122540b = 0.5d;
        this.f122541c = false;
        this.f122547i = Double.MAX_VALUE;
        this.f122548j = new AbstractC25622b.p();
    }

    /* renamed from: b */
    private void m132383b() {
        if (this.f122541c) {
            return;
        }
        if (this.f122547i != Double.MAX_VALUE) {
            double d11 = this.f122540b;
            if (d11 > 1.0d) {
                double d12 = this.f122539a;
                this.f122544f = ((-d11) * d12) + (d12 * Math.sqrt((d11 * d11) - 1.0d));
                double d13 = this.f122540b;
                double d14 = this.f122539a;
                this.f122545g = ((-d13) * d14) - (d14 * Math.sqrt((d13 * d13) - 1.0d));
            } else if (d11 >= 0.0d && d11 < 1.0d) {
                this.f122546h = this.f122539a * Math.sqrt(1.0d - (d11 * d11));
            }
            this.f122541c = true;
            return;
        }
        throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
    }

    /* renamed from: a */
    public float m132384a() {
        return (float) this.f122547i;
    }

    /* renamed from: c */
    public boolean m132385c(float f11, float f12) {
        if (Math.abs(f12) < this.f122543e && Math.abs(f11 - m132384a()) < this.f122542d) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public C25628h m132386d(float f11) {
        if (f11 >= 0.0f) {
            this.f122540b = f11;
            this.f122541c = false;
            return this;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    /* renamed from: e */
    public C25628h m132387e(float f11) {
        this.f122547i = f11;
        return this;
    }

    /* renamed from: f */
    public C25628h m132388f(float f11) {
        if (f11 > 0.0f) {
            this.f122539a = Math.sqrt(f11);
            this.f122541c = false;
            return this;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m132389g(double d11) {
        double abs = Math.abs(d11);
        this.f122542d = abs;
        this.f122543e = abs * 62.5d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public AbstractC25622b.p m132390h(double d11, double d12, long j11) {
        double cos;
        double d13;
        m132383b();
        double d14 = j11 / 1000.0d;
        double d15 = d11 - this.f122547i;
        double d16 = this.f122540b;
        if (d16 > 1.0d) {
            double d17 = this.f122545g;
            double d18 = this.f122544f;
            double d19 = d15 - (((d17 * d15) - d12) / (d17 - d18));
            double d21 = ((d15 * d17) - d12) / (d17 - d18);
            d13 = (Math.pow(2.718281828459045d, d17 * d14) * d19) + (Math.pow(2.718281828459045d, this.f122544f * d14) * d21);
            double d22 = this.f122545g;
            double pow = d19 * d22 * Math.pow(2.718281828459045d, d22 * d14);
            double d23 = this.f122544f;
            cos = pow + (d21 * d23 * Math.pow(2.718281828459045d, d23 * d14));
        } else if (d16 == 1.0d) {
            double d24 = this.f122539a;
            double d25 = d12 + (d24 * d15);
            double d26 = d15 + (d25 * d14);
            d13 = Math.pow(2.718281828459045d, (-d24) * d14) * d26;
            double pow2 = d26 * Math.pow(2.718281828459045d, (-this.f122539a) * d14);
            double d27 = this.f122539a;
            cos = (d25 * Math.pow(2.718281828459045d, (-d27) * d14)) + (pow2 * (-d27));
        } else {
            double d28 = 1.0d / this.f122546h;
            double d29 = this.f122539a;
            double d31 = d28 * ((d16 * d29 * d15) + d12);
            double pow3 = Math.pow(2.718281828459045d, (-d16) * d29 * d14) * ((Math.cos(this.f122546h * d14) * d15) + (Math.sin(this.f122546h * d14) * d31));
            double d32 = this.f122539a;
            double d33 = this.f122540b;
            double d34 = (-d32) * pow3 * d33;
            double pow4 = Math.pow(2.718281828459045d, (-d33) * d32 * d14);
            double d35 = this.f122546h;
            double sin = (-d35) * d15 * Math.sin(d35 * d14);
            double d36 = this.f122546h;
            cos = d34 + (pow4 * (sin + (d31 * d36 * Math.cos(d36 * d14))));
            d13 = pow3;
        }
        AbstractC25622b.p pVar = this.f122548j;
        pVar.f122528a = (float) (d13 + this.f122547i);
        pVar.f122529b = (float) cos;
        return pVar;
    }

    public C25628h(float f11) {
        this.f122539a = Math.sqrt(1500.0d);
        this.f122540b = 0.5d;
        this.f122541c = false;
        this.f122547i = Double.MAX_VALUE;
        this.f122548j = new AbstractC25622b.p();
        this.f122547i = f11;
    }
}
