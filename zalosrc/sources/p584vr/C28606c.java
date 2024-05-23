package p584vr;

import fn0.AbstractC19074t;
import p619wr.InterfaceC29195b;

/* renamed from: vr.c */
/* loaded from: classes4.dex */
public final class C28606c implements InterfaceC28604a {

    /* renamed from: a */
    private final InterfaceC29195b f132631a;

    public C28606c(InterfaceC29195b interfaceC29195b) {
        AbstractC19074t.m100208f(interfaceC29195b, "feedReactionData");
        this.f132631a = interfaceC29195b;
    }

    /* renamed from: a */
    public final InterfaceC29195b m143022a() {
        return this.f132631a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28606c) && AbstractC19074t.m100204b(this.f132631a, ((C28606c) obj).f132631a);
    }

    public int hashCode() {
        return this.f132631a.hashCode();
    }

    public String toString() {
        return "OnBtnMsgClickEvent(feedReactionData=" + this.f132631a + ")";
    }
}
