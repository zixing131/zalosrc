package kotlinx.coroutines;

import java.util.concurrent.Future;
import pm0.C24848g0;

/* loaded from: classes7.dex */
final class CancelFutureOnCompletion extends JobNode {

    /* renamed from: t */
    private final Future f105812t;

    @Override // en0.InterfaceC18505l
    /* renamed from: i9 */
    public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
        mo112514r((Throwable) obj);
        return C24848g0.f119245a;
    }

    @Override // kotlinx.coroutines.CompletionHandlerBase
    /* renamed from: r */
    public void mo112514r(Throwable th2) {
        if (th2 != null) {
            this.f105812t.cancel(false);
        }
    }
}
