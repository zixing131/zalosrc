package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes2.dex */
public abstract class e20 extends AbstractBinderC4833og implements f20 {
    public e20() {
        super("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
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
            mo21249j(readString);
        }
        parcel2.writeNoException();
        return true;
    }
}
