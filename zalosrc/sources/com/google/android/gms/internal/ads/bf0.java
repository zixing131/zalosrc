package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzdo;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class bf0 implements Parcelable.Creator {
    /* renamed from: a */
    public static final zzcao m20499a(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        Bundle bundle = null;
        zzl zzlVar = null;
        zzq zzqVar = null;
        String str = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        zzcgv zzcgvVar = null;
        Bundle bundle2 = null;
        ArrayList arrayList = null;
        Bundle bundle3 = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList2 = null;
        String str7 = null;
        zzbls zzblsVar = null;
        ArrayList arrayList3 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Bundle bundle4 = null;
        String str11 = null;
        zzdo zzdoVar = null;
        Bundle bundle5 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        ArrayList arrayList4 = null;
        String str15 = null;
        ArrayList arrayList5 = null;
        ArrayList arrayList6 = null;
        String str16 = null;
        zzbsc zzbscVar = null;
        String str17 = null;
        Bundle bundle6 = null;
        long j11 = 0;
        long j12 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z11 = false;
        int i13 = 0;
        int i14 = 0;
        float f11 = 0.0f;
        float f12 = 0.0f;
        boolean z12 = false;
        int i15 = 0;
        int i16 = 0;
        boolean z13 = false;
        boolean z14 = false;
        int i17 = 0;
        boolean z15 = false;
        boolean z16 = false;
        int i18 = 0;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            switch (SafeParcelReader.m19789v(m19755D)) {
                case 1:
                    i11 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 2:
                    bundle = SafeParcelReader.m19773f(parcel, m19755D);
                    break;
                case 3:
                    zzlVar = (zzl) SafeParcelReader.m19782o(parcel, m19755D, zzl.CREATOR);
                    break;
                case 4:
                    zzqVar = (zzq) SafeParcelReader.m19782o(parcel, m19755D, zzq.CREATOR);
                    break;
                case 5:
                    str = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) SafeParcelReader.m19782o(parcel, m19755D, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) SafeParcelReader.m19782o(parcel, m19755D, PackageInfo.CREATOR);
                    break;
                case 8:
                    str2 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 9:
                    str3 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 10:
                    str4 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 11:
                    zzcgvVar = (zzcgv) SafeParcelReader.m19782o(parcel, m19755D, zzcgv.CREATOR);
                    break;
                case 12:
                    bundle2 = SafeParcelReader.m19773f(parcel, m19755D);
                    break;
                case 13:
                    i12 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 14:
                    arrayList = SafeParcelReader.m19785r(parcel, m19755D);
                    break;
                case 15:
                    bundle3 = SafeParcelReader.m19773f(parcel, m19755D);
                    break;
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                    z11 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 17:
                case 22:
                case 23:
                case 24:
                case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                case 38:
                case 62:
                default:
                    SafeParcelReader.m19764M(parcel, m19755D);
                    break;
                case 18:
                    i13 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 19:
                    i14 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 20:
                    f11 = SafeParcelReader.m19753B(parcel, m19755D);
                    break;
                case 21:
                    str5 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 25:
                    j11 = SafeParcelReader.m19760I(parcel, m19755D);
                    break;
                case 26:
                    str6 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 27:
                    arrayList2 = SafeParcelReader.m19785r(parcel, m19755D);
                    break;
                case 28:
                    str7 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 29:
                    zzblsVar = (zzbls) SafeParcelReader.m19782o(parcel, m19755D, zzbls.CREATOR);
                    break;
                case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                    arrayList3 = SafeParcelReader.m19785r(parcel, m19755D);
                    break;
                case 31:
                    j12 = SafeParcelReader.m19760I(parcel, m19755D);
                    break;
                case 33:
                    str8 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 34:
                    f12 = SafeParcelReader.m19753B(parcel, m19755D);
                    break;
                case 35:
                    i15 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 36:
                    i16 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 37:
                    z13 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 39:
                    str9 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 40:
                    z12 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_41 /* 41 */:
                    str10 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 42:
                    z14 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 43:
                    i17 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case ZVideoUtilMetadata.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                    bundle4 = SafeParcelReader.m19773f(parcel, m19755D);
                    break;
                case 45:
                    str11 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 46:
                    zzdoVar = (zzdo) SafeParcelReader.m19782o(parcel, m19755D, zzdo.CREATOR);
                    break;
                case 47:
                    z15 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 48:
                    bundle5 = SafeParcelReader.m19773f(parcel, m19755D);
                    break;
                case 49:
                    str12 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 50:
                    str13 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 51:
                    str14 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 52:
                    z16 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 53:
                    arrayList4 = SafeParcelReader.m19778k(parcel, m19755D);
                    break;
                case 54:
                    str15 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 55:
                    arrayList5 = SafeParcelReader.m19785r(parcel, m19755D);
                    break;
                case 56:
                    i18 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 57:
                    z17 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 58:
                    z18 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 59:
                    z19 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 60:
                    arrayList6 = SafeParcelReader.m19785r(parcel, m19755D);
                    break;
                case 61:
                    str16 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 63:
                    zzbscVar = (zzbsc) SafeParcelReader.m19782o(parcel, m19755D, zzbsc.CREATOR);
                    break;
                case 64:
                    str17 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 65:
                    bundle6 = SafeParcelReader.m19773f(parcel, m19755D);
                    break;
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new zzcao(i11, bundle, zzlVar, zzqVar, str, applicationInfo, packageInfo, str2, str3, str4, zzcgvVar, bundle2, i12, arrayList, bundle3, z11, i13, i14, f11, str5, j11, str6, arrayList2, str7, zzblsVar, arrayList3, j12, str8, f12, z12, i15, i16, z13, str9, str10, z14, i17, bundle4, str11, zzdoVar, z15, bundle5, str12, str13, str14, z16, arrayList4, str15, arrayList5, i18, z17, z18, z19, arrayList6, str16, zzbscVar, str17, bundle6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m20499a(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzcao[i11];
    }
}
