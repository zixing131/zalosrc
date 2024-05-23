package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;

/* loaded from: classes2.dex */
public final class z51 implements j04 {

    /* renamed from: a */
    private final w04 f31370a;

    /* renamed from: b */
    private final w04 f31371b;

    /* renamed from: c */
    private final w04 f31372c;

    public z51(w04 w04Var, w04 w04Var2, w04 w04Var3) {
        this.f31370a = w04Var;
        this.f31371b = w04Var2;
        this.f31372c = w04Var3;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* bridge */ /* synthetic */ Object zzb() {
        ls1 ls1Var = (ls1) this.f31370a.zzb();
        uc3 uc3Var = kl0.f23363a;
        r04.m25935b(uc3Var);
        p02 p02Var = (p02) this.f31372c.zzb();
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21374s7)).booleanValue()) {
            return new if1(p02Var, uc3Var);
        }
        return new if1(ls1Var, uc3Var);
    }
}
