package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes2.dex */
public class q63 extends i63 implements SortedMap {

    /* renamed from: t */
    SortedSet f26662t;

    /* renamed from: u */
    final /* synthetic */ w63 f26663u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q63(w63 w63Var, SortedMap sortedMap) {
        super(w63Var, sortedMap);
        this.f26663u = w63Var;
    }

    /* renamed from: c */
    SortedMap mo24473c() {
        return (SortedMap) this.f22096r;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return mo24473c().comparator();
    }

    /* renamed from: d */
    SortedSet mo24474d() {
        return new r63(this.f26663u, mo24473c());
    }

    @Override // com.google.android.gms.internal.ads.i63, java.util.AbstractMap, java.util.Map
    /* renamed from: e */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f26662t;
        if (sortedSet == null) {
            SortedSet mo24474d = mo24474d();
            this.f26662t = mo24474d;
            return mo24474d;
        }
        return sortedSet;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return mo24473c().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new q63(this.f26663u, mo24473c().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return mo24473c().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new q63(this.f26663u, mo24473c().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new q63(this.f26663u, mo24473c().tailMap(obj));
    }
}
