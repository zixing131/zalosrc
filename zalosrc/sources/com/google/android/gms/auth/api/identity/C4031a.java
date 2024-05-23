package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.auth.api.identity.a */
/* loaded from: classes2.dex */
public final class C4031a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        BeginSignInRequest.PasswordRequestOptions passwordRequestOptions = null;
        BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptions = null;
        String str = null;
        boolean z11 = false;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            int m19789v = SafeParcelReader.m19789v(m19755D);
            if (m19789v != 1) {
                if (m19789v != 2) {
                    if (m19789v != 3) {
                        if (m19789v != 4) {
                            SafeParcelReader.m19764M(parcel, m19755D);
                        } else {
                            z11 = SafeParcelReader.m19790w(parcel, m19755D);
                        }
                    } else {
                        str = SafeParcelReader.m19783p(parcel, m19755D);
                    }
                } else {
                    googleIdTokenRequestOptions = (BeginSignInRequest.GoogleIdTokenRequestOptions) SafeParcelReader.m19782o(parcel, m19755D, BeginSignInRequest.GoogleIdTokenRequestOptions.CREATOR);
                }
            } else {
                passwordRequestOptions = (BeginSignInRequest.PasswordRequestOptions) SafeParcelReader.m19782o(parcel, m19755D, BeginSignInRequest.PasswordRequestOptions.CREATOR);
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new BeginSignInRequest(passwordRequestOptions, googleIdTokenRequestOptions, str, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new BeginSignInRequest[i11];
    }
}
