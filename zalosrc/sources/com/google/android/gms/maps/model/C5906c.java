package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.maps.model.c */
/* loaded from: classes2.dex */
public final class C5906c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        IBinder iBinder = null;
        boolean z11 = false;
        float f11 = 0.0f;
        boolean z12 = true;
        float f12 = 0.0f;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            int m19789v = SafeParcelReader.m19789v(m19755D);
            if (m19789v != 2) {
                if (m19789v != 3) {
                    if (m19789v != 4) {
                        if (m19789v != 5) {
                            if (m19789v != 6) {
                                SafeParcelReader.m19764M(parcel, m19755D);
                            } else {
                                f12 = SafeParcelReader.m19753B(parcel, m19755D);
                            }
                        } else {
                            z12 = SafeParcelReader.m19790w(parcel, m19755D);
                        }
                    } else {
                        f11 = SafeParcelReader.m19753B(parcel, m19755D);
                    }
                } else {
                    z11 = SafeParcelReader.m19790w(parcel, m19755D);
                }
            } else {
                iBinder = SafeParcelReader.m19756E(parcel, m19755D);
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new TileOverlayOptions(iBinder, z11, f11, z12, f12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new TileOverlayOptions[i11];
    }
}
