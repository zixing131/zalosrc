package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreKt;
import pm0.C24848g0;
import um0.InterfaceC27315f;
import vm0.AbstractC28298d;

/* loaded from: classes7.dex */
public final class ChannelFlowMerge<T> extends ChannelFlow<T> {

    /* renamed from: s */
    private final Flow f107202s;

    /* renamed from: t */
    private final int f107203t;

    public ChannelFlowMerge(Flow flow, int i11, InterfaceC27315f interfaceC27315f, int i12, BufferOverflow bufferOverflow) {
        super(interfaceC27315f, i12, bufferOverflow);
        this.f107202s = flow;
        this.f107203t = i11;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: e */
    protected String mo113261e() {
        return "concurrency=" + this.f107203t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: g */
    public Object mo113258g(ProducerScope producerScope, Continuation continuation) {
        Object m142578e;
        Semaphore m113931b = SemaphoreKt.m113931b(this.f107203t, 0, 2, null);
        SendingCollector sendingCollector = new SendingCollector(producerScope);
        Object mo97893a = this.f107202s.mo97893a(new ChannelFlowMerge$collectTo$2((Job) continuation.getContext().mo112624d(Job.f105897m), m113931b, producerScope, sendingCollector), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (mo97893a == m142578e) {
            return mo97893a;
        }
        return C24848g0.f119245a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: j */
    protected ChannelFlow mo113259j(InterfaceC27315f interfaceC27315f, int i11, BufferOverflow bufferOverflow) {
        return new ChannelFlowMerge(this.f107202s, this.f107203t, interfaceC27315f, i11, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: o */
    public ReceiveChannel mo113263o(CoroutineScope coroutineScope) {
        return ProduceKt.m113186c(coroutineScope, this.f107192p, this.f107193q, m113522m());
    }
}
