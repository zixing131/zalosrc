package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractBinderC4833og;
import com.google.android.gms.internal.ads.AbstractC4871pg;
import com.google.android.gms.internal.ads.v90;

/* loaded from: classes2.dex */
public abstract class zzci extends AbstractBinderC4833og implements zzcj {
    public zzci() {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public static zzcj asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        if (queryLocalInterface instanceof zzcj) {
            return (zzcj) queryLocalInterface;
        }
        return new zzch(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        if (i11 != 1) {
            if (i11 != 2) {
                return false;
            }
            v90 adapterCreator = getAdapterCreator();
            parcel2.writeNoException();
            AbstractC4871pg.m25460g(parcel2, adapterCreator);
        } else {
            zzeh liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            AbstractC4871pg.m25459f(parcel2, liteSdkVersion);
        }
        return true;
    }
}
