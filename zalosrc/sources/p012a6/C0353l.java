package p012a6;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* renamed from: a6.l */
/* loaded from: classes2.dex */
class C0353l implements Iterator {

    /* renamed from: p */
    final Iterator f1573p;

    /* renamed from: q */
    final Collection f1574q;

    /* renamed from: r */
    final /* synthetic */ AbstractC0372m f1575r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0353l(AbstractC0372m abstractC0372m, Iterator it) {
        this.f1575r = abstractC0372m;
        this.f1574q = abstractC0372m.f1616q;
        this.f1573p = it;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m778a() {
        this.f1575r.zzb();
        if (this.f1575r.f1616q == this.f1574q) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        m778a();
        return this.f1573p.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        m778a();
        return this.f1573p.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i11;
        this.f1573p.remove();
        AbstractC0429p abstractC0429p = this.f1575r.f1619t;
        i11 = abstractC0429p.f1744s;
        abstractC0429p.f1744s = i11 - 1;
        this.f1575r.m786e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0353l(AbstractC0372m abstractC0372m) {
        Iterator it;
        this.f1575r = abstractC0372m;
        Collection collection = abstractC0372m.f1616q;
        this.f1574q = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f1573p = it;
    }
}
