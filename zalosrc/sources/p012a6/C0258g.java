package p012a6;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: a6.g */
/* loaded from: classes2.dex */
final class C0258g implements Iterator {

    /* renamed from: p */
    final Iterator f1393p;

    /* renamed from: q */
    Collection f1394q;

    /* renamed from: r */
    final /* synthetic */ C0277h f1395r;

    public C0258g(C0277h c0277h) {
        this.f1395r = c0277h;
        this.f1393p = c0277h.f1439r.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1393p.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f1393p.next();
        this.f1394q = (Collection) entry.getValue();
        C0277h c0277h = this.f1395r;
        Object key = entry.getKey();
        return new C0354l0(key, c0277h.f1440s.mo661f(key, (Collection) entry.getValue()));
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z11;
        int i11;
        if (this.f1394q != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC0163b.m620d(z11, "no calls to next() since the last call to remove()");
        this.f1393p.remove();
        AbstractC0429p abstractC0429p = this.f1395r.f1440s;
        i11 = abstractC0429p.f1744s;
        abstractC0429p.f1744s = i11 - this.f1394q.size();
        this.f1394q.clear();
        this.f1394q = null;
    }
}
