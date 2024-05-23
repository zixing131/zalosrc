package ae;

import fn0.AbstractC19074t;
import java.util.List;

/* renamed from: ae.h */
/* loaded from: classes3.dex */
public final class C0763h {

    /* renamed from: a */
    private final int f2538a;

    /* renamed from: b */
    private final List f2539b;

    public C0763h(int i11, List list) {
        AbstractC19074t.m100208f(list, "listMembers");
        this.f2538a = i11;
        this.f2539b = list;
    }

    /* renamed from: a */
    public final int m1379a() {
        return this.f2538a;
    }

    /* renamed from: b */
    public final List m1380b() {
        return this.f2539b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0763h)) {
            return false;
        }
        C0763h c0763h = (C0763h) obj;
        return this.f2538a == c0763h.f2538a && AbstractC19074t.m100204b(this.f2539b, c0763h.f2539b);
    }

    public int hashCode() {
        return (this.f2538a * 31) + this.f2539b.hashCode();
    }

    public String toString() {
        return "PullStatusMessageGroupDeliveredSeenInfoParams(groupId=" + this.f2538a + ", listMembers=" + this.f2539b + ")";
    }
}
