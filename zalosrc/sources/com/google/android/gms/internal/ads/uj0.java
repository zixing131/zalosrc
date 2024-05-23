package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class uj0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        String str = null;
        String str2 = null;
        zzq zzqVar = null;
        zzl zzlVar = null;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            int m19789v = SafeParcelReader.m19789v(m19755D);
            if (m19789v != 1) {
                if (m19789v != 2) {
                    if (m19789v != 3) {
                        if (m19789v != 4) {
                            SafeParcelReader.m19764M(parcel, m19755D);
                        } else {
                            zzlVar = (zzl) SafeParcelReader.m19782o(parcel, m19755D, zzl.CREATOR);
                        }
                    } else {
                        zzqVar = (zzq) SafeParcelReader.m19782o(parcel, m19755D, zzq.CREATOR);
                    }
                } else {
                    str2 = SafeParcelReader.m19783p(parcel, m19755D);
                }
            } else {
                str = SafeParcelReader.m19783p(parcel, m19755D);
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new zzcfk(str, str2, zzqVar, zzlVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzcfk[i11];
    }
}
