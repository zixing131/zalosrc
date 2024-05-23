package pm0;

import fn0.AbstractC19058j;
import fn0.AbstractC19074t;
import gn0.InterfaceC19517a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import qm0.AbstractC25358n;

/* renamed from: pm0.f0 */
/* loaded from: classes7.dex */
public final class C24846f0 implements Collection, InterfaceC19517a {

    /* renamed from: p */
    private final short[] f119242p;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pm0.f0$a */
    /* loaded from: classes7.dex */
    public static final class a implements Iterator, InterfaceC19517a {

        /* renamed from: p */
        private final short[] f119243p;

        /* renamed from: q */
        private int f119244q;

        public a(short[] sArr) {
            AbstractC19074t.m100208f(sArr, "array");
            this.f119243p = sArr;
        }

        /* renamed from: a */
        public short m129200a() {
            int i11 = this.f119244q;
            short[] sArr = this.f119243p;
            if (i11 < sArr.length) {
                this.f119244q = i11 + 1;
                return C24844e0.m129177c(sArr[i11]);
            }
            throw new NoSuchElementException(String.valueOf(this.f119244q));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f119244q < this.f119243p.length) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return C24844e0.m129176b(m129200a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ C24846f0(short[] sArr) {
        this.f119242p = sArr;
    }

    /* renamed from: d */
    public static final /* synthetic */ C24846f0 m129184d(short[] sArr) {
        return new C24846f0(sArr);
    }

    /* renamed from: e */
    public static short[] m129185e(int i11) {
        return m129186g(new short[i11]);
    }

    /* renamed from: g */
    public static short[] m129186g(short[] sArr) {
        AbstractC19074t.m100208f(sArr, "storage");
        return sArr;
    }

    /* renamed from: k */
    public static boolean m129187k(short[] sArr, short s7) {
        boolean m131391x;
        m131391x = AbstractC25358n.m131391x(sArr, s7);
        return m131391x;
    }

    /* renamed from: l */
    public static boolean m129188l(short[] sArr, Collection collection) {
        boolean m131391x;
        AbstractC19074t.m100208f(collection, "elements");
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (obj instanceof C24844e0) {
                m131391x = AbstractC25358n.m131391x(sArr, ((C24844e0) obj).m129181h());
                if (m131391x) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public static boolean m129189m(short[] sArr, Object obj) {
        return (obj instanceof C24846f0) && AbstractC19074t.m100204b(sArr, ((C24846f0) obj).m129199z());
    }

    /* renamed from: n */
    public static final short m129190n(short[] sArr, int i11) {
        return C24844e0.m129177c(sArr[i11]);
    }

    /* renamed from: r */
    public static int m129191r(short[] sArr) {
        return sArr.length;
    }

    /* renamed from: t */
    public static int m129192t(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    /* renamed from: u */
    public static boolean m129193u(short[] sArr) {
        if (sArr.length == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public static Iterator m129194v(short[] sArr) {
        return new a(sArr);
    }

    /* renamed from: w */
    public static final void m129195w(short[] sArr, int i11, short s7) {
        sArr[i11] = s7;
    }

    /* renamed from: x */
    public static String m129196x(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + ')';
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
        if (!(obj instanceof C24844e0)) {
            return false;
        }
        return m129197j(((C24844e0) obj).m129181h());
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        AbstractC19074t.m100208f(collection, "elements");
        return m129188l(this.f119242p, collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m129189m(this.f119242p, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m129192t(this.f119242p);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m129193u(this.f119242p);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return m129194v(this.f119242p);
    }

    /* renamed from: j */
    public boolean m129197j(short s7) {
        return m129187k(this.f119242p, s7);
    }

    @Override // java.util.Collection
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m129191r(this.f119242p);
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
        return m129196x(this.f119242p);
    }

    /* renamed from: z */
    public final /* synthetic */ short[] m129199z() {
        return this.f119242p;
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        AbstractC19074t.m100208f(objArr, "array");
        return AbstractC19058j.m100167b(this, objArr);
    }
}
