package p012a6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.mlkit_vision_text_common.zzn;

/* renamed from: a6.jd */
/* loaded from: classes2.dex */
public final class C0329jd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            SafeParcelReader.m19789v(m19755D);
            SafeParcelReader.m19764M(parcel, m19755D);
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new zzn();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzn[i11];
    }
}
