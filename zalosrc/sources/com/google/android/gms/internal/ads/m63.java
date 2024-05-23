package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class m63 extends q63 implements NavigableMap {

    /* renamed from: v */
    final /* synthetic */ w63 f24413v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m63(w63 w63Var, NavigableMap navigableMap) {
        super(w63Var, navigableMap);
        this.f24413v = w63Var;
    }

    @Override // com.google.android.gms.internal.ads.q63
    /* renamed from: c */
    final /* synthetic */ SortedMap mo24473c() {
        return (NavigableMap) ((SortedMap) this.f22096r);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = ((NavigableMap) ((SortedMap) this.f22096r)).ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return m23132b(ceilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f22096r)).ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new m63(this.f24413v, ((NavigableMap) ((SortedMap) this.f22096r)).descendingMap());
    }

    @Override // com.google.android.gms.internal.ads.q63
    /* renamed from: e */
    public final /* synthetic */ SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    /* renamed from: f */
    final Map.Entry m24476f(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Collection mo21979h = this.f24413v.mo21979h();
        mo21979h.addAll((Collection) entry.getValue());
        it.remove();
        return new y73(entry.getKey(), this.f24413v.mo21621i(mo21979h));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry firstEntry = ((NavigableMap) ((SortedMap) this.f22096r)).firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return m23132b(firstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = ((NavigableMap) ((SortedMap) this.f22096r)).floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return m23132b(floorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f22096r)).floorKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.q63
    /* renamed from: g */
    public final NavigableSet mo24474d() {
        return new o63(this.f24413v, (NavigableMap) ((SortedMap) this.f22096r));
    }

    @Override // com.google.android.gms.internal.ads.q63, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = ((NavigableMap) ((SortedMap) this.f22096r)).higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return m23132b(higherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f22096r)).higherKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.q63, com.google.android.gms.internal.ads.i63, java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry lastEntry = ((NavigableMap) ((SortedMap) this.f22096r)).lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return m23132b(lastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = ((NavigableMap) ((SortedMap) this.f22096r)).lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return m23132b(lowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f22096r)).lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return m24476f(entrySet().iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return m24476f(descendingMap().entrySet().iterator());
    }

    @Override // com.google.android.gms.internal.ads.q63, java.util.SortedMap, java.util.NavigableMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // com.google.android.gms.internal.ads.q63, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z11) {
        return new m63(this.f24413v, ((NavigableMap) ((SortedMap) this.f22096r)).headMap(obj, z11));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z11, Object obj2, boolean z12) {
        return new m63(this.f24413v, ((NavigableMap) ((SortedMap) this.f22096r)).subMap(obj, z11, obj2, z12));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z11) {
        return new m63(this.f24413v, ((NavigableMap) ((SortedMap) this.f22096r)).tailMap(obj, z11));
    }
}
