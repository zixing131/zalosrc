package p670y5;

import java.util.NoSuchElementException;

/* renamed from: y5.r */
/* loaded from: classes.dex */
abstract class AbstractC30620r extends AbstractC30357d2 {

    /* renamed from: p */
    private final int f141702p;

    /* renamed from: q */
    private int f141703q;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC30620r(int i11, int i12) {
        AbstractC30582p.m149599b(i12, i11, "index");
        this.f141702p = i11;
        this.f141703q = i12;
    }

    /* renamed from: a */
    protected abstract Object mo149468a(int i11);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f141703q < this.f141702p;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f141703q > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i11 = this.f141703q;
            this.f141703q = i11 + 1;
            return mo149468a(i11);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f141703q;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i11 = this.f141703q - 1;
            this.f141703q = i11;
            return mo149468a(i11);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f141703q - 1;
    }
}
