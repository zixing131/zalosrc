package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class k63 implements Iterator {

    /* renamed from: p */
    Map.Entry f23163p;

    /* renamed from: q */
    final /* synthetic */ Iterator f23164q;

    /* renamed from: r */
    final /* synthetic */ l63 f23165r;

    public k63(l63 l63Var, Iterator it) {
        this.f23165r = l63Var;
        this.f23164q = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23164q.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f23164q.next();
        this.f23163p = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z11;
        if (this.f23163p != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        j53.m23539i(z11, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f23163p.getValue();
        this.f23164q.remove();
        w63.m27541n(this.f23165r.f23763q, collection.size());
        collection.clear();
        this.f23163p = null;
    }
}
