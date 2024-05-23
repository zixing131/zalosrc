package p437q4;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: q4.b */
/* loaded from: classes2.dex */
public final class C25109b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            if (SafeParcelReader.m19789v(m19755D) != 1) {
                SafeParcelReader.m19764M(parcel, m19755D);
            } else {
                pendingIntent = (PendingIntent) SafeParcelReader.m19782o(parcel, m19755D, PendingIntent.CREATOR);
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new SavePasswordResult(pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new SavePasswordResult[i11];
    }
}
