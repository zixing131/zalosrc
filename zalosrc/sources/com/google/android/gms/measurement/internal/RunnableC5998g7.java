package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC5434j1;

/* renamed from: com.google.android.gms.measurement.internal.g7 */
/* loaded from: classes2.dex */
final class RunnableC5998g7 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ InterfaceC5434j1 f34034p;

    /* renamed from: q */
    final /* synthetic */ zzaw f34035q;

    /* renamed from: r */
    final /* synthetic */ String f34036r;

    /* renamed from: s */
    final /* synthetic */ AppMeasurementDynamiteService f34037s;

    public RunnableC5998g7(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC5434j1 interfaceC5434j1, zzaw zzawVar, String str) {
        this.f34037s = appMeasurementDynamiteService;
        this.f34034p = interfaceC5434j1;
        this.f34035q = zzawVar;
        this.f34036r = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f34037s.f33752p.m31379L().m30882o(this.f34034p, this.f34035q, this.f34036r);
    }
}
