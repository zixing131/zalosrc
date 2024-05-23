package p134el;

import com.zing.zalo.p077ui.StickerView;
import fn0.AbstractC19074t;

/* renamed from: el.n */
/* loaded from: classes3.dex */
public final class C18475n implements InterfaceC18462a {

    /* renamed from: a */
    private final StickerView f93051a;

    /* renamed from: b */
    private final int f93052b;

    public C18475n(StickerView stickerView, int i11) {
        AbstractC19074t.m100208f(stickerView, "currentView");
        this.f93051a = stickerView;
        this.f93052b = i11;
    }

    /* renamed from: a */
    public final int m97817a() {
        return this.f93052b;
    }

    /* renamed from: b */
    public final StickerView m97818b() {
        return this.f93051a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18475n)) {
            return false;
        }
        C18475n c18475n = (C18475n) obj;
        return AbstractC19074t.m100204b(this.f93051a, c18475n.f93051a) && this.f93052b == c18475n.f93052b;
    }

    public int hashCode() {
        return (this.f93051a.hashCode() * 31) + this.f93052b;
    }

    public String toString() {
        return "StickerClickParam(currentView=" + this.f93051a + ", cateId=" + this.f93052b + ")";
    }
}
