package kotlinx.coroutines.intrinsics;

import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.DispatchedContinuationKt;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import vm0.AbstractC28297c;

/* loaded from: classes.dex */
public final class CancellableKt {
    /* renamed from: a */
    private static final void m113751a(Continuation continuation, Throwable th2) {
        C24861r.a aVar = C24861r.f119264q;
        continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(th2)));
        throw th2;
    }

    /* renamed from: b */
    public static final void m113752b(InterfaceC18509p interfaceC18509p, Object obj, Continuation continuation, InterfaceC18505l interfaceC18505l) {
        Continuation m142574a;
        Continuation m142576c;
        try {
            m142574a = AbstractC28297c.m142574a(interfaceC18509p, obj, continuation);
            m142576c = AbstractC28297c.m142576c(m142574a);
            C24861r.a aVar = C24861r.f119264q;
            DispatchedContinuationKt.m113612b(m142576c, C24861r.m129218b(C24848g0.f119245a), interfaceC18505l);
        } catch (Throwable th2) {
            m113751a(continuation, th2);
        }
    }

    /* renamed from: c */
    public static final void m113753c(Continuation continuation, Continuation continuation2) {
        Continuation m142576c;
        try {
            m142576c = AbstractC28297c.m142576c(continuation);
            C24861r.a aVar = C24861r.f119264q;
            DispatchedContinuationKt.m113613c(m142576c, C24861r.m129218b(C24848g0.f119245a), null, 2, null);
        } catch (Throwable th2) {
            m113751a(continuation2, th2);
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m113754d(InterfaceC18509p interfaceC18509p, Object obj, Continuation continuation, InterfaceC18505l interfaceC18505l, int i11, Object obj2) {
        if ((i11 & 4) != 0) {
            interfaceC18505l = null;
        }
        m113752b(interfaceC18509p, obj, continuation, interfaceC18505l);
    }
}
