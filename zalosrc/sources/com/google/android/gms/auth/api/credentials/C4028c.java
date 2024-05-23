package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.auth.api.credentials.c */
/* loaded from: classes2.dex */
public final class C4028c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        int i11 = 0;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        int i12 = 0;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            int m19789v = SafeParcelReader.m19789v(m19755D);
            if (m19789v != 1) {
                if (m19789v != 2) {
                    if (m19789v != 3) {
                        if (m19789v != 4) {
                            if (m19789v != 1000) {
                                SafeParcelReader.m19764M(parcel, m19755D);
                            } else {
                                i11 = SafeParcelReader.m19757F(parcel, m19755D);
                            }
                        } else {
                            i12 = SafeParcelReader.m19757F(parcel, m19755D);
                        }
                    } else {
                        z13 = SafeParcelReader.m19790w(parcel, m19755D);
                    }
                } else {
                    z12 = SafeParcelReader.m19790w(parcel, m19755D);
                }
            } else {
                z11 = SafeParcelReader.m19790w(parcel, m19755D);
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new CredentialPickerConfig(i11, z11, z12, z13, i12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new CredentialPickerConfig[i11];
    }
}
