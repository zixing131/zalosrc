package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class s63 implements Iterator {

    /* renamed from: p */
    final Iterator f27572p;

    /* renamed from: q */
    final Collection f27573q;

    /* renamed from: r */
    final /* synthetic */ t63 f27574r;

    public s63(t63 t63Var, Iterator it) {
        this.f27574r = t63Var;
        this.f27573q = t63Var.f28238q;
        this.f27572p = it;
    }

    /* renamed from: a */
    public final void m26253a() {
        this.f27574r.zzb();
        if (this.f27574r.f28238q == this.f27573q) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        m26253a();
        return this.f27572p.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        m26253a();
        return this.f27572p.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f27572p.remove();
        w63.m27539l(this.f27574r.f28241t);
        this.f27574r.m26576e();
    }

    public s63(t63 t63Var) {
        Iterator it;
        this.f27574r = t63Var;
        Collection collection = t63Var.f28238q;
        this.f27573q = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f27572p = it;
    }
}
