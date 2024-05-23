package p406ow;

/* renamed from: ow.h */
/* loaded from: classes.dex */
class C24572h {

    /* renamed from: a */
    private final double f118285a;

    /* renamed from: b */
    private final int f118286b;

    /* renamed from: c */
    private double f118287c = -1.0d;

    /* renamed from: d */
    private int f118288d;

    public C24572h(double d11) {
        int ceil;
        this.f118285a = d11;
        if (d11 == 0.0d) {
            ceil = Integer.MAX_VALUE;
        } else {
            ceil = (int) Math.ceil(1.0d / d11);
        }
        this.f118286b = ceil;
    }

    /* renamed from: a */
    public void m127986a(double d11) {
        double d12 = 1.0d - this.f118285a;
        int i11 = this.f118288d;
        if (i11 > this.f118286b) {
            this.f118287c = Math.exp((d12 * Math.log(this.f118287c)) + (this.f118285a * Math.log(d11)));
        } else if (i11 > 0) {
            double d13 = (d12 * i11) / (i11 + 1.0d);
            this.f118287c = Math.exp((d13 * Math.log(this.f118287c)) + ((1.0d - d13) * Math.log(d11)));
        } else {
            this.f118287c = d11;
        }
        this.f118288d++;
    }

    /* renamed from: b */
    public double m127987b() {
        return this.f118287c;
    }

    /* renamed from: c */
    public void m127988c() {
        this.f118287c = -1.0d;
        this.f118288d = 0;
    }
}
