package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.location.f */
/* loaded from: classes2.dex */
public final class C5885f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        ArrayList arrayList = null;
        zzbj zzbjVar = null;
        boolean z11 = false;
        boolean z12 = false;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            int m19789v = SafeParcelReader.m19789v(m19755D);
            if (m19789v != 1) {
                if (m19789v != 2) {
                    if (m19789v != 3) {
                        if (m19789v != 5) {
                            SafeParcelReader.m19764M(parcel, m19755D);
                        } else {
                            zzbjVar = (zzbj) SafeParcelReader.m19782o(parcel, m19755D, zzbj.CREATOR);
                        }
                    } else {
                        z12 = SafeParcelReader.m19790w(parcel, m19755D);
                    }
                } else {
                    z11 = SafeParcelReader.m19790w(parcel, m19755D);
                }
            } else {
                arrayList = SafeParcelReader.m19787t(parcel, m19755D, LocationRequest.CREATOR);
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new LocationSettingsRequest(arrayList, z11, z12, zzbjVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i11) {
        return new LocationSettingsRequest[i11];
    }
}
