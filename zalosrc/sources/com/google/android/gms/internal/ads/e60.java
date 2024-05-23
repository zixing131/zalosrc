package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public abstract class e60 extends AbstractBinderC4833og implements f60 {
    public e60() {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    /* renamed from: N */
    public static f60 m21620N(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        if (queryLocalInterface instanceof f60) {
            return (f60) queryLocalInterface;
        }
        return new d60(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 != 2) {
            if (i11 != 3) {
                return false;
            }
            String readString = parcel.readString();
            AbstractC4871pg.m25456c(parcel);
            mo21271c(readString);
        } else {
            zzf();
        }
        parcel2.writeNoException();
        return true;
    }
}
