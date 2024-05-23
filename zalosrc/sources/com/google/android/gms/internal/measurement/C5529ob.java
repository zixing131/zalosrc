package com.google.android.gms.internal.measurement;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.measurement.ob */
/* loaded from: classes2.dex */
final class C5529ob implements ListIterator {

    /* renamed from: p */
    final ListIterator f32704p;

    /* renamed from: q */
    final /* synthetic */ int f32705q;

    /* renamed from: r */
    final /* synthetic */ C5563qb f32706r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5529ob(C5563qb c5563qb, int i11) {
        InterfaceC5341da interfaceC5341da;
        this.f32706r = c5563qb;
        this.f32705q = i11;
        interfaceC5341da = c5563qb.f32750p;
        this.f32704p = interfaceC5341da.listIterator(i11);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f32704p.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f32704p.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f32704p.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f32704p.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f32704p.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f32704p.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
