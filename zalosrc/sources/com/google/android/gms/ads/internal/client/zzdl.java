package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC4759mg;
import com.google.android.gms.internal.ads.AbstractC4871pg;

/* loaded from: classes2.dex */
public final class zzdl extends AbstractC4759mg implements zzdn {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final void zze() throws RemoteException {
        zzbl(4, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final void zzf(boolean z11) throws RemoteException {
        Parcel zza = zza();
        AbstractC4871pg.m25457d(zza, z11);
        zzbl(5, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final void zzg() throws RemoteException {
        zzbl(3, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final void zzh() throws RemoteException {
        zzbl(2, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final void zzi() throws RemoteException {
        zzbl(1, zza());
    }
}
