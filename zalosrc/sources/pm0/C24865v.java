package pm0;

import fn0.AbstractC19074t;
import java.io.Serializable;

/* renamed from: pm0.v */
/* loaded from: classes7.dex */
public final class C24865v implements Serializable {

    /* renamed from: p */
    private final Object f119275p;

    /* renamed from: q */
    private final Object f119276q;

    /* renamed from: r */
    private final Object f119277r;

    public C24865v(Object obj, Object obj2, Object obj3) {
        this.f119275p = obj;
        this.f119276q = obj2;
        this.f119277r = obj3;
    }

    /* renamed from: a */
    public final Object m129229a() {
        return this.f119275p;
    }

    /* renamed from: b */
    public final Object m129230b() {
        return this.f119276q;
    }

    /* renamed from: c */
    public final Object m129231c() {
        return this.f119277r;
    }

    /* renamed from: d */
    public final Object m129232d() {
        return this.f119275p;
    }

    /* renamed from: e */
    public final Object m129233e() {
        return this.f119276q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24865v)) {
            return false;
        }
        C24865v c24865v = (C24865v) obj;
        return AbstractC19074t.m100204b(this.f119275p, c24865v.f119275p) && AbstractC19074t.m100204b(this.f119276q, c24865v.f119276q) && AbstractC19074t.m100204b(this.f119277r, c24865v.f119277r);
    }

    /* renamed from: f */
    public final Object m129234f() {
        return this.f119277r;
    }

    public int hashCode() {
        Object obj = this.f119275p;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f119276q;
        int hashCode2 = (hashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f119277r;
        return hashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f119275p + ", " + this.f119276q + ", " + this.f119277r + ')';
    }
}
