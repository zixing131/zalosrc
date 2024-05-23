package p398oo;

import fn0.AbstractC19074t;
import java.util.List;

/* renamed from: oo.a0 */
/* loaded from: classes4.dex */
public final class C24347a0 {

    /* renamed from: a */
    private final List f117453a;

    public C24347a0(List list) {
        AbstractC19074t.m100208f(list, "deleteErrorFIds");
        this.f117453a = list;
    }

    /* renamed from: a */
    public final List m127221a() {
        return this.f117453a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C24347a0) && AbstractC19074t.m100204b(this.f117453a, ((C24347a0) obj).f117453a);
    }

    public int hashCode() {
        return this.f117453a.hashCode();
    }

    public String toString() {
        return "ResultDeleteFeed(deleteErrorFIds=" + this.f117453a + ")";
    }
}
