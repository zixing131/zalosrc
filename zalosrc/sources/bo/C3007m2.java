package bo;

import fn0.AbstractC19074t;

/* renamed from: bo.m2 */
/* loaded from: classes4.dex */
public final class C3007m2 extends AbstractC3012n2 {

    /* renamed from: b */
    private final C3054x f11976b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3007m2(C3054x c3054x) {
        super(2);
        AbstractC19074t.m100208f(c3054x, "emptyContentData");
        this.f11976b = c3054x;
    }

    /* renamed from: b */
    public final C3054x m14418b() {
        return this.f11976b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3007m2) && AbstractC19074t.m100204b(this.f11976b, ((C3007m2) obj).f11976b);
    }

    public int hashCode() {
        return this.f11976b.hashCode();
    }

    public String toString() {
        return "MusicEmptyRow(emptyContentData=" + this.f11976b + ")";
    }
}
