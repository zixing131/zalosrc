package bo;

import fn0.AbstractC19074t;

/* renamed from: bo.h2 */
/* loaded from: classes4.dex */
public final class C2982h2 extends AbstractC3012n2 {

    /* renamed from: b */
    private final C3029r f11787b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2982h2(C3029r c3029r) {
        super(3);
        AbstractC19074t.m100208f(c3029r, "categoryData");
        this.f11787b = c3029r;
    }

    /* renamed from: b */
    public final C3029r m14140b() {
        return this.f11787b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2982h2) && AbstractC19074t.m100204b(this.f11787b, ((C2982h2) obj).f11787b);
    }

    public int hashCode() {
        return this.f11787b.hashCode();
    }

    public String toString() {
        return "MusicCategoryRow(categoryData=" + this.f11787b + ")";
    }
}
