package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.zav;

/* renamed from: com.google.android.gms.signin.internal.e */
/* loaded from: classes2.dex */
public final class C6214e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        int i11 = 0;
        ConnectionResult connectionResult = null;
        zav zavVar = null;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            int m19789v = SafeParcelReader.m19789v(m19755D);
            if (m19789v != 1) {
                if (m19789v != 2) {
                    if (m19789v != 3) {
                        SafeParcelReader.m19764M(parcel, m19755D);
                    } else {
                        zavVar = (zav) SafeParcelReader.m19782o(parcel, m19755D, zav.CREATOR);
                    }
                } else {
                    connectionResult = (ConnectionResult) SafeParcelReader.m19782o(parcel, m19755D, ConnectionResult.CREATOR);
                }
            } else {
                i11 = SafeParcelReader.m19757F(parcel, m19755D);
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new zak(i11, connectionResult, zavVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zak[i11];
    }
}
