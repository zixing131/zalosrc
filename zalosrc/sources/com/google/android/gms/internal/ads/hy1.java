package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class hy1 implements j04 {

    /* renamed from: a */
    private final w04 f21959a;

    /* renamed from: b */
    private final w04 f21960b;

    /* renamed from: c */
    private final w04 f21961c;

    /* renamed from: d */
    private final w04 f21962d;

    /* renamed from: e */
    private final w04 f21963e;

    /* renamed from: f */
    private final w04 f21964f;

    /* renamed from: g */
    private final w04 f21965g;

    public hy1(w04 w04Var, w04 w04Var2, w04 w04Var3, w04 w04Var4, w04 w04Var5, w04 w04Var6, w04 w04Var7) {
        this.f21959a = w04Var;
        this.f21960b = w04Var2;
        this.f21961c = w04Var3;
        this.f21962d = w04Var4;
        this.f21963e = w04Var5;
        this.f21964f = w04Var6;
        this.f21965g = w04Var7;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context m20710a = ((bt0) this.f21959a).m20710a();
        dr2 m24483a = ((m71) this.f21960b).m24483a();
        dx1 zzb = ((ex1) this.f21961c).zzb();
        uc3 uc3Var = kl0.f23363a;
        r04.m25935b(uc3Var);
        return new gy1(m20710a, m24483a, zzb, uc3Var, (ScheduledExecutorService) this.f21963e.zzb(), (m12) this.f21964f.zzb(), (vw2) this.f21965g.zzb());
    }
}
