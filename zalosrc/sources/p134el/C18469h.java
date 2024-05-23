package p134el;

import c30.C3251l;
import fn0.AbstractC19074t;

/* renamed from: el.h */
/* loaded from: classes3.dex */
public final class C18469h implements InterfaceC18462a {

    /* renamed from: a */
    private final C3251l f93037a;

    /* renamed from: b */
    private final int f93038b;

    public C18469h(C3251l c3251l, int i11) {
        AbstractC19074t.m100208f(c3251l, "stickerGifInfo");
        this.f93037a = c3251l;
        this.f93038b = i11;
    }

    /* renamed from: a */
    public final int m97803a() {
        return this.f93038b;
    }

    /* renamed from: b */
    public final C3251l m97804b() {
        return this.f93037a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18469h)) {
            return false;
        }
        C18469h c18469h = (C18469h) obj;
        return AbstractC19074t.m100204b(this.f93037a, c18469h.f93037a) && this.f93038b == c18469h.f93038b;
    }

    public int hashCode() {
        return (this.f93037a.hashCode() * 31) + this.f93038b;
    }

    public String toString() {
        return "GifLongClickParam(stickerGifInfo=" + this.f93037a + ", source=" + this.f93038b + ")";
    }
}
