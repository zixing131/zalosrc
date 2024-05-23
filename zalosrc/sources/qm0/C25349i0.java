package qm0;

import fn0.AbstractC19074t;
import gn0.InterfaceC19517a;
import java.util.Iterator;

/* renamed from: qm0.i0 */
/* loaded from: classes7.dex */
public final class C25349i0 implements Iterator, InterfaceC19517a {

    /* renamed from: p */
    private final Iterator f121543p;

    /* renamed from: q */
    private int f121544q;

    public C25349i0(Iterator it) {
        AbstractC19074t.m100208f(it, "iterator");
        this.f121543p = it;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C25345g0 next() {
        int i11 = this.f121544q;
        this.f121544q = i11 + 1;
        if (i11 < 0) {
            AbstractC25368s.m131509q();
        }
        return new C25345g0(i11, this.f121543p.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f121543p.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
