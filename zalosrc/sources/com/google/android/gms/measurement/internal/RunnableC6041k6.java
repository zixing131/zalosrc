package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.k6 */
/* loaded from: classes2.dex */
public final class RunnableC6041k6 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ AtomicReference f34138p;

    /* renamed from: q */
    final /* synthetic */ C6129s6 f34139q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6041k6(C6129s6 c6129s6, AtomicReference atomicReference) {
        this.f34139q = c6129s6;
        this.f34138p = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f34138p) {
            try {
                try {
                    this.f34138p.set(Integer.valueOf(this.f34139q.f34158a.m31401z().m30924n(this.f34139q.f34158a.m31370B().m30941r(), AbstractC5972e3.f33896P)));
                } finally {
                    this.f34138p.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
