package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
final class y63 extends AbstractCollection {

    /* renamed from: p */
    final /* synthetic */ z63 f30818p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y63(z63 z63Var) {
        this.f30818p = z63Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f30818p.zzr();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        Iterator it = this.f30818p.mo27863a().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f30818p.mo27546d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f30818p.zzh();
    }
}
