package p726zr;

/* renamed from: zr.f */
/* loaded from: classes4.dex */
public final class C32550f {

    /* renamed from: a */
    private final int f150426a;

    /* renamed from: b */
    private int f150427b;

    public C32550f(int i11, int i12) {
        this.f150426a = i11;
        this.f150427b = i12;
    }

    /* renamed from: b */
    public static /* synthetic */ C32550f m157621b(C32550f c32550f, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = c32550f.f150426a;
        }
        if ((i13 & 2) != 0) {
            i12 = c32550f.f150427b;
        }
        return c32550f.m157622a(i11, i12);
    }

    /* renamed from: a */
    public final C32550f m157622a(int i11, int i12) {
        return new C32550f(i11, i12);
    }

    /* renamed from: c */
    public final int m157623c() {
        return this.f150427b;
    }

    /* renamed from: d */
    public final int m157624d() {
        return this.f150426a;
    }

    /* renamed from: e */
    public final void m157625e(int i11) {
        this.f150427b = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32550f)) {
            return false;
        }
        C32550f c32550f = (C32550f) obj;
        return this.f150426a == c32550f.f150426a && this.f150427b == c32550f.f150427b;
    }

    public int hashCode() {
        return (this.f150426a * 31) + this.f150427b;
    }

    public String toString() {
        return "FeedTopReactionInfo(id=" + this.f150426a + ", count=" + this.f150427b + ")";
    }
}
