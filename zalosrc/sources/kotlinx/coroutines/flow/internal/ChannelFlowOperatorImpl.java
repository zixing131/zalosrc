package kotlinx.coroutines.flow.internal;

import fn0.AbstractC19060k;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import pm0.C24848g0;
import um0.C27316g;
import um0.InterfaceC27315f;
import vm0.AbstractC28298d;

/* loaded from: classes7.dex */
public final class ChannelFlowOperatorImpl<T> extends ChannelFlowOperator<T, T> {
    public /* synthetic */ ChannelFlowOperatorImpl(Flow flow, InterfaceC27315f interfaceC27315f, int i11, BufferOverflow bufferOverflow, int i12, AbstractC19060k abstractC19060k) {
        this(flow, (i12 & 2) != 0 ? C27316g.f128559p : interfaceC27315f, (i12 & 4) != 0 ? -3 : i11, (i12 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: j */
    protected ChannelFlow mo113259j(InterfaceC27315f interfaceC27315f, int i11, BufferOverflow bufferOverflow) {
        return new ChannelFlowOperatorImpl(this.f107217s, interfaceC27315f, i11, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: k */
    public Flow mo113262k() {
        return this.f107217s;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.ChannelFlowOperator
    /* renamed from: s */
    public Object mo113536s(FlowCollector flowCollector, Continuation continuation) {
        Object m142578e;
        Object mo97893a = this.f107217s.mo97893a(flowCollector, continuation);
        m142578e = AbstractC28298d.m142578e();
        if (mo97893a == m142578e) {
            return mo97893a;
        }
        return C24848g0.f119245a;
    }

    public ChannelFlowOperatorImpl(Flow flow, InterfaceC27315f interfaceC27315f, int i11, BufferOverflow bufferOverflow) {
        super(flow, interfaceC27315f, i11, bufferOverflow);
    }
}
