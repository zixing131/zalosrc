package p389oe;

import fn0.AbstractC19074t;
import p389oe.AbstractC24241h;

/* renamed from: oe.d */
/* loaded from: classes3.dex */
public final class C24237d implements InterfaceC24234a {

    /* renamed from: a */
    private final AbstractC24241h.c f117070a;

    public C24237d(AbstractC24241h.c cVar) {
        AbstractC19074t.m100208f(cVar, "ringBackTone");
        this.f117070a = cVar;
    }

    /* renamed from: a */
    public final AbstractC24241h.c m126540a() {
        return this.f117070a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C24237d) && AbstractC19074t.m100204b(this.f117070a, ((C24237d) obj).f117070a);
    }

    public int hashCode() {
        return this.f117070a.hashCode();
    }

    public String toString() {
        return "OnClickPreviewDefaultRingBackTone(ringBackTone=" + this.f117070a + ")";
    }
}
