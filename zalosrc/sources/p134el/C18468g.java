package p134el;

import c30.C3251l;
import fn0.AbstractC19074t;

/* renamed from: el.g */
/* loaded from: classes3.dex */
public final class C18468g implements InterfaceC18462a {

    /* renamed from: a */
    private final C3251l f93036a;

    public C18468g(C3251l c3251l) {
        AbstractC19074t.m100208f(c3251l, "stickerGifInfo");
        this.f93036a = c3251l;
    }

    /* renamed from: a */
    public final C3251l m97802a() {
        return this.f93036a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18468g) && AbstractC19074t.m100204b(this.f93036a, ((C18468g) obj).f93036a);
    }

    public int hashCode() {
        return this.f93036a.hashCode();
    }

    public String toString() {
        return "GifClickParam(stickerGifInfo=" + this.f93036a + ")";
    }
}
