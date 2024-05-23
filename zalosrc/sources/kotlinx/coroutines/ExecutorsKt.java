package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class ExecutorsKt {
    /* renamed from: a */
    public static final CoroutineDispatcher m112727a(Executor executor) {
        DispatcherExecutor dispatcherExecutor;
        CoroutineDispatcher coroutineDispatcher;
        if (executor instanceof DispatcherExecutor) {
            dispatcherExecutor = (DispatcherExecutor) executor;
        } else {
            dispatcherExecutor = null;
        }
        if (dispatcherExecutor == null || (coroutineDispatcher = dispatcherExecutor.f105861p) == null) {
            return new ExecutorCoroutineDispatcherImpl(executor);
        }
        return coroutineDispatcher;
    }

    /* renamed from: b */
    public static final ExecutorCoroutineDispatcher m112728b(ExecutorService executorService) {
        return new ExecutorCoroutineDispatcherImpl(executorService);
    }
}
