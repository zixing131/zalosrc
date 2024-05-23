package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import p031b5.AbstractC2552a;

/* renamed from: com.google.android.gms.measurement.internal.t */
/* loaded from: classes.dex */
public final class C6133t implements Parcelable.Creator {
    /* renamed from: a */
    public static void m31450a(zzaw zzawVar, Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12934w(parcel, 2, zzawVar.f34676p, false);
        AbstractC2552a.m12932u(parcel, 3, zzawVar.f34677q, i11, false);
        AbstractC2552a.m12934w(parcel, 4, zzawVar.f34678r, false);
        AbstractC2552a.m12929r(parcel, 5, zzawVar.f34679s);
        AbstractC2552a.m12913b(parcel, m12912a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        long j11 = 0;
        String str = null;
        zzau zzauVar = null;
        String str2 = null;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            int m19789v = SafeParcelReader.m19789v(m19755D);
            if (m19789v != 2) {
                if (m19789v != 3) {
                    if (m19789v != 4) {
                        if (m19789v != 5) {
                            SafeParcelReader.m19764M(parcel, m19755D);
                        } else {
                            j11 = SafeParcelReader.m19760I(parcel, m19755D);
                        }
                    } else {
                        str2 = SafeParcelReader.m19783p(parcel, m19755D);
                    }
                } else {
                    zzauVar = (zzau) SafeParcelReader.m19782o(parcel, m19755D, zzau.CREATOR);
                }
            } else {
                str = SafeParcelReader.m19783p(parcel, m19755D);
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new zzaw(str, zzauVar, str2, j11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzaw[i11];
    }
}
