package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* renamed from: com.google.android.gms.measurement.internal.z7 */
/* loaded from: classes2.dex */
final class RunnableC6207z7 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ ComponentName f34657p;

    /* renamed from: q */
    final /* synthetic */ ServiceConnectionC5966d8 f34658q;

    public RunnableC6207z7(ServiceConnectionC5966d8 serviceConnectionC5966d8, ComponentName componentName) {
        this.f34658q = serviceConnectionC5966d8;
        this.f34657p = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5977e8.m30867M(this.f34658q.f33865r, this.f34657p);
    }
}
