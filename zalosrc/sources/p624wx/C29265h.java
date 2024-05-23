package p624wx;

import androidx.work.AbstractC2144f;
import androidx.work.AbstractC2147g0;
import fn0.AbstractC19074t;
import java.util.List;

/* renamed from: wx.h */
/* loaded from: classes4.dex */
public final class C29265h {

    /* renamed from: a */
    private final AbstractC29261d f135605a;

    /* renamed from: b */
    private final List f135606b;

    /* renamed from: c */
    private int f135607c;

    /* renamed from: d */
    private final long f135608d;

    /* renamed from: e */
    private final boolean f135609e;

    /* renamed from: f */
    private final int f135610f;

    /* renamed from: g */
    private final long f135611g;

    public C29265h(AbstractC29261d abstractC29261d, List list, int i11, long j11, boolean z11, int i12, long j12) {
        AbstractC19074t.m100208f(abstractC29261d, "dataSource");
        AbstractC19074t.m100208f(list, "products");
        this.f135605a = abstractC29261d;
        this.f135606b = list;
        this.f135607c = i11;
        this.f135608d = j11;
        this.f135609e = z11;
        this.f135610f = i12;
        this.f135611g = j12;
    }

    /* renamed from: a */
    public final int m146200a() {
        return this.f135610f;
    }

    /* renamed from: b */
    public final AbstractC29261d m146201b() {
        return this.f135605a;
    }

    /* renamed from: c */
    public final boolean m146202c() {
        return this.f135609e;
    }

    /* renamed from: d */
    public final String m146203d() {
        return "[product size:" + this.f135606b.size() + ", lastItemOffset:" + this.f135607c + ", lastItemId:" + this.f135608d + ", hasMore:" + this.f135609e + ", catalogVersion:" + this.f135610f + ", dataSource:" + this.f135605a + "]";
    }

    /* renamed from: e */
    public final long m146204e() {
        return this.f135608d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29265h)) {
            return false;
        }
        C29265h c29265h = (C29265h) obj;
        return AbstractC19074t.m100204b(this.f135605a, c29265h.f135605a) && AbstractC19074t.m100204b(this.f135606b, c29265h.f135606b) && this.f135607c == c29265h.f135607c && this.f135608d == c29265h.f135608d && this.f135609e == c29265h.f135609e && this.f135610f == c29265h.f135610f && this.f135611g == c29265h.f135611g;
    }

    /* renamed from: f */
    public final int m146205f() {
        return this.f135607c;
    }

    /* renamed from: g */
    public final long m146206g() {
        return this.f135611g;
    }

    /* renamed from: h */
    public final List m146207h() {
        return this.f135606b;
    }

    public int hashCode() {
        return (((((((((((this.f135605a.hashCode() * 31) + this.f135606b.hashCode()) * 31) + this.f135607c) * 31) + AbstractC2147g0.m11521a(this.f135608d)) * 31) + AbstractC2144f.m11520a(this.f135609e)) * 31) + this.f135610f) * 31) + AbstractC2147g0.m11521a(this.f135611g);
    }

    /* renamed from: i */
    public final void m146208i(int i11) {
        this.f135607c = i11;
    }

    public String toString() {
        return "ProductPage(dataSource=" + this.f135605a + ", products=" + this.f135606b + ", lastItemOffset=" + this.f135607c + ", lastItemId=" + this.f135608d + ", hasMore=" + this.f135609e + ", catalogVersion=" + this.f135610f + ", previousPageLastItemId=" + this.f135611g + ")";
    }
}
