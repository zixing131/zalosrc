package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.DispatchedContinuationKt;
import pm0.C24848g0;
import um0.InterfaceC27315f;
import vm0.AbstractC28297c;
import vm0.AbstractC28298d;
import wm0.AbstractC29100h;

/* loaded from: classes7.dex */
public final class YieldKt {
    /* renamed from: a */
    public static final Object m112882a(Continuation continuation) {
        Continuation m142576c;
        DispatchedContinuation dispatchedContinuation;
        Object m142578e;
        Object m142578e2;
        Object m142578e3;
        InterfaceC27315f context = continuation.getContext();
        JobKt.m112758k(context);
        m142576c = AbstractC28297c.m142576c(continuation);
        if (m142576c instanceof DispatchedContinuation) {
            dispatchedContinuation = (DispatchedContinuation) m142576c;
        } else {
            dispatchedContinuation = null;
        }
        if (dispatchedContinuation == null) {
            m142578e = C24848g0.f119245a;
        } else {
            if (dispatchedContinuation.f107357s.mo9278E0(context)) {
                dispatchedContinuation.m113606q(context, C24848g0.f119245a);
            } else {
                YieldContext yieldContext = new YieldContext();
                InterfaceC27315f mo112823d0 = context.mo112823d0(yieldContext);
                C24848g0 c24848g0 = C24848g0.f119245a;
                dispatchedContinuation.m113606q(mo112823d0, c24848g0);
                if (yieldContext.f105960q) {
                    m142578e = DispatchedContinuationKt.m113614d(dispatchedContinuation) ? AbstractC28298d.m142578e() : c24848g0;
                }
            }
            m142578e = AbstractC28298d.m142578e();
        }
        m142578e2 = AbstractC28298d.m142578e();
        if (m142578e == m142578e2) {
            AbstractC29100h.m145355c(continuation);
        }
        m142578e3 = AbstractC28298d.m142578e();
        if (m142578e == m142578e3) {
            return m142578e;
        }
        return C24848g0.f119245a;
    }
}
