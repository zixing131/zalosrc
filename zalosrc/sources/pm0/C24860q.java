package pm0;

import fn0.AbstractC19074t;
import java.io.Serializable;

/* renamed from: pm0.q */
/* loaded from: classes.dex */
public final class C24860q implements Serializable {

    /* renamed from: p */
    private final Object f119262p;

    /* renamed from: q */
    private final Object f119263q;

    public C24860q(Object obj, Object obj2) {
        this.f119262p = obj;
        this.f119263q = obj2;
    }

    /* renamed from: a */
    public final Object m129213a() {
        return this.f119262p;
    }

    /* renamed from: b */
    public final Object m129214b() {
        return this.f119263q;
    }

    /* renamed from: c */
    public final Object m129215c() {
        return this.f119262p;
    }

    /* renamed from: d */
    public final Object m129216d() {
        return this.f119263q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24860q)) {
            return false;
        }
        C24860q c24860q = (C24860q) obj;
        return AbstractC19074t.m100204b(this.f119262p, c24860q.f119262p) && AbstractC19074t.m100204b(this.f119263q, c24860q.f119263q);
    }

    public int hashCode() {
        Object obj = this.f119262p;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f119263q;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f119262p + ", " + this.f119263q + ')';
    }
}
