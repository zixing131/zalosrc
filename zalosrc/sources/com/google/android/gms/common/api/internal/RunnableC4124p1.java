package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.p1 */
/* loaded from: classes2.dex */
final class RunnableC4124p1 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ C4104j f16423p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4124p1(C4104j c4104j) {
        this.f16423p = c4104j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Lock lock;
        Lock lock2;
        lock = this.f16423p.f16355B;
        lock.lock();
        try {
            C4104j.m19467w(this.f16423p);
        } finally {
            lock2 = this.f16423p.f16355B;
            lock2.unlock();
        }
    }
}
