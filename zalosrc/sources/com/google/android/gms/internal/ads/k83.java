package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
final class k83 extends ba3 {

    /* renamed from: p */
    boolean f23189p;

    /* renamed from: q */
    final /* synthetic */ Object f23190q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k83(Object obj) {
        this.f23190q = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f23189p;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f23189p) {
            this.f23189p = true;
            return this.f23190q;
        }
        throw new NoSuchElementException();
    }
}
