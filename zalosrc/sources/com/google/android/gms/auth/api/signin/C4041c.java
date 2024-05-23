package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.auth.api.signin.c */
/* loaded from: classes2.dex */
public final class C4041c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        long j11 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            switch (SafeParcelReader.m19789v(m19755D)) {
                case 1:
                    i11 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 2:
                    str = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 3:
                    str2 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 4:
                    str3 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 5:
                    str4 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 6:
                    uri = (Uri) SafeParcelReader.m19782o(parcel, m19755D, Uri.CREATOR);
                    break;
                case 7:
                    str5 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 8:
                    j11 = SafeParcelReader.m19760I(parcel, m19755D);
                    break;
                case 9:
                    str6 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 10:
                    arrayList = SafeParcelReader.m19787t(parcel, m19755D, Scope.CREATOR);
                    break;
                case 11:
                    str7 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 12:
                    str8 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                default:
                    SafeParcelReader.m19764M(parcel, m19755D);
                    break;
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new GoogleSignInAccount(i11, str, str2, str3, str4, uri, str5, j11, str6, arrayList, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new GoogleSignInAccount[i11];
    }
}
