package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class zz3 extends AbstractList {

    /* renamed from: r */
    private static final b04 f31736r = b04.m20367b(zz3.class);

    /* renamed from: p */
    final List f31737p;

    /* renamed from: q */
    final Iterator f31738q;

    public zz3(List list, Iterator it) {
        this.f31737p = list;
        this.f31738q = it;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        if (this.f31737p.size() > i11) {
            return this.f31737p.get(i11);
        }
        if (this.f31738q.hasNext()) {
            this.f31737p.add(this.f31738q.next());
            return get(i11);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new yz3(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        b04 b04Var = f31736r;
        b04Var.mo20368a("potentially expensive size() call");
        b04Var.mo20368a("blowup running");
        while (this.f31738q.hasNext()) {
            this.f31737p.add(this.f31738q.next());
        }
        return this.f31737p.size();
    }
}
