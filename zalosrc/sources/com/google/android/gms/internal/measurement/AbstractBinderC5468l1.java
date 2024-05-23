package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.l1 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC5468l1 extends AbstractBinderC5535p0 implements InterfaceC5485m1 {
    public AbstractBinderC5468l1() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC5535p0
    /* renamed from: E */
    protected final boolean mo29114E(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 != 1) {
            if (i11 != 2) {
                return false;
            }
            int zzd = zzd();
            parcel2.writeNoException();
            parcel2.writeInt(zzd);
        } else {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Bundle bundle = (Bundle) AbstractC5552q0.m29542a(parcel, Bundle.CREATOR);
            long readLong = parcel.readLong();
            AbstractC5552q0.m29544c(parcel);
            mo29330T(readString, readString2, bundle, readLong);
            parcel2.writeNoException();
        }
        return true;
    }
}
