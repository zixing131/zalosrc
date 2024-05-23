package kotlinx.coroutines.flow.internal;

import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.ThreadContextKt;
import pm0.C24848g0;
import um0.InterfaceC27315f;
import vm0.AbstractC28298d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class UndispatchedContextCollector<T> implements FlowCollector<T> {

    /* renamed from: p */
    private final InterfaceC27315f f107332p;

    /* renamed from: q */
    private final Object f107333q;

    /* renamed from: r */
    private final InterfaceC18509p f107334r;

    public UndispatchedContextCollector(FlowCollector flowCollector, InterfaceC27315f interfaceC27315f) {
        this.f107332p = interfaceC27315f;
        this.f107333q = ThreadContextKt.m113730b(interfaceC27315f);
        this.f107334r = new UndispatchedContextCollector$emitRef$1(flowCollector, null);
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: b */
    public Object mo12109b(Object obj, Continuation continuation) {
        Object m142578e;
        Object m113528c = ChannelFlowKt.m113528c(this.f107332p, obj, this.f107333q, this.f107334r, continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m113528c == m142578e) {
            return m113528c;
        }
        return C24848g0.f119245a;
    }
}
