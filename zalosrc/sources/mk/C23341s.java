package mk;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import lk.EnumC22502a;
import wg0.AbstractC28981d;

/* renamed from: mk.s */
/* loaded from: classes3.dex */
public final class C23341s extends AbstractC23323a {

    /* renamed from: r */
    private final long f113547r;

    /* renamed from: s */
    private final AbstractC28981d f113548s;

    public /* synthetic */ C23341s(long j11, AbstractC28981d abstractC28981d, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? 0L : j11, (i11 & 2) != 0 ? null : abstractC28981d);
    }

    @Override // mk.AbstractC23323a
    /* renamed from: c */
    public long mo122714c() {
        return this.f113547r;
    }

    /* renamed from: e */
    public final AbstractC28981d m122746e() {
        return this.f113548s;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23341s)) {
            return false;
        }
        C23341s c23341s = (C23341s) obj;
        return this.f113547r == c23341s.f113547r && AbstractC19074t.m100204b(this.f113548s, c23341s.f113548s);
    }

    public int hashCode() {
        int m11521a = AbstractC2147g0.m11521a(this.f113547r) * 31;
        AbstractC28981d abstractC28981d = this.f113548s;
        return m11521a + (abstractC28981d == null ? 0 : abstractC28981d.hashCode());
    }

    public String toString() {
        return "ZcloudOnboardingNotifyBannerItem(createTime=" + this.f113547r + ", state=" + this.f113548s + ")";
    }

    public C23341s(long j11, AbstractC28981d abstractC28981d) {
        super(EnumC22502a.f110118w, 8.0d);
        this.f113547r = j11;
        this.f113548s = abstractC28981d;
    }
}
