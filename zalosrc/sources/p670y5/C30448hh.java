package p670y5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.mlkit_vision_barcode.zzse;

/* renamed from: y5.hh */
/* loaded from: classes2.dex */
public final class C30448hh implements Parcelable.Creator {
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
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            switch (SafeParcelReader.m19789v(m19755D)) {
                case 1:
                    str = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 2:
                    str2 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 3:
                    str3 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 4:
                    str4 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 5:
                    str5 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 6:
                    str6 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 7:
                    str7 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 8:
                    str8 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 9:
                    str9 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 10:
                    str10 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 11:
                    str11 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 12:
                    str12 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 13:
                    str13 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 14:
                    str14 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                default:
                    SafeParcelReader.m19764M(parcel, m19755D);
                    break;
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new zzse(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzse[i11];
    }
}
