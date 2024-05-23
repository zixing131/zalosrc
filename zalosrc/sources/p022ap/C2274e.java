package p022ap;

import bo.InterfaceC3058y;
import fn0.AbstractC19074t;

/* renamed from: ap.e */
/* loaded from: classes4.dex */
public final class C2274e implements InterfaceC3058y {

    /* renamed from: a */
    private final String f9627a;

    public C2274e(String str) {
        AbstractC19074t.m100208f(str, "feedContentId");
        this.f9627a = str;
    }

    /* renamed from: a */
    public final String m12002a() {
        return this.f9627a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2274e) && AbstractC19074t.m100204b(this.f9627a, ((C2274e) obj).f9627a);
    }

    public int hashCode() {
        return this.f9627a.hashCode();
    }

    public String toString() {
        return "EventClickToggleVerticalGroupFeed(feedContentId=" + this.f9627a + ")";
    }
}
