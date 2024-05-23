package kotlinx.coroutines.channels;

import en0.InterfaceC18505l;
import fn0.AbstractC19075u;
import pm0.AbstractC24845f;
import pm0.C24848g0;

/* loaded from: classes7.dex */
final class ChannelsKt__DeprecatedKt$consumesAll$1 extends AbstractC19075u implements InterfaceC18505l {

    /* renamed from: q */
    final /* synthetic */ ReceiveChannel[] f106103q;

    /* renamed from: a */
    public final void m113158a(Throwable th2) {
        Throwable th3 = null;
        for (ReceiveChannel receiveChannel : this.f106103q) {
            try {
                ChannelsKt.m113108b(receiveChannel, th2);
            } catch (Throwable th4) {
                if (th3 != null) {
                    AbstractC24845f.m129182a(th3, th4);
                } else {
                    th3 = th4;
                }
            }
        }
        if (th3 != null) {
            throw th3;
        }
    }

    @Override // en0.InterfaceC18505l
    /* renamed from: i9 */
    public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
        m113158a((Throwable) obj);
        return C24848g0.f119245a;
    }
}
