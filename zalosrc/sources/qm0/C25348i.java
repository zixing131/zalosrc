package qm0;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import ln0.AbstractC22543l;

/* renamed from: qm0.i */
/* loaded from: classes.dex */
public final class C25348i extends AbstractC25340e {

    /* renamed from: s */
    public static final a f121538s = new a(null);

    /* renamed from: t */
    private static final Object[] f121539t = new Object[0];

    /* renamed from: p */
    private int f121540p;

    /* renamed from: q */
    private Object[] f121541q = f121539t;

    /* renamed from: r */
    private int f121542r;

    /* renamed from: qm0.i$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: g */
    private final void m131266g(int i11, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f121541q.length;
        while (i11 < length && it.hasNext()) {
            this.f121541q[i11] = it.next();
            i11++;
        }
        int i12 = this.f121540p;
        for (int i13 = 0; i13 < i12 && it.hasNext(); i13++) {
            this.f121541q[i13] = it.next();
        }
        this.f121542r = size() + collection.size();
    }

    /* renamed from: j */
    private final void m131267j(int i11) {
        Object[] objArr = new Object[i11];
        Object[] objArr2 = this.f121541q;
        AbstractC25356m.m131323f(objArr2, objArr, 0, this.f121540p, objArr2.length);
        Object[] objArr3 = this.f121541q;
        int length = objArr3.length;
        int i12 = this.f121540p;
        AbstractC25356m.m131323f(objArr3, objArr, length - i12, 0, i12);
        this.f121540p = 0;
        this.f121541q = objArr;
    }

    /* renamed from: k */
    private final int m131268k(int i11) {
        if (i11 == 0) {
            return AbstractC25358n.m131362J(this.f121541q);
        }
        return i11 - 1;
    }

    /* renamed from: l */
    private final void m131269l(int i11) {
        int m116580c;
        if (i11 >= 0) {
            Object[] objArr = this.f121541q;
            if (i11 <= objArr.length) {
                return;
            }
            if (objArr == f121539t) {
                m116580c = AbstractC22543l.m116580c(i11, 10);
                this.f121541q = new Object[m116580c];
                return;
            } else {
                m131267j(AbstractC25336c.f121523p.m131238d(objArr.length, i11));
                return;
            }
        }
        throw new IllegalStateException("Deque is too big.");
    }

    /* renamed from: m */
    private final int m131270m(int i11) {
        if (i11 == AbstractC25358n.m131362J(this.f121541q)) {
            return 0;
        }
        return i11 + 1;
    }

    /* renamed from: n */
    private final int m131271n(int i11) {
        if (i11 < 0) {
            return i11 + this.f121541q.length;
        }
        return i11;
    }

    /* renamed from: p */
    private final int m131272p(int i11) {
        Object[] objArr = this.f121541q;
        if (i11 >= objArr.length) {
            return i11 - objArr.length;
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        AbstractC19074t.m100208f(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        m131269l(size() + collection.size());
        m131266g(m131272p(this.f121540p + size()), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        m131269l(size() + 1);
        int m131268k = m131268k(this.f121540p);
        this.f121540p = m131268k;
        this.f121541q[m131268k] = obj;
        this.f121542r = size() + 1;
    }

    public final void addLast(Object obj) {
        m131269l(size() + 1);
        this.f121541q[m131272p(this.f121540p + size())] = obj;
        this.f121542r = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int m131272p = m131272p(this.f121540p + size());
        int i11 = this.f121540p;
        if (i11 < m131272p) {
            AbstractC25356m.m131330m(this.f121541q, null, i11, m131272p);
        } else if (!isEmpty()) {
            Object[] objArr = this.f121541q;
            AbstractC25356m.m131330m(objArr, null, this.f121540p, objArr.length);
            AbstractC25356m.m131330m(this.f121541q, null, 0, m131272p);
        }
        this.f121540p = 0;
        this.f121542r = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // qm0.AbstractC25340e
    /* renamed from: d */
    public int mo131256d() {
        return this.f121542r;
    }

    @Override // qm0.AbstractC25340e
    /* renamed from: e */
    public Object mo131257e(int i11) {
        int m131504l;
        int m131504l2;
        AbstractC25336c.f121523p.m131235a(i11, size());
        m131504l = AbstractC25368s.m131504l(this);
        if (i11 == m131504l) {
            return removeLast();
        }
        if (i11 == 0) {
            return removeFirst();
        }
        int m131272p = m131272p(this.f121540p + i11);
        Object obj = this.f121541q[m131272p];
        if (i11 < (size() >> 1)) {
            int i12 = this.f121540p;
            if (m131272p >= i12) {
                Object[] objArr = this.f121541q;
                AbstractC25356m.m131323f(objArr, objArr, i12 + 1, i12, m131272p);
            } else {
                Object[] objArr2 = this.f121541q;
                AbstractC25356m.m131323f(objArr2, objArr2, 1, 0, m131272p);
                Object[] objArr3 = this.f121541q;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i13 = this.f121540p;
                AbstractC25356m.m131323f(objArr3, objArr3, i13 + 1, i13, objArr3.length - 1);
            }
            Object[] objArr4 = this.f121541q;
            int i14 = this.f121540p;
            objArr4[i14] = null;
            this.f121540p = m131270m(i14);
        } else {
            int i15 = this.f121540p;
            m131504l2 = AbstractC25368s.m131504l(this);
            int m131272p2 = m131272p(i15 + m131504l2);
            if (m131272p <= m131272p2) {
                Object[] objArr5 = this.f121541q;
                AbstractC25356m.m131323f(objArr5, objArr5, m131272p, m131272p + 1, m131272p2 + 1);
            } else {
                Object[] objArr6 = this.f121541q;
                AbstractC25356m.m131323f(objArr6, objArr6, m131272p, m131272p + 1, objArr6.length);
                Object[] objArr7 = this.f121541q;
                objArr7[objArr7.length - 1] = objArr7[0];
                AbstractC25356m.m131323f(objArr7, objArr7, 0, 1, m131272p2 + 1);
            }
            this.f121541q[m131272p2] = null;
        }
        this.f121542r = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i11) {
        AbstractC25336c.f121523p.m131235a(i11, size());
        return this.f121541q[m131272p(this.f121540p + i11)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i11;
        int m131272p = m131272p(this.f121540p + size());
        int i12 = this.f121540p;
        if (i12 < m131272p) {
            while (i12 < m131272p) {
                if (AbstractC19074t.m100204b(obj, this.f121541q[i12])) {
                    i11 = this.f121540p;
                } else {
                    i12++;
                }
            }
            return -1;
        }
        if (i12 >= m131272p) {
            int length = this.f121541q.length;
            while (true) {
                if (i12 < length) {
                    if (AbstractC19074t.m100204b(obj, this.f121541q[i12])) {
                        i11 = this.f121540p;
                        break;
                    }
                    i12++;
                } else {
                    for (int i13 = 0; i13 < m131272p; i13++) {
                        if (AbstractC19074t.m100204b(obj, this.f121541q[i13])) {
                            i12 = i13 + this.f121541q.length;
                            i11 = this.f121540p;
                        }
                    }
                    return -1;
                }
            }
        } else {
            return -1;
        }
        return i12 - i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int m131362J;
        int i11;
        int m131272p = m131272p(this.f121540p + size());
        int i12 = this.f121540p;
        if (i12 < m131272p) {
            m131362J = m131272p - 1;
            if (i12 <= m131362J) {
                while (!AbstractC19074t.m100204b(obj, this.f121541q[m131362J])) {
                    if (m131362J != i12) {
                        m131362J--;
                    }
                }
                i11 = this.f121540p;
                return m131362J - i11;
            }
            return -1;
        }
        if (i12 > m131272p) {
            int i13 = m131272p - 1;
            while (true) {
                if (-1 < i13) {
                    if (AbstractC19074t.m100204b(obj, this.f121541q[i13])) {
                        m131362J = i13 + this.f121541q.length;
                        i11 = this.f121540p;
                        break;
                    }
                    i13--;
                } else {
                    m131362J = AbstractC25358n.m131362J(this.f121541q);
                    int i14 = this.f121540p;
                    if (i14 <= m131362J) {
                        while (!AbstractC19074t.m100204b(obj, this.f121541q[m131362J])) {
                            if (m131362J != i14) {
                                m131362J--;
                            }
                        }
                        i11 = this.f121540p;
                    }
                }
            }
        }
        return -1;
    }

    /* renamed from: r */
    public final Object m131273r() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection collection) {
        int m131272p;
        AbstractC19074t.m100208f(collection, "elements");
        boolean z11 = false;
        z11 = false;
        z11 = false;
        if (!isEmpty() && this.f121541q.length != 0) {
            int m131272p2 = m131272p(this.f121540p + size());
            int i11 = this.f121540p;
            if (i11 < m131272p2) {
                m131272p = i11;
                while (i11 < m131272p2) {
                    Object obj = this.f121541q[i11];
                    if (!collection.contains(obj)) {
                        this.f121541q[m131272p] = obj;
                        m131272p++;
                    } else {
                        z11 = true;
                    }
                    i11++;
                }
                AbstractC25356m.m131330m(this.f121541q, null, m131272p, m131272p2);
            } else {
                int length = this.f121541q.length;
                int i12 = i11;
                boolean z12 = false;
                while (i11 < length) {
                    Object[] objArr = this.f121541q;
                    Object obj2 = objArr[i11];
                    objArr[i11] = null;
                    if (!collection.contains(obj2)) {
                        this.f121541q[i12] = obj2;
                        i12++;
                    } else {
                        z12 = true;
                    }
                    i11++;
                }
                m131272p = m131272p(i12);
                for (int i13 = 0; i13 < m131272p2; i13++) {
                    Object[] objArr2 = this.f121541q;
                    Object obj3 = objArr2[i13];
                    objArr2[i13] = null;
                    if (!collection.contains(obj3)) {
                        this.f121541q[m131272p] = obj3;
                        m131272p = m131270m(m131272p);
                    } else {
                        z12 = true;
                    }
                }
                z11 = z12;
            }
            if (z11) {
                this.f121542r = m131271n(m131272p - this.f121540p);
            }
        }
        return z11;
    }

    public final Object removeFirst() {
        if (!isEmpty()) {
            Object[] objArr = this.f121541q;
            int i11 = this.f121540p;
            Object obj = objArr[i11];
            objArr[i11] = null;
            this.f121540p = m131270m(i11);
            this.f121542r = size() - 1;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object removeLast() {
        int m131504l;
        if (!isEmpty()) {
            int i11 = this.f121540p;
            m131504l = AbstractC25368s.m131504l(this);
            int m131272p = m131272p(i11 + m131504l);
            Object[] objArr = this.f121541q;
            Object obj = objArr[m131272p];
            objArr[m131272p] = null;
            this.f121542r = size() - 1;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection collection) {
        int m131272p;
        AbstractC19074t.m100208f(collection, "elements");
        boolean z11 = false;
        z11 = false;
        z11 = false;
        if (!isEmpty() && this.f121541q.length != 0) {
            int m131272p2 = m131272p(this.f121540p + size());
            int i11 = this.f121540p;
            if (i11 < m131272p2) {
                m131272p = i11;
                while (i11 < m131272p2) {
                    Object obj = this.f121541q[i11];
                    if (collection.contains(obj)) {
                        this.f121541q[m131272p] = obj;
                        m131272p++;
                    } else {
                        z11 = true;
                    }
                    i11++;
                }
                AbstractC25356m.m131330m(this.f121541q, null, m131272p, m131272p2);
            } else {
                int length = this.f121541q.length;
                int i12 = i11;
                boolean z12 = false;
                while (i11 < length) {
                    Object[] objArr = this.f121541q;
                    Object obj2 = objArr[i11];
                    objArr[i11] = null;
                    if (collection.contains(obj2)) {
                        this.f121541q[i12] = obj2;
                        i12++;
                    } else {
                        z12 = true;
                    }
                    i11++;
                }
                m131272p = m131272p(i12);
                for (int i13 = 0; i13 < m131272p2; i13++) {
                    Object[] objArr2 = this.f121541q;
                    Object obj3 = objArr2[i13];
                    objArr2[i13] = null;
                    if (collection.contains(obj3)) {
                        this.f121541q[m131272p] = obj3;
                        m131272p = m131270m(m131272p);
                    } else {
                        z12 = true;
                    }
                }
                z11 = z12;
            }
            if (z11) {
                this.f121542r = m131271n(m131272p - this.f121540p);
            }
        }
        return z11;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i11, Object obj) {
        AbstractC25336c.f121523p.m131235a(i11, size());
        int m131272p = m131272p(this.f121540p + i11);
        Object[] objArr = this.f121541q;
        Object obj2 = objArr[m131272p];
        objArr[m131272p] = obj;
        return obj2;
    }

    /* renamed from: t */
    public final Object m131274t() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) {
        Object[] m131498g;
        AbstractC19074t.m100208f(objArr, "array");
        if (objArr.length < size()) {
            objArr = AbstractC25352k.m131317a(objArr, size());
        }
        int m131272p = m131272p(this.f121540p + size());
        int i11 = this.f121540p;
        if (i11 < m131272p) {
            AbstractC25356m.m131326i(this.f121541q, objArr, 0, i11, m131272p, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f121541q;
            AbstractC25356m.m131323f(objArr2, objArr, 0, this.f121540p, objArr2.length);
            Object[] objArr3 = this.f121541q;
            AbstractC25356m.m131323f(objArr3, objArr, objArr3.length - this.f121540p, 0, m131272p);
        }
        m131498g = AbstractC25366r.m131498g(size(), objArr);
        return m131498g;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i11, Object obj) {
        AbstractC25336c.f121523p.m131236b(i11, size());
        if (i11 == size()) {
            addLast(obj);
            return;
        }
        if (i11 == 0) {
            addFirst(obj);
            return;
        }
        m131269l(size() + 1);
        int m131272p = m131272p(this.f121540p + i11);
        if (i11 < ((size() + 1) >> 1)) {
            int m131268k = m131268k(m131272p);
            int m131268k2 = m131268k(this.f121540p);
            int i12 = this.f121540p;
            if (m131268k < i12) {
                Object[] objArr = this.f121541q;
                AbstractC25356m.m131323f(objArr, objArr, i12 - 1, i12, objArr.length);
                Object[] objArr2 = this.f121541q;
                objArr2[objArr2.length - 1] = objArr2[0];
                AbstractC25356m.m131323f(objArr2, objArr2, 0, 1, m131268k + 1);
            } else {
                Object[] objArr3 = this.f121541q;
                objArr3[m131268k2] = objArr3[i12];
                AbstractC25356m.m131323f(objArr3, objArr3, i12, i12 + 1, m131268k + 1);
            }
            this.f121541q[m131268k] = obj;
            this.f121540p = m131268k2;
        } else {
            int m131272p2 = m131272p(this.f121540p + size());
            if (m131272p < m131272p2) {
                Object[] objArr4 = this.f121541q;
                AbstractC25356m.m131323f(objArr4, objArr4, m131272p + 1, m131272p, m131272p2);
            } else {
                Object[] objArr5 = this.f121541q;
                AbstractC25356m.m131323f(objArr5, objArr5, 1, 0, m131272p2);
                Object[] objArr6 = this.f121541q;
                objArr6[0] = objArr6[objArr6.length - 1];
                AbstractC25356m.m131323f(objArr6, objArr6, m131272p + 1, m131272p, objArr6.length - 1);
            }
            this.f121541q[m131272p] = obj;
        }
        this.f121542r = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i11, Collection collection) {
        AbstractC19074t.m100208f(collection, "elements");
        AbstractC25336c.f121523p.m131236b(i11, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i11 == size()) {
            return addAll(collection);
        }
        m131269l(size() + collection.size());
        int m131272p = m131272p(this.f121540p + size());
        int m131272p2 = m131272p(this.f121540p + i11);
        int size = collection.size();
        if (i11 < ((size() + 1) >> 1)) {
            int i12 = this.f121540p;
            int i13 = i12 - size;
            if (m131272p2 < i12) {
                Object[] objArr = this.f121541q;
                AbstractC25356m.m131323f(objArr, objArr, i13, i12, objArr.length);
                if (size >= m131272p2) {
                    Object[] objArr2 = this.f121541q;
                    AbstractC25356m.m131323f(objArr2, objArr2, objArr2.length - size, 0, m131272p2);
                } else {
                    Object[] objArr3 = this.f121541q;
                    AbstractC25356m.m131323f(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f121541q;
                    AbstractC25356m.m131323f(objArr4, objArr4, 0, size, m131272p2);
                }
            } else if (i13 >= 0) {
                Object[] objArr5 = this.f121541q;
                AbstractC25356m.m131323f(objArr5, objArr5, i13, i12, m131272p2);
            } else {
                Object[] objArr6 = this.f121541q;
                i13 += objArr6.length;
                int i14 = m131272p2 - i12;
                int length = objArr6.length - i13;
                if (length >= i14) {
                    AbstractC25356m.m131323f(objArr6, objArr6, i13, i12, m131272p2);
                } else {
                    AbstractC25356m.m131323f(objArr6, objArr6, i13, i12, i12 + length);
                    Object[] objArr7 = this.f121541q;
                    AbstractC25356m.m131323f(objArr7, objArr7, 0, this.f121540p + length, m131272p2);
                }
            }
            this.f121540p = i13;
            m131266g(m131271n(m131272p2 - size), collection);
        } else {
            int i15 = m131272p2 + size;
            if (m131272p2 >= m131272p) {
                Object[] objArr8 = this.f121541q;
                AbstractC25356m.m131323f(objArr8, objArr8, size, 0, m131272p);
                Object[] objArr9 = this.f121541q;
                if (i15 >= objArr9.length) {
                    AbstractC25356m.m131323f(objArr9, objArr9, i15 - objArr9.length, m131272p2, objArr9.length);
                } else {
                    AbstractC25356m.m131323f(objArr9, objArr9, 0, objArr9.length - size, objArr9.length);
                    Object[] objArr10 = this.f121541q;
                    AbstractC25356m.m131323f(objArr10, objArr10, i15, m131272p2, objArr10.length - size);
                }
            } else {
                int i16 = size + m131272p;
                Object[] objArr11 = this.f121541q;
                if (i16 <= objArr11.length) {
                    AbstractC25356m.m131323f(objArr11, objArr11, i15, m131272p2, m131272p);
                } else if (i15 >= objArr11.length) {
                    AbstractC25356m.m131323f(objArr11, objArr11, i15 - objArr11.length, m131272p2, m131272p);
                } else {
                    int length2 = m131272p - (i16 - objArr11.length);
                    AbstractC25356m.m131323f(objArr11, objArr11, 0, length2, m131272p);
                    Object[] objArr12 = this.f121541q;
                    AbstractC25356m.m131323f(objArr12, objArr12, i15, m131272p2, length2);
                }
            }
            m131266g(m131272p2, collection);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
