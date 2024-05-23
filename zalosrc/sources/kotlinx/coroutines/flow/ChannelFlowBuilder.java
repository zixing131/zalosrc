package kotlinx.coroutines.flow;

import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import pm0.C24848g0;
import um0.C27316g;
import um0.InterfaceC27315f;
import vm0.AbstractC28298d;

/* loaded from: classes7.dex */
public class ChannelFlowBuilder<T> extends ChannelFlow<T> {

    /* renamed from: s */
    private final InterfaceC18509p f106419s;

    public /* synthetic */ ChannelFlowBuilder(InterfaceC18509p interfaceC18509p, InterfaceC27315f interfaceC27315f, int i11, BufferOverflow bufferOverflow, int i12, AbstractC19060k abstractC19060k) {
        this(interfaceC18509p, (i12 & 2) != 0 ? C27316g.f128559p : interfaceC27315f, (i12 & 4) != 0 ? -2 : i11, (i12 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    /* renamed from: p */
    static /* synthetic */ Object m113264p(ChannelFlowBuilder channelFlowBuilder, ProducerScope producerScope, Continuation continuation) {
        Object m142578e;
        Object mo240pC = channelFlowBuilder.f106419s.mo240pC(producerScope, continuation);
        m142578e = AbstractC28298d.m142578e();
        if (mo240pC == m142578e) {
            return mo240pC;
        }
        return C24848g0.f119245a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: g */
    public Object mo113258g(ProducerScope producerScope, Continuation continuation) {
        return m113264p(this, producerScope, continuation);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: j */
    protected ChannelFlow mo113259j(InterfaceC27315f interfaceC27315f, int i11, BufferOverflow bufferOverflow) {
        return new ChannelFlowBuilder(this.f106419s, interfaceC27315f, i11, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public String toString() {
        return "block[" + this.f106419s + "] -> " + super.toString();
    }

    public ChannelFlowBuilder(InterfaceC18509p interfaceC18509p, InterfaceC27315f interfaceC27315f, int i11, BufferOverflow bufferOverflow) {
        super(interfaceC27315f, i11, bufferOverflow);
        this.f106419s = interfaceC18509p;
    }
}
