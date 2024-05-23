package kotlinx.coroutines.scheduling;

import java.util.concurrent.RejectedExecutionException;
import kotlinx.coroutines.DefaultExecutor;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import um0.InterfaceC27315f;

/* loaded from: classes7.dex */
public class ExperimentalCoroutineDispatcher extends ExecutorCoroutineDispatcher {

    /* renamed from: s */
    private CoroutineScheduler f107473s;

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: D0 */
    public void mo112622D0(InterfaceC27315f interfaceC27315f, Runnable runnable) {
        try {
            CoroutineScheduler.m113766i(this.f107473s, runnable, null, true, 2, null);
        } catch (RejectedExecutionException unused) {
            DefaultExecutor.f105853x.mo112622D0(interfaceC27315f, runnable);
        }
    }

    /* renamed from: G0 */
    public final void m113801G0(Runnable runnable, TaskContext taskContext, boolean z11) {
        try {
            this.f107473s.m113772h(runnable, taskContext, z11);
        } catch (RejectedExecutionException unused) {
            DefaultExecutor.f105853x.mo112657Y0(this.f107473s.m113771d(runnable, taskContext));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f107473s.close();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return super.toString() + "[scheduler = " + this.f107473s + ']';
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: z0 */
    public void mo9279z0(InterfaceC27315f interfaceC27315f, Runnable runnable) {
        try {
            CoroutineScheduler.m113766i(this.f107473s, runnable, null, false, 6, null);
        } catch (RejectedExecutionException unused) {
            DefaultExecutor.f105853x.mo9279z0(interfaceC27315f, runnable);
        }
    }
}
