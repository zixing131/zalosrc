package p670y5;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: y5.s0 */
/* loaded from: classes2.dex */
final class C30640s0 extends AbstractCollection {

    /* renamed from: p */
    final /* synthetic */ C30659t0 f141759p;

    public C30640s0(C30659t0 c30659t0) {
        this.f141759p = c30659t0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f141759p.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C30659t0 c30659t0 = this.f141759p;
        Map m149646k = c30659t0.m149646k();
        if (m149646k != null) {
            return m149646k.values().iterator();
        }
        return new C30526m0(c30659t0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f141759p.size();
    }
}
