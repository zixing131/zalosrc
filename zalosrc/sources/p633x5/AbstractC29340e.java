package p633x5;

import java.util.NoSuchElementException;

/* renamed from: x5.e */
/* loaded from: classes.dex */
abstract class AbstractC29340e extends AbstractC29333a0 {

    /* renamed from: p */
    private final int f135814p;

    /* renamed from: q */
    private int f135815q;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC29340e(int i11, int i12) {
        AbstractC29336c.m146472b(i12, i11, "index");
        this.f135814p = i11;
        this.f135815q = i12;
    }

    /* renamed from: a */
    protected abstract Object mo146478a(int i11);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f135815q < this.f135814p;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f135815q > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i11 = this.f135815q;
            this.f135815q = i11 + 1;
            return mo146478a(i11);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f135815q;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i11 = this.f135815q - 1;
            this.f135815q = i11;
            return mo146478a(i11);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f135815q - 1;
    }
}
