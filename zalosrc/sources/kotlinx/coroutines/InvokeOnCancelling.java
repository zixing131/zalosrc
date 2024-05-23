package kotlinx.coroutines;

import en0.InterfaceC18505l;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import pm0.C24848g0;

/* loaded from: classes7.dex */
final class InvokeOnCancelling extends JobCancellingNode {

    /* renamed from: u */
    private static final AtomicIntegerFieldUpdater f105894u = AtomicIntegerFieldUpdater.newUpdater(InvokeOnCancelling.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: t */
    private final InterfaceC18505l f105895t;

    public InvokeOnCancelling(InterfaceC18505l interfaceC18505l) {
        this.f105895t = interfaceC18505l;
    }

    @Override // en0.InterfaceC18505l
    /* renamed from: i9 */
    public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
        mo112514r((Throwable) obj);
        return C24848g0.f119245a;
    }

    @Override // kotlinx.coroutines.CompletionHandlerBase
    /* renamed from: r */
    public void mo112514r(Throwable th2) {
        if (f105894u.compareAndSet(this, 0, 1)) {
            this.f105895t.mo205i9(th2);
        }
    }
}
