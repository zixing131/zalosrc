package mk;

import androidx.work.AbstractC2147g0;
import com.zing.zalo.zalocloud.recover.ZaloCloudRecoverCloudMediaWorker;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import lk.EnumC22502a;

/* renamed from: mk.r */
/* loaded from: classes3.dex */
public final class C23340r extends AbstractC23323a {

    /* renamed from: r */
    private final long f113545r;

    /* renamed from: s */
    private final ZaloCloudRecoverCloudMediaWorker.AbstractC16884f f113546s;

    public /* synthetic */ C23340r(long j11, ZaloCloudRecoverCloudMediaWorker.AbstractC16884f abstractC16884f, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? 0L : j11, (i11 & 2) != 0 ? ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.c.f85905b : abstractC16884f);
    }

    @Override // mk.AbstractC23323a
    /* renamed from: c */
    public long mo122714c() {
        return this.f113545r;
    }

    /* renamed from: e */
    public final ZaloCloudRecoverCloudMediaWorker.AbstractC16884f m122745e() {
        return this.f113546s;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23340r)) {
            return false;
        }
        C23340r c23340r = (C23340r) obj;
        return this.f113545r == c23340r.f113545r && AbstractC19074t.m100204b(this.f113546s, c23340r.f113546s);
    }

    public int hashCode() {
        return (AbstractC2147g0.m11521a(this.f113545r) * 31) + this.f113546s.hashCode();
    }

    public String toString() {
        return "ZcloudGracePeriodBannerItem(createTime=" + this.f113545r + ", state=" + this.f113546s + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23340r(long j11, ZaloCloudRecoverCloudMediaWorker.AbstractC16884f abstractC16884f) {
        super(EnumC22502a.f110108B, 9.0d);
        AbstractC19074t.m100208f(abstractC16884f, "state");
        this.f113545r = j11;
        this.f113546s = abstractC16884f;
    }
}
