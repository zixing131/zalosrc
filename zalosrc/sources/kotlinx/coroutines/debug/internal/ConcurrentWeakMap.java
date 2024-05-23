package kotlinx.coroutines.debug.internal;

import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gn0.InterfaceC19517a;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlinx.coroutines.channels.AbstractC21798a;
import kotlinx.coroutines.internal.Symbol;
import ln0.AbstractC22543l;
import pm0.C24848g0;
import qm0.AbstractC25342f;
import qm0.AbstractC25344g;

/* loaded from: classes7.dex */
public final class ConcurrentWeakMap<K, V> extends AbstractC25342f {

    /* renamed from: q */
    private static final AtomicIntegerFieldUpdater f106328q = AtomicIntegerFieldUpdater.newUpdater(ConcurrentWeakMap.class, "_size");

    /* renamed from: r */
    private static final AtomicReferenceFieldUpdater f106329r = AtomicReferenceFieldUpdater.newUpdater(ConcurrentWeakMap.class, Object.class, "core");
    private volatile int _size;
    private volatile Object core;

    /* renamed from: p */
    private final ReferenceQueue f106330p;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes7.dex */
    public final class Core {

        /* renamed from: g */
        private static final AtomicIntegerFieldUpdater f106331g = AtomicIntegerFieldUpdater.newUpdater(Core.class, "load");

        /* renamed from: a */
        private final int f106332a;

        /* renamed from: b */
        private final int f106333b;

        /* renamed from: c */
        private final int f106334c;

        /* renamed from: d */
        private final AtomicReferenceArray f106335d;

        /* renamed from: e */
        private final AtomicReferenceArray f106336e;
        private volatile int load;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes7.dex */
        public final class KeyValueIterator<E> implements Iterator<E>, InterfaceC19517a {

            /* renamed from: p */
            private final InterfaceC18509p f106338p;

            /* renamed from: q */
            private int f106339q = -1;

            /* renamed from: r */
            private Object f106340r;

            /* renamed from: s */
            private Object f106341s;

            public KeyValueIterator(InterfaceC18509p interfaceC18509p) {
                this.f106338p = interfaceC18509p;
                m113224a();
            }

            /* renamed from: a */
            private final void m113224a() {
                T t7;
                while (true) {
                    int i11 = this.f106339q + 1;
                    this.f106339q = i11;
                    if (i11 < Core.this.f106332a) {
                        HashedWeakRef hashedWeakRef = (HashedWeakRef) Core.this.f106335d.get(this.f106339q);
                        if (hashedWeakRef != null && (t7 = hashedWeakRef.get()) != 0) {
                            this.f106340r = t7;
                            Object obj = Core.this.f106336e.get(this.f106339q);
                            if (obj instanceof Marked) {
                                obj = ((Marked) obj).f106399a;
                            }
                            if (obj != null) {
                                this.f106341s = obj;
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
            }

            @Override // java.util.Iterator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public Void remove() {
                ConcurrentWeakMapKt.m113232e();
                throw new KotlinNothingValueException();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.f106339q < Core.this.f106332a) {
                    return true;
                }
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                if (this.f106339q < Core.this.f106332a) {
                    InterfaceC18509p interfaceC18509p = this.f106338p;
                    Object obj = this.f106340r;
                    if (obj == null) {
                        AbstractC19074t.m100223u("key");
                        obj = C24848g0.f119245a;
                    }
                    Object obj2 = this.f106341s;
                    if (obj2 == null) {
                        AbstractC19074t.m100223u("value");
                        obj2 = C24848g0.f119245a;
                    }
                    Object mo240pC = interfaceC18509p.mo240pC(obj, obj2);
                    m113224a();
                    return mo240pC;
                }
                throw new NoSuchElementException();
            }
        }

        public Core(int i11) {
            this.f106332a = i11;
            this.f106333b = Integer.numberOfLeadingZeros(i11) + 1;
            this.f106334c = (i11 * 2) / 3;
            this.f106335d = new AtomicReferenceArray(i11);
            this.f106336e = new AtomicReferenceArray(i11);
        }

        /* renamed from: f */
        private final int m113216f(int i11) {
            return (i11 * (-1640531527)) >>> this.f106333b;
        }

        /* renamed from: i */
        public static /* synthetic */ Object m113217i(Core core, Object obj, Object obj2, HashedWeakRef hashedWeakRef, int i11, Object obj3) {
            if ((i11 & 4) != 0) {
                hashedWeakRef = null;
            }
            return core.m113222h(obj, obj2, hashedWeakRef);
        }

        /* renamed from: k */
        private final void m113218k(int i11) {
            Object obj;
            do {
                obj = this.f106336e.get(i11);
                if (obj == null || (obj instanceof Marked)) {
                    return;
                }
            } while (!AbstractC21798a.m113202a(this.f106336e, i11, obj, null));
            ConcurrentWeakMap.this.m113207i();
        }

        /* renamed from: d */
        public final void m113219d(HashedWeakRef hashedWeakRef) {
            int m113216f = m113216f(hashedWeakRef.f106398a);
            while (true) {
                HashedWeakRef hashedWeakRef2 = (HashedWeakRef) this.f106335d.get(m113216f);
                if (hashedWeakRef2 == null) {
                    return;
                }
                if (hashedWeakRef2 == hashedWeakRef) {
                    m113218k(m113216f);
                    return;
                } else {
                    if (m113216f == 0) {
                        m113216f = this.f106332a;
                    }
                    m113216f--;
                }
            }
        }

        /* renamed from: e */
        public final Object m113220e(Object obj) {
            int m113216f = m113216f(obj.hashCode());
            while (true) {
                HashedWeakRef hashedWeakRef = (HashedWeakRef) this.f106335d.get(m113216f);
                if (hashedWeakRef == null) {
                    return null;
                }
                T t7 = hashedWeakRef.get();
                if (AbstractC19074t.m100204b(obj, t7)) {
                    Object obj2 = this.f106336e.get(m113216f);
                    if (obj2 instanceof Marked) {
                        return ((Marked) obj2).f106399a;
                    }
                    return obj2;
                }
                if (t7 == 0) {
                    m113218k(m113216f);
                }
                if (m113216f == 0) {
                    m113216f = this.f106332a;
                }
                m113216f--;
            }
        }

        /* renamed from: g */
        public final Iterator m113221g(InterfaceC18509p interfaceC18509p) {
            return new KeyValueIterator(interfaceC18509p);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:            r6 = r5.f106336e.get(r0);     */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:            if ((r6 instanceof kotlinx.coroutines.debug.internal.Marked) == false) goto L30;     */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:            if (kotlinx.coroutines.channels.AbstractC21798a.m113202a(r5.f106336e, r0, r6, r7) == false) goto L50;     */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:            return r6;     */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:            r6 = kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.f106349a;     */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:            return r6;     */
        /* renamed from: h */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object m113222h(Object obj, Object obj2, HashedWeakRef hashedWeakRef) {
            int i11;
            Symbol symbol;
            int m113216f = m113216f(obj.hashCode());
            boolean z11 = false;
            while (true) {
                HashedWeakRef hashedWeakRef2 = (HashedWeakRef) this.f106335d.get(m113216f);
                if (hashedWeakRef2 == null) {
                    if (obj2 == null) {
                        return null;
                    }
                    if (!z11) {
                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f106331g;
                        do {
                            i11 = atomicIntegerFieldUpdater.get(this);
                            if (i11 >= this.f106334c) {
                                symbol = ConcurrentWeakMapKt.f106349a;
                                return symbol;
                            }
                        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, i11 + 1));
                        z11 = true;
                    }
                    if (hashedWeakRef == null) {
                        hashedWeakRef = new HashedWeakRef(obj, ConcurrentWeakMap.this.f106330p);
                    }
                    if (AbstractC21798a.m113202a(this.f106335d, m113216f, null, hashedWeakRef)) {
                        break;
                    }
                } else {
                    T t7 = hashedWeakRef2.get();
                    if (AbstractC19074t.m100204b(obj, t7)) {
                        if (z11) {
                            f106331g.decrementAndGet(this);
                        }
                    } else {
                        if (t7 == 0) {
                            m113218k(m113216f);
                        }
                        if (m113216f == 0) {
                            m113216f = this.f106332a;
                        }
                        m113216f--;
                    }
                }
            }
        }

        /* renamed from: j */
        public final Core m113223j() {
            int m116580c;
            Object obj;
            Object obj2;
            Symbol symbol;
            Marked m113231d;
            while (true) {
                m116580c = AbstractC22543l.m116580c(ConcurrentWeakMap.this.size(), 4);
                Core core = new Core(Integer.highestOneBit(m116580c) * 4);
                int i11 = this.f106332a;
                for (int i12 = 0; i12 < i11; i12++) {
                    HashedWeakRef hashedWeakRef = (HashedWeakRef) this.f106335d.get(i12);
                    if (hashedWeakRef != null) {
                        obj = hashedWeakRef.get();
                    } else {
                        obj = null;
                    }
                    if (hashedWeakRef != null && obj == null) {
                        m113218k(i12);
                    }
                    while (true) {
                        obj2 = this.f106336e.get(i12);
                        if (obj2 instanceof Marked) {
                            obj2 = ((Marked) obj2).f106399a;
                            break;
                        }
                        AtomicReferenceArray atomicReferenceArray = this.f106336e;
                        m113231d = ConcurrentWeakMapKt.m113231d(obj2);
                        if (AbstractC21798a.m113202a(atomicReferenceArray, i12, obj2, m113231d)) {
                            break;
                        }
                    }
                    if (obj != null && obj2 != null) {
                        Object m113222h = core.m113222h(obj, obj2, hashedWeakRef);
                        symbol = ConcurrentWeakMapKt.f106349a;
                        if (m113222h != symbol) {
                        }
                    }
                }
                return core;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes7.dex */
    public static final class Entry<K, V> implements Map.Entry<K, V>, InterfaceC19517a {

        /* renamed from: p */
        private final Object f106343p;

        /* renamed from: q */
        private final Object f106344q;

        public Entry(Object obj, Object obj2) {
            this.f106343p = obj;
            this.f106344q = obj2;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f106343p;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f106344q;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            ConcurrentWeakMapKt.m113232e();
            throw new KotlinNothingValueException();
        }
    }

    /* loaded from: classes7.dex */
    private final class KeyValueSet<E> extends AbstractC25344g {

        /* renamed from: p */
        private final InterfaceC18509p f106345p;

        public KeyValueSet(InterfaceC18509p interfaceC18509p) {
            this.f106345p = interfaceC18509p;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(Object obj) {
            ConcurrentWeakMapKt.m113232e();
            throw new KotlinNothingValueException();
        }

        @Override // qm0.AbstractC25344g
        /* renamed from: d */
        public int mo113226d() {
            return ConcurrentWeakMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return ((Core) ConcurrentWeakMap.f106329r.get(ConcurrentWeakMap.this)).m113221g(this.f106345p);
        }
    }

    public ConcurrentWeakMap() {
        this(false, 1, null);
    }

    /* renamed from: h */
    private final void m113206h(HashedWeakRef hashedWeakRef) {
        ((Core) f106329r.get(this)).m113219d(hashedWeakRef);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public final void m113207i() {
        f106328q.decrementAndGet(this);
    }

    /* renamed from: k */
    private final synchronized Object m113208k(Object obj, Object obj2) {
        Object m113217i;
        Symbol symbol;
        Core core = (Core) f106329r.get(this);
        while (true) {
            m113217i = Core.m113217i(core, obj, obj2, null, 4, null);
            symbol = ConcurrentWeakMapKt.f106349a;
            if (m113217i == symbol) {
                core = core.m113223j();
                f106329r.set(this, core);
            }
        }
        return m113217i;
    }

    @Override // qm0.AbstractC25342f
    /* renamed from: a */
    public Set mo113209a() {
        return new KeyValueSet(ConcurrentWeakMap$entries$1.f106347q);
    }

    @Override // qm0.AbstractC25342f
    /* renamed from: b */
    public Set mo113210b() {
        return new KeyValueSet(ConcurrentWeakMap$keys$1.f106348q);
    }

    @Override // qm0.AbstractC25342f
    /* renamed from: c */
    public int mo113211c() {
        return f106328q.get(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Iterator it = keySet().iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return ((Core) f106329r.get(this)).m113220e(obj);
    }

    /* renamed from: l */
    public final void m113212l() {
        if (this.f106330p == null) {
            throw new IllegalStateException("Must be created with weakRefQueue = true".toString());
        }
        while (true) {
            try {
                Reference remove = this.f106330p.remove();
                AbstractC19074t.m100206d(remove, "null cannot be cast to non-null type kotlinx.coroutines.debug.internal.HashedWeakRef<*>");
                m113206h((HashedWeakRef) remove);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        Symbol symbol;
        Object m113217i = Core.m113217i((Core) f106329r.get(this), obj, obj2, null, 4, null);
        symbol = ConcurrentWeakMapKt.f106349a;
        if (m113217i == symbol) {
            m113217i = m113208k(obj, obj2);
        }
        if (m113217i == null) {
            f106328q.incrementAndGet(this);
        }
        return m113217i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        Symbol symbol;
        if (obj == null) {
            return null;
        }
        Object m113217i = Core.m113217i((Core) f106329r.get(this), obj, null, null, 4, null);
        symbol = ConcurrentWeakMapKt.f106349a;
        if (m113217i == symbol) {
            m113217i = m113208k(obj, null);
        }
        if (m113217i != null) {
            f106328q.decrementAndGet(this);
        }
        return m113217i;
    }

    public /* synthetic */ ConcurrentWeakMap(boolean z11, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? false : z11);
    }

    public ConcurrentWeakMap(boolean z11) {
        this.core = new Core(16);
        this.f106330p = z11 ? new ReferenceQueue() : null;
    }
}
