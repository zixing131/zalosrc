package p012a6;

import java.util.Iterator;

/* renamed from: a6.r1 */
/* loaded from: classes2.dex */
abstract class AbstractC0469r1 implements Iterator {

    /* renamed from: p */
    final Iterator f1838p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0469r1(Iterator it) {
        it.getClass();
        this.f1838p = it;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract Object mo611a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1838p.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return mo611a(this.f1838p.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f1838p.remove();
    }
}
