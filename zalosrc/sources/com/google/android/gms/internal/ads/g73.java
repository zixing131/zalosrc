package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class g73 extends AbstractSet {

    /* renamed from: p */
    final /* synthetic */ l73 f20459p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g73(l73 l73Var) {
        this.f20459p = l73Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f20459p.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int m24138A;
        Map m24161p = this.f20459p.m24161p();
        if (m24161p != null) {
            return m24161p.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            m24138A = this.f20459p.m24138A(entry.getKey());
            if (m24138A != -1 && e53.m21617a(l73.m24152n(this.f20459p, m24138A), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        l73 l73Var = this.f20459p;
        Map m24161p = l73Var.m24161p();
        if (m24161p != null) {
            return m24161p.entrySet().iterator();
        }
        return new e73(l73Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int m24158z;
        int[] m24142E;
        Object[] m24143a;
        Object[] m24144b;
        Map m24161p = this.f20459p.m24161p();
        if (m24161p != null) {
            return m24161p.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        l73 l73Var = this.f20459p;
        if (!l73Var.m24165v()) {
            m24158z = l73Var.m24158z();
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object m24153o = l73.m24153o(this.f20459p);
            m24142E = this.f20459p.m24142E();
            m24143a = this.f20459p.m24143a();
            m24144b = this.f20459p.m24144b();
            int m24485b = m73.m24485b(key, value, m24158z, m24153o, m24142E, m24143a, m24144b);
            if (m24485b == -1) {
                return false;
            }
            this.f20459p.m24164u(m24485b, m24158z);
            l73.m24146d(this.f20459p);
            this.f20459p.m24162r();
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f20459p.size();
    }
}
