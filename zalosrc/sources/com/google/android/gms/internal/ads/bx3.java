package com.google.android.gms.internal.ads;

import java.util.ListIterator;

/* loaded from: classes2.dex */
final class bx3 implements ListIterator {

    /* renamed from: p */
    final ListIterator f18042p;

    /* renamed from: q */
    final /* synthetic */ int f18043q;

    /* renamed from: r */
    final /* synthetic */ dx3 f18044r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bx3(dx3 dx3Var, int i11) {
        hv3 hv3Var;
        this.f18044r = dx3Var;
        this.f18043q = i11;
        hv3Var = dx3Var.f19442p;
        this.f18042p = hv3Var.listIterator(i11);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f18042p.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f18042p.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f18042p.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f18042p.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f18042p.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f18042p.previousIndex();
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
