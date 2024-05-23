package p012a6;

import java.util.ListIterator;

/* renamed from: a6.s1 */
/* loaded from: classes2.dex */
abstract class AbstractC0488s1 extends AbstractC0469r1 implements ListIterator {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0488s1(ListIterator listIterator) {
        super(listIterator);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f1838p).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f1838p).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return mo611a(((ListIterator) this.f1838p).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f1838p).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
