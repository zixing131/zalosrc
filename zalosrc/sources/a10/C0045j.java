package a10;

import fn0.AbstractC19074t;
import java.util.List;

/* renamed from: a10.j */
/* loaded from: classes5.dex */
public final class C0045j {

    /* renamed from: a */
    private final String f180a;

    /* renamed from: b */
    private final List f181b;

    public C0045j(String str, List list) {
        AbstractC19074t.m100208f(str, "userId");
        this.f180a = str;
        this.f181b = list;
    }

    /* renamed from: a */
    public final List m138a() {
        return this.f181b;
    }

    /* renamed from: b */
    public final String m139b() {
        return this.f180a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0045j)) {
            return false;
        }
        C0045j c0045j = (C0045j) obj;
        return AbstractC19074t.m100204b(this.f180a, c0045j.f180a) && AbstractC19074t.m100204b(this.f181b, c0045j.f181b);
    }

    public int hashCode() {
        int hashCode = this.f180a.hashCode() * 31;
        List list = this.f181b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "LogImpsAdsTb(userId=" + this.f180a + ", logs=" + this.f181b + ")";
    }
}
