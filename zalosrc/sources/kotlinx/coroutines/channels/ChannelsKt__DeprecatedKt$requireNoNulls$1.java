package kotlinx.coroutines.channels;

import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$requireNoNulls$1", m145345f = "Deprecated.kt", m145346l = {}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
final class ChannelsKt__DeprecatedKt$requireNoNulls$1 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: t */
    int f106236t;

    /* renamed from: u */
    /* synthetic */ Object f106237u;

    /* renamed from: v */
    final /* synthetic */ ReceiveChannel f106238v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChannelsKt__DeprecatedKt$requireNoNulls$1(ReceiveChannel receiveChannel, Continuation continuation) {
        super(2, continuation);
        this.f106238v = receiveChannel;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        ChannelsKt__DeprecatedKt$requireNoNulls$1 channelsKt__DeprecatedKt$requireNoNulls$1 = new ChannelsKt__DeprecatedKt$requireNoNulls$1(this.f106238v, continuation);
        channelsKt__DeprecatedKt$requireNoNulls$1.f106237u = obj;
        return channelsKt__DeprecatedKt$requireNoNulls$1;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        AbstractC28298d.m142578e();
        if (this.f106236t == 0) {
            AbstractC24862s.m129228b(obj);
            Object obj2 = this.f106237u;
            if (obj2 != null) {
                return obj2;
            }
            throw new IllegalArgumentException("null element found in " + this.f106238v + '.');
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(Object obj, Continuation continuation) {
        return ((ChannelsKt__DeprecatedKt$requireNoNulls$1) mo238a(obj, continuation)).mo239o(C24848g0.f119245a);
    }
}
