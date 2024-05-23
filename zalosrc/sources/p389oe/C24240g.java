package p389oe;

import fn0.AbstractC19074t;
import p389oe.AbstractC24241h;

/* renamed from: oe.g */
/* loaded from: classes3.dex */
public final class C24240g implements InterfaceC24234a {

    /* renamed from: a */
    private final AbstractC24241h.c f117073a;

    public C24240g(AbstractC24241h.c cVar) {
        AbstractC19074t.m100208f(cVar, "ringBackTone");
        this.f117073a = cVar;
    }

    /* renamed from: a */
    public final AbstractC24241h.c m126542a() {
        return this.f117073a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C24240g) && AbstractC19074t.m100204b(this.f117073a, ((C24240g) obj).f117073a);
    }

    public int hashCode() {
        return this.f117073a.hashCode();
    }

    public String toString() {
        return "OnSelectRingBackTone(ringBackTone=" + this.f117073a + ")";
    }
}
