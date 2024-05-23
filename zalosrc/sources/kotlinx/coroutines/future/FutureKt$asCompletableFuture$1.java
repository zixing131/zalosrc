package kotlinx.coroutines.future;

import en0.InterfaceC18505l;
import fn0.AbstractC19075u;
import java.util.concurrent.CompletableFuture;
import kotlinx.coroutines.Deferred;
import pm0.C24848g0;

/* loaded from: classes7.dex */
final class FutureKt$asCompletableFuture$1 extends AbstractC19075u implements InterfaceC18505l {

    /* renamed from: q */
    final /* synthetic */ CompletableFuture f107339q;

    /* renamed from: r */
    final /* synthetic */ Deferred f107340r;

    /* renamed from: a */
    public final void m113570a(Throwable th2) {
        try {
            this.f107339q.complete(this.f107340r.mo112599r());
        } catch (Throwable th3) {
            this.f107339q.completeExceptionally(th3);
        }
    }

    @Override // en0.InterfaceC18505l
    /* renamed from: i9 */
    public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
        m113570a((Throwable) obj);
        return C24848g0.f119245a;
    }
}
