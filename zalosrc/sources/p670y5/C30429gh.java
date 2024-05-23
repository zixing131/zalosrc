package p670y5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsa;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsf;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsh;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsi;

/* renamed from: y5.gh */
/* loaded from: classes2.dex */
public final class C30429gh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        zzsh zzshVar = null;
        String str = null;
        String str2 = null;
        zzsi[] zzsiVarArr = null;
        zzsf[] zzsfVarArr = null;
        String[] strArr = null;
        zzsa[] zzsaVarArr = null;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            switch (SafeParcelReader.m19789v(m19755D)) {
                case 1:
                    zzshVar = (zzsh) SafeParcelReader.m19782o(parcel, m19755D, zzsh.CREATOR);
                    break;
                case 2:
                    str = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 3:
                    str2 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 4:
                    zzsiVarArr = (zzsi[]) SafeParcelReader.m19786s(parcel, m19755D, zzsi.CREATOR);
                    break;
                case 5:
                    zzsfVarArr = (zzsf[]) SafeParcelReader.m19786s(parcel, m19755D, zzsf.CREATOR);
                    break;
                case 6:
                    strArr = SafeParcelReader.m19784q(parcel, m19755D);
                    break;
                case 7:
                    zzsaVarArr = (zzsa[]) SafeParcelReader.m19786s(parcel, m19755D, zzsa.CREATOR);
                    break;
                default:
                    SafeParcelReader.m19764M(parcel, m19755D);
                    break;
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new zzsd(zzshVar, str, str2, zzsiVarArr, zzsfVarArr, strArr, zzsaVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzsd[i11];
    }
}
