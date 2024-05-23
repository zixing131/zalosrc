package zb0;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: zb0.d */
/* loaded from: classes6.dex */
public final class C31775d {

    /* renamed from: a */
    private final boolean f145907a;

    /* renamed from: b */
    private final C31772a f145908b;

    public C31775d(boolean z11, C31772a c31772a) {
        this.f145907a = z11;
        this.f145908b = c31772a;
    }

    /* renamed from: b */
    public static /* synthetic */ C31775d m152794b(C31775d c31775d, boolean z11, C31772a c31772a, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = c31775d.f145907a;
        }
        if ((i11 & 2) != 0) {
            c31772a = c31775d.f145908b;
        }
        return c31775d.m152795a(z11, c31772a);
    }

    /* renamed from: a */
    public final C31775d m152795a(boolean z11, C31772a c31772a) {
        return new C31775d(z11, c31772a);
    }

    /* renamed from: c */
    public final C31772a m152796c() {
        return this.f145908b;
    }

    /* renamed from: d */
    public final boolean m152797d() {
        return this.f145907a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31775d)) {
            return false;
        }
        C31775d c31775d = (C31775d) obj;
        return this.f145907a == c31775d.f145907a && AbstractC19074t.m100204b(this.f145908b, c31775d.f145908b);
    }

    public int hashCode() {
        int m11520a = AbstractC2144f.m11520a(this.f145907a) * 31;
        C31772a c31772a = this.f145908b;
        return m11520a + (c31772a == null ? 0 : c31772a.hashCode());
    }

    public String toString() {
        return "ZCloudGPContainerViewState(isLoading=" + this.f145907a + ", viewData=" + this.f145908b + ")";
    }

    public /* synthetic */ C31775d(boolean z11, C31772a c31772a, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? null : c31772a);
    }
}
