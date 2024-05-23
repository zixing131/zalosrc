package p181g6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaLink;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;

/* renamed from: g6.r */
/* loaded from: classes2.dex */
public final class C19252r implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        StreetViewPanoramaLink[] streetViewPanoramaLinkArr = null;
        LatLng latLng = null;
        String str = null;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            int m19789v = SafeParcelReader.m19789v(m19755D);
            if (m19789v != 2) {
                if (m19789v != 3) {
                    if (m19789v != 4) {
                        SafeParcelReader.m19764M(parcel, m19755D);
                    } else {
                        str = SafeParcelReader.m19783p(parcel, m19755D);
                    }
                } else {
                    latLng = (LatLng) SafeParcelReader.m19782o(parcel, m19755D, LatLng.CREATOR);
                }
            } else {
                streetViewPanoramaLinkArr = (StreetViewPanoramaLink[]) SafeParcelReader.m19786s(parcel, m19755D, StreetViewPanoramaLink.CREATOR);
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new StreetViewPanoramaLocation(streetViewPanoramaLinkArr, latLng, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new StreetViewPanoramaLocation[i11];
    }
}
