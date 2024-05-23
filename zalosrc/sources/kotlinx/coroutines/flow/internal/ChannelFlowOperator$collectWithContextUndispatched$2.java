package kotlinx.coroutines.flow.internal;

import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

/* JADX INFO: Access modifiers changed from: package-private */
@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", m145345f = "ChannelFlow.kt", m145346l = {152}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class ChannelFlowOperator$collectWithContextUndispatched$2 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: t */
    int f107218t;

    /* renamed from: u */
    /* synthetic */ Object f107219u;

    /* renamed from: v */
    final /* synthetic */ ChannelFlowOperator f107220v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelFlowOperator$collectWithContextUndispatched$2(ChannelFlowOperator channelFlowOperator, Continuation continuation) {
        super(2, continuation);
        this.f107220v = channelFlowOperator;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        ChannelFlowOperator$collectWithContextUndispatched$2 channelFlowOperator$collectWithContextUndispatched$2 = new ChannelFlowOperator$collectWithContextUndispatched$2(this.f107220v, continuation);
        channelFlowOperator$collectWithContextUndispatched$2.f107219u = obj;
        return channelFlowOperator$collectWithContextUndispatched$2;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        Object m142578e;
        m142578e = AbstractC28298d.m142578e();
        int i11 = this.f107218t;
        if (i11 != 0) {
            if (i11 == 1) {
                AbstractC24862s.m129228b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC24862s.m129228b(obj);
            FlowCollector flowCollector = (FlowCollector) this.f107219u;
            ChannelFlowOperator channelFlowOperator = this.f107220v;
            this.f107218t = 1;
            if (channelFlowOperator.mo113536s(flowCollector, this) == m142578e) {
                return m142578e;
            }
        }
        return C24848g0.f119245a;
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
        return ((ChannelFlowOperator$collectWithContextUndispatched$2) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
    }
}
