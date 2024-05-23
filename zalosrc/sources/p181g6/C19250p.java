package p181g6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

/* renamed from: g6.p */
/* loaded from: classes2.dex */
public final class C19250p implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            int m19789v = SafeParcelReader.m19789v(m19755D);
            if (m19789v != 2) {
                if (m19789v != 3) {
                    if (m19789v != 4) {
                        SafeParcelReader.m19764M(parcel, m19755D);
                    } else {
                        f13 = SafeParcelReader.m19753B(parcel, m19755D);
                    }
                } else {
                    f12 = SafeParcelReader.m19753B(parcel, m19755D);
                }
            } else {
                f11 = SafeParcelReader.m19753B(parcel, m19755D);
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new StreetViewPanoramaCamera(f11, f12, f13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new StreetViewPanoramaCamera[i11];
    }
}
