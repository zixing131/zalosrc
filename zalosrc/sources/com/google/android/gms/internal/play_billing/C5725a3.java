package com.google.android.gms.internal.play_billing;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.play_billing.a3 */
/* loaded from: classes2.dex */
final class C5725a3 implements ListIterator {

    /* renamed from: p */
    final ListIterator f33234p;

    /* renamed from: q */
    final /* synthetic */ int f33235q;

    /* renamed from: r */
    final /* synthetic */ C5739c3 f33236r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5725a3(C5739c3 c5739c3, int i11) {
        InterfaceC5822q1 interfaceC5822q1;
        this.f33236r = c5739c3;
        this.f33235q = i11;
        interfaceC5822q1 = c5739c3.f33247p;
        this.f33234p = interfaceC5822q1.listIterator(i11);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f33234p.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f33234p.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f33234p.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f33234p.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f33234p.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f33234p.previousIndex();
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
