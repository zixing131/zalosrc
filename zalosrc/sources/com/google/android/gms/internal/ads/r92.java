package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbf;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zzl;

/* loaded from: classes2.dex */
public final class r92 extends zzbk {

    /* renamed from: p */
    private final ya2 f27142p;

    public r92(Context context, vs0 vs0Var, br2 br2Var, hk1 hk1Var, zzbf zzbfVar) {
        ab2 ab2Var = new ab2(hk1Var, vs0Var.mo22589A());
        ab2Var.m20052e(zzbfVar);
        this.f27142p = new ya2(new kb2(vs0Var, context, ab2Var, br2Var), br2Var.m20696i());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final synchronized String zze() {
        return this.f27142p.m28169a();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final synchronized String zzf() {
        return this.f27142p.m28170b();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzg(zzl zzlVar) {
        this.f27142p.m28171d(zzlVar, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final synchronized void zzh(zzl zzlVar, int i11) {
        this.f27142p.m28171d(zzlVar, i11);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final synchronized boolean zzi() {
        return this.f27142p.m28172e();
    }
}
