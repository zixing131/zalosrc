package kotlinx.coroutines.scheduling;

import fn0.AbstractC19060k;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import um0.InterfaceC27315f;

/* loaded from: classes.dex */
public class SchedulerCoroutineDispatcher extends ExecutorCoroutineDispatcher {

    /* renamed from: s */
    private final int f107481s;

    /* renamed from: t */
    private final int f107482t;

    /* renamed from: u */
    private final long f107483u;

    /* renamed from: v */
    private final String f107484v;

    /* renamed from: w */
    private CoroutineScheduler f107485w;

    public SchedulerCoroutineDispatcher() {
        this(0, 0, 0L, null, 15, null);
    }

    /* renamed from: G0 */
    private final CoroutineScheduler m113806G0() {
        return new CoroutineScheduler(this.f107481s, this.f107482t, this.f107483u, this.f107484v);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: D0 */
    public void mo112622D0(InterfaceC27315f interfaceC27315f, Runnable runnable) {
        CoroutineScheduler.m113766i(this.f107485w, runnable, null, true, 2, null);
    }

    /* renamed from: H0 */
    public final void m113807H0(Runnable runnable, TaskContext taskContext, boolean z11) {
        this.f107485w.m113772h(runnable, taskContext, z11);
    }

    public void close() {
        this.f107485w.close();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: z0 */
    public void mo9279z0(InterfaceC27315f interfaceC27315f, Runnable runnable) {
        CoroutineScheduler.m113766i(this.f107485w, runnable, null, false, 6, null);
    }

    public /* synthetic */ SchedulerCoroutineDispatcher(int i11, int i12, long j11, String str, int i13, AbstractC19060k abstractC19060k) {
        this((i13 & 1) != 0 ? TasksKt.f107492c : i11, (i13 & 2) != 0 ? TasksKt.f107493d : i12, (i13 & 4) != 0 ? TasksKt.f107494e : j11, (i13 & 8) != 0 ? "CoroutineScheduler" : str);
    }

    public SchedulerCoroutineDispatcher(int i11, int i12, long j11, String str) {
        this.f107481s = i11;
        this.f107482t = i12;
        this.f107483u = j11;
        this.f107484v = str;
        this.f107485w = m113806G0();
    }
}
