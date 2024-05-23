package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.auth.api.identity.e */
/* loaded from: classes2.dex */
public final class C4035e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        SignInPassword signInPassword = null;
        String str = null;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            int m19789v = SafeParcelReader.m19789v(m19755D);
            if (m19789v != 1) {
                if (m19789v != 2) {
                    SafeParcelReader.m19764M(parcel, m19755D);
                } else {
                    str = SafeParcelReader.m19783p(parcel, m19755D);
                }
            } else {
                signInPassword = (SignInPassword) SafeParcelReader.m19782o(parcel, m19755D, SignInPassword.CREATOR);
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new SavePasswordRequest(signInPassword, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new SavePasswordRequest[i11];
    }
}
