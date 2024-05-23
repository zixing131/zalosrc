package androidx.lifecycle;

import fn0.AbstractC19074t;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import p001a.p005d.AbstractC0007b;

/* renamed from: androidx.lifecycle.u */
/* loaded from: classes2.dex */
public abstract class AbstractC1797u {
    /* renamed from: a */
    public static final AbstractC1791r m9373a(AbstractC1785o abstractC1785o) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        AbstractC19074t.m100208f(abstractC1785o, "<this>");
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) abstractC1785o.m9337c().get();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(abstractC1785o, SupervisorKt.m112864b(null, 1, null).mo112823d0(Dispatchers.m112681c().mo112861G0()));
        } while (!AbstractC0007b.m4a(abstractC1785o.m9337c(), null, lifecycleCoroutineScopeImpl));
        lifecycleCoroutineScopeImpl.m9209d();
        return lifecycleCoroutineScopeImpl;
    }
}
