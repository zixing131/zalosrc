package bm0;

import java.util.concurrent.Executor;

/* renamed from: bm0.a */
/* loaded from: classes7.dex */
public final class ExecutorC2847a implements Executor {
    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }
}
