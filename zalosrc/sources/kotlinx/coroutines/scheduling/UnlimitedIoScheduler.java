package kotlinx.coroutines.scheduling;

import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.LimitedDispatcherKt;
import um0.InterfaceC27315f;

/* loaded from: classes.dex */
final class UnlimitedIoScheduler extends CoroutineDispatcher {

    /* renamed from: r */
    public static final UnlimitedIoScheduler f107498r = new UnlimitedIoScheduler();

    private UnlimitedIoScheduler() {
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: D0 */
    public void mo112622D0(InterfaceC27315f interfaceC27315f, Runnable runnable) {
        DefaultScheduler.f107472x.m113807H0(runnable, TasksKt.f107497h, true);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: F0 */
    public CoroutineDispatcher mo112623F0(int i11) {
        LimitedDispatcherKt.m113645a(i11);
        if (i11 >= TasksKt.f107493d) {
            return this;
        }
        return super.mo112623F0(i11);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: z0 */
    public void mo9279z0(InterfaceC27315f interfaceC27315f, Runnable runnable) {
        DefaultScheduler.f107472x.m113807H0(runnable, TasksKt.f107497h, false);
    }
}
