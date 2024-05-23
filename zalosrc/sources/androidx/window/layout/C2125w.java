package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import androidx.core.util.InterfaceC1479a;
import androidx.window.layout.C2125w;
import androidx.window.layout.InterfaceC2116n;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import p378o2.C23987h;
import pm0.C24848g0;
import qm0.AbstractC25368s;

/* renamed from: androidx.window.layout.w */
/* loaded from: classes2.dex */
public final class C2125w implements InterfaceC2127y {

    /* renamed from: d */
    private static volatile C2125w f9018d;

    /* renamed from: a */
    private InterfaceC2116n f9020a;

    /* renamed from: b */
    private final CopyOnWriteArrayList f9021b = new CopyOnWriteArrayList();

    /* renamed from: c */
    public static final a f9017c = new a(null);

    /* renamed from: e */
    private static final ReentrantLock f9019e = new ReentrantLock();

    /* renamed from: androidx.window.layout.w$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C2125w m11426a(Context context) {
            AbstractC19074t.m100208f(context, "context");
            if (C2125w.f9018d == null) {
                ReentrantLock reentrantLock = C2125w.f9019e;
                reentrantLock.lock();
                try {
                    if (C2125w.f9018d == null) {
                        C2125w.f9018d = new C2125w(C2125w.f9017c.m11427b(context));
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                    reentrantLock.unlock();
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            }
            C2125w c2125w = C2125w.f9018d;
            AbstractC19074t.m100205c(c2125w);
            return c2125w;
        }

        /* renamed from: b */
        public final InterfaceC2116n m11427b(Context context) {
            AbstractC19074t.m100208f(context, "context");
            try {
                if (!m11428c(SidecarCompat.f8936f.m11321c())) {
                    return null;
                }
                SidecarCompat sidecarCompat = new SidecarCompat(context);
                if (!sidecarCompat.m11318l()) {
                    return null;
                }
                return sidecarCompat;
            } catch (Throwable unused) {
                return null;
            }
        }

        /* renamed from: c */
        public final boolean m11428c(C23987h c23987h) {
            if (c23987h == null || c23987h.compareTo(C23987h.f116079u.m125505a()) < 0) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: androidx.window.layout.w$b */
    /* loaded from: classes2.dex */
    public final class b implements InterfaceC2116n.a {

        /* renamed from: a */
        final /* synthetic */ C2125w f9022a;

        public b(C2125w c2125w) {
            AbstractC19074t.m100208f(c2125w, "this$0");
            this.f9022a = c2125w;
        }

        @Override // androidx.window.layout.InterfaceC2116n.a
        /* renamed from: a */
        public void mo11322a(Activity activity, C2102f0 c2102f0) {
            AbstractC19074t.m100208f(activity, "activity");
            AbstractC19074t.m100208f(c2102f0, "newLayout");
            Iterator it = this.f9022a.m11425h().iterator();
            while (it.hasNext()) {
                c cVar = (c) it.next();
                if (AbstractC19074t.m100204b(cVar.m11432d(), activity)) {
                    cVar.m11431b(c2102f0);
                }
            }
        }
    }

    /* renamed from: androidx.window.layout.w$c */
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a */
        private final Activity f9023a;

        /* renamed from: b */
        private final Executor f9024b;

        /* renamed from: c */
        private final InterfaceC1479a f9025c;

        /* renamed from: d */
        private C2102f0 f9026d;

        public c(Activity activity, Executor executor, InterfaceC1479a interfaceC1479a) {
            AbstractC19074t.m100208f(activity, "activity");
            AbstractC19074t.m100208f(executor, "executor");
            AbstractC19074t.m100208f(interfaceC1479a, "callback");
            this.f9023a = activity;
            this.f9024b = executor;
            this.f9025c = interfaceC1479a;
        }

        /* renamed from: c */
        public static final void m11430c(c cVar, C2102f0 c2102f0) {
            AbstractC19074t.m100208f(cVar, "this$0");
            AbstractC19074t.m100208f(c2102f0, "$newLayoutInfo");
            cVar.f9025c.accept(c2102f0);
        }

        /* renamed from: b */
        public final void m11431b(C2102f0 c2102f0) {
            AbstractC19074t.m100208f(c2102f0, "newLayoutInfo");
            this.f9026d = c2102f0;
            this.f9024b.execute(new Runnable() { // from class: androidx.window.layout.x

                /* renamed from: q */
                public final /* synthetic */ C2102f0 f9028q;

                public /* synthetic */ RunnableC2126x(C2102f0 c2102f02) {
                    r2 = c2102f02;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C2125w.c.m11430c(C2125w.c.this, r2);
                }
            });
        }

        /* renamed from: d */
        public final Activity m11432d() {
            return this.f9023a;
        }

        /* renamed from: e */
        public final InterfaceC1479a m11433e() {
            return this.f9025c;
        }

        /* renamed from: f */
        public final C2102f0 m11434f() {
            return this.f9026d;
        }
    }

    public C2125w(InterfaceC2116n interfaceC2116n) {
        this.f9020a = interfaceC2116n;
        InterfaceC2116n interfaceC2116n2 = this.f9020a;
        if (interfaceC2116n2 != null) {
            interfaceC2116n2.mo11312a(new b(this));
        }
    }

    /* renamed from: f */
    private final void m11422f(Activity activity) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f9021b;
        if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (AbstractC19074t.m100204b(((c) it.next()).m11432d(), activity)) {
                    return;
                }
            }
        }
        InterfaceC2116n interfaceC2116n = this.f9020a;
        if (interfaceC2116n != null) {
            interfaceC2116n.mo11314c(activity);
        }
    }

    /* renamed from: i */
    private final boolean m11423i(Activity activity) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f9021b;
        if ((copyOnWriteArrayList instanceof Collection) && copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (AbstractC19074t.m100204b(((c) it.next()).m11432d(), activity)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.window.layout.InterfaceC2127y
    /* renamed from: a */
    public void mo11362a(Activity activity, Executor executor, InterfaceC1479a interfaceC1479a) {
        C2102f0 c2102f0;
        Object obj;
        List m131502j;
        AbstractC19074t.m100208f(activity, "activity");
        AbstractC19074t.m100208f(executor, "executor");
        AbstractC19074t.m100208f(interfaceC1479a, "callback");
        ReentrantLock reentrantLock = f9019e;
        reentrantLock.lock();
        try {
            InterfaceC2116n m11424g = m11424g();
            if (m11424g == null) {
                m131502j = AbstractC25368s.m131502j();
                interfaceC1479a.accept(new C2102f0(m131502j));
                return;
            }
            boolean m11423i = m11423i(activity);
            c cVar = new c(activity, executor, interfaceC1479a);
            m11425h().add(cVar);
            if (!m11423i) {
                m11424g.mo11313b(activity);
            } else {
                Iterator it = m11425h().iterator();
                while (true) {
                    c2102f0 = null;
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC19074t.m100204b(activity, ((c) obj).m11432d())) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                c cVar2 = (c) obj;
                if (cVar2 != null) {
                    c2102f0 = cVar2.m11434f();
                }
                if (c2102f0 != null) {
                    cVar.m11431b(c2102f0);
                }
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.layout.InterfaceC2127y
    /* renamed from: b */
    public void mo11363b(InterfaceC1479a interfaceC1479a) {
        AbstractC19074t.m100208f(interfaceC1479a, "callback");
        synchronized (f9019e) {
            try {
                if (m11424g() == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = m11425h().iterator();
                while (it.hasNext()) {
                    c cVar = (c) it.next();
                    if (cVar.m11433e() == interfaceC1479a) {
                        AbstractC19074t.m100207e(cVar, "callbackWrapper");
                        arrayList.add(cVar);
                    }
                }
                m11425h().removeAll(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    m11422f(((c) it2.next()).m11432d());
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: g */
    public final InterfaceC2116n m11424g() {
        return this.f9020a;
    }

    /* renamed from: h */
    public final CopyOnWriteArrayList m11425h() {
        return this.f9021b;
    }
}
