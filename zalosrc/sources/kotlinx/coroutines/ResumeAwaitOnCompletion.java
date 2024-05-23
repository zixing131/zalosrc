package kotlinx.coroutines;

import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class ResumeAwaitOnCompletion<T> extends JobNode {

    /* renamed from: t */
    private final CancellableContinuationImpl f105938t;

    public ResumeAwaitOnCompletion(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f105938t = cancellableContinuationImpl;
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
        Object m112815G0 = m112774s().m112815G0();
        if (m112815G0 instanceof CompletedExceptionally) {
            CancellableContinuationImpl cancellableContinuationImpl = this.f105938t;
            C24861r.a aVar = C24861r.f119264q;
            cancellableContinuationImpl.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(((CompletedExceptionally) m112815G0).f105828a)));
        } else {
            CancellableContinuationImpl cancellableContinuationImpl2 = this.f105938t;
            C24861r.a aVar2 = C24861r.f119264q;
            cancellableContinuationImpl2.mo112492g(C24861r.m129218b(JobSupportKt.m112860h(m112815G0)));
        }
    }
}
