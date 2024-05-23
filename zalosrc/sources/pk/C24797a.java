package pk;

import fn0.AbstractC19074t;
import java.util.List;

/* renamed from: pk.a */
/* loaded from: classes3.dex */
public final class C24797a {

    /* renamed from: a */
    private final int f119026a;

    /* renamed from: b */
    private final List f119027b;

    public C24797a(int i11, List list) {
        AbstractC19074t.m100208f(list, "acceptedMessages");
        this.f119026a = i11;
        this.f119027b = list;
    }

    /* renamed from: a */
    public final List m128810a() {
        return this.f119027b;
    }

    /* renamed from: b */
    public final int m128811b() {
        return this.f119026a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24797a)) {
            return false;
        }
        C24797a c24797a = (C24797a) obj;
        return this.f119026a == c24797a.f119026a && AbstractC19074t.m100204b(this.f119027b, c24797a.f119027b);
    }

    public int hashCode() {
        return (this.f119026a * 31) + this.f119027b.hashCode();
    }

    public String toString() {
        return "MessagePage(totalMsgLoaded=" + this.f119026a + ", acceptedMessages=" + this.f119027b + ")";
    }
}
