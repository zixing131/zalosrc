package p093d6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.SleepSegmentEvent;

/* renamed from: d6.a0 */
/* loaded from: classes2.dex */
public final class C17757a0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        long j11 = 0;
        long j12 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            int m19789v = SafeParcelReader.m19789v(m19755D);
            if (m19789v != 1) {
                if (m19789v != 2) {
                    if (m19789v != 3) {
                        if (m19789v != 4) {
                            if (m19789v != 5) {
                                SafeParcelReader.m19764M(parcel, m19755D);
                            } else {
                                i13 = SafeParcelReader.m19757F(parcel, m19755D);
                            }
                        } else {
                            i12 = SafeParcelReader.m19757F(parcel, m19755D);
                        }
                    } else {
                        i11 = SafeParcelReader.m19757F(parcel, m19755D);
                    }
                } else {
                    j12 = SafeParcelReader.m19760I(parcel, m19755D);
                }
            } else {
                j11 = SafeParcelReader.m19760I(parcel, m19755D);
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new SleepSegmentEvent(j11, j12, i11, i12, i13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i11) {
        return new SleepSegmentEvent[i11];
    }
}
