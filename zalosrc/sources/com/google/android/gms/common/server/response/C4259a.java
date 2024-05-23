package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* renamed from: com.google.android.gms.common.server.response.a */
/* loaded from: classes2.dex */
public final class C4259a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        String str = null;
        String str2 = null;
        zaa zaaVar = null;
        int i11 = 0;
        int i12 = 0;
        boolean z11 = false;
        int i13 = 0;
        boolean z12 = false;
        int i14 = 0;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            switch (SafeParcelReader.m19789v(m19755D)) {
                case 1:
                    i11 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 2:
                    i12 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 3:
                    z11 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 4:
                    i13 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 5:
                    z12 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 6:
                    str = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 7:
                    i14 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 8:
                    str2 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 9:
                    zaaVar = (zaa) SafeParcelReader.m19782o(parcel, m19755D, zaa.CREATOR);
                    break;
                default:
                    SafeParcelReader.m19764M(parcel, m19755D);
                    break;
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new FastJsonResponse.Field(i11, i12, z11, i13, z12, str, i14, str2, zaaVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new FastJsonResponse.Field[i11];
    }
}
