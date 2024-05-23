package pm0;

import fn0.AbstractC19058j;
import fn0.AbstractC19074t;
import gn0.InterfaceC19517a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import qm0.AbstractC25358n;

/* renamed from: pm0.a0 */
/* loaded from: classes7.dex */
public final class C24836a0 implements Collection, InterfaceC19517a {

    /* renamed from: p */
    private final int[] f119226p;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pm0.a0$a */
    /* loaded from: classes7.dex */
    public static final class a implements Iterator, InterfaceC19517a {

        /* renamed from: p */
        private final int[] f119227p;

        /* renamed from: q */
        private int f119228q;

        public a(int[] iArr) {
            AbstractC19074t.m100208f(iArr, "array");
            this.f119227p = iArr;
        }

        /* renamed from: a */
        public int m129146a() {
            int i11 = this.f119228q;
            int[] iArr = this.f119227p;
            if (i11 < iArr.length) {
                this.f119228q = i11 + 1;
                return C24869z.m129260c(iArr[i11]);
            }
            throw new NoSuchElementException(String.valueOf(this.f119228q));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f119228q < this.f119227p.length) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return C24869z.m129259b(m129146a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ C24836a0(int[] iArr) {
        this.f119226p = iArr;
    }

    /* renamed from: d */
    public static final /* synthetic */ C24836a0 m129130d(int[] iArr) {
        return new C24836a0(iArr);
    }

    /* renamed from: e */
    public static int[] m129131e(int i11) {
        return m129132g(new int[i11]);
    }

    /* renamed from: g */
    public static int[] m129132g(int[] iArr) {
        AbstractC19074t.m100208f(iArr, "storage");
        return iArr;
    }

    /* renamed from: k */
    public static boolean m129133k(int[] iArr, int i11) {
        boolean m131388u;
        m131388u = AbstractC25358n.m131388u(iArr, i11);
        return m131388u;
    }

    /* renamed from: l */
    public static boolean m129134l(int[] iArr, Collection collection) {
        boolean m131388u;
        AbstractC19074t.m100208f(collection, "elements");
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (obj instanceof C24869z) {
                m131388u = AbstractC25358n.m131388u(iArr, ((C24869z) obj).m129264h());
                if (m131388u) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public static boolean m129135m(int[] iArr, Object obj) {
        return (obj instanceof C24836a0) && AbstractC19074t.m100204b(iArr, ((C24836a0) obj).m129145z());
    }

    /* renamed from: n */
    public static final int m129136n(int[] iArr, int i11) {
        return C24869z.m129260c(iArr[i11]);
    }

    /* renamed from: r */
    public static int m129137r(int[] iArr) {
        return iArr.length;
    }

    /* renamed from: t */
    public static int m129138t(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* renamed from: u */
    public static boolean m129139u(int[] iArr) {
        if (iArr.length == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public static Iterator m129140v(int[] iArr) {
        return new a(iArr);
    }

    /* renamed from: w */
    public static final void m129141w(int[] iArr, int i11, int i12) {
        iArr[i11] = i12;
    }

    /* renamed from: x */
    public static String m129142x(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C24869z)) {
            return false;
        }
        return m129143j(((C24869z) obj).m129264h());
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        AbstractC19074t.m100208f(collection, "elements");
        return m129134l(this.f119226p, collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m129135m(this.f119226p, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m129138t(this.f119226p);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m129139u(this.f119226p);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return m129140v(this.f119226p);
    }

    /* renamed from: j */
    public boolean m129143j(int i11) {
        return m129133k(this.f119226p, i11);
    }

    @Override // java.util.Collection
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m129137r(this.f119226p);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return AbstractC19058j.m100166a(this);
    }

    public String toString() {
        return m129142x(this.f119226p);
    }

    /* renamed from: z */
    public final /* synthetic */ int[] m129145z() {
        return this.f119226p;
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        AbstractC19074t.m100208f(objArr, "array");
        return AbstractC19058j.m100167b(this, objArr);
    }
}
