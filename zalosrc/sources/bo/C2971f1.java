package bo;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p471r3.C25630b;

/* renamed from: bo.f1 */
/* loaded from: classes4.dex */
public final class C2971f1 {

    /* renamed from: a */
    private C3020p0 f11738a;

    /* renamed from: b */
    private C25630b f11739b;

    /* renamed from: c */
    private boolean f11740c;

    /* renamed from: d */
    private String f11741d;

    /* renamed from: e */
    private String f11742e;

    public C2971f1() {
        this(null, null, false, null, null, 31, null);
    }

    /* renamed from: a */
    public final C3020p0 m14054a() {
        return this.f11738a;
    }

    /* renamed from: b */
    public final C25630b m14055b() {
        return this.f11739b;
    }

    /* renamed from: c */
    public final String m14056c() {
        return this.f11741d;
    }

    /* renamed from: d */
    public final String m14057d() {
        return this.f11742e;
    }

    /* renamed from: e */
    public final void m14058e(boolean z11) {
        this.f11740c = z11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2971f1)) {
            return false;
        }
        C2971f1 c2971f1 = (C2971f1) obj;
        return AbstractC19074t.m100204b(this.f11738a, c2971f1.f11738a) && AbstractC19074t.m100204b(this.f11739b, c2971f1.f11739b) && this.f11740c == c2971f1.f11740c && AbstractC19074t.m100204b(this.f11741d, c2971f1.f11741d) && AbstractC19074t.m100204b(this.f11742e, c2971f1.f11742e);
    }

    /* renamed from: f */
    public final void m14059f(C25630b c25630b) {
        this.f11739b = c25630b;
    }

    /* renamed from: g */
    public final void m14060g(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f11741d = str;
    }

    /* renamed from: h */
    public final void m14061h(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f11742e = str;
    }

    public int hashCode() {
        C3020p0 c3020p0 = this.f11738a;
        int hashCode = (c3020p0 == null ? 0 : c3020p0.hashCode()) * 31;
        C25630b c25630b = this.f11739b;
        return ((((((hashCode + (c25630b != null ? c25630b.hashCode() : 0)) * 31) + AbstractC2144f.m11520a(this.f11740c)) * 31) + this.f11741d.hashCode()) * 31) + this.f11742e.hashCode();
    }

    public String toString() {
        return "FeedStickerData(feedItem=" + this.f11738a + ", stickerInfo=" + this.f11739b + ", isScrolling=" + this.f11740c + ", stickerPrefixId=" + this.f11741d + ", stickerUniqueId=" + this.f11742e + ")";
    }

    public C2971f1(C3020p0 c3020p0, C25630b c25630b, boolean z11, String str, String str2) {
        AbstractC19074t.m100208f(str, "stickerPrefixId");
        AbstractC19074t.m100208f(str2, "stickerUniqueId");
        this.f11738a = c3020p0;
        this.f11739b = c25630b;
        this.f11740c = z11;
        this.f11741d = str;
        this.f11742e = str2;
    }

    public /* synthetic */ C2971f1(C3020p0 c3020p0, C25630b c25630b, boolean z11, String str, String str2, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? null : c3020p0, (i11 & 2) == 0 ? c25630b : null, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? "" : str, (i11 & 16) != 0 ? "" : str2);
    }
}
