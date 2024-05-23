package kotlinx.coroutines.flow;

import en0.InterfaceC18494a;
import kotlin.coroutines.Continuation;
import pm0.C24848g0;
import vm0.AbstractC28298d;

/* loaded from: classes7.dex */
public final class FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$1 implements Flow<Object> {

    /* renamed from: p */
    final /* synthetic */ InterfaceC18494a f106430p;

    @Override // kotlinx.coroutines.flow.Flow
    /* renamed from: a */
    public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
        Object m142578e;
        Object mo12109b = flowCollector.mo12109b(this.f106430p.mo12V4(), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (mo12109b == m142578e) {
            return mo12109b;
        }
        return C24848g0.f119245a;
    }
}
