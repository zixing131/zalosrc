package a10;

import fn0.AbstractC19074t;
import java.util.List;

/* renamed from: a10.f */
/* loaded from: classes5.dex */
public final class C0041f {

    /* renamed from: a */
    private final String f172a;

    /* renamed from: b */
    private final List f173b;

    public C0041f(String str, List list) {
        AbstractC19074t.m100208f(str, "userId");
        this.f172a = str;
        this.f173b = list;
    }

    /* renamed from: a */
    public final List m130a() {
        return this.f173b;
    }

    /* renamed from: b */
    public final String m131b() {
        return this.f172a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0041f)) {
            return false;
        }
        C0041f c0041f = (C0041f) obj;
        return AbstractC19074t.m100204b(this.f172a, c0041f.f172a) && AbstractC19074t.m100204b(this.f173b, c0041f.f173b);
    }

    public int hashCode() {
        int hashCode = this.f172a.hashCode() * 31;
        List list = this.f173b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "LogEventTb(userId=" + this.f172a + ", logs=" + this.f173b + ")";
    }
}
