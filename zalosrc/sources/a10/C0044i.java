package a10;

import fn0.AbstractC19074t;
import java.util.List;

/* renamed from: a10.i */
/* loaded from: classes5.dex */
public final class C0044i {

    /* renamed from: a */
    private final String f178a;

    /* renamed from: b */
    private final List f179b;

    public C0044i(String str, List list) {
        AbstractC19074t.m100208f(str, "userId");
        this.f178a = str;
        this.f179b = list;
    }

    /* renamed from: a */
    public final List m136a() {
        return this.f179b;
    }

    /* renamed from: b */
    public final String m137b() {
        return this.f178a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0044i)) {
            return false;
        }
        C0044i c0044i = (C0044i) obj;
        return AbstractC19074t.m100204b(this.f178a, c0044i.f178a) && AbstractC19074t.m100204b(this.f179b, c0044i.f179b);
    }

    public int hashCode() {
        int hashCode = this.f178a.hashCode() * 31;
        List list = this.f179b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "LogHistoryVideoTb(userId=" + this.f178a + ", logs=" + this.f179b + ")";
    }
}
