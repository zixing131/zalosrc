package p012a6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.mlkit_vision_text_common.zzsi;

/* renamed from: a6.lh */
/* loaded from: classes2.dex */
public final class C0371lh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z11 = false;
        int i11 = 0;
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
                    z11 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 5:
                    i11 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 6:
                    str4 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                default:
                    SafeParcelReader.m19764M(parcel, m19755D);
                    break;
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new zzsi(str, str2, str3, z11, i11, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzsi[i11];
    }
}
