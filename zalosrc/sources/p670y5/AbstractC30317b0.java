package p670y5;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: y5.b0 */
/* loaded from: classes2.dex */
public abstract class AbstractC30317b0 extends AbstractCollection {

    /* renamed from: p */
    final Object f140716p;

    /* renamed from: q */
    Collection f140717q;

    /* renamed from: r */
    final AbstractC30317b0 f140718r;

    /* renamed from: s */
    final Collection f140719s;

    /* renamed from: t */
    final /* synthetic */ AbstractC30374e0 f140720t;

    public AbstractC30317b0(AbstractC30374e0 abstractC30374e0, Object obj, Collection collection, AbstractC30317b0 abstractC30317b0) {
        Collection collection2;
        this.f140720t = abstractC30374e0;
        this.f140716p = obj;
        this.f140717q = collection;
        this.f140718r = abstractC30317b0;
        if (abstractC30317b0 == null) {
            collection2 = null;
        } else {
            collection2 = abstractC30317b0.f140717q;
        }
        this.f140719s = collection2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        int i11;
        zzb();
        boolean isEmpty = this.f140717q.isEmpty();
        boolean add = this.f140717q.add(obj);
        if (add) {
            AbstractC30374e0 abstractC30374e0 = this.f140720t;
            i11 = abstractC30374e0.f140818s;
            abstractC30374e0.f140818s = i11 + 1;
            if (isEmpty) {
                m149461d();
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
        boolean addAll = this.f140717q.addAll(collection);
        if (addAll) {
            int size2 = this.f140717q.size();
            AbstractC30374e0 abstractC30374e0 = this.f140720t;
            i11 = abstractC30374e0.f140818s;
            abstractC30374e0.f140818s = i11 + (size2 - size);
            if (size == 0) {
                m149461d();
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
        this.f140717q.clear();
        AbstractC30374e0 abstractC30374e0 = this.f140720t;
        i11 = abstractC30374e0.f140818s;
        abstractC30374e0.f140818s = i11 - size;
        m149462e();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        zzb();
        return this.f140717q.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.f140717q.containsAll(collection);
    }

    /* renamed from: d */
    public final void m149461d() {
        Map map;
        AbstractC30317b0 abstractC30317b0 = this.f140718r;
        if (abstractC30317b0 == null) {
            map = this.f140720t.f140817r;
            map.put(this.f140716p, this.f140717q);
        } else {
            abstractC30317b0.m149461d();
        }
    }

    /* renamed from: e */
    public final void m149462e() {
        Map map;
        AbstractC30317b0 abstractC30317b0 = this.f140718r;
        if (abstractC30317b0 != null) {
            abstractC30317b0.m149462e();
        } else if (this.f140717q.isEmpty()) {
            map = this.f140720t.f140817r;
            map.remove(this.f140716p);
        }
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.f140717q.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.f140717q.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzb();
        return new C30297a0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        int i11;
        zzb();
        boolean remove = this.f140717q.remove(obj);
        if (remove) {
            AbstractC30374e0 abstractC30374e0 = this.f140720t;
            i11 = abstractC30374e0.f140818s;
            abstractC30374e0.f140818s = i11 - 1;
            m149462e();
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
        boolean removeAll = this.f140717q.removeAll(collection);
        if (removeAll) {
            int size2 = this.f140717q.size();
            AbstractC30374e0 abstractC30374e0 = this.f140720t;
            i11 = abstractC30374e0.f140818s;
            abstractC30374e0.f140818s = i11 + (size2 - size);
            m149462e();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i11;
        collection.getClass();
        int size = size();
        boolean retainAll = this.f140717q.retainAll(collection);
        if (retainAll) {
            int size2 = this.f140717q.size();
            AbstractC30374e0 abstractC30374e0 = this.f140720t;
            i11 = abstractC30374e0.f140818s;
            abstractC30374e0.f140818s = i11 + (size2 - size);
            m149462e();
        }
        return retainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.f140717q.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.f140717q.toString();
    }

    public final void zzb() {
        Map map;
        AbstractC30317b0 abstractC30317b0 = this.f140718r;
        if (abstractC30317b0 != null) {
            abstractC30317b0.zzb();
            if (this.f140718r.f140717q != this.f140719s) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f140717q.isEmpty()) {
            map = this.f140720t.f140817r;
            Collection collection = (Collection) map.get(this.f140716p);
            if (collection != null) {
                this.f140717q = collection;
            }
        }
    }
}
