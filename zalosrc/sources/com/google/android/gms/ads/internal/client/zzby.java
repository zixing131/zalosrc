package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractBinderC4833og;
import com.google.android.gms.internal.ads.AbstractC4871pg;

/* loaded from: classes2.dex */
public abstract class zzby extends AbstractBinderC4833og implements zzbz {
    public zzby() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    public static zzbz zzd(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        if (queryLocalInterface instanceof zzbz) {
            return (zzbz) queryLocalInterface;
        }
        return new zzbx(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        if (i11 == 1) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            AbstractC4871pg.m25456c(parcel);
            zzc(readString, readString2);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
