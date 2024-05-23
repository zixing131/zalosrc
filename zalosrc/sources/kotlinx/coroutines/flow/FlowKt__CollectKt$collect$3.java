package kotlinx.coroutines.flow;

import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import pm0.C24848g0;
import vm0.AbstractC28298d;

/* loaded from: classes7.dex */
public final class FlowKt__CollectKt$collect$3 implements FlowCollector<Object> {

    /* renamed from: p */
    final /* synthetic */ InterfaceC18509p f106506p;

    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: b */
    public Object mo12109b(Object obj, Continuation continuation) {
        Object m142578e;
        Object mo240pC = this.f106506p.mo240pC(obj, continuation);
        m142578e = AbstractC28298d.m142578e();
        if (mo240pC == m142578e) {
            return mo240pC;
        }
        return C24848g0.f119245a;
    }
}
