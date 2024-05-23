package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class ce0 extends AbstractBinderC4833og implements de0 {
    public ce0() {
        super("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    /* renamed from: N */
    public static de0 m20866N(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
        if (queryLocalInterface instanceof de0) {
            return (de0) queryLocalInterface;
        }
        return new be0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 != 1) {
            if (i11 != 2) {
                return false;
            }
            String readString = parcel.readString();
            AbstractC4871pg.m25456c(parcel);
            mo20484c(readString);
        } else {
            ArrayList createTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
            AbstractC4871pg.m25456c(parcel);
            mo20485t0(createTypedArrayList);
        }
        parcel2.writeNoException();
        return true;
    }
}
