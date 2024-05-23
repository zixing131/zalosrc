package p589vx;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19074t;
import java.util.List;

/* renamed from: vx.i */
/* loaded from: classes4.dex */
public final class C28664i {

    /* renamed from: a */
    private final List f132904a;

    /* renamed from: b */
    private final long f132905b;

    /* renamed from: c */
    private final long f132906c;

    /* renamed from: d */
    private final int f132907d;

    /* renamed from: e */
    private final int f132908e;

    /* renamed from: f */
    private final int f132909f;

    /* renamed from: g */
    private final int f132910g;

    /* renamed from: h */
    private final int f132911h;

    /* renamed from: i */
    private final int f132912i;

    public C28664i(List list, long j11, long j12, int i11, int i12, int i13, int i14, int i15, int i16) {
        AbstractC19074t.m100208f(list, "movedProductIds");
        this.f132904a = list;
        this.f132905b = j11;
        this.f132906c = j12;
        this.f132907d = i11;
        this.f132908e = i12;
        this.f132909f = i13;
        this.f132910g = i14;
        this.f132911h = i15;
        this.f132912i = i16;
    }

    /* renamed from: a */
    public final int m143421a() {
        return this.f132907d;
    }

    /* renamed from: b */
    public final List m143422b() {
        return this.f132904a;
    }

    /* renamed from: c */
    public final int m143423c() {
        return this.f132912i;
    }

    /* renamed from: d */
    public final int m143424d() {
        return this.f132911h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28664i)) {
            return false;
        }
        C28664i c28664i = (C28664i) obj;
        return AbstractC19074t.m100204b(this.f132904a, c28664i.f132904a) && this.f132905b == c28664i.f132905b && this.f132906c == c28664i.f132906c && this.f132907d == c28664i.f132907d && this.f132908e == c28664i.f132908e && this.f132909f == c28664i.f132909f && this.f132910g == c28664i.f132910g && this.f132911h == c28664i.f132911h && this.f132912i == c28664i.f132912i;
    }

    public int hashCode() {
        return (((((((((((((((this.f132904a.hashCode() * 31) + AbstractC2147g0.m11521a(this.f132905b)) * 31) + AbstractC2147g0.m11521a(this.f132906c)) * 31) + this.f132907d) * 31) + this.f132908e) * 31) + this.f132909f) * 31) + this.f132910g) * 31) + this.f132911h) * 31) + this.f132912i;
    }

    public String toString() {
        return "MoveProductsResponse(movedProductIds=" + this.f132904a + ", fromCatalogId=" + this.f132905b + ", toCatalogId=" + this.f132906c + ", fromCatalogOldVersion=" + this.f132907d + ", fromCatalogNewVersion=" + this.f132908e + ", toCatalogOldVersion=" + this.f132909f + ", toCatalogNewVersion=" + this.f132910g + ", oldCatalogListVersion=" + this.f132911h + ", newCatalogListVersion=" + this.f132912i + ")";
    }
}
