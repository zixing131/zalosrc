package p425po;

import fn0.AbstractC19074t;

/* renamed from: po.e */
/* loaded from: classes4.dex */
public final class C24883e extends AbstractC24887i {

    /* renamed from: b */
    private final C24894p f119387b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24883e(C24894p c24894p) {
        super(2);
        AbstractC19074t.m100208f(c24894p, "emptyContentData");
        this.f119387b = c24894p;
    }

    /* renamed from: b */
    public final C24894p m129390b() {
        return this.f119387b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C24883e) && AbstractC19074t.m100204b(this.f119387b, ((C24883e) obj).f119387b);
    }

    public int hashCode() {
        return this.f119387b.hashCode();
    }

    public String toString() {
        return "MoveTabEmptyRow(emptyContentData=" + this.f119387b + ")";
    }
}
