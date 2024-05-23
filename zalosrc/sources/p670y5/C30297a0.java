package p670y5;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* renamed from: y5.a0 */
/* loaded from: classes2.dex */
class C30297a0 implements Iterator {

    /* renamed from: p */
    final Iterator f140674p;

    /* renamed from: q */
    final Collection f140675q;

    /* renamed from: r */
    final /* synthetic */ AbstractC30317b0 f140676r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C30297a0(AbstractC30317b0 abstractC30317b0, Iterator it) {
        this.f140676r = abstractC30317b0;
        this.f140675q = abstractC30317b0.f140717q;
        this.f140674p = it;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m149439a() {
        this.f140676r.zzb();
        if (this.f140676r.f140717q == this.f140675q) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        m149439a();
        return this.f140674p.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        m149439a();
        return this.f140674p.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i11;
        this.f140674p.remove();
        AbstractC30374e0 abstractC30374e0 = this.f140676r.f140720t;
        i11 = abstractC30374e0.f140818s;
        abstractC30374e0.f140818s = i11 - 1;
        this.f140676r.m149462e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C30297a0(AbstractC30317b0 abstractC30317b0) {
        Iterator it;
        this.f140676r = abstractC30317b0;
        Collection collection = abstractC30317b0.f140717q;
        this.f140675q = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f140674p = it;
    }
}
