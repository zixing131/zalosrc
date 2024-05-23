package p012a6;

import java.util.NoSuchElementException;

/* renamed from: a6.d */
/* loaded from: classes.dex */
abstract class AbstractC0201d extends AbstractC0526u1 {

    /* renamed from: p */
    private final int f961p;

    /* renamed from: q */
    private int f962q;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0201d(int i11, int i12) {
        AbstractC0163b.m618b(i12, i11, "index");
        this.f961p = i11;
        this.f962q = i12;
    }

    /* renamed from: a */
    protected abstract Object mo654a(int i11);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f962q < this.f961p;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f962q > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i11 = this.f962q;
            this.f962q = i11 + 1;
            return mo654a(i11);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f962q;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i11 = this.f962q - 1;
            this.f962q = i11;
            return mo654a(i11);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f962q - 1;
    }
}
