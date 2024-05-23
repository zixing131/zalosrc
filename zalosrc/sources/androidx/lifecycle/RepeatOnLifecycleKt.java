package androidx.lifecycle;

import androidx.lifecycle.AbstractC1785o;
import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScopeKt;
import pm0.C24848g0;
import vm0.AbstractC28298d;

/* loaded from: classes2.dex */
public abstract class RepeatOnLifecycleKt {
    /* renamed from: a */
    public static final Object m9233a(AbstractC1785o abstractC1785o, AbstractC1785o.b bVar, InterfaceC18509p interfaceC18509p, Continuation continuation) {
        Object m142578e;
        if (bVar != AbstractC1785o.b.INITIALIZED) {
            if (abstractC1785o.mo9336b() == AbstractC1785o.b.DESTROYED) {
                return C24848g0.f119245a;
            }
            Object m112640d = CoroutineScopeKt.m112640d(new RepeatOnLifecycleKt$repeatOnLifecycle$3(abstractC1785o, bVar, interfaceC18509p, null), continuation);
            m142578e = AbstractC28298d.m142578e();
            if (m112640d == m142578e) {
                return m112640d;
            }
            return C24848g0.f119245a;
        }
        throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.".toString());
    }

    /* renamed from: b */
    public static final Object m9234b(InterfaceC1801w interfaceC1801w, AbstractC1785o.b bVar, InterfaceC18509p interfaceC18509p, Continuation continuation) {
        Object m142578e;
        Object m9233a = m9233a(interfaceC1801w.getLifecycle(), bVar, interfaceC18509p, continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m9233a == m142578e) {
            return m9233a;
        }
        return C24848g0.f119245a;
    }
}
