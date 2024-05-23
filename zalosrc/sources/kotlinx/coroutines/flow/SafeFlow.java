package kotlinx.coroutines.flow;

import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import pm0.C24848g0;
import vm0.AbstractC28298d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class SafeFlow<T> extends AbstractFlow<T> {

    /* renamed from: p */
    private final InterfaceC18509p f107108p;

    public SafeFlow(InterfaceC18509p interfaceC18509p) {
        this.f107108p = interfaceC18509p;
    }

    @Override // kotlinx.coroutines.flow.AbstractFlow
    /* renamed from: e */
    public Object mo113257e(FlowCollector flowCollector, Continuation continuation) {
        Object m142578e;
        Object mo240pC = this.f107108p.mo240pC(flowCollector, continuation);
        m142578e = AbstractC28298d.m142578e();
        if (mo240pC == m142578e) {
            return mo240pC;
        }
        return C24848g0.f119245a;
    }
}
