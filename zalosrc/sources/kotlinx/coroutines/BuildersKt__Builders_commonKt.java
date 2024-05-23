package kotlinx.coroutines;

import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.internal.ThreadContextKt;
import kotlinx.coroutines.intrinsics.CancellableKt;
import kotlinx.coroutines.intrinsics.UndispatchedKt;
import um0.C27316g;
import um0.InterfaceC27313d;
import um0.InterfaceC27315f;
import vm0.AbstractC28298d;
import wm0.AbstractC29100h;

/* loaded from: classes.dex */
public final /* synthetic */ class BuildersKt__Builders_commonKt {
    /* renamed from: a */
    public static final Deferred m112537a(CoroutineScope coroutineScope, InterfaceC27315f interfaceC27315f, CoroutineStart coroutineStart, InterfaceC18509p interfaceC18509p) {
        DeferredCoroutine deferredCoroutine;
        InterfaceC27315f m112615d = CoroutineContextKt.m112615d(coroutineScope, interfaceC27315f);
        if (coroutineStart.m112646d()) {
            deferredCoroutine = new LazyDeferredCoroutine(m112615d, interfaceC18509p);
        } else {
            deferredCoroutine = new DeferredCoroutine(m112615d, true);
        }
        deferredCoroutine.m112501s1(coroutineStart, deferredCoroutine, interfaceC18509p);
        return deferredCoroutine;
    }

    /* renamed from: b */
    public static /* synthetic */ Deferred m112538b(CoroutineScope coroutineScope, InterfaceC27315f interfaceC27315f, CoroutineStart coroutineStart, InterfaceC18509p interfaceC18509p, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            interfaceC27315f = C27316g.f128559p;
        }
        if ((i11 & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return BuildersKt.m112528a(coroutineScope, interfaceC27315f, coroutineStart, interfaceC18509p);
    }

    /* renamed from: c */
    public static final Job m112539c(CoroutineScope coroutineScope, InterfaceC27315f interfaceC27315f, CoroutineStart coroutineStart, InterfaceC18509p interfaceC18509p) {
        StandaloneCoroutine standaloneCoroutine;
        InterfaceC27315f m112615d = CoroutineContextKt.m112615d(coroutineScope, interfaceC27315f);
        if (coroutineStart.m112646d()) {
            standaloneCoroutine = new LazyStandaloneCoroutine(m112615d, interfaceC18509p);
        } else {
            standaloneCoroutine = new StandaloneCoroutine(m112615d, true);
        }
        standaloneCoroutine.m112501s1(coroutineStart, standaloneCoroutine, interfaceC18509p);
        return standaloneCoroutine;
    }

    /* renamed from: d */
    public static /* synthetic */ Job m112540d(CoroutineScope coroutineScope, InterfaceC27315f interfaceC27315f, CoroutineStart coroutineStart, InterfaceC18509p interfaceC18509p, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            interfaceC27315f = C27316g.f128559p;
        }
        if ((i11 & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return BuildersKt.m112530c(coroutineScope, interfaceC27315f, coroutineStart, interfaceC18509p);
    }

    /* renamed from: e */
    public static final Object m112541e(InterfaceC27315f interfaceC27315f, InterfaceC18509p interfaceC18509p, Continuation continuation) {
        Object m112672t1;
        Object m142578e;
        InterfaceC27315f context = continuation.getContext();
        InterfaceC27315f m112616e = CoroutineContextKt.m112616e(context, interfaceC27315f);
        JobKt.m112758k(m112616e);
        if (m112616e == context) {
            ScopeCoroutine scopeCoroutine = new ScopeCoroutine(m112616e, continuation);
            m112672t1 = UndispatchedKt.m113756b(scopeCoroutine, scopeCoroutine, interfaceC18509p);
        } else {
            InterfaceC27313d.b bVar = InterfaceC27313d.f128556o;
            if (AbstractC19074t.m100204b(m112616e.mo112624d(bVar), context.mo112624d(bVar))) {
                UndispatchedCoroutine undispatchedCoroutine = new UndispatchedCoroutine(m112616e, continuation);
                InterfaceC27315f context2 = undispatchedCoroutine.getContext();
                Object m113731c = ThreadContextKt.m113731c(context2, null);
                try {
                    Object m113756b = UndispatchedKt.m113756b(undispatchedCoroutine, undispatchedCoroutine, interfaceC18509p);
                    ThreadContextKt.m113729a(context2, m113731c);
                    m112672t1 = m113756b;
                } catch (Throwable th2) {
                    ThreadContextKt.m113729a(context2, m113731c);
                    throw th2;
                }
            } else {
                DispatchedCoroutine dispatchedCoroutine = new DispatchedCoroutine(m112616e, continuation);
                CancellableKt.m113754d(interfaceC18509p, dispatchedCoroutine, dispatchedCoroutine, null, 4, null);
                m112672t1 = dispatchedCoroutine.m112672t1();
            }
        }
        m142578e = AbstractC28298d.m142578e();
        if (m112672t1 == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m112672t1;
    }
}
