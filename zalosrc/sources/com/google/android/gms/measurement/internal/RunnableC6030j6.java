package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC5434j1;

/* renamed from: com.google.android.gms.measurement.internal.j6 */
/* loaded from: classes2.dex */
final class RunnableC6030j6 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ InterfaceC5434j1 f34107p;

    /* renamed from: q */
    final /* synthetic */ AppMeasurementDynamiteService f34108q;

    public RunnableC6030j6(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC5434j1 interfaceC5434j1) {
        this.f34108q = appMeasurementDynamiteService;
        this.f34107p = interfaceC5434j1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f34108q.f33752p.m31379L().m30875R(this.f34107p);
    }
}
