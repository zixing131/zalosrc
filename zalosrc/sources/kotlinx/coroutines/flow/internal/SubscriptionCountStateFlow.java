package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class SubscriptionCountStateFlow extends SharedFlowImpl<Integer> implements StateFlow<Integer> {
    public SubscriptionCountStateFlow(int i11) {
        super(1, Integer.MAX_VALUE, BufferOverflow.DROP_OLDEST);
        mo113433d(Integer.valueOf(i11));
    }

    @Override // kotlinx.coroutines.flow.StateFlow
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public Integer getValue() {
        Integer valueOf;
        synchronized (this) {
            valueOf = Integer.valueOf(((Number) m113472N()).intValue());
        }
        return valueOf;
    }

    /* renamed from: b0 */
    public final boolean m113566b0(int i11) {
        boolean mo113433d;
        synchronized (this) {
            mo113433d = mo113433d(Integer.valueOf(((Number) m113472N()).intValue() + i11));
        }
        return mo113433d;
    }
}
