package p670y5;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: y5.v */
/* loaded from: classes2.dex */
public final class C30696v extends AbstractC30565o1 {

    /* renamed from: r */
    final transient Map f141905r;

    /* renamed from: s */
    final /* synthetic */ AbstractC30374e0 f141906s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C30696v(AbstractC30374e0 abstractC30374e0, Map map) {
        this.f141906s = abstractC30374e0;
        this.f141905r = map;
    }

    @Override // p670y5.AbstractC30565o1
    /* renamed from: a */
    protected final Set mo149592a() {
        return new C30658t(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map;
        Map map2 = this.f141905r;
        AbstractC30374e0 abstractC30374e0 = this.f141906s;
        map = abstractC30374e0.f140817r;
        if (map2 == map) {
            abstractC30374e0.m149491m();
        } else {
            AbstractC30451i1.m149530a(new C30677u(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return AbstractC30584p1.m149605b(this.f141905r, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this != obj && !this.f141905r.equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) AbstractC30584p1.m149604a(this.f141905r, obj);
        if (collection == null) {
            return null;
        }
        return this.f141906s.mo149488f(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f141905r.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.f141906s.zzo();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        int i11;
        Collection collection = (Collection) this.f141905r.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection mo149487e = this.f141906s.mo149487e();
        mo149487e.addAll(collection);
        AbstractC30374e0 abstractC30374e0 = this.f141906s;
        i11 = abstractC30374e0.f140818s;
        abstractC30374e0.f140818s = i11 - collection.size();
        collection.clear();
        return mo149487e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f141905r.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f141905r.toString();
    }
}
