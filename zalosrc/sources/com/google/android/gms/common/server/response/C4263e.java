package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.server.response.e */
/* loaded from: classes2.dex */
public final class C4263e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        int i11 = 0;
        Parcel parcel2 = null;
        zan zanVar = null;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            int m19789v = SafeParcelReader.m19789v(m19755D);
            if (m19789v != 1) {
                if (m19789v != 2) {
                    if (m19789v != 3) {
                        SafeParcelReader.m19764M(parcel, m19755D);
                    } else {
                        zanVar = (zan) SafeParcelReader.m19782o(parcel, m19755D, zan.CREATOR);
                    }
                } else {
                    parcel2 = SafeParcelReader.m19780m(parcel, m19755D);
                }
            } else {
                i11 = SafeParcelReader.m19757F(parcel, m19755D);
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new SafeParcelResponse(i11, parcel2, zanVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new SafeParcelResponse[i11];
    }
}