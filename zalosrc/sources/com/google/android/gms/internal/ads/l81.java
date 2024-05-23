package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class l81 implements j04 {

    /* renamed from: a */
    private final w04 f23787a;

    /* renamed from: b */
    private final w04 f23788b;

    /* renamed from: c */
    private final w04 f23789c;

    /* renamed from: d */
    private final w04 f23790d;

    public l81(w04 w04Var, w04 w04Var2, w04 w04Var3, w04 w04Var4) {
        this.f23787a = w04Var;
        this.f23788b = w04Var2;
        this.f23789c = w04Var3;
        this.f23790d = w04Var4;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* bridge */ /* synthetic */ Object zzb() {
        i81 zzb = ((k81) this.f23787a).zzb();
        Set zzb2 = ((u04) this.f23788b).zzb();
        uc3 uc3Var = kl0.f23363a;
        r04.m25935b(uc3Var);
        return new j81(zzb, zzb2, uc3Var, (ScheduledExecutorService) this.f23790d.zzb());
    }
}
