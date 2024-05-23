package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.h9 */
/* loaded from: classes2.dex */
final class RunnableC6011h9 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ C6154u9 f34070p;

    /* renamed from: q */
    final /* synthetic */ AppMeasurementDynamiteService f34071q;

    public RunnableC6011h9(AppMeasurementDynamiteService appMeasurementDynamiteService, C6154u9 c6154u9) {
        this.f34071q = appMeasurementDynamiteService;
        this.f34070p = c6154u9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f34071q.f33752p.m31376I().m31415H(this.f34070p);
    }
}
