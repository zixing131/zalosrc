package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.u9 */
/* loaded from: classes.dex */
final class C5629u9 extends AbstractC5424i8 implements RandomAccess, InterfaceC5680x9, InterfaceC5325cb {

    /* renamed from: s */
    private static final C5629u9 f32837s = new C5629u9(new int[0], 0, false);

    /* renamed from: q */
    private int[] f32838q;

    /* renamed from: r */
    private int f32839r;

    private C5629u9(int[] iArr, int i11, boolean z11) {
        super(z11);
        this.f32838q = iArr;
        this.f32839r = i11;
    }

    /* renamed from: g */
    public static C5629u9 m29681g() {
        return f32837s;
    }

    /* renamed from: j */
    private final String m29682j(int i11) {
        return "Index:" + i11 + ", Size:" + this.f32839r;
    }

    /* renamed from: k */
    private final void m29683k(int i11) {
        if (i11 >= 0 && i11 < this.f32839r) {
        } else {
            throw new IndexOutOfBoundsException(m29682j(i11));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i11, Object obj) {
        int i12;
        int intValue = ((Integer) obj).intValue();
        m29211d();
        if (i11 >= 0 && i11 <= (i12 = this.f32839r)) {
            int[] iArr = this.f32838q;
            if (i12 < iArr.length) {
                System.arraycopy(iArr, i11, iArr, i11 + 1, i12 - i11);
            } else {
                int[] iArr2 = new int[((i12 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i11);
                System.arraycopy(this.f32838q, i11, iArr2, i11 + 1, this.f32839r - i11);
                this.f32838q = iArr2;
            }
            this.f32838q[i11] = intValue;
            this.f32839r++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m29682j(i11));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5424i8, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m29211d();
        byte[] bArr = AbstractC5290aa.f32259d;
        collection.getClass();
        if (!(collection instanceof C5629u9)) {
            return super.addAll(collection);
        }
        C5629u9 c5629u9 = (C5629u9) collection;
        int i11 = c5629u9.f32839r;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f32839r;
        if (Integer.MAX_VALUE - i12 >= i11) {
            int i13 = i12 + i11;
            int[] iArr = this.f32838q;
            if (i13 > iArr.length) {
                this.f32838q = Arrays.copyOf(iArr, i13);
            }
            System.arraycopy(c5629u9.f32838q, 0, this.f32838q, this.f32839r, c5629u9.f32839r);
            this.f32839r = i13;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5714z9
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final InterfaceC5680x9 mo28992c(int i11) {
        if (i11 >= this.f32839r) {
            return new C5629u9(Arrays.copyOf(this.f32838q, i11), this.f32839r, true);
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
    public final int m29685e(int i11) {
        m29683k(i11);
        return this.f32838q[i11];
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5424i8, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5629u9)) {
            return super.equals(obj);
        }
        C5629u9 c5629u9 = (C5629u9) obj;
        if (this.f32839r != c5629u9.f32839r) {
            return false;
        }
        int[] iArr = c5629u9.f32838q;
        for (int i11 = 0; i11 < this.f32839r; i11++) {
            if (this.f32838q[i11] != iArr[i11]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void m29686f(int i11) {
        m29211d();
        int i12 = this.f32839r;
        int[] iArr = this.f32838q;
        if (i12 == iArr.length) {
            int[] iArr2 = new int[((i12 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i12);
            this.f32838q = iArr2;
        }
        int[] iArr3 = this.f32838q;
        int i13 = this.f32839r;
        this.f32839r = i13 + 1;
        iArr3[i13] = i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i11) {
        m29683k(i11);
        return Integer.valueOf(this.f32838q[i11]);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5424i8, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.f32839r; i12++) {
            i11 = (i11 * 31) + this.f32838q[i12];
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i11 = this.f32839r;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f32838q[i12] == intValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5424i8, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i11) {
        m29211d();
        m29683k(i11);
        int[] iArr = this.f32838q;
        int i12 = iArr[i11];
        if (i11 < this.f32839r - 1) {
            System.arraycopy(iArr, i11 + 1, iArr, i11, (r2 - i11) - 1);
        }
        this.f32839r--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i11, int i12) {
        m29211d();
        if (i12 >= i11) {
            int[] iArr = this.f32838q;
            System.arraycopy(iArr, i12, iArr, i11, this.f32839r - i12);
            this.f32839r -= i12 - i11;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i11, Object obj) {
        int intValue = ((Integer) obj).intValue();
        m29211d();
        m29683k(i11);
        int[] iArr = this.f32838q;
        int i12 = iArr[i11];
        iArr[i11] = intValue;
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f32839r;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5424i8, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m29686f(((Integer) obj).intValue());
        return true;
    }
}
