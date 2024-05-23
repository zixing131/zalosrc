package p568v5;

import java.util.NoSuchElementException;

/* renamed from: v5.q */
/* loaded from: classes2.dex */
abstract class AbstractC27546q extends AbstractC27553x {

    /* renamed from: p */
    private final int f129505p;

    /* renamed from: q */
    private int f129506q;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC27546q(int i11, int i12) {
        AbstractC27544o.m140748b(i12, i11, "index");
        this.f129505p = i11;
        this.f129506q = i12;
    }

    /* renamed from: a */
    protected abstract Object mo140752a(int i11);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f129506q < this.f129505p;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f129506q > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i11 = this.f129506q;
            this.f129506q = i11 + 1;
            return mo140752a(i11);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f129506q;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i11 = this.f129506q - 1;
            this.f129506q = i11;
            return mo140752a(i11);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f129506q - 1;
    }
}
