package p012a6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.mlkit_vision_text_common.zzf;
import com.google.android.gms.internal.mlkit_vision_text_common.zzl;
import com.google.android.gms.internal.mlkit_vision_text_common.zzr;

/* renamed from: a6.ib */
/* loaded from: classes2.dex */
public final class C0308ib implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        zzr[] zzrVarArr = null;
        zzf zzfVar = null;
        zzf zzfVar2 = null;
        zzf zzfVar3 = null;
        String str = null;
        String str2 = null;
        float f11 = 0.0f;
        int i11 = 0;
        boolean z11 = false;
        int i12 = 0;
        int i13 = 0;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            switch (SafeParcelReader.m19789v(m19755D)) {
                case 2:
                    zzrVarArr = (zzr[]) SafeParcelReader.m19786s(parcel, m19755D, zzr.CREATOR);
                    break;
                case 3:
                    zzfVar = (zzf) SafeParcelReader.m19782o(parcel, m19755D, zzf.CREATOR);
                    break;
                case 4:
                    zzfVar2 = (zzf) SafeParcelReader.m19782o(parcel, m19755D, zzf.CREATOR);
                    break;
                case 5:
                    zzfVar3 = (zzf) SafeParcelReader.m19782o(parcel, m19755D, zzf.CREATOR);
                    break;
                case 6:
                    str = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 7:
                    f11 = SafeParcelReader.m19753B(parcel, m19755D);
                    break;
                case 8:
                    str2 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 9:
                    i11 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 10:
                    z11 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 11:
                    i12 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 12:
                    i13 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                default:
                    SafeParcelReader.m19764M(parcel, m19755D);
                    break;
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new zzl(zzrVarArr, zzfVar, zzfVar2, zzfVar3, str, f11, str2, i11, z11, i12, i13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzl[i11];
    }
}
