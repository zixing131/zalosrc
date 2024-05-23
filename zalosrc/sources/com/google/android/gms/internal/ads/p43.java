package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
abstract class p43 implements Iterator {

    /* renamed from: p */
    private Object f26064p;

    /* renamed from: q */
    private int f26065q = 2;

    /* renamed from: a */
    protected abstract Object mo25398a();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final Object m25399c() {
        this.f26065q = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z11;
        if (this.f26065q != 4) {
            z11 = true;
        } else {
            z11 = false;
        }
        j53.m23538h(z11);
        int i11 = this.f26065q;
        int i12 = i11 - 1;
        if (i11 != 0) {
            if (i12 == 0) {
                return true;
            }
            if (i12 != 2) {
                this.f26065q = 4;
                this.f26064p = mo25398a();
                if (this.f26065q != 3) {
                    this.f26065q = 1;
                    return true;
                }
            }
            return false;
        }
        throw null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f26065q = 2;
            Object obj = this.f26064p;
            this.f26064p = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
