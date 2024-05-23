package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.h6 */
/* loaded from: classes2.dex */
public final class RunnableC6008h6 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ AtomicReference f34059p;

    /* renamed from: q */
    final /* synthetic */ C6129s6 f34060q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6008h6(C6129s6 c6129s6, AtomicReference atomicReference) {
        this.f34060q = c6129s6;
        this.f34059p = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f34059p) {
            try {
                try {
                    this.f34059p.set(this.f34060q.f34158a.m31401z().m30933x(this.f34060q.f34158a.m31370B().m30941r(), AbstractC5972e3.f33894N));
                } finally {
                    this.f34059p.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
