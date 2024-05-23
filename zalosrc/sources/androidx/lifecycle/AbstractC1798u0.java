package androidx.lifecycle;

import fn0.AbstractC19074t;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;

/* renamed from: androidx.lifecycle.u0 */
/* loaded from: classes2.dex */
public abstract class AbstractC1798u0 {
    /* renamed from: a */
    public static final CoroutineScope m9374a(AbstractC1796t0 abstractC1796t0) {
        AbstractC19074t.m100208f(abstractC1796t0, "<this>");
        CoroutineScope coroutineScope = (CoroutineScope) abstractC1796t0.m9371I("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        if (coroutineScope != null) {
            return coroutineScope;
        }
        Object m9372K = abstractC1796t0.m9372K("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY", new C1763d(SupervisorKt.m112864b(null, 1, null).mo112823d0(Dispatchers.m112681c().mo112861G0())));
        AbstractC19074t.m100207e(m9372K, "setTagIfAbsent(\n        …Main.immediate)\n        )");
        return (CoroutineScope) m9372K;
    }
}
