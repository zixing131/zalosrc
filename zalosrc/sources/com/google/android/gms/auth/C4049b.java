package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.auth.b */
/* loaded from: classes2.dex */
public final class C4049b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        long j11 = 0;
        String str = null;
        String str2 = null;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
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
                    str = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 4:
                    i12 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 5:
                    i13 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 6:
                    str2 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                default:
                    SafeParcelReader.m19764M(parcel, m19755D);
                    break;
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new AccountChangeEvent(i11, j11, str, i12, i13, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new AccountChangeEvent[i11];
    }
}
