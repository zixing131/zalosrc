package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.auth.api.signin.e */
/* loaded from: classes2.dex */
public final class C4043e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        ArrayList arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        int i11 = 0;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            switch (SafeParcelReader.m19789v(m19755D)) {
                case 1:
                    i11 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 2:
                    arrayList = SafeParcelReader.m19787t(parcel, m19755D, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) SafeParcelReader.m19782o(parcel, m19755D, Account.CREATOR);
                    break;
                case 4:
                    z11 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 5:
                    z12 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 6:
                    z13 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 7:
                    str = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 8:
                    str2 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 9:
                    arrayList2 = SafeParcelReader.m19787t(parcel, m19755D, GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                case 10:
                    str3 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                default:
                    SafeParcelReader.m19764M(parcel, m19755D);
                    break;
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new GoogleSignInOptions(i11, arrayList, account, z11, z12, z13, str, str2, arrayList2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new GoogleSignInOptions[i11];
    }
}
