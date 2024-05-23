package j50;

import fn0.AbstractC19074t;
import java.util.List;

/* renamed from: j50.e */
/* loaded from: classes5.dex */
public final class C20925e {

    /* renamed from: a */
    private final List f102783a;

    /* renamed from: b */
    private final List f102784b;

    public C20925e(List list, List list2) {
        AbstractC19074t.m100208f(list, "songCategories");
        AbstractC19074t.m100208f(list2, "songs");
        this.f102783a = list;
        this.f102784b = list2;
    }

    /* renamed from: a */
    public final List m109449a() {
        return this.f102783a;
    }

    /* renamed from: b */
    public final List m109450b() {
        return this.f102784b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20925e)) {
            return false;
        }
        C20925e c20925e = (C20925e) obj;
        return AbstractC19074t.m100204b(this.f102783a, c20925e.f102783a) && AbstractC19074t.m100204b(this.f102784b, c20925e.f102784b);
    }

    public int hashCode() {
        return (this.f102783a.hashCode() * 31) + this.f102784b.hashCode();
    }

    public String toString() {
        return "ResultCategoryList(songCategories=" + this.f102783a + ", songs=" + this.f102784b + ")";
    }
}
