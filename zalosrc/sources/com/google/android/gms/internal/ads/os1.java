package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

/* loaded from: classes2.dex */
public final class os1 implements ta1, l91, z71 {

    /* renamed from: p */
    private final ys1 f25749p;

    /* renamed from: q */
    private final it1 f25750q;

    public os1(ys1 ys1Var, it1 it1Var) {
        this.f25749p = ys1Var;
        this.f25750q = it1Var;
    }

    @Override // com.google.android.gms.internal.ads.z71
    /* renamed from: a */
    public final void mo20715a(zze zzeVar) {
        this.f25749p.m28337a().put("action", "ftl");
        this.f25749p.m28337a().put("ftl", String.valueOf(zzeVar.zza));
        this.f25749p.m28337a().put("ed", zzeVar.zzc);
        this.f25750q.m24035e(this.f25749p.m28337a());
    }

    @Override // com.google.android.gms.internal.ads.ta1
    /* renamed from: j */
    public final void mo20718j(tq2 tq2Var) {
        this.f25749p.m28338b(tq2Var);
    }

    @Override // com.google.android.gms.internal.ads.ta1
    /* renamed from: k */
    public final void mo20719k(zzcbc zzcbcVar) {
        this.f25749p.m28339c(zzcbcVar.f32001p);
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final void zzn() {
        this.f25749p.m28337a().put("action", "loaded");
        this.f25750q.m24035e(this.f25749p.m28337a());
    }
}
