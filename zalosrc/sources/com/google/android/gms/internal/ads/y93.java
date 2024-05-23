package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class y93 extends h83 {

    /* renamed from: r */
    final transient Object f30841r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y93(Object obj) {
        obj.getClass();
        this.f30841r = obj;
    }

    @Override // com.google.android.gms.internal.ads.x73, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f30841r.equals(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.x73
    /* renamed from: d */
    public final int mo20836d(Object[] objArr, int i11) {
        objArr[i11] = this.f30841r;
        return i11 + 1;
    }

    @Override // com.google.android.gms.internal.ads.h83, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f30841r.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new k83(this.f30841r);
    }

    @Override // com.google.android.gms.internal.ads.h83, com.google.android.gms.internal.ads.x73
    /* renamed from: j */
    public final c83 mo20837j() {
        return c83.m20833x(this.f30841r);
    }

    @Override // com.google.android.gms.internal.ads.h83, com.google.android.gms.internal.ads.x73
    /* renamed from: k */
    public final ba3 mo20838k() {
        return new k83(this.f30841r);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return '[' + this.f30841r.toString() + ']';
    }
}
