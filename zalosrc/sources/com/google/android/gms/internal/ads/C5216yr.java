package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.ads.yr */
/* loaded from: classes2.dex */
public final class C5216yr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        long j11 = 0;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            int m19789v = SafeParcelReader.m19789v(m19755D);
            if (m19789v != 2) {
                if (m19789v != 3) {
                    if (m19789v != 4) {
                        if (m19789v != 5) {
                            if (m19789v != 6) {
                                SafeParcelReader.m19764M(parcel, m19755D);
                            } else {
                                z13 = SafeParcelReader.m19790w(parcel, m19755D);
                            }
                        } else {
                            j11 = SafeParcelReader.m19760I(parcel, m19755D);
                        }
                    } else {
                        z12 = SafeParcelReader.m19790w(parcel, m19755D);
                    }
                } else {
                    z11 = SafeParcelReader.m19790w(parcel, m19755D);
                }
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) SafeParcelReader.m19782o(parcel, m19755D, ParcelFileDescriptor.CREATOR);
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new zzbdy(parcelFileDescriptor, z11, z12, j11, z13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzbdy[i11];
    }
}
