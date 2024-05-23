package kotlinx.coroutines;

import androidx.concurrent.futures.AbstractC1246b;
import fn0.AbstractC19074t;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.ThreadSafeHeap;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;
import ln0.AbstractC22543l;
import pm0.C24848g0;
import um0.InterfaceC27315f;

/* loaded from: classes.dex */
public abstract class EventLoopImplBase extends EventLoopImplPlatform implements Delay {

    /* renamed from: u */
    private static final AtomicReferenceFieldUpdater f105873u = AtomicReferenceFieldUpdater.newUpdater(EventLoopImplBase.class, Object.class, "_queue");

    /* renamed from: v */
    private static final AtomicReferenceFieldUpdater f105874v = AtomicReferenceFieldUpdater.newUpdater(EventLoopImplBase.class, Object.class, "_delayed");

    /* renamed from: w */
    private static final AtomicIntegerFieldUpdater f105875w = AtomicIntegerFieldUpdater.newUpdater(EventLoopImplBase.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes7.dex */
    public final class DelayedResumeTask extends DelayedTask {

        /* renamed from: r */
        private final CancellableContinuation f105876r;

        public DelayedResumeTask(long j11, CancellableContinuation cancellableContinuation) {
            super(j11);
            this.f105876r = cancellableContinuation;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f105876r.mo112542D(EventLoopImplBase.this, C24848g0.f119245a);
        }

        @Override // kotlinx.coroutines.EventLoopImplBase.DelayedTask
        public String toString() {
            return super.toString() + this.f105876r;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes7.dex */
    public static final class DelayedRunnableTask extends DelayedTask {

        /* renamed from: r */
        private final Runnable f105878r;

        public DelayedRunnableTask(long j11, Runnable runnable) {
            super(j11);
            this.f105878r = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f105878r.run();
        }

        @Override // kotlinx.coroutines.EventLoopImplBase.DelayedTask
        public String toString() {
            return super.toString() + this.f105878r;
        }
    }

    /* loaded from: classes7.dex */
    public static abstract class DelayedTask implements Runnable, Comparable<DelayedTask>, DisposableHandle, ThreadSafeHeapNode {
        private volatile Object _heap;

        /* renamed from: p */
        public long f105879p;

        /* renamed from: q */
        private int f105880q = -1;

        public DelayedTask(long j11) {
            this.f105879p = j11;
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        /* renamed from: b */
        public void mo112709b(ThreadSafeHeap threadSafeHeap) {
            Symbol symbol;
            Object obj = this._heap;
            symbol = EventLoop_commonKt.f105882a;
            if (obj != symbol) {
                this._heap = threadSafeHeap;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        /* renamed from: c */
        public ThreadSafeHeap mo112710c() {
            Object obj = this._heap;
            if (obj instanceof ThreadSafeHeap) {
                return (ThreadSafeHeap) obj;
            }
            return null;
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public final void dispose() {
            Symbol symbol;
            DelayedTaskQueue delayedTaskQueue;
            Symbol symbol2;
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    symbol = EventLoop_commonKt.f105882a;
                    if (obj == symbol) {
                        return;
                    }
                    if (obj instanceof DelayedTaskQueue) {
                        delayedTaskQueue = (DelayedTaskQueue) obj;
                    } else {
                        delayedTaskQueue = null;
                    }
                    if (delayedTaskQueue != null) {
                        delayedTaskQueue.m113746g(this);
                    }
                    symbol2 = EventLoop_commonKt.f105882a;
                    this._heap = symbol2;
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        /* renamed from: e */
        public void mo112711e(int i11) {
            this.f105880q = i11;
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        /* renamed from: g */
        public int mo112712g() {
            return this.f105880q;
        }

        @Override // java.lang.Comparable
        /* renamed from: h */
        public int compareTo(DelayedTask delayedTask) {
            long j11 = this.f105879p - delayedTask.f105879p;
            if (j11 > 0) {
                return 1;
            }
            if (j11 < 0) {
                return -1;
            }
            return 0;
        }

        /* renamed from: i */
        public final int m112714i(long j11, DelayedTaskQueue delayedTaskQueue, EventLoopImplBase eventLoopImplBase) {
            Symbol symbol;
            synchronized (this) {
                Object obj = this._heap;
                symbol = EventLoop_commonKt.f105882a;
                if (obj == symbol) {
                    return 2;
                }
                synchronized (delayedTaskQueue) {
                    try {
                        DelayedTask delayedTask = (DelayedTask) delayedTaskQueue.m113742b();
                        if (eventLoopImplBase.m112702f()) {
                            return 1;
                        }
                        if (delayedTask == null) {
                            delayedTaskQueue.f105881c = j11;
                        } else {
                            long j12 = delayedTask.f105879p;
                            if (j12 - j11 < 0) {
                                j11 = j12;
                            }
                            if (j11 - delayedTaskQueue.f105881c > 0) {
                                delayedTaskQueue.f105881c = j11;
                            }
                        }
                        long j13 = this.f105879p;
                        long j14 = delayedTaskQueue.f105881c;
                        if (j13 - j14 < 0) {
                            this.f105879p = j14;
                        }
                        delayedTaskQueue.m113741a(this);
                        return 0;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        /* renamed from: j */
        public final boolean m112715j(long j11) {
            return j11 - this.f105879p >= 0;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f105879p + ']';
        }
    }

    /* loaded from: classes7.dex */
    public static final class DelayedTaskQueue extends ThreadSafeHeap<DelayedTask> {

        /* renamed from: c */
        public long f105881c;

        public DelayedTaskQueue(long j11) {
            this.f105881c = j11;
        }
    }

    /* renamed from: W0 */
    private final void m112697W0() {
        Symbol symbol;
        Symbol symbol2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f105873u;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f105873u;
                symbol = EventLoop_commonKt.f105883b;
                if (AbstractC1246b.m5921a(atomicReferenceFieldUpdater2, this, null, symbol)) {
                    return;
                }
            } else if (!(obj instanceof LockFreeTaskQueueCore)) {
                symbol2 = EventLoop_commonKt.f105883b;
                if (obj == symbol2) {
                    return;
                }
                LockFreeTaskQueueCore lockFreeTaskQueueCore = new LockFreeTaskQueueCore(8, true);
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                lockFreeTaskQueueCore.m113673a((Runnable) obj);
                if (AbstractC1246b.m5921a(f105873u, this, obj, lockFreeTaskQueueCore)) {
                    return;
                }
            } else {
                ((LockFreeTaskQueueCore) obj).m113674d();
                return;
            }
        }
    }

    /* renamed from: X0 */
    private final Runnable m112698X0() {
        Symbol symbol;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f105873u;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (!(obj instanceof LockFreeTaskQueueCore)) {
                symbol = EventLoop_commonKt.f105883b;
                if (obj == symbol) {
                    return null;
                }
                if (AbstractC1246b.m5921a(f105873u, this, obj, null)) {
                    AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    return (Runnable) obj;
                }
            } else {
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) obj;
                Object m113678j = lockFreeTaskQueueCore.m113678j();
                if (m113678j != LockFreeTaskQueueCore.f107394h) {
                    return (Runnable) m113678j;
                }
                AbstractC1246b.m5921a(f105873u, this, obj, lockFreeTaskQueueCore.m113677i());
            }
        }
    }

    /* renamed from: Z0 */
    private final boolean m112699Z0(Runnable runnable) {
        Symbol symbol;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f105873u;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (m112702f()) {
                return false;
            }
            if (obj == null) {
                if (AbstractC1246b.m5921a(f105873u, this, null, runnable)) {
                    return true;
                }
            } else if (!(obj instanceof LockFreeTaskQueueCore)) {
                symbol = EventLoop_commonKt.f105883b;
                if (obj == symbol) {
                    return false;
                }
                LockFreeTaskQueueCore lockFreeTaskQueueCore = new LockFreeTaskQueueCore(8, true);
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                lockFreeTaskQueueCore.m113673a((Runnable) obj);
                lockFreeTaskQueueCore.m113673a(runnable);
                if (AbstractC1246b.m5921a(f105873u, this, obj, lockFreeTaskQueueCore)) {
                    return true;
                }
            } else {
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                LockFreeTaskQueueCore lockFreeTaskQueueCore2 = (LockFreeTaskQueueCore) obj;
                int m113673a = lockFreeTaskQueueCore2.m113673a(runnable);
                if (m113673a == 0) {
                    return true;
                }
                if (m113673a != 1) {
                    if (m113673a == 2) {
                        return false;
                    }
                } else {
                    AbstractC1246b.m5921a(f105873u, this, obj, lockFreeTaskQueueCore2.m113677i());
                }
            }
        }
    }

    /* renamed from: b1 */
    private final void m112700b1() {
        long nanoTime;
        DelayedTask delayedTask;
        AbstractTimeSource m112510a = AbstractTimeSourceKt.m112510a();
        if (m112510a != null) {
            nanoTime = m112510a.m112502a();
        } else {
            nanoTime = System.nanoTime();
        }
        while (true) {
            DelayedTaskQueue delayedTaskQueue = (DelayedTaskQueue) f105874v.get(this);
            if (delayedTaskQueue != null && (delayedTask = (DelayedTask) delayedTaskQueue.m113748i()) != null) {
                mo112656T0(nanoTime, delayedTask);
            } else {
                return;
            }
        }
    }

    /* renamed from: e1 */
    private final int m112701e1(long j11, DelayedTask delayedTask) {
        if (m112702f()) {
            return 1;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f105874v;
        DelayedTaskQueue delayedTaskQueue = (DelayedTaskQueue) atomicReferenceFieldUpdater.get(this);
        if (delayedTaskQueue == null) {
            AbstractC1246b.m5921a(atomicReferenceFieldUpdater, this, null, new DelayedTaskQueue(j11));
            Object obj = atomicReferenceFieldUpdater.get(this);
            AbstractC19074t.m100205c(obj);
            delayedTaskQueue = (DelayedTaskQueue) obj;
        }
        return delayedTask.m112714i(j11, delayedTaskQueue, this);
    }

    /* renamed from: f */
    public final boolean m112702f() {
        if (f105875w.get(this) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g1 */
    private final void m112703g1(boolean z11) {
        f105875w.set(this, z11 ? 1 : 0);
    }

    /* renamed from: h1 */
    private final boolean m112704h1(DelayedTask delayedTask) {
        DelayedTask delayedTask2;
        DelayedTaskQueue delayedTaskQueue = (DelayedTaskQueue) f105874v.get(this);
        if (delayedTaskQueue != null) {
            delayedTask2 = (DelayedTask) delayedTaskQueue.m113745e();
        } else {
            delayedTask2 = null;
        }
        if (delayedTask2 == delayedTask) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.EventLoop
    /* renamed from: K0 */
    public long mo112689K0() {
        DelayedTask delayedTask;
        long nanoTime;
        long m116581d;
        Symbol symbol;
        if (super.mo112689K0() == 0) {
            return 0L;
        }
        Object obj = f105873u.get(this);
        if (obj != null) {
            if (!(obj instanceof LockFreeTaskQueueCore)) {
                symbol = EventLoop_commonKt.f105883b;
                if (obj != symbol) {
                    return 0L;
                }
                return Long.MAX_VALUE;
            }
            if (!((LockFreeTaskQueueCore) obj).m113676g()) {
                return 0L;
            }
        }
        DelayedTaskQueue delayedTaskQueue = (DelayedTaskQueue) f105874v.get(this);
        if (delayedTaskQueue == null || (delayedTask = (DelayedTask) delayedTaskQueue.m113745e()) == null) {
            return Long.MAX_VALUE;
        }
        long j11 = delayedTask.f105879p;
        AbstractTimeSource m112510a = AbstractTimeSourceKt.m112510a();
        if (m112510a != null) {
            nanoTime = m112510a.m112502a();
        } else {
            nanoTime = System.nanoTime();
        }
        m116581d = AbstractC22543l.m116581d(j11 - nanoTime, 0L);
        return m116581d;
    }

    @Override // kotlinx.coroutines.EventLoop
    /* renamed from: P0 */
    public long mo112693P0() {
        long nanoTime;
        ThreadSafeHeapNode threadSafeHeapNode;
        if (m112694Q0()) {
            return 0L;
        }
        DelayedTaskQueue delayedTaskQueue = (DelayedTaskQueue) f105874v.get(this);
        if (delayedTaskQueue != null && !delayedTaskQueue.m113744d()) {
            AbstractTimeSource m112510a = AbstractTimeSourceKt.m112510a();
            if (m112510a != null) {
                nanoTime = m112510a.m112502a();
            } else {
                nanoTime = System.nanoTime();
            }
            do {
                synchronized (delayedTaskQueue) {
                    ThreadSafeHeapNode m113742b = delayedTaskQueue.m113742b();
                    threadSafeHeapNode = null;
                    if (m113742b != null) {
                        DelayedTask delayedTask = (DelayedTask) m113742b;
                        if (delayedTask.m112715j(nanoTime) && m112699Z0(delayedTask)) {
                            threadSafeHeapNode = delayedTaskQueue.m113747h(0);
                        }
                    }
                }
            } while (((DelayedTask) threadSafeHeapNode) != null);
        }
        Runnable m112698X0 = m112698X0();
        if (m112698X0 != null) {
            m112698X0.run();
            return 0L;
        }
        return mo112689K0();
    }

    /* renamed from: Y0 */
    public void mo112657Y0(Runnable runnable) {
        if (m112699Z0(runnable)) {
            m112716U0();
        } else {
            DefaultExecutor.f105853x.mo112657Y0(runnable);
        }
    }

    /* renamed from: a1 */
    public boolean m112705a1() {
        Symbol symbol;
        if (!m112692O0()) {
            return false;
        }
        DelayedTaskQueue delayedTaskQueue = (DelayedTaskQueue) f105874v.get(this);
        if (delayedTaskQueue != null && !delayedTaskQueue.m113744d()) {
            return false;
        }
        Object obj = f105873u.get(this);
        if (obj != null) {
            if (!(obj instanceof LockFreeTaskQueueCore)) {
                symbol = EventLoop_commonKt.f105883b;
                if (obj != symbol) {
                    return false;
                }
            } else {
                return ((LockFreeTaskQueueCore) obj).m113676g();
            }
        }
        return true;
    }

    /* renamed from: c1 */
    public final void m112706c1() {
        f105873u.set(this, null);
        f105874v.set(this, null);
    }

    /* renamed from: d1 */
    public final void m112707d1(long j11, DelayedTask delayedTask) {
        int m112701e1 = m112701e1(j11, delayedTask);
        if (m112701e1 != 0) {
            if (m112701e1 != 1) {
                if (m112701e1 != 2) {
                    throw new IllegalStateException("unexpected result".toString());
                }
                return;
            } else {
                mo112656T0(j11, delayedTask);
                return;
            }
        }
        if (m112704h1(delayedTask)) {
            m112716U0();
        }
    }

    /* renamed from: f1 */
    public final DisposableHandle m112708f1(long j11, Runnable runnable) {
        long nanoTime;
        long m112721d = EventLoop_commonKt.m112721d(j11);
        if (m112721d < 4611686018427387903L) {
            AbstractTimeSource m112510a = AbstractTimeSourceKt.m112510a();
            if (m112510a != null) {
                nanoTime = m112510a.m112502a();
            } else {
                nanoTime = System.nanoTime();
            }
            DelayedRunnableTask delayedRunnableTask = new DelayedRunnableTask(m112721d + nanoTime, runnable);
            m112707d1(nanoTime, delayedRunnableTask);
            return delayedRunnableTask;
        }
        return NonDisposableHandle.f105937p;
    }

    @Override // kotlinx.coroutines.Delay
    /* renamed from: q */
    public void mo112663q(long j11, CancellableContinuation cancellableContinuation) {
        long nanoTime;
        long m112721d = EventLoop_commonKt.m112721d(j11);
        if (m112721d < 4611686018427387903L) {
            AbstractTimeSource m112510a = AbstractTimeSourceKt.m112510a();
            if (m112510a != null) {
                nanoTime = m112510a.m112502a();
            } else {
                nanoTime = System.nanoTime();
            }
            DelayedResumeTask delayedResumeTask = new DelayedResumeTask(m112721d + nanoTime, cancellableContinuation);
            m112707d1(nanoTime, delayedResumeTask);
            CancellableContinuationKt.m112590a(cancellableContinuation, delayedResumeTask);
        }
    }

    @Override // kotlinx.coroutines.EventLoop
    public void shutdown() {
        ThreadLocalEventLoop.f105943a.m112870c();
        m112703g1(true);
        m112697W0();
        do {
        } while (mo112693P0() <= 0);
        m112700b1();
    }

    /* renamed from: y */
    public DisposableHandle mo112658y(long j11, Runnable runnable, InterfaceC27315f interfaceC27315f) {
        return Delay.DefaultImpls.m112664a(this, j11, runnable, interfaceC27315f);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: z0 */
    public final void mo9279z0(InterfaceC27315f interfaceC27315f, Runnable runnable) {
        mo112657Y0(runnable);
    }
}
