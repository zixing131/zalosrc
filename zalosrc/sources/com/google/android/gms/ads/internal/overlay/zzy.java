package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.dynamic.InterfaceC4271b;
import com.google.android.gms.internal.ads.AbstractC4554gx;
import com.google.android.gms.internal.ads.nd0;
import com.google.android.gms.internal.ads.pf1;

/* loaded from: classes2.dex */
public final class zzy extends nd0 {
    private final AdOverlayInfoParcel zza;
    private final Activity zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public zzy(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zza = adOverlayInfoParcel;
        this.zzb = activity;
    }

    private final synchronized void zzb() {
        try {
            if (!this.zzd) {
                zzo zzoVar = this.zza.zzc;
                if (zzoVar != null) {
                    zzoVar.zzf(4);
                }
                this.zzd = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final boolean zzE() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void zzg(int i11, int i12, Intent intent) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void zzh() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void zzj(InterfaceC4271b interfaceC4271b) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void zzk(Bundle bundle) {
        zzo zzoVar;
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20959C7)).booleanValue()) {
            this.zzb.requestWindowFeature(1);
        }
        boolean z11 = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z11 = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zza;
        if (adOverlayInfoParcel == null) {
            this.zzb.finish();
            return;
        }
        if (z11) {
            this.zzb.finish();
            return;
        }
        if (bundle == null) {
            com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel.zzb;
            if (zzaVar != null) {
                zzaVar.onAdClicked();
            }
            pf1 pf1Var = this.zza.zzy;
            if (pf1Var != null) {
                pf1Var.zzq();
            }
            if (this.zzb.getIntent() != null && this.zzb.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (zzoVar = this.zza.zzc) != null) {
                zzoVar.zzb();
            }
        }
        com.google.android.gms.ads.internal.zzt.zzh();
        Activity activity = this.zzb;
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zza;
        zzc zzcVar = adOverlayInfoParcel2.zza;
        if (!zza.zzb(activity, zzcVar, adOverlayInfoParcel2.zzi, zzcVar.zzi)) {
            this.zzb.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void zzl() throws RemoteException {
        if (this.zzb.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void zzn() throws RemoteException {
        zzo zzoVar = this.zza.zzc;
        if (zzoVar != null) {
            zzoVar.zzbr();
        }
        if (this.zzb.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void zzo() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void zzp() throws RemoteException {
        if (this.zzc) {
            this.zzb.finish();
            return;
        }
        this.zzc = true;
        zzo zzoVar = this.zza.zzc;
        if (zzoVar != null) {
            zzoVar.zzbK();
        }
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void zzq(Bundle bundle) throws RemoteException {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void zzr() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void zzs() throws RemoteException {
        if (this.zzb.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void zzt() throws RemoteException {
        zzo zzoVar = this.zza.zzc;
        if (zzoVar != null) {
            zzoVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void zzv() throws RemoteException {
    }
}
