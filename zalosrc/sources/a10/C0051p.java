package a10;

import fn0.AbstractC19074t;
import java.util.List;

/* renamed from: a10.p */
/* loaded from: classes5.dex */
public final class C0051p {

    /* renamed from: a */
    private final String f192a;

    /* renamed from: b */
    private final List f193b;

    public C0051p(String str, List list) {
        AbstractC19074t.m100208f(str, "userId");
        this.f192a = str;
        this.f193b = list;
    }

    /* renamed from: a */
    public final List m150a() {
        return this.f193b;
    }

    /* renamed from: b */
    public final String m151b() {
        return this.f192a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0051p)) {
            return false;
        }
        C0051p c0051p = (C0051p) obj;
        return AbstractC19074t.m100204b(this.f192a, c0051p.f192a) && AbstractC19074t.m100204b(this.f193b, c0051p.f193b);
    }

    public int hashCode() {
        int hashCode = this.f192a.hashCode() * 31;
        List list = this.f193b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "LogViewVideoTB(userId=" + this.f192a + ", logs=" + this.f193b + ")";
    }
}
