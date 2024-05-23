package kotlinx.coroutines.flow.internal;

import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import pm0.C24848g0;
import vm0.AbstractC28298d;

/* loaded from: classes7.dex */
public final class SafeCollector_commonKt$unsafeFlow$1 implements Flow<Object> {

    /* renamed from: p */
    final /* synthetic */ InterfaceC18509p f107325p;

    @Override // kotlinx.coroutines.flow.Flow
    /* renamed from: a */
    public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
        Object m142578e;
        Object mo240pC = this.f107325p.mo240pC(flowCollector, continuation);
        m142578e = AbstractC28298d.m142578e();
        if (mo240pC == m142578e) {
            return mo240pC;
        }
        return C24848g0.f119245a;
    }
}
