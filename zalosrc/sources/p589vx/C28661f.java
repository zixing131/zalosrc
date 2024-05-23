package p589vx;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19074t;
import java.util.List;

/* renamed from: vx.f */
/* loaded from: classes4.dex */
public final class C28661f {

    /* renamed from: a */
    private final List f132891a;

    /* renamed from: b */
    private final int f132892b;

    /* renamed from: c */
    private final int f132893c;

    /* renamed from: d */
    private final boolean f132894d;

    /* renamed from: e */
    private final String f132895e;

    public C28661f(List list, int i11, int i12, boolean z11, String str) {
        AbstractC19074t.m100208f(list, "deletedProductIds");
        this.f132891a = list;
        this.f132892b = i11;
        this.f132893c = i12;
        this.f132894d = z11;
        this.f132895e = str;
    }

    /* renamed from: a */
    public final int m143408a() {
        return this.f132893c;
    }

    /* renamed from: b */
    public final int m143409b() {
        return this.f132892b;
    }

    /* renamed from: c */
    public final List m143410c() {
        return this.f132891a;
    }

    /* renamed from: d */
    public final boolean m143411d() {
        return this.f132894d;
    }

    /* renamed from: e */
    public final String m143412e() {
        return this.f132895e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28661f)) {
            return false;
        }
        C28661f c28661f = (C28661f) obj;
        return AbstractC19074t.m100204b(this.f132891a, c28661f.f132891a) && this.f132892b == c28661f.f132892b && this.f132893c == c28661f.f132893c && this.f132894d == c28661f.f132894d && AbstractC19074t.m100204b(this.f132895e, c28661f.f132895e);
    }

    public int hashCode() {
        int hashCode = ((((((this.f132891a.hashCode() * 31) + this.f132892b) * 31) + this.f132893c) * 31) + AbstractC2144f.m11520a(this.f132894d)) * 31;
        String str = this.f132895e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "DeleteProductsResponse(deletedProductIds=" + this.f132891a + ", catalogVersion=" + this.f132892b + ", catalogListVersion=" + this.f132893c + ", needResync=" + this.f132894d + ", newCatalogPhoto=" + this.f132895e + ")";
    }
}
