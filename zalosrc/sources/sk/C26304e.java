package sk;

import fn0.AbstractC19074t;
import java.util.List;

/* renamed from: sk.e */
/* loaded from: classes3.dex */
public final class C26304e {

    /* renamed from: a */
    private final List f124952a;

    public C26304e(List list) {
        AbstractC19074t.m100208f(list, "data");
        this.f124952a = list;
    }

    /* renamed from: a */
    public final List m135429a() {
        return this.f124952a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26304e) && AbstractC19074t.m100204b(this.f124952a, ((C26304e) obj).f124952a);
    }

    public int hashCode() {
        return this.f124952a.hashCode();
    }

    public String toString() {
        return "SectionDataDiscoveryList(data=" + this.f124952a + ")";
    }
}
