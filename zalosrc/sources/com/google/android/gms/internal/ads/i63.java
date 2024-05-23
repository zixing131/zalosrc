package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class i63 extends v83 {

    /* renamed from: r */
    final transient Map f22096r;

    /* renamed from: s */
    final /* synthetic */ w63 f22097s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i63(w63 w63Var, Map map) {
        this.f22097s = w63Var;
        this.f22096r = map;
    }

    @Override // com.google.android.gms.internal.ads.v83
    /* renamed from: a */
    protected final Set mo23131a() {
        return new g63(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final Map.Entry m23132b(Map.Entry entry) {
        Object key = entry.getKey();
        return new y73(key, this.f22097s.mo21622j(key, (Collection) entry.getValue()));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map;
        Map map2 = this.f22096r;
        w63 w63Var = this.f22097s;
        map = w63Var.f29832s;
        if (map2 == map) {
            w63Var.zzr();
        } else {
            m83.m24493b(new h63(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f22096r;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this != obj && !this.f22096r.equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) w83.m27579a(this.f22096r, obj);
        if (collection == null) {
            return null;
        }
        return this.f22097s.mo21622j(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f22096r.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        return this.f22097s.m28439g();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f22096r.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection mo21979h = this.f22097s.mo21979h();
        mo21979h.addAll(collection);
        w63.m27541n(this.f22097s, collection.size());
        collection.clear();
        return mo21979h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f22096r.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f22096r.toString();
    }
}
