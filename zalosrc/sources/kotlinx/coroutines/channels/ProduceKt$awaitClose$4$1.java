package kotlinx.coroutines.channels;

import en0.InterfaceC18505l;
import fn0.AbstractC19075u;
import kotlinx.coroutines.CancellableContinuation;
import pm0.C24848g0;
import pm0.C24861r;

/* loaded from: classes7.dex */
final class ProduceKt$awaitClose$4$1 extends AbstractC19075u implements InterfaceC18505l {

    /* renamed from: q */
    final /* synthetic */ CancellableContinuation f106301q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProduceKt$awaitClose$4$1(CancellableContinuation cancellableContinuation) {
        super(1);
        this.f106301q = cancellableContinuation;
    }

    /* renamed from: a */
    public final void m113191a(Throwable th2) {
        CancellableContinuation cancellableContinuation = this.f106301q;
        C24861r.a aVar = C24861r.f119264q;
        cancellableContinuation.mo112492g(C24861r.m129218b(C24848g0.f119245a));
    }

    @Override // en0.InterfaceC18505l
    /* renamed from: i9 */
    public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
        m113191a((Throwable) obj);
        return C24848g0.f119245a;
    }
}
