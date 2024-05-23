package androidx.lifecycle;

import androidx.lifecycle.AbstractC1785o;
import java.util.Iterator;
import java.util.Map;
import p351n0.C23504c;
import p376o0.C23974b;

/* loaded from: classes.dex */
public abstract class LiveData {

    /* renamed from: k */
    static final Object f7226k = new Object();

    /* renamed from: a */
    final Object f7227a;

    /* renamed from: b */
    private C23974b f7228b;

    /* renamed from: c */
    int f7229c;

    /* renamed from: d */
    private boolean f7230d;

    /* renamed from: e */
    private volatile Object f7231e;

    /* renamed from: f */
    volatile Object f7232f;

    /* renamed from: g */
    private int f7233g;

    /* renamed from: h */
    private boolean f7234h;

    /* renamed from: i */
    private boolean f7235i;

    /* renamed from: j */
    private final Runnable f7236j;

    /* loaded from: classes.dex */
    class LifecycleBoundObserver extends androidx.lifecycle.LiveData.c implements InterfaceC1795t {

        /* renamed from: t */
        final InterfaceC1801w f7237t;

        LifecycleBoundObserver(InterfaceC1801w interfaceC1801w, InterfaceC1764d0 interfaceC1764d0) {
            super(interfaceC1764d0);
            this.f7237t = interfaceC1801w;
        }

        @Override // androidx.lifecycle.InterfaceC1795t
        /* renamed from: X6 */
        public void mo4652X6(InterfaceC1801w interfaceC1801w, AbstractC1785o.a aVar) {
            AbstractC1785o.b mo9336b = this.f7237t.getLifecycle().mo9336b();
            if (mo9336b == AbstractC1785o.b.DESTROYED) {
                LiveData.this.mo9222o(this.f7241p);
                return;
            }
            AbstractC1785o.b bVar = null;
            while (bVar != mo9336b) {
                m9229b(m9227e());
                bVar = mo9336b;
                mo9336b = this.f7237t.getLifecycle().mo9336b();
            }
        }

        /* renamed from: c */
        void m9225c() {
            this.f7237t.getLifecycle().mo9338d(this);
        }

        /* renamed from: d */
        boolean m9226d(InterfaceC1801w interfaceC1801w) {
            return this.f7237t == interfaceC1801w;
        }

        /* renamed from: e */
        boolean m9227e() {
            return this.f7237t.getLifecycle().mo9336b().m9345c(AbstractC1785o.b.STARTED);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$a */
    /* loaded from: classes.dex */
    class RunnableC1745a implements Runnable {
        RunnableC1745a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f7227a) {
                obj = LiveData.this.f7232f;
                LiveData.this.f7232f = LiveData.f7226k;
            }
            LiveData.this.mo9224q(obj);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$b */
    /* loaded from: classes2.dex */
    private class C1746b extends AbstractC1747c {
        C1746b(InterfaceC1764d0 interfaceC1764d0) {
            super(interfaceC1764d0);
        }

        @Override // androidx.lifecycle.LiveData.AbstractC1747c
        /* renamed from: e */
        boolean mo9228e() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.lifecycle.LiveData$c */
    /* loaded from: classes.dex */
    public abstract class AbstractC1747c {

        /* renamed from: p */
        final InterfaceC1764d0 f7241p;

        /* renamed from: q */
        boolean f7242q;

        /* renamed from: r */
        int f7243r = -1;

        AbstractC1747c(InterfaceC1764d0 interfaceC1764d0) {
            this.f7241p = interfaceC1764d0;
        }

        /* renamed from: b */
        void m9229b(boolean z11) {
            int i11;
            if (z11 == this.f7242q) {
                return;
            }
            this.f7242q = z11;
            LiveData liveData = LiveData.this;
            if (z11) {
                i11 = 1;
            } else {
                i11 = -1;
            }
            liveData.m9213c(i11);
            if (this.f7242q) {
                LiveData.this.m9214e(this);
            }
        }

        /* renamed from: c */
        void m9230c() {
        }

        /* renamed from: d */
        boolean m9231d(InterfaceC1801w interfaceC1801w) {
            return false;
        }

        /* renamed from: e */
        abstract boolean mo9228e();
    }

    public LiveData(Object obj) {
        this.f7227a = new Object();
        this.f7228b = new C23974b();
        this.f7229c = 0;
        this.f7232f = f7226k;
        this.f7236j = new RunnableC1745a();
        this.f7231e = obj;
        this.f7233g = 0;
    }

    /* renamed from: b */
    static void m9211b(String str) {
        if (C23504c.m123373h().mo123377c()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    /* renamed from: d */
    private void m9212d(AbstractC1747c abstractC1747c) {
        if (!abstractC1747c.f7242q) {
            return;
        }
        if (!abstractC1747c.mo9228e()) {
            abstractC1747c.m9229b(false);
            return;
        }
        int i11 = abstractC1747c.f7243r;
        int i12 = this.f7233g;
        if (i11 >= i12) {
            return;
        }
        abstractC1747c.f7243r = i12;
        abstractC1747c.f7241p.mo8524qp(this.f7231e);
    }

    /* renamed from: c */
    void m9213c(int i11) {
        boolean z11;
        boolean z12;
        int i12 = this.f7229c;
        this.f7229c = i11 + i12;
        if (this.f7230d) {
            return;
        }
        this.f7230d = true;
        while (true) {
            try {
                int i13 = this.f7229c;
                if (i12 != i13) {
                    if (i12 == 0 && i13 > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (i12 > 0 && i13 == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z11) {
                        mo181l();
                    } else if (z12) {
                        mo182m();
                    }
                    i12 = i13;
                } else {
                    this.f7230d = false;
                    return;
                }
            } catch (Throwable th2) {
                this.f7230d = false;
                throw th2;
            }
        }
    }

    /* renamed from: e */
    void m9214e(AbstractC1747c abstractC1747c) {
        if (this.f7234h) {
            this.f7235i = true;
            return;
        }
        this.f7234h = true;
        do {
            this.f7235i = false;
            if (abstractC1747c != null) {
                m9212d(abstractC1747c);
                abstractC1747c = null;
            } else {
                C23974b.d m125462g = this.f7228b.m125462g();
                while (m125462g.hasNext()) {
                    m9212d((AbstractC1747c) ((Map.Entry) m125462g.next()).getValue());
                    if (this.f7235i) {
                        break;
                    }
                }
            }
        } while (this.f7235i);
        this.f7234h = false;
    }

    /* renamed from: f */
    public Object mo9215f() {
        Object obj = this.f7231e;
        if (obj != f7226k) {
            return obj;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m9216g() {
        return this.f7233g;
    }

    /* renamed from: h */
    public boolean m9217h() {
        return this.f7229c > 0;
    }

    /* renamed from: i */
    public boolean m9218i() {
        return this.f7231e != f7226k;
    }

    /* renamed from: j */
    public void m9219j(InterfaceC1801w interfaceC1801w, InterfaceC1764d0 interfaceC1764d0) {
        m9211b("observe");
        if (interfaceC1801w.getLifecycle().mo9336b() == AbstractC1785o.b.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(interfaceC1801w, interfaceC1764d0);
        AbstractC1747c abstractC1747c = (AbstractC1747c) this.f7228b.mo125458l(interfaceC1764d0, lifecycleBoundObserver);
        if (abstractC1747c != null && !abstractC1747c.m9231d(interfaceC1801w)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (abstractC1747c != null) {
            return;
        }
        interfaceC1801w.getLifecycle().mo9335a(lifecycleBoundObserver);
    }

    /* renamed from: k */
    public void m9220k(InterfaceC1764d0 interfaceC1764d0) {
        m9211b("observeForever");
        C1746b c1746b = new C1746b(interfaceC1764d0);
        AbstractC1747c abstractC1747c = (AbstractC1747c) this.f7228b.mo125458l(interfaceC1764d0, c1746b);
        if (!(abstractC1747c instanceof LifecycleBoundObserver)) {
            if (abstractC1747c != null) {
                return;
            }
            c1746b.m9229b(true);
            return;
        }
        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public void mo181l() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public void mo182m() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public void mo9221n(Object obj) {
        boolean z11;
        synchronized (this.f7227a) {
            if (this.f7232f == f7226k) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f7232f = obj;
        }
        if (!z11) {
            return;
        }
        C23504c.m123373h().mo123378d(this.f7236j);
    }

    /* renamed from: o */
    public void mo9222o(InterfaceC1764d0 interfaceC1764d0) {
        m9211b("removeObserver");
        AbstractC1747c abstractC1747c = (AbstractC1747c) this.f7228b.mo125459m(interfaceC1764d0);
        if (abstractC1747c == null) {
            return;
        }
        abstractC1747c.m9230c();
        abstractC1747c.m9229b(false);
    }

    /* renamed from: p */
    public void m9223p(InterfaceC1801w interfaceC1801w) {
        m9211b("removeObservers");
        Iterator it = this.f7228b.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (((AbstractC1747c) entry.getValue()).m9231d(interfaceC1801w)) {
                mo9222o((InterfaceC1764d0) entry.getKey());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q */
    public void mo9224q(Object obj) {
        m9211b("setValue");
        this.f7233g++;
        this.f7231e = obj;
        m9214e(null);
    }

    public LiveData() {
        this.f7227a = new Object();
        this.f7228b = new C23974b();
        this.f7229c = 0;
        Object obj = f7226k;
        this.f7232f = obj;
        this.f7236j = new RunnableC1745a();
        this.f7231e = obj;
        this.f7233g = -1;
    }
}
