package kotlinx.coroutines.flow;

import fn0.AbstractC19060k;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import kotlinx.coroutines.flow.internal.SendingCollector;
import pm0.C24848g0;
import um0.C27316g;
import um0.InterfaceC27315f;
import vm0.AbstractC28298d;

/* loaded from: classes7.dex */
public final class ChannelAsFlow<T> extends ChannelFlow<T> {

    /* renamed from: u */
    private static final AtomicIntegerFieldUpdater f106416u = AtomicIntegerFieldUpdater.newUpdater(ChannelAsFlow.class, "consumed");
    private volatile int consumed;

    /* renamed from: s */
    private final ReceiveChannel f106417s;

    /* renamed from: t */
    private final boolean f106418t;

    public /* synthetic */ ChannelAsFlow(ReceiveChannel receiveChannel, boolean z11, InterfaceC27315f interfaceC27315f, int i11, BufferOverflow bufferOverflow, int i12, AbstractC19060k abstractC19060k) {
        this(receiveChannel, z11, (i12 & 4) != 0 ? C27316g.f128559p : interfaceC27315f, (i12 & 8) != 0 ? -3 : i11, (i12 & 16) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    /* renamed from: p */
    private final void m113260p() {
        if (this.f106418t && f106416u.getAndSet(this, 1) != 0) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
        }
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, kotlinx.coroutines.flow.Flow
    /* renamed from: a */
    public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
        Object m142578e;
        Object m113315c;
        Object m142578e2;
        if (this.f107193q == -3) {
            m113260p();
            m113315c = FlowKt__ChannelsKt.m113315c(flowCollector, this.f106417s, this.f106418t, continuation);
            m142578e2 = AbstractC28298d.m142578e();
            if (m113315c == m142578e2) {
                return m113315c;
            }
            return C24848g0.f119245a;
        }
        Object mo97893a = super.mo97893a(flowCollector, continuation);
        m142578e = AbstractC28298d.m142578e();
        if (mo97893a == m142578e) {
            return mo97893a;
        }
        return C24848g0.f119245a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: e */
    protected String mo113261e() {
        return "channel=" + this.f106417s;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: g */
    public Object mo113258g(ProducerScope producerScope, Continuation continuation) {
        Object m113315c;
        Object m142578e;
        m113315c = FlowKt__ChannelsKt.m113315c(new SendingCollector(producerScope), this.f106417s, this.f106418t, continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m113315c == m142578e) {
            return m113315c;
        }
        return C24848g0.f119245a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: j */
    protected ChannelFlow mo113259j(InterfaceC27315f interfaceC27315f, int i11, BufferOverflow bufferOverflow) {
        return new ChannelAsFlow(this.f106417s, this.f106418t, interfaceC27315f, i11, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: k */
    public Flow mo113262k() {
        return new ChannelAsFlow(this.f106417s, this.f106418t, null, 0, null, 28, null);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: o */
    public ReceiveChannel mo113263o(CoroutineScope coroutineScope) {
        m113260p();
        if (this.f107193q == -3) {
            return this.f106417s;
        }
        return super.mo113263o(coroutineScope);
    }

    public ChannelAsFlow(ReceiveChannel receiveChannel, boolean z11, InterfaceC27315f interfaceC27315f, int i11, BufferOverflow bufferOverflow) {
        super(interfaceC27315f, i11, bufferOverflow);
        this.f106417s = receiveChannel;
        this.f106418t = z11;
        this.consumed = 0;
    }
}
