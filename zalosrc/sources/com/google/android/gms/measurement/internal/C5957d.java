package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.measurement.internal.d */
/* loaded from: classes2.dex */
public final class C5957d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        String str = null;
        String str2 = null;
        zzli zzliVar = null;
        String str3 = null;
        zzaw zzawVar = null;
        zzaw zzawVar2 = null;
        zzaw zzawVar3 = null;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        boolean z11 = false;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            switch (SafeParcelReader.m19789v(m19755D)) {
                case 2:
                    str = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 3:
                    str2 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 4:
                    zzliVar = (zzli) SafeParcelReader.m19782o(parcel, m19755D, zzli.CREATOR);
                    break;
                case 5:
                    j11 = SafeParcelReader.m19760I(parcel, m19755D);
                    break;
                case 6:
                    z11 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 7:
                    str3 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 8:
                    zzawVar = (zzaw) SafeParcelReader.m19782o(parcel, m19755D, zzaw.CREATOR);
                    break;
                case 9:
                    j12 = SafeParcelReader.m19760I(parcel, m19755D);
                    break;
                case 10:
                    zzawVar2 = (zzaw) SafeParcelReader.m19782o(parcel, m19755D, zzaw.CREATOR);
                    break;
                case 11:
                    j13 = SafeParcelReader.m19760I(parcel, m19755D);
                    break;
                case 12:
                    zzawVar3 = (zzaw) SafeParcelReader.m19782o(parcel, m19755D, zzaw.CREATOR);
                    break;
                default:
                    SafeParcelReader.m19764M(parcel, m19755D);
                    break;
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new zzac(str, str2, zzliVar, j11, z11, str3, zzawVar, j12, zzawVar2, j13, zzawVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzac[i11];
    }
}
