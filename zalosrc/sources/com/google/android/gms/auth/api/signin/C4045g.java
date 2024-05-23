package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.auth.api.signin.g */
/* loaded from: classes2.dex */
public final class C4045g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        String str = "";
        GoogleSignInAccount googleSignInAccount = null;
        String str2 = "";
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            int m19789v = SafeParcelReader.m19789v(m19755D);
            if (m19789v != 4) {
                if (m19789v != 7) {
                    if (m19789v != 8) {
                        SafeParcelReader.m19764M(parcel, m19755D);
                    } else {
                        str2 = SafeParcelReader.m19783p(parcel, m19755D);
                    }
                } else {
                    googleSignInAccount = (GoogleSignInAccount) SafeParcelReader.m19782o(parcel, m19755D, GoogleSignInAccount.CREATOR);
                }
            } else {
                str = SafeParcelReader.m19783p(parcel, m19755D);
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new SignInAccount(str, googleSignInAccount, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new SignInAccount[i11];
    }
}
