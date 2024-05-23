package com.google.android.gms.measurement.internal;

import android.os.Process;
import com.google.android.gms.common.internal.AbstractC4205o;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.p4 */
/* loaded from: classes.dex */
public final class C6094p4 extends Thread {

    /* renamed from: p */
    private final Object f34324p;

    /* renamed from: q */
    private final BlockingQueue f34325q;

    /* renamed from: r */
    private boolean f34326r = false;

    /* renamed from: s */
    final /* synthetic */ C6105q4 f34327s;

    public C6094p4(C6105q4 c6105q4, String str, BlockingQueue blockingQueue) {
        this.f34327s = c6105q4;
        AbstractC4205o.m19722k(str);
        AbstractC4205o.m19722k(blockingQueue);
        this.f34324p = new Object();
        this.f34325q = blockingQueue;
        setName(str);
    }

    /* renamed from: b */
    private final void m31275b() {
        Object obj;
        Semaphore semaphore;
        Object obj2;
        C6094p4 c6094p4;
        C6094p4 c6094p42;
        obj = this.f34327s.f34364i;
        synchronized (obj) {
            try {
                if (!this.f34326r) {
                    semaphore = this.f34327s.f34365j;
                    semaphore.release();
                    obj2 = this.f34327s.f34364i;
                    obj2.notifyAll();
                    C6105q4 c6105q4 = this.f34327s;
                    c6094p4 = c6105q4.f34358c;
                    if (this == c6094p4) {
                        c6105q4.f34358c = null;
                    } else {
                        c6094p42 = c6105q4.f34359d;
                        if (this == c6094p42) {
                            c6105q4.f34359d = null;
                        } else {
                            c6105q4.f34158a.mo31033c().m31197q().m31108a("Current scheduler thread is neither worker nor network");
                        }
                    }
                    this.f34326r = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    private final void m31276c(InterruptedException interruptedException) {
        this.f34327s.f34158a.mo31033c().m31202w().m31109b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    /* renamed from: a */
    public final void m31277a() {
        synchronized (this.f34324p) {
            this.f34324p.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Semaphore semaphore;
        int i11;
        Object obj;
        boolean z11 = false;
        while (!z11) {
            try {
                semaphore = this.f34327s.f34365j;
                semaphore.acquire();
                z11 = true;
            } catch (InterruptedException e11) {
                m31276c(e11);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                C6083o4 c6083o4 = (C6083o4) this.f34325q.poll();
                if (c6083o4 != null) {
                    if (true != c6083o4.f34267q) {
                        i11 = 10;
                    } else {
                        i11 = threadPriority;
                    }
                    Process.setThreadPriority(i11);
                    c6083o4.run();
                } else {
                    synchronized (this.f34324p) {
                        if (this.f34325q.peek() == null) {
                            C6105q4.m31281B(this.f34327s);
                            try {
                                this.f34324p.wait(30000L);
                            } catch (InterruptedException e12) {
                                m31276c(e12);
                            }
                        }
                    }
                    obj = this.f34327s.f34364i;
                    synchronized (obj) {
                        if (this.f34325q.peek() == null) {
                            m31275b();
                            m31275b();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            m31275b();
            throw th2;
        }
    }
}
