package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.auth.api.proxy.b */
/* loaded from: classes2.dex */
public final class C4037b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        PendingIntent pendingIntent = null;
        Bundle bundle = null;
        byte[] bArr = null;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
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
                                bArr = SafeParcelReader.m19774g(parcel, m19755D);
                            }
                        } else {
                            bundle = SafeParcelReader.m19773f(parcel, m19755D);
                        }
                    } else {
                        i13 = SafeParcelReader.m19757F(parcel, m19755D);
                    }
                } else {
                    pendingIntent = (PendingIntent) SafeParcelReader.m19782o(parcel, m19755D, PendingIntent.CREATOR);
                }
            } else {
                i12 = SafeParcelReader.m19757F(parcel, m19755D);
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new ProxyResponse(i11, i12, pendingIntent, i13, bundle, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new ProxyResponse[i11];
    }
}
