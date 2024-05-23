package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
final class qw3 implements Iterator {

    /* renamed from: p */
    private final ArrayDeque f26983p;

    /* renamed from: q */
    private ht3 f26984q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ qw3(mt3 mt3Var, pw3 pw3Var) {
        mt3 mt3Var2;
        if (mt3Var instanceof sw3) {
            sw3 sw3Var = (sw3) mt3Var;
            ArrayDeque arrayDeque = new ArrayDeque(sw3Var.mo23014s());
            this.f26983p = arrayDeque;
            arrayDeque.push(sw3Var);
            mt3Var2 = sw3Var.f28047u;
            this.f26984q = m25915c(mt3Var2);
            return;
        }
        this.f26983p = null;
        this.f26984q = (ht3) mt3Var;
    }

    /* renamed from: c */
    private final ht3 m25915c(mt3 mt3Var) {
        while (mt3Var instanceof sw3) {
            sw3 sw3Var = (sw3) mt3Var;
            this.f26983p.push(sw3Var);
            mt3Var = sw3Var.f28047u;
        }
        return (ht3) mt3Var;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ht3 next() {
        ht3 ht3Var;
        mt3 mt3Var;
        ht3 ht3Var2 = this.f26984q;
        if (ht3Var2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.f26983p;
            ht3Var = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            mt3Var = ((sw3) this.f26983p.pop()).f28048v;
            ht3Var = m25915c(mt3Var);
        } while (ht3Var.m24737j());
        this.f26984q = ht3Var;
        return ht3Var2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f26984q != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
