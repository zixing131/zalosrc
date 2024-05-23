package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Intent intent = null;
        IBinder iBinder = null;
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
                    intent = (Intent) SafeParcelReader.m19782o(parcel, m19755D, Intent.CREATOR);
                    break;
                case 10:
                    iBinder = SafeParcelReader.m19756E(parcel, m19755D);
                    break;
                case 11:
                    z11 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                default:
                    SafeParcelReader.m19764M(parcel, m19755D);
                    break;
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new zzc(str, str2, str3, str4, str5, str6, str7, intent, iBinder, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzc[i11];
    }
}
