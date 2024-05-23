package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.DispatchedContinuationKt;
import kotlinx.coroutines.internal.ScopeCoroutine;
import um0.InterfaceC27315f;
import vm0.AbstractC28297c;
import vm0.AbstractC28298d;

/* loaded from: classes7.dex */
public final class DispatchedCoroutine<T> extends ScopeCoroutine<T> {

    /* renamed from: t */
    private static final AtomicIntegerFieldUpdater f105859t = AtomicIntegerFieldUpdater.newUpdater(DispatchedCoroutine.class, "_decision");
    private volatile int _decision;

    public DispatchedCoroutine(InterfaceC27315f interfaceC27315f, Continuation continuation) {
        super(interfaceC27315f, continuation);
    }

    /* renamed from: u1 */
    private final boolean m112670u1() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f105859t;
        do {
            int i11 = atomicIntegerFieldUpdater.get(this);
            if (i11 != 0) {
                if (i11 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f105859t.compareAndSet(this, 0, 2));
        return true;
    }

    /* renamed from: v1 */
    private final boolean m112671v1() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f105859t;
        do {
            int i11 = atomicIntegerFieldUpdater.get(this);
            if (i11 != 0) {
                if (i11 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f105859t.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // kotlinx.coroutines.internal.ScopeCoroutine, kotlinx.coroutines.JobSupport
    /* renamed from: h0 */
    public void mo112525h0(Object obj) {
        mo112498p1(obj);
    }

    @Override // kotlinx.coroutines.internal.ScopeCoroutine, kotlinx.coroutines.AbstractCoroutine
    /* renamed from: p1 */
    protected void mo112498p1(Object obj) {
        Continuation m142576c;
        if (!m112670u1()) {
            m142576c = AbstractC28297c.m142576c(this.f107413s);
            DispatchedContinuationKt.m113613c(m142576c, CompletionStateKt.m112606a(obj, this.f107413s), null, 2, null);
        }
    }

    /* renamed from: t1 */
    public final Object m112672t1() {
        Object m142578e;
        if (m112671v1()) {
            m142578e = AbstractC28298d.m142578e();
            return m142578e;
        }
        Object m112860h = JobSupportKt.m112860h(m112815G0());
        if (!(m112860h instanceof CompletedExceptionally)) {
            return m112860h;
        }
        throw ((CompletedExceptionally) m112860h).f105828a;
    }
}
