package p122e5;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;

/* renamed from: e5.f */
/* loaded from: classes2.dex */
public final class C18205f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
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
        return new ModuleInstallIntentResponse(pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new ModuleInstallIntentResponse[i11];
    }
}
