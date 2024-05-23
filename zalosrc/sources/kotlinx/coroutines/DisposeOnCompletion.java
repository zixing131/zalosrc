package kotlinx.coroutines;

import pm0.C24848g0;

/* loaded from: classes7.dex */
public final class DisposeOnCompletion extends JobNode {

    /* renamed from: t */
    private final DisposableHandle f105868t;

    public DisposeOnCompletion(DisposableHandle disposableHandle) {
        this.f105868t = disposableHandle;
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
        this.f105868t.dispose();
    }
}
