package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;

/* loaded from: classes7.dex */
public final class SharedFlowSlot extends AbstractSharedFlowSlot<SharedFlowImpl<?>> {

    /* renamed from: a */
    public long f107130a = -1;

    /* renamed from: b */
    public Continuation f107131b;

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo113484a(SharedFlowImpl sharedFlowImpl) {
        if (this.f107130a >= 0) {
            return false;
        }
        this.f107130a = sharedFlowImpl.m113474Z();
        return true;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Continuation[] mo113485b(SharedFlowImpl sharedFlowImpl) {
        long j11 = this.f107130a;
        this.f107130a = -1L;
        this.f107131b = null;
        return sharedFlowImpl.m113473Y(j11);
    }
}
