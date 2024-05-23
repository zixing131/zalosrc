package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import pm0.C24848g0;

/* loaded from: classes7.dex */
public final class NopCollector implements FlowCollector<Object> {

    /* renamed from: p */
    public static final NopCollector f107312p = new NopCollector();

    private NopCollector() {
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: b */
    public Object mo12109b(Object obj, Continuation continuation) {
        return C24848g0.f119245a;
    }
}
