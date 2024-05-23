package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.play_billing.c3 */
/* loaded from: classes2.dex */
public final class C5739c3 extends AbstractList implements RandomAccess, InterfaceC5822q1 {

    /* renamed from: p */
    private final InterfaceC5822q1 f33247p;

    public C5739c3(InterfaceC5822q1 interfaceC5822q1) {
        this.f33247p = interfaceC5822q1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i11) {
        return ((C5816p1) this.f33247p).get(i11);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C5732b3(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i11) {
        return new C5725a3(this, i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f33247p.size();
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5822q1
    public final InterfaceC5822q1 zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5822q1
    public final Object zzf(int i11) {
        return this.f33247p.zzf(i11);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5822q1
    public final List zzh() {
        return this.f33247p.zzh();
    }
}
