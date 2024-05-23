package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.d6 */
/* loaded from: classes2.dex */
public final class RunnableC5964d6 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ AtomicReference f33860p;

    /* renamed from: q */
    final /* synthetic */ C6129s6 f33861q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5964d6(C6129s6 c6129s6, AtomicReference atomicReference) {
        this.f33861q = c6129s6;
        this.f33860p = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f33860p) {
            try {
                try {
                    this.f33860p.set(Boolean.valueOf(this.f33861q.f34158a.m31401z().m30913B(this.f33861q.f34158a.m31370B().m30941r(), AbstractC5972e3.f33893M)));
                } finally {
                    this.f33860p.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
