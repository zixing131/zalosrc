package kotlinx.coroutines.future;

import en0.InterfaceC18505l;
import fn0.AbstractC19075u;
import java.util.concurrent.CompletableFuture;
import pm0.C24848g0;

/* loaded from: classes7.dex */
final class FutureKt$asCompletableFuture$2 extends AbstractC19075u implements InterfaceC18505l {

    /* renamed from: q */
    final /* synthetic */ CompletableFuture f107341q;

    /* renamed from: a */
    public final void m113571a(Throwable th2) {
        if (th2 == null) {
            this.f107341q.complete(C24848g0.f119245a);
        } else {
            this.f107341q.completeExceptionally(th2);
        }
    }

    @Override // en0.InterfaceC18505l
    /* renamed from: i9 */
    public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
        m113571a((Throwable) obj);
        return C24848g0.f119245a;
    }
}
