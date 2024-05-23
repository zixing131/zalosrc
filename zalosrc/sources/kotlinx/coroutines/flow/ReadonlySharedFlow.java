package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.FusibleFlow;
import um0.InterfaceC27315f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class ReadonlySharedFlow<T> implements SharedFlow<T>, CancellableFlow<T>, FusibleFlow<T> {

    /* renamed from: p */
    private final Job f107104p;

    /* renamed from: q */
    private final /* synthetic */ SharedFlow f107105q;

    public ReadonlySharedFlow(SharedFlow sharedFlow, Job job) {
        this.f107104p = job;
        this.f107105q = sharedFlow;
    }

    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    /* renamed from: a */
    public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
        return this.f107105q.mo97893a(flowCollector, continuation);
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    /* renamed from: c */
    public Flow mo113437c(InterfaceC27315f interfaceC27315f, int i11, BufferOverflow bufferOverflow) {
        return SharedFlowKt.m113481e(this, interfaceC27315f, i11, bufferOverflow);
    }
}
