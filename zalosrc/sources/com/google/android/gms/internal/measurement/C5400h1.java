package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.h1 */
/* loaded from: classes2.dex */
public final class C5400h1 extends AbstractC5518o0 implements InterfaceC5434j1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C5400h1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5434j1
    /* renamed from: J */
    public final void mo28962J(Bundle bundle) {
        Parcel m29469E = m29469E();
        AbstractC5552q0.m29545d(m29469E, bundle);
        m29471Q(1, m29469E);
    }
}
