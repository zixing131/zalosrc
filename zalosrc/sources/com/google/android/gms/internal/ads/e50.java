package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public abstract class e50 extends AbstractBinderC4833og implements f50 {
    public e50() {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    /* renamed from: N */
    public static f50 m21615N(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
        if (queryLocalInterface instanceof f50) {
            return (f50) queryLocalInterface;
        }
        return new d50(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 == 1) {
            String readString = parcel.readString();
            AbstractC4871pg.m25456c(parcel);
            zzb(readString);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
