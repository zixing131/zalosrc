package p425po;

import fn0.AbstractC19074t;

/* renamed from: po.g */
/* loaded from: classes4.dex */
public final class C24885g extends AbstractC24887i {

    /* renamed from: b */
    private final String f119400b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24885g(String str) {
        super(6);
        AbstractC19074t.m100208f(str, "title");
        this.f119400b = str;
    }

    /* renamed from: b */
    public final String m129399b() {
        return this.f119400b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C24885g) && AbstractC19074t.m100204b(this.f119400b, ((C24885g) obj).f119400b);
    }

    public int hashCode() {
        return this.f119400b.hashCode();
    }

    public String toString() {
        return "MoveTabInfoRow(title=" + this.f119400b + ")";
    }
}
