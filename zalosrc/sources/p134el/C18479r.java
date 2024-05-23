package p134el;

import c30.C3251l;
import com.zing.zalo.p077ui.StickerView;
import fn0.AbstractC19074t;

/* renamed from: el.r */
/* loaded from: classes3.dex */
public final class C18479r implements InterfaceC18462a {

    /* renamed from: a */
    private final StickerView f93062a;

    /* renamed from: b */
    private final C3251l f93063b;

    /* renamed from: c */
    private final int f93064c;

    /* renamed from: d */
    private final String f93065d;

    public C18479r(StickerView stickerView, C3251l c3251l, int i11, String str) {
        AbstractC19074t.m100208f(stickerView, "currentView");
        AbstractC19074t.m100208f(c3251l, "stickerGifInfo");
        AbstractC19074t.m100208f(str, "trendingKwd");
        this.f93062a = stickerView;
        this.f93063b = c3251l;
        this.f93064c = i11;
        this.f93065d = str;
    }

    /* renamed from: a */
    public final StickerView m97827a() {
        return this.f93062a;
    }

    /* renamed from: b */
    public final int m97828b() {
        return this.f93064c;
    }

    /* renamed from: c */
    public final C3251l m97829c() {
        return this.f93063b;
    }

    /* renamed from: d */
    public final String m97830d() {
        return this.f93065d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18479r)) {
            return false;
        }
        C18479r c18479r = (C18479r) obj;
        return AbstractC19074t.m100204b(this.f93062a, c18479r.f93062a) && AbstractC19074t.m100204b(this.f93063b, c18479r.f93063b) && this.f93064c == c18479r.f93064c && AbstractC19074t.m100204b(this.f93065d, c18479r.f93065d);
    }

    public int hashCode() {
        return (((((this.f93062a.hashCode() * 31) + this.f93063b.hashCode()) * 31) + this.f93064c) * 31) + this.f93065d.hashCode();
    }

    public String toString() {
        return "TrendingPhotoStickerClickParam(currentView=" + this.f93062a + ", stickerGifInfo=" + this.f93063b + ", source=" + this.f93064c + ", trendingKwd=" + this.f93065d + ")";
    }
}
