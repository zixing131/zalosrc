package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.c8 */
/* loaded from: classes2.dex */
final class RunnableC5954c8 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ ServiceConnectionC5966d8 f33838p;

    public RunnableC5954c8(ServiceConnectionC5966d8 serviceConnectionC5966d8) {
        this.f33838p = serviceConnectionC5966d8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f33838p.f33865r.f33980d = null;
        this.f33838p.f33865r.m30859D();
    }
}
