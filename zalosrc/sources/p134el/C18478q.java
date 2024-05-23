package p134el;

import c30.C3251l;
import fn0.AbstractC19074t;

/* renamed from: el.q */
/* loaded from: classes3.dex */
public final class C18478q implements InterfaceC18462a {

    /* renamed from: a */
    private final C3251l f93057a;

    /* renamed from: b */
    private final int f93058b;

    /* renamed from: c */
    private final int f93059c;

    /* renamed from: d */
    private final int f93060d;

    /* renamed from: e */
    private final String f93061e;

    public C18478q(C3251l c3251l, int i11, int i12, int i13, String str) {
        AbstractC19074t.m100208f(c3251l, "stickerGifInfo");
        AbstractC19074t.m100208f(str, "trendingKwd");
        this.f93057a = c3251l;
        this.f93058b = i11;
        this.f93059c = i12;
        this.f93060d = i13;
        this.f93061e = str;
    }

    /* renamed from: a */
    public final int m97822a() {
        return this.f93060d;
    }

    /* renamed from: b */
    public final int m97823b() {
        return this.f93059c;
    }

    /* renamed from: c */
    public final int m97824c() {
        return this.f93058b;
    }

    /* renamed from: d */
    public final C3251l m97825d() {
        return this.f93057a;
    }

    /* renamed from: e */
    public final String m97826e() {
        return this.f93061e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18478q)) {
            return false;
        }
        C18478q c18478q = (C18478q) obj;
        return AbstractC19074t.m100204b(this.f93057a, c18478q.f93057a) && this.f93058b == c18478q.f93058b && this.f93059c == c18478q.f93059c && this.f93060d == c18478q.f93060d && AbstractC19074t.m100204b(this.f93061e, c18478q.f93061e);
    }

    public int hashCode() {
        return (((((((this.f93057a.hashCode() * 31) + this.f93058b) * 31) + this.f93059c) * 31) + this.f93060d) * 31) + this.f93061e.hashCode();
    }

    public String toString() {
        return "TrendingGifClickParam(stickerGifInfo=" + this.f93057a + ", source=" + this.f93058b + ", rowIndex=" + this.f93059c + ", indicatorIndex=" + this.f93060d + ", trendingKwd=" + this.f93061e + ")";
    }
}
