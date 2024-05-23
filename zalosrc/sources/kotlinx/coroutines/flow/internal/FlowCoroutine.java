package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ScopeCoroutine;
import um0.InterfaceC27315f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class FlowCoroutine<T> extends ScopeCoroutine<T> {
    public FlowCoroutine(InterfaceC27315f interfaceC27315f, Continuation continuation) {
        super(interfaceC27315f, continuation);
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: q0 */
    public boolean mo112833q0(Throwable th2) {
        if (th2 instanceof ChildCancelledException) {
            return true;
        }
        return m112831l0(th2);
    }
}
