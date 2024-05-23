package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class uu3 extends ws3 implements RandomAccess, yu3, gw3 {

    /* renamed from: s */
    private static final uu3 f29049s;

    /* renamed from: q */
    private int[] f29050q;

    /* renamed from: r */
    private int f29051r;

    static {
        uu3 uu3Var = new uu3(new int[0], 0);
        f29049s = uu3Var;
        uu3Var.zzb();
    }

    private uu3(int[] iArr, int i11) {
        this.f29050q = iArr;
        this.f29051r = i11;
    }

    /* renamed from: g */
    public static uu3 m27063g() {
        return f29049s;
    }

    /* renamed from: j */
    private final String m27064j(int i11) {
        return "Index:" + i11 + ", Size:" + this.f29051r;
    }

    /* renamed from: k */
    private final void m27065k(int i11) {
        if (i11 >= 0 && i11 < this.f29051r) {
        } else {
            throw new IndexOutOfBoundsException(m27064j(i11));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i11, Object obj) {
        int i12;
        int intValue = ((Integer) obj).intValue();
        m27712d();
        if (i11 >= 0 && i11 <= (i12 = this.f29051r)) {
            int[] iArr = this.f29050q;
            if (i12 < iArr.length) {
                System.arraycopy(iArr, i11, iArr, i11 + 1, i12 - i11);
            } else {
                int[] iArr2 = new int[((i12 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i11);
                System.arraycopy(this.f29050q, i11, iArr2, i11 + 1, this.f29051r - i11);
                this.f29050q = iArr2;
            }
            this.f29050q[i11] = intValue;
            this.f29051r++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m27064j(i11));
    }

    @Override // com.google.android.gms.internal.ads.ws3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m27712d();
        dv3.m21550e(collection);
        if (!(collection instanceof uu3)) {
            return super.addAll(collection);
        }
        uu3 uu3Var = (uu3) collection;
        int i11 = uu3Var.f29051r;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f29051r;
        if (Integer.MAX_VALUE - i12 >= i11) {
            int i13 = i12 + i11;
            int[] iArr = this.f29050q;
            if (i13 > iArr.length) {
                this.f29050q = Arrays.copyOf(iArr, i13);
            }
            System.arraycopy(uu3Var.f29050q, 0, this.f29050q, this.f29051r, uu3Var.f29051r);
            this.f29051r = i13;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.android.gms.internal.ads.cv3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final yu3 mo21159c(int i11) {
        if (i11 >= this.f29051r) {
            return new uu3(Arrays.copyOf(this.f29050q, i11), this.f29051r);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final int m27067e(int i11) {
        m27065k(i11);
        return this.f29050q[i11];
    }

    @Override // com.google.android.gms.internal.ads.ws3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uu3)) {
            return super.equals(obj);
        }
        uu3 uu3Var = (uu3) obj;
        if (this.f29051r != uu3Var.f29051r) {
            return false;
        }
        int[] iArr = uu3Var.f29050q;
        for (int i11 = 0; i11 < this.f29051r; i11++) {
            if (this.f29050q[i11] != iArr[i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.yu3
    /* renamed from: f */
    public final void mo27068f(int i11) {
        m27712d();
        int i12 = this.f29051r;
        int[] iArr = this.f29050q;
        if (i12 == iArr.length) {
            int[] iArr2 = new int[((i12 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i12);
            this.f29050q = iArr2;
        }
        int[] iArr3 = this.f29050q;
        int i13 = this.f29051r;
        this.f29051r = i13 + 1;
        iArr3[i13] = i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i11) {
        m27065k(i11);
        return Integer.valueOf(this.f29050q[i11]);
    }

    @Override // com.google.android.gms.internal.ads.ws3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.f29051r; i12++) {
            i11 = (i11 * 31) + this.f29050q[i12];
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i11 = this.f29051r;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f29050q[i12] == intValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.ws3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i11) {
        m27712d();
        m27065k(i11);
        int[] iArr = this.f29050q;
        int i12 = iArr[i11];
        if (i11 < this.f29051r - 1) {
            System.arraycopy(iArr, i11 + 1, iArr, i11, (r2 - i11) - 1);
        }
        this.f29051r--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i11, int i12) {
        m27712d();
        if (i12 >= i11) {
            int[] iArr = this.f29050q;
            System.arraycopy(iArr, i12, iArr, i11, this.f29051r - i12);
            this.f29051r -= i12 - i11;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i11, Object obj) {
        int intValue = ((Integer) obj).intValue();
        m27712d();
        m27065k(i11);
        int[] iArr = this.f29050q;
        int i12 = iArr[i11];
        iArr[i11] = intValue;
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29051r;
    }

    @Override // com.google.android.gms.internal.ads.ws3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo27068f(((Integer) obj).intValue());
        return true;
    }
}
