package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.BroadcastChannel;
import pm0.C24848g0;
import vm0.AbstractC28298d;

/* loaded from: classes7.dex */
public final class FlowKt__ChannelsKt$asFlow$$inlined$unsafeFlow$1 implements Flow<Object> {

    /* renamed from: p */
    final /* synthetic */ BroadcastChannel f106499p;

    @Override // kotlinx.coroutines.flow.Flow
    /* renamed from: a */
    public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
        Object m142578e;
        Object m113300r = FlowKt.m113300r(flowCollector, this.f106499p.mo112900m(), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m113300r == m142578e) {
            return m113300r;
        }
        return C24848g0.f119245a;
    }
}
