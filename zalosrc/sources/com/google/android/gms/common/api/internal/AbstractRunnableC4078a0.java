package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.a0 */
/* loaded from: classes2.dex */
abstract class AbstractRunnableC4078a0 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ C4081b0 f16235p;

    /* renamed from: a */
    protected abstract void mo19305a();

    @Override // java.lang.Runnable
    public final void run() {
        Lock lock;
        Lock lock2;
        C4105j0 c4105j0;
        Lock lock3;
        lock = this.f16235p.f16240b;
        lock.lock();
        try {
            try {
                if (Thread.interrupted()) {
                    lock3 = this.f16235p.f16240b;
                } else {
                    mo19305a();
                    lock3 = this.f16235p.f16240b;
                }
            } catch (RuntimeException e11) {
                c4105j0 = this.f16235p.f16239a;
                c4105j0.m19487n(e11);
                lock3 = this.f16235p.f16240b;
            }
            lock3.unlock();
        } catch (Throwable th2) {
            lock2 = this.f16235p.f16240b;
            lock2.unlock();
            throw th2;
        }
    }
}
