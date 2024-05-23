package mk;

import androidx.work.AbstractC2147g0;
import lk.EnumC22502a;

/* renamed from: mk.p */
/* loaded from: classes3.dex */
public final class C23338p extends AbstractC23323a {

    /* renamed from: r */
    private final long f113542r;

    public C23338p(long j11) {
        super(EnumC22502a.f110119x, 8.0d);
        this.f113542r = j11;
    }

    @Override // mk.AbstractC23323a
    /* renamed from: c */
    public long mo122714c() {
        return this.f113542r;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C23338p) && this.f113542r == ((C23338p) obj).f113542r;
    }

    public int hashCode() {
        return AbstractC2147g0.m11521a(this.f113542r);
    }

    public String toString() {
        return "ZCloudRemindSetupNotifyBannerItem(createTime=" + this.f113542r + ")";
    }
}
