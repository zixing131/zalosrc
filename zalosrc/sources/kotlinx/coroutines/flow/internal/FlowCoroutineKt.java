package kotlinx.coroutines.flow.internal;

import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.intrinsics.UndispatchedKt;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29100h;

/* loaded from: classes7.dex */
public final class FlowCoroutineKt {
    /* renamed from: a */
    public static final Object m113550a(InterfaceC18509p interfaceC18509p, Continuation continuation) {
        Object m142578e;
        FlowCoroutine flowCoroutine = new FlowCoroutine(continuation.getContext(), continuation);
        Object m113756b = UndispatchedKt.m113756b(flowCoroutine, flowCoroutine, interfaceC18509p);
        m142578e = AbstractC28298d.m142578e();
        if (m113756b == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m113756b;
    }

    /* renamed from: b */
    public static final Flow m113551b(InterfaceC18510q interfaceC18510q) {
        return new Flow<Object>() { // from class: kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1
            public FlowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1() {
            }

            @Override // kotlinx.coroutines.flow.Flow
            /* renamed from: a */
            public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
                Object m142578e;
                Object m113550a = FlowCoroutineKt.m113550a(new FlowCoroutineKt$scopedFlow$1$1(InterfaceC18510q.this, flowCollector, null), continuation);
                m142578e = AbstractC28298d.m142578e();
                if (m113550a == m142578e) {
                    return m113550a;
                }
                return C24848g0.f119245a;
            }
        };
    }
}
