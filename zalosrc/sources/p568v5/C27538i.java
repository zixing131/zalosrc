package p568v5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.location.zzbe;

/* renamed from: v5.i */
/* loaded from: classes2.dex */
public final class C27538i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        String str = null;
        double d11 = 0.0d;
        double d12 = 0.0d;
        long j11 = 0;
        int i11 = 0;
        short s7 = 0;
        float f11 = 0.0f;
        int i12 = 0;
        int i13 = -1;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            switch (SafeParcelReader.m19789v(m19755D)) {
                case 1:
                    str = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 2:
                    j11 = SafeParcelReader.m19760I(parcel, m19755D);
                    break;
                case 3:
                    s7 = SafeParcelReader.m19762K(parcel, m19755D);
                    break;
                case 4:
                    d11 = SafeParcelReader.m19793z(parcel, m19755D);
                    break;
                case 5:
                    d12 = SafeParcelReader.m19793z(parcel, m19755D);
                    break;
                case 6:
                    f11 = SafeParcelReader.m19753B(parcel, m19755D);
                    break;
                case 7:
                    i11 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 8:
                    i12 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 9:
                    i13 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                default:
                    SafeParcelReader.m19764M(parcel, m19755D);
                    break;
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new zzbe(str, i11, s7, d11, d12, f11, j11, i12, i13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i11) {
        return new zzbe[i11];
    }
}
