package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationRequest;
import java.util.List;

/* renamed from: com.google.android.gms.internal.location.g */
/* loaded from: classes2.dex */
public final class C5273g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        List list = zzba.f32205A;
        LocationRequest locationRequest = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        long j11 = Long.MAX_VALUE;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            int m19789v = SafeParcelReader.m19789v(m19755D);
            if (m19789v != 1) {
                switch (m19789v) {
                    case 5:
                        list = SafeParcelReader.m19787t(parcel, m19755D, ClientIdentity.CREATOR);
                        break;
                    case 6:
                        str = SafeParcelReader.m19783p(parcel, m19755D);
                        break;
                    case 7:
                        z11 = SafeParcelReader.m19790w(parcel, m19755D);
                        break;
                    case 8:
                        z12 = SafeParcelReader.m19790w(parcel, m19755D);
                        break;
                    case 9:
                        z13 = SafeParcelReader.m19790w(parcel, m19755D);
                        break;
                    case 10:
                        str2 = SafeParcelReader.m19783p(parcel, m19755D);
                        break;
                    case 11:
                        z14 = SafeParcelReader.m19790w(parcel, m19755D);
                        break;
                    case 12:
                        z15 = SafeParcelReader.m19790w(parcel, m19755D);
                        break;
                    case 13:
                        str3 = SafeParcelReader.m19783p(parcel, m19755D);
                        break;
                    case 14:
                        j11 = SafeParcelReader.m19760I(parcel, m19755D);
                        break;
                    default:
                        SafeParcelReader.m19764M(parcel, m19755D);
                        break;
                }
            } else {
                locationRequest = (LocationRequest) SafeParcelReader.m19782o(parcel, m19755D, LocationRequest.CREATOR);
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new zzba(locationRequest, list, str, z11, z12, z13, str2, z14, z15, str3, j11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i11) {
        return new zzba[i11];
    }
}
