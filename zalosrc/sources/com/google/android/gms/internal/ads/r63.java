package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes2.dex */
public class r63 extends l63 implements SortedSet {

    /* renamed from: r */
    final /* synthetic */ w63 f27116r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r63(w63 w63Var, SortedMap sortedMap) {
        super(w63Var, sortedMap);
        this.f27116r = w63Var;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return mo25092d().comparator();
    }

    /* renamed from: d */
    SortedMap mo25092d() {
        return (SortedMap) this.f28259p;
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return mo25092d().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new r63(this.f27116r, mo25092d().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return mo25092d().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new r63(this.f27116r, mo25092d().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new r63(this.f27116r, mo25092d().tailMap(obj));
    }
}
