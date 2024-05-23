package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzz;

/* loaded from: classes2.dex */
public final class ap1 implements zza, x20, zzo, z20, zzz, pf1 {

    /* renamed from: p */
    private zza f17216p;

    /* renamed from: q */
    private x20 f17217q;

    /* renamed from: r */
    private zzo f17218r;

    /* renamed from: s */
    private z20 f17219s;

    /* renamed from: t */
    private zzz f17220t;

    /* renamed from: u */
    private pf1 f17221u;

    /* renamed from: c */
    public final synchronized void m20208c(zza zzaVar, x20 x20Var, zzo zzoVar, z20 z20Var, zzz zzzVar, pf1 pf1Var) {
        this.f17216p = zzaVar;
        this.f17217q = x20Var;
        this.f17218r = zzoVar;
        this.f17219s = z20Var;
        this.f17220t = zzzVar;
        this.f17221u = pf1Var;
    }

    @Override // com.google.android.gms.internal.ads.x20
    /* renamed from: G */
    public final synchronized void mo20209G(String str, Bundle bundle) {
        x20 x20Var = this.f17217q;
        if (x20Var != null) {
            x20Var.mo20209G(str, bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.z20
    /* renamed from: j0 */
    public final synchronized void mo20210j0(String str, String str2) {
        z20 z20Var = this.f17219s;
        if (z20Var != null) {
            z20Var.mo20210j0(str, str2);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        zza zzaVar = this.f17216p;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzb() {
        zzo zzoVar = this.f17218r;
        if (zzoVar != null) {
            zzoVar.zzb();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbC() {
        zzo zzoVar = this.f17218r;
        if (zzoVar != null) {
            zzoVar.zzbC();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbK() {
        zzo zzoVar = this.f17218r;
        if (zzoVar != null) {
            zzoVar.zzbK();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbr() {
        zzo zzoVar = this.f17218r;
        if (zzoVar != null) {
            zzoVar.zzbr();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zze() {
        zzo zzoVar = this.f17218r;
        if (zzoVar != null) {
            zzoVar.zze();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzf(int i11) {
        zzo zzoVar = this.f17218r;
        if (zzoVar != null) {
            zzoVar.zzf(i11);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzz
    public final synchronized void zzg() {
        zzz zzzVar = this.f17220t;
        if (zzzVar != null) {
            ((bp1) zzzVar).f17947p.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.pf1
    public final synchronized void zzq() {
        pf1 pf1Var = this.f17221u;
        if (pf1Var != null) {
            pf1Var.zzq();
        }
    }
}
