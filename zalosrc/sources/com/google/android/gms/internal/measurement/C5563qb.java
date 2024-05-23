package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.qb */
/* loaded from: classes2.dex */
public final class C5563qb extends AbstractList implements RandomAccess, InterfaceC5341da {

    /* renamed from: p */
    private final InterfaceC5341da f32750p;

    public C5563qb(InterfaceC5341da interfaceC5341da) {
        this.f32750p = interfaceC5341da;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5341da
    /* renamed from: N */
    public final void mo28991N(AbstractC5679x8 abstractC5679x8) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i11) {
        return ((C5324ca) this.f32750p).get(i11);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C5546pb(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i11) {
        return new C5529ob(this, i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f32750p.size();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5341da
    public final InterfaceC5341da zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5341da
    public final Object zzf(int i11) {
        return this.f32750p.zzf(i11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5341da
    public final List zzh() {
        return this.f32750p.zzh();
    }
}
