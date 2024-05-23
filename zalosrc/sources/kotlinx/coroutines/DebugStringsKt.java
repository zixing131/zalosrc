package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.DispatchedContinuation;
import pm0.AbstractC24862s;
import pm0.C24861r;

/* loaded from: classes7.dex */
public final class DebugStringsKt {
    /* renamed from: a */
    public static final String m112647a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    /* renamed from: b */
    public static final String m112648b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* renamed from: c */
    public static final String m112649c(Continuation continuation) {
        Object m129218b;
        if (continuation instanceof DispatchedContinuation) {
            return continuation.toString();
        }
        try {
            C24861r.a aVar = C24861r.f119264q;
            m129218b = C24861r.m129218b(continuation + '@' + m112648b(continuation));
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
        if (C24861r.m129221e(m129218b) != null) {
            m129218b = continuation.getClass().getName() + '@' + m112648b(continuation);
        }
        return (String) m129218b;
    }
}
