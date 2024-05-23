package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes2.dex */
abstract class z93 implements Iterator {

    /* renamed from: p */
    final Iterator f31422p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z93(Iterator it) {
        it.getClass();
        this.f31422p = it;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract Object mo25101a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f31422p.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return mo25101a(this.f31422p.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f31422p.remove();
    }
}
