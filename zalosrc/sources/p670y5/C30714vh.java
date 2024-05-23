package p670y5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.mlkit_vision_barcode.zze;
import com.google.android.gms.internal.mlkit_vision_barcode.zzh;
import com.google.android.gms.internal.mlkit_vision_barcode.zzj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzm;

/* renamed from: y5.vh */
/* loaded from: classes2.dex */
public final class C30714vh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        zzl zzlVar = null;
        String str = null;
        String str2 = null;
        zzm[] zzmVarArr = null;
        zzj[] zzjVarArr = null;
        String[] strArr = null;
        zze[] zzeVarArr = null;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            switch (SafeParcelReader.m19789v(m19755D)) {
                case 2:
                    zzlVar = (zzl) SafeParcelReader.m19782o(parcel, m19755D, zzl.CREATOR);
                    break;
                case 3:
                    str = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 4:
                    str2 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 5:
                    zzmVarArr = (zzm[]) SafeParcelReader.m19786s(parcel, m19755D, zzm.CREATOR);
                    break;
                case 6:
                    zzjVarArr = (zzj[]) SafeParcelReader.m19786s(parcel, m19755D, zzj.CREATOR);
                    break;
                case 7:
                    strArr = SafeParcelReader.m19784q(parcel, m19755D);
                    break;
                case 8:
                    zzeVarArr = (zze[]) SafeParcelReader.m19786s(parcel, m19755D, zze.CREATOR);
                    break;
                default:
                    SafeParcelReader.m19764M(parcel, m19755D);
                    break;
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new zzh(zzlVar, str, str2, zzmVarArr, zzjVarArr, strArr, zzeVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzh[i11];
    }
}
