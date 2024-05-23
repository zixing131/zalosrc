package p589vx;

import androidx.work.AbstractC2144f;
import androidx.work.AbstractC2147g0;

/* renamed from: vx.e */
/* loaded from: classes4.dex */
public final class C28660e {

    /* renamed from: a */
    private final long f132888a;

    /* renamed from: b */
    private final int f132889b;

    /* renamed from: c */
    private final boolean f132890c;

    public C28660e(long j11, int i11, boolean z11) {
        this.f132888a = j11;
        this.f132889b = i11;
        this.f132890c = z11;
    }

    /* renamed from: a */
    public final int m143405a() {
        return this.f132889b;
    }

    /* renamed from: b */
    public final long m143406b() {
        return this.f132888a;
    }

    /* renamed from: c */
    public final boolean m143407c() {
        return this.f132890c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28660e)) {
            return false;
        }
        C28660e c28660e = (C28660e) obj;
        return this.f132888a == c28660e.f132888a && this.f132889b == c28660e.f132889b && this.f132890c == c28660e.f132890c;
    }

    public int hashCode() {
        return (((AbstractC2147g0.m11521a(this.f132888a) * 31) + this.f132889b) * 31) + AbstractC2144f.m11520a(this.f132890c);
    }

    public String toString() {
        return "DeleteCatalogResponse(deletedCatalogId=" + this.f132888a + ", catalogListVersion=" + this.f132889b + ", needResync=" + this.f132890c + ")";
    }
}
