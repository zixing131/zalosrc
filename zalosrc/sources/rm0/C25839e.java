package rm0;

import fn0.AbstractC19074t;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: rm0.e */
/* loaded from: classes7.dex */
public final class C25839e extends AbstractC25835a {

    /* renamed from: p */
    private final C25838d f123255p;

    public C25839e(C25838d c25838d) {
        AbstractC19074t.m100208f(c25838d, "backing");
        this.f123255p = c25838d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        AbstractC19074t.m100208f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f123255p.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        AbstractC19074t.m100208f(collection, "elements");
        return this.f123255p.m133272p(collection);
    }

    @Override // qm0.AbstractC25344g
    /* renamed from: d */
    public int mo113226d() {
        return this.f123255p.size();
    }

    @Override // rm0.AbstractC25835a
    /* renamed from: g */
    public boolean mo133204g(Map.Entry entry) {
        AbstractC19074t.m100208f(entry, "element");
        return this.f123255p.m133273q(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f123255p.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f123255p.m133274v();
    }

    @Override // rm0.AbstractC25835a
    /* renamed from: j */
    public boolean mo133205j(Map.Entry entry) {
        AbstractC19074t.m100208f(entry, "element");
        return this.f123255p.m133265M(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public boolean add(Map.Entry entry) {
        AbstractC19074t.m100208f(entry, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        AbstractC19074t.m100208f(collection, "elements");
        this.f123255p.m133271n();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        AbstractC19074t.m100208f(collection, "elements");
        this.f123255p.m133271n();
        return super.retainAll(collection);
    }
}
