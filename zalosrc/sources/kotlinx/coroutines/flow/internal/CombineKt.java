package kotlinx.coroutines.flow.internal;

import en0.InterfaceC18494a;
import en0.InterfaceC18510q;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import pm0.C24848g0;
import vm0.AbstractC28298d;

/* loaded from: classes7.dex */
public final class CombineKt {
    /* renamed from: a */
    public static final Object m113542a(FlowCollector flowCollector, Flow[] flowArr, InterfaceC18494a interfaceC18494a, InterfaceC18510q interfaceC18510q, Continuation continuation) {
        Object m142578e;
        Object m113550a = FlowCoroutineKt.m113550a(new CombineKt$combineInternal$2(flowArr, interfaceC18494a, interfaceC18510q, flowCollector, null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m113550a == m142578e) {
            return m113550a;
        }
        return C24848g0.f119245a;
    }
}
