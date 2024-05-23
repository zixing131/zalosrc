package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.internal.ThreadContextKt;
import pm0.AbstractC24866w;
import pm0.C24848g0;
import pm0.C24860q;
import um0.InterfaceC27313d;
import um0.InterfaceC27315f;

/* loaded from: classes7.dex */
public final class UndispatchedCoroutine<T> extends ScopeCoroutine<T> {

    /* renamed from: t */
    private final ThreadLocal f105957t;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public UndispatchedCoroutine(InterfaceC27315f interfaceC27315f, Continuation continuation) {
        super(r0, continuation);
        InterfaceC27315f interfaceC27315f2;
        UndispatchedMarker undispatchedMarker = UndispatchedMarker.f105958p;
        if (interfaceC27315f.mo112624d(undispatchedMarker) == null) {
            interfaceC27315f2 = interfaceC27315f.mo112823d0(undispatchedMarker);
        } else {
            interfaceC27315f2 = interfaceC27315f;
        }
        this.f105957t = new ThreadLocal();
        if (!(continuation.getContext().mo112624d(InterfaceC27313d.f128556o) instanceof CoroutineDispatcher)) {
            Object m113731c = ThreadContextKt.m113731c(interfaceC27315f, null);
            ThreadContextKt.m113729a(interfaceC27315f, m113731c);
            m112881u1(interfaceC27315f, m113731c);
        }
    }

    @Override // kotlinx.coroutines.internal.ScopeCoroutine, kotlinx.coroutines.AbstractCoroutine
    /* renamed from: p1 */
    protected void mo112498p1(Object obj) {
        if (this.threadLocalIsSet) {
            C24860q c24860q = (C24860q) this.f105957t.get();
            if (c24860q != null) {
                ThreadContextKt.m113729a((InterfaceC27315f) c24860q.m129213a(), c24860q.m129214b());
            }
            this.f105957t.remove();
        }
        Object m112606a = CompletionStateKt.m112606a(obj, this.f107413s);
        Continuation continuation = this.f107413s;
        InterfaceC27315f context = continuation.getContext();
        UndispatchedCoroutine undispatchedCoroutine = null;
        Object m113731c = ThreadContextKt.m113731c(context, null);
        if (m113731c != ThreadContextKt.f107422a) {
            undispatchedCoroutine = CoroutineContextKt.m112618g(continuation, context, m113731c);
        }
        try {
            this.f107413s.mo112492g(m112606a);
            C24848g0 c24848g0 = C24848g0.f119245a;
        } finally {
            if (undispatchedCoroutine == null || undispatchedCoroutine.m112880t1()) {
                ThreadContextKt.m113729a(context, m113731c);
            }
        }
    }

    /* renamed from: t1 */
    public final boolean m112880t1() {
        boolean z11;
        if (this.threadLocalIsSet && this.f105957t.get() == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f105957t.remove();
        return !z11;
    }

    /* renamed from: u1 */
    public final void m112881u1(InterfaceC27315f interfaceC27315f, Object obj) {
        this.threadLocalIsSet = true;
        this.f105957t.set(AbstractC24866w.m129235a(interfaceC27315f, obj));
    }
}
