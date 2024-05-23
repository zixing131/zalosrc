package a10;

import fn0.AbstractC19074t;
import java.util.List;

/* renamed from: a10.k */
/* loaded from: classes5.dex */
public final class C0046k {

    /* renamed from: a */
    private final String f182a;

    /* renamed from: b */
    private final List f183b;

    public C0046k(String str, List list) {
        AbstractC19074t.m100208f(str, "userId");
        this.f182a = str;
        this.f183b = list;
    }

    /* renamed from: a */
    public final List m140a() {
        return this.f183b;
    }

    /* renamed from: b */
    public final String m141b() {
        return this.f182a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0046k)) {
            return false;
        }
        C0046k c0046k = (C0046k) obj;
        return AbstractC19074t.m100204b(this.f182a, c0046k.f182a) && AbstractC19074t.m100204b(this.f183b, c0046k.f183b);
    }

    public int hashCode() {
        int hashCode = this.f182a.hashCode() * 31;
        List list = this.f183b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "LogImpsTB(userId=" + this.f182a + ", logs=" + this.f183b + ")";
    }
}
