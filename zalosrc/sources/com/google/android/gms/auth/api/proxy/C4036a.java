package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.auth.api.proxy.a */
/* loaded from: classes2.dex */
public final class C4036a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        String str = null;
        byte[] bArr = null;
        Bundle bundle = null;
        long j11 = 0;
        int i11 = 0;
        int i12 = 0;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            int m19789v = SafeParcelReader.m19789v(m19755D);
            if (m19789v != 1) {
                if (m19789v != 2) {
                    if (m19789v != 3) {
                        if (m19789v != 4) {
                            if (m19789v != 5) {
                                if (m19789v != 1000) {
                                    SafeParcelReader.m19764M(parcel, m19755D);
                                } else {
                                    i11 = SafeParcelReader.m19757F(parcel, m19755D);
                                }
                            } else {
                                bundle = SafeParcelReader.m19773f(parcel, m19755D);
                            }
                        } else {
                            bArr = SafeParcelReader.m19774g(parcel, m19755D);
                        }
                    } else {
                        j11 = SafeParcelReader.m19760I(parcel, m19755D);
                    }
                } else {
                    i12 = SafeParcelReader.m19757F(parcel, m19755D);
                }
            } else {
                str = SafeParcelReader.m19783p(parcel, m19755D);
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new ProxyRequest(i11, str, i12, j11, bArr, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new ProxyRequest[i11];
    }
}
