package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.yk0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzel implements Runnable {
    final /* synthetic */ zzen zza;

    public zzel(zzen zzenVar) {
        this.zza = zzenVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbf zzbfVar;
        zzbf zzbfVar2;
        zzeo zzeoVar = this.zza.zza;
        zzbfVar = zzeoVar.zza;
        if (zzbfVar != null) {
            try {
                zzbfVar2 = zzeoVar.zza;
                zzbfVar2.zze(1);
            } catch (RemoteException e11) {
                yk0.zzk("Could not notify onAdFailedToLoad event.", e11);
            }
        }
    }
}
