package kotlinx.coroutines.scheduling;

import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.LimitedDispatcherKt;

/* loaded from: classes.dex */
public final class DefaultScheduler extends SchedulerCoroutineDispatcher {

    /* renamed from: x */
    public static final DefaultScheduler f107472x = new DefaultScheduler();

    private DefaultScheduler() {
        super(TasksKt.f107492c, TasksKt.f107493d, TasksKt.f107494e, TasksKt.f107490a);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: F0 */
    public CoroutineDispatcher mo112623F0(int i11) {
        LimitedDispatcherKt.m113645a(i11);
        if (i11 >= TasksKt.f107492c) {
            return this;
        }
        return super.mo112623F0(i11);
    }

    @Override // kotlinx.coroutines.scheduling.SchedulerCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return "Dispatchers.Default";
    }
}
