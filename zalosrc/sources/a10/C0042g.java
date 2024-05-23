package a10;

import fn0.AbstractC19074t;
import java.util.List;

/* renamed from: a10.g */
/* loaded from: classes5.dex */
public final class C0042g {

    /* renamed from: a */
    private final String f174a;

    /* renamed from: b */
    private final List f175b;

    public C0042g(String str, List list) {
        AbstractC19074t.m100208f(str, "userId");
        this.f174a = str;
        this.f175b = list;
    }

    /* renamed from: a */
    public final List m132a() {
        return this.f175b;
    }

    /* renamed from: b */
    public final String m133b() {
        return this.f174a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0042g)) {
            return false;
        }
        C0042g c0042g = (C0042g) obj;
        return AbstractC19074t.m100204b(this.f174a, c0042g.f174a) && AbstractC19074t.m100204b(this.f175b, c0042g.f175b);
    }

    public int hashCode() {
        int hashCode = this.f174a.hashCode() * 31;
        List list = this.f175b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "LogGetListTb(userId=" + this.f174a + ", logs=" + this.f175b + ")";
    }
}
