package im;

import fn0.AbstractC19074t;

/* renamed from: im.i */
/* loaded from: classes3.dex */
public final class C20618i extends AbstractC20613d {

    /* renamed from: a */
    private final C20617h f101394a;

    /* renamed from: b */
    private final C20617h f101395b;

    /* renamed from: c */
    private final int f101396c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20618i(C20617h c20617h, C20617h c20617h2, int i11) {
        super(null);
        AbstractC19074t.m100208f(c20617h, "prevMsg");
        AbstractC19074t.m100208f(c20617h2, "rootMsg");
        this.f101394a = c20617h;
        this.f101395b = c20617h2;
        this.f101396c = i11;
    }

    /* renamed from: a */
    public final int m107325a() {
        return this.f101396c;
    }

    /* renamed from: b */
    public final C20617h m107326b() {
        return this.f101394a;
    }

    /* renamed from: c */
    public final C20617h m107327c() {
        return this.f101395b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20618i)) {
            return false;
        }
        C20618i c20618i = (C20618i) obj;
        return AbstractC19074t.m100204b(this.f101394a, c20618i.f101394a) && AbstractC19074t.m100204b(this.f101395b, c20618i.f101395b) && this.f101396c == c20618i.f101396c;
    }

    public int hashCode() {
        return (((this.f101394a.hashCode() * 31) + this.f101395b.hashCode()) * 31) + this.f101396c;
    }

    public String toString() {
        return "ForwardMsgInfoContent(prevMsg=" + this.f101394a + ", rootMsg=" + this.f101395b + ", forwardLevel=" + this.f101396c + ")";
    }
}
