package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;

/* loaded from: classes2.dex */
public final class ts1 implements j04 {

    /* renamed from: a */
    private final w04 f28529a;

    /* renamed from: b */
    private final w04 f28530b;

    /* renamed from: c */
    private final w04 f28531c;

    public ts1(w04 w04Var, w04 w04Var2, w04 w04Var3) {
        this.f28529a = w04Var;
        this.f28530b = w04Var2;
        this.f28531c = w04Var3;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* bridge */ /* synthetic */ Object zzb() {
        gt1 gt1Var = (gt1) this.f28529a.zzb();
        uc3 uc3Var = kl0.f23363a;
        r04.m25935b(uc3Var);
        z02 z02Var = (z02) this.f28531c.zzb();
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21374s7)).booleanValue()) {
            return new if1(z02Var, uc3Var);
        }
        return new if1(gt1Var, uc3Var);
    }
}
