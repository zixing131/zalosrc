package p674y9;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: y9.h */
/* loaded from: classes3.dex */
public final class C30851h extends AbstractMap implements Serializable {

    /* renamed from: w */
    private static final Comparator f142354w = new a();

    /* renamed from: p */
    Comparator f142355p;

    /* renamed from: q */
    e f142356q;

    /* renamed from: r */
    int f142357r;

    /* renamed from: s */
    int f142358s;

    /* renamed from: t */
    final e f142359t;

    /* renamed from: u */
    private b f142360u;

    /* renamed from: v */
    private c f142361v;

    /* renamed from: y9.h$a */
    /* loaded from: classes3.dex */
    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* renamed from: y9.h$b */
    /* loaded from: classes3.dex */
    class b extends AbstractSet {

        /* renamed from: y9.h$b$a */
        /* loaded from: classes3.dex */
        class a extends d {
            a() {
                super();
            }

            @Override // java.util.Iterator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public Map.Entry next() {
                return m149986a();
            }
        }

        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C30851h.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if ((obj instanceof Map.Entry) && C30851h.this.m149980c((Map.Entry) obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e m149980c;
            if (!(obj instanceof Map.Entry) || (m149980c = C30851h.this.m149980c((Map.Entry) obj)) == null) {
                return false;
            }
            C30851h.this.m149982f(m149980c, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C30851h.this.f142357r;
        }
    }

    /* renamed from: y9.h$c */
    /* loaded from: classes3.dex */
    final class c extends AbstractSet {

        /* renamed from: y9.h$c$a */
        /* loaded from: classes3.dex */
        class a extends d {
            a() {
                super();
            }

            @Override // java.util.Iterator
            public Object next() {
                return m149986a().f142375u;
            }
        }

        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C30851h.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C30851h.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (C30851h.this.m149983g(obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C30851h.this.f142357r;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y9.h$d */
    /* loaded from: classes3.dex */
    public abstract class d implements Iterator {

        /* renamed from: p */
        e f142366p;

        /* renamed from: q */
        e f142367q = null;

        /* renamed from: r */
        int f142368r;

        d() {
            this.f142366p = C30851h.this.f142359t.f142373s;
            this.f142368r = C30851h.this.f142358s;
        }

        /* renamed from: a */
        final e m149986a() {
            e eVar = this.f142366p;
            C30851h c30851h = C30851h.this;
            if (eVar != c30851h.f142359t) {
                if (c30851h.f142358s == this.f142368r) {
                    this.f142366p = eVar.f142373s;
                    this.f142367q = eVar;
                    return eVar;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f142366p != C30851h.this.f142359t) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e eVar = this.f142367q;
            if (eVar != null) {
                C30851h.this.m149982f(eVar, true);
                this.f142367q = null;
                this.f142368r = C30851h.this.f142358s;
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y9.h$e */
    /* loaded from: classes3.dex */
    public static final class e implements Map.Entry {

        /* renamed from: p */
        e f142370p;

        /* renamed from: q */
        e f142371q;

        /* renamed from: r */
        e f142372r;

        /* renamed from: s */
        e f142373s;

        /* renamed from: t */
        e f142374t;

        /* renamed from: u */
        final Object f142375u;

        /* renamed from: v */
        Object f142376v;

        /* renamed from: w */
        int f142377w;

        e() {
            this.f142375u = null;
            this.f142374t = this;
            this.f142373s = this;
        }

        /* renamed from: a */
        public e m149987a() {
            e eVar = this;
            for (e eVar2 = this.f142371q; eVar2 != null; eVar2 = eVar2.f142371q) {
                eVar = eVar2;
            }
            return eVar;
        }

        /* renamed from: b */
        public e m149988b() {
            e eVar = this;
            for (e eVar2 = this.f142372r; eVar2 != null; eVar2 = eVar2.f142372r) {
                eVar = eVar2;
            }
            return eVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f142375u;
            if (obj2 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!obj2.equals(entry.getKey())) {
                return false;
            }
            Object obj3 = this.f142376v;
            if (obj3 == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!obj3.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f142375u;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f142376v;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int hashCode;
            Object obj = this.f142375u;
            int i11 = 0;
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            Object obj2 = this.f142376v;
            if (obj2 != null) {
                i11 = obj2.hashCode();
            }
            return hashCode ^ i11;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Object obj2 = this.f142376v;
            this.f142376v = obj;
            return obj2;
        }

        public String toString() {
            return this.f142375u + "=" + this.f142376v;
        }

        e(e eVar, Object obj, e eVar2, e eVar3) {
            this.f142370p = eVar;
            this.f142375u = obj;
            this.f142377w = 1;
            this.f142373s = eVar2;
            this.f142374t = eVar3;
            eVar3.f142373s = this;
            eVar2.f142374t = this;
        }
    }

    public C30851h() {
        this(f142354w);
    }

    /* renamed from: a */
    private boolean m149974a(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private void m149975e(e eVar, boolean z11) {
        int i11;
        int i12;
        int i13;
        int i14;
        while (eVar != null) {
            e eVar2 = eVar.f142371q;
            e eVar3 = eVar.f142372r;
            int i15 = 0;
            if (eVar2 != null) {
                i11 = eVar2.f142377w;
            } else {
                i11 = 0;
            }
            if (eVar3 != null) {
                i12 = eVar3.f142377w;
            } else {
                i12 = 0;
            }
            int i16 = i11 - i12;
            if (i16 == -2) {
                e eVar4 = eVar3.f142371q;
                e eVar5 = eVar3.f142372r;
                if (eVar5 != null) {
                    i14 = eVar5.f142377w;
                } else {
                    i14 = 0;
                }
                if (eVar4 != null) {
                    i15 = eVar4.f142377w;
                }
                int i17 = i15 - i14;
                if (i17 != -1 && (i17 != 0 || z11)) {
                    m149978k(eVar3);
                    m149977i(eVar);
                } else {
                    m149977i(eVar);
                }
                if (z11) {
                    return;
                }
            } else if (i16 == 2) {
                e eVar6 = eVar2.f142371q;
                e eVar7 = eVar2.f142372r;
                if (eVar7 != null) {
                    i13 = eVar7.f142377w;
                } else {
                    i13 = 0;
                }
                if (eVar6 != null) {
                    i15 = eVar6.f142377w;
                }
                int i18 = i15 - i13;
                if (i18 != 1 && (i18 != 0 || z11)) {
                    m149977i(eVar2);
                    m149978k(eVar);
                } else {
                    m149978k(eVar);
                }
                if (z11) {
                    return;
                }
            } else if (i16 == 0) {
                eVar.f142377w = i11 + 1;
                if (z11) {
                    return;
                }
            } else {
                eVar.f142377w = Math.max(i11, i12) + 1;
                if (!z11) {
                    return;
                }
            }
            eVar = eVar.f142370p;
        }
    }

    /* renamed from: h */
    private void m149976h(e eVar, e eVar2) {
        e eVar3 = eVar.f142370p;
        eVar.f142370p = null;
        if (eVar2 != null) {
            eVar2.f142370p = eVar3;
        }
        if (eVar3 != null) {
            if (eVar3.f142371q == eVar) {
                eVar3.f142371q = eVar2;
                return;
            } else {
                eVar3.f142372r = eVar2;
                return;
            }
        }
        this.f142356q = eVar2;
    }

    /* renamed from: i */
    private void m149977i(e eVar) {
        int i11;
        int i12;
        e eVar2 = eVar.f142371q;
        e eVar3 = eVar.f142372r;
        e eVar4 = eVar3.f142371q;
        e eVar5 = eVar3.f142372r;
        eVar.f142372r = eVar4;
        if (eVar4 != null) {
            eVar4.f142370p = eVar;
        }
        m149976h(eVar, eVar3);
        eVar3.f142371q = eVar;
        eVar.f142370p = eVar3;
        int i13 = 0;
        if (eVar2 != null) {
            i11 = eVar2.f142377w;
        } else {
            i11 = 0;
        }
        if (eVar4 != null) {
            i12 = eVar4.f142377w;
        } else {
            i12 = 0;
        }
        int max = Math.max(i11, i12) + 1;
        eVar.f142377w = max;
        if (eVar5 != null) {
            i13 = eVar5.f142377w;
        }
        eVar3.f142377w = Math.max(max, i13) + 1;
    }

    /* renamed from: k */
    private void m149978k(e eVar) {
        int i11;
        int i12;
        e eVar2 = eVar.f142371q;
        e eVar3 = eVar.f142372r;
        e eVar4 = eVar2.f142371q;
        e eVar5 = eVar2.f142372r;
        eVar.f142371q = eVar5;
        if (eVar5 != null) {
            eVar5.f142370p = eVar;
        }
        m149976h(eVar, eVar2);
        eVar2.f142372r = eVar;
        eVar.f142370p = eVar2;
        int i13 = 0;
        if (eVar3 != null) {
            i11 = eVar3.f142377w;
        } else {
            i11 = 0;
        }
        if (eVar5 != null) {
            i12 = eVar5.f142377w;
        } else {
            i12 = 0;
        }
        int max = Math.max(i11, i12) + 1;
        eVar.f142377w = max;
        if (eVar4 != null) {
            i13 = eVar4.f142377w;
        }
        eVar2.f142377w = Math.max(max, i13) + 1;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    /* renamed from: b */
    e m149979b(Object obj, boolean z11) {
        int i11;
        e eVar;
        Comparable comparable;
        e eVar2;
        Comparator comparator = this.f142355p;
        e eVar3 = this.f142356q;
        if (eVar3 != null) {
            if (comparator == f142354w) {
                comparable = (Comparable) obj;
            } else {
                comparable = null;
            }
            while (true) {
                if (comparable != null) {
                    i11 = comparable.compareTo(eVar3.f142375u);
                } else {
                    i11 = comparator.compare(obj, eVar3.f142375u);
                }
                if (i11 == 0) {
                    return eVar3;
                }
                if (i11 < 0) {
                    eVar2 = eVar3.f142371q;
                } else {
                    eVar2 = eVar3.f142372r;
                }
                if (eVar2 == null) {
                    break;
                }
                eVar3 = eVar2;
            }
        } else {
            i11 = 0;
        }
        if (!z11) {
            return null;
        }
        e eVar4 = this.f142359t;
        if (eVar3 == null) {
            if (comparator == f142354w && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName() + " is not Comparable");
            }
            eVar = new e(eVar3, obj, eVar4, eVar4.f142374t);
            this.f142356q = eVar;
        } else {
            eVar = new e(eVar3, obj, eVar4, eVar4.f142374t);
            if (i11 < 0) {
                eVar3.f142371q = eVar;
            } else {
                eVar3.f142372r = eVar;
            }
            m149975e(eVar3, true);
        }
        this.f142357r++;
        this.f142358s++;
        return eVar;
    }

    /* renamed from: c */
    e m149980c(Map.Entry entry) {
        e m149981d = m149981d(entry.getKey());
        if (m149981d == null || !m149974a(m149981d.f142376v, entry.getValue())) {
            return null;
        }
        return m149981d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f142356q = null;
        this.f142357r = 0;
        this.f142358s++;
        e eVar = this.f142359t;
        eVar.f142374t = eVar;
        eVar.f142373s = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (m149981d(obj) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    e m149981d(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return m149979b(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        b bVar = this.f142360u;
        if (bVar == null) {
            b bVar2 = new b();
            this.f142360u = bVar2;
            return bVar2;
        }
        return bVar;
    }

    /* renamed from: f */
    void m149982f(e eVar, boolean z11) {
        e m149987a;
        int i11;
        if (z11) {
            e eVar2 = eVar.f142374t;
            eVar2.f142373s = eVar.f142373s;
            eVar.f142373s.f142374t = eVar2;
        }
        e eVar3 = eVar.f142371q;
        e eVar4 = eVar.f142372r;
        e eVar5 = eVar.f142370p;
        int i12 = 0;
        if (eVar3 != null && eVar4 != null) {
            if (eVar3.f142377w > eVar4.f142377w) {
                m149987a = eVar3.m149988b();
            } else {
                m149987a = eVar4.m149987a();
            }
            m149982f(m149987a, false);
            e eVar6 = eVar.f142371q;
            if (eVar6 != null) {
                i11 = eVar6.f142377w;
                m149987a.f142371q = eVar6;
                eVar6.f142370p = m149987a;
                eVar.f142371q = null;
            } else {
                i11 = 0;
            }
            e eVar7 = eVar.f142372r;
            if (eVar7 != null) {
                i12 = eVar7.f142377w;
                m149987a.f142372r = eVar7;
                eVar7.f142370p = m149987a;
                eVar.f142372r = null;
            }
            m149987a.f142377w = Math.max(i11, i12) + 1;
            m149976h(eVar, m149987a);
            return;
        }
        if (eVar3 != null) {
            m149976h(eVar, eVar3);
            eVar.f142371q = null;
        } else if (eVar4 != null) {
            m149976h(eVar, eVar4);
            eVar.f142372r = null;
        } else {
            m149976h(eVar, null);
        }
        m149975e(eVar5, false);
        this.f142357r--;
        this.f142358s++;
    }

    /* renamed from: g */
    e m149983g(Object obj) {
        e m149981d = m149981d(obj);
        if (m149981d != null) {
            m149982f(m149981d, true);
        }
        return m149981d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        e m149981d = m149981d(obj);
        if (m149981d != null) {
            return m149981d.f142376v;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        c cVar = this.f142361v;
        if (cVar == null) {
            c cVar2 = new c();
            this.f142361v = cVar2;
            return cVar2;
        }
        return cVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        if (obj != null) {
            e m149979b = m149979b(obj, true);
            Object obj3 = m149979b.f142376v;
            m149979b.f142376v = obj2;
            return obj3;
        }
        throw new NullPointerException("key == null");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        e m149983g = m149983g(obj);
        if (m149983g != null) {
            return m149983g.f142376v;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f142357r;
    }

    public C30851h(Comparator comparator) {
        this.f142357r = 0;
        this.f142358s = 0;
        this.f142359t = new e();
        this.f142355p = comparator == null ? f142354w : comparator;
    }
}
