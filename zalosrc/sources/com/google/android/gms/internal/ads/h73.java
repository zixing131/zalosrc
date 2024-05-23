package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
abstract class h73 implements Iterator {

    /* renamed from: p */
    int f21568p;

    /* renamed from: q */
    int f21569q;

    /* renamed from: r */
    int f21570r;

    /* renamed from: s */
    final /* synthetic */ l73 f21571s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ h73(l73 l73Var, d73 d73Var) {
        int i11;
        this.f21571s = l73Var;
        i11 = l73Var.f23775t;
        this.f21568p = i11;
        this.f21569q = l73Var.m24159g();
        this.f21570r = -1;
    }

    /* renamed from: c */
    private final void m22717c() {
        int i11;
        i11 = this.f21571s.f23775t;
        if (i11 == this.f21568p) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: a */
    abstract Object mo21277a(int i11);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21569q >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        m22717c();
        if (hasNext()) {
            int i11 = this.f21569q;
            this.f21570r = i11;
            Object mo21277a = mo21277a(i11);
            this.f21569q = this.f21571s.m24160h(this.f21569q);
            return mo21277a;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z11;
        m22717c();
        if (this.f21570r >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        j53.m23539i(z11, "no calls to next() since the last call to remove()");
        this.f21568p += 32;
        l73 l73Var = this.f21571s;
        l73Var.remove(l73.m24149i(l73Var, this.f21570r));
        this.f21569q--;
        this.f21570r = -1;
    }
}
