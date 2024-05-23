package p670y5;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: y5.x */
/* loaded from: classes2.dex */
public final class C30734x extends AbstractC30527m1 {

    /* renamed from: q */
    final /* synthetic */ AbstractC30374e0 f141980q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30734x(AbstractC30374e0 abstractC30374e0, Map map) {
        super(map);
        this.f141980q = abstractC30374e0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        AbstractC30451i1.m149530a(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f141492p.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this != obj && !this.f141492p.keySet().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f141492p.keySet().hashCode();
    }

    @Override // p670y5.AbstractC30527m1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C30715w(this, this.f141492p.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i11;
        Collection collection = (Collection) this.f141492p.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            AbstractC30374e0 abstractC30374e0 = this.f141980q;
            i11 = abstractC30374e0.f140818s;
            abstractC30374e0.f140818s = i11 - size;
            if (size > 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
