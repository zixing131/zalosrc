package p134el;

import b40.C2522b;
import c30.C3251l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: el.j */
/* loaded from: classes3.dex */
public final class C18471j implements InterfaceC18462a {

    /* renamed from: a */
    private final C3251l f93041a;

    /* renamed from: b */
    private final C2522b f93042b;

    public C18471j(C3251l c3251l, C2522b c2522b) {
        AbstractC19074t.m100208f(c3251l, "stickerGifInfo");
        this.f93041a = c3251l;
        this.f93042b = c2522b;
    }

    /* renamed from: a */
    public final C2522b m97807a() {
        return this.f93042b;
    }

    /* renamed from: b */
    public final C3251l m97808b() {
        return this.f93041a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18471j)) {
            return false;
        }
        C18471j c18471j = (C18471j) obj;
        return AbstractC19074t.m100204b(this.f93041a, c18471j.f93041a) && AbstractC19074t.m100204b(this.f93042b, c18471j.f93042b);
    }

    public int hashCode() {
        int hashCode = this.f93041a.hashCode() * 31;
        C2522b c2522b = this.f93042b;
        return hashCode + (c2522b == null ? 0 : c2522b.hashCode());
    }

    public String toString() {
        return "PhotoStickerClickParam(stickerGifInfo=" + this.f93041a + ", aiStickerLogInfo=" + this.f93042b + ")";
    }

    public /* synthetic */ C18471j(C3251l c3251l, C2522b c2522b, int i11, AbstractC19060k abstractC19060k) {
        this(c3251l, (i11 & 2) != 0 ? null : c2522b);
    }
}
