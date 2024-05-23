package p181g6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PointOfInterest;

/* renamed from: g6.o */
/* loaded from: classes2.dex */
public final class C19249o implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            int m19789v = SafeParcelReader.m19789v(m19755D);
            if (m19789v != 2) {
                if (m19789v != 3) {
                    if (m19789v != 4) {
                        SafeParcelReader.m19764M(parcel, m19755D);
                    } else {
                        str2 = SafeParcelReader.m19783p(parcel, m19755D);
                    }
                } else {
                    str = SafeParcelReader.m19783p(parcel, m19755D);
                }
            } else {
                latLng = (LatLng) SafeParcelReader.m19782o(parcel, m19755D, LatLng.CREATOR);
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new PointOfInterest(latLng, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new PointOfInterest[i11];
    }
}
