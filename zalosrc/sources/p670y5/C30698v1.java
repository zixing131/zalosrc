package p670y5;

import java.util.Iterator;

/* renamed from: y5.v1 */
/* loaded from: classes2.dex */
final class C30698v1 extends AbstractC30432h1 {

    /* renamed from: r */
    private final transient AbstractC30413g1 f141907r;

    /* renamed from: s */
    private final transient AbstractC30375e1 f141908s;

    public C30698v1(AbstractC30413g1 abstractC30413g1, AbstractC30375e1 abstractC30375e1) {
        this.f141907r = abstractC30413g1;
        this.f141908s = abstractC30375e1;
    }

    @Override // p670y5.AbstractC30754y0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (this.f141907r.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // p670y5.AbstractC30754y0
    /* renamed from: d */
    public final int mo149494d(Object[] objArr, int i11) {
        return this.f141908s.mo149494d(objArr, i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f141908s.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f141907r.size();
    }
}
