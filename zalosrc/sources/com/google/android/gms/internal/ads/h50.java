package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public abstract class h50 extends AbstractBinderC4833og implements i50 {
    public h50() {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    /* renamed from: N */
    public static i50 m22708N(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
        if (queryLocalInterface instanceof i50) {
            return (i50) queryLocalInterface;
        }
        return new g50(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 != 1) {
            if (i11 != 2) {
                return false;
            }
            zze();
        } else {
            String readString = parcel.readString();
            AbstractC4871pg.m25456c(parcel);
            mo22283j(readString);
        }
        parcel2.writeNoException();
        return true;
    }
}
