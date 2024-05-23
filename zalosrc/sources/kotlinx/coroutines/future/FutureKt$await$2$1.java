package kotlinx.coroutines.future;

import en0.InterfaceC18505l;
import fn0.AbstractC19075u;
import java.util.concurrent.CompletableFuture;
import pm0.C24848g0;

/* loaded from: classes7.dex */
final class FutureKt$await$2$1 extends AbstractC19075u implements InterfaceC18505l {

    /* renamed from: q */
    final /* synthetic */ CompletableFuture f107343q;

    /* renamed from: r */
    final /* synthetic */ ContinuationHandler f107344r;

    /* renamed from: a */
    public final void m113573a(Throwable th2) {
        this.f107343q.cancel(false);
        this.f107344r.cont = null;
    }

    @Override // en0.InterfaceC18505l
    /* renamed from: i9 */
    public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
        m113573a((Throwable) obj);
        return C24848g0.f119245a;
    }
}
