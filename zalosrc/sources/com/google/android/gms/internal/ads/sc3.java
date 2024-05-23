package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class sc3 extends AtomicReference implements Runnable {

    /* renamed from: p */
    private static final Runnable f27617p = new rc3(null);

    /* renamed from: q */
    private static final Runnable f27618q = new rc3(null);

    /* renamed from: c */
    private final void m26270c(Thread thread) {
        Runnable runnable = (Runnable) get();
        qc3 qc3Var = null;
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            if (!(runnable instanceof qc3)) {
                if (runnable != f27618q) {
                    break;
                }
            } else {
                qc3Var = (qc3) runnable;
            }
            i11++;
            if (i11 > 1000) {
                Runnable runnable2 = f27618q;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    if (Thread.interrupted() || z11) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    LockSupport.park(qc3Var);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z11) {
            thread.interrupt();
        }
    }

    /* renamed from: a */
    abstract Object mo23602a();

    /* renamed from: b */
    abstract String mo23603b();

    /* renamed from: d */
    abstract void mo23604d(Throwable th2);

    /* renamed from: e */
    abstract void mo23605e(Object obj);

    /* renamed from: f */
    abstract boolean mo23606f();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final void m26271g() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            qc3 qc3Var = new qc3(this, null);
            super/*java.util.concurrent.locks.AbstractOwnableSynchronizer*/.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, qc3Var)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(f27617p)) == f27618q) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th2) {
                    if (((Runnable) getAndSet(f27617p)) == f27618q) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th2;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (!compareAndSet(null, currentThread)) {
            return;
        }
        boolean z11 = !mo23606f();
        if (z11) {
            try {
                obj = mo23602a();
            } catch (Throwable th2) {
                try {
                    bd3.m20479a(th2);
                    if (!compareAndSet(currentThread, f27617p)) {
                        m26270c(currentThread);
                    }
                    mo23604d(th2);
                    return;
                } catch (Throwable th3) {
                    if (!compareAndSet(currentThread, f27617p)) {
                        m26270c(currentThread);
                    }
                    mo23605e(null);
                    throw th3;
                }
            }
        }
        if (!compareAndSet(currentThread, f27617p)) {
            m26270c(currentThread);
        }
        if (z11) {
            mo23605e(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f27617p) {
            str = "running=[DONE]";
        } else if (runnable instanceof qc3) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + mo23603b();
    }
}
