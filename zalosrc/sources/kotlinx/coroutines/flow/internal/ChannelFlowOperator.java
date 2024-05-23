package kotlinx.coroutines.flow.internal;

import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import pm0.C24848g0;
import um0.InterfaceC27313d;
import um0.InterfaceC27315f;
import vm0.AbstractC28298d;

/* loaded from: classes7.dex */
public abstract class ChannelFlowOperator<S, T> extends ChannelFlow<T> {

    /* renamed from: s */
    protected final Flow f107217s;

    public ChannelFlowOperator(Flow flow, InterfaceC27315f interfaceC27315f, int i11, BufferOverflow bufferOverflow) {
        super(interfaceC27315f, i11, bufferOverflow);
        this.f107217s = flow;
    }

    /* renamed from: p */
    static /* synthetic */ Object m113533p(ChannelFlowOperator channelFlowOperator, FlowCollector flowCollector, Continuation continuation) {
        Object m142578e;
        Object m142578e2;
        Object m142578e3;
        if (channelFlowOperator.f107193q == -3) {
            InterfaceC27315f context = continuation.getContext();
            InterfaceC27315f mo112823d0 = context.mo112823d0(channelFlowOperator.f107192p);
            if (AbstractC19074t.m100204b(mo112823d0, context)) {
                Object mo113536s = channelFlowOperator.mo113536s(flowCollector, continuation);
                m142578e3 = AbstractC28298d.m142578e();
                if (mo113536s == m142578e3) {
                    return mo113536s;
                }
                return C24848g0.f119245a;
            }
            InterfaceC27313d.b bVar = InterfaceC27313d.f128556o;
            if (AbstractC19074t.m100204b(mo112823d0.mo112624d(bVar), context.mo112624d(bVar))) {
                Object m113535r = channelFlowOperator.m113535r(flowCollector, mo112823d0, continuation);
                m142578e2 = AbstractC28298d.m142578e();
                if (m113535r == m142578e2) {
                    return m113535r;
                }
                return C24848g0.f119245a;
            }
        }
        Object mo97893a = super.mo97893a(flowCollector, continuation);
        m142578e = AbstractC28298d.m142578e();
        if (mo97893a == m142578e) {
            return mo97893a;
        }
        return C24848g0.f119245a;
    }

    /* renamed from: q */
    static /* synthetic */ Object m113534q(ChannelFlowOperator channelFlowOperator, ProducerScope producerScope, Continuation continuation) {
        Object m142578e;
        Object mo113536s = channelFlowOperator.mo113536s(new SendingCollector(producerScope), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (mo113536s == m142578e) {
            return mo113536s;
        }
        return C24848g0.f119245a;
    }

    /* renamed from: r */
    private final Object m113535r(FlowCollector flowCollector, InterfaceC27315f interfaceC27315f, Continuation continuation) {
        FlowCollector m113530e;
        Object m142578e;
        m113530e = ChannelFlowKt.m113530e(flowCollector, continuation.getContext());
        Object m113529d = ChannelFlowKt.m113529d(interfaceC27315f, m113530e, null, new ChannelFlowOperator$collectWithContextUndispatched$2(this, null), continuation, 4, null);
        m142578e = AbstractC28298d.m142578e();
        if (m113529d == m142578e) {
            return m113529d;
        }
        return C24848g0.f119245a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, kotlinx.coroutines.flow.Flow
    /* renamed from: a */
    public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
        return m113533p(this, flowCollector, continuation);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: g */
    public Object mo113258g(ProducerScope producerScope, Continuation continuation) {
        return m113534q(this, producerScope, continuation);
    }

    /* renamed from: s */
    public abstract Object mo113536s(FlowCollector flowCollector, Continuation continuation);

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public String toString() {
        return this.f107217s + " -> " + super.toString();
    }
}
