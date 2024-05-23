package sl;

import fn0.AbstractC19074t;
import java.util.List;

/* renamed from: sl.d */
/* loaded from: classes3.dex */
public final class C26319d {

    /* renamed from: a */
    private final String f124985a;

    /* renamed from: b */
    private final List f124986b;

    /* renamed from: c */
    private final int f124987c;

    public C26319d(String str, List list, int i11) {
        AbstractC19074t.m100208f(str, "lastNoiseId");
        AbstractC19074t.m100208f(list, "listNoiseIds");
        this.f124985a = str;
        this.f124986b = list;
        this.f124987c = i11;
    }

    /* renamed from: a */
    public final String m135459a() {
        return this.f124985a;
    }

    /* renamed from: b */
    public final List m135460b() {
        return this.f124986b;
    }

    /* renamed from: c */
    public final int m135461c() {
        return this.f124987c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26319d)) {
            return false;
        }
        C26319d c26319d = (C26319d) obj;
        return AbstractC19074t.m100204b(this.f124985a, c26319d.f124985a) && AbstractC19074t.m100204b(this.f124986b, c26319d.f124986b) && this.f124987c == c26319d.f124987c;
    }

    public int hashCode() {
        return (((this.f124985a.hashCode() * 31) + this.f124986b.hashCode()) * 31) + this.f124987c;
    }

    public String toString() {
        return "VerifyCloudQueueParams(lastNoiseId=" + this.f124985a + ", listNoiseIds=" + this.f124986b + ", verifySource=" + this.f124987c + ")";
    }
}
