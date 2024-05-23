package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import p031b5.AbstractC2552a;

/* renamed from: com.google.firebase.messaging.n0 */
/* loaded from: classes3.dex */
public class C6633n0 implements Parcelable.Creator {
    /* renamed from: c */
    public static void m33922c(RemoteMessage remoteMessage, Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12916e(parcel, 2, remoteMessage.f36591p, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public RemoteMessage createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            if (SafeParcelReader.m19789v(m19755D) != 2) {
                SafeParcelReader.m19764M(parcel, m19755D);
            } else {
                bundle = SafeParcelReader.m19773f(parcel, m19755D);
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new RemoteMessage(bundle);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: b */
    public RemoteMessage[] newArray(int i11) {
        return new RemoteMessage[i11];
    }
}
