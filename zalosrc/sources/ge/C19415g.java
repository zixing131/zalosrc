package ge;

/* renamed from: ge.g */
/* loaded from: classes3.dex */
public class C19415g {

    /* renamed from: a */
    public int f96328a;

    /* renamed from: b */
    public int f96329b;

    /* renamed from: c */
    public int f96330c;

    /* renamed from: d */
    public boolean f96331d;

    /* renamed from: e */
    public boolean f96332e;

    public C19415g() {
        this.f96331d = false;
        this.f96332e = false;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C19415g clone() {
        return new C19415g(this.f96328a, this.f96329b, this.f96330c, this.f96331d, this.f96332e);
    }

    /* renamed from: b */
    public int m101546b(C19415g c19415g) {
        int m101547c = m101547c(c19415g);
        if (m101547c == 0) {
            int i11 = this.f96328a;
            int i12 = c19415g.f96328a;
            if (i11 > i12) {
                return 1;
            }
            if (i11 < i12) {
                return -1;
            }
            return 0;
        }
        return m101547c;
    }

    /* renamed from: c */
    public int m101547c(C19415g c19415g) {
        double d11;
        double d12 = this.f96329b + (this.f96330c * 12);
        double d13 = 0.0d;
        if (this.f96331d && this.f96332e) {
            d11 = 0.5d;
        } else {
            d11 = 0.0d;
        }
        double d14 = d12 + d11;
        double d15 = c19415g.f96329b + (c19415g.f96330c * 12);
        if (c19415g.f96331d && c19415g.f96332e) {
            d13 = 0.5d;
        }
        double d16 = d14 - (d15 + d13);
        if (d16 > 0.1d) {
            return 1;
        }
        if (d16 < -0.1d) {
            return -1;
        }
        return 0;
    }

    /* renamed from: d */
    public int m101548d(C19415g c19415g) {
        return Integer.compare(this.f96330c, c19415g.f96330c);
    }

    public C19415g(int i11, int i12, int i13) {
        this.f96331d = false;
        this.f96332e = false;
        this.f96328a = i11;
        this.f96329b = i12;
        this.f96330c = i13;
    }

    public C19415g(int i11, int i12, int i13, boolean z11, boolean z12) {
        this.f96328a = i11;
        this.f96329b = i12;
        this.f96330c = i13;
        this.f96331d = z11;
        this.f96332e = z12;
    }
}
