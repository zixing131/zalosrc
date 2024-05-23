package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.ads.yz */
/* loaded from: classes2.dex */
public final class C5224yz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        zzff zzffVar = null;
        int i11 = 0;
        boolean z11 = false;
        int i12 = 0;
        boolean z12 = false;
        int i13 = 0;
        boolean z13 = false;
        int i14 = 0;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            switch (SafeParcelReader.m19789v(m19755D)) {
                case 1:
                    i11 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 2:
                    z11 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 3:
                    i12 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 4:
                    z12 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 5:
                    i13 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 6:
                    zzffVar = (zzff) SafeParcelReader.m19782o(parcel, m19755D, zzff.CREATOR);
                    break;
                case 7:
                    z13 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 8:
                    i14 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                default:
                    SafeParcelReader.m19764M(parcel, m19755D);
                    break;
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new zzbls(i11, z11, i12, z12, i13, zzffVar, z13, i14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzbls[i11];
    }
}
