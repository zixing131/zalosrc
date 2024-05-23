package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class h60 extends AbstractBinderC4833og implements i60 {
    public h60() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    public static i60 zzc(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        if (queryLocalInterface instanceof i60) {
            return (i60) queryLocalInterface;
        }
        return new g60(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        if (i11 == 1) {
            ArrayList createTypedArrayList = parcel.createTypedArrayList(zzbrq.CREATOR);
            AbstractC4871pg.m25456c(parcel);
            zzb(createTypedArrayList);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
