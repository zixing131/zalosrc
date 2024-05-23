package p389oe;

import fn0.AbstractC19074t;
import p389oe.AbstractC24241h;

/* renamed from: oe.e */
/* loaded from: classes3.dex */
public final class C24238e implements InterfaceC24234a {

    /* renamed from: a */
    private final AbstractC24241h.c f117071a;

    public C24238e(AbstractC24241h.c cVar) {
        AbstractC19074t.m100208f(cVar, "ringBackTone");
        this.f117071a = cVar;
    }

    /* renamed from: a */
    public final AbstractC24241h.c m126541a() {
        return this.f117071a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C24238e) && AbstractC19074t.m100204b(this.f117071a, ((C24238e) obj).f117071a);
    }

    public int hashCode() {
        return this.f117071a.hashCode();
    }

    public String toString() {
        return "OnClickPreviewRingBackTone(ringBackTone=" + this.f117071a + ")";
    }
}
