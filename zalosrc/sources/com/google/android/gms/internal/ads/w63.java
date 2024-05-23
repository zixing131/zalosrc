package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class w63 extends z63 implements Serializable {

    /* renamed from: s */
    private final transient Map f29832s;

    /* renamed from: t */
    private transient int f29833t;

    /* JADX INFO: Access modifiers changed from: protected */
    public w63(Map map) {
        j53.m23535e(map.isEmpty());
        this.f29832s = map;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static /* synthetic */ int m27538k(w63 w63Var) {
        int i11 = w63Var.f29833t;
        w63Var.f29833t = i11 + 1;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static /* synthetic */ int m27539l(w63 w63Var) {
        int i11 = w63Var.f29833t;
        w63Var.f29833t = i11 - 1;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static /* synthetic */ int m27540m(w63 w63Var, int i11) {
        int i12 = w63Var.f29833t + i11;
        w63Var.f29833t = i12;
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static /* synthetic */ int m27541n(w63 w63Var, int i11) {
        int i12 = w63Var.f29833t - i11;
        w63Var.f29833t = i12;
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public static /* synthetic */ void m27543s(w63 w63Var, Object obj) {
        Object obj2;
        try {
            obj2 = w63Var.f29832s.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            w63Var.f29833t -= size;
        }
    }

    @Override // com.google.android.gms.internal.ads.x83
    /* renamed from: b */
    public final boolean mo27544b(Object obj, Object obj2) {
        Collection collection = (Collection) this.f29832s.get(obj);
        if (collection == null) {
            Collection mo21979h = mo21979h();
            if (mo21979h.add(obj2)) {
                this.f29833t++;
                this.f29832s.put(obj, mo21979h);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        }
        if (collection.add(obj2)) {
            this.f29833t++;
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.z63
    /* renamed from: c */
    final Collection mo27545c() {
        return new y63(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.z63
    /* renamed from: d */
    public final Iterator mo27546d() {
        return new f63(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract Collection mo21979h();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract Collection mo21621i(Collection collection);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public abstract Collection mo21622j(Object obj, Collection collection);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public final List m27547o(Object obj, List list, t63 t63Var) {
        if (list instanceof RandomAccess) {
            return new p63(this, obj, list, t63Var);
        }
        return new v63(this, obj, list, t63Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public final Map m27548q() {
        Map map = this.f29832s;
        if (map instanceof NavigableMap) {
            return new m63(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new q63(this, (SortedMap) map);
        }
        return new i63(this, map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public final Set m27549r() {
        Map map = this.f29832s;
        if (map instanceof NavigableMap) {
            return new o63(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new r63(this, (SortedMap) map);
        }
        return new l63(this, map);
    }

    @Override // com.google.android.gms.internal.ads.x83
    public final int zzh() {
        return this.f29833t;
    }

    @Override // com.google.android.gms.internal.ads.x83
    public final void zzr() {
        Iterator it = this.f29832s.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f29832s.clear();
        this.f29833t = 0;
    }
}
