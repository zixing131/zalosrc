package ph;

import fn0.AbstractC19074t;
import java.util.List;

/* renamed from: ph.g */
/* loaded from: classes3.dex */
public final class C24754g {

    /* renamed from: a */
    private String f118862a;

    /* renamed from: b */
    private final List f118863b;

    public C24754g(String str, List list) {
        AbstractC19074t.m100208f(str, "keywordSearch");
        AbstractC19074t.m100208f(list, "listKeywordResult");
        this.f118862a = str;
        this.f118863b = list;
    }

    /* renamed from: a */
    public final String m128623a() {
        return this.f118862a;
    }

    /* renamed from: b */
    public final List m128624b() {
        return this.f118863b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24754g)) {
            return false;
        }
        C24754g c24754g = (C24754g) obj;
        return AbstractC19074t.m100204b(this.f118862a, c24754g.f118862a) && AbstractC19074t.m100204b(this.f118863b, c24754g.f118863b);
    }

    public int hashCode() {
        return (this.f118862a.hashCode() * 31) + this.f118863b.hashCode();
    }

    public String toString() {
        String str = this.f118862a;
        int size = this.f118863b.size();
        List list = this.f118863b;
        return "ReactionSearchResult(keywordSearch=" + str + ", listKeywordResult.size=" + size + " " + list.subList(0, Math.min(list.size(), 10)) + ")";
    }
}
