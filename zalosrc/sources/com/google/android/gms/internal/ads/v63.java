package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class v63 extends t63 implements List {

    /* renamed from: u */
    final /* synthetic */ w63 f29211u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v63(w63 w63Var, Object obj, List list, t63 t63Var) {
        super(w63Var, obj, list, t63Var);
        this.f29211u = w63Var;
    }

    @Override // java.util.List
    public final void add(int i11, Object obj) {
        zzb();
        boolean isEmpty = this.f28238q.isEmpty();
        ((List) this.f28238q).add(i11, obj);
        w63.m27538k(this.f29211u);
        if (isEmpty) {
            m26575d();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i11, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f28238q).addAll(i11, collection);
        if (addAll) {
            w63.m27540m(this.f29211u, this.f28238q.size() - size);
            if (size == 0) {
                m26575d();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        zzb();
        return ((List) this.f28238q).get(i11);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.f28238q).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.f28238q).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new u63(this);
    }

    @Override // java.util.List
    public final Object remove(int i11) {
        zzb();
        Object remove = ((List) this.f28238q).remove(i11);
        w63.m27539l(this.f29211u);
        m26576e();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i11, Object obj) {
        zzb();
        return ((List) this.f28238q).set(i11, obj);
    }

    @Override // java.util.List
    public final List subList(int i11, int i12) {
        zzb();
        w63 w63Var = this.f29211u;
        Object obj = this.f28237p;
        List subList = ((List) this.f28238q).subList(i11, i12);
        t63 t63Var = this.f28239r;
        if (t63Var == null) {
            t63Var = this;
        }
        return w63Var.m27547o(obj, subList, t63Var);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i11) {
        zzb();
        return new u63(this, i11);
    }
}
