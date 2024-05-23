package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class k73 extends AbstractCollection {

    /* renamed from: p */
    final /* synthetic */ l73 f23181p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k73(l73 l73Var) {
        this.f23181p = l73Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f23181p.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        l73 l73Var = this.f23181p;
        Map m24161p = l73Var.m24161p();
        if (m24161p != null) {
            return m24161p.values().iterator();
        }
        return new f73(l73Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f23181p.size();
    }
}
