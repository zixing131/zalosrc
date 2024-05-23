package a10;

import fn0.AbstractC19074t;
import java.util.List;

/* renamed from: a10.d */
/* loaded from: classes5.dex */
public final class C0039d {

    /* renamed from: a */
    private final String f168a;

    /* renamed from: b */
    private final List f169b;

    public C0039d(String str, List list) {
        AbstractC19074t.m100208f(str, "userId");
        this.f168a = str;
        this.f169b = list;
    }

    /* renamed from: a */
    public final List m126a() {
        return this.f169b;
    }

    /* renamed from: b */
    public final String m127b() {
        return this.f168a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0039d)) {
            return false;
        }
        C0039d c0039d = (C0039d) obj;
        return AbstractC19074t.m100204b(this.f168a, c0039d.f168a) && AbstractC19074t.m100204b(this.f169b, c0039d.f169b);
    }

    public int hashCode() {
        int hashCode = this.f168a.hashCode() * 31;
        List list = this.f169b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "LogEventAdsTb(userId=" + this.f168a + ", logs=" + this.f169b + ")";
    }
}
