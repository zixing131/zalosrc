package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.hf */
/* loaded from: classes2.dex */
public final class C4573hf extends AbstractCallableC4316ag {

    /* renamed from: i */
    private final Map f21662i;

    /* renamed from: j */
    private final View f21663j;

    public C4573hf(C4719le c4719le, String str, String str2, C4939ra c4939ra, int i11, int i12, Map map, View view) {
        super(c4719le, "RKC3mFMqGi7xOgQ7s39JMoZe9bnzGCFipcdUUf0vlgHDkBg7SvMkVmBGpwLs06ia", "8Xr1ilYJHo+oWZQAYAG91DIHBuqEmXK8yHtxL6KkyfU=", c4939ra, i11, 85);
        this.f21662i = map;
        this.f21663j = view;
    }

    /* renamed from: c */
    private final long m22816c(int i11) {
        Map map = this.f21662i;
        Integer valueOf = Integer.valueOf(i11);
        if (map.containsKey(valueOf)) {
            return ((Long) this.f21662i.get(valueOf)).longValue();
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC4316ag
    /* renamed from: a */
    protected final void mo20111a() {
        long[] jArr = (long[]) this.f17025f.invoke(null, new long[]{m22816c(1), m22816c(2)}, this.f17021b.m24240b(), this.f21663j);
        long j11 = jArr[0];
        this.f21662i.put(1, Long.valueOf(jArr[1]));
        long j12 = jArr[2];
        this.f21662i.put(2, Long.valueOf(jArr[3]));
        synchronized (this.f17024e) {
            this.f17024e.m25999A0(j11);
            this.f17024e.m26055z0(j12);
        }
    }
}
