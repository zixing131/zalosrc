package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.i1 */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC5417i1 extends AbstractBinderC5535p0 implements InterfaceC5434j1 {
    public AbstractBinderC5417i1() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC5535p0
    /* renamed from: E */
    protected final boolean mo29114E(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 == 1) {
            Bundle bundle = (Bundle) AbstractC5552q0.m29542a(parcel, Bundle.CREATOR);
            AbstractC5552q0.m29544c(parcel);
            mo28962J(bundle);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
