package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.HashSet;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.d */
/* loaded from: classes2.dex */
public final class C4023d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
        byte[] bArr = null;
        PendingIntent pendingIntent = null;
        DeviceMetaData deviceMetaData = null;
        int i11 = 0;
        int i12 = 0;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            switch (SafeParcelReader.m19789v(m19755D)) {
                case 1:
                    i11 = SafeParcelReader.m19757F(parcel, m19755D);
                    hashSet.add(1);
                    break;
                case 2:
                    str = SafeParcelReader.m19783p(parcel, m19755D);
                    hashSet.add(2);
                    break;
                case 3:
                    i12 = SafeParcelReader.m19757F(parcel, m19755D);
                    hashSet.add(3);
                    break;
                case 4:
                    bArr = SafeParcelReader.m19774g(parcel, m19755D);
                    hashSet.add(4);
                    break;
                case 5:
                    pendingIntent = (PendingIntent) SafeParcelReader.m19782o(parcel, m19755D, PendingIntent.CREATOR);
                    hashSet.add(5);
                    break;
                case 6:
                    deviceMetaData = (DeviceMetaData) SafeParcelReader.m19782o(parcel, m19755D, DeviceMetaData.CREATOR);
                    hashSet.add(6);
                    break;
                default:
                    SafeParcelReader.m19764M(parcel, m19755D);
                    break;
            }
        }
        if (parcel.dataPosition() == m19765N) {
            return new zzt(hashSet, i11, str, i12, bArr, pendingIntent, deviceMetaData);
        }
        StringBuilder sb2 = new StringBuilder(37);
        sb2.append("Overread allowed size end=");
        sb2.append(m19765N);
        throw new SafeParcelReader.ParseException(sb2.toString(), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzt[i11];
    }
}
