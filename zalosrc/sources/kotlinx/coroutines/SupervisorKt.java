package kotlinx.coroutines;

import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.intrinsics.UndispatchedKt;
import vm0.AbstractC28298d;
import wm0.AbstractC29100h;

/* loaded from: classes.dex */
public final class SupervisorKt {
    /* renamed from: a */
    public static final CompletableJob m112863a(Job job) {
        return new SupervisorJobImpl(job);
    }

    /* renamed from: b */
    public static /* synthetic */ CompletableJob m112864b(Job job, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            job = null;
        }
        return m112863a(job);
    }

    /* renamed from: c */
    public static final Object m112865c(InterfaceC18509p interfaceC18509p, Continuation continuation) {
        Object m142578e;
        SupervisorCoroutine supervisorCoroutine = new SupervisorCoroutine(continuation.getContext(), continuation);
        Object m113756b = UndispatchedKt.m113756b(supervisorCoroutine, supervisorCoroutine, interfaceC18509p);
        m142578e = AbstractC28298d.m142578e();
        if (m113756b == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m113756b;
    }
}
