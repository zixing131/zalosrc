package kotlinx.coroutines.flow.internal;

import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.ProducerScope;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

/* JADX INFO: Access modifiers changed from: package-private */
@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", m145345f = "ChannelFlow.kt", m145346l = {60}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class ChannelFlow$collectToFun$1 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: t */
    int f107199t;

    /* renamed from: u */
    /* synthetic */ Object f107200u;

    /* renamed from: v */
    final /* synthetic */ ChannelFlow f107201v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelFlow$collectToFun$1(ChannelFlow channelFlow, Continuation continuation) {
        super(2, continuation);
        this.f107201v = channelFlow;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        ChannelFlow$collectToFun$1 channelFlow$collectToFun$1 = new ChannelFlow$collectToFun$1(this.f107201v, continuation);
        channelFlow$collectToFun$1.f107200u = obj;
        return channelFlow$collectToFun$1;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        Object m142578e;
        m142578e = AbstractC28298d.m142578e();
        int i11 = this.f107199t;
        if (i11 != 0) {
            if (i11 == 1) {
                AbstractC24862s.m129228b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC24862s.m129228b(obj);
            ProducerScope producerScope = (ProducerScope) this.f107200u;
            ChannelFlow channelFlow = this.f107201v;
            this.f107199t = 1;
            if (channelFlow.mo113258g(producerScope, this) == m142578e) {
                return m142578e;
            }
        }
        return C24848g0.f119245a;
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(ProducerScope producerScope, Continuation continuation) {
        return ((ChannelFlow$collectToFun$1) mo238a(producerScope, continuation)).mo239o(C24848g0.f119245a);
    }
}
