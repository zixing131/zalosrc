package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import p031b5.AbstractC2552a;

/* renamed from: com.google.android.gms.measurement.internal.o9 */
/* loaded from: classes.dex */
public final class C6088o9 implements Parcelable.Creator {
    /* renamed from: a */
    public static void m31271a(zzli zzliVar, Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, zzliVar.f34680p);
        AbstractC2552a.m12934w(parcel, 2, zzliVar.f34681q, false);
        AbstractC2552a.m12929r(parcel, 3, zzliVar.f34682r);
        AbstractC2552a.m12930s(parcel, 4, zzliVar.f34683s, false);
        AbstractC2552a.m12922k(parcel, 5, null, false);
        AbstractC2552a.m12934w(parcel, 6, zzliVar.f34684t, false);
        AbstractC2552a.m12934w(parcel, 7, zzliVar.f34685u, false);
        AbstractC2552a.m12920i(parcel, 8, zzliVar.f34686v, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        String str = null;
        Long l11 = null;
        Float f11 = null;
        String str2 = null;
        String str3 = null;
        Double d11 = null;
        long j11 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            switch (SafeParcelReader.m19789v(m19755D)) {
                case 1:
                    i11 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 2:
                    str = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 3:
                    j11 = SafeParcelReader.m19760I(parcel, m19755D);
                    break;
                case 4:
                    l11 = SafeParcelReader.m19761J(parcel, m19755D);
                    break;
                case 5:
                    f11 = SafeParcelReader.m19754C(parcel, m19755D);
                    break;
                case 6:
                    str2 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 7:
                    str3 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 8:
                    d11 = SafeParcelReader.m19752A(parcel, m19755D);
                    break;
                default:
                    SafeParcelReader.m19764M(parcel, m19755D);
                    break;
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new zzli(i11, str, j11, l11, f11, str2, str3, d11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzli[i11];
    }
}
