package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes2.dex */
final class n93 extends h83 {

    /* renamed from: r */
    private final transient f83 f25093r;

    /* renamed from: s */
    private final transient c83 f25094s;

    public n93(f83 f83Var, c83 c83Var) {
        this.f25093r = f83Var;
        this.f25094s = c83Var;
    }

    @Override // com.google.android.gms.internal.ads.x73, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (this.f25093r.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.x73
    /* renamed from: d */
    public final int mo20836d(Object[] objArr, int i11) {
        return this.f25094s.mo20836d(objArr, i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f25094s.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.h83, com.google.android.gms.internal.ads.x73
    /* renamed from: j */
    public final c83 mo20837j() {
        return this.f25094s;
    }

    @Override // com.google.android.gms.internal.ads.h83, com.google.android.gms.internal.ads.x73
    /* renamed from: k */
    public final ba3 mo20838k() {
        return this.f25094s.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f25093r.size();
    }
}
