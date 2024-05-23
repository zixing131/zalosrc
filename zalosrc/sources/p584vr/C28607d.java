package p584vr;

import fn0.AbstractC19074t;
import p619wr.InterfaceC29195b;

/* renamed from: vr.d */
/* loaded from: classes4.dex */
public final class C28607d implements InterfaceC28604a {

    /* renamed from: a */
    private final InterfaceC29195b f132632a;

    public C28607d(InterfaceC29195b interfaceC29195b) {
        AbstractC19074t.m100208f(interfaceC29195b, "feedReactionData");
        this.f132632a = interfaceC29195b;
    }

    /* renamed from: a */
    public final InterfaceC29195b m143023a() {
        return this.f132632a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28607d) && AbstractC19074t.m100204b(this.f132632a, ((C28607d) obj).f132632a);
    }

    public int hashCode() {
        return this.f132632a.hashCode();
    }

    public String toString() {
        return "OnClickRowLikeEvent(feedReactionData=" + this.f132632a + ")";
    }
}
