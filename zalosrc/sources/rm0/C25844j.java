package rm0;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gn0.InterfaceC19518b;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import qm0.AbstractC25344g;

/* renamed from: rm0.j */
/* loaded from: classes.dex */
public final class C25844j extends AbstractC25344g implements Set, Serializable, InterfaceC19518b {

    /* renamed from: q */
    private static final a f123263q = new a(null);

    /* renamed from: r */
    private static final C25844j f123264r = new C25844j(C25838d.f123234C.m133281e());

    /* renamed from: p */
    private final C25838d f123265p;

    /* renamed from: rm0.j$a */
    /* loaded from: classes.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C25844j(C25838d c25838d) {
        AbstractC19074t.m100208f(c25838d, "backing");
        this.f123265p = c25838d;
    }

    private final Object writeReplace() {
        if (this.f123265p.m133263F()) {
            return new C25842h(this, 1);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        if (this.f123265p.m133269i(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        AbstractC19074t.m100208f(collection, "elements");
        this.f123265p.m133271n();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f123265p.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f123265p.containsKey(obj);
    }

    @Override // qm0.AbstractC25344g
    /* renamed from: d */
    public int mo113226d() {
        return this.f123265p.size();
    }

    /* renamed from: e */
    public final Set m133293e() {
        this.f123265p.m133270l();
        if (size() > 0) {
            return this;
        }
        return f123264r;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f123265p.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f123265p.m133264G();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (this.f123265p.m133266O(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        AbstractC19074t.m100208f(collection, "elements");
        this.f123265p.m133271n();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        AbstractC19074t.m100208f(collection, "elements");
        this.f123265p.m133271n();
        return super.retainAll(collection);
    }

    public C25844j() {
        this(new C25838d());
    }

    public C25844j(int i11) {
        this(new C25838d(i11));
    }
}
