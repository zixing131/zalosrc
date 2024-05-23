package p052c8;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.components.MissingDependencyException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p015a9.InterfaceC0661a;
import p015a9.InterfaceC0662b;
import p052c8.C3352o;
import p231i7.AbstractC20357a;
import p506s8.InterfaceC26180a;
import p636x8.InterfaceC29473c;
import p636x8.InterfaceC29474d;

/* renamed from: c8.o */
/* loaded from: classes.dex */
public class C3352o implements InterfaceC3342e, InterfaceC26180a {

    /* renamed from: h */
    private static final InterfaceC0662b f14195h = new InterfaceC0662b() { // from class: c8.l
        @Override // p015a9.InterfaceC0662b
        public final Object get() {
            return Collections.emptySet();
        }
    };

    /* renamed from: a */
    private final Map f14196a;

    /* renamed from: b */
    private final Map f14197b;

    /* renamed from: c */
    private final Map f14198c;

    /* renamed from: d */
    private final List f14199d;

    /* renamed from: e */
    private final C3357t f14200e;

    /* renamed from: f */
    private final AtomicReference f14201f;

    /* renamed from: g */
    private final InterfaceC3347j f14202g;

    /* renamed from: c8.o$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final Executor f14203a;

        /* renamed from: b */
        private final List f14204b = new ArrayList();

        /* renamed from: c */
        private final List f14205c = new ArrayList();

        /* renamed from: d */
        private InterfaceC3347j f14206d = InterfaceC3347j.f14188a;

        b(Executor executor) {
            this.f14203a = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static /* synthetic */ ComponentRegistrar m16887f(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        /* renamed from: b */
        public b m16888b(C3339c c3339c) {
            this.f14205c.add(c3339c);
            return this;
        }

        /* renamed from: c */
        public b m16889c(final ComponentRegistrar componentRegistrar) {
            this.f14204b.add(new InterfaceC0662b() { // from class: c8.p
                @Override // p015a9.InterfaceC0662b
                public final Object get() {
                    ComponentRegistrar m16887f;
                    m16887f = C3352o.b.m16887f(ComponentRegistrar.this);
                    return m16887f;
                }
            });
            return this;
        }

        /* renamed from: d */
        public b m16890d(Collection collection) {
            this.f14204b.addAll(collection);
            return this;
        }

        /* renamed from: e */
        public C3352o m16891e() {
            return new C3352o(this.f14203a, this.f14204b, this.f14205c, this.f14206d);
        }

        /* renamed from: g */
        public b m16892g(InterfaceC3347j interfaceC3347j) {
            this.f14206d = interfaceC3347j;
            return this;
        }
    }

    /* renamed from: m */
    public static b m16874m(Executor executor) {
        return new b(executor);
    }

    /* renamed from: n */
    private void m16875n(List list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.f14199d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((InterfaceC0662b) it.next()).get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f14202g.mo16870a(componentRegistrar));
                        it.remove();
                    }
                } catch (InvalidRegistrarException unused) {
                    it.remove();
                }
            }
            if (this.f14196a.isEmpty()) {
                AbstractC3354q.m16893a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f14196a.keySet());
                arrayList2.addAll(list);
                AbstractC3354q.m16893a(arrayList2);
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                final C3339c c3339c = (C3339c) it2.next();
                this.f14196a.put(c3339c, new C3358u(new InterfaceC0662b() { // from class: c8.k
                    @Override // p015a9.InterfaceC0662b
                    public final Object get() {
                        Object m16878r;
                        m16878r = C3352o.this.m16878r(c3339c);
                        return m16878r;
                    }
                }));
            }
            arrayList.addAll(m16883w(list));
            arrayList.addAll(m16884x());
            m16882v();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((Runnable) it3.next()).run();
        }
        m16881u();
    }

    /* renamed from: o */
    private void m16876o(Map map, boolean z11) {
        for (Map.Entry entry : map.entrySet()) {
            C3339c c3339c = (C3339c) entry.getKey();
            InterfaceC0662b interfaceC0662b = (InterfaceC0662b) entry.getValue();
            if (c3339c.m16833n() || (c3339c.m16834o() && z11)) {
                interfaceC0662b.get();
            }
        }
        this.f14200e.m16922d();
    }

    /* renamed from: q */
    private static List m16877q(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ Object m16878r(C3339c c3339c) {
        return c3339c.m16829h().mo13078a(new C3340c0(c3339c, this));
    }

    /* renamed from: u */
    private void m16881u() {
        Boolean bool = (Boolean) this.f14201f.get();
        if (bool != null) {
            m16876o(this.f14196a, bool.booleanValue());
        }
    }

    /* renamed from: v */
    private void m16882v() {
        for (C3339c c3339c : this.f14196a.keySet()) {
            for (C3355r c3355r : c3339c.m16828g()) {
                if (c3355r.m16916g() && !this.f14198c.containsKey(c3355r.m16912c())) {
                    this.f14198c.put(c3355r.m16912c(), C3359v.m16924b(Collections.emptySet()));
                } else if (this.f14197b.containsKey(c3355r.m16912c())) {
                    continue;
                } else if (!c3355r.m16915f()) {
                    if (!c3355r.m16916g()) {
                        this.f14197b.put(c3355r.m16912c(), C3363z.m16931e());
                    }
                } else {
                    throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", c3339c, c3355r.m16912c()));
                }
            }
        }
    }

    /* renamed from: w */
    private List m16883w(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3339c c3339c = (C3339c) it.next();
            if (c3339c.m16835p()) {
                final InterfaceC0662b interfaceC0662b = (InterfaceC0662b) this.f14196a.get(c3339c);
                for (C3338b0 c3338b0 : c3339c.m16831j()) {
                    if (!this.f14197b.containsKey(c3338b0)) {
                        this.f14197b.put(c3338b0, interfaceC0662b);
                    } else {
                        final C3363z c3363z = (C3363z) ((InterfaceC0662b) this.f14197b.get(c3338b0));
                        arrayList.add(new Runnable() { // from class: c8.m
                            @Override // java.lang.Runnable
                            public final void run() {
                                C3363z.this.m16936j(interfaceC0662b);
                            }
                        });
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: x */
    private List m16884x() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f14196a.entrySet()) {
            C3339c c3339c = (C3339c) entry.getKey();
            if (!c3339c.m16835p()) {
                InterfaceC0662b interfaceC0662b = (InterfaceC0662b) entry.getValue();
                for (C3338b0 c3338b0 : c3339c.m16831j()) {
                    if (!hashMap.containsKey(c3338b0)) {
                        hashMap.put(c3338b0, new HashSet());
                    }
                    ((Set) hashMap.get(c3338b0)).add(interfaceC0662b);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (!this.f14198c.containsKey(entry2.getKey())) {
                this.f14198c.put((C3338b0) entry2.getKey(), C3359v.m16924b((Collection) entry2.getValue()));
            } else {
                final C3359v c3359v = (C3359v) this.f14198c.get(entry2.getKey());
                for (final InterfaceC0662b interfaceC0662b2 : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: c8.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            C3359v.this.m16926a(interfaceC0662b2);
                        }
                    });
                }
            }
        }
        return arrayList;
    }

    @Override // p052c8.InterfaceC3342e
    /* renamed from: a */
    public /* synthetic */ Object mo16847a(Class cls) {
        return AbstractC3341d.m16857b(this, cls);
    }

    @Override // p052c8.InterfaceC3342e
    /* renamed from: b */
    public InterfaceC0661a mo16848b(C3338b0 c3338b0) {
        InterfaceC0662b mo16854h = mo16854h(c3338b0);
        if (mo16854h == null) {
            return C3363z.m16931e();
        }
        if (mo16854h instanceof C3363z) {
            return (C3363z) mo16854h;
        }
        return C3363z.m16935i(mo16854h);
    }

    @Override // p052c8.InterfaceC3342e
    /* renamed from: c */
    public /* synthetic */ Set mo16849c(Class cls) {
        return AbstractC3341d.m16861f(this, cls);
    }

    @Override // p052c8.InterfaceC3342e
    /* renamed from: d */
    public /* synthetic */ InterfaceC0662b mo16850d(Class cls) {
        return AbstractC3341d.m16859d(this, cls);
    }

    @Override // p052c8.InterfaceC3342e
    /* renamed from: e */
    public synchronized InterfaceC0662b mo16851e(C3338b0 c3338b0) {
        C3359v c3359v = (C3359v) this.f14198c.get(c3338b0);
        if (c3359v != null) {
            return c3359v;
        }
        return f14195h;
    }

    @Override // p052c8.InterfaceC3342e
    /* renamed from: f */
    public /* synthetic */ Set mo16852f(C3338b0 c3338b0) {
        return AbstractC3341d.m16860e(this, c3338b0);
    }

    @Override // p052c8.InterfaceC3342e
    /* renamed from: g */
    public /* synthetic */ Object mo16853g(C3338b0 c3338b0) {
        return AbstractC3341d.m16856a(this, c3338b0);
    }

    @Override // p052c8.InterfaceC3342e
    /* renamed from: h */
    public synchronized InterfaceC0662b mo16854h(C3338b0 c3338b0) {
        AbstractC3336a0.m16813c(c3338b0, "Null interface requested.");
        return (InterfaceC0662b) this.f14197b.get(c3338b0);
    }

    @Override // p052c8.InterfaceC3342e
    /* renamed from: i */
    public /* synthetic */ InterfaceC0661a mo16855i(Class cls) {
        return AbstractC3341d.m16858c(this, cls);
    }

    /* renamed from: p */
    public void m16885p(boolean z11) {
        HashMap hashMap;
        if (!AbstractC20357a.m106108a(this.f14201f, null, Boolean.valueOf(z11))) {
            return;
        }
        synchronized (this) {
            hashMap = new HashMap(this.f14196a);
        }
        m16876o(hashMap, z11);
    }

    private C3352o(Executor executor, Iterable iterable, Collection collection, InterfaceC3347j interfaceC3347j) {
        this.f14196a = new HashMap();
        this.f14197b = new HashMap();
        this.f14198c = new HashMap();
        this.f14201f = new AtomicReference();
        C3357t c3357t = new C3357t(executor);
        this.f14200e = c3357t;
        this.f14202g = interfaceC3347j;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C3339c.m16827s(c3357t, C3357t.class, InterfaceC29474d.class, InterfaceC29473c.class));
        arrayList.add(C3339c.m16827s(this, InterfaceC26180a.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C3339c c3339c = (C3339c) it.next();
            if (c3339c != null) {
                arrayList.add(c3339c);
            }
        }
        this.f14199d = m16877q(iterable);
        m16875n(arrayList);
    }
}
