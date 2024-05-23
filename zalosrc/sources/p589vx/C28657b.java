package p589vx;

import androidx.work.AbstractC2144f;
import com.zing.zalo.productcatalog.model.Product;
import fn0.AbstractC19074t;

/* renamed from: vx.b */
/* loaded from: classes4.dex */
public final class C28657b {

    /* renamed from: a */
    private final Product f132876a;

    /* renamed from: b */
    private final int f132877b;

    /* renamed from: c */
    private final int f132878c;

    /* renamed from: d */
    private final boolean f132879d;

    /* renamed from: e */
    private final String f132880e;

    public C28657b(Product product, int i11, int i12, boolean z11, String str) {
        AbstractC19074t.m100208f(product, "product");
        this.f132876a = product;
        this.f132877b = i11;
        this.f132878c = i12;
        this.f132879d = z11;
        this.f132880e = str;
    }

    /* renamed from: a */
    public final int m143395a() {
        return this.f132878c;
    }

    /* renamed from: b */
    public final int m143396b() {
        return this.f132877b;
    }

    /* renamed from: c */
    public final boolean m143397c() {
        return this.f132879d;
    }

    /* renamed from: d */
    public final String m143398d() {
        return this.f132880e;
    }

    /* renamed from: e */
    public final Product m143399e() {
        return this.f132876a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28657b)) {
            return false;
        }
        C28657b c28657b = (C28657b) obj;
        return AbstractC19074t.m100204b(this.f132876a, c28657b.f132876a) && this.f132877b == c28657b.f132877b && this.f132878c == c28657b.f132878c && this.f132879d == c28657b.f132879d && AbstractC19074t.m100204b(this.f132880e, c28657b.f132880e);
    }

    public int hashCode() {
        int hashCode = ((((((this.f132876a.hashCode() * 31) + this.f132877b) * 31) + this.f132878c) * 31) + AbstractC2144f.m11520a(this.f132879d)) * 31;
        String str = this.f132880e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "AddProductResponse(product=" + this.f132876a + ", catalogVersion=" + this.f132877b + ", catalogListVersion=" + this.f132878c + ", needResync=" + this.f132879d + ", newCatalogPhoto=" + this.f132880e + ")";
    }
}
