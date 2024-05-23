package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC5434j1;

/* renamed from: com.google.android.gms.measurement.internal.h8 */
/* loaded from: classes2.dex */
final class RunnableC6010h8 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ InterfaceC5434j1 f34065p;

    /* renamed from: q */
    final /* synthetic */ String f34066q;

    /* renamed from: r */
    final /* synthetic */ String f34067r;

    /* renamed from: s */
    final /* synthetic */ boolean f34068s;

    /* renamed from: t */
    final /* synthetic */ AppMeasurementDynamiteService f34069t;

    public RunnableC6010h8(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC5434j1 interfaceC5434j1, String str, String str2, boolean z11) {
        this.f34069t = appMeasurementDynamiteService;
        this.f34065p = interfaceC5434j1;
        this.f34066q = str;
        this.f34067r = str2;
        this.f34068s = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f34069t.f33752p.m31379L().m30879V(this.f34065p, this.f34066q, this.f34067r, this.f34068s);
    }
}
