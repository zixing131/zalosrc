package p276jt;

import android.graphics.RectF;

/* renamed from: jt.q */
/* loaded from: classes4.dex */
public class C21362q {

    /* renamed from: a */
    public double f104140a;

    /* renamed from: b */
    public double f104141b;

    /* renamed from: c */
    public double f104142c;

    /* renamed from: d */
    public double f104143d;

    public C21362q() {
        m110710e(0.0d, 0.0d, 1.0d, 1.0d);
    }

    /* renamed from: a */
    public RectF m110706a() {
        return new RectF((float) this.f104140a, (float) this.f104141b, (float) this.f104142c, (float) this.f104143d);
    }

    /* renamed from: b */
    public double m110707b() {
        return this.f104143d - this.f104141b;
    }

    /* renamed from: c */
    public double m110708c() {
        double max = Math.max(0.0d - this.f104141b, this.f104143d - 1.0d);
        double d11 = this.f104143d - this.f104141b;
        if (max < 0.0d) {
            max = 0.0d;
        }
        double d12 = d11 - (max * 2.0d);
        if (d12 < 0.0d) {
            return 0.0d;
        }
        return d12;
    }

    /* renamed from: d */
    public double m110709d() {
        double max = Math.max(0.0d - this.f104140a, this.f104142c - 1.0d);
        double d11 = this.f104142c - this.f104140a;
        if (max < 0.0d) {
            max = 0.0d;
        }
        double d12 = d11 - (max * 2.0d);
        if (d12 < 0.0d) {
            return 0.0d;
        }
        return d12;
    }

    /* renamed from: e */
    public void m110710e(double d11, double d12, double d13, double d14) {
        this.f104140a = d11;
        this.f104141b = d12;
        this.f104142c = d13;
        this.f104143d = d14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C21362q c21362q = (C21362q) obj;
        if (Double.compare(c21362q.f104140a, this.f104140a) == 0 && Double.compare(c21362q.f104141b, this.f104141b) == 0 && Double.compare(c21362q.f104142c, this.f104142c) == 0 && Double.compare(c21362q.f104143d, this.f104143d) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public void m110711f(RectF rectF) {
        if (rectF != null) {
            this.f104140a = rectF.left;
            this.f104141b = rectF.top;
            this.f104142c = rectF.right;
            this.f104143d = rectF.bottom;
        }
    }

    /* renamed from: g */
    public void m110712g(C21362q c21362q) {
        if (c21362q != null) {
            this.f104140a = c21362q.f104140a;
            this.f104141b = c21362q.f104141b;
            this.f104142c = c21362q.f104142c;
            this.f104143d = c21362q.f104143d;
        }
    }

    /* renamed from: h */
    public double m110713h() {
        return this.f104142c - this.f104140a;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f104140a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f104141b);
        int i11 = (((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        long doubleToLongBits3 = Double.doubleToLongBits(this.f104142c);
        int i12 = (i11 * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)));
        long doubleToLongBits4 = Double.doubleToLongBits(this.f104143d);
        return (i12 * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)));
    }

    public String toString() {
        return "RectD: " + this.f104140a + ", " + this.f104141b + ", " + this.f104142c + ", " + this.f104143d;
    }

    public C21362q(C21362q c21362q) {
        if (c21362q != null) {
            m110712g(c21362q);
        } else {
            m110710e(0.0d, 0.0d, 1.0d, 1.0d);
        }
    }

    public C21362q(RectF rectF) {
        if (rectF != null) {
            m110711f(rectF);
        } else {
            m110710e(0.0d, 0.0d, 1.0d, 1.0d);
        }
    }

    public C21362q(double d11, double d12, double d13, double d14) {
        m110710e(d11, d12, d13, d14);
    }
}
