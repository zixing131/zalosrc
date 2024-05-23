package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC5485m1;
import p230i6.InterfaceC20329u;

/* renamed from: com.google.android.gms.measurement.internal.v9 */
/* loaded from: classes.dex */
final class C6165v9 implements InterfaceC20329u {

    /* renamed from: a */
    public final InterfaceC5485m1 f34543a;

    /* renamed from: b */
    final /* synthetic */ AppMeasurementDynamiteService f34544b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6165v9(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC5485m1 interfaceC5485m1) {
        this.f34544b = appMeasurementDynamiteService;
        this.f34543a = interfaceC5485m1;
    }

    @Override // p230i6.InterfaceC20329u
    /* renamed from: a */
    public final void mo31470a(String str, String str2, Bundle bundle, long j11) {
        try {
            this.f34543a.mo29330T(str, str2, bundle, j11);
        } catch (RemoteException e11) {
            C6127s4 c6127s4 = this.f34544b.f33752p;
            if (c6127s4 != null) {
                c6127s4.mo31033c().m31202w().m31109b("Event listener threw exception", e11);
            }
        }
    }
}
