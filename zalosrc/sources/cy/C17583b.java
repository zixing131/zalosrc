package cy;

import fn0.AbstractC19060k;

/* renamed from: cy.b */
/* loaded from: classes4.dex */
public final class C17583b {

    /* renamed from: a */
    private int f89555a;

    /* renamed from: b */
    private int f89556b;

    /* renamed from: c */
    private int f89557c;

    /* renamed from: d */
    private int f89558d;

    public C17583b(int i11, int i12, int i13, int i14) {
        this.f89555a = i11;
        this.f89556b = i12;
        this.f89557c = i13;
        this.f89558d = i14;
    }

    /* renamed from: a */
    public final int m93625a() {
        return this.f89557c;
    }

    /* renamed from: b */
    public final int m93626b() {
        return this.f89555a;
    }

    /* renamed from: c */
    public final int m93627c() {
        return this.f89556b;
    }

    /* renamed from: d */
    public final int m93628d() {
        return this.f89558d;
    }

    /* renamed from: e */
    public final void m93629e(int i11) {
        this.f89557c = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17583b)) {
            return false;
        }
        C17583b c17583b = (C17583b) obj;
        return this.f89555a == c17583b.f89555a && this.f89556b == c17583b.f89556b && this.f89557c == c17583b.f89557c && this.f89558d == c17583b.f89558d;
    }

    /* renamed from: f */
    public final void m93630f(int i11) {
        this.f89555a = i11;
    }

    /* renamed from: g */
    public final void m93631g(int i11) {
        this.f89556b = i11;
    }

    /* renamed from: h */
    public final void m93632h(int i11) {
        this.f89558d = i11;
    }

    public int hashCode() {
        return (((((this.f89555a * 31) + this.f89556b) * 31) + this.f89557c) * 31) + this.f89558d;
    }

    /* renamed from: i */
    public final boolean m93633i() {
        return (this.f89555a == 0 && this.f89556b == 0 && this.f89557c == 0 && this.f89558d == 0) ? false : true;
    }

    public String toString() {
        return "EditProductChangedData(imageChanged=" + this.f89555a + ", nameChanged=" + this.f89556b + ", descChanged=" + this.f89557c + ", priceChanged=" + this.f89558d + ")";
    }

    public /* synthetic */ C17583b(int i11, int i12, int i13, int i14, int i15, AbstractC19060k abstractC19060k) {
        this((i15 & 1) != 0 ? 0 : i11, (i15 & 2) != 0 ? 0 : i12, (i15 & 4) != 0 ? 0 : i13, (i15 & 8) != 0 ? 0 : i14);
    }
}
