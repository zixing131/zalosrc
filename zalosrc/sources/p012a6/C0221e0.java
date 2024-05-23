package p012a6;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: a6.e0 */
/* loaded from: classes2.dex */
final class C0221e0 extends AbstractCollection {

    /* renamed from: p */
    final /* synthetic */ C0240f0 f1003p;

    public C0221e0(C0240f0 c0240f0) {
        this.f1003p = c0240f0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f1003p.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C0240f0 c0240f0 = this.f1003p;
        Map m710k = c0240f0.m710k();
        if (m710k != null) {
            return m710k.values().iterator();
        }
        return new C0578x(c0240f0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f1003p.size();
    }
}
