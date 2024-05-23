package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC4759mg;
import com.google.android.gms.internal.ads.AbstractC4871pg;

/* loaded from: classes2.dex */
public final class zzce extends AbstractC4759mg implements zzcg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzce(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcg
    public final void zzb() throws RemoteException {
        zzbl(5, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzcg
    public final void zzc() throws RemoteException {
        zzbl(3, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzcg
    public final void zzd(zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        AbstractC4871pg.m25458e(zza, zzeVar);
        zzbl(1, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcg
    public final void zze() throws RemoteException {
        zzbl(4, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzcg
    public final void zzf() throws RemoteException {
        zzbl(2, zza());
    }
}
