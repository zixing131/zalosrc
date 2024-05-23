package p012a6;

import java.util.Iterator;

/* renamed from: a6.m1 */
/* loaded from: classes2.dex */
final class C0374m1 extends AbstractC0487s0 {

    /* renamed from: r */
    private final transient AbstractC0468r0 f1620r;

    /* renamed from: s */
    private final transient AbstractC0430p0 f1621s;

    public C0374m1(AbstractC0468r0 abstractC0468r0, AbstractC0430p0 abstractC0430p0) {
        this.f1620r = abstractC0468r0;
        this.f1621s = abstractC0430p0;
    }

    @Override // p012a6.AbstractC0335k0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (this.f1620r.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // p012a6.AbstractC0335k0
    /* renamed from: d */
    public final int mo768d(Object[] objArr, int i11) {
        return this.f1621s.mo768d(objArr, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f1621s.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f1620r.size();
    }
}
