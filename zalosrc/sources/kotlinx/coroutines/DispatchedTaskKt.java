package kotlinx.coroutines;

import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.ThreadContextKt;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import um0.InterfaceC27315f;

/* loaded from: classes.dex */
public final class DispatchedTaskKt {
    /* renamed from: a */
    public static final void m112674a(DispatchedTask dispatchedTask, int i11) {
        boolean z11;
        Continuation mo112581d = dispatchedTask.mo112581d();
        if (i11 == 4) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 && (mo112581d instanceof DispatchedContinuation) && m112675b(i11) == m112675b(dispatchedTask.f105860r)) {
            CoroutineDispatcher coroutineDispatcher = ((DispatchedContinuation) mo112581d).f107357s;
            InterfaceC27315f context = mo112581d.getContext();
            if (coroutineDispatcher.mo9278E0(context)) {
                coroutineDispatcher.mo9279z0(context, dispatchedTask);
                return;
            } else {
                m112678e(dispatchedTask);
                return;
            }
        }
        m112677d(dispatchedTask, mo112581d, z11);
    }

    /* renamed from: b */
    public static final boolean m112675b(int i11) {
        return i11 == 1 || i11 == 2;
    }

    /* renamed from: c */
    public static final boolean m112676c(int i11) {
        return i11 == 2;
    }

    /* renamed from: d */
    public static final void m112677d(DispatchedTask dispatchedTask, Continuation continuation, boolean z11) {
        Object mo112584i;
        UndispatchedCoroutine undispatchedCoroutine;
        boolean m112880t1;
        Object mo112585m = dispatchedTask.mo112585m();
        Throwable mo112583h = dispatchedTask.mo112583h(mo112585m);
        if (mo112583h != null) {
            C24861r.a aVar = C24861r.f119264q;
            mo112584i = AbstractC24862s.m129227a(mo112583h);
        } else {
            C24861r.a aVar2 = C24861r.f119264q;
            mo112584i = dispatchedTask.mo112584i(mo112585m);
        }
        Object m129218b = C24861r.m129218b(mo112584i);
        if (z11) {
            AbstractC19074t.m100206d(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) continuation;
            Continuation continuation2 = dispatchedContinuation.f107358t;
            Object obj = dispatchedContinuation.f107360v;
            InterfaceC27315f context = continuation2.getContext();
            Object m113731c = ThreadContextKt.m113731c(context, obj);
            if (m113731c != ThreadContextKt.f107422a) {
                undispatchedCoroutine = CoroutineContextKt.m112618g(continuation2, context, m113731c);
            } else {
                undispatchedCoroutine = null;
            }
            try {
                dispatchedContinuation.f107358t.mo112492g(m129218b);
                C24848g0 c24848g0 = C24848g0.f119245a;
                if (undispatchedCoroutine != null) {
                    if (!m112880t1) {
                        return;
                    }
                }
                return;
            } finally {
                if (undispatchedCoroutine == null || undispatchedCoroutine.m112880t1()) {
                    ThreadContextKt.m113729a(context, m113731c);
                }
            }
        }
        continuation.mo112492g(m129218b);
    }

    /* renamed from: e */
    private static final void m112678e(DispatchedTask dispatchedTask) {
        EventLoop m112869b = ThreadLocalEventLoop.f105943a.m112869b();
        if (m112869b.m112691N0()) {
            m112869b.m112688J0(dispatchedTask);
            return;
        }
        m112869b.m112690L0(true);
        try {
            m112677d(dispatchedTask, dispatchedTask.mo112581d(), true);
            do {
            } while (m112869b.m112694Q0());
        } finally {
            try {
            } finally {
            }
        }
    }
}
