package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import com.zing.zalo.zinstant.zom.node.ZOM;

/* renamed from: com.google.android.gms.maps.a */
/* loaded from: classes2.dex */
public final class C5893a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        CameraPosition cameraPosition = null;
        Float f11 = null;
        Float f12 = null;
        LatLngBounds latLngBounds = null;
        Integer num = null;
        String str = null;
        byte b11 = -1;
        byte b12 = -1;
        int i11 = 0;
        byte b13 = -1;
        byte b14 = -1;
        byte b15 = -1;
        byte b16 = -1;
        byte b17 = -1;
        byte b18 = -1;
        byte b19 = -1;
        byte b21 = -1;
        byte b22 = -1;
        byte b23 = -1;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            switch (SafeParcelReader.m19789v(m19755D)) {
                case 2:
                    b11 = SafeParcelReader.m19792y(parcel, m19755D);
                    break;
                case 3:
                    b12 = SafeParcelReader.m19792y(parcel, m19755D);
                    break;
                case 4:
                    i11 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) SafeParcelReader.m19782o(parcel, m19755D, CameraPosition.CREATOR);
                    break;
                case 6:
                    b13 = SafeParcelReader.m19792y(parcel, m19755D);
                    break;
                case 7:
                    b14 = SafeParcelReader.m19792y(parcel, m19755D);
                    break;
                case 8:
                    b15 = SafeParcelReader.m19792y(parcel, m19755D);
                    break;
                case 9:
                    b16 = SafeParcelReader.m19792y(parcel, m19755D);
                    break;
                case 10:
                    b17 = SafeParcelReader.m19792y(parcel, m19755D);
                    break;
                case 11:
                    b18 = SafeParcelReader.m19792y(parcel, m19755D);
                    break;
                case 12:
                    b19 = SafeParcelReader.m19792y(parcel, m19755D);
                    break;
                case 13:
                default:
                    SafeParcelReader.m19764M(parcel, m19755D);
                    break;
                case 14:
                    b21 = SafeParcelReader.m19792y(parcel, m19755D);
                    break;
                case 15:
                    b22 = SafeParcelReader.m19792y(parcel, m19755D);
                    break;
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                    f11 = SafeParcelReader.m19754C(parcel, m19755D);
                    break;
                case 17:
                    f12 = SafeParcelReader.m19754C(parcel, m19755D);
                    break;
                case 18:
                    latLngBounds = (LatLngBounds) SafeParcelReader.m19782o(parcel, m19755D, LatLngBounds.CREATOR);
                    break;
                case 19:
                    b23 = SafeParcelReader.m19792y(parcel, m19755D);
                    break;
                case 20:
                    num = SafeParcelReader.m19758G(parcel, m19755D);
                    break;
                case 21:
                    str = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new GoogleMapOptions(b11, b12, i11, cameraPosition, b13, b14, b15, b16, b17, b18, b19, b21, b22, f11, f12, latLngBounds, b23, num, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new GoogleMapOptions[i11];
    }
}
