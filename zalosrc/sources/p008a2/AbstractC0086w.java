package p008a2;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p028b2.AbstractC2494c;
import p119e2.C18178c;
import p119e2.InterfaceC18182g;
import p119e2.InterfaceC18183h;
import p119e2.InterfaceC18185j;
import p119e2.InterfaceC18186k;
import p147f2.C18700f;
import p351n0.C23504c;
import qm0.AbstractC25363p0;
import qm0.AbstractC25368s;
import qm0.AbstractC25379x0;

/* renamed from: a2.w */
/* loaded from: classes.dex */
public abstract class AbstractC0086w {
    public static final c Companion = new c(null);

    /* renamed from: a */
    protected volatile InterfaceC18182g f368a;

    /* renamed from: b */
    private Executor f369b;

    /* renamed from: c */
    private Executor f370c;

    /* renamed from: d */
    private InterfaceC18183h f371d;

    /* renamed from: f */
    private boolean f373f;

    /* renamed from: g */
    private boolean f374g;

    /* renamed from: h */
    protected List f375h;

    /* renamed from: k */
    private C0059c f378k;

    /* renamed from: m */
    private final Map f380m;

    /* renamed from: n */
    private final Map f381n;

    /* renamed from: e */
    private final C0080q f372e = mo345h();

    /* renamed from: i */
    private Map f376i = new LinkedHashMap();

    /* renamed from: j */
    private final ReentrantReadWriteLock f377j = new ReentrantReadWriteLock();

    /* renamed from: l */
    private final ThreadLocal f379l = new ThreadLocal();

    /* renamed from: a2.w$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private final Context f382a;

        /* renamed from: b */
        private final Class f383b;

        /* renamed from: c */
        private final String f384c;

        /* renamed from: d */
        private final List f385d;

        /* renamed from: e */
        private final List f386e;

        /* renamed from: f */
        private List f387f;

        /* renamed from: g */
        private Executor f388g;

        /* renamed from: h */
        private Executor f389h;

        /* renamed from: i */
        private InterfaceC18183h.c f390i;

        /* renamed from: j */
        private boolean f391j;

        /* renamed from: k */
        private d f392k;

        /* renamed from: l */
        private Intent f393l;

        /* renamed from: m */
        private boolean f394m;

        /* renamed from: n */
        private boolean f395n;

        /* renamed from: o */
        private long f396o;

        /* renamed from: p */
        private TimeUnit f397p;

        /* renamed from: q */
        private final e f398q;

        /* renamed from: r */
        private Set f399r;

        /* renamed from: s */
        private Set f400s;

        /* renamed from: t */
        private String f401t;

        /* renamed from: u */
        private File f402u;

        /* renamed from: v */
        private Callable f403v;

        public a(Context context, Class cls, String str) {
            AbstractC19074t.m100208f(context, "context");
            AbstractC19074t.m100208f(cls, "klass");
            this.f382a = context;
            this.f383b = cls;
            this.f384c = str;
            this.f385d = new ArrayList();
            this.f386e = new ArrayList();
            this.f387f = new ArrayList();
            this.f392k = d.AUTOMATIC;
            this.f394m = true;
            this.f396o = -1L;
            this.f398q = new e();
            this.f399r = new LinkedHashSet();
        }

        /* renamed from: a */
        public a m362a(b bVar) {
            AbstractC19074t.m100208f(bVar, "callback");
            this.f385d.add(bVar);
            return this;
        }

        /* renamed from: b */
        public a m363b(AbstractC2494c... abstractC2494cArr) {
            AbstractC19074t.m100208f(abstractC2494cArr, "migrations");
            if (this.f400s == null) {
                this.f400s = new HashSet();
            }
            for (AbstractC2494c abstractC2494c : abstractC2494cArr) {
                Set set = this.f400s;
                AbstractC19074t.m100205c(set);
                set.add(Integer.valueOf(abstractC2494c.f10176a));
                Set set2 = this.f400s;
                AbstractC19074t.m100205c(set2);
                set2.add(Integer.valueOf(abstractC2494c.f10177b));
            }
            this.f398q.m377b((AbstractC2494c[]) Arrays.copyOf(abstractC2494cArr, abstractC2494cArr.length));
            return this;
        }

        /* renamed from: c */
        public a m364c() {
            this.f391j = true;
            return this;
        }

        /* renamed from: d */
        public AbstractC0086w m365d() {
            int i11;
            int i12;
            Executor executor = this.f388g;
            if (executor == null && this.f389h == null) {
                Executor m123372g = C23504c.m123372g();
                this.f389h = m123372g;
                this.f388g = m123372g;
            } else if (executor != null && this.f389h == null) {
                this.f389h = executor;
            } else if (executor == null) {
                this.f388g = this.f389h;
            }
            Set set = this.f400s;
            if (set != null) {
                AbstractC19074t.m100205c(set);
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    int intValue = ((Number) it.next()).intValue();
                    if (!(!this.f399r.contains(Integer.valueOf(intValue)))) {
                        throw new IllegalArgumentException(("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + intValue).toString());
                    }
                }
            }
            InterfaceC18183h.c cVar = this.f390i;
            if (cVar == null) {
                cVar = new C18700f();
            }
            if (cVar != null) {
                if (this.f396o > 0) {
                    if (this.f384c != null) {
                        long j11 = this.f396o;
                        TimeUnit timeUnit = this.f397p;
                        if (timeUnit != null) {
                            Executor executor2 = this.f388g;
                            if (executor2 != null) {
                                cVar = new C0063e(cVar, new C0059c(j11, timeUnit, executor2));
                            } else {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                        } else {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.".toString());
                    }
                }
                String str = this.f401t;
                if (str != null || this.f402u != null || this.f403v != null) {
                    if (this.f384c != null) {
                        int i13 = 0;
                        if (str == null) {
                            i11 = 0;
                        } else {
                            i11 = 1;
                        }
                        File file = this.f402u;
                        if (file == null) {
                            i12 = 0;
                        } else {
                            i12 = 1;
                        }
                        Callable callable = this.f403v;
                        if (callable != null) {
                            i13 = 1;
                        }
                        if (i11 + i12 + i13 == 1) {
                            cVar = new C0064e0(str, file, callable, cVar);
                        } else {
                            throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.".toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.".toString());
                    }
                }
            } else {
                cVar = null;
            }
            InterfaceC18183h.c cVar2 = cVar;
            if (cVar2 != null) {
                Context context = this.f382a;
                String str2 = this.f384c;
                e eVar = this.f398q;
                List list = this.f385d;
                boolean z11 = this.f391j;
                d m374d = this.f392k.m374d(context);
                Executor executor3 = this.f388g;
                if (executor3 != null) {
                    Executor executor4 = this.f389h;
                    if (executor4 != null) {
                        C0069h c0069h = new C0069h(context, str2, cVar2, eVar, list, z11, m374d, executor3, executor4, this.f393l, this.f394m, this.f395n, this.f399r, this.f401t, this.f402u, this.f403v, null, this.f386e, this.f387f);
                        AbstractC0086w abstractC0086w = (AbstractC0086w) C0085v.m328b(this.f383b, "_Impl");
                        abstractC0086w.m358u(c0069h);
                        return abstractC0086w;
                    }
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        /* renamed from: e */
        public a m366e() {
            this.f394m = false;
            this.f395n = true;
            return this;
        }

        /* renamed from: f */
        public a m367f(InterfaceC18183h.c cVar) {
            this.f390i = cVar;
            return this;
        }

        /* renamed from: g */
        public a m368g(Executor executor) {
            AbstractC19074t.m100208f(executor, "executor");
            this.f388g = executor;
            return this;
        }
    }

    /* renamed from: a2.w$b */
    /* loaded from: classes.dex */
    public static abstract class b {
        /* renamed from: a */
        public void mo369a(InterfaceC18182g interfaceC18182g) {
            AbstractC19074t.m100208f(interfaceC18182g, "db");
        }

        /* renamed from: b */
        public void m370b(InterfaceC18182g interfaceC18182g) {
            AbstractC19074t.m100208f(interfaceC18182g, "db");
        }

        /* renamed from: c */
        public void mo371c(InterfaceC18182g interfaceC18182g) {
            AbstractC19074t.m100208f(interfaceC18182g, "db");
        }
    }

    /* renamed from: a2.w$c */
    /* loaded from: classes.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: a2.w$d */
    /* loaded from: classes.dex */
    public enum d {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        /* renamed from: c */
        private final boolean m373c(ActivityManager activityManager) {
            return C18178c.m96921b(activityManager);
        }

        /* renamed from: d */
        public final d m374d(Context context) {
            AbstractC19074t.m100208f(context, "context");
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = context.getSystemService("activity");
            AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            if (!m373c((ActivityManager) systemService)) {
                return WRITE_AHEAD_LOGGING;
            }
            return TRUNCATE;
        }
    }

    /* renamed from: a2.w$e */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a */
        private final Map f408a = new LinkedHashMap();

        /* renamed from: a */
        private final void m375a(AbstractC2494c abstractC2494c) {
            int i11 = abstractC2494c.f10176a;
            int i12 = abstractC2494c.f10177b;
            Map map = this.f408a;
            Integer valueOf = Integer.valueOf(i11);
            Object obj = map.get(valueOf);
            if (obj == null) {
                obj = new TreeMap();
                map.put(valueOf, obj);
            }
            TreeMap treeMap = (TreeMap) obj;
            if (treeMap.containsKey(Integer.valueOf(i12))) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Overriding migration ");
                sb2.append(treeMap.get(Integer.valueOf(i12)));
                sb2.append(" with ");
                sb2.append(abstractC2494c);
            }
            treeMap.put(Integer.valueOf(i12), abstractC2494c);
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x0016 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:5:0x0017  */
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final List m376e(List list, boolean z11, int i11, int i12) {
            TreeMap treeMap;
            Set<Integer> keySet;
            boolean z12;
            do {
                if (z11) {
                    if (i11 >= i12) {
                        return list;
                    }
                    treeMap = (TreeMap) this.f408a.get(Integer.valueOf(i11));
                    if (treeMap != null) {
                        return null;
                    }
                    if (z11) {
                        keySet = treeMap.descendingKeySet();
                    } else {
                        keySet = treeMap.keySet();
                    }
                    for (Integer num : keySet) {
                        if (z11) {
                            int i13 = i11 + 1;
                            AbstractC19074t.m100207e(num, "targetVersion");
                            int intValue = num.intValue();
                            if (i13 <= intValue && intValue <= i12) {
                                Object obj = treeMap.get(num);
                                AbstractC19074t.m100205c(obj);
                                list.add(obj);
                                i11 = num.intValue();
                                z12 = true;
                                break;
                            }
                        } else {
                            AbstractC19074t.m100207e(num, "targetVersion");
                            int intValue2 = num.intValue();
                            if (i12 <= intValue2 && intValue2 < i11) {
                                Object obj2 = treeMap.get(num);
                                AbstractC19074t.m100205c(obj2);
                                list.add(obj2);
                                i11 = num.intValue();
                                z12 = true;
                                break;
                                break;
                            }
                        }
                    }
                    z12 = false;
                } else {
                    if (i11 <= i12) {
                        return list;
                    }
                    treeMap = (TreeMap) this.f408a.get(Integer.valueOf(i11));
                    if (treeMap != null) {
                    }
                }
            } while (z12);
            return null;
        }

        /* renamed from: b */
        public void m377b(AbstractC2494c... abstractC2494cArr) {
            AbstractC19074t.m100208f(abstractC2494cArr, "migrations");
            for (AbstractC2494c abstractC2494c : abstractC2494cArr) {
                m375a(abstractC2494c);
            }
        }

        /* renamed from: c */
        public final boolean m378c(int i11, int i12) {
            Map m380f = m380f();
            if (m380f.containsKey(Integer.valueOf(i11))) {
                Map map = (Map) m380f.get(Integer.valueOf(i11));
                if (map == null) {
                    map = AbstractC25363p0.m131404i();
                }
                return map.containsKey(Integer.valueOf(i12));
            }
            return false;
        }

        /* renamed from: d */
        public List m379d(int i11, int i12) {
            boolean z11;
            List m131502j;
            if (i11 == i12) {
                m131502j = AbstractC25368s.m131502j();
                return m131502j;
            }
            if (i12 > i11) {
                z11 = true;
            } else {
                z11 = false;
            }
            return m376e(new ArrayList(), z11, i11, i12);
        }

        /* renamed from: f */
        public Map m380f() {
            return this.f408a;
        }
    }

    /* renamed from: a2.w$f */
    /* loaded from: classes2.dex */
    public static abstract class f {
    }

    /* renamed from: a2.w$g */
    /* loaded from: classes2.dex */
    public static final class g extends AbstractC19075u implements InterfaceC18505l {
        g() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final Object mo205i9(InterfaceC18182g interfaceC18182g) {
            AbstractC19074t.m100208f(interfaceC18182g, "it");
            AbstractC0086w.this.m334v();
            return null;
        }
    }

    /* renamed from: a2.w$h */
    /* loaded from: classes2.dex */
    public static final class h extends AbstractC19075u implements InterfaceC18505l {
        h() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final Object mo205i9(InterfaceC18182g interfaceC18182g) {
            AbstractC19074t.m100208f(interfaceC18182g, "it");
            AbstractC0086w.this.m335w();
            return null;
        }
    }

    public AbstractC0086w() {
        Map synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        AbstractC19074t.m100207e(synchronizedMap, "synchronizedMap(mutableMapOf())");
        this.f380m = synchronizedMap;
        this.f381n = new LinkedHashMap();
    }

    /* renamed from: B */
    public static /* synthetic */ Cursor m330B(AbstractC0086w abstractC0086w, InterfaceC18185j interfaceC18185j, CancellationSignal cancellationSignal, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                cancellationSignal = null;
            }
            return abstractC0086w.m336A(interfaceC18185j, cancellationSignal);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
    }

    /* renamed from: F */
    private final Object m331F(Class cls, InterfaceC18183h interfaceC18183h) {
        if (cls.isInstance(interfaceC18183h)) {
            return interfaceC18183h;
        }
        if (interfaceC18183h instanceof InterfaceC0071i) {
            return m331F(cls, ((InterfaceC0071i) interfaceC18183h).mo186a());
        }
        return null;
    }

    /* renamed from: v */
    public final void m334v() {
        m340c();
        InterfaceC18182g mo187p0 = m352o().mo187p0();
        m351n().m298v(mo187p0);
        if (mo187p0.mo203x0()) {
            mo187p0.mo190D();
        } else {
            mo187p0.mo194e();
        }
    }

    /* renamed from: w */
    public final void m335w() {
        m352o().mo187p0().mo197l();
        if (!m357t()) {
            m351n().m293n();
        }
    }

    /* renamed from: A */
    public Cursor m336A(InterfaceC18185j interfaceC18185j, CancellationSignal cancellationSignal) {
        AbstractC19074t.m100208f(interfaceC18185j, "query");
        m340c();
        m341d();
        if (cancellationSignal != null) {
            return m352o().mo187p0().mo191H(interfaceC18185j, cancellationSignal);
        }
        return m352o().mo187p0().mo188B0(interfaceC18185j);
    }

    /* renamed from: C */
    public Object m337C(Callable callable) {
        AbstractC19074t.m100208f(callable, "body");
        m342e();
        try {
            Object call = callable.call();
            m339E();
            return call;
        } finally {
            m347j();
        }
    }

    /* renamed from: D */
    public void m338D(Runnable runnable) {
        AbstractC19074t.m100208f(runnable, "body");
        m342e();
        try {
            runnable.run();
            m339E();
        } finally {
            m347j();
        }
    }

    /* renamed from: E */
    public void m339E() {
        m352o().mo187p0().mo196k();
    }

    /* renamed from: c */
    public void m340c() {
        if (this.f373f || (!m360y())) {
        } else {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.".toString());
        }
    }

    /* renamed from: d */
    public void m341d() {
        if (!m357t() && this.f379l.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.".toString());
        }
    }

    /* renamed from: e */
    public void m342e() {
        m340c();
        C0059c c0059c = this.f378k;
        if (c0059c == null) {
            m334v();
        } else {
            c0059c.m169g(new g());
        }
    }

    /* renamed from: f */
    public abstract void mo343f();

    /* renamed from: g */
    public InterfaceC18186k m344g(String str) {
        AbstractC19074t.m100208f(str, "sql");
        m340c();
        m341d();
        return m352o().mo187p0().mo193b0(str);
    }

    /* renamed from: h */
    protected abstract C0080q mo345h();

    /* renamed from: i */
    protected abstract InterfaceC18183h mo346i(C0069h c0069h);

    /* renamed from: j */
    public void m347j() {
        C0059c c0059c = this.f378k;
        if (c0059c == null) {
            m335w();
        } else {
            c0059c.m169g(new h());
        }
    }

    /* renamed from: k */
    public List mo348k(Map map) {
        List m131502j;
        AbstractC19074t.m100208f(map, "autoMigrationSpecs");
        m131502j = AbstractC25368s.m131502j();
        return m131502j;
    }

    /* renamed from: l */
    public final Map m349l() {
        return this.f380m;
    }

    /* renamed from: m */
    public final Lock m350m() {
        ReentrantReadWriteLock.ReadLock readLock = this.f377j.readLock();
        AbstractC19074t.m100207e(readLock, "readWriteLock.readLock()");
        return readLock;
    }

    /* renamed from: n */
    public C0080q m351n() {
        return this.f372e;
    }

    /* renamed from: o */
    public InterfaceC18183h m352o() {
        InterfaceC18183h interfaceC18183h = this.f371d;
        if (interfaceC18183h == null) {
            AbstractC19074t.m100223u("internalOpenHelper");
            return null;
        }
        return interfaceC18183h;
    }

    /* renamed from: p */
    public Executor m353p() {
        Executor executor = this.f369b;
        if (executor == null) {
            AbstractC19074t.m100223u("internalQueryExecutor");
            return null;
        }
        return executor;
    }

    /* renamed from: q */
    public Set mo354q() {
        Set m131551e;
        m131551e = AbstractC25379x0.m131551e();
        return m131551e;
    }

    /* renamed from: r */
    protected Map mo355r() {
        Map m131404i;
        m131404i = AbstractC25363p0.m131404i();
        return m131404i;
    }

    /* renamed from: s */
    public Executor m356s() {
        Executor executor = this.f370c;
        if (executor == null) {
            AbstractC19074t.m100223u("internalTransactionExecutor");
            return null;
        }
        return executor;
    }

    /* renamed from: t */
    public boolean m357t() {
        return m352o().mo187p0().mo202v0();
    }

    /* renamed from: u */
    public void m358u(C0069h c0069h) {
        boolean z11;
        AbstractC19074t.m100208f(c0069h, "configuration");
        this.f371d = mo346i(c0069h);
        Set mo354q = mo354q();
        BitSet bitSet = new BitSet();
        Iterator it = mo354q.iterator();
        while (true) {
            int i11 = -1;
            if (it.hasNext()) {
                Class cls = (Class) it.next();
                int size = c0069h.f301r.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i12 = size - 1;
                        if (cls.isAssignableFrom(c0069h.f301r.get(size).getClass())) {
                            bitSet.set(size);
                            i11 = size;
                            break;
                        } else if (i12 < 0) {
                            break;
                        } else {
                            size = i12;
                        }
                    }
                }
                if (i11 >= 0) {
                    this.f376i.put(cls, c0069h.f301r.get(i11));
                } else {
                    throw new IllegalArgumentException(("A required auto migration spec (" + cls.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
            } else {
                int size2 = c0069h.f301r.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i13 = size2 - 1;
                        if (bitSet.get(size2)) {
                            if (i13 < 0) {
                                break;
                            } else {
                                size2 = i13;
                            }
                        } else {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.".toString());
                        }
                    }
                }
                Iterator it2 = mo348k(this.f376i).iterator();
                while (true) {
                    z11 = false;
                    if (!it2.hasNext()) {
                        break;
                    }
                    AbstractC2494c abstractC2494c = (AbstractC2494c) it2.next();
                    if (!c0069h.f287d.m378c(abstractC2494c.f10176a, abstractC2494c.f10177b)) {
                        c0069h.f287d.m377b(abstractC2494c);
                    }
                }
                C0062d0 c0062d0 = (C0062d0) m331F(C0062d0.class, m352o());
                if (c0062d0 != null) {
                    c0062d0.m231d(c0069h);
                }
                C0061d c0061d = (C0061d) m331F(C0061d.class, m352o());
                if (c0061d != null) {
                    this.f378k = c0061d.f232q;
                    m351n().m295q(c0061d.f232q);
                }
                if (c0069h.f290g == d.WRITE_AHEAD_LOGGING) {
                    z11 = true;
                }
                m352o().setWriteAheadLoggingEnabled(z11);
                this.f375h = c0069h.f288e;
                this.f369b = c0069h.f291h;
                this.f370c = new ExecutorC0072i0(c0069h.f292i);
                this.f373f = c0069h.f289f;
                this.f374g = z11;
                if (c0069h.f293j != null) {
                    if (c0069h.f285b != null) {
                        m351n().m296r(c0069h.f284a, c0069h.f285b, c0069h.f293j);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                Map mo355r = mo355r();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry entry : mo355r.entrySet()) {
                    Class cls2 = (Class) entry.getKey();
                    for (Class cls3 : (List) entry.getValue()) {
                        int size3 = c0069h.f300q.size() - 1;
                        if (size3 >= 0) {
                            while (true) {
                                int i14 = size3 - 1;
                                if (cls3.isAssignableFrom(c0069h.f300q.get(size3).getClass())) {
                                    bitSet2.set(size3);
                                    break;
                                } else if (i14 < 0) {
                                    break;
                                } else {
                                    size3 = i14;
                                }
                            }
                        }
                        size3 = -1;
                        if (size3 >= 0) {
                            this.f381n.put(cls3, c0069h.f300q.get(size3));
                        } else {
                            throw new IllegalArgumentException(("A required type converter (" + cls3 + ") for " + cls2.getCanonicalName() + " is missing in the database configuration.").toString());
                        }
                    }
                }
                int size4 = c0069h.f300q.size() - 1;
                if (size4 < 0) {
                    return;
                }
                while (true) {
                    int i15 = size4 - 1;
                    if (bitSet2.get(size4)) {
                        if (i15 >= 0) {
                            size4 = i15;
                        } else {
                            return;
                        }
                    } else {
                        throw new IllegalArgumentException("Unexpected type converter " + c0069h.f300q.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                    }
                }
            }
        }
    }

    /* renamed from: x */
    public void m359x(InterfaceC18182g interfaceC18182g) {
        AbstractC19074t.m100208f(interfaceC18182g, "db");
        m351n().m290k(interfaceC18182g);
    }

    /* renamed from: y */
    public final boolean m360y() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public boolean m361z() {
        Boolean bool;
        boolean isOpen;
        C0059c c0059c = this.f378k;
        if (c0059c != null) {
            isOpen = c0059c.m174l();
        } else {
            InterfaceC18182g interfaceC18182g = this.f368a;
            if (interfaceC18182g != null) {
                isOpen = interfaceC18182g.isOpen();
            } else {
                bool = null;
                return AbstractC19074t.m100204b(bool, Boolean.TRUE);
            }
        }
        bool = Boolean.valueOf(isOpen);
        return AbstractC19074t.m100204b(bool, Boolean.TRUE);
    }
}
