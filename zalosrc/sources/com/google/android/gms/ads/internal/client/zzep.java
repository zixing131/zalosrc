package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.yk0;

/* loaded from: classes2.dex */
final class zzep implements Runnable {
    final /* synthetic */ zzeq zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzep(zzeq zzeqVar) {
        this.zza = zzeqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbf zzbfVar;
        zzbf zzbfVar2;
        zzeq zzeqVar = this.zza;
        zzbfVar = zzeqVar.zza;
        if (zzbfVar != null) {
            try {
                zzbfVar2 = zzeqVar.zza;
                zzbfVar2.zze(1);
            } catch (RemoteException e11) {
                yk0.zzk("Could not notify onAdFailedToLoad event.", e11);
            }
        }
    }
}
