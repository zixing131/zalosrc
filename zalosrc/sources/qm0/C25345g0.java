package qm0;

import fn0.AbstractC19074t;

/* renamed from: qm0.g0 */
/* loaded from: classes7.dex */
public final class C25345g0 {

    /* renamed from: a */
    private final int f121533a;

    /* renamed from: b */
    private final Object f121534b;

    public C25345g0(int i11, Object obj) {
        this.f121533a = i11;
        this.f121534b = obj;
    }

    /* renamed from: a */
    public final int m131263a() {
        return this.f121533a;
    }

    /* renamed from: b */
    public final Object m131264b() {
        return this.f121534b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25345g0)) {
            return false;
        }
        C25345g0 c25345g0 = (C25345g0) obj;
        return this.f121533a == c25345g0.f121533a && AbstractC19074t.m100204b(this.f121534b, c25345g0.f121534b);
    }

    public int hashCode() {
        int i11 = this.f121533a * 31;
        Object obj = this.f121534b;
        return i11 + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "IndexedValue(index=" + this.f121533a + ", value=" + this.f121534b + ')';
    }
}
