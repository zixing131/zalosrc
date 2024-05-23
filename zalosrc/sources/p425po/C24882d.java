package p425po;

import fn0.AbstractC19074t;

/* renamed from: po.d */
/* loaded from: classes4.dex */
public final class C24882d extends AbstractC24887i {

    /* renamed from: b */
    private final String f119386b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24882d(String str) {
        super(5);
        AbstractC19074t.m100208f(str, "title");
        this.f119386b = str;
    }

    /* renamed from: b */
    public final String m129389b() {
        return this.f119386b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C24882d) && AbstractC19074t.m100204b(this.f119386b, ((C24882d) obj).f119386b);
    }

    public int hashCode() {
        return this.f119386b.hashCode();
    }

    public String toString() {
        return "MoveTabDescriptionRow(title=" + this.f119386b + ")";
    }
}
