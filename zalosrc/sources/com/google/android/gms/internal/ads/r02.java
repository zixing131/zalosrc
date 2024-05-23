package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

/* loaded from: classes2.dex */
public final class r02 implements ta1, l91, z71 {

    /* renamed from: p */
    private final qv2 f27026p;

    /* renamed from: q */
    private final rv2 f27027q;

    /* renamed from: r */
    private final lk0 f27028r;

    public r02(qv2 qv2Var, rv2 rv2Var, lk0 lk0Var) {
        this.f27026p = qv2Var;
        this.f27027q = rv2Var;
        this.f27028r = lk0Var;
    }

    @Override // com.google.android.gms.internal.ads.z71
    /* renamed from: a */
    public final void mo20715a(zze zzeVar) {
        qv2 qv2Var = this.f27026p;
        qv2Var.m25907a("action", "ftl");
        qv2Var.m25907a("ftl", String.valueOf(zzeVar.zza));
        qv2Var.m25907a("ed", zzeVar.zzc);
        this.f27027q.mo22194a(this.f27026p);
    }

    @Override // com.google.android.gms.internal.ads.ta1
    /* renamed from: j */
    public final void mo20718j(tq2 tq2Var) {
        this.f27026p.m25912h(tq2Var, this.f27028r);
    }

    @Override // com.google.android.gms.internal.ads.ta1
    /* renamed from: k */
    public final void mo20719k(zzcbc zzcbcVar) {
        this.f27026p.m25913i(zzcbcVar.f32001p);
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final void zzn() {
        rv2 rv2Var = this.f27027q;
        qv2 qv2Var = this.f27026p;
        qv2Var.m25907a("action", "loaded");
        rv2Var.mo22194a(qv2Var);
    }
}
