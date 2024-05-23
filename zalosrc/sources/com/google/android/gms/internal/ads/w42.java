package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class w42 implements j04 {

    /* renamed from: a */
    private final w04 f29775a;

    /* renamed from: b */
    private final w04 f29776b;

    /* renamed from: c */
    private final w04 f29777c;

    /* renamed from: d */
    private final w04 f29778d;

    /* renamed from: e */
    private final w04 f29779e;

    public w42(w04 w04Var, w04 w04Var2, w04 w04Var3, w04 w04Var4, w04 w04Var5) {
        this.f29775a = w04Var;
        this.f29776b = w04Var2;
        this.f29777c = w04Var3;
        this.f29778d = w04Var4;
        this.f29779e = w04Var5;
    }

    @Override // com.google.android.gms.internal.ads.w04
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final v42 zzb() {
        p21 p21Var = (p21) this.f29775a.zzb();
        c42 zzb = ((d42) this.f29776b).zzb();
        y71 y71Var = (y71) this.f29777c.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f29778d.zzb();
        uc3 uc3Var = kl0.f23363a;
        r04.m25935b(uc3Var);
        return new v42(p21Var, zzb, y71Var, scheduledExecutorService, uc3Var);
    }
}
