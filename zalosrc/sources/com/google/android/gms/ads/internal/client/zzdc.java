package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC4759mg;
import com.google.android.gms.internal.ads.AbstractC4871pg;

/* loaded from: classes2.dex */
public final class zzdc extends AbstractC4759mg implements zzde {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzde
    public final void zze(zzs zzsVar) throws RemoteException {
        Parcel zza = zza();
        AbstractC4871pg.m25458e(zza, zzsVar);
        zzbl(1, zza);
    }
}
