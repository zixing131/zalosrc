package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.ScopeCoroutine;
import um0.InterfaceC27315f;

/* loaded from: classes7.dex */
public final class SafeCollector_commonKt {
    /* renamed from: a */
    public static final void m113562a(SafeCollector safeCollector, InterfaceC27315f interfaceC27315f) {
        if (((Number) interfaceC27315f.mo112826h(0, new SafeCollector_commonKt$checkContext$result$1(safeCollector))).intValue() == safeCollector.f107318u) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + safeCollector.f107317t + ",\n\t\tbut emission happened in " + interfaceC27315f + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    /* renamed from: b */
    public static final Job m113563b(Job job, Job job2) {
        while (job != null) {
            if (job == job2) {
                return job;
            }
            if (!(job instanceof ScopeCoroutine)) {
                return job;
            }
            job = job.getParent();
        }
        return null;
    }
}
