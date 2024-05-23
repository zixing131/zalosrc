package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes2.dex */
public final class o63 extends r63 implements NavigableSet {

    /* renamed from: s */
    final /* synthetic */ w63 f25455s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o63(w63 w63Var, NavigableMap navigableMap) {
        super(w63Var, navigableMap);
        this.f25455s = w63Var;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f28259p)).ceilingKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.r63
    /* renamed from: d */
    final /* synthetic */ SortedMap mo25092d() {
        return (NavigableMap) ((SortedMap) this.f28259p);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new o63(this.f25455s, ((NavigableMap) ((SortedMap) this.f28259p)).descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f28259p)).floorKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.r63, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f28259p)).higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f28259p)).lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        return m83.m24492a(iterator());
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        return m83.m24492a(descendingIterator());
    }

    @Override // com.google.android.gms.internal.ads.r63, java.util.SortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // com.google.android.gms.internal.ads.r63, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z11) {
        return new o63(this.f25455s, ((NavigableMap) ((SortedMap) this.f28259p)).headMap(obj, z11));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z11, Object obj2, boolean z12) {
        return new o63(this.f25455s, ((NavigableMap) ((SortedMap) this.f28259p)).subMap(obj, z11, obj2, z12));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z11) {
        return new o63(this.f25455s, ((NavigableMap) ((SortedMap) this.f28259p)).tailMap(obj, z11));
    }
}
