package kotlinx.coroutines.tasks;

import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
final class DirectExecutor implements Executor {

    /* renamed from: p */
    public static final DirectExecutor f107617p = new DirectExecutor();

    private DirectExecutor() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
