package p670y5;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: y5.w */
/* loaded from: classes2.dex */
final class C30715w implements Iterator {

    /* renamed from: p */
    Map.Entry f141947p;

    /* renamed from: q */
    final /* synthetic */ Iterator f141948q;

    /* renamed from: r */
    final /* synthetic */ C30734x f141949r;

    public C30715w(C30734x c30734x, Iterator it) {
        this.f141949r = c30734x;
        this.f141948q = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f141948q.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f141948q.next();
        this.f141947p = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z11;
        int i11;
        if (this.f141947p != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC30582p.m149601d(z11, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f141947p.getValue();
        this.f141948q.remove();
        AbstractC30374e0 abstractC30374e0 = this.f141949r.f141980q;
        i11 = abstractC30374e0.f140818s;
        abstractC30374e0.f140818s = i11 - collection.size();
        collection.clear();
        this.f141947p = null;
    }
}
