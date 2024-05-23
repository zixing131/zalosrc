package p022ap;

import bo.C3000l0;
import bo.C3020p0;
import bo.InterfaceC3058y;
import fn0.AbstractC19074t;

/* renamed from: ap.a */
/* loaded from: classes4.dex */
public final class C2270a implements InterfaceC3058y {

    /* renamed from: a */
    private final C3000l0 f9623a;

    /* renamed from: b */
    private final C3020p0 f9624b;

    public C2270a(C3000l0 c3000l0, C3020p0 c3020p0) {
        AbstractC19074t.m100208f(c3000l0, "feedContent");
        AbstractC19074t.m100208f(c3020p0, "feedItem");
        this.f9623a = c3000l0;
        this.f9624b = c3020p0;
    }

    /* renamed from: a */
    public final C3000l0 m11998a() {
        return this.f9623a;
    }

    /* renamed from: b */
    public final C3020p0 m11999b() {
        return this.f9624b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2270a)) {
            return false;
        }
        C2270a c2270a = (C2270a) obj;
        return AbstractC19074t.m100204b(this.f9623a, c2270a.f9623a) && AbstractC19074t.m100204b(this.f9624b, c2270a.f9624b);
    }

    public int hashCode() {
        return (this.f9623a.hashCode() * 31) + this.f9624b.hashCode();
    }

    public String toString() {
        return "EventClickButtonMoveTab(feedContent=" + this.f9623a + ", feedItem=" + this.f9624b + ")";
    }
}
