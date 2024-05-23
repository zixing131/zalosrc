package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.measurement.p1 */
/* loaded from: classes.dex */
public final class C5536p1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        long j11 = 0;
        long j12 = 0;
        boolean z11 = false;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            switch (SafeParcelReader.m19789v(m19755D)) {
                case 1:
                    j11 = SafeParcelReader.m19760I(parcel, m19755D);
                    break;
                case 2:
                    j12 = SafeParcelReader.m19760I(parcel, m19755D);
                    break;
                case 3:
                    z11 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 4:
                    str = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 5:
                    str2 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 6:
                    str3 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 7:
                    bundle = SafeParcelReader.m19773f(parcel, m19755D);
                    break;
                case 8:
                    str4 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                default:
                    SafeParcelReader.m19764M(parcel, m19755D);
                    break;
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new zzcl(j11, j12, z11, str, str2, str3, bundle, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzcl[i11];
    }
}
