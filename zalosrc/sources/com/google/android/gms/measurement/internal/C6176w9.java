package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.zing.zalo.zinstant.zom.node.ZOM;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.measurement.internal.w9 */
/* loaded from: classes.dex */
public final class C6176w9 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        ArrayList arrayList = null;
        String str8 = null;
        String str9 = null;
        String str10 = "";
        String str11 = str10;
        long j17 = -2147483648L;
        boolean z11 = true;
        boolean z12 = false;
        int i11 = 0;
        boolean z13 = true;
        boolean z14 = false;
        boolean z15 = false;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            switch (SafeParcelReader.m19789v(m19755D)) {
                case 2:
                    str = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 3:
                    str2 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 4:
                    str3 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 5:
                    str4 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 6:
                    j11 = SafeParcelReader.m19760I(parcel, m19755D);
                    break;
                case 7:
                    j12 = SafeParcelReader.m19760I(parcel, m19755D);
                    break;
                case 8:
                    str5 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 9:
                    z11 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 10:
                    z12 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 11:
                    j17 = SafeParcelReader.m19760I(parcel, m19755D);
                    break;
                case 12:
                    str6 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 13:
                    j13 = SafeParcelReader.m19760I(parcel, m19755D);
                    break;
                case 14:
                    j14 = SafeParcelReader.m19760I(parcel, m19755D);
                    break;
                case 15:
                    i11 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                    z13 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 17:
                case 20:
                default:
                    SafeParcelReader.m19764M(parcel, m19755D);
                    break;
                case 18:
                    z14 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 19:
                    str7 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 21:
                    bool = SafeParcelReader.m19791x(parcel, m19755D);
                    break;
                case 22:
                    j15 = SafeParcelReader.m19760I(parcel, m19755D);
                    break;
                case 23:
                    arrayList = SafeParcelReader.m19785r(parcel, m19755D);
                    break;
                case 24:
                    str8 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 25:
                    str10 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 26:
                    str11 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 27:
                    str9 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 28:
                    z15 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 29:
                    j16 = SafeParcelReader.m19760I(parcel, m19755D);
                    break;
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new zzq(str, str2, str3, str4, j11, j12, str5, z11, z12, j17, str6, j13, j14, i11, z13, z14, str7, bool, j15, arrayList, str8, str10, str11, str9, z15, j16);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzq[i11];
    }
}
