package qm0;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gn0.InterfaceC19517a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import p148f3.C18711c;

/* renamed from: qm0.c */
/* loaded from: classes.dex */
public abstract class AbstractC25336c extends AbstractC25331a implements List, InterfaceC19517a {

    /* renamed from: p */
    public static final a f121523p = new a(null);

    /* renamed from: qm0.c$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final void m131235a(int i11, int i12) {
            if (i11 >= 0 && i11 < i12) {
                return;
            }
            throw new IndexOutOfBoundsException("index: " + i11 + ", size: " + i12);
        }

        /* renamed from: b */
        public final void m131236b(int i11, int i12) {
            if (i11 >= 0 && i11 <= i12) {
                return;
            }
            throw new IndexOutOfBoundsException("index: " + i11 + ", size: " + i12);
        }

        /* renamed from: c */
        public final void m131237c(int i11, int i12, int i13) {
            if (i11 >= 0 && i12 <= i13) {
                if (i11 <= i12) {
                    return;
                }
                throw new IllegalArgumentException("fromIndex: " + i11 + " > toIndex: " + i12);
            }
            throw new IndexOutOfBoundsException("fromIndex: " + i11 + ", toIndex: " + i12 + ", size: " + i13);
        }

        /* renamed from: d */
        public final int m131238d(int i11, int i12) {
            int i13 = i11 + (i11 >> 1);
            if (i13 - i12 < 0) {
                i13 = i12;
            }
            return i13 - 2147483639 > 0 ? i12 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i13;
        }

        /* renamed from: e */
        public final boolean m131239e(Collection collection, Collection collection2) {
            AbstractC19074t.m100208f(collection, C18711c.f94014e);
            AbstractC19074t.m100208f(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator it = collection2.iterator();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!AbstractC19074t.m100204b(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: f */
        public final int m131240f(Collection collection) {
            int i11;
            AbstractC19074t.m100208f(collection, C18711c.f94014e);
            int i12 = 1;
            for (Object obj : collection) {
                int i13 = i12 * 31;
                if (obj != null) {
                    i11 = obj.hashCode();
                } else {
                    i11 = 0;
                }
                i12 = i13 + i11;
            }
            return i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qm0.c$b */
    /* loaded from: classes7.dex */
    public class b implements Iterator, InterfaceC19517a {

        /* renamed from: p */
        private int f121524p;

        public b() {
        }

        /* renamed from: a */
        protected final int m131241a() {
            return this.f121524p;
        }

        /* renamed from: c */
        protected final void m131242c(int i11) {
            this.f121524p = i11;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f121524p < AbstractC25336c.this.size()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (hasNext()) {
                AbstractC25336c abstractC25336c = AbstractC25336c.this;
                int i11 = this.f121524p;
                this.f121524p = i11 + 1;
                return abstractC25336c.get(i11);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: qm0.c$c */
    /* loaded from: classes7.dex */
    private class c extends b implements ListIterator, InterfaceC19517a {
        public c(int i11) {
            super();
            AbstractC25336c.f121523p.m131236b(i11, AbstractC25336c.this.size());
            m131242c(i11);
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            if (m131241a() > 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return m131241a();
        }

        @Override // java.util.ListIterator
        public Object previous() {
            if (hasPrevious()) {
                AbstractC25336c abstractC25336c = AbstractC25336c.this;
                m131242c(m131241a() - 1);
                return abstractC25336c.get(m131241a());
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return m131241a() - 1;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: qm0.c$d */
    /* loaded from: classes7.dex */
    private static final class d extends AbstractC25336c implements RandomAccess {

        /* renamed from: q */
        private final AbstractC25336c f121527q;

        /* renamed from: r */
        private final int f121528r;

        /* renamed from: s */
        private int f121529s;

        public d(AbstractC25336c abstractC25336c, int i11, int i12) {
            AbstractC19074t.m100208f(abstractC25336c, "list");
            this.f121527q = abstractC25336c;
            this.f121528r = i11;
            AbstractC25336c.f121523p.m131237c(i11, i12, abstractC25336c.size());
            this.f121529s = i12 - i11;
        }

        @Override // qm0.AbstractC25331a
        /* renamed from: d */
        public int mo127005d() {
            return this.f121529s;
        }

        @Override // qm0.AbstractC25336c, java.util.List
        public Object get(int i11) {
            AbstractC25336c.f121523p.m131235a(i11, this.f121529s);
            return this.f121527q.get(this.f121528r + i11);
        }
    }

    @Override // java.util.List
    public void add(int i11, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i11, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        return f121523p.m131239e(this, (Collection) obj);
    }

    public abstract Object get(int i11);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return f121523p.m131240f(this);
    }

    public int indexOf(Object obj) {
        Iterator it = iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (!AbstractC19074t.m100204b(it.next(), obj)) {
                i11++;
            } else {
                return i11;
            }
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new b();
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (AbstractC19074t.m100204b(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return new c(0);
    }

    @Override // java.util.List
    public Object remove(int i11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public Object set(int i11, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List subList(int i11, int i12) {
        return new d(this, i11, i12);
    }

    @Override // java.util.List
    public ListIterator listIterator(int i11) {
        return new c(i11);
    }
}
