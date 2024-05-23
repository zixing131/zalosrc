package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;

/* loaded from: classes2.dex */
public final class qs1 implements j04 {

    /* renamed from: a */
    private final w04 f26946a;

    /* renamed from: b */
    private final w04 f26947b;

    /* renamed from: c */
    private final w04 f26948c;

    public qs1(w04 w04Var, w04 w04Var2, w04 w04Var3) {
        this.f26946a = w04Var;
        this.f26947b = w04Var2;
        this.f26948c = w04Var3;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* bridge */ /* synthetic */ Object zzb() {
        os1 os1Var = (os1) this.f26946a.zzb();
        uc3 uc3Var = kl0.f23363a;
        r04.m25935b(uc3Var);
        r02 r02Var = (r02) this.f26948c.zzb();
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21374s7)).booleanValue()) {
            return new if1(r02Var, uc3Var);
        }
        return new if1(os1Var, uc3Var);
    }
}
