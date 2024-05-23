package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.o7 */
/* loaded from: classes.dex */
abstract class AbstractC5525o7 extends AbstractC5373f8 {

    /* renamed from: p */
    private final int f32698p;

    /* renamed from: q */
    private int f32699q;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC5525o7(int i11, int i12) {
        AbstractC5372f7.m29136b(i12, i11, "index");
        this.f32698p = i11;
        this.f32699q = i12;
    }

    /* renamed from: a */
    protected abstract Object mo29484a(int i11);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f32699q < this.f32698p;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f32699q > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i11 = this.f32699q;
            this.f32699q = i11 + 1;
            return mo29484a(i11);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f32699q;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i11 = this.f32699q - 1;
            this.f32699q = i11;
            return mo29484a(i11);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f32699q - 1;
    }
}
