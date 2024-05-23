package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.d8 */
/* loaded from: classes2.dex */
public final class C5339d8 extends AbstractC5695y7 {

    /* renamed from: r */
    final transient Object f32334r;

    public C5339d8(Object obj) {
        obj.getClass();
        this.f32334r = obj;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5593s7, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f32334r.equals(obj);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5593s7
    /* renamed from: d */
    final int mo28945d(Object[] objArr, int i11) {
        objArr[0] = this.f32334r;
        return 1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5695y7, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f32334r.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new C5712z7(this.f32334r);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f32334r.toString() + "]";
    }
}
