package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class jv2 implements j04 {

    /* renamed from: a */
    private final w04 f23007a;

    /* renamed from: b */
    private final w04 f23008b;

    /* renamed from: c */
    private final w04 f23009c;

    public jv2(w04 w04Var, w04 w04Var2, w04 w04Var3) {
        this.f23007a = w04Var;
        this.f23008b = w04Var2;
        this.f23009c = w04Var3;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* bridge */ /* synthetic */ Object zzb() {
        uc3 uc3Var = kl0.f23363a;
        r04.m25935b(uc3Var);
        return new hv2(uc3Var, (ScheduledExecutorService) this.f23008b.zzb(), ((kv2) this.f23009c).zzb());
    }
}
