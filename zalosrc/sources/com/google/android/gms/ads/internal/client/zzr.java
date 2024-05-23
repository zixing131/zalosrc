package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.zing.zalo.zinstant.zom.node.ZOM;

/* loaded from: classes2.dex */
public final class zzr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        String str = null;
        zzq[] zzqVarArr = null;
        int i11 = 0;
        int i12 = 0;
        boolean z11 = false;
        int i13 = 0;
        int i14 = 0;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            switch (SafeParcelReader.m19789v(m19755D)) {
                case 2:
                    str = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 3:
                    i11 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 4:
                    i12 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 5:
                    z11 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 6:
                    i13 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 7:
                    i14 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 8:
                    zzqVarArr = (zzq[]) SafeParcelReader.m19786s(parcel, m19755D, zzq.CREATOR);
                    break;
                case 9:
                    z12 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 10:
                    z13 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 11:
                    z14 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 12:
                    z15 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 13:
                    z16 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 14:
                    z17 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 15:
                    z18 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                    z19 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                default:
                    SafeParcelReader.m19764M(parcel, m19755D);
                    break;
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new zzq(str, i11, i12, z11, i13, i14, zzqVarArr, z12, z13, z14, z15, z16, z17, z18, z19);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzq[i11];
    }
}
