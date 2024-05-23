package df0;

/* renamed from: df0.f */
/* loaded from: classes4.dex */
public final class C17916f {

    /* renamed from: a */
    private final int f90454a;

    /* renamed from: b */
    private final int f90455b;

    /* renamed from: c */
    private final int f90456c;

    /* renamed from: d */
    private final int f90457d;

    public C17916f(int i11, int i12, int i13, int i14) {
        this.f90454a = i11;
        this.f90455b = i12;
        this.f90456c = i13;
        this.f90457d = i14;
    }

    /* renamed from: a */
    public final int m94518a() {
        return this.f90454a;
    }

    /* renamed from: b */
    public final int m94519b() {
        return this.f90455b;
    }

    /* renamed from: c */
    public final int m94520c() {
        return this.f90457d;
    }

    /* renamed from: d */
    public final int m94521d() {
        return this.f90456c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17916f)) {
            return false;
        }
        C17916f c17916f = (C17916f) obj;
        return this.f90454a == c17916f.f90454a && this.f90455b == c17916f.f90455b && this.f90456c == c17916f.f90456c && this.f90457d == c17916f.f90457d;
    }

    public int hashCode() {
        return (((((this.f90454a * 31) + this.f90455b) * 31) + this.f90456c) * 31) + this.f90457d;
    }

    public String toString() {
        return "WERMetrics(deletions=" + this.f90454a + ", insertions=" + this.f90455b + ", substitutions=" + this.f90456c + ", refLength=" + this.f90457d + ")";
    }
}
