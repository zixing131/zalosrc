package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.zing.zalo.zinstant.zom.node.ZOM;

/* renamed from: com.google.android.gms.identity.intents.model.a */
/* loaded from: classes2.dex */
public final class C4298a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        boolean z11 = false;
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
                    str5 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 7:
                    str6 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 8:
                    str7 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 9:
                    str8 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 10:
                    str9 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 11:
                    str10 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 12:
                    str11 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 13:
                    str12 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 14:
                    z11 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 15:
                    str13 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                    str14 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                default:
                    SafeParcelReader.m19764M(parcel, m19755D);
                    break;
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new UserAddress(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z11, str13, str14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new UserAddress[i11];
    }
}
