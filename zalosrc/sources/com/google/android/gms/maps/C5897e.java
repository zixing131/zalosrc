package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewSource;

/* renamed from: com.google.android.gms.maps.e */
/* loaded from: classes2.dex */
public final class C5897e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        StreetViewPanoramaCamera streetViewPanoramaCamera = null;
        String str = null;
        LatLng latLng = null;
        Integer num = null;
        StreetViewSource streetViewSource = null;
        byte b11 = 0;
        byte b12 = 0;
        byte b13 = 0;
        byte b14 = 0;
        byte b15 = 0;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            switch (SafeParcelReader.m19789v(m19755D)) {
                case 2:
                    streetViewPanoramaCamera = (StreetViewPanoramaCamera) SafeParcelReader.m19782o(parcel, m19755D, StreetViewPanoramaCamera.CREATOR);
                    break;
                case 3:
                    str = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 4:
                    latLng = (LatLng) SafeParcelReader.m19782o(parcel, m19755D, LatLng.CREATOR);
                    break;
                case 5:
                    num = SafeParcelReader.m19758G(parcel, m19755D);
                    break;
                case 6:
                    b11 = SafeParcelReader.m19792y(parcel, m19755D);
                    break;
                case 7:
                    b12 = SafeParcelReader.m19792y(parcel, m19755D);
                    break;
                case 8:
                    b13 = SafeParcelReader.m19792y(parcel, m19755D);
                    break;
                case 9:
                    b14 = SafeParcelReader.m19792y(parcel, m19755D);
                    break;
                case 10:
                    b15 = SafeParcelReader.m19792y(parcel, m19755D);
                    break;
                case 11:
                    streetViewSource = (StreetViewSource) SafeParcelReader.m19782o(parcel, m19755D, StreetViewSource.CREATOR);
                    break;
                default:
                    SafeParcelReader.m19764M(parcel, m19755D);
                    break;
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new StreetViewPanoramaOptions(streetViewPanoramaCamera, str, latLng, num, b11, b12, b13, b14, b15, streetViewSource);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new StreetViewPanoramaOptions[i11];
    }
}
