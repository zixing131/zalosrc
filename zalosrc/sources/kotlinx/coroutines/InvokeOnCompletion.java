package kotlinx.coroutines;

import en0.InterfaceC18505l;
import pm0.C24848g0;

/* loaded from: classes7.dex */
final class InvokeOnCompletion extends JobNode {

    /* renamed from: t */
    private final InterfaceC18505l f105896t;

    public InvokeOnCompletion(InterfaceC18505l interfaceC18505l) {
        this.f105896t = interfaceC18505l;
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
        this.f105896t.mo205i9(th2);
    }
}
