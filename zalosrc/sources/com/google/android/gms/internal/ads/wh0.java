package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class wh0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            switch (SafeParcelReader.m19789v(m19755D)) {
                case 2:
                    str = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 3:
                    str2 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 4:
                    z11 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 5:
                    z12 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 6:
                    arrayList = SafeParcelReader.m19785r(parcel, m19755D);
                    break;
                case 7:
                    z13 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 8:
                    z14 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 9:
                    arrayList2 = SafeParcelReader.m19785r(parcel, m19755D);
                    break;
                default:
                    SafeParcelReader.m19764M(parcel, m19755D);
                    break;
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new zzcdn(str, str2, z11, z12, arrayList, z13, z14, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzcdn[i11];
    }
}
