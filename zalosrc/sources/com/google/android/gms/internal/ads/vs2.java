package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class vs2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        String str = null;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
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
                    i13 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 4:
                    i14 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 5:
                    str = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 6:
                    i15 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 7:
                    i16 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                default:
                    SafeParcelReader.m19764M(parcel, m19755D);
                    break;
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new zzffx(i11, i12, i13, i14, str, i15, i16);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzffx[i11];
    }
}
