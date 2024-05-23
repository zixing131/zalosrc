package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import kotlinx.coroutines.DefaultExecutorKt;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;
import um0.C27316g;
import um0.InterfaceC27315f;

/* loaded from: classes.dex */
public final class LimitedDispatcher extends CoroutineDispatcher implements Delay {

    /* renamed from: w */
    private static final AtomicIntegerFieldUpdater f107375w = AtomicIntegerFieldUpdater.newUpdater(LimitedDispatcher.class, "runningWorkers");

    /* renamed from: r */
    private final CoroutineDispatcher f107376r;
    private volatile int runningWorkers;

    /* renamed from: s */
    private final int f107377s;

    /* renamed from: t */
    private final /* synthetic */ Delay f107378t;

    /* renamed from: u */
    private final LockFreeTaskQueue f107379u;

    /* renamed from: v */
    private final Object f107380v;

    /* loaded from: classes.dex */
    private final class Worker implements Runnable {

        /* renamed from: p */
        private Runnable f107381p;

        public Worker(Runnable runnable) {
            this.f107381p = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i11 = 0;
            while (true) {
                try {
                    this.f107381p.run();
                } catch (Throwable th2) {
                    CoroutineExceptionHandlerKt.m112629a(C27316g.f128559p, th2);
                }
                Runnable m113643I0 = LimitedDispatcher.this.m113643I0();
                if (m113643I0 == null) {
                    return;
                }
                this.f107381p = m113643I0;
                i11++;
                if (i11 >= 16 && LimitedDispatcher.this.f107376r.mo9278E0(LimitedDispatcher.this)) {
                    LimitedDispatcher.this.f107376r.mo9279z0(LimitedDispatcher.this, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LimitedDispatcher(CoroutineDispatcher coroutineDispatcher, int i11) {
        Delay delay;
        this.f107376r = coroutineDispatcher;
        this.f107377s = i11;
        if (coroutineDispatcher instanceof Delay) {
            delay = (Delay) coroutineDispatcher;
        } else {
            delay = null;
        }
        this.f107378t = delay == null ? DefaultExecutorKt.m112659a() : delay;
        this.f107379u = new LockFreeTaskQueue(false);
        this.f107380v = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I0 */
    public final Runnable m113643I0() {
        while (true) {
            Runnable runnable = (Runnable) this.f107379u.m113667d();
            if (runnable == null) {
                synchronized (this.f107380v) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f107375w;
                    atomicIntegerFieldUpdater.decrementAndGet(this);
                    if (this.f107379u.m113666c() == 0) {
                        return null;
                    }
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                }
            } else {
                return runnable;
            }
        }
    }

    /* renamed from: J0 */
    private final boolean m113644J0() {
        synchronized (this.f107380v) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f107375w;
            if (atomicIntegerFieldUpdater.get(this) >= this.f107377s) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: D0 */
    public void mo112622D0(InterfaceC27315f interfaceC27315f, Runnable runnable) {
        Runnable m113643I0;
        this.f107379u.m113664a(runnable);
        if (f107375w.get(this) < this.f107377s && m113644J0() && (m113643I0 = m113643I0()) != null) {
            this.f107376r.mo112622D0(this, new Worker(m113643I0));
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: F0 */
    public CoroutineDispatcher mo112623F0(int i11) {
        LimitedDispatcherKt.m113645a(i11);
        if (i11 >= this.f107377s) {
            return this;
        }
        return super.mo112623F0(i11);
    }

    @Override // kotlinx.coroutines.Delay
    /* renamed from: q */
    public void mo112663q(long j11, CancellableContinuation cancellableContinuation) {
        this.f107378t.mo112663q(j11, cancellableContinuation);
    }

    @Override // kotlinx.coroutines.Delay
    /* renamed from: y */
    public DisposableHandle mo112658y(long j11, Runnable runnable, InterfaceC27315f interfaceC27315f) {
        return this.f107378t.mo112658y(j11, runnable, interfaceC27315f);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: z0 */
    public void mo9279z0(InterfaceC27315f interfaceC27315f, Runnable runnable) {
        Runnable m113643I0;
        this.f107379u.m113664a(runnable);
        if (f107375w.get(this) < this.f107377s && m113644J0() && (m113643I0 = m113643I0()) != null) {
            this.f107376r.mo9279z0(this, new Worker(m113643I0));
        }
    }
}
