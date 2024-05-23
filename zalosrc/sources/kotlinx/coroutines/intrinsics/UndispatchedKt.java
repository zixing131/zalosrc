package kotlinx.coroutines.intrinsics;

import en0.InterfaceC18509p;
import fn0.AbstractC19069o0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CompletedExceptionally;
import kotlinx.coroutines.JobSupportKt;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.internal.ThreadContextKt;
import pm0.AbstractC24862s;
import pm0.C24861r;
import um0.InterfaceC27315f;
import vm0.AbstractC28298d;
import wm0.AbstractC29100h;

/* loaded from: classes7.dex */
public final class UndispatchedKt {
    /* renamed from: a */
    public static final void m113755a(InterfaceC18509p interfaceC18509p, Object obj, Continuation continuation) {
        Object m142578e;
        Continuation m145353a = AbstractC29100h.m145353a(continuation);
        try {
            InterfaceC27315f context = continuation.getContext();
            Object m113731c = ThreadContextKt.m113731c(context, null);
            try {
                Object mo240pC = ((InterfaceC18509p) AbstractC19069o0.m100188e(interfaceC18509p, 2)).mo240pC(obj, m145353a);
                m142578e = AbstractC28298d.m142578e();
                if (mo240pC != m142578e) {
                    m145353a.mo112492g(C24861r.m129218b(mo240pC));
                }
            } finally {
                ThreadContextKt.m113729a(context, m113731c);
            }
        } catch (Throwable th2) {
            C24861r.a aVar = C24861r.f119264q;
            m145353a.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(th2)));
        }
    }

    /* renamed from: b */
    public static final Object m113756b(ScopeCoroutine scopeCoroutine, Object obj, InterfaceC18509p interfaceC18509p) {
        Object completedExceptionally;
        Object m142578e;
        Object m142578e2;
        Object m142578e3;
        try {
            completedExceptionally = ((InterfaceC18509p) AbstractC19069o0.m100188e(interfaceC18509p, 2)).mo240pC(obj, scopeCoroutine);
        } catch (Throwable th2) {
            completedExceptionally = new CompletedExceptionally(th2, false, 2, null);
        }
        m142578e = AbstractC28298d.m142578e();
        if (completedExceptionally == m142578e) {
            m142578e3 = AbstractC28298d.m142578e();
            return m142578e3;
        }
        Object m112820P0 = scopeCoroutine.m112820P0(completedExceptionally);
        if (m112820P0 == JobSupportKt.f105928b) {
            m142578e2 = AbstractC28298d.m142578e();
            return m142578e2;
        }
        if (!(m112820P0 instanceof CompletedExceptionally)) {
            return JobSupportKt.m112860h(m112820P0);
        }
        throw ((CompletedExceptionally) m112820P0).f105828a;
    }

    /* renamed from: c */
    public static final Object m113757c(ScopeCoroutine scopeCoroutine, Object obj, InterfaceC18509p interfaceC18509p) {
        Object completedExceptionally;
        Object m142578e;
        Object m142578e2;
        Object m142578e3;
        try {
            completedExceptionally = ((InterfaceC18509p) AbstractC19069o0.m100188e(interfaceC18509p, 2)).mo240pC(obj, scopeCoroutine);
        } catch (Throwable th2) {
            completedExceptionally = new CompletedExceptionally(th2, false, 2, null);
        }
        m142578e = AbstractC28298d.m142578e();
        if (completedExceptionally == m142578e) {
            m142578e3 = AbstractC28298d.m142578e();
            return m142578e3;
        }
        Object m112820P0 = scopeCoroutine.m112820P0(completedExceptionally);
        if (m112820P0 == JobSupportKt.f105928b) {
            m142578e2 = AbstractC28298d.m142578e();
            return m142578e2;
        }
        if (m112820P0 instanceof CompletedExceptionally) {
            Throwable th3 = ((CompletedExceptionally) m112820P0).f105828a;
            if (th3 instanceof TimeoutCancellationException) {
                if (((TimeoutCancellationException) th3).f105949p == scopeCoroutine) {
                    if (completedExceptionally instanceof CompletedExceptionally) {
                        throw ((CompletedExceptionally) completedExceptionally).f105828a;
                    }
                } else {
                    throw th3;
                }
            } else {
                throw th3;
            }
        } else {
            completedExceptionally = JobSupportKt.m112860h(m112820P0);
        }
        return completedExceptionally;
    }
}
