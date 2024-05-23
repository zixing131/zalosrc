package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.zing.zalo.zinstant.zom.node.ZOM;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        long j11 = 0;
        Bundle bundle = null;
        ArrayList arrayList = null;
        String str = null;
        zzfb zzfbVar = null;
        Location location = null;
        String str2 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        String str4 = null;
        zzc zzcVar = null;
        String str5 = null;
        ArrayList arrayList3 = null;
        String str6 = null;
        int i11 = 0;
        int i12 = 0;
        boolean z11 = false;
        int i13 = 0;
        boolean z12 = false;
        boolean z13 = false;
        int i14 = 0;
        int i15 = 0;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            switch (SafeParcelReader.m19789v(m19755D)) {
                case 1:
                    i11 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 2:
                    j11 = SafeParcelReader.m19760I(parcel, m19755D);
                    break;
                case 3:
                    bundle = SafeParcelReader.m19773f(parcel, m19755D);
                    break;
                case 4:
                    i12 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 5:
                    arrayList = SafeParcelReader.m19785r(parcel, m19755D);
                    break;
                case 6:
                    z11 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 7:
                    i13 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 8:
                    z12 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 9:
                    str = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 10:
                    zzfbVar = (zzfb) SafeParcelReader.m19782o(parcel, m19755D, zzfb.CREATOR);
                    break;
                case 11:
                    location = (Location) SafeParcelReader.m19782o(parcel, m19755D, Location.CREATOR);
                    break;
                case 12:
                    str2 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 13:
                    bundle2 = SafeParcelReader.m19773f(parcel, m19755D);
                    break;
                case 14:
                    bundle3 = SafeParcelReader.m19773f(parcel, m19755D);
                    break;
                case 15:
                    arrayList2 = SafeParcelReader.m19785r(parcel, m19755D);
                    break;
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                    str3 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 17:
                    str4 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 18:
                    z13 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 19:
                    zzcVar = (zzc) SafeParcelReader.m19782o(parcel, m19755D, zzc.CREATOR);
                    break;
                case 20:
                    i14 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 21:
                    str5 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 22:
                    arrayList3 = SafeParcelReader.m19785r(parcel, m19755D);
                    break;
                case 23:
                    i15 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 24:
                    str6 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                default:
                    SafeParcelReader.m19764M(parcel, m19755D);
                    break;
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new zzl(i11, j11, bundle, i12, arrayList, z11, i13, z12, str, zzfbVar, location, str2, bundle2, bundle3, arrayList2, str3, str4, z13, zzcVar, i14, str5, arrayList3, i15, str6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzl[i11];
    }
}
