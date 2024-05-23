package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzbf;
import com.google.android.gms.ads.internal.client.zzbl;
import com.google.android.gms.ads.internal.client.zzbn;
import com.google.android.gms.ads.internal.client.zzcd;
import com.google.android.gms.ads.internal.client.zzq;

/* loaded from: classes2.dex */
public final class q92 extends zzbn {

    /* renamed from: p */
    private final Context f26688p;

    /* renamed from: q */
    private final vs0 f26689q;

    /* renamed from: r */
    final br2 f26690r;

    /* renamed from: s */
    final ek1 f26691s;

    /* renamed from: t */
    private zzbf f26692t;

    public q92(vs0 vs0Var, Context context, String str) {
        br2 br2Var = new br2();
        this.f26690r = br2Var;
        this.f26691s = new ek1();
        this.f26689q = vs0Var;
        br2Var.m20681J(str);
        this.f26688p = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final zzbl zze() {
        hk1 m21742g = this.f26691s.m21742g();
        this.f26690r.m20690b(m21742g.m22956i());
        this.f26690r.m20691c(m21742g.m22955h());
        br2 br2Var = this.f26690r;
        if (br2Var.m20700x() == null) {
            br2Var.m20680I(zzq.zzc());
        }
        return new r92(this.f26688p, this.f26689q, this.f26690r, m21742g, this.f26692t);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzf(j10 j10Var) {
        this.f26691s.m21736a(j10Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzg(m10 m10Var) {
        this.f26691s.m21737b(m10Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzh(String str, s10 s10Var, p10 p10Var) {
        this.f26691s.m21738c(str, s10Var, p10Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzi(v60 v60Var) {
        this.f26691s.m21739d(v60Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzj(w10 w10Var, zzq zzqVar) {
        this.f26691s.m21740e(w10Var);
        this.f26690r.m20680I(zzqVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzk(z10 z10Var) {
        this.f26691s.m21741f(z10Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzl(zzbf zzbfVar) {
        this.f26692t = zzbfVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.f26690r.m20679H(adManagerAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzn(zzbsc zzbscVar) {
        this.f26690r.m20684M(zzbscVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzo(zzbls zzblsVar) {
        this.f26690r.m20689a(zzblsVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) {
        this.f26690r.m20692d(publisherAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzq(zzcd zzcdVar) {
        this.f26690r.m20698q(zzcdVar);
    }
}
