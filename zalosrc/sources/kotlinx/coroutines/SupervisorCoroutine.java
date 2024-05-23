package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ScopeCoroutine;
import um0.InterfaceC27315f;

/* loaded from: classes7.dex */
final class SupervisorCoroutine<T> extends ScopeCoroutine<T> {
    public SupervisorCoroutine(InterfaceC27315f interfaceC27315f, Continuation continuation) {
        super(interfaceC27315f, continuation);
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: q0 */
    public boolean mo112833q0(Throwable th2) {
        return false;
    }
}
