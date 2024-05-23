package qm0;

import fn0.AbstractC19074t;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import ln0.AbstractC22543l;

/* renamed from: qm0.u0 */
/* loaded from: classes7.dex */
final class C25373u0 extends AbstractC25336c implements RandomAccess {

    /* renamed from: q */
    private final Object[] f121553q;

    /* renamed from: r */
    private final int f121554r;

    /* renamed from: s */
    private int f121555s;

    /* renamed from: t */
    private int f121556t;

    /* renamed from: qm0.u0$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC25334b {

        /* renamed from: r */
        private int f121557r;

        /* renamed from: s */
        private int f121558s;

        a() {
            this.f121557r = C25373u0.this.size();
            this.f121558s = C25373u0.this.f121555s;
        }

        @Override // qm0.AbstractC25334b
        /* renamed from: a */
        protected void mo13902a() {
            if (this.f121557r == 0) {
                m131231c();
                return;
            }
            m131232d(C25373u0.this.f121553q[this.f121558s]);
            this.f121558s = (this.f121558s + 1) % C25373u0.this.f121554r;
            this.f121557r--;
        }
    }

    public C25373u0(Object[] objArr, int i11) {
        AbstractC19074t.m100208f(objArr, "buffer");
        this.f121553q = objArr;
        if (i11 >= 0) {
            if (i11 <= objArr.length) {
                this.f121554r = objArr.length;
                this.f121556t = i11;
                return;
            }
            throw new IllegalArgumentException(("ring buffer filled size: " + i11 + " cannot be larger than the buffer size: " + objArr.length).toString());
        }
        throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i11).toString());
    }

    @Override // qm0.AbstractC25331a
    /* renamed from: d */
    public int mo127005d() {
        return this.f121556t;
    }

    @Override // qm0.AbstractC25336c, java.util.List
    public Object get(int i11) {
        AbstractC25336c.f121523p.m131235a(i11, size());
        return this.f121553q[(this.f121555s + i11) % this.f121554r];
    }

    @Override // qm0.AbstractC25336c, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new a();
    }

    /* renamed from: k */
    public final void m131519k(Object obj) {
        if (!m131521m()) {
            this.f121553q[(this.f121555s + size()) % this.f121554r] = obj;
            this.f121556t = size() + 1;
            return;
        }
        throw new IllegalStateException("ring buffer is full");
    }

    /* renamed from: l */
    public final C25373u0 m131520l(int i11) {
        int m116584g;
        Object[] array;
        int i12 = this.f121554r;
        m116584g = AbstractC22543l.m116584g(i12 + (i12 >> 1) + 1, i11);
        if (this.f121555s == 0) {
            array = Arrays.copyOf(this.f121553q, m116584g);
            AbstractC19074t.m100207e(array, "copyOf(...)");
        } else {
            array = toArray(new Object[m116584g]);
        }
        return new C25373u0(array, size());
    }

    /* renamed from: m */
    public final boolean m131521m() {
        if (size() == this.f121554r) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public final void m131522n(int i11) {
        if (i11 >= 0) {
            if (i11 <= size()) {
                if (i11 > 0) {
                    int i12 = this.f121555s;
                    int i13 = (i12 + i11) % this.f121554r;
                    if (i12 > i13) {
                        AbstractC25356m.m131330m(this.f121553q, null, i12, this.f121554r);
                        AbstractC25356m.m131330m(this.f121553q, null, 0, i13);
                    } else {
                        AbstractC25356m.m131330m(this.f121553q, null, i12, i13);
                    }
                    this.f121555s = i13;
                    this.f121556t = size() - i11;
                    return;
                }
                return;
            }
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i11 + ", size = " + size()).toString());
        }
        throw new IllegalArgumentException(("n shouldn't be negative but it is " + i11).toString());
    }

    @Override // qm0.AbstractC25331a, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        Object[] m131498g;
        AbstractC19074t.m100208f(objArr, "array");
        if (objArr.length < size()) {
            objArr = Arrays.copyOf(objArr, size());
            AbstractC19074t.m100207e(objArr, "copyOf(...)");
        }
        int size = size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = this.f121555s; i12 < size && i13 < this.f121554r; i13++) {
            objArr[i12] = this.f121553q[i13];
            i12++;
        }
        while (i12 < size) {
            objArr[i12] = this.f121553q[i11];
            i12++;
            i11++;
        }
        m131498g = AbstractC25366r.m131498g(size, objArr);
        return m131498g;
    }

    public C25373u0(int i11) {
        this(new Object[i11], 0);
    }

    @Override // qm0.AbstractC25331a, java.util.Collection
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
