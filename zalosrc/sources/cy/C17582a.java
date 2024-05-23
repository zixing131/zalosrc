package cy;

import fn0.AbstractC19060k;

/* renamed from: cy.a */
/* loaded from: classes4.dex */
public final class C17582a {

    /* renamed from: a */
    private int f89553a;

    /* renamed from: b */
    private int f89554b;

    public C17582a(int i11, int i12) {
        this.f89553a = i11;
        this.f89554b = i12;
    }

    /* renamed from: a */
    public final int m93622a() {
        return this.f89553a;
    }

    /* renamed from: b */
    public final int m93623b() {
        return this.f89554b;
    }

    /* renamed from: c */
    public final void m93624c(int i11) {
        this.f89553a = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17582a)) {
            return false;
        }
        C17582a c17582a = (C17582a) obj;
        return this.f89553a == c17582a.f89553a && this.f89554b == c17582a.f89554b;
    }

    public int hashCode() {
        return (this.f89553a * 31) + this.f89554b;
    }

    public String toString() {
        return "EditCatalogChangedData(nameChanged=" + this.f89553a + ", photoChanged=" + this.f89554b + ")";
    }

    public /* synthetic */ C17582a(int i11, int i12, int i13, AbstractC19060k abstractC19060k) {
        this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? 0 : i12);
    }
}
