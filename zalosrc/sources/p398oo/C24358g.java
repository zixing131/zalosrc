package p398oo;

import androidx.work.AbstractC2144f;
import androidx.work.AbstractC2147g0;
import fn0.AbstractC19074t;
import java.util.List;

/* renamed from: oo.g */
/* loaded from: classes4.dex */
public final class C24358g {

    /* renamed from: a */
    private final int f117575a;

    /* renamed from: b */
    private final List f117576b;

    /* renamed from: c */
    private final boolean f117577c;

    /* renamed from: d */
    private final long f117578d;

    /* renamed from: e */
    private final String f117579e;

    public C24358g(int i11, List list, boolean z11, long j11, String str) {
        AbstractC19074t.m100208f(list, "feeds");
        AbstractC19074t.m100208f(str, "feedLastRemote");
        this.f117575a = i11;
        this.f117576b = list;
        this.f117577c = z11;
        this.f117578d = j11;
        this.f117579e = str;
    }

    /* renamed from: a */
    public final String m127366a() {
        return this.f117579e;
    }

    /* renamed from: b */
    public final long m127367b() {
        return this.f117578d;
    }

    /* renamed from: c */
    public final List m127368c() {
        return this.f117576b;
    }

    /* renamed from: d */
    public final int m127369d() {
        return this.f117575a;
    }

    /* renamed from: e */
    public final boolean m127370e() {
        return this.f117577c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24358g)) {
            return false;
        }
        C24358g c24358g = (C24358g) obj;
        return this.f117575a == c24358g.f117575a && AbstractC19074t.m100204b(this.f117576b, c24358g.f117576b) && this.f117577c == c24358g.f117577c && this.f117578d == c24358g.f117578d && AbstractC19074t.m100204b(this.f117579e, c24358g.f117579e);
    }

    public int hashCode() {
        return (((((((this.f117575a * 31) + this.f117576b.hashCode()) * 31) + AbstractC2144f.m11520a(this.f117577c)) * 31) + AbstractC2147g0.m11521a(this.f117578d)) * 31) + this.f117579e.hashCode();
    }

    public String toString() {
        return "FeedPage(state=" + this.f117575a + ", feeds=" + this.f117576b + ", isLoadMore=" + this.f117577c + ", feedVersion=" + this.f117578d + ", feedLastRemote=" + this.f117579e + ")";
    }
}
