package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.maps.model.h */
/* loaded from: classes2.dex */
public final class C5911h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        IBinder iBinder = null;
        LatLng latLng = null;
        LatLngBounds latLngBounds = null;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        boolean z11 = false;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        boolean z12 = false;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            switch (SafeParcelReader.m19789v(m19755D)) {
                case 2:
                    iBinder = SafeParcelReader.m19756E(parcel, m19755D);
                    break;
                case 3:
                    latLng = (LatLng) SafeParcelReader.m19782o(parcel, m19755D, LatLng.CREATOR);
                    break;
                case 4:
                    f11 = SafeParcelReader.m19753B(parcel, m19755D);
                    break;
                case 5:
                    f12 = SafeParcelReader.m19753B(parcel, m19755D);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) SafeParcelReader.m19782o(parcel, m19755D, LatLngBounds.CREATOR);
                    break;
                case 7:
                    f13 = SafeParcelReader.m19753B(parcel, m19755D);
                    break;
                case 8:
                    f14 = SafeParcelReader.m19753B(parcel, m19755D);
                    break;
                case 9:
                    z11 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 10:
                    f15 = SafeParcelReader.m19753B(parcel, m19755D);
                    break;
                case 11:
                    f16 = SafeParcelReader.m19753B(parcel, m19755D);
                    break;
                case 12:
                    f17 = SafeParcelReader.m19753B(parcel, m19755D);
                    break;
                case 13:
                    z12 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                default:
                    SafeParcelReader.m19764M(parcel, m19755D);
                    break;
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new GroundOverlayOptions(iBinder, latLng, f11, f12, latLngBounds, f13, f14, z11, f15, f16, f17, z12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new GroundOverlayOptions[i11];
    }
}
