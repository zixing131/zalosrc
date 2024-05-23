package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.c8 */
/* loaded from: classes.dex */
public final class C5322c8 extends AbstractC5695y7 {

    /* renamed from: w */
    private static final Object[] f32307w;

    /* renamed from: x */
    static final C5322c8 f32308x;

    /* renamed from: r */
    final transient Object[] f32309r;

    /* renamed from: s */
    private final transient int f32310s;

    /* renamed from: t */
    final transient Object[] f32311t;

    /* renamed from: u */
    private final transient int f32312u;

    /* renamed from: v */
    private final transient int f32313v;

    static {
        Object[] objArr = new Object[0];
        f32307w = objArr;
        f32308x = new C5322c8(objArr, 0, objArr, 0, 0);
    }

    public C5322c8(Object[] objArr, int i11, Object[] objArr2, int i12, int i13) {
        this.f32309r = objArr;
        this.f32310s = i11;
        this.f32311t = objArr2;
        this.f32312u = i12;
        this.f32313v = i13;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5593s7, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object[] objArr = this.f32311t;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int m29527a = AbstractC5542p7.m29527a(obj.hashCode());
        while (true) {
            int i11 = m29527a & this.f32312u;
            Object obj2 = objArr[i11];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            m29527a = i11 + 1;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5593s7
    /* renamed from: d */
    final int mo28945d(Object[] objArr, int i11) {
        System.arraycopy(this.f32309r, 0, objArr, 0, this.f32313v);
        return this.f32313v;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5593s7
    /* renamed from: e */
    final int mo28946e() {
        return this.f32313v;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5593s7
    /* renamed from: g */
    public final int mo28947g() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5695y7, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f32310s;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return m30047l().listIterator(0);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5593s7
    /* renamed from: j */
    public final Object[] mo28948j() {
        return this.f32309r;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5695y7
    /* renamed from: m */
    final AbstractC5678x7 mo28969m() {
        return AbstractC5678x7.m30015l(this.f32309r, this.f32313v);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5695y7
    /* renamed from: p */
    final boolean mo28970p() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f32313v;
    }
}
