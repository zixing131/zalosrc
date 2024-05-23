package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import pm0.C24848g0;
import vm0.AbstractC28298d;

/* loaded from: classes7.dex */
public final class FlowKt__MergeKt$flattenConcat$$inlined$unsafeFlow$1 implements Flow<Object> {

    /* renamed from: p */
    final /* synthetic */ Flow f106761p;

    @Override // kotlinx.coroutines.flow.Flow
    /* renamed from: a */
    public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
        Object m142578e;
        Object mo97893a = this.f106761p.mo97893a(new FlowKt__MergeKt$flattenConcat$1$1(flowCollector), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (mo97893a == m142578e) {
            return mo97893a;
        }
        return C24848g0.f119245a;
    }
}
