package kotlinx.coroutines.flow.internal;

import en0.InterfaceC18510q;
import fn0.AbstractC19060k;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import pm0.C24848g0;
import um0.C27316g;
import um0.InterfaceC27315f;
import vm0.AbstractC28298d;

/* loaded from: classes7.dex */
public final class ChannelFlowTransformLatest<T, R> extends ChannelFlowOperator<T, R> {

    /* renamed from: t */
    private final InterfaceC18510q f107221t;

    public /* synthetic */ ChannelFlowTransformLatest(InterfaceC18510q interfaceC18510q, Flow flow, InterfaceC27315f interfaceC27315f, int i11, BufferOverflow bufferOverflow, int i12, AbstractC19060k abstractC19060k) {
        this(interfaceC18510q, flow, (i12 & 4) != 0 ? C27316g.f128559p : interfaceC27315f, (i12 & 8) != 0 ? -2 : i11, (i12 & 16) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: j */
    protected ChannelFlow mo113259j(InterfaceC27315f interfaceC27315f, int i11, BufferOverflow bufferOverflow) {
        return new ChannelFlowTransformLatest(this.f107221t, this.f107217s, interfaceC27315f, i11, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlowOperator
    /* renamed from: s */
    public Object mo113536s(FlowCollector flowCollector, Continuation continuation) {
        Object m142578e;
        Object m112640d = CoroutineScopeKt.m112640d(new ChannelFlowTransformLatest$flowCollect$3(this, flowCollector, null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m112640d == m142578e) {
            return m112640d;
        }
        return C24848g0.f119245a;
    }

    public ChannelFlowTransformLatest(InterfaceC18510q interfaceC18510q, Flow flow, InterfaceC27315f interfaceC27315f, int i11, BufferOverflow bufferOverflow) {
        super(flow, interfaceC27315f, i11, bufferOverflow);
        this.f107221t = interfaceC18510q;
    }
}
