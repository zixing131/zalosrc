package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.zzs;
import java.util.List;

/* renamed from: com.google.android.gms.internal.location.k */
/* loaded from: classes2.dex */
public final class C5277k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        zzs zzsVar = zzj.f32233t;
        List list = zzj.f32232s;
        String str = null;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            int m19789v = SafeParcelReader.m19789v(m19755D);
            if (m19789v != 1) {
                if (m19789v != 2) {
                    if (m19789v != 3) {
                        SafeParcelReader.m19764M(parcel, m19755D);
                    } else {
                        str = SafeParcelReader.m19783p(parcel, m19755D);
                    }
                } else {
                    list = SafeParcelReader.m19787t(parcel, m19755D, ClientIdentity.CREATOR);
                }
            } else {
                zzsVar = (zzs) SafeParcelReader.m19782o(parcel, m19755D, zzs.CREATOR);
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new zzj(zzsVar, list, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i11) {
        return new zzj[i11];
    }
}
