package kotlinx.coroutines;

import pm0.C24848g0;

/* loaded from: classes7.dex */
public final class ChildContinuation extends JobCancellingNode {

    /* renamed from: t */
    public final CancellableContinuationImpl f105820t;

    public ChildContinuation(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f105820t = cancellableContinuationImpl;
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
        CancellableContinuationImpl cancellableContinuationImpl = this.f105820t;
        cancellableContinuationImpl.m112576N(cancellableContinuationImpl.mo112589x(m112774s()));
    }
}
