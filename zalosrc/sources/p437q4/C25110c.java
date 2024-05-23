package p437q4;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: q4.c */
/* loaded from: classes2.dex */
public final class C25110c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
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
                    str4 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 5:
                    uri = (Uri) SafeParcelReader.m19782o(parcel, m19755D, Uri.CREATOR);
                    break;
                case 6:
                    str5 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 7:
                    str6 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                default:
                    SafeParcelReader.m19764M(parcel, m19755D);
                    break;
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new SignInCredential(str, str2, str3, str4, uri, str5, str6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new SignInCredential[i11];
    }
}
