package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC5485m1;
import p230i6.InterfaceC20328t;

/* renamed from: com.google.android.gms.measurement.internal.u9 */
/* loaded from: classes2.dex */
public final class C6154u9 implements InterfaceC20328t {

    /* renamed from: a */
    public final InterfaceC5485m1 f34523a;

    /* renamed from: b */
    final /* synthetic */ AppMeasurementDynamiteService f34524b;

    public C6154u9(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC5485m1 interfaceC5485m1) {
        this.f34524b = appMeasurementDynamiteService;
        this.f34523a = interfaceC5485m1;
    }

    @Override // p230i6.InterfaceC20328t
    /* renamed from: a */
    public final void mo31466a(String str, String str2, Bundle bundle, long j11) {
        try {
            this.f34523a.mo29330T(str, str2, bundle, j11);
        } catch (RemoteException e11) {
            C6127s4 c6127s4 = this.f34524b.f33752p;
            if (c6127s4 != null) {
                c6127s4.mo31033c().m31202w().m31109b("Event interceptor threw exception", e11);
            }
        }
    }
}
