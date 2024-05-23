package p093d6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;

/* renamed from: d6.d0 */
/* loaded from: classes2.dex */
public final class C17763d0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        ArrayList arrayList = null;
        Bundle bundle = null;
        long j11 = 0;
        long j12 = 0;
        int i11 = 0;
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
                                bundle = SafeParcelReader.m19773f(parcel, m19755D);
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
            } else {
                arrayList = SafeParcelReader.m19787t(parcel, m19755D, DetectedActivity.CREATOR);
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new ActivityRecognitionResult(arrayList, j11, j12, i11, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i11) {
        return new ActivityRecognitionResult[i11];
    }
}
