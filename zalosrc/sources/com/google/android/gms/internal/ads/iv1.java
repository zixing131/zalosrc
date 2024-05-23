package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class iv1 implements j04 {

    /* renamed from: a */
    private final w04 f22498a;

    /* renamed from: b */
    private final w04 f22499b;

    /* renamed from: c */
    private final w04 f22500c;

    /* renamed from: d */
    private final w04 f22501d;

    /* renamed from: e */
    private final w04 f22502e;

    /* renamed from: f */
    private final w04 f22503f;

    /* renamed from: g */
    private final w04 f22504g;

    /* renamed from: h */
    private final w04 f22505h;

    /* renamed from: i */
    private final w04 f22506i;

    /* renamed from: j */
    private final w04 f22507j;

    public iv1(w04 w04Var, w04 w04Var2, w04 w04Var3, w04 w04Var4, w04 w04Var5, w04 w04Var6, w04 w04Var7, w04 w04Var8, w04 w04Var9, w04 w04Var10) {
        this.f22498a = w04Var;
        this.f22499b = w04Var2;
        this.f22500c = w04Var3;
        this.f22501d = w04Var4;
        this.f22502e = w04Var5;
        this.f22503f = w04Var6;
        this.f22504g = w04Var7;
        this.f22505h = w04Var8;
        this.f22506i = w04Var9;
        this.f22507j = w04Var10;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* bridge */ /* synthetic */ Object zzb() {
        Executor executor = (Executor) this.f22498a.zzb();
        Context m20710a = ((bt0) this.f22499b).m20710a();
        WeakReference m21005a = ((ct0) this.f22500c).m21005a();
        uc3 uc3Var = kl0.f23363a;
        r04.m25935b(uc3Var);
        return new hv1(executor, m20710a, m21005a, uc3Var, (wq1) this.f22502e.zzb(), (ScheduledExecutorService) this.f22503f.zzb(), (mt1) this.f22504g.zzb(), ((mt0) this.f22505h).m24707a(), ((ue1) this.f22506i).zzb(), (xw2) this.f22507j.zzb());
    }
}
