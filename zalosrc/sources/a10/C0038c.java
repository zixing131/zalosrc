package a10;

import fn0.AbstractC19074t;
import java.util.List;

/* renamed from: a10.c */
/* loaded from: classes5.dex */
public final class C0038c {

    /* renamed from: a */
    private final String f166a;

    /* renamed from: b */
    private final List f167b;

    public C0038c(String str, List list) {
        AbstractC19074t.m100208f(str, "userId");
        this.f166a = str;
        this.f167b = list;
    }

    /* renamed from: a */
    public final List m124a() {
        return this.f167b;
    }

    /* renamed from: b */
    public final String m125b() {
        return this.f166a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0038c)) {
            return false;
        }
        C0038c c0038c = (C0038c) obj;
        return AbstractC19074t.m100204b(this.f166a, c0038c.f166a) && AbstractC19074t.m100204b(this.f167b, c0038c.f167b);
    }

    public int hashCode() {
        int hashCode = this.f166a.hashCode() * 31;
        List list = this.f167b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "LogActiveTb(userId=" + this.f166a + ", logs=" + this.f167b + ")";
    }
}
