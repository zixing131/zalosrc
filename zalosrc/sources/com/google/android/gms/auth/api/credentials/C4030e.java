package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.auth.api.credentials.e */
/* loaded from: classes2.dex */
public final class C4030e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        CredentialPickerConfig credentialPickerConfig = null;
        String[] strArr = null;
        String str = null;
        String str2 = null;
        int i11 = 0;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            int m19789v = SafeParcelReader.m19789v(m19755D);
            if (m19789v != 1000) {
                switch (m19789v) {
                    case 1:
                        credentialPickerConfig = (CredentialPickerConfig) SafeParcelReader.m19782o(parcel, m19755D, CredentialPickerConfig.CREATOR);
                        break;
                    case 2:
                        z11 = SafeParcelReader.m19790w(parcel, m19755D);
                        break;
                    case 3:
                        z12 = SafeParcelReader.m19790w(parcel, m19755D);
                        break;
                    case 4:
                        strArr = SafeParcelReader.m19784q(parcel, m19755D);
                        break;
                    case 5:
                        z13 = SafeParcelReader.m19790w(parcel, m19755D);
                        break;
                    case 6:
                        str = SafeParcelReader.m19783p(parcel, m19755D);
                        break;
                    case 7:
                        str2 = SafeParcelReader.m19783p(parcel, m19755D);
                        break;
                    default:
                        SafeParcelReader.m19764M(parcel, m19755D);
                        break;
                }
            } else {
                i11 = SafeParcelReader.m19757F(parcel, m19755D);
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new HintRequest(i11, credentialPickerConfig, z11, z12, strArr, z13, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new HintRequest[i11];
    }
}
