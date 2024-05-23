package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class bg2 implements sh2 {

    /* renamed from: a */
    private final sh2 f17740a;

    /* renamed from: b */
    private final long f17741b;

    /* renamed from: c */
    private final ScheduledExecutorService f17742c;

    public bg2(sh2 sh2Var, long j11, ScheduledExecutorService scheduledExecutorService) {
        this.f17740a = sh2Var;
        this.f17741b = j11;
        this.f17742c = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final int zza() {
        return this.f17740a.zza();
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final tc3 zzb() {
        tc3 zzb = this.f17740a.zzb();
        long j11 = this.f17741b;
        if (j11 > 0) {
            zzb = kc3.m23883o(zzb, j11, TimeUnit.MILLISECONDS, this.f17742c);
        }
        return kc3.m23875g(zzb, Throwable.class, new qb3() { // from class: com.google.android.gms.internal.ads.ag2
            @Override // com.google.android.gms.internal.ads.qb3
            public final tc3 zza(Object obj) {
                return kc3.m23877i(null);
            }
        }, kl0.f23368f);
    }
}
