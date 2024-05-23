package com.google.common.collect;

import java.util.NoSuchElementException;
import p358n7.AbstractC23600d;

/* renamed from: com.google.common.collect.a */
/* loaded from: classes3.dex */
abstract class AbstractC6517a extends AbstractC6531o {

    /* renamed from: p */
    private final int f36350p;

    /* renamed from: q */
    private int f36351q;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC6517a(int i11, int i12) {
        AbstractC23600d.m123737h(i12, i11);
        this.f36350p = i11;
        this.f36351q = i12;
    }

    /* renamed from: a */
    protected abstract Object mo33405a(int i11);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f36351q < this.f36350p;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f36351q > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i11 = this.f36351q;
            this.f36351q = i11 + 1;
            return mo33405a(i11);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f36351q;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i11 = this.f36351q - 1;
            this.f36351q = i11;
            return mo33405a(i11);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f36351q - 1;
    }
}
