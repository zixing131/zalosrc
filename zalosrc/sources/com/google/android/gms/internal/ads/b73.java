package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class b73 extends AbstractCollection {

    /* renamed from: p */
    final Collection f17651p;

    /* renamed from: q */
    final k53 f17652q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b73(Collection collection, k53 k53Var) {
        this.f17651p = collection;
        this.f17652q = k53Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        j53.m23535e(this.f17652q.zza(obj));
        return this.f17651p.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            j53.m23535e(this.f17652q.zza(it.next()));
        }
        return this.f17651p.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        i83.m23140a(this.f17651p, this.f17652q);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (c73.m20815a(this.f17651p, obj)) {
            return this.f17652q.zza(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        Collection collection = this.f17651p;
        k53 k53Var = this.f17652q;
        Iterator it = collection.iterator();
        j53.m23533c(k53Var, "predicate");
        int i11 = 0;
        while (it.hasNext()) {
            if (k53Var.zza(it.next())) {
                if (i11 != -1) {
                    return false;
                }
                return true;
            }
            i11++;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.f17651p.iterator();
        k53 k53Var = this.f17652q;
        it.getClass();
        k53Var.getClass();
        return new j83(it, k53Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        if (contains(obj) && this.f17651p.remove(obj)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f17651p.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f17652q.zza(next) && collection.contains(next)) {
                it.remove();
                z11 = true;
            }
        }
        return z11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f17651p.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f17652q.zza(next) && !collection.contains(next)) {
                it.remove();
                z11 = true;
            }
        }
        return z11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        Iterator it = this.f17651p.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (this.f17652q.zza(it.next())) {
                i11++;
            }
        }
        return i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        m83.m24494c(arrayList, it);
        return arrayList.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        m83.m24494c(arrayList, it);
        return arrayList.toArray(objArr);
    }
}
