package p181g6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.MapStyleOptions;

/* renamed from: g6.l */
/* loaded from: classes2.dex */
public final class C19246l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        String str = null;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            if (SafeParcelReader.m19789v(m19755D) != 2) {
                SafeParcelReader.m19764M(parcel, m19755D);
            } else {
                str = SafeParcelReader.m19783p(parcel, m19755D);
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new MapStyleOptions(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new MapStyleOptions[i11];
    }
}
