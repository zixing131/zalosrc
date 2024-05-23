package p589vx;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19074t;
import p624wx.C29259b;

/* renamed from: vx.g */
/* loaded from: classes4.dex */
public final class C28662g {

    /* renamed from: a */
    private final C29259b f132896a;

    /* renamed from: b */
    private final int f132897b;

    /* renamed from: c */
    private final boolean f132898c;

    public C28662g(C29259b c29259b, int i11, boolean z11) {
        AbstractC19074t.m100208f(c29259b, "catalog");
        this.f132896a = c29259b;
        this.f132897b = i11;
        this.f132898c = z11;
    }

    /* renamed from: a */
    public final C29259b m143413a() {
        return this.f132896a;
    }

    /* renamed from: b */
    public final int m143414b() {
        return this.f132897b;
    }

    /* renamed from: c */
    public final boolean m143415c() {
        return this.f132898c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28662g)) {
            return false;
        }
        C28662g c28662g = (C28662g) obj;
        return AbstractC19074t.m100204b(this.f132896a, c28662g.f132896a) && this.f132897b == c28662g.f132897b && this.f132898c == c28662g.f132898c;
    }

    public int hashCode() {
        return (((this.f132896a.hashCode() * 31) + this.f132897b) * 31) + AbstractC2144f.m11520a(this.f132898c);
    }

    public String toString() {
        return "EditCatalogResponse(catalog=" + this.f132896a + ", catalogListVersion=" + this.f132897b + ", needResync=" + this.f132898c + ")";
    }
}
