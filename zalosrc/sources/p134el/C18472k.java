package p134el;

import c30.C3251l;
import fn0.AbstractC19074t;

/* renamed from: el.k */
/* loaded from: classes3.dex */
public final class C18472k implements InterfaceC18462a {

    /* renamed from: a */
    private final C3251l f93043a;

    /* renamed from: b */
    private final int f93044b;

    public C18472k(C3251l c3251l, int i11) {
        AbstractC19074t.m100208f(c3251l, "stickerGifInfo");
        this.f93043a = c3251l;
        this.f93044b = i11;
    }

    /* renamed from: a */
    public final int m97809a() {
        return this.f93044b;
    }

    /* renamed from: b */
    public final C3251l m97810b() {
        return this.f93043a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18472k)) {
            return false;
        }
        C18472k c18472k = (C18472k) obj;
        return AbstractC19074t.m100204b(this.f93043a, c18472k.f93043a) && this.f93044b == c18472k.f93044b;
    }

    public int hashCode() {
        return (this.f93043a.hashCode() * 31) + this.f93044b;
    }

    public String toString() {
        return "PhotoStickerLongClickParam(stickerGifInfo=" + this.f93043a + ", source=" + this.f93044b + ")";
    }
}
