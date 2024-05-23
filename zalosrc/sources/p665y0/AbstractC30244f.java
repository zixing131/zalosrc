package p665y0;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: y0.f */
/* loaded from: classes.dex */
public abstract class AbstractC30244f {

    /* renamed from: a */
    b f140473a;

    /* renamed from: b */
    c f140474b;

    /* renamed from: c */
    e f140475c;

    /* renamed from: y0.f$a */
    /* loaded from: classes.dex */
    final class a implements Iterator {

        /* renamed from: p */
        final int f140476p;

        /* renamed from: q */
        int f140477q;

        /* renamed from: r */
        int f140478r;

        /* renamed from: s */
        boolean f140479s = false;

        a(int i11) {
            this.f140476p = i11;
            this.f140477q = AbstractC30244f.this.mo149102d();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f140478r < this.f140477q;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (hasNext()) {
                Object mo149100b = AbstractC30244f.this.mo149100b(this.f140478r, this.f140476p);
                this.f140478r++;
                this.f140479s = true;
                return mo149100b;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f140479s) {
                int i11 = this.f140478r - 1;
                this.f140478r = i11;
                this.f140477q--;
                this.f140479s = false;
                AbstractC30244f.this.mo149106h(i11);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: y0.f$b */
    /* loaded from: classes2.dex */
    final class b implements Set {
        b() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection collection) {
            int mo149102d = AbstractC30244f.this.mo149102d();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                AbstractC30244f.this.mo149105g(entry.getKey(), entry.getValue());
            }
            if (mo149102d != AbstractC30244f.this.mo149102d()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            AbstractC30244f.this.mo149099a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int mo149103e = AbstractC30244f.this.mo149103e(entry.getKey());
            if (mo149103e < 0) {
                return false;
            }
            return AbstractC30241c.m149120c(AbstractC30244f.this.mo149100b(mo149103e, 1), entry.getValue());
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return AbstractC30244f.m149145k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int hashCode;
            int hashCode2;
            int i11 = 0;
            for (int mo149102d = AbstractC30244f.this.mo149102d() - 1; mo149102d >= 0; mo149102d--) {
                Object mo149100b = AbstractC30244f.this.mo149100b(mo149102d, 0);
                Object mo149100b2 = AbstractC30244f.this.mo149100b(mo149102d, 1);
                if (mo149100b == null) {
                    hashCode = 0;
                } else {
                    hashCode = mo149100b.hashCode();
                }
                if (mo149100b2 == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = mo149100b2.hashCode();
                }
                i11 += hashCode ^ hashCode2;
            }
            return i11;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            if (AbstractC30244f.this.mo149102d() == 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new d();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return AbstractC30244f.this.mo149102d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: y0.f$c */
    /* loaded from: classes.dex */
    final class c implements Set {
        c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            AbstractC30244f.this.mo149099a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (AbstractC30244f.this.mo149103e(obj) >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection collection) {
            return AbstractC30244f.m149144j(AbstractC30244f.this.mo149101c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return AbstractC30244f.m149145k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int hashCode;
            int i11 = 0;
            for (int mo149102d = AbstractC30244f.this.mo149102d() - 1; mo149102d >= 0; mo149102d--) {
                Object mo149100b = AbstractC30244f.this.mo149100b(mo149102d, 0);
                if (mo149100b == null) {
                    hashCode = 0;
                } else {
                    hashCode = mo149100b.hashCode();
                }
                i11 += hashCode;
            }
            return i11;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            if (AbstractC30244f.this.mo149102d() == 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int mo149103e = AbstractC30244f.this.mo149103e(obj);
            if (mo149103e >= 0) {
                AbstractC30244f.this.mo149106h(mo149103e);
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection collection) {
            return AbstractC30244f.m149146o(AbstractC30244f.this.mo149101c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection collection) {
            return AbstractC30244f.m149147p(AbstractC30244f.this.mo149101c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return AbstractC30244f.this.mo149102d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return AbstractC30244f.this.m149151q(0);
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return AbstractC30244f.this.m149152r(objArr, 0);
        }
    }

    /* renamed from: y0.f$d */
    /* loaded from: classes2.dex */
    final class d implements Iterator, Map.Entry {

        /* renamed from: p */
        int f140483p;

        /* renamed from: r */
        boolean f140485r = false;

        /* renamed from: q */
        int f140484q = -1;

        d() {
            this.f140483p = AbstractC30244f.this.mo149102d() - 1;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (hasNext()) {
                this.f140484q++;
                this.f140485r = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this.f140485r) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (!AbstractC30241c.m149120c(entry.getKey(), AbstractC30244f.this.mo149100b(this.f140484q, 0)) || !AbstractC30241c.m149120c(entry.getValue(), AbstractC30244f.this.mo149100b(this.f140484q, 1))) {
                    return false;
                }
                return true;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            if (this.f140485r) {
                return AbstractC30244f.this.mo149100b(this.f140484q, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            if (this.f140485r) {
                return AbstractC30244f.this.mo149100b(this.f140484q, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f140484q < this.f140483p;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int hashCode;
            if (this.f140485r) {
                int i11 = 0;
                Object mo149100b = AbstractC30244f.this.mo149100b(this.f140484q, 0);
                Object mo149100b2 = AbstractC30244f.this.mo149100b(this.f140484q, 1);
                if (mo149100b == null) {
                    hashCode = 0;
                } else {
                    hashCode = mo149100b.hashCode();
                }
                if (mo149100b2 != null) {
                    i11 = mo149100b2.hashCode();
                }
                return hashCode ^ i11;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f140485r) {
                AbstractC30244f.this.mo149106h(this.f140484q);
                this.f140484q--;
                this.f140483p--;
                this.f140485r = false;
                return;
            }
            throw new IllegalStateException();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (this.f140485r) {
                return AbstractC30244f.this.mo149107i(this.f140484q, obj);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: y0.f$e */
    /* loaded from: classes.dex */
    final class e implements Collection {
        e() {
        }

        @Override // java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            AbstractC30244f.this.mo149099a();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            if (AbstractC30244f.this.mo149104f(obj) >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            if (AbstractC30244f.this.mo149102d() == 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int mo149104f = AbstractC30244f.this.mo149104f(obj);
            if (mo149104f >= 0) {
                AbstractC30244f.this.mo149106h(mo149104f);
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection collection) {
            int mo149102d = AbstractC30244f.this.mo149102d();
            int i11 = 0;
            boolean z11 = false;
            while (i11 < mo149102d) {
                if (collection.contains(AbstractC30244f.this.mo149100b(i11, 1))) {
                    AbstractC30244f.this.mo149106h(i11);
                    i11--;
                    mo149102d--;
                    z11 = true;
                }
                i11++;
            }
            return z11;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection collection) {
            int mo149102d = AbstractC30244f.this.mo149102d();
            int i11 = 0;
            boolean z11 = false;
            while (i11 < mo149102d) {
                if (!collection.contains(AbstractC30244f.this.mo149100b(i11, 1))) {
                    AbstractC30244f.this.mo149106h(i11);
                    i11--;
                    mo149102d--;
                    z11 = true;
                }
                i11++;
            }
            return z11;
        }

        @Override // java.util.Collection
        public int size() {
            return AbstractC30244f.this.mo149102d();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return AbstractC30244f.this.m149151q(1);
        }

        @Override // java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return AbstractC30244f.this.m149152r(objArr, 1);
        }
    }

    /* renamed from: j */
    public static boolean m149144j(Map map, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    public static boolean m149145k(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: o */
    public static boolean m149146o(Map map, Collection collection) {
        int size = map.size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        if (size != map.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public static boolean m149147p(Map map, Collection collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        if (size != map.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    protected abstract void mo149099a();

    /* renamed from: b */
    protected abstract Object mo149100b(int i11, int i12);

    /* renamed from: c */
    protected abstract Map mo149101c();

    /* renamed from: d */
    protected abstract int mo149102d();

    /* renamed from: e */
    protected abstract int mo149103e(Object obj);

    /* renamed from: f */
    protected abstract int mo149104f(Object obj);

    /* renamed from: g */
    protected abstract void mo149105g(Object obj, Object obj2);

    /* renamed from: h */
    protected abstract void mo149106h(int i11);

    /* renamed from: i */
    protected abstract Object mo149107i(int i11, Object obj);

    /* renamed from: l */
    public Set m149148l() {
        if (this.f140473a == null) {
            this.f140473a = new b();
        }
        return this.f140473a;
    }

    /* renamed from: m */
    public Set m149149m() {
        if (this.f140474b == null) {
            this.f140474b = new c();
        }
        return this.f140474b;
    }

    /* renamed from: n */
    public Collection m149150n() {
        if (this.f140475c == null) {
            this.f140475c = new e();
        }
        return this.f140475c;
    }

    /* renamed from: q */
    public Object[] m149151q(int i11) {
        int mo149102d = mo149102d();
        Object[] objArr = new Object[mo149102d];
        for (int i12 = 0; i12 < mo149102d; i12++) {
            objArr[i12] = mo149100b(i12, i11);
        }
        return objArr;
    }

    /* renamed from: r */
    public Object[] m149152r(Object[] objArr, int i11) {
        int mo149102d = mo149102d();
        if (objArr.length < mo149102d) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), mo149102d);
        }
        for (int i12 = 0; i12 < mo149102d; i12++) {
            objArr[i12] = mo149100b(i12, i11);
        }
        if (objArr.length > mo149102d) {
            objArr[mo149102d] = null;
        }
        return objArr;
    }
}
