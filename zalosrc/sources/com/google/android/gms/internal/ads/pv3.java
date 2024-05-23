package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class pv3 extends ws3 implements RandomAccess, bv3, gw3 {

    /* renamed from: s */
    private static final pv3 f26353s;

    /* renamed from: q */
    private long[] f26354q;

    /* renamed from: r */
    private int f26355r;

    static {
        pv3 pv3Var = new pv3(new long[0], 0);
        f26353s = pv3Var;
        pv3Var.zzb();
    }

    private pv3(long[] jArr, int i11) {
        this.f26354q = jArr;
        this.f26355r = i11;
    }

    /* renamed from: g */
    public static pv3 m25555g() {
        return f26353s;
    }

    /* renamed from: k */
    private final String m25556k(int i11) {
        return "Index:" + i11 + ", Size:" + this.f26355r;
    }

    /* renamed from: l */
    private final void m25557l(int i11) {
        if (i11 >= 0 && i11 < this.f26355r) {
        } else {
            throw new IndexOutOfBoundsException(m25556k(i11));
        }
    }

    @Override // com.google.android.gms.internal.ads.cv3
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bv3 mo21159c(int i11) {
        if (i11 >= this.f26355r) {
            return new pv3(Arrays.copyOf(this.f26354q, i11), this.f26355r);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i11, Object obj) {
        int i12;
        long longValue = ((Long) obj).longValue();
        m27712d();
        if (i11 >= 0 && i11 <= (i12 = this.f26355r)) {
            long[] jArr = this.f26354q;
            if (i12 < jArr.length) {
                System.arraycopy(jArr, i11, jArr, i11 + 1, i12 - i11);
            } else {
                long[] jArr2 = new long[((i12 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i11);
                System.arraycopy(this.f26354q, i11, jArr2, i11 + 1, this.f26355r - i11);
                this.f26354q = jArr2;
            }
            this.f26354q[i11] = longValue;
            this.f26355r++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m25556k(i11));
    }

    @Override // com.google.android.gms.internal.ads.ws3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m27712d();
        dv3.m21550e(collection);
        if (!(collection instanceof pv3)) {
            return super.addAll(collection);
        }
        pv3 pv3Var = (pv3) collection;
        int i11 = pv3Var.f26355r;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f26355r;
        if (Integer.MAX_VALUE - i12 >= i11) {
            int i13 = i12 + i11;
            long[] jArr = this.f26354q;
            if (i13 > jArr.length) {
                this.f26354q = Arrays.copyOf(jArr, i13);
            }
            System.arraycopy(pv3Var.f26354q, 0, this.f26354q, this.f26355r, pv3Var.f26355r);
            this.f26355r = i13;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final long m25558e(int i11) {
        m25557l(i11);
        return this.f26354q[i11];
    }

    @Override // com.google.android.gms.internal.ads.ws3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pv3)) {
            return super.equals(obj);
        }
        pv3 pv3Var = (pv3) obj;
        if (this.f26355r != pv3Var.f26355r) {
            return false;
        }
        long[] jArr = pv3Var.f26354q;
        for (int i11 = 0; i11 < this.f26355r; i11++) {
            if (this.f26354q[i11] != jArr[i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i11) {
        m25557l(i11);
        return Long.valueOf(this.f26354q[i11]);
    }

    @Override // com.google.android.gms.internal.ads.ws3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.f26355r; i12++) {
            i11 = (i11 * 31) + dv3.m21548c(this.f26354q[i12]);
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i11 = this.f26355r;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f26354q[i12] == longValue) {
                return i12;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public final void m25559j(long j11) {
        m27712d();
        int i11 = this.f26355r;
        long[] jArr = this.f26354q;
        if (i11 == jArr.length) {
            long[] jArr2 = new long[((i11 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i11);
            this.f26354q = jArr2;
        }
        long[] jArr3 = this.f26354q;
        int i12 = this.f26355r;
        this.f26355r = i12 + 1;
        jArr3[i12] = j11;
    }

    @Override // com.google.android.gms.internal.ads.ws3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i11) {
        m27712d();
        m25557l(i11);
        long[] jArr = this.f26354q;
        long j11 = jArr[i11];
        if (i11 < this.f26355r - 1) {
            System.arraycopy(jArr, i11 + 1, jArr, i11, (r3 - i11) - 1);
        }
        this.f26355r--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j11);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i11, int i12) {
        m27712d();
        if (i12 >= i11) {
            long[] jArr = this.f26354q;
            System.arraycopy(jArr, i12, jArr, i11, this.f26355r - i12);
            this.f26355r -= i12 - i11;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i11, Object obj) {
        long longValue = ((Long) obj).longValue();
        m27712d();
        m25557l(i11);
        long[] jArr = this.f26354q;
        long j11 = jArr[i11];
        jArr[i11] = longValue;
        return Long.valueOf(j11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26355r;
    }

    @Override // com.google.android.gms.internal.ads.ws3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m25559j(((Long) obj).longValue());
        return true;
    }
}
