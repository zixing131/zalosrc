package kotlinx.coroutines.flow.internal;

import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.Flow;
import pm0.C24848g0;
import um0.InterfaceC27315f;

/* loaded from: classes7.dex */
public final class ChannelLimitedFlowMerge<T> extends ChannelFlow<T> {

    /* renamed from: s */
    private final Iterable f107240s;

    public ChannelLimitedFlowMerge(Iterable iterable, InterfaceC27315f interfaceC27315f, int i11, BufferOverflow bufferOverflow) {
        super(interfaceC27315f, i11, bufferOverflow);
        this.f107240s = iterable;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: g */
    public Object mo113258g(ProducerScope producerScope, Continuation continuation) {
        SendingCollector sendingCollector = new SendingCollector(producerScope);
        Iterator<T> it = this.f107240s.iterator();
        while (it.hasNext()) {
            BuildersKt__Builders_commonKt.m112540d(producerScope, null, null, new ChannelLimitedFlowMerge$collectTo$2$1((Flow) it.next(), sendingCollector, null), 3, null);
        }
        return C24848g0.f119245a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: j */
    protected ChannelFlow mo113259j(InterfaceC27315f interfaceC27315f, int i11, BufferOverflow bufferOverflow) {
        return new ChannelLimitedFlowMerge(this.f107240s, interfaceC27315f, i11, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: o */
    public ReceiveChannel mo113263o(CoroutineScope coroutineScope) {
        return ProduceKt.m113186c(coroutineScope, this.f107192p, this.f107193q, m113522m());
    }
}
