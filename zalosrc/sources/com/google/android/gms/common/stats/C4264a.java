package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.zing.zalo.zinstant.zom.node.ZOM;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.stats.a */
/* loaded from: classes2.dex */
public final class C4264a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        String str = null;
        ArrayList arrayList = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        float f11 = 0.0f;
        boolean z11 = false;
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
                case 7:
                case 9:
                default:
                    SafeParcelReader.m19764M(parcel, m19755D);
                    break;
                case 4:
                    str = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 5:
                    i13 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 6:
                    arrayList = SafeParcelReader.m19785r(parcel, m19755D);
                    break;
                case 8:
                    j12 = SafeParcelReader.m19760I(parcel, m19755D);
                    break;
                case 10:
                    str3 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 11:
                    i12 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 12:
                    str2 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 13:
                    str4 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 14:
                    i14 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 15:
                    f11 = SafeParcelReader.m19753B(parcel, m19755D);
                    break;
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                    j13 = SafeParcelReader.m19760I(parcel, m19755D);
                    break;
                case 17:
                    str5 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 18:
                    z11 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new WakeLockEvent(i11, j11, i12, str, i13, arrayList, str2, j12, i14, str3, str4, f11, j13, str5, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new WakeLockEvent[i11];
    }
}
