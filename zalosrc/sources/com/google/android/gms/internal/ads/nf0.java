package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class nf0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        Bundle bundle = null;
        zzcgv zzcgvVar = null;
        ApplicationInfo applicationInfo = null;
        String str = null;
        ArrayList arrayList = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        zzffx zzffxVar = null;
        String str4 = null;
        boolean z11 = false;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            switch (SafeParcelReader.m19789v(m19755D)) {
                case 1:
                    bundle = SafeParcelReader.m19773f(parcel, m19755D);
                    break;
                case 2:
                    zzcgvVar = (zzcgv) SafeParcelReader.m19782o(parcel, m19755D, zzcgv.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) SafeParcelReader.m19782o(parcel, m19755D, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    str = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 5:
                    arrayList = SafeParcelReader.m19785r(parcel, m19755D);
                    break;
                case 6:
                    packageInfo = (PackageInfo) SafeParcelReader.m19782o(parcel, m19755D, PackageInfo.CREATOR);
                    break;
                case 7:
                    str2 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 8:
                default:
                    SafeParcelReader.m19764M(parcel, m19755D);
                    break;
                case 9:
                    str3 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 10:
                    zzffxVar = (zzffx) SafeParcelReader.m19782o(parcel, m19755D, zzffx.CREATOR);
                    break;
                case 11:
                    str4 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 12:
                    z11 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new zzcbc(bundle, zzcgvVar, applicationInfo, str, arrayList, packageInfo, str2, str3, zzffxVar, str4, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzcbc[i11];
    }
}
