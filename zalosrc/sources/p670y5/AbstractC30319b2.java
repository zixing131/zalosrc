package p670y5;

import java.util.Iterator;

/* renamed from: y5.b2 */
/* loaded from: classes2.dex */
abstract class AbstractC30319b2 implements Iterator {

    /* renamed from: p */
    final Iterator f140721p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC30319b2(Iterator it) {
        it.getClass();
        this.f140721p = it;
    }

    /* renamed from: a */
    abstract Object mo149467a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f140721p.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return mo149467a(this.f140721p.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f140721p.remove();
    }
}
