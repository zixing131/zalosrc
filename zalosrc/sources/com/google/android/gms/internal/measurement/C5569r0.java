package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.r0 */
/* loaded from: classes2.dex */
public final class C5569r0 extends AbstractC5518o0 implements InterfaceC5603t0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C5569r0(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5603t0
    /* renamed from: v */
    public final Bundle mo29570v(Bundle bundle) {
        Parcel m29469E = m29469E();
        AbstractC5552q0.m29545d(m29469E, bundle);
        Parcel m29470N = m29470N(1, m29469E);
        Bundle bundle2 = (Bundle) AbstractC5552q0.m29542a(m29470N, Bundle.CREATOR);
        m29470N.recycle();
        return bundle2;
    }
}
