package p181g6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: g6.k */
/* loaded from: classes2.dex */
public final class C19245k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        double d11 = 0.0d;
        double d12 = 0.0d;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            int m19789v = SafeParcelReader.m19789v(m19755D);
            if (m19789v != 2) {
                if (m19789v != 3) {
                    SafeParcelReader.m19764M(parcel, m19755D);
                } else {
                    d12 = SafeParcelReader.m19793z(parcel, m19755D);
                }
            } else {
                d11 = SafeParcelReader.m19793z(parcel, m19755D);
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new LatLng(d11, d12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new LatLng[i11];
    }
}