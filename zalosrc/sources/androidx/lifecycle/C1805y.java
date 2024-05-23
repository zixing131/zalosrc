package androidx.lifecycle;

import androidx.lifecycle.AbstractC1785o;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p351n0.C23504c;
import p376o0.C23973a;
import p376o0.C23974b;

/* renamed from: androidx.lifecycle.y */
/* loaded from: classes.dex */
public class C1805y extends AbstractC1785o {

    /* renamed from: j */
    public static final a f7420j = new a(null);

    /* renamed from: b */
    private final boolean f7421b;

    /* renamed from: c */
    private C23973a f7422c;

    /* renamed from: d */
    private AbstractC1785o.b f7423d;

    /* renamed from: e */
    private final WeakReference f7424e;

    /* renamed from: f */
    private int f7425f;

    /* renamed from: g */
    private boolean f7426g;

    /* renamed from: h */
    private boolean f7427h;

    /* renamed from: i */
    private ArrayList f7428i;

    /* renamed from: androidx.lifecycle.y$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final AbstractC1785o.b m9403a(AbstractC1785o.b bVar, AbstractC1785o.b bVar2) {
            AbstractC19074t.m100208f(bVar, "state1");
            if (bVar2 != null && bVar2.compareTo(bVar) < 0) {
                return bVar2;
            }
            return bVar;
        }
    }

    /* renamed from: androidx.lifecycle.y$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private AbstractC1785o.b f7429a;

        /* renamed from: b */
        private InterfaceC1795t f7430b;

        public b(InterfaceC1799v interfaceC1799v, AbstractC1785o.b bVar) {
            AbstractC19074t.m100208f(bVar, "initialState");
            AbstractC19074t.m100205c(interfaceC1799v);
            this.f7430b = C1807z.m9412f(interfaceC1799v);
            this.f7429a = bVar;
        }

        /* renamed from: a */
        public final void m9404a(InterfaceC1801w interfaceC1801w, AbstractC1785o.a aVar) {
            AbstractC19074t.m100208f(aVar, "event");
            AbstractC1785o.b m9340c = aVar.m9340c();
            this.f7429a = C1805y.f7420j.m9403a(this.f7429a, m9340c);
            InterfaceC1795t interfaceC1795t = this.f7430b;
            AbstractC19074t.m100205c(interfaceC1801w);
            interfaceC1795t.mo4652X6(interfaceC1801w, aVar);
            this.f7429a = m9340c;
        }

        /* renamed from: b */
        public final AbstractC1785o.b m9405b() {
            return this.f7429a;
        }
    }

    private C1805y(InterfaceC1801w interfaceC1801w, boolean z11) {
        this.f7421b = z11;
        this.f7422c = new C23973a();
        this.f7423d = AbstractC1785o.b.INITIALIZED;
        this.f7428i = new ArrayList();
        this.f7424e = new WeakReference(interfaceC1801w);
    }

    /* renamed from: e */
    private final void m9391e(InterfaceC1801w interfaceC1801w) {
        Iterator descendingIterator = this.f7422c.descendingIterator();
        AbstractC19074t.m100207e(descendingIterator, "observerMap.descendingIterator()");
        while (descendingIterator.hasNext() && !this.f7427h) {
            Map.Entry entry = (Map.Entry) descendingIterator.next();
            AbstractC19074t.m100207e(entry, "next()");
            InterfaceC1799v interfaceC1799v = (InterfaceC1799v) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.m9405b().compareTo(this.f7423d) > 0 && !this.f7427h && this.f7422c.contains(interfaceC1799v)) {
                AbstractC1785o.a m9341a = AbstractC1785o.a.Companion.m9341a(bVar.m9405b());
                if (m9341a != null) {
                    m9398n(m9341a.m9340c());
                    bVar.m9404a(interfaceC1801w, m9341a);
                    m9397m();
                } else {
                    throw new IllegalStateException("no event down from " + bVar.m9405b());
                }
            }
        }
    }

    /* renamed from: f */
    private final AbstractC1785o.b m9392f(InterfaceC1799v interfaceC1799v) {
        AbstractC1785o.b bVar;
        b bVar2;
        Map.Entry m125460n = this.f7422c.m125460n(interfaceC1799v);
        AbstractC1785o.b bVar3 = null;
        if (m125460n != null && (bVar2 = (b) m125460n.getValue()) != null) {
            bVar = bVar2.m9405b();
        } else {
            bVar = null;
        }
        if (!this.f7428i.isEmpty()) {
            bVar3 = (AbstractC1785o.b) this.f7428i.get(r0.size() - 1);
        }
        a aVar = f7420j;
        return aVar.m9403a(aVar.m9403a(this.f7423d, bVar), bVar3);
    }

    /* renamed from: g */
    private final void m9393g(String str) {
        if (this.f7421b && !C23504c.m123373h().mo123377c()) {
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    /* renamed from: h */
    private final void m9394h(InterfaceC1801w interfaceC1801w) {
        C23974b.d m125462g = this.f7422c.m125462g();
        AbstractC19074t.m100207e(m125462g, "observerMap.iteratorWithAdditions()");
        while (m125462g.hasNext() && !this.f7427h) {
            Map.Entry entry = (Map.Entry) m125462g.next();
            InterfaceC1799v interfaceC1799v = (InterfaceC1799v) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.m9405b().compareTo(this.f7423d) < 0 && !this.f7427h && this.f7422c.contains(interfaceC1799v)) {
                m9398n(bVar.m9405b());
                AbstractC1785o.a m9342b = AbstractC1785o.a.Companion.m9342b(bVar.m9405b());
                if (m9342b != null) {
                    bVar.m9404a(interfaceC1801w, m9342b);
                    m9397m();
                } else {
                    throw new IllegalStateException("no event up from " + bVar.m9405b());
                }
            }
        }
    }

    /* renamed from: j */
    private final boolean m9395j() {
        if (this.f7422c.size() == 0) {
            return true;
        }
        Map.Entry m125461d = this.f7422c.m125461d();
        AbstractC19074t.m100205c(m125461d);
        AbstractC1785o.b m9405b = ((b) m125461d.getValue()).m9405b();
        Map.Entry m125463j = this.f7422c.m125463j();
        AbstractC19074t.m100205c(m125463j);
        AbstractC1785o.b m9405b2 = ((b) m125463j.getValue()).m9405b();
        if (m9405b == m9405b2 && this.f7423d == m9405b2) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    private final void m9396l(AbstractC1785o.b bVar) {
        AbstractC1785o.b bVar2 = this.f7423d;
        if (bVar2 == bVar) {
            return;
        }
        if (bVar2 == AbstractC1785o.b.INITIALIZED && bVar == AbstractC1785o.b.DESTROYED) {
            throw new IllegalStateException(("no event down from " + this.f7423d + " in component " + this.f7424e.get()).toString());
        }
        this.f7423d = bVar;
        if (!this.f7426g && this.f7425f == 0) {
            this.f7426g = true;
            m9399p();
            this.f7426g = false;
            if (this.f7423d == AbstractC1785o.b.DESTROYED) {
                this.f7422c = new C23973a();
                return;
            }
            return;
        }
        this.f7427h = true;
    }

    /* renamed from: m */
    private final void m9397m() {
        this.f7428i.remove(r0.size() - 1);
    }

    /* renamed from: n */
    private final void m9398n(AbstractC1785o.b bVar) {
        this.f7428i.add(bVar);
    }

    /* renamed from: p */
    private final void m9399p() {
        InterfaceC1801w interfaceC1801w = (InterfaceC1801w) this.f7424e.get();
        if (interfaceC1801w != null) {
            while (!m9395j()) {
                this.f7427h = false;
                AbstractC1785o.b bVar = this.f7423d;
                Map.Entry m125461d = this.f7422c.m125461d();
                AbstractC19074t.m100205c(m125461d);
                if (bVar.compareTo(((b) m125461d.getValue()).m9405b()) < 0) {
                    m9391e(interfaceC1801w);
                }
                Map.Entry m125463j = this.f7422c.m125463j();
                if (!this.f7427h && m125463j != null && this.f7423d.compareTo(((b) m125463j.getValue()).m9405b()) > 0) {
                    m9394h(interfaceC1801w);
                }
            }
            this.f7427h = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
    }

    @Override // androidx.lifecycle.AbstractC1785o
    /* renamed from: a */
    public void mo9335a(InterfaceC1799v interfaceC1799v) {
        InterfaceC1801w interfaceC1801w;
        boolean z11;
        AbstractC19074t.m100208f(interfaceC1799v, "observer");
        m9393g("addObserver");
        AbstractC1785o.b bVar = this.f7423d;
        AbstractC1785o.b bVar2 = AbstractC1785o.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = AbstractC1785o.b.INITIALIZED;
        }
        b bVar3 = new b(interfaceC1799v, bVar2);
        if (((b) this.f7422c.mo125458l(interfaceC1799v, bVar3)) != null || (interfaceC1801w = (InterfaceC1801w) this.f7424e.get()) == null) {
            return;
        }
        if (this.f7425f == 0 && !this.f7426g) {
            z11 = false;
        } else {
            z11 = true;
        }
        AbstractC1785o.b m9392f = m9392f(interfaceC1799v);
        this.f7425f++;
        while (bVar3.m9405b().compareTo(m9392f) < 0 && this.f7422c.contains(interfaceC1799v)) {
            m9398n(bVar3.m9405b());
            AbstractC1785o.a m9342b = AbstractC1785o.a.Companion.m9342b(bVar3.m9405b());
            if (m9342b != null) {
                bVar3.m9404a(interfaceC1801w, m9342b);
                m9397m();
                m9392f = m9392f(interfaceC1799v);
            } else {
                throw new IllegalStateException("no event up from " + bVar3.m9405b());
            }
        }
        if (!z11) {
            m9399p();
        }
        this.f7425f--;
    }

    @Override // androidx.lifecycle.AbstractC1785o
    /* renamed from: b */
    public AbstractC1785o.b mo9336b() {
        return this.f7423d;
    }

    @Override // androidx.lifecycle.AbstractC1785o
    /* renamed from: d */
    public void mo9338d(InterfaceC1799v interfaceC1799v) {
        AbstractC19074t.m100208f(interfaceC1799v, "observer");
        m9393g("removeObserver");
        this.f7422c.mo125459m(interfaceC1799v);
    }

    /* renamed from: i */
    public void m9400i(AbstractC1785o.a aVar) {
        AbstractC19074t.m100208f(aVar, "event");
        m9393g("handleLifecycleEvent");
        m9396l(aVar.m9340c());
    }

    /* renamed from: k */
    public void m9401k(AbstractC1785o.b bVar) {
        AbstractC19074t.m100208f(bVar, "state");
        m9393g("markState");
        m9402o(bVar);
    }

    /* renamed from: o */
    public void m9402o(AbstractC1785o.b bVar) {
        AbstractC19074t.m100208f(bVar, "state");
        m9393g("setCurrentState");
        m9396l(bVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1805y(InterfaceC1801w interfaceC1801w) {
        this(interfaceC1801w, true);
        AbstractC19074t.m100208f(interfaceC1801w, "provider");
    }
}
