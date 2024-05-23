package kotlinx.coroutines;

import en0.InterfaceC18505l;
import pm0.C24848g0;

/* loaded from: classes7.dex */
final class InvokeOnCancel extends CancelHandler {

    /* renamed from: p */
    private final InterfaceC18505l f105893p;

    public InvokeOnCancel(InterfaceC18505l interfaceC18505l) {
        this.f105893p = interfaceC18505l;
    }

    @Override // kotlinx.coroutines.CancelHandlerBase
    /* renamed from: g */
    public void mo112519g(Throwable th2) {
        this.f105893p.mo205i9(th2);
    }

    @Override // en0.InterfaceC18505l
    /* renamed from: i9 */
    public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
        mo112519g((Throwable) obj);
        return C24848g0.f119245a;
    }

    public String toString() {
        return "InvokeOnCancel[" + DebugStringsKt.m112647a(this.f105893p) + '@' + DebugStringsKt.m112648b(this) + ']';
    }
}
