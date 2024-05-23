package p134el;

import com.zing.zalo.p077ui.StickerView;
import fn0.AbstractC19074t;

/* renamed from: el.s */
/* loaded from: classes3.dex */
public final class C18480s implements InterfaceC18462a {

    /* renamed from: a */
    private final StickerView f93066a;

    /* renamed from: b */
    private final int f93067b;

    /* renamed from: c */
    private final int f93068c;

    /* renamed from: d */
    private final String f93069d;

    public C18480s(StickerView stickerView, int i11, int i12, String str) {
        AbstractC19074t.m100208f(stickerView, "currentView");
        AbstractC19074t.m100208f(str, "trendingKwd");
        this.f93066a = stickerView;
        this.f93067b = i11;
        this.f93068c = i12;
        this.f93069d = str;
    }

    /* renamed from: a */
    public final int m97831a() {
        return this.f93067b;
    }

    /* renamed from: b */
    public final StickerView m97832b() {
        return this.f93066a;
    }

    /* renamed from: c */
    public final int m97833c() {
        return this.f93068c;
    }

    /* renamed from: d */
    public final String m97834d() {
        return this.f93069d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18480s)) {
            return false;
        }
        C18480s c18480s = (C18480s) obj;
        return AbstractC19074t.m100204b(this.f93066a, c18480s.f93066a) && this.f93067b == c18480s.f93067b && this.f93068c == c18480s.f93068c && AbstractC19074t.m100204b(this.f93069d, c18480s.f93069d);
    }

    public int hashCode() {
        return (((((this.f93066a.hashCode() * 31) + this.f93067b) * 31) + this.f93068c) * 31) + this.f93069d.hashCode();
    }

    public String toString() {
        return "TrendingStickerClickParam(currentView=" + this.f93066a + ", cateId=" + this.f93067b + ", source=" + this.f93068c + ", trendingKwd=" + this.f93069d + ")";
    }
}
