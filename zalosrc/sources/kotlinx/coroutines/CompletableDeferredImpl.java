package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import vm0.AbstractC28298d;

/* loaded from: classes7.dex */
final class CompletableDeferredImpl<T> extends JobSupport implements CompletableDeferred<T> {
    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: D0 */
    public boolean mo112597D0() {
        return true;
    }

    @Override // kotlinx.coroutines.Deferred
    /* renamed from: E */
    public Object mo112598E(Continuation continuation) {
        Object m112828i0 = m112828i0(continuation);
        AbstractC28298d.m142578e();
        return m112828i0;
    }

    @Override // kotlinx.coroutines.CompletableDeferred
    /* renamed from: L */
    public boolean mo112595L(Throwable th2) {
        return m112818O0(new CompletedExceptionally(th2, false, 2, null));
    }

    @Override // kotlinx.coroutines.CompletableDeferred
    /* renamed from: N */
    public boolean mo112596N(Object obj) {
        return m112818O0(obj);
    }

    @Override // kotlinx.coroutines.Deferred
    /* renamed from: r */
    public Object mo112599r() {
        return m112835z0();
    }
}
