package p434q1;

import p434q1.AbstractC24979b;

/* renamed from: q1.e */
/* loaded from: classes2.dex */
public final class C24982e {

    /* renamed from: a */
    double f119694a;

    /* renamed from: b */
    double f119695b;

    /* renamed from: c */
    private boolean f119696c;

    /* renamed from: d */
    private double f119697d;

    /* renamed from: e */
    private double f119698e;

    /* renamed from: f */
    private double f119699f;

    /* renamed from: g */
    private double f119700g;

    /* renamed from: h */
    private double f119701h;

    /* renamed from: i */
    private double f119702i;

    /* renamed from: j */
    private final AbstractC24979b.o f119703j;

    public C24982e() {
        this.f119694a = Math.sqrt(1500.0d);
        this.f119695b = 0.5d;
        this.f119696c = false;
        this.f119702i = Double.MAX_VALUE;
        this.f119703j = new AbstractC24979b.o();
    }

    /* renamed from: b */
    private void m129739b() {
        if (this.f119696c) {
            return;
        }
        if (this.f119702i != Double.MAX_VALUE) {
            double d11 = this.f119695b;
            if (d11 > 1.0d) {
                double d12 = this.f119694a;
                this.f119699f = ((-d11) * d12) + (d12 * Math.sqrt((d11 * d11) - 1.0d));
                double d13 = this.f119695b;
                double d14 = this.f119694a;
                this.f119700g = ((-d13) * d14) - (d14 * Math.sqrt((d13 * d13) - 1.0d));
            } else if (d11 >= 0.0d && d11 < 1.0d) {
                this.f119701h = this.f119694a * Math.sqrt(1.0d - (d11 * d11));
            }
            this.f119696c = true;
            return;
        }
        throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
    }

    /* renamed from: a */
    public float m129740a() {
        return (float) this.f119702i;
    }

    /* renamed from: c */
    public boolean m129741c(float f11, float f12) {
        if (Math.abs(f12) < this.f119698e && Math.abs(f11 - m129740a()) < this.f119697d) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public C24982e m129742d(float f11) {
        if (f11 >= 0.0f) {
            this.f119695b = f11;
            this.f119696c = false;
            return this;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    /* renamed from: e */
    public C24982e m129743e(float f11) {
        this.f119702i = f11;
        return this;
    }

    /* renamed from: f */
    public C24982e m129744f(float f11) {
        if (f11 > 0.0f) {
            this.f119694a = Math.sqrt(f11);
            this.f119696c = false;
            return this;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m129745g(double d11) {
        double abs = Math.abs(d11);
        this.f119697d = abs;
        this.f119698e = abs * 62.5d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public AbstractC24979b.o m129746h(double d11, double d12, long j11) {
        double cos;
        double d13;
        m129739b();
        double d14 = j11 / 1000.0d;
        double d15 = d11 - this.f119702i;
        double d16 = this.f119695b;
        if (d16 > 1.0d) {
            double d17 = this.f119700g;
            double d18 = this.f119699f;
            double d19 = d15 - (((d17 * d15) - d12) / (d17 - d18));
            double d21 = ((d15 * d17) - d12) / (d17 - d18);
            d13 = (Math.pow(2.718281828459045d, d17 * d14) * d19) + (Math.pow(2.718281828459045d, this.f119699f * d14) * d21);
            double d22 = this.f119700g;
            double pow = d19 * d22 * Math.pow(2.718281828459045d, d22 * d14);
            double d23 = this.f119699f;
            cos = pow + (d21 * d23 * Math.pow(2.718281828459045d, d23 * d14));
        } else if (d16 == 1.0d) {
            double d24 = this.f119694a;
            double d25 = d12 + (d24 * d15);
            double d26 = d15 + (d25 * d14);
            d13 = Math.pow(2.718281828459045d, (-d24) * d14) * d26;
            double pow2 = d26 * Math.pow(2.718281828459045d, (-this.f119694a) * d14);
            double d27 = this.f119694a;
            cos = (d25 * Math.pow(2.718281828459045d, (-d27) * d14)) + (pow2 * (-d27));
        } else {
            double d28 = 1.0d / this.f119701h;
            double d29 = this.f119694a;
            double d31 = d28 * ((d16 * d29 * d15) + d12);
            double pow3 = Math.pow(2.718281828459045d, (-d16) * d29 * d14) * ((Math.cos(this.f119701h * d14) * d15) + (Math.sin(this.f119701h * d14) * d31));
            double d32 = this.f119694a;
            double d33 = this.f119695b;
            double d34 = (-d32) * pow3 * d33;
            double pow4 = Math.pow(2.718281828459045d, (-d33) * d32 * d14);
            double d35 = this.f119701h;
            double sin = (-d35) * d15 * Math.sin(d35 * d14);
            double d36 = this.f119701h;
            cos = d34 + (pow4 * (sin + (d31 * d36 * Math.cos(d36 * d14))));
            d13 = pow3;
        }
        AbstractC24979b.o oVar = this.f119703j;
        oVar.f119688a = (float) (d13 + this.f119702i);
        oVar.f119689b = (float) cos;
        return oVar;
    }

    public C24982e(float f11) {
        this.f119694a = Math.sqrt(1500.0d);
        this.f119695b = 0.5d;
        this.f119696c = false;
        this.f119702i = Double.MAX_VALUE;
        this.f119703j = new AbstractC24979b.o();
        this.f119702i = f11;
    }
}
