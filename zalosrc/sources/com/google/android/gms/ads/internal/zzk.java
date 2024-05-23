package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        String str = null;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        float f11 = 0.0f;
        int i11 = 0;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            switch (SafeParcelReader.m19789v(m19755D)) {
                case 2:
                    z11 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 3:
                    z12 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 4:
                    str = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 5:
                    z13 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 6:
                    f11 = SafeParcelReader.m19753B(parcel, m19755D);
                    break;
                case 7:
                    i11 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 8:
                    z14 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 9:
                    z15 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 10:
                    z16 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                default:
                    SafeParcelReader.m19764M(parcel, m19755D);
                    break;
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new zzj(z11, z12, str, z13, f11, i11, z14, z15, z16);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzj[i11];
    }
}
