package p012a6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.mlkit_vision_text_common.zzf;

/* renamed from: a6.d5 */
/* loaded from: classes2.dex */
public final class C0207d5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        float f11 = 0.0f;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            int m19789v = SafeParcelReader.m19789v(m19755D);
            if (m19789v != 2) {
                if (m19789v != 3) {
                    if (m19789v != 4) {
                        if (m19789v != 5) {
                            if (m19789v != 6) {
                                SafeParcelReader.m19764M(parcel, m19755D);
                            } else {
                                f11 = SafeParcelReader.m19753B(parcel, m19755D);
                            }
                        } else {
                            i14 = SafeParcelReader.m19757F(parcel, m19755D);
                        }
                    } else {
                        i13 = SafeParcelReader.m19757F(parcel, m19755D);
                    }
                } else {
                    i12 = SafeParcelReader.m19757F(parcel, m19755D);
                }
            } else {
                i11 = SafeParcelReader.m19757F(parcel, m19755D);
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new zzf(i11, i12, i13, i14, f11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzf[i11];
    }
}
