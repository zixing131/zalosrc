package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class mk2 implements j04 {

    /* renamed from: a */
    private final w04 f24632a;

    /* renamed from: b */
    private final w04 f24633b;

    /* renamed from: c */
    private final w04 f24634c;

    /* renamed from: d */
    private final w04 f24635d;

    /* renamed from: e */
    private final w04 f24636e;

    /* renamed from: f */
    private final w04 f24637f;

    /* renamed from: g */
    private final w04 f24638g;

    public mk2(w04 w04Var, w04 w04Var2, w04 w04Var3, w04 w04Var4, w04 w04Var5, w04 w04Var6, w04 w04Var7) {
        this.f24632a = w04Var;
        this.f24633b = w04Var2;
        this.f24634c = w04Var3;
        this.f24635d = w04Var4;
        this.f24636e = w04Var5;
        this.f24637f = w04Var6;
        this.f24638g = w04Var7;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* bridge */ /* synthetic */ Object zzb() {
        hk0 hk0Var = (hk0) this.f24632a.zzb();
        boolean booleanValue = ((ck2) this.f24633b).zzb().booleanValue();
        boolean booleanValue2 = ((dk2) this.f24634c).zzb().booleanValue();
        wj0 wj0Var = new wj0();
        uc3 uc3Var = kl0.f23363a;
        r04.m25935b(uc3Var);
        return new kk2(hk0Var, booleanValue, booleanValue2, wj0Var, uc3Var, ((ak2) this.f24637f).m20168a(), (ScheduledExecutorService) this.f24638g.zzb(), null);
    }
}
