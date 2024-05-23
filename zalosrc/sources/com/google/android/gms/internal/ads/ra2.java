package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbc;

/* loaded from: classes2.dex */
public final class ra2 implements zza, pf1 {

    /* renamed from: p */
    private zzbc f27154p;

    /* renamed from: a */
    public final synchronized void m26056a(zzbc zzbcVar) {
        this.f27154p = zzbcVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        zzbc zzbcVar = this.f27154p;
        if (zzbcVar != null) {
            try {
                zzbcVar.zzb();
            } catch (RemoteException e11) {
                yk0.zzk("Remote Exception at onAdClicked.", e11);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.pf1
    public final synchronized void zzq() {
        zzbc zzbcVar = this.f27154p;
        if (zzbcVar != null) {
            try {
                zzbcVar.zzb();
            } catch (RemoteException e11) {
                yk0.zzk("Remote Exception at onPhysicalClick.", e11);
            }
        }
    }
}
