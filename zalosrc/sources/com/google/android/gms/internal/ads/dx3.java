package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class dx3 extends AbstractList implements RandomAccess, hv3 {

    /* renamed from: p */
    private final hv3 f19442p;

    public dx3(hv3 hv3Var) {
        this.f19442p = hv3Var;
    }

    @Override // com.google.android.gms.internal.ads.hv3
    /* renamed from: R */
    public final void mo21565R(mt3 mt3Var) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i11) {
        return ((gv3) this.f19442p).get(i11);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new cx3(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i11) {
        return new bx3(this, i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19442p.size();
    }

    @Override // com.google.android.gms.internal.ads.hv3
    public final hv3 zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.hv3
    public final Object zzf(int i11) {
        return this.f19442p.zzf(i11);
    }

    @Override // com.google.android.gms.internal.ads.hv3
    public final List zzh() {
        return this.f19442p.zzh();
    }
}
