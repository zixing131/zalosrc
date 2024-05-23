package kotlinx.coroutines;

import en0.InterfaceC18509p;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.intrinsics.UndispatchedKt;
import um0.InterfaceC27315f;
import vm0.AbstractC28298d;
import wm0.AbstractC29100h;

/* loaded from: classes7.dex */
public final class CoroutineScopeKt {
    /* renamed from: a */
    public static final CoroutineScope m112637a(InterfaceC27315f interfaceC27315f) {
        CompletableJob m112763b;
        if (interfaceC27315f.mo112624d(Job.f105897m) == null) {
            m112763b = JobKt__JobKt.m112763b(null, 1, null);
            interfaceC27315f = interfaceC27315f.mo112823d0(m112763b);
        }
        return new ContextScope(interfaceC27315f);
    }

    /* renamed from: b */
    public static final void m112638b(CoroutineScope coroutineScope, CancellationException cancellationException) {
        Job job = (Job) coroutineScope.mo9207O().mo112624d(Job.f105897m);
        if (job != null) {
            job.mo112734a(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + coroutineScope).toString());
    }

    /* renamed from: c */
    public static /* synthetic */ void m112639c(CoroutineScope coroutineScope, CancellationException cancellationException, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cancellationException = null;
        }
        m112638b(coroutineScope, cancellationException);
    }

    /* renamed from: d */
    public static final Object m112640d(InterfaceC18509p interfaceC18509p, Continuation continuation) {
        Object m142578e;
        ScopeCoroutine scopeCoroutine = new ScopeCoroutine(continuation.getContext(), continuation);
        Object m113756b = UndispatchedKt.m113756b(scopeCoroutine, scopeCoroutine, interfaceC18509p);
        m142578e = AbstractC28298d.m142578e();
        if (m113756b == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m113756b;
    }

    /* renamed from: e */
    public static final void m112641e(CoroutineScope coroutineScope) {
        JobKt.m112758k(coroutineScope.mo9207O());
    }

    /* renamed from: f */
    public static final boolean m112642f(CoroutineScope coroutineScope) {
        Job job = (Job) coroutineScope.mo9207O().mo112624d(Job.f105897m);
        if (job != null) {
            return job.mo112496c();
        }
        return true;
    }

    /* renamed from: g */
    public static final CoroutineScope m112643g(CoroutineScope coroutineScope, InterfaceC27315f interfaceC27315f) {
        return new ContextScope(coroutineScope.mo9207O().mo112823d0(interfaceC27315f));
    }
}
