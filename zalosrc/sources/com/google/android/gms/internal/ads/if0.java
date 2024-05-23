package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzaz;

/* loaded from: classes2.dex */
public abstract class if0 extends AbstractBinderC4833og implements jf0 {
    public if0() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 != 1) {
            if (i11 != 2) {
                return false;
            }
            zzaz zzazVar = (zzaz) AbstractC4871pg.m25454a(parcel, zzaz.CREATOR);
            AbstractC4871pg.m25456c(parcel);
            mo22818n2(zzazVar);
        } else {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) AbstractC4871pg.m25454a(parcel, ParcelFileDescriptor.CREATOR);
            AbstractC4871pg.m25456c(parcel);
            mo22817O3(parcelFileDescriptor);
        }
        parcel2.writeNoException();
        return true;
    }
}
