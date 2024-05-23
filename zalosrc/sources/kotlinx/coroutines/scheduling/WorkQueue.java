package kotlinx.coroutines.scheduling;

import androidx.concurrent.futures.AbstractC1246b;
import fn0.C19059j0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class WorkQueue {

    /* renamed from: b */
    private static final AtomicReferenceFieldUpdater f107499b = AtomicReferenceFieldUpdater.newUpdater(WorkQueue.class, Object.class, "lastScheduledTask");

    /* renamed from: c */
    private static final AtomicIntegerFieldUpdater f107500c = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "producerIndex");

    /* renamed from: d */
    private static final AtomicIntegerFieldUpdater f107501d = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "consumerIndex");

    /* renamed from: e */
    private static final AtomicIntegerFieldUpdater f107502e = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "blockingTasksInBuffer");

    /* renamed from: a */
    private final AtomicReferenceArray f107503a = new AtomicReferenceArray(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    /* renamed from: b */
    private final Task m113808b(Task task) {
        if (m113810d() == 127) {
            return task;
        }
        if (task.f107487q.mo113804r0() == 1) {
            f107502e.incrementAndGet(this);
        }
        int i11 = f107500c.get(this) & 127;
        while (this.f107503a.get(i11) != null) {
            Thread.yield();
        }
        this.f107503a.lazySet(i11, task);
        f107500c.incrementAndGet(this);
        return null;
    }

    /* renamed from: c */
    private final void m113809c(Task task) {
        if (task != null && task.f107487q.mo113804r0() == 1) {
            f107502e.decrementAndGet(this);
        }
    }

    /* renamed from: d */
    private final int m113810d() {
        return f107500c.get(this) - f107501d.get(this);
    }

    /* renamed from: i */
    private final Task m113811i() {
        Task task;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f107501d;
            int i11 = atomicIntegerFieldUpdater.get(this);
            if (i11 - f107500c.get(this) == 0) {
                return null;
            }
            int i12 = i11 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i11, i11 + 1) && (task = (Task) this.f107503a.getAndSet(i12, null)) != null) {
                m113809c(task);
                return task;
            }
        }
    }

    /* renamed from: j */
    private final boolean m113812j(GlobalQueue globalQueue) {
        Task m113811i = m113811i();
        if (m113811i == null) {
            return false;
        }
        globalQueue.m113664a(m113811i);
        return true;
    }

    /* renamed from: k */
    private final Task m113813k(boolean z11) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Task task;
        do {
            atomicReferenceFieldUpdater = f107499b;
            task = (Task) atomicReferenceFieldUpdater.get(this);
            if (task != null) {
                boolean z12 = true;
                if (task.f107487q.mo113804r0() != 1) {
                    z12 = false;
                }
                if (z12 == z11) {
                }
            }
            int i11 = f107501d.get(this);
            int i12 = f107500c.get(this);
            while (i11 != i12) {
                if (z11 && f107502e.get(this) == 0) {
                    return null;
                }
                i12--;
                Task m113815m = m113815m(i12, z11);
                if (m113815m != null) {
                    return m113815m;
                }
            }
            return null;
        } while (!AbstractC1246b.m5921a(atomicReferenceFieldUpdater, this, task, null));
        return task;
    }

    /* renamed from: l */
    private final Task m113814l(int i11) {
        int i12 = f107501d.get(this);
        int i13 = f107500c.get(this);
        boolean z11 = true;
        if (i11 != 1) {
            z11 = false;
        }
        while (i12 != i13) {
            if (z11 && f107502e.get(this) == 0) {
                return null;
            }
            int i14 = i12 + 1;
            Task m113815m = m113815m(i12, z11);
            if (m113815m == null) {
                i12 = i14;
            } else {
                return m113815m;
            }
        }
        return null;
    }

    /* renamed from: m */
    private final Task m113815m(int i11, boolean z11) {
        int i12 = i11 & 127;
        Task task = (Task) this.f107503a.get(i12);
        if (task != null) {
            boolean z12 = true;
            if (task.f107487q.mo113804r0() != 1) {
                z12 = false;
            }
            if (z12 == z11 && AbstractC21874a.m113823a(this.f107503a, i12, task, null)) {
                if (z11) {
                    f107502e.decrementAndGet(this);
                }
                return task;
            }
        }
        return null;
    }

    /* renamed from: o */
    private final long m113816o(int i11, C19059j0 c19059j0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Task task;
        do {
            atomicReferenceFieldUpdater = f107499b;
            task = (Task) atomicReferenceFieldUpdater.get(this);
            if (task == null) {
                return -2L;
            }
            int i12 = 1;
            if (task.f107487q.mo113804r0() != 1) {
                i12 = 2;
            }
            if ((i12 & i11) == 0) {
                return -2L;
            }
            long mo113805a = TasksKt.f107495f.mo113805a() - task.f107486p;
            long j11 = TasksKt.f107491b;
            if (mo113805a < j11) {
                return j11 - mo113805a;
            }
        } while (!AbstractC1246b.m5921a(atomicReferenceFieldUpdater, this, task, null));
        c19059j0.f94941p = task;
        return -1L;
    }

    /* renamed from: a */
    public final Task m113817a(Task task, boolean z11) {
        if (z11) {
            return m113808b(task);
        }
        Task task2 = (Task) f107499b.getAndSet(this, task);
        if (task2 == null) {
            return null;
        }
        return m113808b(task2);
    }

    /* renamed from: e */
    public final int m113818e() {
        if (f107499b.get(this) != null) {
            return m113810d() + 1;
        }
        return m113810d();
    }

    /* renamed from: f */
    public final void m113819f(GlobalQueue globalQueue) {
        Task task = (Task) f107499b.getAndSet(this, null);
        if (task != null) {
            globalQueue.m113664a(task);
        }
        do {
        } while (m113812j(globalQueue));
    }

    /* renamed from: g */
    public final Task m113820g() {
        Task task = (Task) f107499b.getAndSet(this, null);
        if (task == null) {
            return m113811i();
        }
        return task;
    }

    /* renamed from: h */
    public final Task m113821h() {
        return m113813k(true);
    }

    /* renamed from: n */
    public final long m113822n(int i11, C19059j0 c19059j0) {
        Task m113814l;
        if (i11 == 3) {
            m113814l = m113811i();
        } else {
            m113814l = m113814l(i11);
        }
        if (m113814l != null) {
            c19059j0.f94941p = m113814l;
            return -1L;
        }
        return m113816o(i11, c19059j0);
    }
}
