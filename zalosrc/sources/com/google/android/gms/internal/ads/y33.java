package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes2.dex */
public abstract class y33 extends AbstractBinderC4833og implements z33 {
    public y33() {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 == 1) {
            Bundle bundle = (Bundle) AbstractC4871pg.m25454a(parcel, Bundle.CREATOR);
            AbstractC4871pg.m25456c(parcel);
            mo24452w(bundle);
            return true;
        }
        return false;
    }
}
