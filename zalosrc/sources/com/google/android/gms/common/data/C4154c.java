package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.data.c */
/* loaded from: classes2.dex */
public final class C4154c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        String[] strArr = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundle = null;
        int i11 = 0;
        int i12 = 0;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            int m19789v = SafeParcelReader.m19789v(m19755D);
            if (m19789v != 1) {
                if (m19789v != 2) {
                    if (m19789v != 3) {
                        if (m19789v != 4) {
                            if (m19789v != 1000) {
                                SafeParcelReader.m19764M(parcel, m19755D);
                            } else {
                                i11 = SafeParcelReader.m19757F(parcel, m19755D);
                            }
                        } else {
                            bundle = SafeParcelReader.m19773f(parcel, m19755D);
                        }
                    } else {
                        i12 = SafeParcelReader.m19757F(parcel, m19755D);
                    }
                } else {
                    cursorWindowArr = (CursorWindow[]) SafeParcelReader.m19786s(parcel, m19755D, CursorWindow.CREATOR);
                }
            } else {
                strArr = SafeParcelReader.m19784q(parcel, m19755D);
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        DataHolder dataHolder = new DataHolder(i11, strArr, cursorWindowArr, i12, bundle);
        dataHolder.m19592J();
        return dataHolder;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new DataHolder[i11];
    }
}
