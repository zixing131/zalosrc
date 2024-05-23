package is;

import fn0.AbstractC19074t;

/* renamed from: is.k */
/* loaded from: classes4.dex */
public final class C20803k {

    /* renamed from: a */
    private final int f102233a;

    /* renamed from: b */
    private final String f102234b;

    public C20803k(int i11, String str) {
        AbstractC19074t.m100208f(str, "feedID");
        this.f102233a = i11;
        this.f102234b = str;
    }

    /* renamed from: a */
    public final String m108541a() {
        return this.f102234b;
    }

    /* renamed from: b */
    public final int m108542b() {
        return this.f102233a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20803k)) {
            return false;
        }
        C20803k c20803k = (C20803k) obj;
        return this.f102233a == c20803k.f102233a && AbstractC19074t.m100204b(this.f102234b, c20803k.f102234b);
    }

    public int hashCode() {
        return (this.f102233a * 31) + this.f102234b.hashCode();
    }

    public String toString() {
        return "FeedIndex(index=" + this.f102233a + ", feedID=" + this.f102234b + ")";
    }
}
