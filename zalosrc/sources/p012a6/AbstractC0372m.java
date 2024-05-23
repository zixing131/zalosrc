package p012a6;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a6.m */
/* loaded from: classes2.dex */
public abstract class AbstractC0372m extends AbstractCollection {

    /* renamed from: p */
    final Object f1615p;

    /* renamed from: q */
    Collection f1616q;

    /* renamed from: r */
    final AbstractC0372m f1617r;

    /* renamed from: s */
    final Collection f1618s;

    /* renamed from: t */
    final /* synthetic */ AbstractC0429p f1619t;

    public AbstractC0372m(AbstractC0429p abstractC0429p, Object obj, Collection collection, AbstractC0372m abstractC0372m) {
        Collection collection2;
        this.f1619t = abstractC0429p;
        this.f1615p = obj;
        this.f1616q = collection;
        this.f1617r = abstractC0372m;
        if (abstractC0372m == null) {
            collection2 = null;
        } else {
            collection2 = abstractC0372m.f1616q;
        }
        this.f1618s = collection2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        int i11;
        zzb();
        boolean isEmpty = this.f1616q.isEmpty();
        boolean add = this.f1616q.add(obj);
        if (add) {
            AbstractC0429p abstractC0429p = this.f1619t;
            i11 = abstractC0429p.f1744s;
            abstractC0429p.f1744s = i11 + 1;
            if (isEmpty) {
                m785d();
                return true;
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i11;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f1616q.addAll(collection);
        if (addAll) {
            int size2 = this.f1616q.size();
            AbstractC0429p abstractC0429p = this.f1619t;
            i11 = abstractC0429p.f1744s;
            abstractC0429p.f1744s = i11 + (size2 - size);
            if (size == 0) {
                m785d();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int i11;
        int size = size();
        if (size == 0) {
            return;
        }
        this.f1616q.clear();
        AbstractC0429p abstractC0429p = this.f1619t;
        i11 = abstractC0429p.f1744s;
        abstractC0429p.f1744s = i11 - size;
        m786e();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        zzb();
        return this.f1616q.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.f1616q.containsAll(collection);
    }

    /* renamed from: d */
    public final void m785d() {
        Map map;
        AbstractC0372m abstractC0372m = this.f1617r;
        if (abstractC0372m == null) {
            map = this.f1619t.f1743r;
            map.put(this.f1615p, this.f1616q);
        } else {
            abstractC0372m.m785d();
        }
    }

    /* renamed from: e */
    public final void m786e() {
        Map map;
        AbstractC0372m abstractC0372m = this.f1617r;
        if (abstractC0372m != null) {
            abstractC0372m.m786e();
        } else if (this.f1616q.isEmpty()) {
            map = this.f1619t.f1743r;
            map.remove(this.f1615p);
        }
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.f1616q.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.f1616q.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzb();
        return new C0353l(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        int i11;
        zzb();
        boolean remove = this.f1616q.remove(obj);
        if (remove) {
            AbstractC0429p abstractC0429p = this.f1619t;
            i11 = abstractC0429p.f1744s;
            abstractC0429p.f1744s = i11 - 1;
            m786e();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i11;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f1616q.removeAll(collection);
        if (removeAll) {
            int size2 = this.f1616q.size();
            AbstractC0429p abstractC0429p = this.f1619t;
            i11 = abstractC0429p.f1744s;
            abstractC0429p.f1744s = i11 + (size2 - size);
            m786e();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i11;
        collection.getClass();
        int size = size();
        boolean retainAll = this.f1616q.retainAll(collection);
        if (retainAll) {
            int size2 = this.f1616q.size();
            AbstractC0429p abstractC0429p = this.f1619t;
            i11 = abstractC0429p.f1744s;
            abstractC0429p.f1744s = i11 + (size2 - size);
            m786e();
        }
        return retainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.f1616q.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.f1616q.toString();
    }

    public final void zzb() {
        Map map;
        AbstractC0372m abstractC0372m = this.f1617r;
        if (abstractC0372m != null) {
            abstractC0372m.zzb();
            if (this.f1617r.f1616q != this.f1618s) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f1616q.isEmpty()) {
            map = this.f1619t.f1743r;
            Collection collection = (Collection) map.get(this.f1615p);
            if (collection != null) {
                this.f1616q = collection;
            }
        }
    }
}
