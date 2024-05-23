package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class i73 extends AbstractSet {

    /* renamed from: p */
    final /* synthetic */ l73 f22113p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i73(l73 l73Var) {
        this.f22113p = l73Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f22113p.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f22113p.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        l73 l73Var = this.f22113p;
        Map m24161p = l73Var.m24161p();
        if (m24161p != null) {
            return m24161p.keySet().iterator();
        }
        return new d73(l73Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object m24140C;
        Object obj2;
        Map m24161p = this.f22113p.m24161p();
        if (m24161p == null) {
            m24140C = this.f22113p.m24140C(obj);
            obj2 = l73.f23770y;
            if (m24140C == obj2) {
                return false;
            }
            return true;
        }
        return m24161p.keySet().remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f22113p.size();
    }
}
