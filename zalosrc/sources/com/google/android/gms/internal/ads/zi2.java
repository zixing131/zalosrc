package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zi2 implements j04 {

    /* renamed from: a */
    private final w04 f31520a;

    /* renamed from: b */
    private final w04 f31521b;

    /* renamed from: c */
    private final w04 f31522c;

    /* renamed from: d */
    private final w04 f31523d;

    /* renamed from: e */
    private final w04 f31524e;

    public zi2(w04 w04Var, w04 w04Var2, w04 w04Var3, w04 w04Var4, w04 w04Var5) {
        this.f31520a = w04Var;
        this.f31521b = w04Var2;
        this.f31522c = w04Var3;
        this.f31523d = w04Var4;
        this.f31524e = w04Var5;
    }

    /* renamed from: a */
    public static xi2 m28515a(String str, C4993sr c4993sr, hk0 hk0Var, ScheduledExecutorService scheduledExecutorService, uc3 uc3Var) {
        return new xi2(str, c4993sr, hk0Var, scheduledExecutorService, uc3Var, null);
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* bridge */ /* synthetic */ Object zzb() {
        String m20168a = ((ak2) this.f31520a).m20168a();
        C4993sr c4993sr = new C4993sr();
        hk0 hk0Var = (hk0) this.f31522c.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f31523d.zzb();
        uc3 uc3Var = kl0.f23363a;
        r04.m25935b(uc3Var);
        return new xi2(m20168a, c4993sr, hk0Var, scheduledExecutorService, uc3Var, null);
    }
}
