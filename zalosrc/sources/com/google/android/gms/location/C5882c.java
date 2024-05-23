package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.location.c */
/* loaded from: classes2.dex */
public final class C5882c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        long j11 = 3600000;
        long j12 = 600000;
        long j13 = Long.MAX_VALUE;
        long j14 = 0;
        int i11 = 102;
        boolean z11 = false;
        int i12 = Integer.MAX_VALUE;
        float f11 = 0.0f;
        boolean z12 = false;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            switch (SafeParcelReader.m19789v(m19755D)) {
                case 1:
                    i11 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 2:
                    j11 = SafeParcelReader.m19760I(parcel, m19755D);
                    break;
                case 3:
                    j12 = SafeParcelReader.m19760I(parcel, m19755D);
                    break;
                case 4:
                    z11 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 5:
                    j13 = SafeParcelReader.m19760I(parcel, m19755D);
                    break;
                case 6:
                    i12 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 7:
                    f11 = SafeParcelReader.m19753B(parcel, m19755D);
                    break;
                case 8:
                    j14 = SafeParcelReader.m19760I(parcel, m19755D);
                    break;
                case 9:
                    z12 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                default:
                    SafeParcelReader.m19764M(parcel, m19755D);
                    break;
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new LocationRequest(i11, j11, j12, z11, j13, i12, f11, j14, z12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i11) {
        return new LocationRequest[i11];
    }
}
