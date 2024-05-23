package a10;

import fn0.AbstractC19074t;
import java.util.List;

/* renamed from: a10.m */
/* loaded from: classes5.dex */
public final class C0048m {

    /* renamed from: a */
    private final String f186a;

    /* renamed from: b */
    private final List f187b;

    public C0048m(String str, List list) {
        AbstractC19074t.m100208f(str, "userId");
        this.f186a = str;
        this.f187b = list;
    }

    /* renamed from: a */
    public final List m144a() {
        return this.f187b;
    }

    /* renamed from: b */
    public final String m145b() {
        return this.f186a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0048m)) {
            return false;
        }
        C0048m c0048m = (C0048m) obj;
        return AbstractC19074t.m100204b(this.f186a, c0048m.f186a) && AbstractC19074t.m100204b(this.f187b, c0048m.f187b);
    }

    public int hashCode() {
        int hashCode = this.f186a.hashCode() * 31;
        List list = this.f187b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "LogUploadTb(userId=" + this.f186a + ", logs=" + this.f187b + ")";
    }
}
