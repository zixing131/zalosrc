package com.google.protobuf;

import com.google.protobuf.AbstractC6830s;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.r */
/* loaded from: classes3.dex */
final class C6828r extends AbstractC6790c implements AbstractC6830s.d, RandomAccess, InterfaceC6829r0 {

    /* renamed from: s */
    private static final C6828r f37471s;

    /* renamed from: q */
    private int[] f37472q;

    /* renamed from: r */
    private int f37473r;

    static {
        C6828r c6828r = new C6828r(new int[0], 0);
        f37471s = c6828r;
        c6828r.mo34740o();
    }

    private C6828r(int[] iArr, int i11) {
        this.f37472q = iArr;
        this.f37473r = i11;
    }

    /* renamed from: j */
    private void m35117j(int i11, int i12) {
        int i13;
        m34739d();
        if (i11 >= 0 && i11 <= (i13 = this.f37473r)) {
            int[] iArr = this.f37472q;
            if (i13 < iArr.length) {
                System.arraycopy(iArr, i11, iArr, i11 + 1, i13 - i11);
            } else {
                int[] iArr2 = new int[((i13 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i11);
                System.arraycopy(this.f37472q, i11, iArr2, i11 + 1, this.f37473r - i11);
                this.f37472q = iArr2;
            }
            this.f37472q[i11] = i12;
            this.f37473r++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m35120n(i11));
    }

    /* renamed from: k */
    public static C6828r m35118k() {
        return f37471s;
    }

    /* renamed from: l */
    private void m35119l(int i11) {
        if (i11 >= 0 && i11 < this.f37473r) {
        } else {
            throw new IndexOutOfBoundsException(m35120n(i11));
        }
    }

    /* renamed from: n */
    private String m35120n(int i11) {
        return "Index:" + i11 + ", Size:" + this.f37473r;
    }

    @Override // com.google.protobuf.AbstractC6830s.d
    /* renamed from: T */
    public void mo35121T(int i11) {
        m34739d();
        int i12 = this.f37473r;
        int[] iArr = this.f37472q;
        if (i12 == iArr.length) {
            int[] iArr2 = new int[((i12 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i12);
            this.f37472q = iArr2;
        }
        int[] iArr3 = this.f37472q;
        int i13 = this.f37473r;
        this.f37473r = i13 + 1;
        iArr3[i13] = i11;
    }

    @Override // com.google.protobuf.AbstractC6790c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        m34739d();
        AbstractC6830s.m35129a(collection);
        if (!(collection instanceof C6828r)) {
            return super.addAll(collection);
        }
        C6828r c6828r = (C6828r) collection;
        int i11 = c6828r.f37473r;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f37473r;
        if (Integer.MAX_VALUE - i12 >= i11) {
            int i13 = i12 + i11;
            int[] iArr = this.f37472q;
            if (i13 > iArr.length) {
                this.f37472q = Arrays.copyOf(iArr, i13);
            }
            System.arraycopy(c6828r.f37472q, 0, this.f37472q, this.f37473r, c6828r.f37473r);
            this.f37473r = i13;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void add(int i11, Integer num) {
        m35117j(i11, num.intValue());
    }

    @Override // com.google.protobuf.AbstractC6790c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6828r)) {
            return super.equals(obj);
        }
        C6828r c6828r = (C6828r) obj;
        if (this.f37473r != c6828r.f37473r) {
            return false;
        }
        int[] iArr = c6828r.f37472q;
        for (int i11 = 0; i11 < this.f37473r; i11++) {
            if (this.f37472q[i11] != iArr[i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.AbstractC6790c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        mo35121T(num.intValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractC6830s.d
    public int getInt(int i11) {
        m35119l(i11);
        return this.f37472q[i11];
    }

    @Override // com.google.protobuf.AbstractC6790c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.f37473r; i12++) {
            i11 = (i11 * 31) + this.f37472q[i12];
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f37472q[i11] == intValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Integer get(int i11) {
        return Integer.valueOf(getInt(i11));
    }

    @Override // com.google.protobuf.AbstractC6790c, java.util.AbstractList, java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Integer remove(int i11) {
        m34739d();
        m35119l(i11);
        int[] iArr = this.f37472q;
        int i12 = iArr[i11];
        if (i11 < this.f37473r - 1) {
            System.arraycopy(iArr, i11 + 1, iArr, i11, (r2 - i11) - 1);
        }
        this.f37473r--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Integer set(int i11, Integer num) {
        return Integer.valueOf(m35128s(i11, num.intValue()));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i11, int i12) {
        m34739d();
        if (i12 >= i11) {
            int[] iArr = this.f37472q;
            System.arraycopy(iArr, i12, iArr, i11, this.f37473r - i12);
            this.f37473r -= i12 - i11;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public int m35128s(int i11, int i12) {
        m34739d();
        m35119l(i11);
        int[] iArr = this.f37472q;
        int i13 = iArr[i11];
        iArr[i11] = i12;
        return i13;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f37473r;
    }

    @Override // com.google.protobuf.AbstractC6830s.e, com.google.protobuf.AbstractC6830s.d
    /* renamed from: h */
    public AbstractC6830s.d mo35124h(int i11) {
        if (i11 >= this.f37473r) {
            return new C6828r(Arrays.copyOf(this.f37472q, i11), this.f37473r);
        }
        throw new IllegalArgumentException();
    }
}
