package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.ads.zzcgv;
import com.zing.zalo.zinstant.zom.node.ZOM;

/* loaded from: classes2.dex */
public final class zzn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        zzc zzcVar = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        String str = null;
        String str2 = null;
        IBinder iBinder5 = null;
        String str3 = null;
        zzcgv zzcgvVar = null;
        String str4 = null;
        com.google.android.gms.ads.internal.zzj zzjVar = null;
        IBinder iBinder6 = null;
        String str5 = null;
        IBinder iBinder7 = null;
        IBinder iBinder8 = null;
        IBinder iBinder9 = null;
        IBinder iBinder10 = null;
        String str6 = null;
        String str7 = null;
        IBinder iBinder11 = null;
        IBinder iBinder12 = null;
        boolean z11 = false;
        int i11 = 0;
        int i12 = 0;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            switch (SafeParcelReader.m19789v(m19755D)) {
                case 2:
                    zzcVar = (zzc) SafeParcelReader.m19782o(parcel, m19755D, zzc.CREATOR);
                    break;
                case 3:
                    iBinder = SafeParcelReader.m19756E(parcel, m19755D);
                    break;
                case 4:
                    iBinder2 = SafeParcelReader.m19756E(parcel, m19755D);
                    break;
                case 5:
                    iBinder3 = SafeParcelReader.m19756E(parcel, m19755D);
                    break;
                case 6:
                    iBinder4 = SafeParcelReader.m19756E(parcel, m19755D);
                    break;
                case 7:
                    str = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 8:
                    z11 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 9:
                    str2 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 10:
                    iBinder5 = SafeParcelReader.m19756E(parcel, m19755D);
                    break;
                case 11:
                    i11 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 12:
                    i12 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 13:
                    str3 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 14:
                    zzcgvVar = (zzcgv) SafeParcelReader.m19782o(parcel, m19755D, zzcgv.CREATOR);
                    break;
                case 15:
                default:
                    SafeParcelReader.m19764M(parcel, m19755D);
                    break;
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                    str4 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 17:
                    zzjVar = (com.google.android.gms.ads.internal.zzj) SafeParcelReader.m19782o(parcel, m19755D, com.google.android.gms.ads.internal.zzj.CREATOR);
                    break;
                case 18:
                    iBinder6 = SafeParcelReader.m19756E(parcel, m19755D);
                    break;
                case 19:
                    str5 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 20:
                    iBinder7 = SafeParcelReader.m19756E(parcel, m19755D);
                    break;
                case 21:
                    iBinder8 = SafeParcelReader.m19756E(parcel, m19755D);
                    break;
                case 22:
                    iBinder9 = SafeParcelReader.m19756E(parcel, m19755D);
                    break;
                case 23:
                    iBinder10 = SafeParcelReader.m19756E(parcel, m19755D);
                    break;
                case 24:
                    str6 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 25:
                    str7 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 26:
                    iBinder11 = SafeParcelReader.m19756E(parcel, m19755D);
                    break;
                case 27:
                    iBinder12 = SafeParcelReader.m19756E(parcel, m19755D);
                    break;
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new AdOverlayInfoParcel(zzcVar, iBinder, iBinder2, iBinder3, iBinder4, str, z11, str2, iBinder5, i11, i12, str3, zzcgvVar, str4, zzjVar, iBinder6, str5, iBinder7, iBinder8, iBinder9, iBinder10, str6, str7, iBinder11, iBinder12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new AdOverlayInfoParcel[i11];
    }
}
