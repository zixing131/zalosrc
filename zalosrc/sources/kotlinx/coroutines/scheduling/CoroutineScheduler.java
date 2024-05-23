package kotlinx.coroutines.scheduling;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19059j0;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import jn0.AbstractC21317c;
import kotlinx.coroutines.AbstractTimeSource;
import kotlinx.coroutines.AbstractTimeSourceKt;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.internal.ResizableAtomicArray;
import kotlinx.coroutines.internal.Symbol;
import ln0.AbstractC22543l;
import pm0.C24848g0;

/* loaded from: classes.dex */
public final class CoroutineScheduler implements Executor, Closeable {
    private volatile int _isTerminated;
    private volatile long controlState;

    /* renamed from: p */
    public final int f107447p;
    private volatile long parkedWorkersStack;

    /* renamed from: q */
    public final int f107448q;

    /* renamed from: r */
    public final long f107449r;

    /* renamed from: s */
    public final String f107450s;

    /* renamed from: t */
    public final GlobalQueue f107451t;

    /* renamed from: u */
    public final GlobalQueue f107452u;

    /* renamed from: v */
    public final ResizableAtomicArray f107453v;

    /* renamed from: w */
    public static final Companion f107443w = new Companion(null);

    /* renamed from: x */
    private static final AtomicLongFieldUpdater f107444x = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack");

    /* renamed from: y */
    private static final AtomicLongFieldUpdater f107445y = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState");

    /* renamed from: z */
    private static final AtomicIntegerFieldUpdater f107446z = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated");

    /* renamed from: A */
    public static final Symbol f107442A = new Symbol("NOT_IN_STACK");

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {

        /* renamed from: a */
        public static final /* synthetic */ int[] f107454a;

        static {
            int[] iArr = new int[WorkerState.values().length];
            try {
                iArr[WorkerState.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WorkerState.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WorkerState.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WorkerState.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WorkerState.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f107454a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public enum WorkerState {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public CoroutineScheduler(int i11, int i12, long j11, String str) {
        this.f107447p = i11;
        this.f107448q = i12;
        this.f107449r = j11;
        this.f107450s = str;
        if (i11 >= 1) {
            if (i12 >= i11) {
                if (i12 <= 2097150) {
                    if (j11 > 0) {
                        this.f107451t = new GlobalQueue();
                        this.f107452u = new GlobalQueue();
                        this.f107453v = new ResizableAtomicArray((i11 + 1) * 2);
                        this.controlState = i11 << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j11 + " must be positive").toString());
                }
                throw new IllegalArgumentException(("Max pool size " + i12 + " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(("Max pool size " + i12 + " should be greater than or equals to core pool size " + i11).toString());
        }
        throw new IllegalArgumentException(("Core pool size " + i11 + " should be at least 1").toString());
    }

    /* renamed from: E */
    private final Task m113758E(Worker worker, Task task, boolean z11) {
        if (worker == null) {
            return task;
        }
        if (worker.f107458r == WorkerState.TERMINATED) {
            return task;
        }
        if (task.f107487q.mo113804r0() == 0 && worker.f107458r == WorkerState.BLOCKING) {
            return task;
        }
        worker.f107462v = true;
        return worker.f107456p.m113817a(task, z11);
    }

    /* renamed from: F */
    private final boolean m113759F(long j11) {
        int m116580c;
        m116580c = AbstractC22543l.m116580c(((int) (2097151 & j11)) - ((int) ((j11 & 4398044413952L) >> 21)), 0);
        if (m116580c < this.f107447p) {
            int m113764c = m113764c();
            if (m113764c == 1 && this.f107447p > 1) {
                m113764c();
            }
            if (m113764c > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: G */
    static /* synthetic */ boolean m113760G(CoroutineScheduler coroutineScheduler, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = f107445y.get(coroutineScheduler);
        }
        return coroutineScheduler.m113759F(j11);
    }

    /* renamed from: J */
    private final boolean m113761J() {
        Worker m113768q;
        do {
            m113768q = m113768q();
            if (m113768q == null) {
                return false;
            }
        } while (!Worker.m113783j().compareAndSet(m113768q, -1, 0));
        LockSupport.unpark(m113768q);
        return true;
    }

    /* renamed from: b */
    private final boolean m113763b(Task task) {
        if (task.f107487q.mo113804r0() == 1) {
            return this.f107452u.m113664a(task);
        }
        return this.f107451t.m113664a(task);
    }

    /* renamed from: c */
    private final int m113764c() {
        int m116580c;
        synchronized (this.f107453v) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f107445y;
                long j11 = atomicLongFieldUpdater.get(this);
                int i11 = (int) (j11 & 2097151);
                m116580c = AbstractC22543l.m116580c(i11 - ((int) ((j11 & 4398044413952L) >> 21)), 0);
                if (m116580c >= this.f107447p) {
                    return 0;
                }
                if (i11 >= this.f107448q) {
                    return 0;
                }
                int i12 = ((int) (f107445y.get(this) & 2097151)) + 1;
                if (i12 > 0 && this.f107453v.m113700b(i12) == null) {
                    Worker worker = new Worker(this, i12);
                    this.f107453v.m113701c(i12, worker);
                    if (i12 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                        int i13 = m116580c + 1;
                        worker.start();
                        return i13;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: f */
    private final Worker m113765f() {
        Worker worker;
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof Worker) {
            worker = (Worker) currentThread;
        } else {
            worker = null;
        }
        if (worker == null || !AbstractC19074t.m100204b(CoroutineScheduler.this, this)) {
            return null;
        }
        return worker;
    }

    /* renamed from: i */
    public static /* synthetic */ void m113766i(CoroutineScheduler coroutineScheduler, Runnable runnable, TaskContext taskContext, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            taskContext = TasksKt.f107496g;
        }
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        coroutineScheduler.m113772h(runnable, taskContext, z11);
    }

    /* renamed from: o */
    private final int m113767o(Worker worker) {
        Object m113795i = worker.m113795i();
        while (m113795i != f107442A) {
            if (m113795i == null) {
                return 0;
            }
            Worker worker2 = (Worker) m113795i;
            int m113794h = worker2.m113794h();
            if (m113794h != 0) {
                return m113794h;
            }
            m113795i = worker2.m113795i();
        }
        return -1;
    }

    /* renamed from: q */
    private final Worker m113768q() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f107444x;
        while (true) {
            long j11 = atomicLongFieldUpdater.get(this);
            Worker worker = (Worker) this.f107453v.m113700b((int) (2097151 & j11));
            if (worker == null) {
                return null;
            }
            long j12 = (2097152 + j11) & (-2097152);
            int m113767o = m113767o(worker);
            if (m113767o >= 0 && f107444x.compareAndSet(this, j11, m113767o | j12)) {
                worker.m113798r(f107442A);
                return worker;
            }
        }
    }

    /* renamed from: y */
    private final void m113769y(long j11, boolean z11) {
        if (z11 || m113761J() || m113759F(j11)) {
            return;
        }
        m113761J();
    }

    /* renamed from: A */
    public final void m113770A() {
        if (m113761J() || m113760G(this, 0L, 1, null)) {
            return;
        }
        m113761J();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m113776v(10000L);
    }

    /* renamed from: d */
    public final Task m113771d(Runnable runnable, TaskContext taskContext) {
        long mo113805a = TasksKt.f107495f.mo113805a();
        if (runnable instanceof Task) {
            Task task = (Task) runnable;
            task.f107486p = mo113805a;
            task.f107487q = taskContext;
            return task;
        }
        return new TaskImpl(runnable, mo113805a, taskContext);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        m113766i(this, runnable, null, false, 6, null);
    }

    /* renamed from: h */
    public final void m113772h(Runnable runnable, TaskContext taskContext, boolean z11) {
        boolean z12;
        long j11;
        AbstractTimeSource m112510a = AbstractTimeSourceKt.m112510a();
        if (m112510a != null) {
            m112510a.m112505d();
        }
        Task m113771d = m113771d(runnable, taskContext);
        boolean z13 = false;
        if (m113771d.f107487q.mo113804r0() == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            j11 = f107445y.addAndGet(this, 2097152L);
        } else {
            j11 = 0;
        }
        Worker m113765f = m113765f();
        Task m113758E = m113758E(m113765f, m113771d, z11);
        if (m113758E != null && !m113763b(m113758E)) {
            throw new RejectedExecutionException(this.f107450s + " was terminated");
        }
        if (z11 && m113765f != null) {
            z13 = true;
        }
        if (z12) {
            m113769y(j11, z13);
        } else {
            if (z13) {
                return;
            }
            m113770A();
        }
    }

    public final boolean isTerminated() {
        if (f107446z.get(this) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public final boolean m113773r(Worker worker) {
        long j11;
        int m113794h;
        if (worker.m113795i() != f107442A) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f107444x;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            m113794h = worker.m113794h();
            worker.m113798r(this.f107453v.m113700b((int) (2097151 & j11)));
        } while (!f107444x.compareAndSet(this, j11, ((2097152 + j11) & (-2097152)) | m113794h));
        return true;
    }

    /* renamed from: s */
    public final void m113774s(Worker worker, int i11, int i12) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f107444x;
        while (true) {
            long j11 = atomicLongFieldUpdater.get(this);
            int i13 = (int) (2097151 & j11);
            long j12 = (2097152 + j11) & (-2097152);
            if (i13 == i11) {
                if (i12 == 0) {
                    i13 = m113767o(worker);
                } else {
                    i13 = i12;
                }
            }
            if (i13 >= 0 && f107444x.compareAndSet(this, j11, j12 | i13)) {
                return;
            }
        }
    }

    /* renamed from: t */
    public final void m113775t(Task task) {
        try {
            task.run();
        } catch (Throwable th2) {
            try {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
                AbstractTimeSource m112510a = AbstractTimeSourceKt.m112510a();
                if (m112510a == null) {
                }
            } finally {
                AbstractTimeSource m112510a2 = AbstractTimeSourceKt.m112510a();
                if (m112510a2 != null) {
                    m112510a2.m112506e();
                }
            }
        }
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int m113699a = this.f107453v.m113699a();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 1; i16 < m113699a; i16++) {
            Worker worker = (Worker) this.f107453v.m113700b(i16);
            if (worker != null) {
                int m113818e = worker.f107456p.m113818e();
                int i17 = WhenMappings.f107454a[worker.f107458r.ordinal()];
                if (i17 != 1) {
                    if (i17 != 2) {
                        if (i17 != 3) {
                            if (i17 != 4) {
                                if (i17 == 5) {
                                    i15++;
                                }
                            } else {
                                i14++;
                                if (m113818e > 0) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(m113818e);
                                    sb2.append('d');
                                    arrayList.add(sb2.toString());
                                }
                            }
                        } else {
                            i11++;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(m113818e);
                            sb3.append('c');
                            arrayList.add(sb3.toString());
                        }
                    } else {
                        i12++;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(m113818e);
                        sb4.append('b');
                        arrayList.add(sb4.toString());
                    }
                } else {
                    i13++;
                }
            }
        }
        long j11 = f107445y.get(this);
        return this.f107450s + '@' + DebugStringsKt.m112648b(this) + "[Pool Size {core = " + this.f107447p + ", max = " + this.f107448q + "}, Worker States {CPU = " + i11 + ", blocking = " + i12 + ", parked = " + i13 + ", dormant = " + i14 + ", terminated = " + i15 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f107451t.m113666c() + ", global blocking queue size = " + this.f107452u.m113666c() + ", Control State {created workers= " + ((int) (2097151 & j11)) + ", blocking tasks = " + ((int) ((4398044413952L & j11) >> 21)) + ", CPUs acquired = " + (this.f107447p - ((int) ((9223367638808264704L & j11) >> 42))) + "}]";
    }

    /* renamed from: v */
    public final void m113776v(long j11) {
        int i11;
        Task task;
        if (!f107446z.compareAndSet(this, 0, 1)) {
            return;
        }
        Worker m113765f = m113765f();
        synchronized (this.f107453v) {
            i11 = (int) (f107445y.get(this) & 2097151);
        }
        if (1 <= i11) {
            int i12 = 1;
            while (true) {
                Object m113700b = this.f107453v.m113700b(i12);
                AbstractC19074t.m100205c(m113700b);
                Worker worker = (Worker) m113700b;
                if (worker != m113765f) {
                    while (worker.isAlive()) {
                        LockSupport.unpark(worker);
                        worker.join(j11);
                    }
                    worker.f107456p.m113819f(this.f107452u);
                }
                if (i12 == i11) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        this.f107452u.m113665b();
        this.f107451t.m113665b();
        while (true) {
            if (m113765f != null) {
                task = m113765f.m113793g(true);
                if (task != null) {
                    continue;
                    m113775t(task);
                }
            }
            task = (Task) this.f107451t.m113667d();
            if (task == null && (task = (Task) this.f107452u.m113667d()) == null) {
                break;
            }
            m113775t(task);
        }
        if (m113765f != null) {
            m113765f.m113799u(WorkerState.TERMINATED);
        }
        f107444x.set(this, 0L);
        f107445y.set(this, 0L);
    }

    /* loaded from: classes.dex */
    public final class Worker extends Thread {

        /* renamed from: x */
        private static final AtomicIntegerFieldUpdater f107455x = AtomicIntegerFieldUpdater.newUpdater(Worker.class, "workerCtl");
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;

        /* renamed from: p */
        public final WorkQueue f107456p;

        /* renamed from: q */
        private final C19059j0 f107457q;

        /* renamed from: r */
        public WorkerState f107458r;

        /* renamed from: s */
        private long f107459s;

        /* renamed from: t */
        private long f107460t;

        /* renamed from: u */
        private int f107461u;

        /* renamed from: v */
        public boolean f107462v;
        private volatile int workerCtl;

        private Worker() {
            setDaemon(true);
            this.f107456p = new WorkQueue();
            this.f107457q = new C19059j0();
            this.f107458r = WorkerState.DORMANT;
            this.nextParkedWorker = CoroutineScheduler.f107442A;
            this.f107461u = AbstractC21317c.f103810p.mo110372d();
        }

        /* renamed from: b */
        private final void m113778b(int i11) {
            if (i11 == 0) {
                return;
            }
            CoroutineScheduler.f107445y.addAndGet(CoroutineScheduler.this, -2097152L);
            if (this.f107458r != WorkerState.TERMINATED) {
                this.f107458r = WorkerState.DORMANT;
            }
        }

        /* renamed from: c */
        private final void m113779c(int i11) {
            if (i11 != 0 && m113799u(WorkerState.BLOCKING)) {
                CoroutineScheduler.this.m113770A();
            }
        }

        /* renamed from: d */
        private final void m113780d(Task task) {
            int mo113804r0 = task.f107487q.mo113804r0();
            m113784k(mo113804r0);
            m113779c(mo113804r0);
            CoroutineScheduler.this.m113775t(task);
            m113778b(mo113804r0);
        }

        /* renamed from: e */
        private final Task m113781e(boolean z11) {
            boolean z12;
            Task m113787o;
            Task m113787o2;
            if (z11) {
                if (m113796m(CoroutineScheduler.this.f107447p * 2) == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12 && (m113787o2 = m113787o()) != null) {
                    return m113787o2;
                }
                Task m113820g = this.f107456p.m113820g();
                if (m113820g != null) {
                    return m113820g;
                }
                if (!z12 && (m113787o = m113787o()) != null) {
                    return m113787o;
                }
            } else {
                Task m113787o3 = m113787o();
                if (m113787o3 != null) {
                    return m113787o3;
                }
            }
            return m113791w(3);
        }

        /* renamed from: f */
        private final Task m113782f() {
            Task m113821h = this.f107456p.m113821h();
            if (m113821h == null) {
                Task task = (Task) CoroutineScheduler.this.f107452u.m113667d();
                if (task == null) {
                    return m113791w(1);
                }
                return task;
            }
            return m113821h;
        }

        /* renamed from: j */
        public static final AtomicIntegerFieldUpdater m113783j() {
            return f107455x;
        }

        /* renamed from: k */
        private final void m113784k(int i11) {
            this.f107459s = 0L;
            if (this.f107458r == WorkerState.PARKING) {
                this.f107458r = WorkerState.BLOCKING;
            }
        }

        /* renamed from: l */
        private final boolean m113785l() {
            if (this.nextParkedWorker != CoroutineScheduler.f107442A) {
                return true;
            }
            return false;
        }

        /* renamed from: n */
        private final void m113786n() {
            if (this.f107459s == 0) {
                this.f107459s = System.nanoTime() + CoroutineScheduler.this.f107449r;
            }
            LockSupport.parkNanos(CoroutineScheduler.this.f107449r);
            if (System.nanoTime() - this.f107459s >= 0) {
                this.f107459s = 0L;
                m113792x();
            }
        }

        /* renamed from: o */
        private final Task m113787o() {
            if (m113796m(2) == 0) {
                Task task = (Task) CoroutineScheduler.this.f107451t.m113667d();
                if (task != null) {
                    return task;
                }
                return (Task) CoroutineScheduler.this.f107452u.m113667d();
            }
            Task task2 = (Task) CoroutineScheduler.this.f107452u.m113667d();
            if (task2 != null) {
                return task2;
            }
            return (Task) CoroutineScheduler.this.f107451t.m113667d();
        }

        /* renamed from: p */
        private final void m113788p() {
            loop0: while (true) {
                boolean z11 = false;
                while (!CoroutineScheduler.this.isTerminated() && this.f107458r != WorkerState.TERMINATED) {
                    Task m113793g = m113793g(this.f107462v);
                    if (m113793g != null) {
                        this.f107460t = 0L;
                        m113780d(m113793g);
                    } else {
                        this.f107462v = false;
                        if (this.f107460t != 0) {
                            if (!z11) {
                                z11 = true;
                            } else {
                                m113799u(WorkerState.PARKING);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.f107460t);
                                this.f107460t = 0L;
                            }
                        } else {
                            m113790t();
                        }
                    }
                }
            }
            m113799u(WorkerState.TERMINATED);
        }

        /* renamed from: s */
        private final boolean m113789s() {
            long j11;
            if (this.f107458r == WorkerState.CPU_ACQUIRED) {
                return true;
            }
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            AtomicLongFieldUpdater atomicLongFieldUpdater = CoroutineScheduler.f107445y;
            do {
                j11 = atomicLongFieldUpdater.get(coroutineScheduler);
                if (((int) ((9223367638808264704L & j11) >> 42)) != 0) {
                } else {
                    return false;
                }
            } while (!CoroutineScheduler.f107445y.compareAndSet(coroutineScheduler, j11, j11 - 4398046511104L));
            this.f107458r = WorkerState.CPU_ACQUIRED;
            return true;
        }

        /* renamed from: t */
        private final void m113790t() {
            if (!m113785l()) {
                CoroutineScheduler.this.m113773r(this);
                return;
            }
            f107455x.set(this, -1);
            while (m113785l() && f107455x.get(this) == -1 && !CoroutineScheduler.this.isTerminated() && this.f107458r != WorkerState.TERMINATED) {
                m113799u(WorkerState.PARKING);
                Thread.interrupted();
                m113786n();
            }
        }

        /* renamed from: w */
        private final Task m113791w(int i11) {
            int i12 = (int) (CoroutineScheduler.f107445y.get(CoroutineScheduler.this) & 2097151);
            if (i12 < 2) {
                return null;
            }
            int m113796m = m113796m(i12);
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            long j11 = Long.MAX_VALUE;
            for (int i13 = 0; i13 < i12; i13++) {
                m113796m++;
                if (m113796m > i12) {
                    m113796m = 1;
                }
                Worker worker = (Worker) coroutineScheduler.f107453v.m113700b(m113796m);
                if (worker != null && worker != this) {
                    long m113822n = worker.f107456p.m113822n(i11, this.f107457q);
                    if (m113822n == -1) {
                        C19059j0 c19059j0 = this.f107457q;
                        Task task = (Task) c19059j0.f94941p;
                        c19059j0.f94941p = null;
                        return task;
                    }
                    if (m113822n > 0) {
                        j11 = Math.min(j11, m113822n);
                    }
                }
            }
            if (j11 == Long.MAX_VALUE) {
                j11 = 0;
            }
            this.f107460t = j11;
            return null;
        }

        /* renamed from: x */
        private final void m113792x() {
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            synchronized (coroutineScheduler.f107453v) {
                try {
                    if (coroutineScheduler.isTerminated()) {
                        return;
                    }
                    if (((int) (CoroutineScheduler.f107445y.get(coroutineScheduler) & 2097151)) <= coroutineScheduler.f107447p) {
                        return;
                    }
                    if (!f107455x.compareAndSet(this, -1, 1)) {
                        return;
                    }
                    int i11 = this.indexInArray;
                    m113797q(0);
                    coroutineScheduler.m113774s(this, i11, 0);
                    int andDecrement = (int) (CoroutineScheduler.f107445y.getAndDecrement(coroutineScheduler) & 2097151);
                    if (andDecrement != i11) {
                        Object m113700b = coroutineScheduler.f107453v.m113700b(andDecrement);
                        AbstractC19074t.m100205c(m113700b);
                        Worker worker = (Worker) m113700b;
                        coroutineScheduler.f107453v.m113701c(i11, worker);
                        worker.m113797q(i11);
                        coroutineScheduler.m113774s(worker, andDecrement, i11);
                    }
                    coroutineScheduler.f107453v.m113701c(andDecrement, null);
                    C24848g0 c24848g0 = C24848g0.f119245a;
                    this.f107458r = WorkerState.TERMINATED;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* renamed from: g */
        public final Task m113793g(boolean z11) {
            if (m113789s()) {
                return m113781e(z11);
            }
            return m113782f();
        }

        /* renamed from: h */
        public final int m113794h() {
            return this.indexInArray;
        }

        /* renamed from: i */
        public final Object m113795i() {
            return this.nextParkedWorker;
        }

        /* renamed from: m */
        public final int m113796m(int i11) {
            int i12 = this.f107461u;
            int i13 = i12 ^ (i12 << 13);
            int i14 = i13 ^ (i13 >> 17);
            int i15 = i14 ^ (i14 << 5);
            this.f107461u = i15;
            int i16 = i11 - 1;
            if ((i16 & i11) == 0) {
                return i15 & i16;
            }
            return (i15 & Integer.MAX_VALUE) % i11;
        }

        /* renamed from: q */
        public final void m113797q(int i11) {
            String valueOf;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(CoroutineScheduler.this.f107450s);
            sb2.append("-worker-");
            if (i11 == 0) {
                valueOf = "TERMINATED";
            } else {
                valueOf = String.valueOf(i11);
            }
            sb2.append(valueOf);
            setName(sb2.toString());
            this.indexInArray = i11;
        }

        /* renamed from: r */
        public final void m113798r(Object obj) {
            this.nextParkedWorker = obj;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            m113788p();
        }

        /* renamed from: u */
        public final boolean m113799u(WorkerState workerState) {
            boolean z11;
            WorkerState workerState2 = this.f107458r;
            if (workerState2 == WorkerState.CPU_ACQUIRED) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                CoroutineScheduler.f107445y.addAndGet(CoroutineScheduler.this, 4398046511104L);
            }
            if (workerState2 != workerState) {
                this.f107458r = workerState;
            }
            return z11;
        }

        public Worker(CoroutineScheduler coroutineScheduler, int i11) {
            this();
            m113797q(i11);
        }
    }
}
