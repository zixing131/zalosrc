package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class w61 implements j04 {

    /* renamed from: a */
    private final w04 f29825a;

    /* renamed from: b */
    private final w04 f29826b;

    /* renamed from: c */
    private final w04 f29827c;

    /* renamed from: d */
    private final w04 f29828d;

    public w61(w04 w04Var, w04 w04Var2, w04 w04Var3, w04 w04Var4) {
        this.f29825a = w04Var;
        this.f29826b = w04Var2;
        this.f29827c = w04Var3;
        this.f29828d = w04Var4;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* bridge */ /* synthetic */ Object zzb() {
        o81 o81Var = (o81) this.f29825a.zzb();
        iq2 m24112a = ((l41) this.f29826b).m24112a();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f29827c.zzb();
        uc3 uc3Var = kl0.f23363a;
        r04.m25935b(uc3Var);
        return new v61(o81Var, m24112a, scheduledExecutorService, uc3Var);
    }
}
