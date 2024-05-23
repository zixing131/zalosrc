package pm0;

import fn0.AbstractC19058j;
import fn0.AbstractC19074t;
import gn0.InterfaceC19517a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import qm0.AbstractC25358n;

/* renamed from: pm0.c0 */
/* loaded from: classes7.dex */
public final class C24840c0 implements Collection, InterfaceC19517a {

    /* renamed from: p */
    private final long[] f119232p;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pm0.c0$a */
    /* loaded from: classes7.dex */
    public static final class a implements Iterator, InterfaceC19517a {

        /* renamed from: p */
        private final long[] f119233p;

        /* renamed from: q */
        private int f119234q;

        public a(long[] jArr) {
            AbstractC19074t.m100208f(jArr, "array");
            this.f119233p = jArr;
        }

        /* renamed from: a */
        public long m129172a() {
            int i11 = this.f119234q;
            long[] jArr = this.f119233p;
            if (i11 < jArr.length) {
                this.f119234q = i11 + 1;
                return C24838b0.m129150c(jArr[i11]);
            }
            throw new NoSuchElementException(String.valueOf(this.f119234q));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f119234q < this.f119233p.length) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return C24838b0.m129149b(m129172a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ C24840c0(long[] jArr) {
        this.f119232p = jArr;
    }

    /* renamed from: d */
    public static final /* synthetic */ C24840c0 m129156d(long[] jArr) {
        return new C24840c0(jArr);
    }

    /* renamed from: e */
    public static long[] m129157e(int i11) {
        return m129158g(new long[i11]);
    }

    /* renamed from: g */
    public static long[] m129158g(long[] jArr) {
        AbstractC19074t.m100208f(jArr, "storage");
        return jArr;
    }

    /* renamed from: k */
    public static boolean m129159k(long[] jArr, long j11) {
        boolean m131389v;
        m131389v = AbstractC25358n.m131389v(jArr, j11);
        return m131389v;
    }

    /* renamed from: l */
    public static boolean m129160l(long[] jArr, Collection collection) {
        boolean m131389v;
        AbstractC19074t.m100208f(collection, "elements");
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (obj instanceof C24838b0) {
                m131389v = AbstractC25358n.m131389v(jArr, ((C24838b0) obj).m129154h());
                if (m131389v) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public static boolean m129161m(long[] jArr, Object obj) {
        return (obj instanceof C24840c0) && AbstractC19074t.m100204b(jArr, ((C24840c0) obj).m129171z());
    }

    /* renamed from: n */
    public static final long m129162n(long[] jArr, int i11) {
        return C24838b0.m129150c(jArr[i11]);
    }

    /* renamed from: r */
    public static int m129163r(long[] jArr) {
        return jArr.length;
    }

    /* renamed from: t */
    public static int m129164t(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    /* renamed from: u */
    public static boolean m129165u(long[] jArr) {
        if (jArr.length == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public static Iterator m129166v(long[] jArr) {
        return new a(jArr);
    }

    /* renamed from: w */
    public static final void m129167w(long[] jArr, int i11, long j11) {
        jArr[i11] = j11;
    }

    /* renamed from: x */
    public static String m129168x(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + ')';
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
        if (!(obj instanceof C24838b0)) {
            return false;
        }
        return m129169j(((C24838b0) obj).m129154h());
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        AbstractC19074t.m100208f(collection, "elements");
        return m129160l(this.f119232p, collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m129161m(this.f119232p, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m129164t(this.f119232p);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m129165u(this.f119232p);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return m129166v(this.f119232p);
    }

    /* renamed from: j */
    public boolean m129169j(long j11) {
        return m129159k(this.f119232p, j11);
    }

    @Override // java.util.Collection
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m129163r(this.f119232p);
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
        return m129168x(this.f119232p);
    }

    /* renamed from: z */
    public final /* synthetic */ long[] m129171z() {
        return this.f119232p;
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        AbstractC19074t.m100208f(objArr, "array");
        return AbstractC19058j.m100167b(this, objArr);
    }
}
