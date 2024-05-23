package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class t63 extends AbstractCollection {

    /* renamed from: p */
    final Object f28237p;

    /* renamed from: q */
    Collection f28238q;

    /* renamed from: r */
    final t63 f28239r;

    /* renamed from: s */
    final Collection f28240s;

    /* renamed from: t */
    final /* synthetic */ w63 f28241t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t63(w63 w63Var, Object obj, Collection collection, t63 t63Var) {
        Collection collection2;
        this.f28241t = w63Var;
        this.f28237p = obj;
        this.f28238q = collection;
        this.f28239r = t63Var;
        if (t63Var == null) {
            collection2 = null;
        } else {
            collection2 = t63Var.f28238q;
        }
        this.f28240s = collection2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        zzb();
        boolean isEmpty = this.f28238q.isEmpty();
        boolean add = this.f28238q.add(obj);
        if (add) {
            w63.m27538k(this.f28241t);
            if (isEmpty) {
                m26575d();
                return true;
            }
            return add;
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f28238q.addAll(collection);
        if (addAll) {
            w63.m27540m(this.f28241t, this.f28238q.size() - size);
            if (size == 0) {
                m26575d();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f28238q.clear();
        w63.m27541n(this.f28241t, size);
        m26576e();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        zzb();
        return this.f28238q.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.f28238q.containsAll(collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m26575d() {
        Map map;
        t63 t63Var = this.f28239r;
        if (t63Var == null) {
            map = this.f28241t.f29832s;
            map.put(this.f28237p, this.f28238q);
        } else {
            t63Var.m26575d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m26576e() {
        Map map;
        t63 t63Var = this.f28239r;
        if (t63Var != null) {
            t63Var.m26576e();
        } else if (this.f28238q.isEmpty()) {
            map = this.f28241t.f29832s;
            map.remove(this.f28237p);
        }
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.f28238q.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.f28238q.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzb();
        return new s63(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        zzb();
        boolean remove = this.f28238q.remove(obj);
        if (remove) {
            w63.m27539l(this.f28241t);
            m26576e();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f28238q.removeAll(collection);
        if (removeAll) {
            w63.m27540m(this.f28241t, this.f28238q.size() - size);
            m26576e();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.f28238q.retainAll(collection);
        if (retainAll) {
            w63.m27540m(this.f28241t, this.f28238q.size() - size);
            m26576e();
        }
        return retainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.f28238q.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.f28238q.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb() {
        Map map;
        t63 t63Var = this.f28239r;
        if (t63Var != null) {
            t63Var.zzb();
            if (this.f28239r.f28238q != this.f28240s) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f28238q.isEmpty()) {
            map = this.f28241t.f29832s;
            Collection collection = (Collection) map.get(this.f28237p);
            if (collection != null) {
                this.f28238q = collection;
            }
        }
    }
}
