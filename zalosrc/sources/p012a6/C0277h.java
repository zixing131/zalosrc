package p012a6;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a6.h */
/* loaded from: classes2.dex */
public final class C0277h extends AbstractC0241f1 {

    /* renamed from: r */
    final transient Map f1439r;

    /* renamed from: s */
    final /* synthetic */ AbstractC0429p f1440s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0277h(AbstractC0429p abstractC0429p, Map map) {
        this.f1440s = abstractC0429p;
        this.f1439r = map;
    }

    @Override // p012a6.AbstractC0241f1
    /* renamed from: a */
    protected final Set mo715a() {
        return new C0239f(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map;
        Map map2 = this.f1439r;
        AbstractC0429p abstractC0429p = this.f1440s;
        map = abstractC0429p.f1743r;
        if (map2 == map) {
            abstractC0429p.m827m();
        } else {
            AbstractC0506t0.m875a(new C0258g(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return AbstractC0260g1.m724b(this.f1439r, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this != obj && !this.f1439r.equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) AbstractC0260g1.m723a(this.f1439r, obj);
        if (collection == null) {
            return null;
        }
        return this.f1440s.mo661f(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f1439r.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.f1440s.zzo();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        int i11;
        Collection collection = (Collection) this.f1439r.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection mo824e = this.f1440s.mo824e();
        mo824e.addAll(collection);
        AbstractC0429p abstractC0429p = this.f1440s;
        i11 = abstractC0429p.f1744s;
        abstractC0429p.f1744s = i11 - collection.size();
        collection.clear();
        return mo824e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f1439r.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f1439r.toString();
    }
}
