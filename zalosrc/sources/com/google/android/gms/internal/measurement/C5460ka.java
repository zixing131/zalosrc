package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.ka */
/* loaded from: classes2.dex */
final class C5460ka extends AbstractC5424i8 implements RandomAccess, InterfaceC5697y9, InterfaceC5325cb {

    /* renamed from: s */
    private static final C5460ka f32461s = new C5460ka(new long[0], 0, false);

    /* renamed from: q */
    private long[] f32462q;

    /* renamed from: r */
    private int f32463r;

    private C5460ka(long[] jArr, int i11, boolean z11) {
        super(z11);
        this.f32462q = jArr;
        this.f32463r = i11;
    }

    /* renamed from: e */
    public static C5460ka m29363e() {
        return f32461s;
    }

    /* renamed from: j */
    private final String m29364j(int i11) {
        return "Index:" + i11 + ", Size:" + this.f32463r;
    }

    /* renamed from: k */
    private final void m29365k(int i11) {
        if (i11 >= 0 && i11 < this.f32463r) {
        } else {
            throw new IndexOutOfBoundsException(m29364j(i11));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5697y9
    /* renamed from: a */
    public final long mo29366a(int i11) {
        m29365k(i11);
        return this.f32462q[i11];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i11, Object obj) {
        int i12;
        long longValue = ((Long) obj).longValue();
        m29211d();
        if (i11 >= 0 && i11 <= (i12 = this.f32463r)) {
            long[] jArr = this.f32462q;
            if (i12 < jArr.length) {
                System.arraycopy(jArr, i11, jArr, i11 + 1, i12 - i11);
            } else {
                long[] jArr2 = new long[((i12 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i11);
                System.arraycopy(this.f32462q, i11, jArr2, i11 + 1, this.f32463r - i11);
                this.f32462q = jArr2;
            }
            this.f32462q[i11] = longValue;
            this.f32463r++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m29364j(i11));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5424i8, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m29211d();
        byte[] bArr = AbstractC5290aa.f32259d;
        collection.getClass();
        if (!(collection instanceof C5460ka)) {
            return super.addAll(collection);
        }
        C5460ka c5460ka = (C5460ka) collection;
        int i11 = c5460ka.f32463r;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f32463r;
        if (Integer.MAX_VALUE - i12 >= i11) {
            int i13 = i12 + i11;
            long[] jArr = this.f32462q;
            if (i13 > jArr.length) {
                this.f32462q = Arrays.copyOf(jArr, i13);
            }
            System.arraycopy(c5460ka.f32462q, 0, this.f32462q, this.f32463r, c5460ka.f32463r);
            this.f32463r = i13;
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

    @Override // com.google.android.gms.internal.measurement.AbstractC5424i8, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5460ka)) {
            return super.equals(obj);
        }
        C5460ka c5460ka = (C5460ka) obj;
        if (this.f32463r != c5460ka.f32463r) {
            return false;
        }
        long[] jArr = c5460ka.f32462q;
        for (int i11 = 0; i11 < this.f32463r; i11++) {
            if (this.f32462q[i11] != jArr[i11]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public final void m29367g(long j11) {
        m29211d();
        int i11 = this.f32463r;
        long[] jArr = this.f32462q;
        if (i11 == jArr.length) {
            long[] jArr2 = new long[((i11 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i11);
            this.f32462q = jArr2;
        }
        long[] jArr3 = this.f32462q;
        int i12 = this.f32463r;
        this.f32463r = i12 + 1;
        jArr3[i12] = j11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i11) {
        m29365k(i11);
        return Long.valueOf(this.f32462q[i11]);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5424i8, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.f32463r; i12++) {
            long j11 = this.f32462q[i12];
            byte[] bArr = AbstractC5290aa.f32259d;
            i11 = (i11 * 31) + ((int) (j11 ^ (j11 >>> 32)));
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i11 = this.f32463r;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f32462q[i12] == longValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5424i8, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i11) {
        m29211d();
        m29365k(i11);
        long[] jArr = this.f32462q;
        long j11 = jArr[i11];
        if (i11 < this.f32463r - 1) {
            System.arraycopy(jArr, i11 + 1, jArr, i11, (r3 - i11) - 1);
        }
        this.f32463r--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j11);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i11, int i12) {
        m29211d();
        if (i12 >= i11) {
            long[] jArr = this.f32462q;
            System.arraycopy(jArr, i12, jArr, i11, this.f32463r - i12);
            this.f32463r -= i12 - i11;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i11, Object obj) {
        long longValue = ((Long) obj).longValue();
        m29211d();
        m29365k(i11);
        long[] jArr = this.f32462q;
        long j11 = jArr[i11];
        jArr[i11] = longValue;
        return Long.valueOf(j11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f32463r;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5714z9
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final InterfaceC5697y9 mo28992c(int i11) {
        if (i11 >= this.f32463r) {
            return new C5460ka(Arrays.copyOf(this.f32462q, i11), this.f32463r, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5424i8, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m29367g(((Long) obj).longValue());
        return true;
    }
}
