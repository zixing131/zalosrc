package p624wx;

import androidx.work.AbstractC2144f;
import androidx.work.AbstractC2147g0;
import fn0.AbstractC19074t;
import java.util.List;

/* renamed from: wx.c */
/* loaded from: classes4.dex */
public final class C29260c {

    /* renamed from: a */
    private final AbstractC29261d f135571a;

    /* renamed from: b */
    private final List f135572b;

    /* renamed from: c */
    private int f135573c;

    /* renamed from: d */
    private final long f135574d;

    /* renamed from: e */
    private final boolean f135575e;

    /* renamed from: f */
    private final int f135576f;

    /* renamed from: g */
    private final long f135577g;

    public C29260c(AbstractC29261d abstractC29261d, List list, int i11, long j11, boolean z11, int i12, long j12) {
        AbstractC19074t.m100208f(abstractC29261d, "dataSource");
        AbstractC19074t.m100208f(list, "catalogs");
        this.f135571a = abstractC29261d;
        this.f135572b = list;
        this.f135573c = i11;
        this.f135574d = j11;
        this.f135575e = z11;
        this.f135576f = i12;
        this.f135577g = j12;
    }

    /* renamed from: a */
    public final int m146172a() {
        return this.f135576f;
    }

    /* renamed from: b */
    public final List m146173b() {
        return this.f135572b;
    }

    /* renamed from: c */
    public final AbstractC29261d m146174c() {
        return this.f135571a;
    }

    /* renamed from: d */
    public final boolean m146175d() {
        return this.f135575e;
    }

    /* renamed from: e */
    public final String m146176e() {
        return "[dataSource:" + this.f135571a + ", catalog size:" + this.f135572b.size() + ", lastItemOffset:" + this.f135573c + ", lastItemId:" + this.f135574d + ", hasMore:" + this.f135575e + ", catalogListVersion:" + this.f135576f + "]";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29260c)) {
            return false;
        }
        C29260c c29260c = (C29260c) obj;
        return AbstractC19074t.m100204b(this.f135571a, c29260c.f135571a) && AbstractC19074t.m100204b(this.f135572b, c29260c.f135572b) && this.f135573c == c29260c.f135573c && this.f135574d == c29260c.f135574d && this.f135575e == c29260c.f135575e && this.f135576f == c29260c.f135576f && this.f135577g == c29260c.f135577g;
    }

    /* renamed from: f */
    public final long m146177f() {
        return this.f135574d;
    }

    /* renamed from: g */
    public final int m146178g() {
        return this.f135573c;
    }

    /* renamed from: h */
    public final long m146179h() {
        return this.f135577g;
    }

    public int hashCode() {
        return (((((((((((this.f135571a.hashCode() * 31) + this.f135572b.hashCode()) * 31) + this.f135573c) * 31) + AbstractC2147g0.m11521a(this.f135574d)) * 31) + AbstractC2144f.m11520a(this.f135575e)) * 31) + this.f135576f) * 31) + AbstractC2147g0.m11521a(this.f135577g);
    }

    /* renamed from: i */
    public final void m146180i(int i11) {
        this.f135573c = i11;
    }

    public String toString() {
        return "CatalogPage(dataSource=" + this.f135571a + ", catalogs=" + this.f135572b + ", lastItemOffset=" + this.f135573c + ", lastItemId=" + this.f135574d + ", hasMore=" + this.f135575e + ", catalogListVersion=" + this.f135576f + ", previousPageLastItemId=" + this.f135577g + ")";
    }
}
