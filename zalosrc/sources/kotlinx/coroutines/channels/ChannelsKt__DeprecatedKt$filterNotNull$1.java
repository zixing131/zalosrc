package kotlinx.coroutines.channels;

import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNull$1", m145345f = "Deprecated.kt", m145346l = {}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
final class ChannelsKt__DeprecatedKt$filterNotNull$1 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: t */
    int f106158t;

    /* renamed from: u */
    /* synthetic */ Object f106159u;

    ChannelsKt__DeprecatedKt$filterNotNull$1(Continuation continuation) {
        super(2, continuation);
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        ChannelsKt__DeprecatedKt$filterNotNull$1 channelsKt__DeprecatedKt$filterNotNull$1 = new ChannelsKt__DeprecatedKt$filterNotNull$1(continuation);
        channelsKt__DeprecatedKt$filterNotNull$1.f106159u = obj;
        return channelsKt__DeprecatedKt$filterNotNull$1;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        boolean z11;
        AbstractC28298d.m142578e();
        if (this.f106158t == 0) {
            AbstractC24862s.m129228b(obj);
            if (this.f106159u != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            return AbstractC29094b.m145339a(z11);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(Object obj, Continuation continuation) {
        return ((ChannelsKt__DeprecatedKt$filterNotNull$1) mo238a(obj, continuation)).mo239o(C24848g0.f119245a);
    }
}
