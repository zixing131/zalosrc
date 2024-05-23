package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.zing.zalo.zinstant.zom.node.ZOM;

/* renamed from: com.google.android.gms.maps.model.i */
/* loaded from: classes2.dex */
public final class C5912i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        String str3 = null;
        float f11 = 0.0f;
        float f12 = 0.0f;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        float f13 = 0.0f;
        float f14 = 0.5f;
        float f15 = 0.0f;
        float f16 = 1.0f;
        float f17 = 0.0f;
        int i11 = 0;
        int i12 = 0;
        float f18 = 0.0f;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            switch (SafeParcelReader.m19789v(m19755D)) {
                case 2:
                    latLng = (LatLng) SafeParcelReader.m19782o(parcel, m19755D, LatLng.CREATOR);
                    break;
                case 3:
                    str = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 4:
                    str2 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 5:
                    iBinder = SafeParcelReader.m19756E(parcel, m19755D);
                    break;
                case 6:
                    f11 = SafeParcelReader.m19753B(parcel, m19755D);
                    break;
                case 7:
                    f12 = SafeParcelReader.m19753B(parcel, m19755D);
                    break;
                case 8:
                    z11 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 9:
                    z12 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 10:
                    z13 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 11:
                    f13 = SafeParcelReader.m19753B(parcel, m19755D);
                    break;
                case 12:
                    f14 = SafeParcelReader.m19753B(parcel, m19755D);
                    break;
                case 13:
                    f15 = SafeParcelReader.m19753B(parcel, m19755D);
                    break;
                case 14:
                    f16 = SafeParcelReader.m19753B(parcel, m19755D);
                    break;
                case 15:
                    f17 = SafeParcelReader.m19753B(parcel, m19755D);
                    break;
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                default:
                    SafeParcelReader.m19764M(parcel, m19755D);
                    break;
                case 17:
                    i11 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 18:
                    iBinder2 = SafeParcelReader.m19756E(parcel, m19755D);
                    break;
                case 19:
                    i12 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 20:
                    str3 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 21:
                    f18 = SafeParcelReader.m19753B(parcel, m19755D);
                    break;
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new MarkerOptions(latLng, str, str2, iBinder, f11, f12, z11, z12, z13, f13, f14, f15, f16, f17, i11, iBinder2, i12, str3, f18);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new MarkerOptions[i11];
    }
}
