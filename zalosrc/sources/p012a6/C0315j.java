package p012a6;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a6.j */
/* loaded from: classes2.dex */
public final class C0315j extends AbstractC0203d1 {

    /* renamed from: q */
    final /* synthetic */ AbstractC0429p f1514q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0315j(AbstractC0429p abstractC0429p, Map map) {
        super(map);
        this.f1514q = abstractC0429p;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        AbstractC0506t0.m875a(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f966p.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this != obj && !this.f966p.keySet().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f966p.keySet().hashCode();
    }

    @Override // p012a6.AbstractC0203d1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0296i(this, this.f966p.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i11;
        Collection collection = (Collection) this.f966p.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            AbstractC0429p abstractC0429p = this.f1514q;
            i11 = abstractC0429p.f1744s;
            abstractC0429p.f1744s = i11 - size;
            if (size > 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
