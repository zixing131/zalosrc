package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractBinderC4833og;
import com.google.android.gms.internal.ads.AbstractC4871pg;

/* loaded from: classes2.dex */
public abstract class zzdd extends AbstractBinderC4833og implements zzde {
    public zzdd() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static zzde zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        if (queryLocalInterface instanceof zzde) {
            return (zzde) queryLocalInterface;
        }
        return new zzdc(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        if (i11 == 1) {
            zzs zzsVar = (zzs) AbstractC4871pg.m25454a(parcel, zzs.CREATOR);
            AbstractC4871pg.m25456c(parcel);
            zze(zzsVar);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
