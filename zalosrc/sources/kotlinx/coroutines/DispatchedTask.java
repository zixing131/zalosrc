package kotlinx.coroutines;

import fn0.AbstractC19074t;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.ThreadContextKt;
import kotlinx.coroutines.scheduling.Task;
import kotlinx.coroutines.scheduling.TaskContext;
import pm0.AbstractC24845f;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import um0.InterfaceC27315f;

/* loaded from: classes.dex */
public abstract class DispatchedTask<T> extends Task {

    /* renamed from: r */
    public int f105860r;

    public DispatchedTask(int i11) {
        this.f105860r = i11;
    }

    /* renamed from: a */
    public void mo112579a(Object obj, Throwable th2) {
    }

    /* renamed from: d */
    public abstract Continuation mo112581d();

    /* renamed from: h */
    public Throwable mo112583h(Object obj) {
        CompletedExceptionally completedExceptionally;
        if (obj instanceof CompletedExceptionally) {
            completedExceptionally = (CompletedExceptionally) obj;
        } else {
            completedExceptionally = null;
        }
        if (completedExceptionally == null) {
            return null;
        }
        return completedExceptionally.f105828a;
    }

    /* renamed from: i */
    public Object mo112584i(Object obj) {
        return obj;
    }

    /* renamed from: l */
    public final void m112673l(Throwable th2, Throwable th3) {
        if (th2 == null && th3 == null) {
            return;
        }
        if (th2 != null && th3 != null) {
            AbstractC24845f.m129182a(th2, th3);
        }
        if (th2 == null) {
            th2 = th3;
        }
        AbstractC19074t.m100205c(th2);
        CoroutineExceptionHandlerKt.m112629a(mo112581d().getContext(), new CoroutinesInternalError("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2));
    }

    /* renamed from: m */
    public abstract Object mo112585m();

    @Override // java.lang.Runnable
    public final void run() {
        Object m129218b;
        UndispatchedCoroutine undispatchedCoroutine;
        Job job;
        Object m129218b2;
        TaskContext taskContext = this.f107487q;
        try {
            Continuation mo112581d = mo112581d();
            AbstractC19074t.m100206d(mo112581d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) mo112581d;
            Continuation continuation = dispatchedContinuation.f107358t;
            Object obj = dispatchedContinuation.f107360v;
            InterfaceC27315f context = continuation.getContext();
            Object m113731c = ThreadContextKt.m113731c(context, obj);
            if (m113731c != ThreadContextKt.f107422a) {
                undispatchedCoroutine = CoroutineContextKt.m112618g(continuation, context, m113731c);
            } else {
                undispatchedCoroutine = null;
            }
            try {
                InterfaceC27315f context2 = continuation.getContext();
                Object mo112585m = mo112585m();
                Throwable mo112583h = mo112583h(mo112585m);
                if (mo112583h == null && DispatchedTaskKt.m112675b(this.f105860r)) {
                    job = (Job) context2.mo112624d(Job.f105897m);
                } else {
                    job = null;
                }
                if (job != null && !job.mo112496c()) {
                    CancellationException mo112732A = job.mo112732A();
                    mo112579a(mo112585m, mo112732A);
                    C24861r.a aVar = C24861r.f119264q;
                    continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(mo112732A)));
                } else if (mo112583h != null) {
                    C24861r.a aVar2 = C24861r.f119264q;
                    continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(mo112583h)));
                } else {
                    C24861r.a aVar3 = C24861r.f119264q;
                    continuation.mo112492g(C24861r.m129218b(mo112584i(mo112585m)));
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
                if (undispatchedCoroutine == null || undispatchedCoroutine.m112880t1()) {
                    ThreadContextKt.m113729a(context, m113731c);
                }
                try {
                    taskContext.mo113803i0();
                    m129218b2 = C24861r.m129218b(C24848g0.f119245a);
                } catch (Throwable th2) {
                    C24861r.a aVar4 = C24861r.f119264q;
                    m129218b2 = C24861r.m129218b(AbstractC24862s.m129227a(th2));
                }
                m112673l(null, C24861r.m129221e(m129218b2));
            } catch (Throwable th3) {
                if (undispatchedCoroutine == null || undispatchedCoroutine.m112880t1()) {
                    ThreadContextKt.m113729a(context, m113731c);
                }
                throw th3;
            }
        } catch (Throwable th4) {
            try {
                C24861r.a aVar5 = C24861r.f119264q;
                taskContext.mo113803i0();
                m129218b = C24861r.m129218b(C24848g0.f119245a);
            } catch (Throwable th5) {
                C24861r.a aVar6 = C24861r.f119264q;
                m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th5));
            }
            m112673l(th4, C24861r.m129221e(m129218b));
        }
    }
}
