package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC5434j1;

/* renamed from: com.google.android.gms.measurement.internal.s9 */
/* loaded from: classes2.dex */
final class RunnableC6132s9 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ InterfaceC5434j1 f34476p;

    /* renamed from: q */
    final /* synthetic */ String f34477q;

    /* renamed from: r */
    final /* synthetic */ String f34478r;

    /* renamed from: s */
    final /* synthetic */ AppMeasurementDynamiteService f34479s;

    public RunnableC6132s9(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC5434j1 interfaceC5434j1, String str, String str2) {
        this.f34479s = appMeasurementDynamiteService;
        this.f34476p = interfaceC5434j1;
        this.f34477q = str;
        this.f34478r = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f34479s.f33752p.m31379L().m30877T(this.f34476p, this.f34477q, this.f34478r);
    }
}
