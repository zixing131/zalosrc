package kotlinx.coroutines.internal;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.CompletionStateKt;
import um0.InterfaceC27315f;
import vm0.AbstractC28297c;
import wm0.InterfaceC29097e;

/* loaded from: classes7.dex */
public class ScopeCoroutine<T> extends AbstractCoroutine<T> implements InterfaceC29097e {

    /* renamed from: s */
    public final Continuation f107413s;

    public ScopeCoroutine(InterfaceC27315f interfaceC27315f, Continuation continuation) {
        super(interfaceC27315f, true, true);
        this.f107413s = continuation;
    }

    @Override // wm0.InterfaceC29097e
    /* renamed from: C */
    public final StackTraceElement mo112573C() {
        return null;
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: K0 */
    protected final boolean mo112524K0() {
        return true;
    }

    @Override // wm0.InterfaceC29097e
    /* renamed from: e */
    public final InterfaceC29097e mo112582e() {
        Continuation continuation = this.f107413s;
        if (continuation instanceof InterfaceC29097e) {
            return (InterfaceC29097e) continuation;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: h0 */
    public void mo112525h0(Object obj) {
        Continuation m142576c;
        m142576c = AbstractC28297c.m142576c(this.f107413s);
        DispatchedContinuationKt.m113613c(m142576c, CompletionStateKt.m112606a(obj, this.f107413s), null, 2, null);
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    /* renamed from: p1 */
    protected void mo112498p1(Object obj) {
        Continuation continuation = this.f107413s;
        continuation.mo112492g(CompletionStateKt.m112606a(obj, continuation));
    }
}
