package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes2.dex */
final class u63 extends s63 implements ListIterator {

    /* renamed from: s */
    final /* synthetic */ v63 f28777s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u63(v63 v63Var) {
        super(v63Var);
        this.f28777s = v63Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        boolean isEmpty = this.f28777s.isEmpty();
        m26253a();
        ((ListIterator) this.f27572p).add(obj);
        w63.m27538k(this.f28777s.f29211u);
        if (isEmpty) {
            this.f28777s.m26575d();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        m26253a();
        return ((ListIterator) this.f27572p).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        m26253a();
        return ((ListIterator) this.f27572p).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        m26253a();
        return ((ListIterator) this.f27572p).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        m26253a();
        return ((ListIterator) this.f27572p).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        m26253a();
        ((ListIterator) this.f27572p).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u63(v63 v63Var, int i11) {
        super(v63Var, ((List) v63Var.f28238q).listIterator(i11));
        this.f28777s = v63Var;
    }
}
