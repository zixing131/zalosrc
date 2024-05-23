package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
final class iw3 extends ws3 implements RandomAccess {

    /* renamed from: s */
    private static final iw3 f22521s;

    /* renamed from: q */
    private Object[] f22522q;

    /* renamed from: r */
    private int f22523r;

    static {
        iw3 iw3Var = new iw3(new Object[0], 0);
        f22521s = iw3Var;
        iw3Var.zzb();
    }

    private iw3(Object[] objArr, int i11) {
        this.f22522q = objArr;
        this.f22523r = i11;
    }

    /* renamed from: e */
    public static iw3 m23427e() {
        return f22521s;
    }

    /* renamed from: g */
    private final String m23428g(int i11) {
        return "Index:" + i11 + ", Size:" + this.f22523r;
    }

    /* renamed from: j */
    private final void m23429j(int i11) {
        if (i11 >= 0 && i11 < this.f22523r) {
        } else {
            throw new IndexOutOfBoundsException(m23428g(i11));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        m27712d();
        if (i11 >= 0 && i11 <= (i12 = this.f22523r)) {
            Object[] objArr = this.f22522q;
            if (i12 < objArr.length) {
                System.arraycopy(objArr, i11, objArr, i11 + 1, i12 - i11);
            } else {
                Object[] objArr2 = new Object[((i12 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i11);
                System.arraycopy(this.f22522q, i11, objArr2, i11 + 1, this.f22523r - i11);
                this.f22522q = objArr2;
            }
            this.f22522q[i11] = obj;
            this.f22523r++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m23428g(i11));
    }

    @Override // com.google.android.gms.internal.ads.cv3
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ cv3 mo21159c(int i11) {
        if (i11 >= this.f22523r) {
            return new iw3(Arrays.copyOf(this.f22522q, i11), this.f22523r);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        m23429j(i11);
        return this.f22522q[i11];
    }

    @Override // com.google.android.gms.internal.ads.ws3, java.util.AbstractList, java.util.List
    public final Object remove(int i11) {
        m27712d();
        m23429j(i11);
        Object[] objArr = this.f22522q;
        Object obj = objArr[i11];
        if (i11 < this.f22523r - 1) {
            System.arraycopy(objArr, i11 + 1, objArr, i11, (r2 - i11) - 1);
        }
        this.f22523r--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i11, Object obj) {
        m27712d();
        m23429j(i11);
        Object[] objArr = this.f22522q;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f22523r;
    }

    @Override // com.google.android.gms.internal.ads.ws3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m27712d();
        int i11 = this.f22523r;
        Object[] objArr = this.f22522q;
        if (i11 == objArr.length) {
            this.f22522q = Arrays.copyOf(objArr, ((i11 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f22522q;
        int i12 = this.f22523r;
        this.f22523r = i12 + 1;
        objArr2[i12] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
