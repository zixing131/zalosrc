package p399op;

import fn0.AbstractC19074t;
import java.util.List;

/* renamed from: op.t */
/* loaded from: classes4.dex */
public final class C24408t {

    /* renamed from: a */
    private final List f117879a;

    /* renamed from: b */
    private final List f117880b;

    public C24408t(List list, List list2) {
        AbstractC19074t.m100208f(list, "songCategories");
        AbstractC19074t.m100208f(list2, "songs");
        this.f117879a = list;
        this.f117880b = list2;
    }

    /* renamed from: a */
    public final List m127662a() {
        return this.f117879a;
    }

    /* renamed from: b */
    public final List m127663b() {
        return this.f117880b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24408t)) {
            return false;
        }
        C24408t c24408t = (C24408t) obj;
        return AbstractC19074t.m100204b(this.f117879a, c24408t.f117879a) && AbstractC19074t.m100204b(this.f117880b, c24408t.f117880b);
    }

    public int hashCode() {
        return (this.f117879a.hashCode() * 31) + this.f117880b.hashCode();
    }

    public String toString() {
        return "ResultCategoryList(songCategories=" + this.f117879a + ", songs=" + this.f117880b + ")";
    }
}
