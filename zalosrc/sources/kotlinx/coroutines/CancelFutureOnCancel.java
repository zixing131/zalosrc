package kotlinx.coroutines;

import java.util.concurrent.Future;
import pm0.C24848g0;

/* loaded from: classes7.dex */
final class CancelFutureOnCancel extends CancelHandler {

    /* renamed from: p */
    private final Future f105811p;

    public CancelFutureOnCancel(Future future) {
        this.f105811p = future;
    }

    @Override // kotlinx.coroutines.CancelHandlerBase
    /* renamed from: g */
    public void mo112519g(Throwable th2) {
        if (th2 != null) {
            this.f105811p.cancel(false);
        }
    }

    @Override // en0.InterfaceC18505l
    /* renamed from: i9 */
    public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
        mo112519g((Throwable) obj);
        return C24848g0.f119245a;
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.f105811p + ']';
    }
}
