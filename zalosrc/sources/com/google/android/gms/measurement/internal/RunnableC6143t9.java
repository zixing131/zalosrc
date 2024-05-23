package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC5434j1;

/* renamed from: com.google.android.gms.measurement.internal.t9 */
/* loaded from: classes2.dex */
final class RunnableC6143t9 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ InterfaceC5434j1 f34499p;

    /* renamed from: q */
    final /* synthetic */ AppMeasurementDynamiteService f34500q;

    public RunnableC6143t9(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC5434j1 interfaceC5434j1) {
        this.f34500q = appMeasurementDynamiteService;
        this.f34499p = interfaceC5434j1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f34500q.f33752p.m31381N().m31319E(this.f34499p, this.f34500q.f33752p.m31393m());
    }
}
