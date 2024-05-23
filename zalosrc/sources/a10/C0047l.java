package a10;

import fn0.AbstractC19074t;
import java.util.List;

/* renamed from: a10.l */
/* loaded from: classes5.dex */
public final class C0047l {

    /* renamed from: a */
    private final String f184a;

    /* renamed from: b */
    private final List f185b;

    public C0047l(String str, List list) {
        AbstractC19074t.m100208f(str, "userId");
        this.f184a = str;
        this.f185b = list;
    }

    /* renamed from: a */
    public final List m142a() {
        return this.f185b;
    }

    /* renamed from: b */
    public final String m143b() {
        return this.f184a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0047l)) {
            return false;
        }
        C0047l c0047l = (C0047l) obj;
        return AbstractC19074t.m100204b(this.f184a, c0047l.f184a) && AbstractC19074t.m100204b(this.f185b, c0047l.f185b);
    }

    public int hashCode() {
        int hashCode = this.f184a.hashCode() * 31;
        List list = this.f185b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "LogSessionTable(userId=" + this.f184a + ", logs=" + this.f185b + ")";
    }
}
