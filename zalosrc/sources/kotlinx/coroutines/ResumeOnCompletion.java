package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import pm0.C24848g0;
import pm0.C24861r;

/* loaded from: classes7.dex */
final class ResumeOnCompletion extends JobNode {

    /* renamed from: t */
    private final Continuation f105939t;

    public ResumeOnCompletion(Continuation continuation) {
        this.f105939t = continuation;
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
        Continuation continuation = this.f105939t;
        C24861r.a aVar = C24861r.f119264q;
        continuation.mo112492g(C24861r.m129218b(C24848g0.f119245a));
    }
}
