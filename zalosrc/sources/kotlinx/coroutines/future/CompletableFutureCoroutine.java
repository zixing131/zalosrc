package kotlinx.coroutines.future;

import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.Job;
import pm0.C24848g0;

/* loaded from: classes7.dex */
final class CompletableFutureCoroutine<T> extends AbstractCoroutine<T> implements BiFunction<T, Throwable, C24848g0> {

    /* renamed from: s */
    private final CompletableFuture f107338s;

    @Override // java.util.function.BiFunction
    public /* bridge */ /* synthetic */ C24848g0 apply(Object obj, Throwable th2) {
        m113568t1(obj, th2);
        return C24848g0.f119245a;
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    /* renamed from: q1 */
    protected void mo112499q1(Throwable th2, boolean z11) {
        this.f107338s.completeExceptionally(th2);
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    /* renamed from: r1 */
    protected void mo112500r1(Object obj) {
        this.f107338s.complete(obj);
    }

    /* renamed from: t1 */
    public void m113568t1(Object obj, Throwable th2) {
        Job.DefaultImpls.m112740a(this, null, 1, null);
    }
}
