package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class g63 extends s83 {

    /* renamed from: p */
    final /* synthetic */ i63 f20436p;

    public g63(i63 i63Var) {
        this.f20436p = i63Var;
    }

    @Override // com.google.android.gms.internal.ads.s83, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return c73.m20815a(this.f20436p.f22096r.entrySet(), obj);
    }

    @Override // com.google.android.gms.internal.ads.s83
    /* renamed from: d */
    final Map mo22284d() {
        return this.f20436p;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new h63(this.f20436p);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        w63.m27543s(this.f20436p.f22097s, entry.getKey());
        return true;
    }
}
