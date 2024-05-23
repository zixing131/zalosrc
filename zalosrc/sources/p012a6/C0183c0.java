package p012a6;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: a6.c0 */
/* loaded from: classes2.dex */
final class C0183c0 extends AbstractSet {

    /* renamed from: p */
    final /* synthetic */ C0240f0 f807p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0183c0(C0240f0 c0240f0) {
        this.f807p = c0240f0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f807p.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f807p.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C0240f0 c0240f0 = this.f807p;
        Map m710k = c0240f0.m710k();
        if (m710k != null) {
            return m710k.keySet().iterator();
        }
        return new C0542v(c0240f0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object m706v;
        Object obj2;
        Map m710k = this.f807p.m710k();
        if (m710k == null) {
            m706v = this.f807p.m706v(obj);
            obj2 = C0240f0.f1108y;
            if (m706v == obj2) {
                return false;
            }
            return true;
        }
        return m710k.keySet().remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f807p.size();
    }
}
