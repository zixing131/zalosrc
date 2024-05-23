package pm0;

import fn0.AbstractC19058j;
import fn0.AbstractC19074t;
import gn0.InterfaceC19517a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import qm0.AbstractC25358n;

/* renamed from: pm0.y */
/* loaded from: classes7.dex */
public final class C24868y implements Collection, InterfaceC19517a {

    /* renamed from: p */
    private final byte[] f119280p;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pm0.y$a */
    /* loaded from: classes7.dex */
    public static final class a implements Iterator, InterfaceC19517a {

        /* renamed from: p */
        private final byte[] f119281p;

        /* renamed from: q */
        private int f119282q;

        public a(byte[] bArr) {
            AbstractC19074t.m100208f(bArr, "array");
            this.f119281p = bArr;
        }

        /* renamed from: a */
        public byte m129258a() {
            int i11 = this.f119282q;
            byte[] bArr = this.f119281p;
            if (i11 < bArr.length) {
                this.f119282q = i11 + 1;
                return C24867x.m129237c(bArr[i11]);
            }
            throw new NoSuchElementException(String.valueOf(this.f119282q));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f119282q < this.f119281p.length) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return C24867x.m129236b(m129258a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ C24868y(byte[] bArr) {
        this.f119280p = bArr;
    }

    /* renamed from: d */
    public static final /* synthetic */ C24868y m129242d(byte[] bArr) {
        return new C24868y(bArr);
    }

    /* renamed from: e */
    public static byte[] m129243e(int i11) {
        return m129244g(new byte[i11]);
    }

    /* renamed from: g */
    public static byte[] m129244g(byte[] bArr) {
        AbstractC19074t.m100208f(bArr, "storage");
        return bArr;
    }

    /* renamed from: k */
    public static boolean m129245k(byte[] bArr, byte b11) {
        boolean m131387t;
        m131387t = AbstractC25358n.m131387t(bArr, b11);
        return m131387t;
    }

    /* renamed from: l */
    public static boolean m129246l(byte[] bArr, Collection collection) {
        boolean m131387t;
        AbstractC19074t.m100208f(collection, "elements");
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (obj instanceof C24867x) {
                m131387t = AbstractC25358n.m131387t(bArr, ((C24867x) obj).m129241h());
                if (m131387t) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public static boolean m129247m(byte[] bArr, Object obj) {
        return (obj instanceof C24868y) && AbstractC19074t.m100204b(bArr, ((C24868y) obj).m129257z());
    }

    /* renamed from: n */
    public static final byte m129248n(byte[] bArr, int i11) {
        return C24867x.m129237c(bArr[i11]);
    }

    /* renamed from: r */
    public static int m129249r(byte[] bArr) {
        return bArr.length;
    }

    /* renamed from: t */
    public static int m129250t(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    /* renamed from: u */
    public static boolean m129251u(byte[] bArr) {
        if (bArr.length == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public static Iterator m129252v(byte[] bArr) {
        return new a(bArr);
    }

    /* renamed from: w */
    public static final void m129253w(byte[] bArr, int i11, byte b11) {
        bArr[i11] = b11;
    }

    /* renamed from: x */
    public static String m129254x(byte[] bArr) {
        return "UByteArray(storage=" + Arrays.toString(bArr) + ')';
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
        if (!(obj instanceof C24867x)) {
            return false;
        }
        return m129255j(((C24867x) obj).m129241h());
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        AbstractC19074t.m100208f(collection, "elements");
        return m129246l(this.f119280p, collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m129247m(this.f119280p, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m129250t(this.f119280p);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m129251u(this.f119280p);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return m129252v(this.f119280p);
    }

    /* renamed from: j */
    public boolean m129255j(byte b11) {
        return m129245k(this.f119280p, b11);
    }

    @Override // java.util.Collection
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m129249r(this.f119280p);
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
        return m129254x(this.f119280p);
    }

    /* renamed from: z */
    public final /* synthetic */ byte[] m129257z() {
        return this.f119280p;
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        AbstractC19074t.m100208f(objArr, "array");
        return AbstractC19058j.m100167b(this, objArr);
    }
}
