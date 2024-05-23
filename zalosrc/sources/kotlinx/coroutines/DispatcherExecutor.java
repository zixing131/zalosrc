package kotlinx.coroutines;

import java.util.concurrent.Executor;
import um0.C27316g;

/* loaded from: classes.dex */
final class DispatcherExecutor implements Executor {

    /* renamed from: p */
    public final CoroutineDispatcher f105861p;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        CoroutineDispatcher coroutineDispatcher = this.f105861p;
        C27316g c27316g = C27316g.f128559p;
        if (coroutineDispatcher.mo9278E0(c27316g)) {
            this.f105861p.mo9279z0(c27316g, runnable);
        } else {
            runnable.run();
        }
    }

    public String toString() {
        return this.f105861p.toString();
    }
}
