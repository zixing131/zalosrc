package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.location.l */
/* loaded from: classes2.dex */
public final class C5891l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        long j11 = 50;
        long j12 = Long.MAX_VALUE;
        boolean z11 = true;
        float f11 = 0.0f;
        int i11 = Integer.MAX_VALUE;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            int m19789v = SafeParcelReader.m19789v(m19755D);
            if (m19789v != 1) {
                if (m19789v != 2) {
                    if (m19789v != 3) {
                        if (m19789v != 4) {
                            if (m19789v != 5) {
                                SafeParcelReader.m19764M(parcel, m19755D);
                            } else {
                                i11 = SafeParcelReader.m19757F(parcel, m19755D);
                            }
                        } else {
                            j12 = SafeParcelReader.m19760I(parcel, m19755D);
                        }
                    } else {
                        f11 = SafeParcelReader.m19753B(parcel, m19755D);
                    }
                } else {
                    j11 = SafeParcelReader.m19760I(parcel, m19755D);
                }
            } else {
                z11 = SafeParcelReader.m19790w(parcel, m19755D);
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new zzs(z11, j11, f11, j12, i11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i11) {
        return new zzs[i11];
    }
}
