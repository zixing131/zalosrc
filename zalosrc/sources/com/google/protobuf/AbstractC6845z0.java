package com.google.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import p664y.AbstractC30228a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.protobuf.z0 */
/* loaded from: classes3.dex */
public abstract class AbstractC6845z0 extends AbstractMap {

    /* renamed from: p */
    private final int f37517p;

    /* renamed from: q */
    private List f37518q;

    /* renamed from: r */
    private Map f37519r;

    /* renamed from: s */
    private boolean f37520s;

    /* renamed from: t */
    private volatile g f37521t;

    /* renamed from: u */
    private Map f37522u;

    /* renamed from: v */
    private volatile c f37523v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.protobuf.z0$a */
    /* loaded from: classes3.dex */
    public static class a extends AbstractC6845z0 {
        a(int i11) {
            super(i11, null);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            AbstractC30228a.m149044a(obj);
            return super.m35239u(null, obj2);
        }

        @Override // com.google.protobuf.AbstractC6845z0
        /* renamed from: r */
        public void mo35238r() {
            if (!m35237q()) {
                if (m35234l() <= 0) {
                    Iterator it = m35236o().iterator();
                    if (it.hasNext()) {
                        AbstractC30228a.m149044a(((Map.Entry) it.next()).getKey());
                        throw null;
                    }
                } else {
                    AbstractC30228a.m149044a(m35233k(0).getKey());
                    throw null;
                }
            }
            super.mo35238r();
        }
    }

    /* renamed from: com.google.protobuf.z0$c */
    /* loaded from: classes3.dex */
    private class c extends g {
        private c() {
            super(AbstractC6845z0.this, null);
        }

        @Override // com.google.protobuf.AbstractC6845z0.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new b(AbstractC6845z0.this, null);
        }

        /* synthetic */ c(AbstractC6845z0 abstractC6845z0, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.protobuf.z0$d */
    /* loaded from: classes3.dex */
    public static class d {

        /* renamed from: a */
        private static final Iterator f37528a = new a();

        /* renamed from: b */
        private static final Iterable f37529b = new b();

        /* renamed from: com.google.protobuf.z0$d$a */
        /* loaded from: classes3.dex */
        static class a implements Iterator {
            a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* renamed from: com.google.protobuf.z0$d$b */
        /* loaded from: classes3.dex */
        static class b implements Iterable {
            b() {
            }

            @Override // java.lang.Iterable
            public Iterator iterator() {
                return d.f37528a;
            }
        }

        /* renamed from: b */
        static Iterable m35243b() {
            return f37529b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.protobuf.z0$e */
    /* loaded from: classes3.dex */
    public class e implements Map.Entry, Comparable {

        /* renamed from: p */
        private final Comparable f37530p;

        /* renamed from: q */
        private Object f37531q;

        e(AbstractC6845z0 abstractC6845z0, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        /* renamed from: c */
        private boolean m35244c(Object obj, Object obj2) {
            if (obj == null) {
                if (obj2 == null) {
                    return true;
                }
                return false;
            }
            return obj.equals(obj2);
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        @Override // java.util.Map.Entry
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Comparable getKey() {
            return this.f37530p;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (m35244c(this.f37530p, entry.getKey()) && m35244c(this.f37531q, entry.getValue())) {
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f37531q;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int hashCode;
            Comparable comparable = this.f37530p;
            int i11 = 0;
            if (comparable == null) {
                hashCode = 0;
            } else {
                hashCode = comparable.hashCode();
            }
            Object obj = this.f37531q;
            if (obj != null) {
                i11 = obj.hashCode();
            }
            return hashCode ^ i11;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            AbstractC6845z0.this.m35227g();
            Object obj2 = this.f37531q;
            this.f37531q = obj;
            return obj2;
        }

        public String toString() {
            return this.f37530p + "=" + this.f37531q;
        }

        e(Comparable comparable, Object obj) {
            this.f37530p = comparable;
            this.f37531q = obj;
        }
    }

    /* renamed from: com.google.protobuf.z0$f */
    /* loaded from: classes3.dex */
    private class f implements Iterator {

        /* renamed from: p */
        private int f37533p;

        /* renamed from: q */
        private boolean f37534q;

        /* renamed from: r */
        private Iterator f37535r;

        private f() {
            this.f37533p = -1;
        }

        /* renamed from: a */
        private Iterator m35247a() {
            if (this.f37535r == null) {
                this.f37535r = AbstractC6845z0.this.f37519r.entrySet().iterator();
            }
            return this.f37535r;
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            this.f37534q = true;
            int i11 = this.f37533p + 1;
            this.f37533p = i11;
            if (i11 < AbstractC6845z0.this.f37518q.size()) {
                return (Map.Entry) AbstractC6845z0.this.f37518q.get(this.f37533p);
            }
            return (Map.Entry) m35247a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f37533p + 1 < AbstractC6845z0.this.f37518q.size()) {
                return true;
            }
            if (!AbstractC6845z0.this.f37519r.isEmpty() && m35247a().hasNext()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f37534q) {
                this.f37534q = false;
                AbstractC6845z0.this.m35227g();
                if (this.f37533p < AbstractC6845z0.this.f37518q.size()) {
                    AbstractC6845z0 abstractC6845z0 = AbstractC6845z0.this;
                    int i11 = this.f37533p;
                    this.f37533p = i11 - 1;
                    abstractC6845z0.m35231v(i11);
                    return;
                }
                m35247a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }

        /* synthetic */ f(AbstractC6845z0 abstractC6845z0, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.protobuf.z0$g */
    /* loaded from: classes3.dex */
    public class g extends AbstractSet {
        private g() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            AbstractC6845z0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = AbstractC6845z0.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value && (obj2 == null || !obj2.equals(value))) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            if (!contains(entry)) {
                AbstractC6845z0.this.m35239u((Comparable) entry.getKey(), entry.getValue());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new f(AbstractC6845z0.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                AbstractC6845z0.this.remove(entry.getKey());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return AbstractC6845z0.this.size();
        }

        /* synthetic */ g(AbstractC6845z0 abstractC6845z0, a aVar) {
            this();
        }
    }

    /* synthetic */ AbstractC6845z0(int i11, a aVar) {
        this(i11);
    }

    /* renamed from: f */
    private int m35226f(Comparable comparable) {
        int i11;
        int size = this.f37518q.size();
        int i12 = size - 1;
        if (i12 >= 0) {
            int compareTo = comparable.compareTo(((e) this.f37518q.get(i12)).getKey());
            if (compareTo > 0) {
                i11 = size + 1;
                return -i11;
            }
            if (compareTo == 0) {
                return i12;
            }
        }
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) / 2;
            int compareTo2 = comparable.compareTo(((e) this.f37518q.get(i14)).getKey());
            if (compareTo2 < 0) {
                i12 = i14 - 1;
            } else if (compareTo2 > 0) {
                i13 = i14 + 1;
            } else {
                return i14;
            }
        }
        i11 = i13 + 1;
        return -i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public void m35227g() {
        if (!this.f37520s) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: i */
    private void m35228i() {
        m35227g();
        if (this.f37518q.isEmpty() && !(this.f37518q instanceof ArrayList)) {
            this.f37518q = new ArrayList(this.f37517p);
        }
    }

    /* renamed from: p */
    private SortedMap m35229p() {
        m35227g();
        if (this.f37519r.isEmpty() && !(this.f37519r instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f37519r = treeMap;
            this.f37522u = treeMap.descendingMap();
        }
        return (SortedMap) this.f37519r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public static AbstractC6845z0 m35230t(int i11) {
        return new a(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public Object m35231v(int i11) {
        m35227g();
        Object value = ((e) this.f37518q.remove(i11)).getValue();
        if (!this.f37519r.isEmpty()) {
            Iterator it = m35229p().entrySet().iterator();
            this.f37518q.add(new e(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        m35227g();
        if (!this.f37518q.isEmpty()) {
            this.f37518q.clear();
        }
        if (!this.f37519r.isEmpty()) {
            this.f37519r.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (m35226f(comparable) < 0 && !this.f37519r.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f37521t == null) {
            this.f37521t = new g(this, null);
        }
        return this.f37521t;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC6845z0)) {
            return super.equals(obj);
        }
        AbstractC6845z0 abstractC6845z0 = (AbstractC6845z0) obj;
        int size = size();
        if (size != abstractC6845z0.size()) {
            return false;
        }
        int m35234l = m35234l();
        if (m35234l != abstractC6845z0.m35234l()) {
            return entrySet().equals(abstractC6845z0.entrySet());
        }
        for (int i11 = 0; i11 < m35234l; i11++) {
            if (!m35233k(i11).equals(abstractC6845z0.m35233k(i11))) {
                return false;
            }
        }
        if (m35234l == size) {
            return true;
        }
        return this.f37519r.equals(abstractC6845z0.f37519r);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m35226f = m35226f(comparable);
        if (m35226f >= 0) {
            return ((e) this.f37518q.get(m35226f)).getValue();
        }
        return this.f37519r.get(comparable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public Set m35232h() {
        if (this.f37523v == null) {
            this.f37523v = new c(this, null);
        }
        return this.f37523v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int m35234l = m35234l();
        int i11 = 0;
        for (int i12 = 0; i12 < m35234l; i12++) {
            i11 += ((e) this.f37518q.get(i12)).hashCode();
        }
        if (m35235n() > 0) {
            return i11 + this.f37519r.hashCode();
        }
        return i11;
    }

    /* renamed from: k */
    public Map.Entry m35233k(int i11) {
        return (Map.Entry) this.f37518q.get(i11);
    }

    /* renamed from: l */
    public int m35234l() {
        return this.f37518q.size();
    }

    /* renamed from: n */
    public int m35235n() {
        return this.f37519r.size();
    }

    /* renamed from: o */
    public Iterable m35236o() {
        if (this.f37519r.isEmpty()) {
            return d.m35243b();
        }
        return this.f37519r.entrySet();
    }

    /* renamed from: q */
    public boolean m35237q() {
        return this.f37520s;
    }

    /* renamed from: r */
    public void mo35238r() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (!this.f37520s) {
            if (this.f37519r.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.f37519r);
            }
            this.f37519r = unmodifiableMap;
            if (this.f37522u.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(this.f37522u);
            }
            this.f37522u = unmodifiableMap2;
            this.f37520s = true;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        m35227g();
        Comparable comparable = (Comparable) obj;
        int m35226f = m35226f(comparable);
        if (m35226f >= 0) {
            return m35231v(m35226f);
        }
        if (this.f37519r.isEmpty()) {
            return null;
        }
        return this.f37519r.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f37518q.size() + this.f37519r.size();
    }

    /* renamed from: u */
    public Object m35239u(Comparable comparable, Object obj) {
        m35227g();
        int m35226f = m35226f(comparable);
        if (m35226f >= 0) {
            return ((e) this.f37518q.get(m35226f)).setValue(obj);
        }
        m35228i();
        int i11 = -(m35226f + 1);
        if (i11 >= this.f37517p) {
            return m35229p().put(comparable, obj);
        }
        int size = this.f37518q.size();
        int i12 = this.f37517p;
        if (size == i12) {
            e eVar = (e) this.f37518q.remove(i12 - 1);
            m35229p().put(eVar.getKey(), eVar.getValue());
        }
        this.f37518q.add(i11, new e(comparable, obj));
        return null;
    }

    /* renamed from: com.google.protobuf.z0$b */
    /* loaded from: classes3.dex */
    private class b implements Iterator {

        /* renamed from: p */
        private int f37524p;

        /* renamed from: q */
        private Iterator f37525q;

        private b() {
            this.f37524p = AbstractC6845z0.this.f37518q.size();
        }

        /* renamed from: a */
        private Iterator m35240a() {
            if (this.f37525q == null) {
                this.f37525q = AbstractC6845z0.this.f37522u.entrySet().iterator();
            }
            return this.f37525q;
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (!m35240a().hasNext()) {
                List list = AbstractC6845z0.this.f37518q;
                int i11 = this.f37524p - 1;
                this.f37524p = i11;
                return (Map.Entry) list.get(i11);
            }
            return (Map.Entry) m35240a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i11 = this.f37524p;
            if ((i11 > 0 && i11 <= AbstractC6845z0.this.f37518q.size()) || m35240a().hasNext()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ b(AbstractC6845z0 abstractC6845z0, a aVar) {
            this();
        }
    }

    private AbstractC6845z0(int i11) {
        this.f37517p = i11;
        this.f37518q = Collections.emptyList();
        this.f37519r = Collections.emptyMap();
        this.f37522u = Collections.emptyMap();
    }
}
