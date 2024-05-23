package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes7.dex */
public final class FlowExceptions_commonKt {
    /* renamed from: a */
    public static final void m113553a(AbortFlowException abortFlowException, FlowCollector flowCollector) {
        if (abortFlowException.f107186p == flowCollector) {
        } else {
            throw abortFlowException;
        }
    }
}
