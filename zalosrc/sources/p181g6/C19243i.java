package p181g6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.VisibleRegion;

/* renamed from: g6.i */
/* loaded from: classes2.dex */
public final class C19243i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLng latLng4 = null;
        LatLngBounds latLngBounds = null;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            int m19789v = SafeParcelReader.m19789v(m19755D);
            if (m19789v != 2) {
                if (m19789v != 3) {
                    if (m19789v != 4) {
                        if (m19789v != 5) {
                            if (m19789v != 6) {
                                SafeParcelReader.m19764M(parcel, m19755D);
                            } else {
                                latLngBounds = (LatLngBounds) SafeParcelReader.m19782o(parcel, m19755D, LatLngBounds.CREATOR);
                            }
                        } else {
                            latLng4 = (LatLng) SafeParcelReader.m19782o(parcel, m19755D, LatLng.CREATOR);
                        }
                    } else {
                        latLng3 = (LatLng) SafeParcelReader.m19782o(parcel, m19755D, LatLng.CREATOR);
                    }
                } else {
                    latLng2 = (LatLng) SafeParcelReader.m19782o(parcel, m19755D, LatLng.CREATOR);
                }
            } else {
                latLng = (LatLng) SafeParcelReader.m19782o(parcel, m19755D, LatLng.CREATOR);
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new VisibleRegion(latLng, latLng2, latLng3, latLng4, latLngBounds);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new VisibleRegion[i11];
    }
}
