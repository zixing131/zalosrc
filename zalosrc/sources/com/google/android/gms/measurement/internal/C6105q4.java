package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.AbstractC4205o;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.q4 */
/* loaded from: classes.dex */
public final class C6105q4 extends AbstractC6062m5 {

    /* renamed from: l */
    private static final AtomicLong f34357l = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: c */
    private C6094p4 f34358c;

    /* renamed from: d */
    private C6094p4 f34359d;

    /* renamed from: e */
    private final PriorityBlockingQueue f34360e;

    /* renamed from: f */
    private final BlockingQueue f34361f;

    /* renamed from: g */
    private final Thread.UncaughtExceptionHandler f34362g;

    /* renamed from: h */
    private final Thread.UncaughtExceptionHandler f34363h;

    /* renamed from: i */
    private final Object f34364i;

    /* renamed from: j */
    private final Semaphore f34365j;

    /* renamed from: k */
    private volatile boolean f34366k;

    public C6105q4(C6127s4 c6127s4) {
        super(c6127s4);
        this.f34364i = new Object();
        this.f34365j = new Semaphore(2);
        this.f34360e = new PriorityBlockingQueue();
        this.f34361f = new LinkedBlockingQueue();
        this.f34362g = new C6072n4(this, "Thread death: Uncaught exception on worker thread");
        this.f34363h = new C6072n4(this, "Thread death: Uncaught exception on network thread");
    }

    /* renamed from: B */
    public static /* bridge */ /* synthetic */ boolean m31281B(C6105q4 c6105q4) {
        boolean z11 = c6105q4.f34366k;
        return false;
    }

    /* renamed from: D */
    private final void m31282D(C6083o4 c6083o4) {
        synchronized (this.f34364i) {
            try {
                this.f34360e.add(c6083o4);
                C6094p4 c6094p4 = this.f34358c;
                if (c6094p4 == null) {
                    C6094p4 c6094p42 = new C6094p4(this, "Measurement Worker", this.f34360e);
                    this.f34358c = c6094p42;
                    c6094p42.setUncaughtExceptionHandler(this.f34362g);
                    this.f34358c.start();
                } else {
                    c6094p4.m31277a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: A */
    public final void m31290A(Runnable runnable) {
        m31140j();
        AbstractC4205o.m19722k(runnable);
        m31282D(new C6083o4(this, runnable, true, "Task exception on worker thread"));
    }

    /* renamed from: C */
    public final boolean m31291C() {
        if (Thread.currentThread() == this.f34358c) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6051l5
    /* renamed from: e */
    public final void mo31034e() {
        if (Thread.currentThread() == this.f34359d) {
        } else {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6051l5
    /* renamed from: g */
    public final void mo31036g() {
        if (Thread.currentThread() == this.f34358c) {
        } else {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6062m5
    /* renamed from: i */
    protected final boolean mo30816i() {
        return false;
    }

    /* renamed from: q */
    public final Object m31292q(AtomicReference atomicReference, long j11, String str, Runnable runnable) {
        synchronized (atomicReference) {
            this.f34158a.mo31037v().m31296z(runnable);
            try {
                atomicReference.wait(j11);
            } catch (InterruptedException unused) {
                this.f34158a.mo31033c().m31202w().m31108a("Interrupted waiting for " + str);
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            this.f34158a.mo31033c().m31202w().m31108a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    /* renamed from: r */
    public final Future m31293r(Callable callable) {
        m31140j();
        AbstractC4205o.m19722k(callable);
        C6083o4 c6083o4 = new C6083o4(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f34358c) {
            if (!this.f34360e.isEmpty()) {
                this.f34158a.mo31033c().m31202w().m31108a("Callable skipped the worker queue.");
            }
            c6083o4.run();
        } else {
            m31282D(c6083o4);
        }
        return c6083o4;
    }

    /* renamed from: s */
    public final Future m31294s(Callable callable) {
        m31140j();
        AbstractC4205o.m19722k(callable);
        C6083o4 c6083o4 = new C6083o4(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f34358c) {
            c6083o4.run();
        } else {
            m31282D(c6083o4);
        }
        return c6083o4;
    }

    /* renamed from: y */
    public final void m31295y(Runnable runnable) {
        m31140j();
        AbstractC4205o.m19722k(runnable);
        C6083o4 c6083o4 = new C6083o4(this, runnable, false, "Task exception on network thread");
        synchronized (this.f34364i) {
            try {
                this.f34361f.add(c6083o4);
                C6094p4 c6094p4 = this.f34359d;
                if (c6094p4 == null) {
                    C6094p4 c6094p42 = new C6094p4(this, "Measurement Network", this.f34361f);
                    this.f34359d = c6094p42;
                    c6094p42.setUncaughtExceptionHandler(this.f34363h);
                    this.f34359d.start();
                } else {
                    c6094p4.m31277a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: z */
    public final void m31296z(Runnable runnable) {
        m31140j();
        AbstractC4205o.m19722k(runnable);
        m31282D(new C6083o4(this, runnable, false, "Task exception on worker thread"));
    }
}
