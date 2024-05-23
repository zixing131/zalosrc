package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.location.places.a */
/* loaded from: classes2.dex */
public final class C5892a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        int i11 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            int m19789v = SafeParcelReader.m19789v(m19755D);
            if (m19789v == 1) {
                i11 = SafeParcelReader.m19757F(parcel, m19755D);
            } else if (m19789v == 2) {
                str = SafeParcelReader.m19783p(parcel, m19755D);
            } else if (m19789v == 3) {
                str2 = SafeParcelReader.m19783p(parcel, m19755D);
            } else if (m19789v != 4) {
                SafeParcelReader.m19764M(parcel, m19755D);
            } else {
                str3 = SafeParcelReader.m19783p(parcel, m19755D);
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new PlaceReport(i11, str, str2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new PlaceReport[i11];
    }
}
