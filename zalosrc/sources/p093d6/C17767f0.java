package p093d6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.ActivityTransition;
import com.google.android.gms.location.ActivityTransitionRequest;
import java.util.ArrayList;

/* renamed from: d6.f0 */
/* loaded from: classes2.dex */
public final class C17767f0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        ArrayList arrayList = null;
        String str = null;
        ArrayList arrayList2 = null;
        String str2 = null;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            int m19789v = SafeParcelReader.m19789v(m19755D);
            if (m19789v != 1) {
                if (m19789v != 2) {
                    if (m19789v != 3) {
                        if (m19789v != 4) {
                            SafeParcelReader.m19764M(parcel, m19755D);
                        } else {
                            str2 = SafeParcelReader.m19783p(parcel, m19755D);
                        }
                    } else {
                        arrayList2 = SafeParcelReader.m19787t(parcel, m19755D, ClientIdentity.CREATOR);
                    }
                } else {
                    str = SafeParcelReader.m19783p(parcel, m19755D);
                }
            } else {
                arrayList = SafeParcelReader.m19787t(parcel, m19755D, ActivityTransition.CREATOR);
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new ActivityTransitionRequest(arrayList, str, arrayList2, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i11) {
        return new ActivityTransitionRequest[i11];
    }
}
