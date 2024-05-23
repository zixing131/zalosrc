package kotlinx.coroutines.scheduling;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import um0.InterfaceC27315f;

/* loaded from: classes7.dex */
final class LimitingDispatcher extends ExecutorCoroutineDispatcher implements TaskContext, Executor {

    /* renamed from: x */
    private static final AtomicIntegerFieldUpdater f107474x = AtomicIntegerFieldUpdater.newUpdater(LimitingDispatcher.class, "inFlightTasks");
    private volatile int inFlightTasks;

    /* renamed from: s */
    private final ExperimentalCoroutineDispatcher f107475s;

    /* renamed from: t */
    private final int f107476t;

    /* renamed from: u */
    private final String f107477u;

    /* renamed from: v */
    private final int f107478v;

    /* renamed from: w */
    private final ConcurrentLinkedQueue f107479w;

    /* renamed from: G0 */
    private final void m113802G0(Runnable runnable, boolean z11) {
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f107474x;
            if (atomicIntegerFieldUpdater.incrementAndGet(this) <= this.f107476t) {
                this.f107475s.m113801G0(runnable, this, z11);
                return;
            }
            this.f107479w.add(runnable);
            if (atomicIntegerFieldUpdater.decrementAndGet(this) >= this.f107476t) {
                return;
            } else {
                runnable = (Runnable) this.f107479w.poll();
            }
        } while (runnable != null);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: D0 */
    public void mo112622D0(InterfaceC27315f interfaceC27315f, Runnable runnable) {
        m113802G0(runnable, true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        m113802G0(runnable, false);
    }

    @Override // kotlinx.coroutines.scheduling.TaskContext
    /* renamed from: i0 */
    public void mo113803i0() {
        Runnable runnable = (Runnable) this.f107479w.poll();
        if (runnable != null) {
            this.f107475s.m113801G0(runnable, this, true);
            return;
        }
        f107474x.decrementAndGet(this);
        Runnable runnable2 = (Runnable) this.f107479w.poll();
        if (runnable2 == null) {
            return;
        }
        m113802G0(runnable2, true);
    }

    @Override // kotlinx.coroutines.scheduling.TaskContext
    /* renamed from: r0 */
    public int mo113804r0() {
        return this.f107478v;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        String str = this.f107477u;
        if (str == null) {
            return super.toString() + "[dispatcher = " + this.f107475s + ']';
        }
        return str;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: z0 */
    public void mo9279z0(InterfaceC27315f interfaceC27315f, Runnable runnable) {
        m113802G0(runnable, false);
    }
}
