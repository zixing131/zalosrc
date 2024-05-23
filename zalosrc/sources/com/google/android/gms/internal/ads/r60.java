package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes2.dex */
public abstract class r60 extends AbstractBinderC4833og implements s60 {
    public r60() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 != 1) {
            if (i11 != 2) {
                return false;
            }
            parcel.readInt();
            AbstractC4871pg.m25456c(parcel);
        }
        parcel2.writeNoException();
        return true;
    }
}
