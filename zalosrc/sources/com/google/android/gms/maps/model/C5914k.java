package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.maps.model.k */
/* loaded from: classes2.dex */
public final class C5914k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        ArrayList arrayList = new ArrayList();
        float f11 = 0.0f;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        int i11 = 0;
        int i12 = 0;
        float f12 = 0.0f;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        int i13 = 0;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            switch (SafeParcelReader.m19789v(m19755D)) {
                case 2:
                    arrayList2 = SafeParcelReader.m19787t(parcel, m19755D, LatLng.CREATOR);
                    break;
                case 3:
                    SafeParcelReader.m19759H(parcel, m19755D, arrayList, C5914k.class.getClassLoader());
                    break;
                case 4:
                    f11 = SafeParcelReader.m19753B(parcel, m19755D);
                    break;
                case 5:
                    i11 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 6:
                    i12 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 7:
                    f12 = SafeParcelReader.m19753B(parcel, m19755D);
                    break;
                case 8:
                    z11 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 9:
                    z12 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 10:
                    z13 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 11:
                    i13 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 12:
                    arrayList3 = SafeParcelReader.m19787t(parcel, m19755D, PatternItem.CREATOR);
                    break;
                default:
                    SafeParcelReader.m19764M(parcel, m19755D);
                    break;
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new PolygonOptions(arrayList2, arrayList, f11, i11, i12, f12, z11, z12, z13, i13, arrayList3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new PolygonOptions[i11];
    }
}
