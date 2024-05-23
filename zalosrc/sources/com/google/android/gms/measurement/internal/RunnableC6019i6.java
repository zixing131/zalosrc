package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.i6 */
/* loaded from: classes2.dex */
public final class RunnableC6019i6 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ AtomicReference f34085p;

    /* renamed from: q */
    final /* synthetic */ C6129s6 f34086q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6019i6(C6129s6 c6129s6, AtomicReference atomicReference) {
        this.f34086q = c6129s6;
        this.f34085p = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f34085p) {
            try {
                try {
                    this.f34085p.set(Long.valueOf(this.f34086q.f34158a.m31401z().m30927q(this.f34086q.f34158a.m31370B().m30941r(), AbstractC5972e3.f33895O)));
                } finally {
                    this.f34085p.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
