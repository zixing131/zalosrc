package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.PinConfig;

/* renamed from: com.google.android.gms.maps.model.j */
/* loaded from: classes2.dex */
public final class C5913j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        PinConfig.Glyph glyph = null;
        int i11 = 0;
        int i12 = 0;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            int m19789v = SafeParcelReader.m19789v(m19755D);
            if (m19789v != 2) {
                if (m19789v != 3) {
                    if (m19789v != 4) {
                        SafeParcelReader.m19764M(parcel, m19755D);
                    } else {
                        glyph = (PinConfig.Glyph) SafeParcelReader.m19782o(parcel, m19755D, PinConfig.Glyph.CREATOR);
                    }
                } else {
                    i12 = SafeParcelReader.m19757F(parcel, m19755D);
                }
            } else {
                i11 = SafeParcelReader.m19757F(parcel, m19755D);
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new PinConfig(i11, i12, glyph);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new PinConfig[i11];
    }
}
