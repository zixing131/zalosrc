package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class mf0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            if (SafeParcelReader.m19789v(m19755D) != 2) {
                SafeParcelReader.m19764M(parcel, m19755D);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) SafeParcelReader.m19782o(parcel, m19755D, ParcelFileDescriptor.CREATOR);
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new zzcba(parcelFileDescriptor);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzcba[i11];
    }
}
