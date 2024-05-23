package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class cy1 implements j04 {

    /* renamed from: a */
    private final w04 f19031a;

    /* renamed from: b */
    private final w04 f19032b;

    /* renamed from: c */
    private final w04 f19033c;

    /* renamed from: d */
    private final w04 f19034d;

    public cy1(w04 w04Var, w04 w04Var2, w04 w04Var3, w04 w04Var4) {
        this.f19031a = w04Var;
        this.f19032b = w04Var2;
        this.f19033c = w04Var3;
        this.f19034d = w04Var4;
    }

    @Override // com.google.android.gms.internal.ads.w04
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final by1 zzb() {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f19031a.zzb();
        uc3 uc3Var = kl0.f23363a;
        r04.m25935b(uc3Var);
        return new by1(scheduledExecutorService, uc3Var, ((ty1) this.f19033c).zzb(), i04.m23103a(this.f19034d));
    }
}
