package p670y5;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: y5.u */
/* loaded from: classes2.dex */
final class C30677u implements Iterator {

    /* renamed from: p */
    final Iterator f141870p;

    /* renamed from: q */
    Collection f141871q;

    /* renamed from: r */
    final /* synthetic */ C30696v f141872r;

    public C30677u(C30696v c30696v) {
        this.f141872r = c30696v;
        this.f141870p = c30696v.f141905r.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f141870p.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f141870p.next();
        this.f141871q = (Collection) entry.getValue();
        C30696v c30696v = this.f141872r;
        Object key = entry.getKey();
        return new C30773z0(key, c30696v.f141906s.mo149488f(key, (Collection) entry.getValue()));
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z11;
        int i11;
        if (this.f141871q != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC30582p.m149601d(z11, "no calls to next() since the last call to remove()");
        this.f141870p.remove();
        AbstractC30374e0 abstractC30374e0 = this.f141872r.f141906s;
        i11 = abstractC30374e0.f140818s;
        abstractC30374e0.f140818s = i11 - this.f141871q.size();
        this.f141871q.clear();
        this.f141871q = null;
    }
}
