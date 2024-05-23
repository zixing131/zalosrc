package p670y5;

import java.util.List;
import java.util.ListIterator;

/* renamed from: y5.c0 */
/* loaded from: classes2.dex */
final class C30336c0 extends C30297a0 implements ListIterator {

    /* renamed from: s */
    final /* synthetic */ C30355d0 f140749s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30336c0(C30355d0 c30355d0) {
        super(c30355d0);
        this.f140749s = c30355d0;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i11;
        boolean isEmpty = this.f140749s.isEmpty();
        m149439a();
        ((ListIterator) this.f140674p).add(obj);
        AbstractC30374e0 abstractC30374e0 = this.f140749s.f140776u;
        i11 = abstractC30374e0.f140818s;
        abstractC30374e0.f140818s = i11 + 1;
        if (isEmpty) {
            this.f140749s.m149461d();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        m149439a();
        return ((ListIterator) this.f140674p).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        m149439a();
        return ((ListIterator) this.f140674p).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        m149439a();
        return ((ListIterator) this.f140674p).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        m149439a();
        return ((ListIterator) this.f140674p).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        m149439a();
        ((ListIterator) this.f140674p).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30336c0(C30355d0 c30355d0, int i11) {
        super(c30355d0, ((List) c30355d0.f140717q).listIterator(i11));
        this.f140749s = c30355d0;
    }
}
