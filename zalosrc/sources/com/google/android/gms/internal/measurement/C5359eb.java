package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.eb */
/* loaded from: classes.dex */
final class C5359eb extends AbstractC5424i8 implements RandomAccess {

    /* renamed from: s */
    private static final C5359eb f32356s = new C5359eb(new Object[0], 0, false);

    /* renamed from: q */
    private Object[] f32357q;

    /* renamed from: r */
    private int f32358r;

    private C5359eb(Object[] objArr, int i11, boolean z11) {
        super(z11);
        this.f32357q = objArr;
        this.f32358r = i11;
    }

    /* renamed from: e */
    public static C5359eb m29093e() {
        return f32356s;
    }

    /* renamed from: g */
    private final String m29094g(int i11) {
        return "Index:" + i11 + ", Size:" + this.f32358r;
    }

    /* renamed from: j */
    private final void m29095j(int i11) {
        if (i11 >= 0 && i11 < this.f32358r) {
        } else {
            throw new IndexOutOfBoundsException(m29094g(i11));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        m29211d();
        if (i11 >= 0 && i11 <= (i12 = this.f32358r)) {
            Object[] objArr = this.f32357q;
            if (i12 < objArr.length) {
                System.arraycopy(objArr, i11, objArr, i11 + 1, i12 - i11);
            } else {
                Object[] objArr2 = new Object[((i12 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i11);
                System.arraycopy(this.f32357q, i11, objArr2, i11 + 1, this.f32358r - i11);
                this.f32357q = objArr2;
            }
            this.f32357q[i11] = obj;
            this.f32358r++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m29094g(i11));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5714z9
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ InterfaceC5714z9 mo28992c(int i11) {
        if (i11 >= this.f32358r) {
            return new C5359eb(Arrays.copyOf(this.f32357q, i11), this.f32358r, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        m29095j(i11);
        return this.f32357q[i11];
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5424i8, java.util.AbstractList, java.util.List
    public final Object remove(int i11) {
        m29211d();
        m29095j(i11);
        Object[] objArr = this.f32357q;
        Object obj = objArr[i11];
        if (i11 < this.f32358r - 1) {
            System.arraycopy(objArr, i11 + 1, objArr, i11, (r2 - i11) - 1);
        }
        this.f32358r--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i11, Object obj) {
        m29211d();
        m29095j(i11);
        Object[] objArr = this.f32357q;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f32358r;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5424i8, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m29211d();
        int i11 = this.f32358r;
        Object[] objArr = this.f32357q;
        if (i11 == objArr.length) {
            this.f32357q = Arrays.copyOf(objArr, ((i11 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f32357q;
        int i12 = this.f32358r;
        this.f32358r = i12 + 1;
        objArr2[i12] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
