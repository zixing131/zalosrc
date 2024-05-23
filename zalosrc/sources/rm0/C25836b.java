package rm0;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gn0.InterfaceC19517a;
import gn0.InterfaceC19520d;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import qm0.AbstractC25336c;
import qm0.AbstractC25340e;
import qm0.AbstractC25356m;
import qm0.AbstractC25366r;

/* renamed from: rm0.b */
/* loaded from: classes7.dex */
public final class C25836b extends AbstractC25340e implements List, RandomAccess, Serializable, InterfaceC19520d {

    /* renamed from: v */
    private static final a f123222v = new a(null);

    /* renamed from: w */
    private static final C25836b f123223w;

    /* renamed from: p */
    private Object[] f123224p;

    /* renamed from: q */
    private int f123225q;

    /* renamed from: r */
    private int f123226r;

    /* renamed from: s */
    private boolean f123227s;

    /* renamed from: t */
    private final C25836b f123228t;

    /* renamed from: u */
    private final C25836b f123229u;

    /* renamed from: rm0.b$a */
    /* loaded from: classes7.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: rm0.b$b */
    /* loaded from: classes7.dex */
    public static final class b implements ListIterator, InterfaceC19517a {

        /* renamed from: p */
        private final C25836b f123230p;

        /* renamed from: q */
        private int f123231q;

        /* renamed from: r */
        private int f123232r;

        /* renamed from: s */
        private int f123233s;

        public b(C25836b c25836b, int i11) {
            AbstractC19074t.m100208f(c25836b, "list");
            this.f123230p = c25836b;
            this.f123231q = i11;
            this.f123232r = -1;
            this.f123233s = ((AbstractList) c25836b).modCount;
        }

        /* renamed from: a */
        private final void m133224a() {
            if (((AbstractList) this.f123230p).modCount == this.f123233s) {
            } else {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            m133224a();
            C25836b c25836b = this.f123230p;
            int i11 = this.f123231q;
            this.f123231q = i11 + 1;
            c25836b.add(i11, obj);
            this.f123232r = -1;
            this.f123233s = ((AbstractList) this.f123230p).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            if (this.f123231q < this.f123230p.f123226r) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f123231q > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            m133224a();
            if (this.f123231q < this.f123230p.f123226r) {
                int i11 = this.f123231q;
                this.f123231q = i11 + 1;
                this.f123232r = i11;
                return this.f123230p.f123224p[this.f123230p.f123225q + this.f123232r];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f123231q;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            m133224a();
            int i11 = this.f123231q;
            if (i11 > 0) {
                int i12 = i11 - 1;
                this.f123231q = i12;
                this.f123232r = i12;
                return this.f123230p.f123224p[this.f123230p.f123225q + this.f123232r];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f123231q - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            m133224a();
            int i11 = this.f123232r;
            if (i11 != -1) {
                this.f123230p.remove(i11);
                this.f123231q = this.f123232r;
                this.f123232r = -1;
                this.f123233s = ((AbstractList) this.f123230p).modCount;
                return;
            }
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            m133224a();
            int i11 = this.f123232r;
            if (i11 != -1) {
                this.f123230p.set(i11, obj);
                return;
            }
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
    }

    static {
        C25836b c25836b = new C25836b(0);
        c25836b.f123227s = true;
        f123223w = c25836b;
    }

    private C25836b(Object[] objArr, int i11, int i12, boolean z11, C25836b c25836b, C25836b c25836b2) {
        this.f123224p = objArr;
        this.f123225q = i11;
        this.f123226r = i12;
        this.f123227s = z11;
        this.f123228t = c25836b;
        this.f123229u = c25836b2;
        if (c25836b != null) {
            ((AbstractList) this).modCount = ((AbstractList) c25836b).modCount;
        }
    }

    /* renamed from: A */
    private final void m133206A() {
        ((AbstractList) this).modCount++;
    }

    /* renamed from: B */
    private final Object m133207B(int i11) {
        m133206A();
        C25836b c25836b = this.f123228t;
        if (c25836b != null) {
            this.f123226r--;
            return c25836b.m133207B(i11);
        }
        Object[] objArr = this.f123224p;
        Object obj = objArr[i11];
        AbstractC25356m.m131323f(objArr, objArr, i11, i11 + 1, this.f123225q + this.f123226r);
        AbstractC25837c.m133230f(this.f123224p, (this.f123225q + this.f123226r) - 1);
        this.f123226r--;
        return obj;
    }

    /* renamed from: C */
    private final void m133208C(int i11, int i12) {
        if (i12 > 0) {
            m133206A();
        }
        C25836b c25836b = this.f123228t;
        if (c25836b != null) {
            c25836b.m133208C(i11, i12);
        } else {
            Object[] objArr = this.f123224p;
            AbstractC25356m.m131323f(objArr, objArr, i11, i11 + i12, this.f123226r);
            Object[] objArr2 = this.f123224p;
            int i13 = this.f123226r;
            AbstractC25837c.m133231g(objArr2, i13 - i12, i13);
        }
        this.f123226r -= i12;
    }

    /* renamed from: D */
    private final int m133209D(int i11, int i12, Collection collection, boolean z11) {
        int i13;
        C25836b c25836b = this.f123228t;
        if (c25836b != null) {
            i13 = c25836b.m133209D(i11, i12, collection, z11);
        } else {
            int i14 = 0;
            int i15 = 0;
            while (i14 < i12) {
                int i16 = i11 + i14;
                if (collection.contains(this.f123224p[i16]) == z11) {
                    Object[] objArr = this.f123224p;
                    i14++;
                    objArr[i15 + i11] = objArr[i16];
                    i15++;
                } else {
                    i14++;
                }
            }
            int i17 = i12 - i15;
            Object[] objArr2 = this.f123224p;
            AbstractC25356m.m131323f(objArr2, objArr2, i11 + i15, i12 + i11, this.f123226r);
            Object[] objArr3 = this.f123224p;
            int i18 = this.f123226r;
            AbstractC25837c.m133231g(objArr3, i18 - i17, i18);
            i13 = i17;
        }
        if (i13 > 0) {
            m133206A();
        }
        this.f123226r -= i13;
        return i13;
    }

    /* renamed from: m */
    private final void m133214m(int i11, Collection collection, int i12) {
        m133206A();
        C25836b c25836b = this.f123228t;
        if (c25836b != null) {
            c25836b.m133214m(i11, collection, i12);
            this.f123224p = this.f123228t.f123224p;
            this.f123226r += i12;
        } else {
            m133221x(i11, i12);
            Iterator it = collection.iterator();
            for (int i13 = 0; i13 < i12; i13++) {
                this.f123224p[i11 + i13] = it.next();
            }
        }
    }

    /* renamed from: n */
    private final void m133215n(int i11, Object obj) {
        m133206A();
        C25836b c25836b = this.f123228t;
        if (c25836b != null) {
            c25836b.m133215n(i11, obj);
            this.f123224p = this.f123228t.f123224p;
            this.f123226r++;
        } else {
            m133221x(i11, 1);
            this.f123224p[i11] = obj;
        }
    }

    /* renamed from: r */
    private final void m133216r() {
        C25836b c25836b = this.f123229u;
        if (c25836b != null && ((AbstractList) c25836b).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: t */
    private final void m133217t() {
        if (!m133222z()) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: u */
    private final boolean m133218u(List list) {
        boolean m133232h;
        m133232h = AbstractC25837c.m133232h(this.f123224p, this.f123225q, this.f123226r, list);
        return m133232h;
    }

    /* renamed from: v */
    private final void m133219v(int i11) {
        if (i11 >= 0) {
            Object[] objArr = this.f123224p;
            if (i11 > objArr.length) {
                this.f123224p = AbstractC25837c.m133229e(this.f123224p, AbstractC25336c.f121523p.m131238d(objArr.length, i11));
                return;
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: w */
    private final void m133220w(int i11) {
        m133219v(this.f123226r + i11);
    }

    private final Object writeReplace() {
        if (m133222z()) {
            return new C25842h(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    /* renamed from: x */
    private final void m133221x(int i11, int i12) {
        m133220w(i12);
        Object[] objArr = this.f123224p;
        AbstractC25356m.m131323f(objArr, objArr, i11 + i12, i11, this.f123225q + this.f123226r);
        this.f123226r += i12;
    }

    /* renamed from: z */
    private final boolean m133222z() {
        C25836b c25836b;
        if (!this.f123227s && ((c25836b = this.f123229u) == null || !c25836b.f123227s)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        m133217t();
        m133216r();
        m133215n(this.f123225q + this.f123226r, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        AbstractC19074t.m100208f(collection, "elements");
        m133217t();
        m133216r();
        int size = collection.size();
        m133214m(this.f123225q + this.f123226r, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        m133217t();
        m133216r();
        m133208C(this.f123225q, this.f123226r);
    }

    @Override // qm0.AbstractC25340e
    /* renamed from: d */
    public int mo131256d() {
        m133216r();
        return this.f123226r;
    }

    @Override // qm0.AbstractC25340e
    /* renamed from: e */
    public Object mo131257e(int i11) {
        m133217t();
        m133216r();
        AbstractC25336c.f121523p.m131235a(i11, this.f123226r);
        return m133207B(this.f123225q + i11);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        m133216r();
        if (obj != this && (!(obj instanceof List) || !m133218u((List) obj))) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i11) {
        m133216r();
        AbstractC25336c.f121523p.m131235a(i11, this.f123226r);
        return this.f123224p[this.f123225q + i11];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int m133233i;
        m133216r();
        m133233i = AbstractC25837c.m133233i(this.f123224p, this.f123225q, this.f123226r);
        return m133233i;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        m133216r();
        for (int i11 = 0; i11 < this.f123226r; i11++) {
            if (AbstractC19074t.m100204b(this.f123224p[this.f123225q + i11], obj)) {
                return i11;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        m133216r();
        if (this.f123226r == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        m133216r();
        for (int i11 = this.f123226r - 1; i11 >= 0; i11--) {
            if (AbstractC19074t.m100204b(this.f123224p[this.f123225q + i11], obj)) {
                return i11;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    /* renamed from: p */
    public final List m133223p() {
        if (this.f123228t == null) {
            m133217t();
            this.f123227s = true;
            if (this.f123226r > 0) {
                return this;
            }
            return f123223w;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m133217t();
        m133216r();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
        }
        if (indexOf >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection collection) {
        AbstractC19074t.m100208f(collection, "elements");
        m133217t();
        m133216r();
        if (m133209D(this.f123225q, this.f123226r, collection, false) <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection collection) {
        AbstractC19074t.m100208f(collection, "elements");
        m133217t();
        m133216r();
        if (m133209D(this.f123225q, this.f123226r, collection, true) > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i11, Object obj) {
        m133217t();
        m133216r();
        AbstractC25336c.f121523p.m131235a(i11, this.f123226r);
        Object[] objArr = this.f123224p;
        int i12 = this.f123225q;
        Object obj2 = objArr[i12 + i11];
        objArr[i12 + i11] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public List subList(int i11, int i12) {
        C25836b c25836b;
        AbstractC25336c.f121523p.m131237c(i11, i12, this.f123226r);
        Object[] objArr = this.f123224p;
        int i13 = this.f123225q + i11;
        int i14 = i12 - i11;
        boolean z11 = this.f123227s;
        C25836b c25836b2 = this.f123229u;
        if (c25836b2 == null) {
            c25836b = this;
        } else {
            c25836b = c25836b2;
        }
        return new C25836b(objArr, i13, i14, z11, this, c25836b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) {
        Object[] m131498g;
        AbstractC19074t.m100208f(objArr, "destination");
        m133216r();
        int length = objArr.length;
        int i11 = this.f123226r;
        if (length >= i11) {
            Object[] objArr2 = this.f123224p;
            int i12 = this.f123225q;
            AbstractC25356m.m131323f(objArr2, objArr, 0, i12, i11 + i12);
            m131498g = AbstractC25366r.m131498g(this.f123226r, objArr);
            return m131498g;
        }
        Object[] objArr3 = this.f123224p;
        int i13 = this.f123225q;
        Object[] copyOfRange = Arrays.copyOfRange(objArr3, i13, i11 + i13, objArr.getClass());
        AbstractC19074t.m100207e(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String m133234j;
        m133216r();
        m133234j = AbstractC25837c.m133234j(this.f123224p, this.f123225q, this.f123226r, this);
        return m133234j;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i11) {
        m133216r();
        AbstractC25336c.f121523p.m131236b(i11, this.f123226r);
        return new b(this, i11);
    }

    public C25836b() {
        this(10);
    }

    public C25836b(int i11) {
        this(AbstractC25837c.m133228d(i11), 0, 0, false, null, null);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i11, Object obj) {
        m133217t();
        m133216r();
        AbstractC25336c.f121523p.m131236b(i11, this.f123226r);
        m133215n(this.f123225q + i11, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i11, Collection collection) {
        AbstractC19074t.m100208f(collection, "elements");
        m133217t();
        m133216r();
        AbstractC25336c.f121523p.m131236b(i11, this.f123226r);
        int size = collection.size();
        m133214m(this.f123225q + i11, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        Object[] m131328k;
        m133216r();
        Object[] objArr = this.f123224p;
        int i11 = this.f123225q;
        m131328k = AbstractC25356m.m131328k(objArr, i11, this.f123226r + i11);
        return m131328k;
    }
}
