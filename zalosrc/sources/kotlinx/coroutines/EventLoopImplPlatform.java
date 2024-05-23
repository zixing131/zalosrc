package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.EventLoopImplBase;
import pm0.C24848g0;

/* loaded from: classes.dex */
public abstract class EventLoopImplPlatform extends EventLoop {
    /* renamed from: S0 */
    protected abstract Thread mo112527S0();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: T0 */
    public void mo112656T0(long j11, EventLoopImplBase.DelayedTask delayedTask) {
        DefaultExecutor.f105853x.m112707d1(j11, delayedTask);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: U0 */
    public final void m112716U0() {
        C24848g0 c24848g0;
        Thread mo112527S0 = mo112527S0();
        if (Thread.currentThread() != mo112527S0) {
            AbstractTimeSource m112510a = AbstractTimeSourceKt.m112510a();
            if (m112510a != null) {
                m112510a.m112507f(mo112527S0);
                c24848g0 = C24848g0.f119245a;
            } else {
                c24848g0 = null;
            }
            if (c24848g0 == null) {
                LockSupport.unpark(mo112527S0);
            }
        }
    }
}
