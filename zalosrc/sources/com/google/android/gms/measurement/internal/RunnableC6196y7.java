package com.google.android.gms.measurement.internal;

import p230i6.InterfaceC20314f;

/* renamed from: com.google.android.gms.measurement.internal.y7 */
/* loaded from: classes.dex */
final class RunnableC6196y7 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ InterfaceC20314f f34626p;

    /* renamed from: q */
    final /* synthetic */ ServiceConnectionC5966d8 f34627q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6196y7(ServiceConnectionC5966d8 serviceConnectionC5966d8, InterfaceC20314f interfaceC20314f) {
        this.f34627q = serviceConnectionC5966d8;
        this.f34626p = interfaceC20314f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f34627q) {
            try {
                this.f34627q.f33863p = false;
                if (!this.f34627q.f33865r.m30892z()) {
                    this.f34627q.f33865r.f34158a.mo31033c().m31201u().m31108a("Connected to service");
                    this.f34627q.f33865r.m30890x(this.f34626p);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
