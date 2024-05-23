package p589vx;

import androidx.work.AbstractC2144f;
import com.zing.zalo.productcatalog.model.Product;
import fn0.AbstractC19074t;

/* renamed from: vx.h */
/* loaded from: classes4.dex */
public final class C28663h {

    /* renamed from: a */
    private final Product f132899a;

    /* renamed from: b */
    private final int f132900b;

    /* renamed from: c */
    private final int f132901c;

    /* renamed from: d */
    private final boolean f132902d;

    /* renamed from: e */
    private final String f132903e;

    public C28663h(Product product, int i11, int i12, boolean z11, String str) {
        AbstractC19074t.m100208f(product, "product");
        this.f132899a = product;
        this.f132900b = i11;
        this.f132901c = i12;
        this.f132902d = z11;
        this.f132903e = str;
    }

    /* renamed from: a */
    public final int m143416a() {
        return this.f132901c;
    }

    /* renamed from: b */
    public final int m143417b() {
        return this.f132900b;
    }

    /* renamed from: c */
    public final boolean m143418c() {
        return this.f132902d;
    }

    /* renamed from: d */
    public final String m143419d() {
        return this.f132903e;
    }

    /* renamed from: e */
    public final Product m143420e() {
        return this.f132899a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28663h)) {
            return false;
        }
        C28663h c28663h = (C28663h) obj;
        return AbstractC19074t.m100204b(this.f132899a, c28663h.f132899a) && this.f132900b == c28663h.f132900b && this.f132901c == c28663h.f132901c && this.f132902d == c28663h.f132902d && AbstractC19074t.m100204b(this.f132903e, c28663h.f132903e);
    }

    public int hashCode() {
        int hashCode = ((((((this.f132899a.hashCode() * 31) + this.f132900b) * 31) + this.f132901c) * 31) + AbstractC2144f.m11520a(this.f132902d)) * 31;
        String str = this.f132903e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "EditProductResponse(product=" + this.f132899a + ", catalogVersion=" + this.f132900b + ", catalogListVersion=" + this.f132901c + ", needResync=" + this.f132902d + ", newCatalogPhoto=" + this.f132903e + ")";
    }
}
