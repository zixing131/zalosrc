package p597w4;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: w4.b */
/* loaded from: classes2.dex */
public final class C28724b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            if (SafeParcelReader.m19789v(m19755D) != 1) {
                SafeParcelReader.m19764M(parcel, m19755D);
            } else {
                intent = (Intent) SafeParcelReader.m19782o(parcel, m19755D, Intent.CREATOR);
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new CloudMessage(intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i11) {
        return new CloudMessage[i11];
    }
}
