package p134el;

import com.zing.zalo.p077ui.StickerView;
import fn0.AbstractC19074t;

/* renamed from: el.o */
/* loaded from: classes3.dex */
public final class C18476o implements InterfaceC18462a {

    /* renamed from: a */
    private final StickerView f93053a;

    /* renamed from: b */
    private final int f93054b;

    /* renamed from: c */
    private final int f93055c;

    public C18476o(StickerView stickerView, int i11, int i12) {
        AbstractC19074t.m100208f(stickerView, "currentView");
        this.f93053a = stickerView;
        this.f93054b = i11;
        this.f93055c = i12;
    }

    /* renamed from: a */
    public final StickerView m97819a() {
        return this.f93053a;
    }

    /* renamed from: b */
    public final int m97820b() {
        return this.f93055c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18476o)) {
            return false;
        }
        C18476o c18476o = (C18476o) obj;
        return AbstractC19074t.m100204b(this.f93053a, c18476o.f93053a) && this.f93054b == c18476o.f93054b && this.f93055c == c18476o.f93055c;
    }

    public int hashCode() {
        return (((this.f93053a.hashCode() * 31) + this.f93054b) * 31) + this.f93055c;
    }

    public String toString() {
        return "StickerLongClickParam(currentView=" + this.f93053a + ", cateId=" + this.f93054b + ", sendSource=" + this.f93055c + ")";
    }
}
