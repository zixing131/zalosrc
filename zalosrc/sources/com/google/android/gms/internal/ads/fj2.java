package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class fj2 implements j04 {

    /* renamed from: a */
    private final w04 f20129a;

    /* renamed from: b */
    private final w04 f20130b;

    /* renamed from: c */
    private final w04 f20131c;

    /* renamed from: d */
    private final w04 f20132d;

    /* renamed from: e */
    private final w04 f20133e;

    /* renamed from: f */
    private final w04 f20134f;

    /* renamed from: g */
    private final w04 f20135g;

    public fj2(w04 w04Var, w04 w04Var2, w04 w04Var3, w04 w04Var4, w04 w04Var5, w04 w04Var6, w04 w04Var7) {
        this.f20129a = w04Var;
        this.f20130b = w04Var2;
        this.f20131c = w04Var3;
        this.f20132d = w04Var4;
        this.f20133e = w04Var5;
        this.f20134f = w04Var6;
        this.f20135g = w04Var7;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* bridge */ /* synthetic */ Object zzb() {
        yj0 yj0Var = new yj0();
        int intValue = ((bk2) this.f20130b).zzb().intValue();
        Context m20710a = ((bt0) this.f20131c).m20710a();
        hk0 hk0Var = (hk0) this.f20132d.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f20133e.zzb();
        uc3 uc3Var = kl0.f23363a;
        r04.m25935b(uc3Var);
        return new dj2(yj0Var, intValue, m20710a, hk0Var, scheduledExecutorService, uc3Var, ((ak2) this.f20135g).m20168a(), null);
    }
}
