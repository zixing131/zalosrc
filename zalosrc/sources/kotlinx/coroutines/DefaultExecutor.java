package kotlinx.coroutines;

import fn0.AbstractC19074t;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.EventLoopImplBase;
import ln0.AbstractC22543l;
import pm0.C24848g0;
import um0.InterfaceC27315f;

/* loaded from: classes.dex */
public final class DefaultExecutor extends EventLoopImplBase implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: x */
    public static final DefaultExecutor f105853x;

    /* renamed from: y */
    private static final long f105854y;

    static {
        Long l11;
        DefaultExecutor defaultExecutor = new DefaultExecutor();
        f105853x = defaultExecutor;
        EventLoop.m112686M0(defaultExecutor, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l11 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l11 = 1000L;
        }
        f105854y = timeUnit.toNanos(l11.longValue());
    }

    private DefaultExecutor() {
    }

    /* renamed from: i1 */
    private final synchronized void m112650i1() {
        if (!m112653l1()) {
            return;
        }
        debugStatus = 3;
        m112706c1();
        AbstractC19074t.m100206d(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
    }

    /* renamed from: j1 */
    private final synchronized Thread m112651j1() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    /* renamed from: k1 */
    private final boolean m112652k1() {
        return debugStatus == 4;
    }

    /* renamed from: l1 */
    private final boolean m112653l1() {
        int i11 = debugStatus;
        return i11 == 2 || i11 == 3;
    }

    /* renamed from: m1 */
    private final synchronized boolean m112654m1() {
        if (m112653l1()) {
            return false;
        }
        debugStatus = 1;
        AbstractC19074t.m100206d(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    /* renamed from: n1 */
    private final void m112655n1() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // kotlinx.coroutines.EventLoopImplPlatform
    /* renamed from: S0 */
    protected Thread mo112527S0() {
        Thread thread = _thread;
        if (thread == null) {
            return m112651j1();
        }
        return thread;
    }

    @Override // kotlinx.coroutines.EventLoopImplPlatform
    /* renamed from: T0 */
    protected void mo112656T0(long j11, EventLoopImplBase.DelayedTask delayedTask) {
        m112655n1();
    }

    @Override // kotlinx.coroutines.EventLoopImplBase
    /* renamed from: Y0 */
    public void mo112657Y0(Runnable runnable) {
        if (m112652k1()) {
            m112655n1();
        }
        super.mo112657Y0(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        C24848g0 c24848g0;
        long nanoTime;
        ThreadLocalEventLoop.f105943a.m112871d(this);
        AbstractTimeSource m112510a = AbstractTimeSourceKt.m112510a();
        if (m112510a != null) {
            m112510a.m112504c();
        }
        try {
            if (!m112654m1()) {
                _thread = null;
                m112650i1();
                AbstractTimeSource m112510a2 = AbstractTimeSourceKt.m112510a();
                if (m112510a2 != null) {
                    m112510a2.m112508g();
                }
                if (!m112705a1()) {
                    mo112527S0();
                    return;
                }
                return;
            }
            long j11 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long mo112693P0 = mo112693P0();
                if (mo112693P0 == Long.MAX_VALUE) {
                    AbstractTimeSource m112510a3 = AbstractTimeSourceKt.m112510a();
                    if (m112510a3 != null) {
                        nanoTime = m112510a3.m112502a();
                    } else {
                        nanoTime = System.nanoTime();
                    }
                    if (j11 == Long.MAX_VALUE) {
                        j11 = f105854y + nanoTime;
                    }
                    long j12 = j11 - nanoTime;
                    if (j12 > 0) {
                        mo112693P0 = AbstractC22543l.m116585h(mo112693P0, j12);
                    } else {
                        _thread = null;
                        m112650i1();
                        AbstractTimeSource m112510a4 = AbstractTimeSourceKt.m112510a();
                        if (m112510a4 != null) {
                            m112510a4.m112508g();
                        }
                        if (!m112705a1()) {
                            mo112527S0();
                            return;
                        }
                        return;
                    }
                } else {
                    j11 = Long.MAX_VALUE;
                }
                if (mo112693P0 > 0) {
                    if (m112653l1()) {
                        _thread = null;
                        m112650i1();
                        AbstractTimeSource m112510a5 = AbstractTimeSourceKt.m112510a();
                        if (m112510a5 != null) {
                            m112510a5.m112508g();
                        }
                        if (!m112705a1()) {
                            mo112527S0();
                            return;
                        }
                        return;
                    }
                    AbstractTimeSource m112510a6 = AbstractTimeSourceKt.m112510a();
                    if (m112510a6 != null) {
                        m112510a6.m112503b(this, mo112693P0);
                        c24848g0 = C24848g0.f119245a;
                    } else {
                        c24848g0 = null;
                    }
                    if (c24848g0 == null) {
                        LockSupport.parkNanos(this, mo112693P0);
                    }
                }
            }
        } catch (Throwable th2) {
            _thread = null;
            m112650i1();
            AbstractTimeSource m112510a7 = AbstractTimeSourceKt.m112510a();
            if (m112510a7 != null) {
                m112510a7.m112508g();
            }
            if (!m112705a1()) {
                mo112527S0();
            }
            throw th2;
        }
    }

    @Override // kotlinx.coroutines.EventLoopImplBase, kotlinx.coroutines.EventLoop
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // kotlinx.coroutines.EventLoopImplBase, kotlinx.coroutines.Delay
    /* renamed from: y */
    public DisposableHandle mo112658y(long j11, Runnable runnable, InterfaceC27315f interfaceC27315f) {
        return m112708f1(j11, runnable);
    }
}
