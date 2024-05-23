package p670y5;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: y5.q0 */
/* loaded from: classes2.dex */
final class C30602q0 extends AbstractSet {

    /* renamed from: p */
    final /* synthetic */ C30659t0 f141656p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C30602q0(C30659t0 c30659t0) {
        this.f141656p = c30659t0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f141656p.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f141656p.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C30659t0 c30659t0 = this.f141656p;
        Map m149646k = c30659t0.m149646k();
        if (m149646k != null) {
            return m149646k.keySet().iterator();
        }
        return new C30488k0(c30659t0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object m149642v;
        Object obj2;
        Map m149646k = this.f141656p.m149646k();
        if (m149646k == null) {
            m149642v = this.f141656p.m149642v(obj);
            obj2 = C30659t0.f141806y;
            if (m149642v == obj2) {
                return false;
            }
            return true;
        }
        return m149646k.keySet().remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f141656p.size();
    }
}
