package kotlinx.coroutines.internal;

import en0.InterfaceC18505l;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CompletionStateKt;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.EventLoop;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.ThreadLocalEventLoop;
import kotlinx.coroutines.UndispatchedCoroutine;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import um0.InterfaceC27315f;

/* loaded from: classes.dex */
public final class DispatchedContinuationKt {

    /* renamed from: a */
    private static final Symbol f107361a = new Symbol("UNDEFINED");

    /* renamed from: b */
    public static final Symbol f107362b = new Symbol("REUSABLE_CLAIMED");

    /* renamed from: b */
    public static final void m113612b(Continuation continuation, Object obj, InterfaceC18505l interfaceC18505l) {
        UndispatchedCoroutine undispatchedCoroutine;
        if (continuation instanceof DispatchedContinuation) {
            DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) continuation;
            Object m112607b = CompletionStateKt.m112607b(obj, interfaceC18505l);
            if (dispatchedContinuation.f107357s.mo9278E0(dispatchedContinuation.getContext())) {
                dispatchedContinuation.f107359u = m112607b;
                dispatchedContinuation.f105860r = 1;
                dispatchedContinuation.f107357s.mo9279z0(dispatchedContinuation.getContext(), dispatchedContinuation);
                return;
            }
            EventLoop m112869b = ThreadLocalEventLoop.f105943a.m112869b();
            if (m112869b.m112691N0()) {
                dispatchedContinuation.f107359u = m112607b;
                dispatchedContinuation.f105860r = 1;
                m112869b.m112688J0(dispatchedContinuation);
                return;
            }
            m112869b.m112690L0(true);
            try {
                Job job = (Job) dispatchedContinuation.getContext().mo112624d(Job.f105897m);
                if (job != null && !job.mo112496c()) {
                    CancellationException mo112732A = job.mo112732A();
                    dispatchedContinuation.mo112579a(m112607b, mo112732A);
                    C24861r.a aVar = C24861r.f119264q;
                    dispatchedContinuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(mo112732A)));
                } else {
                    Continuation continuation2 = dispatchedContinuation.f107358t;
                    Object obj2 = dispatchedContinuation.f107360v;
                    InterfaceC27315f context = continuation2.getContext();
                    Object m113731c = ThreadContextKt.m113731c(context, obj2);
                    if (m113731c != ThreadContextKt.f107422a) {
                        undispatchedCoroutine = CoroutineContextKt.m112618g(continuation2, context, m113731c);
                    } else {
                        undispatchedCoroutine = null;
                    }
                    try {
                        dispatchedContinuation.f107358t.mo112492g(obj);
                        C24848g0 c24848g0 = C24848g0.f119245a;
                    } finally {
                        if (undispatchedCoroutine == null || undispatchedCoroutine.m112880t1()) {
                            ThreadContextKt.m113729a(context, m113731c);
                        }
                    }
                }
                do {
                } while (m112869b.m112694Q0());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        continuation.mo112492g(obj);
    }

    /* renamed from: c */
    public static /* synthetic */ void m113613c(Continuation continuation, Object obj, InterfaceC18505l interfaceC18505l, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            interfaceC18505l = null;
        }
        m113612b(continuation, obj, interfaceC18505l);
    }

    /* renamed from: d */
    public static final boolean m113614d(DispatchedContinuation dispatchedContinuation) {
        C24848g0 c24848g0 = C24848g0.f119245a;
        EventLoop m112869b = ThreadLocalEventLoop.f105943a.m112869b();
        if (m112869b.m112692O0()) {
            return false;
        }
        if (m112869b.m112691N0()) {
            dispatchedContinuation.f107359u = c24848g0;
            dispatchedContinuation.f105860r = 1;
            m112869b.m112688J0(dispatchedContinuation);
            return true;
        }
        m112869b.m112690L0(true);
        try {
            dispatchedContinuation.run();
            do {
            } while (m112869b.m112694Q0());
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }
}
