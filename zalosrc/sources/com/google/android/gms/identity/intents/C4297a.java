package com.google.android.gms.identity.intents;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.identity.intents.model.CountrySpecification;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.identity.intents.a */
/* loaded from: classes2.dex */
public final class C4297a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            if (SafeParcelReader.m19789v(m19755D) != 2) {
                SafeParcelReader.m19764M(parcel, m19755D);
            } else {
                arrayList = SafeParcelReader.m19787t(parcel, m19755D, CountrySpecification.CREATOR);
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new UserAddressRequest(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new UserAddressRequest[i11];
    }
}