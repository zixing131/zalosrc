package rm0;

import fn0.AbstractC19074t;
import gn0.InterfaceC19518b;
import java.util.Collection;
import java.util.Iterator;
import qm0.AbstractC25338d;

/* renamed from: rm0.g */
/* loaded from: classes7.dex */
public final class C25841g extends AbstractC25338d implements Collection, InterfaceC19518b {

    /* renamed from: p */
    private final C25838d f123257p;

    public C25841g(C25838d c25838d) {
        AbstractC19074t.m100208f(c25838d, "backing");
        this.f123257p = c25838d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        AbstractC19074t.m100208f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f123257p.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f123257p.containsValue(obj);
    }

    @Override // qm0.AbstractC25338d
    /* renamed from: d */
    public int mo131248d() {
        return this.f123257p.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f123257p.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f123257p.m133268S();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return this.f123257p.m133267Q(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        AbstractC19074t.m100208f(collection, "elements");
        this.f123257p.m133271n();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        AbstractC19074t.m100208f(collection, "elements");
        this.f123257p.m133271n();
        return super.retainAll(collection);
    }
}
