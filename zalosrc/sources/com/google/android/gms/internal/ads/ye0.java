package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes2.dex */
public abstract class ye0 extends AbstractBinderC4833og implements ze0 {
    public ye0() {
        super("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 == 1) {
            zzb();
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
