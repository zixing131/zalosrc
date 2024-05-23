package iq;

import fn0.AbstractC19074t;
import java.util.List;

/* renamed from: iq.s0 */
/* loaded from: classes4.dex */
public final class C20743s0 {

    /* renamed from: a */
    private List f101911a;

    public C20743s0(List list) {
        AbstractC19074t.m100208f(list, "feedRows");
        this.f101911a = list;
    }

    /* renamed from: a */
    public final List m108182a() {
        return this.f101911a;
    }

    /* renamed from: b */
    public final void m108183b(List list) {
        AbstractC19074t.m100208f(list, "<set-?>");
        this.f101911a = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20743s0) && AbstractC19074t.m100204b(this.f101911a, ((C20743s0) obj).f101911a);
    }

    public int hashCode() {
        return this.f101911a.hashCode();
    }

    public String toString() {
        return "FeedAdapterData(feedRows=" + this.f101911a + ")";
    }
}
