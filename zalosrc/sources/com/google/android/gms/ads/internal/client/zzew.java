package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.InterfaceC4271b;
import com.google.android.gms.internal.ads.bh0;
import com.google.android.gms.internal.ads.ch0;
import com.google.android.gms.internal.ads.rg0;
import com.google.android.gms.internal.ads.rk0;
import com.google.android.gms.internal.ads.tg0;
import com.google.android.gms.internal.ads.xg0;
import com.google.android.gms.internal.ads.yk0;
import com.google.android.gms.internal.ads.zzccz;

/* loaded from: classes2.dex */
public final class zzew extends tg0 {
    private static void zzr(final bh0 bh0Var) {
        yk0.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        rk0.f27282b.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzev
            @Override // java.lang.Runnable
            public final void run() {
                bh0 bh0Var2 = bh0.this;
                if (bh0Var2 != null) {
                    try {
                        bh0Var2.zze(1);
                    } catch (RemoteException e11) {
                        yk0.zzl("#007 Could not call remote method.", e11);
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ug0
    public final Bundle zzb() throws RemoteException {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.ug0
    public final zzdh zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ug0
    public final rg0 zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ug0
    public final String zze() throws RemoteException {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.ug0
    public final void zzf(zzl zzlVar, bh0 bh0Var) throws RemoteException {
        zzr(bh0Var);
    }

    @Override // com.google.android.gms.internal.ads.ug0
    public final void zzg(zzl zzlVar, bh0 bh0Var) throws RemoteException {
        zzr(bh0Var);
    }

    @Override // com.google.android.gms.internal.ads.ug0
    public final void zzh(boolean z11) {
    }

    @Override // com.google.android.gms.internal.ads.ug0
    public final void zzi(zzdb zzdbVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.ug0
    public final void zzj(zzde zzdeVar) {
    }

    @Override // com.google.android.gms.internal.ads.ug0
    public final void zzk(xg0 xg0Var) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.ug0
    public final void zzl(zzccz zzcczVar) {
    }

    @Override // com.google.android.gms.internal.ads.ug0
    public final void zzm(InterfaceC4271b interfaceC4271b) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.ug0
    public final void zzn(InterfaceC4271b interfaceC4271b, boolean z11) {
    }

    @Override // com.google.android.gms.internal.ads.ug0
    public final boolean zzo() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ug0
    public final void zzp(ch0 ch0Var) throws RemoteException {
    }
}
