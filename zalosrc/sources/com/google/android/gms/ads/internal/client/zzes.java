package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.dynamic.InterfaceC4271b;
import com.google.android.gms.internal.ads.i60;
import com.google.android.gms.internal.ads.rk0;
import com.google.android.gms.internal.ads.v90;
import com.google.android.gms.internal.ads.yk0;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzes extends zzcl {
    private i60 zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb() {
        i60 i60Var = this.zza;
        if (i60Var != null) {
            try {
                i60Var.zzb(Collections.emptyList());
            } catch (RemoteException e11) {
                yk0.zzk("Could not notify onComplete event.", e11);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final float zze() throws RemoteException {
        return 1.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final String zzf() {
        return "";
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final List zzg() throws RemoteException {
        return Collections.emptyList();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzh(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzi() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzj() throws RemoteException {
        yk0.zzg("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        rk0.f27282b.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzer
            @Override // java.lang.Runnable
            public final void run() {
                zzes.this.zzb();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzk(String str, InterfaceC4271b interfaceC4271b) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzl(zzcy zzcyVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzm(InterfaceC4271b interfaceC4271b, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzn(v90 v90Var) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzo(boolean z11) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzp(float f11) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzq(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzr(i60 i60Var) throws RemoteException {
        this.zza = i60Var;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzs(zzez zzezVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final boolean zzt() throws RemoteException {
        return false;
    }
}
