package kotlinx.coroutines;

import en0.InterfaceC18505l;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24861r;

/* loaded from: classes.dex */
public final class CompletionStateKt {
    /* renamed from: a */
    public static final Object m112606a(Object obj, Continuation continuation) {
        if (obj instanceof CompletedExceptionally) {
            C24861r.a aVar = C24861r.f119264q;
            return C24861r.m129218b(AbstractC24862s.m129227a(((CompletedExceptionally) obj).f105828a));
        }
        return C24861r.m129218b(obj);
    }

    /* renamed from: b */
    public static final Object m112607b(Object obj, InterfaceC18505l interfaceC18505l) {
        Throwable m129221e = C24861r.m129221e(obj);
        if (m129221e == null) {
            if (interfaceC18505l != null) {
                return new CompletedWithCancellation(obj, interfaceC18505l);
            }
            return obj;
        }
        return new CompletedExceptionally(m129221e, false, 2, null);
    }

    /* renamed from: c */
    public static final Object m112608c(Object obj, CancellableContinuation cancellableContinuation) {
        Throwable m129221e = C24861r.m129221e(obj);
        if (m129221e != null) {
            return new CompletedExceptionally(m129221e, false, 2, null);
        }
        return obj;
    }

    /* renamed from: d */
    public static /* synthetic */ Object m112609d(Object obj, InterfaceC18505l interfaceC18505l, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            interfaceC18505l = null;
        }
        return m112607b(obj, interfaceC18505l);
    }
}
