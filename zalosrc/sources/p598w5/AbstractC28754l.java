package p598w5;

import java.util.NoSuchElementException;

/* renamed from: w5.l */
/* loaded from: classes2.dex */
abstract class AbstractC28754l extends AbstractC28767y {

    /* renamed from: p */
    private final int f133278p;

    /* renamed from: q */
    private int f133279q;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC28754l(int i11, int i12) {
        AbstractC28752j.m143883b(i12, i11, "index");
        this.f133278p = i11;
        this.f133279q = i12;
    }

    /* renamed from: a */
    protected abstract Object mo143887a(int i11);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f133279q < this.f133278p;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f133279q > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i11 = this.f133279q;
            this.f133279q = i11 + 1;
            return mo143887a(i11);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f133279q;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i11 = this.f133279q - 1;
            this.f133279q = i11;
            return mo143887a(i11);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f133279q - 1;
    }
}
