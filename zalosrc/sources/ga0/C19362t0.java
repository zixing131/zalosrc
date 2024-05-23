package ga0;

import fn0.AbstractC19074t;

/* renamed from: ga0.t0 */
/* loaded from: classes6.dex */
final class C19362t0 {

    /* renamed from: a */
    private final int f96167a;

    /* renamed from: b */
    private final int f96168b;

    /* renamed from: c */
    private final String f96169c;

    /* renamed from: d */
    private final String f96170d;

    public C19362t0(int i11, int i12, String str, String str2) {
        AbstractC19074t.m100208f(str, "name");
        AbstractC19074t.m100208f(str2, "path");
        this.f96167a = i11;
        this.f96168b = i12;
        this.f96169c = str;
        this.f96170d = str2;
    }

    /* renamed from: a */
    public final String m101457a() {
        return this.f96170d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19362t0)) {
            return false;
        }
        C19362t0 c19362t0 = (C19362t0) obj;
        return this.f96167a == c19362t0.f96167a && this.f96168b == c19362t0.f96168b && AbstractC19074t.m100204b(this.f96169c, c19362t0.f96169c) && AbstractC19074t.m100204b(this.f96170d, c19362t0.f96170d);
    }

    public int hashCode() {
        return (((((this.f96167a * 31) + this.f96168b) * 31) + this.f96169c.hashCode()) * 31) + this.f96170d.hashCode();
    }

    public String toString() {
        return "PathText(id=" + this.f96167a + ", group=" + this.f96168b + ", name=" + this.f96169c + ", path=" + this.f96170d + ")";
    }
}
