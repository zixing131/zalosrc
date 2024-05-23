package com.google.android.gms.measurement.internal;

import p230i6.InterfaceC20314f;

/* renamed from: com.google.android.gms.measurement.internal.a8 */
/* loaded from: classes2.dex */
final class RunnableC5930a8 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ InterfaceC20314f f33771p;

    /* renamed from: q */
    final /* synthetic */ ServiceConnectionC5966d8 f33772q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5930a8(ServiceConnectionC5966d8 serviceConnectionC5966d8, InterfaceC20314f interfaceC20314f) {
        this.f33772q = serviceConnectionC5966d8;
        this.f33771p = interfaceC20314f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f33772q) {
            try {
                this.f33772q.f33863p = false;
                if (!this.f33772q.f33865r.m30892z()) {
                    this.f33772q.f33865r.f34158a.mo31033c().m31196p().m31108a("Connected to remote service");
                    this.f33772q.f33865r.m30890x(this.f33771p);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
