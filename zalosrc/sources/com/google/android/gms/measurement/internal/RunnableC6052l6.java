package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.l6 */
/* loaded from: classes2.dex */
public final class RunnableC6052l6 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ AtomicReference f34159p;

    /* renamed from: q */
    final /* synthetic */ C6129s6 f34160q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6052l6(C6129s6 c6129s6, AtomicReference atomicReference) {
        this.f34160q = c6129s6;
        this.f34159p = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f34159p) {
            try {
                try {
                    this.f34159p.set(Double.valueOf(this.f34160q.f34158a.m31401z().m30920j(this.f34160q.f34158a.m31370B().m30941r(), AbstractC5972e3.f33897Q)));
                } finally {
                    this.f34159p.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
