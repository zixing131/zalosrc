package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.maps.model.l */
/* loaded from: classes2.dex */
public final class C5915l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        ArrayList arrayList = null;
        Cap cap = null;
        Cap cap2 = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        float f11 = 0.0f;
        int i11 = 0;
        float f12 = 0.0f;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        int i12 = 0;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            switch (SafeParcelReader.m19789v(m19755D)) {
                case 2:
                    arrayList = SafeParcelReader.m19787t(parcel, m19755D, LatLng.CREATOR);
                    break;
                case 3:
                    f11 = SafeParcelReader.m19753B(parcel, m19755D);
                    break;
                case 4:
                    i11 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 5:
                    f12 = SafeParcelReader.m19753B(parcel, m19755D);
                    break;
                case 6:
                    z11 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 7:
                    z12 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 8:
                    z13 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 9:
                    cap = (Cap) SafeParcelReader.m19782o(parcel, m19755D, Cap.CREATOR);
                    break;
                case 10:
                    cap2 = (Cap) SafeParcelReader.m19782o(parcel, m19755D, Cap.CREATOR);
                    break;
                case 11:
                    i12 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 12:
                    arrayList2 = SafeParcelReader.m19787t(parcel, m19755D, PatternItem.CREATOR);
                    break;
                case 13:
                    arrayList3 = SafeParcelReader.m19787t(parcel, m19755D, StyleSpan.CREATOR);
                    break;
                default:
                    SafeParcelReader.m19764M(parcel, m19755D);
                    break;
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new PolylineOptions(arrayList, f11, i11, f12, z11, z12, z13, cap, cap2, i12, arrayList2, arrayList3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new PolylineOptions[i11];
    }
}
