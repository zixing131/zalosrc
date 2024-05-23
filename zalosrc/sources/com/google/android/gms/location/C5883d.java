package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

/* renamed from: com.google.android.gms.location.d */
/* loaded from: classes2.dex */
public final class C5883d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        List list = LocationResult.f33500q;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            if (SafeParcelReader.m19789v(m19755D) != 1) {
                SafeParcelReader.m19764M(parcel, m19755D);
            } else {
                list = SafeParcelReader.m19787t(parcel, m19755D, Location.CREATOR);
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new LocationResult(list);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i11) {
        return new LocationResult[i11];
    }
}
