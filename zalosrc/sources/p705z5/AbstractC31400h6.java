package p705z5;

import java.util.NoSuchElementException;

/* renamed from: z5.h6 */
/* loaded from: classes.dex */
abstract class AbstractC31400h6 extends AbstractC31337d {

    /* renamed from: p */
    private final int f144771p;

    /* renamed from: q */
    private int f144772q;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC31400h6(int i11, int i12) {
        AbstractC31370f4.m152225b(i12, i11, "index");
        this.f144771p = i11;
        this.f144772q = i12;
    }

    /* renamed from: a */
    protected abstract Object mo152240a(int i11);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f144772q < this.f144771p;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f144772q > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i11 = this.f144772q;
            this.f144772q = i11 + 1;
            return mo152240a(i11);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f144772q;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i11 = this.f144772q - 1;
            this.f144772q = i11;
            return mo152240a(i11);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f144772q - 1;
    }
}
