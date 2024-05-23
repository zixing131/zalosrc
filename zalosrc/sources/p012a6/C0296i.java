package p012a6;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: a6.i */
/* loaded from: classes2.dex */
final class C0296i implements Iterator {

    /* renamed from: p */
    Map.Entry f1474p;

    /* renamed from: q */
    final /* synthetic */ Iterator f1475q;

    /* renamed from: r */
    final /* synthetic */ C0315j f1476r;

    public C0296i(C0315j c0315j, Iterator it) {
        this.f1476r = c0315j;
        this.f1475q = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1475q.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f1475q.next();
        this.f1474p = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z11;
        int i11;
        if (this.f1474p != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC0163b.m620d(z11, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f1474p.getValue();
        this.f1475q.remove();
        AbstractC0429p abstractC0429p = this.f1476r.f1514q;
        i11 = abstractC0429p.f1744s;
        abstractC0429p.f1744s = i11 - collection.size();
        collection.clear();
        this.f1474p = null;
    }
}
