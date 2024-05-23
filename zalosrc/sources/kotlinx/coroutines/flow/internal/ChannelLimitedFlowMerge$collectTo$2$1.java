package kotlinx.coroutines.flow.internal;

import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1", m145345f = "Merge.kt", m145346l = {96}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
final class ChannelLimitedFlowMerge$collectTo$2$1 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: t */
    int f107241t;

    /* renamed from: u */
    final /* synthetic */ Flow f107242u;

    /* renamed from: v */
    final /* synthetic */ SendingCollector f107243v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelLimitedFlowMerge$collectTo$2$1(Flow flow, SendingCollector sendingCollector, Continuation continuation) {
        super(2, continuation);
        this.f107242u = flow;
        this.f107243v = sendingCollector;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        return new ChannelLimitedFlowMerge$collectTo$2$1(this.f107242u, this.f107243v, continuation);
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        Object m142578e;
        m142578e = AbstractC28298d.m142578e();
        int i11 = this.f107241t;
        if (i11 != 0) {
            if (i11 == 1) {
                AbstractC24862s.m129228b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC24862s.m129228b(obj);
            Flow flow = this.f107242u;
            SendingCollector sendingCollector = this.f107243v;
            this.f107241t = 1;
            if (flow.mo97893a(sendingCollector, this) == m142578e) {
                return m142578e;
            }
        }
        return C24848g0.f119245a;
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
        return ((ChannelLimitedFlowMerge$collectTo$2$1) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
    }
}
