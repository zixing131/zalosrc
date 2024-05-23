package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class c04 {

    /* renamed from: j */
    public static final c04 f18075j = new c04(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: k */
    public static final c04 f18076k = new c04(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: l */
    public static final c04 f18077l = new c04(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: m */
    public static final c04 f18078m = new c04(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: a */
    public final double f18079a;

    /* renamed from: b */
    public final double f18080b;

    /* renamed from: c */
    public final double f18081c;

    /* renamed from: d */
    public final double f18082d;

    /* renamed from: e */
    public final double f18083e;

    /* renamed from: f */
    public final double f18084f;

    /* renamed from: g */
    public final double f18085g;

    /* renamed from: h */
    public final double f18086h;

    /* renamed from: i */
    public final double f18087i;

    public c04(double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19) {
        this.f18079a = d15;
        this.f18080b = d16;
        this.f18081c = d17;
        this.f18082d = d11;
        this.f18083e = d12;
        this.f18084f = d13;
        this.f18085g = d14;
        this.f18086h = d18;
        this.f18087i = d19;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c04.class != obj.getClass()) {
            return false;
        }
        c04 c04Var = (c04) obj;
        if (Double.compare(c04Var.f18082d, this.f18082d) == 0 && Double.compare(c04Var.f18083e, this.f18083e) == 0 && Double.compare(c04Var.f18084f, this.f18084f) == 0 && Double.compare(c04Var.f18085g, this.f18085g) == 0 && Double.compare(c04Var.f18086h, this.f18086h) == 0 && Double.compare(c04Var.f18087i, this.f18087i) == 0 && Double.compare(c04Var.f18079a, this.f18079a) == 0 && Double.compare(c04Var.f18080b, this.f18080b) == 0 && Double.compare(c04Var.f18081c, this.f18081c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f18079a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f18080b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f18081c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.f18082d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f18083e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f18084f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f18085g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.f18086h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f18087i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3))) * 31) + ((int) ((doubleToLongBits4 >>> 32) ^ doubleToLongBits4))) * 31) + ((int) ((doubleToLongBits5 >>> 32) ^ doubleToLongBits5))) * 31) + ((int) ((doubleToLongBits6 >>> 32) ^ doubleToLongBits6))) * 31) + ((int) ((doubleToLongBits7 >>> 32) ^ doubleToLongBits7))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public final String toString() {
        if (equals(f18075j)) {
            return "Rotate 0°";
        }
        if (equals(f18076k)) {
            return "Rotate 90°";
        }
        if (equals(f18077l)) {
            return "Rotate 180°";
        }
        if (equals(f18078m)) {
            return "Rotate 270°";
        }
        double d11 = this.f18079a;
        double d12 = this.f18080b;
        double d13 = this.f18081c;
        double d14 = this.f18082d;
        double d15 = this.f18083e;
        double d16 = this.f18084f;
        double d17 = this.f18085g;
        double d18 = this.f18086h;
        double d19 = this.f18087i;
        StringBuilder sb2 = new StringBuilder(260);
        sb2.append("Matrix{u=");
        sb2.append(d11);
        sb2.append(", v=");
        sb2.append(d12);
        sb2.append(", w=");
        sb2.append(d13);
        sb2.append(", a=");
        sb2.append(d14);
        sb2.append(", b=");
        sb2.append(d15);
        sb2.append(", c=");
        sb2.append(d16);
        sb2.append(", d=");
        sb2.append(d17);
        sb2.append(", tx=");
        sb2.append(d18);
        sb2.append(", ty=");
        sb2.append(d19);
        sb2.append("}");
        return sb2.toString();
    }
}
