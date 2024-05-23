package a10;

import fn0.AbstractC19074t;
import java.util.List;

/* renamed from: a10.e */
/* loaded from: classes5.dex */
public final class C0040e {

    /* renamed from: a */
    private final String f170a;

    /* renamed from: b */
    private final List f171b;

    public C0040e(String str, List list) {
        AbstractC19074t.m100208f(str, "userId");
        this.f170a = str;
        this.f171b = list;
    }

    /* renamed from: a */
    public final List m128a() {
        return this.f171b;
    }

    /* renamed from: b */
    public final String m129b() {
        return this.f170a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0040e)) {
            return false;
        }
        C0040e c0040e = (C0040e) obj;
        return AbstractC19074t.m100204b(this.f170a, c0040e.f170a) && AbstractC19074t.m100204b(this.f171b, c0040e.f171b);
    }

    public int hashCode() {
        int hashCode = this.f170a.hashCode() * 31;
        List list = this.f171b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "LogEventStreamTb(userId=" + this.f170a + ", logs=" + this.f171b + ")";
    }
}
