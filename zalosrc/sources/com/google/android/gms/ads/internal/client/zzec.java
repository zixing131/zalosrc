package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.internal.ads.h60;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
final class zzec extends h60 {
    final /* synthetic */ zzed zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzec(zzed zzedVar, zzeb zzebVar) {
        this.zza = zzedVar;
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void zzb(List list) throws RemoteException {
        int i11;
        ArrayList arrayList;
        synchronized (zzed.zzg(this.zza)) {
            zzed.zzk(this.zza, false);
            zzed.zzj(this.zza, true);
            arrayList = new ArrayList(zzed.zzi(this.zza));
            zzed.zzi(this.zza).clear();
        }
        InitializationStatus zzd = zzed.zzd(list);
        int size = arrayList.size();
        for (i11 = 0; i11 < size; i11++) {
            ((OnInitializationCompleteListener) arrayList.get(i11)).onInitializationComplete(zzd);
        }
    }
}
