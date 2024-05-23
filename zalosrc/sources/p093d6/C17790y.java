package p093d6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationSettingsStates;

/* renamed from: d6.y */
/* loaded from: classes2.dex */
public final class C17790y implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            switch (SafeParcelReader.m19789v(m19755D)) {
                case 1:
                    z11 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 2:
                    z12 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 3:
                    z13 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 4:
                    z14 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 5:
                    z15 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 6:
                    z16 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                default:
                    SafeParcelReader.m19764M(parcel, m19755D);
                    break;
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new LocationSettingsStates(z11, z12, z13, z14, z15, z16);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i11) {
        return new LocationSettingsStates[i11];
    }
}
