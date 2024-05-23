package p425po;

import fn0.AbstractC19074t;
import p425po.AbstractC24888j;

/* renamed from: po.k */
/* loaded from: classes4.dex */
public final class C24889k extends AbstractC24888j {

    /* renamed from: e */
    private final String f119422e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24889k(String str) {
        super(str, AbstractC24888j.a.f119419q, null, 4, null);
        AbstractC19074t.m100208f(str, "title");
        this.f119422e = str;
    }

    @Override // p425po.AbstractC24888j
    /* renamed from: d */
    public String mo129410d() {
        return this.f119422e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C24889k) && AbstractC19074t.m100204b(this.f119422e, ((C24889k) obj).f119422e);
    }

    public int hashCode() {
        return this.f119422e.hashCode();
    }

    public String toString() {
        return "MoveTabSectionRowAlphabet(title=" + this.f119422e + ")";
    }
}
