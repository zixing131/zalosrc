package a10;

import fn0.AbstractC19074t;
import java.util.List;

/* renamed from: a10.o */
/* loaded from: classes5.dex */
public final class C0050o {

    /* renamed from: a */
    private final String f190a;

    /* renamed from: b */
    private final List f191b;

    public C0050o(String str, List list) {
        AbstractC19074t.m100208f(str, "userId");
        this.f190a = str;
        this.f191b = list;
    }

    /* renamed from: a */
    public final List m148a() {
        return this.f191b;
    }

    /* renamed from: b */
    public final String m149b() {
        return this.f190a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0050o)) {
            return false;
        }
        C0050o c0050o = (C0050o) obj;
        return AbstractC19074t.m100204b(this.f190a, c0050o.f190a) && AbstractC19074t.m100204b(this.f191b, c0050o.f191b);
    }

    public int hashCode() {
        int hashCode = this.f190a.hashCode() * 31;
        List list = this.f191b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "LogViewVideoAdsTb(userId=" + this.f190a + ", logs=" + this.f191b + ")";
    }
}
