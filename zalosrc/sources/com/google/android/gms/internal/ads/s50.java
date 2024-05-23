package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class s50 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        String str = null;
        byte[] bArr = null;
        String[] strArr = null;
        String[] strArr2 = null;
        long j11 = 0;
        boolean z11 = false;
        int i11 = 0;
        boolean z12 = false;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            switch (SafeParcelReader.m19789v(m19755D)) {
                case 1:
                    z11 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 2:
                    str = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 3:
                    i11 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 4:
                    bArr = SafeParcelReader.m19774g(parcel, m19755D);
                    break;
                case 5:
                    strArr = SafeParcelReader.m19784q(parcel, m19755D);
                    break;
                case 6:
                    strArr2 = SafeParcelReader.m19784q(parcel, m19755D);
                    break;
                case 7:
                    z12 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 8:
                    j11 = SafeParcelReader.m19760I(parcel, m19755D);
                    break;
                default:
                    SafeParcelReader.m19764M(parcel, m19755D);
                    break;
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new zzbrf(z11, str, i11, bArr, strArr, strArr2, z12, j11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzbrf[i11];
    }
}
