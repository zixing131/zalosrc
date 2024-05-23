package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.play_billing.c5 */
/* loaded from: classes2.dex */
abstract class AbstractC5741c5 extends AbstractC5850v {

    /* renamed from: p */
    private final int f33248p;

    /* renamed from: q */
    private int f33249q;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC5741c5(int i11, int i12) {
        AbstractC5727a5.m30167b(i12, i11, "index");
        this.f33248p = i11;
        this.f33249q = i12;
    }

    /* renamed from: a */
    protected abstract Object mo30199a(int i11);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f33249q < this.f33248p;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f33249q > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i11 = this.f33249q;
            this.f33249q = i11 + 1;
            return mo30199a(i11);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f33249q;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i11 = this.f33249q - 1;
            this.f33249q = i11;
            return mo30199a(i11);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f33249q - 1;
    }
}
