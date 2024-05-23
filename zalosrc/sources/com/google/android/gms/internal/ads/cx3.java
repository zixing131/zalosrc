package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes2.dex */
final class cx3 implements Iterator {

    /* renamed from: p */
    final Iterator f19028p;

    /* renamed from: q */
    final /* synthetic */ dx3 f19029q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public cx3(dx3 dx3Var) {
        hv3 hv3Var;
        this.f19029q = dx3Var;
        hv3Var = dx3Var.f19442p;
        this.f19028p = hv3Var.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19028p.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f19028p.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
