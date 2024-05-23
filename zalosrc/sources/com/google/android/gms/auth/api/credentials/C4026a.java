package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.auth.api.credentials.a */
/* loaded from: classes2.dex */
public final class C4026a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        String str = null;
        String str2 = null;
        Uri uri = null;
        ArrayList arrayList = null;
        String str3 = null;
        String str4 = null;
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
                    uri = (Uri) SafeParcelReader.m19782o(parcel, m19755D, Uri.CREATOR);
                    break;
                case 4:
                    arrayList = SafeParcelReader.m19787t(parcel, m19755D, IdToken.CREATOR);
                    break;
                case 5:
                    str3 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 6:
                    str4 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 7:
                case 8:
                default:
                    SafeParcelReader.m19764M(parcel, m19755D);
                    break;
                case 9:
                    str5 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 10:
                    str6 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new Credential(str, str2, uri, arrayList, str3, str4, str5, str6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new Credential[i11];
    }
}
