package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzz;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ro1 implements zza, x20, zzo, z20, zzz {

    /* renamed from: p */
    private zza f27330p;

    /* renamed from: q */
    private x20 f27331q;

    /* renamed from: r */
    private zzo f27332r;

    /* renamed from: s */
    private z20 f27333s;

    /* renamed from: t */
    private zzz f27334t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ro1(qo1 qo1Var) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public final synchronized void m26149c(zza zzaVar, x20 x20Var, zzo zzoVar, z20 z20Var, zzz zzzVar) {
        this.f27330p = zzaVar;
        this.f27331q = x20Var;
        this.f27332r = zzoVar;
        this.f27333s = z20Var;
        this.f27334t = zzzVar;
    }

    @Override // com.google.android.gms.internal.ads.x20
    /* renamed from: G */
    public final synchronized void mo20209G(String str, Bundle bundle) {
        x20 x20Var = this.f27331q;
        if (x20Var != null) {
            x20Var.mo20209G(str, bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.z20
    /* renamed from: j0 */
    public final synchronized void mo20210j0(String str, String str2) {
        z20 z20Var = this.f27333s;
        if (z20Var != null) {
            z20Var.mo20210j0(str, str2);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        zza zzaVar = this.f27330p;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzb() {
        zzo zzoVar = this.f27332r;
        if (zzoVar != null) {
            zzoVar.zzb();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbC() {
        zzo zzoVar = this.f27332r;
        if (zzoVar != null) {
            zzoVar.zzbC();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbK() {
        zzo zzoVar = this.f27332r;
        if (zzoVar != null) {
            zzoVar.zzbK();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbr() {
        zzo zzoVar = this.f27332r;
        if (zzoVar != null) {
            zzoVar.zzbr();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zze() {
        zzo zzoVar = this.f27332r;
        if (zzoVar != null) {
            zzoVar.zze();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzf(int i11) {
        zzo zzoVar = this.f27332r;
        if (zzoVar != null) {
            zzoVar.zzf(i11);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzz
    public final synchronized void zzg() {
        zzz zzzVar = this.f27334t;
        if (zzzVar != null) {
            ((so1) zzzVar).f27811p.zzb();
        }
    }
}
