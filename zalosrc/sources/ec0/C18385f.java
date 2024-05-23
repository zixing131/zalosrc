package ec0;

import androidx.work.AbstractC2144f;
import com.zing.zalo.data.zalocloud.model.ZCloudQuotaUsage;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: ec0.f */
/* loaded from: classes6.dex */
public final class C18385f {

    /* renamed from: a */
    private final boolean f92774a;

    /* renamed from: b */
    private final ZCloudQuotaUsage f92775b;

    public C18385f(boolean z11, ZCloudQuotaUsage zCloudQuotaUsage) {
        this.f92774a = z11;
        this.f92775b = zCloudQuotaUsage;
    }

    /* renamed from: b */
    public static /* synthetic */ C18385f m97381b(C18385f c18385f, boolean z11, ZCloudQuotaUsage zCloudQuotaUsage, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = c18385f.f92774a;
        }
        if ((i11 & 2) != 0) {
            zCloudQuotaUsage = c18385f.f92775b;
        }
        return c18385f.m97382a(z11, zCloudQuotaUsage);
    }

    /* renamed from: a */
    public final C18385f m97382a(boolean z11, ZCloudQuotaUsage zCloudQuotaUsage) {
        return new C18385f(z11, zCloudQuotaUsage);
    }

    /* renamed from: c */
    public final ZCloudQuotaUsage m97383c() {
        return this.f92775b;
    }

    /* renamed from: d */
    public final boolean m97384d() {
        return this.f92774a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18385f)) {
            return false;
        }
        C18385f c18385f = (C18385f) obj;
        return this.f92774a == c18385f.f92774a && AbstractC19074t.m100204b(this.f92775b, c18385f.f92775b);
    }

    public int hashCode() {
        int m11520a = AbstractC2144f.m11520a(this.f92774a) * 31;
        ZCloudQuotaUsage zCloudQuotaUsage = this.f92775b;
        return m11520a + (zCloudQuotaUsage == null ? 0 : zCloudQuotaUsage.hashCode());
    }

    public String toString() {
        return "ZCloudStartResetCloudViewState(isLoading=" + this.f92774a + ", cloudQuotaUsage=" + this.f92775b + ")";
    }

    public /* synthetic */ C18385f(boolean z11, ZCloudQuotaUsage zCloudQuotaUsage, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? null : zCloudQuotaUsage);
    }
}
