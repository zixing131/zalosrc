package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.internal.k1 */
/* loaded from: classes2.dex */
public final class C4195k1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        RootTelemetryConfiguration rootTelemetryConfiguration = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z11 = false;
        boolean z12 = false;
        int i11 = 0;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            switch (SafeParcelReader.m19789v(m19755D)) {
                case 1:
                    rootTelemetryConfiguration = (RootTelemetryConfiguration) SafeParcelReader.m19782o(parcel, m19755D, RootTelemetryConfiguration.CREATOR);
                    break;
                case 2:
                    z11 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 3:
                    z12 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 4:
                    iArr = SafeParcelReader.m19777j(parcel, m19755D);
                    break;
                case 5:
                    i11 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 6:
                    iArr2 = SafeParcelReader.m19777j(parcel, m19755D);
                    break;
                default:
                    SafeParcelReader.m19764M(parcel, m19755D);
                    break;
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, z11, z12, iArr, i11, iArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new ConnectionTelemetryConfiguration[i11];
    }
}
