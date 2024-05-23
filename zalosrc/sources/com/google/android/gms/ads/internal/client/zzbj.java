package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC4759mg;
import com.google.android.gms.internal.ads.AbstractC4871pg;

/* loaded from: classes2.dex */
public final class zzbj extends AbstractC4759mg implements zzbl {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final String zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final String zzf() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzg(zzl zzlVar) throws RemoteException {
        Parcel zza = zza();
        AbstractC4871pg.m25458e(zza, zzlVar);
        zzbl(1, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzh(zzl zzlVar, int i11) throws RemoteException {
        Parcel zza = zza();
        AbstractC4871pg.m25458e(zza, zzlVar);
        zza.writeInt(i11);
        zzbl(5, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final boolean zzi() throws RemoteException {
        Parcel zzbk = zzbk(3, zza());
        boolean m25461h = AbstractC4871pg.m25461h(zzbk);
        zzbk.recycle();
        return m25461h;
    }
}
