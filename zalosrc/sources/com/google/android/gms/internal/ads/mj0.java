package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes2.dex */
public abstract class mj0 extends AbstractBinderC4833og implements nj0 {
    public mj0() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return false;
                }
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) AbstractC4871pg.m25454a(parcel, Bundle.CREATOR);
                AbstractC4871pg.m25456c(parcel);
                mo21700x0(readString, readString2, bundle);
            } else {
                String readString3 = parcel.readString();
                AbstractC4871pg.m25456c(parcel);
                zzb(readString3);
            }
        } else {
            parcel.readString();
            parcel.readString();
            AbstractC4871pg.m25456c(parcel);
        }
        parcel2.writeNoException();
        return true;
    }
}
