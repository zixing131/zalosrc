package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: com.google.android.gms.measurement.internal.b8 */
/* loaded from: classes2.dex */
final class RunnableC5942b8 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ ServiceConnectionC5966d8 f33795p;

    public RunnableC5942b8(ServiceConnectionC5966d8 serviceConnectionC5966d8) {
        this.f33795p = serviceConnectionC5966d8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5977e8 c5977e8 = this.f33795p.f33865r;
        Context mo31032b = c5977e8.f34158a.mo31032b();
        this.f33795p.f33865r.f34158a.mo31035f();
        C5977e8.m30867M(c5977e8, new ComponentName(mo31032b, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
