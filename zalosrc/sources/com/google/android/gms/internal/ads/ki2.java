package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class ki2 implements j04 {

    /* renamed from: a */
    private final w04 f23334a;

    /* renamed from: b */
    private final w04 f23335b;

    /* renamed from: c */
    private final w04 f23336c;

    /* renamed from: d */
    private final w04 f23337d;

    /* renamed from: e */
    private final w04 f23338e;

    public ki2(w04 w04Var, w04 w04Var2, w04 w04Var3, w04 w04Var4, w04 w04Var5) {
        this.f23334a = w04Var;
        this.f23335b = w04Var2;
        this.f23336c = w04Var3;
        this.f23337d = w04Var4;
        this.f23338e = w04Var5;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* bridge */ /* synthetic */ Object zzb() {
        yj0 yj0Var = new yj0();
        Context m20710a = ((bt0) this.f23335b).m20710a();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f23336c.zzb();
        uc3 uc3Var = kl0.f23363a;
        r04.m25935b(uc3Var);
        return new ii2(yj0Var, m20710a, scheduledExecutorService, uc3Var, ((bk2) this.f23338e).zzb().intValue(), null);
    }
}
