package p093d6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.SleepClassifyEvent;

/* renamed from: d6.z */
/* loaded from: classes2.dex */
public final class C17791z implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        boolean z11 = false;
        int i18 = 0;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            switch (SafeParcelReader.m19789v(m19755D)) {
                case 1:
                    i11 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 2:
                    i12 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 3:
                    i13 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 4:
                    i14 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 5:
                    i15 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 6:
                    i16 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 7:
                    i17 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 8:
                    z11 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 9:
                    i18 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                default:
                    SafeParcelReader.m19764M(parcel, m19755D);
                    break;
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new SleepClassifyEvent(i11, i12, i13, i14, i15, i16, i17, z11, i18);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i11) {
        return new SleepClassifyEvent[i11];
    }
}
