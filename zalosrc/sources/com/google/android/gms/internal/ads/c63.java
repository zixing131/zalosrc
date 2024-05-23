package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
abstract class c63 extends ca3 {

    /* renamed from: p */
    private final int f18134p;

    /* renamed from: q */
    private int f18135q;

    /* JADX INFO: Access modifiers changed from: protected */
    public c63(int i11, int i12) {
        j53.m23532b(i12, i11, "index");
        this.f18134p = i11;
        this.f18135q = i12;
    }

    /* renamed from: a */
    protected abstract Object mo20035a(int i11);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f18135q < this.f18134p;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f18135q > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i11 = this.f18135q;
            this.f18135q = i11 + 1;
            return mo20035a(i11);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f18135q;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i11 = this.f18135q - 1;
            this.f18135q = i11;
            return mo20035a(i11);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f18135q - 1;
    }
}
