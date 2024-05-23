package com.google.firebase.remoteconfig.internal;

import androidx.window.layout.ExecutorC2100e0;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p342m6.AbstractC22888j;
import p342m6.AbstractC22894m;
import p342m6.InterfaceC22876d;
import p342m6.InterfaceC22880f;
import p342m6.InterfaceC22882g;
import p342m6.InterfaceC22886i;

/* renamed from: com.google.firebase.remoteconfig.internal.f */
/* loaded from: classes3.dex */
public class C6722f {

    /* renamed from: d */
    private static final Map f36980d = new HashMap();

    /* renamed from: e */
    private static final Executor f36981e = new ExecutorC2100e0();

    /* renamed from: a */
    private final Executor f36982a;

    /* renamed from: b */
    private final C6736t f36983b;

    /* renamed from: c */
    private AbstractC22888j f36984c = null;

    private C6722f(Executor executor, C6736t c6736t) {
        this.f36982a = executor;
        this.f36983b = c6736t;
    }

    /* renamed from: c */
    private static Object m34365c(AbstractC22888j abstractC22888j, long j11, TimeUnit timeUnit) {
        b bVar = new b();
        Executor executor = f36981e;
        abstractC22888j.mo117577f(executor, bVar);
        abstractC22888j.mo117575d(executor, bVar);
        abstractC22888j.mo117572a(executor, bVar);
        if (bVar.m34376a(j11, timeUnit)) {
            if (abstractC22888j.mo117588q()) {
                return abstractC22888j.mo117584m();
            }
            throw new ExecutionException(abstractC22888j.mo117583l());
        }
        throw new TimeoutException("Task await timed out.");
    }

    /* renamed from: h */
    public static synchronized C6722f m34366h(Executor executor, C6736t c6736t) {
        C6722f c6722f;
        synchronized (C6722f.class) {
            try {
                String m34496b = c6736t.m34496b();
                Map map = f36980d;
                if (!map.containsKey(m34496b)) {
                    map.put(m34496b, new C6722f(executor, c6736t));
                }
                c6722f = (C6722f) map.get(m34496b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c6722f;
    }

    /* renamed from: i */
    public /* synthetic */ Void m34367i(C6723g c6723g) {
        return this.f36983b.m34498e(c6723g);
    }

    /* renamed from: j */
    public /* synthetic */ AbstractC22888j m34368j(boolean z11, C6723g c6723g, Void r32) {
        if (z11) {
            m34369m(c6723g);
        }
        return AbstractC22894m.m117604f(c6723g);
    }

    /* renamed from: m */
    private synchronized void m34369m(C6723g c6723g) {
        this.f36984c = AbstractC22894m.m117604f(c6723g);
    }

    /* renamed from: d */
    public void m34370d() {
        synchronized (this) {
            this.f36984c = AbstractC22894m.m117604f(null);
        }
        this.f36983b.m34495a();
    }

    /* renamed from: e */
    public synchronized AbstractC22888j m34371e() {
        try {
            AbstractC22888j abstractC22888j = this.f36984c;
            if (abstractC22888j != null) {
                if (abstractC22888j.mo117587p() && !this.f36984c.mo117588q()) {
                }
            }
            Executor executor = this.f36982a;
            C6736t c6736t = this.f36983b;
            Objects.requireNonNull(c6736t);
            this.f36984c = AbstractC22894m.m117601c(executor, new Callable() { // from class: com.google.firebase.remoteconfig.internal.c
                public /* synthetic */ CallableC6719c() {
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C6736t.this.m34497d();
                }
            });
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f36984c;
    }

    /* renamed from: f */
    public C6723g m34372f() {
        return m34373g(5L);
    }

    /* renamed from: g */
    C6723g m34373g(long j11) {
        synchronized (this) {
            try {
                AbstractC22888j abstractC22888j = this.f36984c;
                if (abstractC22888j != null && abstractC22888j.mo117588q()) {
                    return (C6723g) this.f36984c.mo117584m();
                }
                try {
                    return (C6723g) m34365c(m34371e(), j11, TimeUnit.SECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                    return null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: k */
    public AbstractC22888j m34374k(C6723g c6723g) {
        return m34375l(c6723g, true);
    }

    /* renamed from: l */
    public AbstractC22888j m34375l(C6723g c6723g, boolean z11) {
        return AbstractC22894m.m117601c(this.f36982a, new Callable() { // from class: com.google.firebase.remoteconfig.internal.d

            /* renamed from: b */
            public final /* synthetic */ C6723g f36976b;

            public /* synthetic */ CallableC6720d(C6723g c6723g2) {
                r2 = c6723g2;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void m34367i;
                m34367i = C6722f.this.m34367i(r2);
                return m34367i;
            }
        }).mo117589r(this.f36982a, new InterfaceC22886i() { // from class: com.google.firebase.remoteconfig.internal.e

            /* renamed from: b */
            public final /* synthetic */ boolean f36978b;

            /* renamed from: c */
            public final /* synthetic */ C6723g f36979c;

            public /* synthetic */ C6721e(boolean z112, C6723g c6723g2) {
                r2 = z112;
                r3 = c6723g2;
            }

            @Override // p342m6.InterfaceC22886i
            /* renamed from: a */
            public final AbstractC22888j mo33968a(Object obj) {
                AbstractC22888j m34368j;
                m34368j = C6722f.this.m34368j(r2, r3, (Void) obj);
                return m34368j;
            }
        });
    }

    /* renamed from: com.google.firebase.remoteconfig.internal.f$b */
    /* loaded from: classes3.dex */
    public static class b implements InterfaceC22882g, InterfaceC22880f, InterfaceC22876d {

        /* renamed from: a */
        private final CountDownLatch f36985a;

        private b() {
            this.f36985a = new CountDownLatch(1);
        }

        /* renamed from: a */
        public boolean m34376a(long j11, TimeUnit timeUnit) {
            return this.f36985a.await(j11, timeUnit);
        }

        @Override // p342m6.InterfaceC22880f
        /* renamed from: b */
        public void mo839b(Exception exc) {
            this.f36985a.countDown();
        }

        @Override // p342m6.InterfaceC22876d
        /* renamed from: l */
        public void mo34377l() {
            this.f36985a.countDown();
        }

        @Override // p342m6.InterfaceC22882g
        public void onSuccess(Object obj) {
            this.f36985a.countDown();
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }
}
