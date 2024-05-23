package p012a6;

import java.util.List;
import java.util.ListIterator;

/* renamed from: a6.n */
/* loaded from: classes2.dex */
final class C0391n extends C0353l implements ListIterator {

    /* renamed from: s */
    final /* synthetic */ C0410o f1654s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0391n(C0410o c0410o) {
        super(c0410o);
        this.f1654s = c0410o;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i11;
        boolean isEmpty = this.f1654s.isEmpty();
        m778a();
        ((ListIterator) this.f1573p).add(obj);
        AbstractC0429p abstractC0429p = this.f1654s.f1689u;
        i11 = abstractC0429p.f1744s;
        abstractC0429p.f1744s = i11 + 1;
        if (isEmpty) {
            this.f1654s.m785d();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        m778a();
        return ((ListIterator) this.f1573p).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        m778a();
        return ((ListIterator) this.f1573p).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        m778a();
        return ((ListIterator) this.f1573p).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        m778a();
        return ((ListIterator) this.f1573p).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        m778a();
        ((ListIterator) this.f1573p).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0391n(C0410o c0410o, int i11) {
        super(c0410o, ((List) c0410o.f1616q).listIterator(i11));
        this.f1654s = c0410o;
    }
}
