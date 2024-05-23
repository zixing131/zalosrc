package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.ConcurrentKt;
import um0.InterfaceC27315f;

/* loaded from: classes.dex */
public final class ExecutorCoroutineDispatcherImpl extends ExecutorCoroutineDispatcher implements Delay {

    /* renamed from: s */
    private final Executor f105886s;

    public ExecutorCoroutineDispatcherImpl(Executor executor) {
        this.f105886s = executor;
        ConcurrentKt.m113584a(m112726H0());
    }

    /* renamed from: G0 */
    private final void m112724G0(InterfaceC27315f interfaceC27315f, RejectedExecutionException rejectedExecutionException) {
        JobKt.m112750c(interfaceC27315f, ExceptionsKt.m112722a("The task was rejected", rejectedExecutionException));
    }

    /* renamed from: I0 */
    private final ScheduledFuture m112725I0(ScheduledExecutorService scheduledExecutorService, Runnable runnable, InterfaceC27315f interfaceC27315f, long j11) {
        try {
            return scheduledExecutorService.schedule(runnable, j11, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e11) {
            m112724G0(interfaceC27315f, e11);
            return null;
        }
    }

    /* renamed from: H0 */
    public Executor m112726H0() {
        return this.f105886s;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ExecutorService executorService;
        Executor m112726H0 = m112726H0();
        if (m112726H0 instanceof ExecutorService) {
            executorService = (ExecutorService) m112726H0;
        } else {
            executorService = null;
        }
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        if ((obj instanceof ExecutorCoroutineDispatcherImpl) && ((ExecutorCoroutineDispatcherImpl) obj).m112726H0() == m112726H0()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return System.identityHashCode(m112726H0());
    }

    @Override // kotlinx.coroutines.Delay
    /* renamed from: q */
    public void mo112663q(long j11, CancellableContinuation cancellableContinuation) {
        ScheduledExecutorService scheduledExecutorService;
        Executor m112726H0 = m112726H0();
        ScheduledFuture scheduledFuture = null;
        if (m112726H0 instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) m112726H0;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            scheduledFuture = m112725I0(scheduledExecutorService, new ResumeUndispatchedRunnable(this, cancellableContinuation), cancellableContinuation.getContext(), j11);
        }
        if (scheduledFuture != null) {
            JobKt.m112755h(cancellableContinuation, scheduledFuture);
        } else {
            DefaultExecutor.f105853x.mo112663q(j11, cancellableContinuation);
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return m112726H0().toString();
    }

    @Override // kotlinx.coroutines.Delay
    /* renamed from: y */
    public DisposableHandle mo112658y(long j11, Runnable runnable, InterfaceC27315f interfaceC27315f) {
        ScheduledExecutorService scheduledExecutorService;
        Executor m112726H0 = m112726H0();
        ScheduledFuture scheduledFuture = null;
        if (m112726H0 instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) m112726H0;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            scheduledFuture = m112725I0(scheduledExecutorService, runnable, interfaceC27315f, j11);
        }
        if (scheduledFuture != null) {
            return new DisposableFutureHandle(scheduledFuture);
        }
        return DefaultExecutor.f105853x.mo112658y(j11, runnable, interfaceC27315f);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: z0 */
    public void mo9279z0(InterfaceC27315f interfaceC27315f, Runnable runnable) {
        Runnable runnable2;
        try {
            Executor m112726H0 = m112726H0();
            AbstractTimeSource m112510a = AbstractTimeSourceKt.m112510a();
            if (m112510a != null) {
                runnable2 = m112510a.m112509h(runnable);
                if (runnable2 == null) {
                }
                m112726H0.execute(runnable2);
            }
            runnable2 = runnable;
            m112726H0.execute(runnable2);
        } catch (RejectedExecutionException e11) {
            AbstractTimeSource m112510a2 = AbstractTimeSourceKt.m112510a();
            if (m112510a2 != null) {
                m112510a2.m112506e();
            }
            m112724G0(interfaceC27315f, e11);
            Dispatchers.m112680b().mo9279z0(interfaceC27315f, runnable);
        }
    }
}
