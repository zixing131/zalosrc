package p691yr;

import androidx.work.AbstractC2144f;
import androidx.work.AbstractC2147g0;
import fn0.AbstractC19074t;
import java.util.List;

/* renamed from: yr.o */
/* loaded from: classes4.dex */
public final class C31065o {

    /* renamed from: a */
    private final boolean f143219a;

    /* renamed from: b */
    private final long f143220b;

    /* renamed from: c */
    private final boolean f143221c;

    /* renamed from: d */
    private final List f143222d;

    public C31065o(boolean z11, long j11, boolean z12, List list) {
        AbstractC19074t.m100208f(list, "reactionInfoList");
        this.f143219a = z11;
        this.f143220b = j11;
        this.f143221c = z12;
        this.f143222d = list;
    }

    /* renamed from: b */
    public static /* synthetic */ C31065o m150966b(C31065o c31065o, boolean z11, long j11, boolean z12, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = c31065o.f143219a;
        }
        if ((i11 & 2) != 0) {
            j11 = c31065o.f143220b;
        }
        long j12 = j11;
        if ((i11 & 4) != 0) {
            z12 = c31065o.f143221c;
        }
        boolean z13 = z12;
        if ((i11 & 8) != 0) {
            list = c31065o.f143222d;
        }
        return c31065o.m150967a(z11, j12, z13, list);
    }

    /* renamed from: a */
    public final C31065o m150967a(boolean z11, long j11, boolean z12, List list) {
        AbstractC19074t.m100208f(list, "reactionInfoList");
        return new C31065o(z11, j11, z12, list);
    }

    /* renamed from: c */
    public final boolean m150968c() {
        return this.f143219a;
    }

    /* renamed from: d */
    public final boolean m150969d() {
        return this.f143221c;
    }

    /* renamed from: e */
    public final long m150970e() {
        return this.f143220b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31065o)) {
            return false;
        }
        C31065o c31065o = (C31065o) obj;
        return this.f143219a == c31065o.f143219a && this.f143220b == c31065o.f143220b && this.f143221c == c31065o.f143221c && AbstractC19074t.m100204b(this.f143222d, c31065o.f143222d);
    }

    /* renamed from: f */
    public final List m150971f() {
        return this.f143222d;
    }

    public int hashCode() {
        return (((((AbstractC2144f.m11520a(this.f143219a) * 31) + AbstractC2147g0.m11521a(this.f143220b)) * 31) + AbstractC2144f.m11520a(this.f143221c)) * 31) + this.f143222d.hashCode();
    }

    public String toString() {
        return "FeedReactionFeatureConfig(enable=" + this.f143219a + ", rangeFeedSupported=" + this.f143220b + ", enableUIV2=" + this.f143221c + ", reactionInfoList=" + this.f143222d + ")";
    }
}
