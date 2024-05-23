package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.u0 */
/* loaded from: classes3.dex */
final class C6835u0 extends AbstractC6790c implements RandomAccess {

    /* renamed from: s */
    private static final C6835u0 f37499s;

    /* renamed from: q */
    private Object[] f37500q;

    /* renamed from: r */
    private int f37501r;

    static {
        C6835u0 c6835u0 = new C6835u0(new Object[0], 0);
        f37499s = c6835u0;
        c6835u0.mo34740o();
    }

    private C6835u0(Object[] objArr, int i11) {
        this.f37500q = objArr;
        this.f37501r = i11;
    }

    /* renamed from: e */
    private static Object[] m35146e(int i11) {
        return new Object[i11];
    }

    /* renamed from: g */
    public static C6835u0 m35147g() {
        return f37499s;
    }

    /* renamed from: j */
    private void m35148j(int i11) {
        if (i11 >= 0 && i11 < this.f37501r) {
        } else {
            throw new IndexOutOfBoundsException(m35149k(i11));
        }
    }

    /* renamed from: k */
    private String m35149k(int i11) {
        return "Index:" + i11 + ", Size:" + this.f37501r;
    }

    @Override // com.google.protobuf.AbstractC6790c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        m34739d();
        int i11 = this.f37501r;
        Object[] objArr = this.f37500q;
        if (i11 == objArr.length) {
            this.f37500q = Arrays.copyOf(objArr, ((i11 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f37500q;
        int i12 = this.f37501r;
        this.f37501r = i12 + 1;
        objArr2[i12] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i11) {
        m35148j(i11);
        return this.f37500q[i11];
    }

    @Override // com.google.protobuf.AbstractC6830s.e, com.google.protobuf.AbstractC6830s.d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public C6835u0 mo35124h(int i11) {
        if (i11 >= this.f37501r) {
            return new C6835u0(Arrays.copyOf(this.f37500q, i11), this.f37501r);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC6790c, java.util.AbstractList, java.util.List
    public Object remove(int i11) {
        m34739d();
        m35148j(i11);
        Object[] objArr = this.f37500q;
        Object obj = objArr[i11];
        if (i11 < this.f37501r - 1) {
            System.arraycopy(objArr, i11 + 1, objArr, i11, (r2 - i11) - 1);
        }
        this.f37501r--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i11, Object obj) {
        m34739d();
        m35148j(i11);
        Object[] objArr = this.f37500q;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f37501r;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i11, Object obj) {
        int i12;
        m34739d();
        if (i11 >= 0 && i11 <= (i12 = this.f37501r)) {
            Object[] objArr = this.f37500q;
            if (i12 < objArr.length) {
                System.arraycopy(objArr, i11, objArr, i11 + 1, i12 - i11);
            } else {
                Object[] m35146e = m35146e(((i12 * 3) / 2) + 1);
                System.arraycopy(this.f37500q, 0, m35146e, 0, i11);
                System.arraycopy(this.f37500q, i11, m35146e, i11 + 1, this.f37501r - i11);
                this.f37500q = m35146e;
            }
            this.f37500q[i11] = obj;
            this.f37501r++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m35149k(i11));
    }
}
