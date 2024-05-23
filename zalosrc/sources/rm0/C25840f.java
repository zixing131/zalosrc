package rm0;

import fn0.AbstractC19074t;
import gn0.InterfaceC19518b;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import qm0.AbstractC25344g;

/* renamed from: rm0.f */
/* loaded from: classes7.dex */
public final class C25840f extends AbstractC25344g implements Set, InterfaceC19518b {

    /* renamed from: p */
    private final C25838d f123256p;

    public C25840f(C25838d c25838d) {
        AbstractC19074t.m100208f(c25838d, "backing");
        this.f123256p = c25838d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        AbstractC19074t.m100208f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f123256p.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f123256p.containsKey(obj);
    }

    @Override // qm0.AbstractC25344g
    /* renamed from: d */
    public int mo113226d() {
        return this.f123256p.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f123256p.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f123256p.m133264G();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (this.f123256p.m133266O(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        AbstractC19074t.m100208f(collection, "elements");
        this.f123256p.m133271n();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        AbstractC19074t.m100208f(collection, "elements");
        this.f123256p.m133271n();
        return super.retainAll(collection);
    }
}
