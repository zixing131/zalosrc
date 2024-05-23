package p589vx;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19074t;
import p624wx.C29259b;

/* renamed from: vx.a */
/* loaded from: classes4.dex */
public final class C28656a {

    /* renamed from: a */
    private final C29259b f132873a;

    /* renamed from: b */
    private final int f132874b;

    /* renamed from: c */
    private final boolean f132875c;

    public C28656a(C29259b c29259b, int i11, boolean z11) {
        AbstractC19074t.m100208f(c29259b, "catalog");
        this.f132873a = c29259b;
        this.f132874b = i11;
        this.f132875c = z11;
    }

    /* renamed from: a */
    public final C29259b m143392a() {
        return this.f132873a;
    }

    /* renamed from: b */
    public final int m143393b() {
        return this.f132874b;
    }

    /* renamed from: c */
    public final boolean m143394c() {
        return this.f132875c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28656a)) {
            return false;
        }
        C28656a c28656a = (C28656a) obj;
        return AbstractC19074t.m100204b(this.f132873a, c28656a.f132873a) && this.f132874b == c28656a.f132874b && this.f132875c == c28656a.f132875c;
    }

    public int hashCode() {
        return (((this.f132873a.hashCode() * 31) + this.f132874b) * 31) + AbstractC2144f.m11520a(this.f132875c);
    }

    public String toString() {
        return "AddCatalogResponse(catalog=" + this.f132873a + ", catalogListVersion=" + this.f132874b + ", needResync=" + this.f132875c + ")";
    }
}
