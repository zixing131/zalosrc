package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC4759mg;
import com.google.android.gms.internal.ads.AbstractC4871pg;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzdf extends AbstractC4759mg implements zzdh {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final Bundle zze() throws RemoteException {
        Parcel zzbk = zzbk(5, zza());
        Bundle bundle = (Bundle) AbstractC4871pg.m25454a(zzbk, Bundle.CREATOR);
        zzbk.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final zzu zzf() throws RemoteException {
        Parcel zzbk = zzbk(4, zza());
        zzu zzuVar = (zzu) AbstractC4871pg.m25454a(zzbk, zzu.CREATOR);
        zzbk.recycle();
        return zzuVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final String zzg() throws RemoteException {
        Parcel zzbk = zzbk(1, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final String zzh() throws RemoteException {
        Parcel zzbk = zzbk(6, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final String zzi() throws RemoteException {
        Parcel zzbk = zzbk(2, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final List zzj() throws RemoteException {
        Parcel zzbk = zzbk(3, zza());
        ArrayList createTypedArrayList = zzbk.createTypedArrayList(zzu.CREATOR);
        zzbk.recycle();
        return createTypedArrayList;
    }
}
