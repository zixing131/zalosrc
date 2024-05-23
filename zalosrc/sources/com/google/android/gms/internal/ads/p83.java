package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class p83 extends AbstractSequentialList implements Serializable {

    /* renamed from: p */
    final List f26109p;

    /* renamed from: q */
    final y43 f26110q;

    public p83(List list, y43 y43Var) {
        this.f26109p = list;
        this.f26110q = y43Var;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f26109p.clear();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i11) {
        return new o83(this, this.f26109p.listIterator(i11));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26109p.size();
    }
}
