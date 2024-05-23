package kotlinx.coroutines.debug.internal;

import en0.InterfaceC18505l;
import fn0.AbstractC19069o0;
import fn0.AbstractC19074t;
import java.text.SimpleDateFormat;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.Job;
import p001a.C0001a;
import pm0.AbstractC24862s;
import pm0.C24861r;
import um0.InterfaceC27315f;
import wm0.InterfaceC29097e;

/* loaded from: classes7.dex */
public final class DebugProbesImpl {

    /* renamed from: a */
    public static final DebugProbesImpl f106373a;

    /* renamed from: b */
    private static final StackTraceElement f106374b;

    /* renamed from: c */
    private static final SimpleDateFormat f106375c;

    /* renamed from: d */
    private static final ConcurrentWeakMap f106376d;

    /* renamed from: e */
    private static boolean f106377e;

    /* renamed from: f */
    private static boolean f106378f;

    /* renamed from: g */
    private static final InterfaceC18505l f106379g;

    /* renamed from: h */
    private static final ConcurrentWeakMap f106380h;

    /* renamed from: i */
    private static final DebugProbesImpl$Installations$kotlinx$VolatileWrapper f106381i;

    /* renamed from: j */
    private static final DebugProbesImpl$SequenceNumber$kotlinx$VolatileWrapper f106382j;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes7.dex */
    public static final class CoroutineOwner<T> implements Continuation<T>, InterfaceC29097e {

        /* renamed from: p */
        public final Continuation f106383p;

        /* renamed from: q */
        public final DebugCoroutineInfoImpl f106384q;

        /* renamed from: a */
        private final StackTraceFrame m113253a() {
            return this.f106384q.m113237d();
        }

        @Override // wm0.InterfaceC29097e
        /* renamed from: C */
        public StackTraceElement mo112573C() {
            StackTraceFrame m113253a = m113253a();
            if (m113253a != null) {
                return m113253a.mo112573C();
            }
            return null;
        }

        @Override // wm0.InterfaceC29097e
        /* renamed from: e */
        public InterfaceC29097e mo112582e() {
            StackTraceFrame m113253a = m113253a();
            if (m113253a != null) {
                return m113253a.mo112582e();
            }
            return null;
        }

        @Override // kotlin.coroutines.Continuation
        /* renamed from: g */
        public void mo112492g(Object obj) {
            DebugProbesImpl.f106373a.m113248g(this);
            this.f106383p.mo112492g(obj);
        }

        @Override // kotlin.coroutines.Continuation
        public InterfaceC27315f getContext() {
            return this.f106383p.getContext();
        }

        public String toString() {
            return this.f106383p.toString();
        }
    }

    static {
        DebugProbesImpl debugProbesImpl = new DebugProbesImpl();
        f106373a = debugProbesImpl;
        f106374b = new C0001a().m1b();
        f106375c = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        f106376d = new ConcurrentWeakMap(false, 1, null);
        f106377e = true;
        f106378f = true;
        f106379g = debugProbesImpl.m113246d();
        f106380h = new ConcurrentWeakMap(true);
        f106381i = new DebugProbesImpl$Installations$kotlinx$VolatileWrapper(null);
        f106382j = new DebugProbesImpl$SequenceNumber$kotlinx$VolatileWrapper(null);
    }

    private DebugProbesImpl() {
    }

    /* renamed from: d */
    private final InterfaceC18505l m113246d() {
        Object m129218b;
        try {
            C24861r.a aVar = C24861r.f119264q;
            Object newInstance = Class.forName("kotlinx.coroutines.debug.internal.ByteBuddyDynamicAttach").getConstructors()[0].newInstance(new Object[0]);
            AbstractC19074t.m100206d(newInstance, "null cannot be cast to non-null type kotlin.Function1<kotlin.Boolean, kotlin.Unit>");
            m129218b = C24861r.m129218b((InterfaceC18505l) AbstractC19069o0.m100188e(newInstance, 1));
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
        if (C24861r.m129223g(m129218b)) {
            m129218b = null;
        }
        return (InterfaceC18505l) m129218b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public final boolean m113247f(CoroutineOwner coroutineOwner) {
        Job job;
        InterfaceC27315f m113236c = coroutineOwner.f106384q.m113236c();
        if (m113236c == null || (job = (Job) m113236c.mo112624d(Job.f105897m)) == null || !job.mo112737f()) {
            return false;
        }
        f106376d.remove(coroutineOwner);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public final void m113248g(CoroutineOwner coroutineOwner) {
        InterfaceC29097e m113249h;
        f106376d.remove(coroutineOwner);
        InterfaceC29097e m113239f = coroutineOwner.f106384q.m113239f();
        if (m113239f != null && (m113249h = m113249h(m113239f)) != null) {
            f106380h.remove(m113249h);
        }
    }

    /* renamed from: h */
    private final InterfaceC29097e m113249h(InterfaceC29097e interfaceC29097e) {
        do {
            interfaceC29097e = interfaceC29097e.mo112582e();
            if (interfaceC29097e == null) {
                return null;
            }
        } while (interfaceC29097e.mo112573C() == null);
        return interfaceC29097e;
    }

    /* renamed from: e */
    public final boolean m113250e() {
        return f106378f;
    }
}
