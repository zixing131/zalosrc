package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class k52 implements j04 {

    /* renamed from: a */
    private final w04 f23149a;

    /* renamed from: b */
    private final w04 f23150b;

    /* renamed from: c */
    private final w04 f23151c;

    /* renamed from: d */
    private final w04 f23152d;

    public k52(w04 w04Var, w04 w04Var2, w04 w04Var3, w04 w04Var4) {
        this.f23149a = w04Var;
        this.f23150b = w04Var2;
        this.f23151c = w04Var3;
        this.f23152d = w04Var4;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context context = (Context) this.f23149a.zzb();
        zzcgv m24707a = ((mt0) this.f23150b).m24707a();
        lh1 lh1Var = (lh1) this.f23151c.zzb();
        uc3 uc3Var = kl0.f23363a;
        r04.m25935b(uc3Var);
        return new j52(context, m24707a, lh1Var, uc3Var);
    }
}
