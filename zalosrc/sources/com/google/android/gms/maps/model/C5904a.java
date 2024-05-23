package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.maps.model.a */
/* loaded from: classes2.dex */
public final class C5904a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        StampStyle stampStyle = null;
        float f11 = 0.0f;
        int i11 = 0;
        int i12 = 0;
        boolean z11 = false;
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
                                stampStyle = (StampStyle) SafeParcelReader.m19782o(parcel, m19755D, StampStyle.CREATOR);
                            }
                        } else {
                            z11 = SafeParcelReader.m19790w(parcel, m19755D);
                        }
                    } else {
                        i12 = SafeParcelReader.m19757F(parcel, m19755D);
                    }
                } else {
                    i11 = SafeParcelReader.m19757F(parcel, m19755D);
                }
            } else {
                f11 = SafeParcelReader.m19753B(parcel, m19755D);
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new StrokeStyle(f11, i11, i12, z11, stampStyle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new StrokeStyle[i11];
    }
}
