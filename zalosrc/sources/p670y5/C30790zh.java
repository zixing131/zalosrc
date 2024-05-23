package p670y5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.mlkit_vision_barcode.zzl;

/* renamed from: y5.zh */
/* loaded from: classes2.dex */
public final class C30790zh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            switch (SafeParcelReader.m19789v(m19755D)) {
                case 2:
                    str = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 3:
                    str2 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 4:
                    str3 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 5:
                    str4 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 6:
                    str5 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 7:
                    str6 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 8:
                    str7 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                default:
                    SafeParcelReader.m19764M(parcel, m19755D);
                    break;
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new zzl(str, str2, str3, str4, str5, str6, str7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzl[i11];
    }
}
