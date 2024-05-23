package kotlinx.coroutines;

import pm0.C24848g0;
import um0.InterfaceC27315f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class StandaloneCoroutine extends AbstractCoroutine<C24848g0> {
    public StandaloneCoroutine(InterfaceC27315f interfaceC27315f, boolean z11) {
        super(interfaceC27315f, true, z11);
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: H0 */
    protected boolean mo112816H0(Throwable th2) {
        CoroutineExceptionHandlerKt.m112629a(getContext(), th2);
        return true;
    }
}
