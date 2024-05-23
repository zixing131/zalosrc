package kotlinx.coroutines.channels;

import en0.InterfaceC18505l;
import fn0.AbstractC19075u;
import pm0.C24848g0;

/* loaded from: classes7.dex */
final class BroadcastKt$broadcast$1 extends AbstractC19075u implements InterfaceC18505l {

    /* renamed from: q */
    final /* synthetic */ ReceiveChannel f105993q;

    /* renamed from: a */
    public final void m112921a(Throwable th2) {
        ChannelsKt.m113108b(this.f105993q, th2);
    }

    @Override // en0.InterfaceC18505l
    /* renamed from: i9 */
    public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
        m112921a((Throwable) obj);
        return C24848g0.f119245a;
    }
}
