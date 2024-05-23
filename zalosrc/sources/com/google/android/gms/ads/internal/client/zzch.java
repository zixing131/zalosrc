package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC4759mg;
import com.google.android.gms.internal.ads.AbstractC4871pg;
import com.google.android.gms.internal.ads.u90;
import com.google.android.gms.internal.ads.v90;

/* loaded from: classes2.dex */
public final class zzch extends AbstractC4759mg implements zzcj {
    public zzch(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcj
    public final v90 getAdapterCreator() throws RemoteException {
        Parcel zzbk = zzbk(2, zza());
        v90 m26875N = u90.m26875N(zzbk.readStrongBinder());
        zzbk.recycle();
        return m26875N;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcj
    public final zzeh getLiteSdkVersion() throws RemoteException {
        Parcel zzbk = zzbk(1, zza());
        zzeh zzehVar = (zzeh) AbstractC4871pg.m25454a(zzbk, zzeh.CREATOR);
        zzbk.recycle();
        return zzehVar;
    }
}
