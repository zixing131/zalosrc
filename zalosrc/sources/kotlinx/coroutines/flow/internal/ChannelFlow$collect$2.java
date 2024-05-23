package kotlinx.coroutines.flow.internal;

import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

/* JADX INFO: Access modifiers changed from: package-private */
@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", m145345f = "ChannelFlow.kt", m145346l = {123}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class ChannelFlow$collect$2 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: t */
    int f107195t;

    /* renamed from: u */
    private /* synthetic */ Object f107196u;

    /* renamed from: v */
    final /* synthetic */ FlowCollector f107197v;

    /* renamed from: w */
    final /* synthetic */ ChannelFlow f107198w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelFlow$collect$2(FlowCollector flowCollector, ChannelFlow channelFlow, Continuation continuation) {
        super(2, continuation);
        this.f107197v = flowCollector;
        this.f107198w = channelFlow;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        ChannelFlow$collect$2 channelFlow$collect$2 = new ChannelFlow$collect$2(this.f107197v, this.f107198w, continuation);
        channelFlow$collect$2.f107196u = obj;
        return channelFlow$collect$2;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        Object m142578e;
        m142578e = AbstractC28298d.m142578e();
        int i11 = this.f107195t;
        if (i11 != 0) {
            if (i11 == 1) {
                AbstractC24862s.m129228b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC24862s.m129228b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f107196u;
            FlowCollector flowCollector = this.f107197v;
            ReceiveChannel mo113263o = this.f107198w.mo113263o(coroutineScope);
            this.f107195t = 1;
            if (FlowKt.m113300r(flowCollector, mo113263o, this) == m142578e) {
                return m142578e;
            }
        }
        return C24848g0.f119245a;
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
        return ((ChannelFlow$collect$2) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
    }
}
