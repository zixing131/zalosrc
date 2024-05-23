package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.FusibleFlow;
import um0.InterfaceC27315f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ReadonlyStateFlow<T> implements StateFlow<T>, CancellableFlow<T>, FusibleFlow<T> {

    /* renamed from: p */
    private final Job f107106p;

    /* renamed from: q */
    private final /* synthetic */ StateFlow f107107q;

    public ReadonlyStateFlow(StateFlow stateFlow, Job job) {
        this.f107106p = job;
        this.f107107q = stateFlow;
    }

    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    /* renamed from: a */
    public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
        return this.f107107q.mo97893a(flowCollector, continuation);
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    /* renamed from: c */
    public Flow mo113437c(InterfaceC27315f interfaceC27315f, int i11, BufferOverflow bufferOverflow) {
        return StateFlowKt.m113506d(this, interfaceC27315f, i11, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.StateFlow
    public Object getValue() {
        return this.f107107q.getValue();
    }
}
