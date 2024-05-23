package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* loaded from: classes2.dex */
public abstract class t50 extends AbstractBinderC4833og implements u50 {
    public t50() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) AbstractC4871pg.m25454a(parcel, ParcelFileDescriptor.CREATOR);
            AbstractC4871pg.m25456c(parcel);
            mo26860C2(parcelFileDescriptor);
            return true;
        }
        return false;
    }
}
