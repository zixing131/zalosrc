package p670y5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsc;

/* renamed from: y5.fh */
/* loaded from: classes2.dex */
public final class C30410fh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        zzsb zzsbVar = null;
        zzsb zzsbVar2 = null;
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
                    zzsbVar = (zzsb) SafeParcelReader.m19782o(parcel, m19755D, zzsb.CREATOR);
                    break;
                case 7:
                    zzsbVar2 = (zzsb) SafeParcelReader.m19782o(parcel, m19755D, zzsb.CREATOR);
                    break;
                default:
                    SafeParcelReader.m19764M(parcel, m19755D);
                    break;
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new zzsc(str, str2, str3, str4, str5, zzsbVar, zzsbVar2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzsc[i11];
    }
}
