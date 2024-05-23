package kotlinx.coroutines;

import pm0.C24848g0;

/* loaded from: classes7.dex */
final class DisposeOnCancel extends CancelHandler {

    /* renamed from: p */
    private final DisposableHandle f105867p;

    public DisposeOnCancel(DisposableHandle disposableHandle) {
        this.f105867p = disposableHandle;
    }

    @Override // kotlinx.coroutines.CancelHandlerBase
    /* renamed from: g */
    public void mo112519g(Throwable th2) {
        this.f105867p.dispose();
    }

    @Override // en0.InterfaceC18505l
    /* renamed from: i9 */
    public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
        mo112519g((Throwable) obj);
        return C24848g0.f119245a;
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f105867p + ']';
    }
}
