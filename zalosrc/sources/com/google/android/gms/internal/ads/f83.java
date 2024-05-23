package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class f83 implements Map, Serializable {

    /* renamed from: p */
    private transient h83 f20069p;

    /* renamed from: q */
    private transient h83 f20070q;

    /* renamed from: r */
    private transient x73 f20071r;

    /* renamed from: c */
    public static f83 m21966c(Map map) {
        int i11;
        Set entrySet = map.entrySet();
        if (entrySet instanceof Collection) {
            i11 = entrySet.size();
        } else {
            i11 = 4;
        }
        e83 e83Var = new e83(i11);
        e83Var.m21629b(entrySet);
        return e83Var.m21630c();
    }

    /* renamed from: d */
    public static f83 m21967d() {
        return q93.f26693v;
    }

    /* renamed from: a */
    abstract x73 mo21968a();

    @Override // java.util.Map
    /* renamed from: b */
    public final x73 values() {
        x73 x73Var = this.f20071r;
        if (x73Var == null) {
            x73 mo21968a = mo21968a();
            this.f20071r = mo21968a;
            return mo21968a;
        }
        return x73Var;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    /* renamed from: e */
    abstract h83 mo21970e();

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return w83.m27580b(this, obj);
    }

    /* renamed from: f */
    abstract h83 mo21971f();

    @Override // java.util.Map
    /* renamed from: g */
    public final h83 entrySet() {
        h83 h83Var = this.f20069p;
        if (h83Var == null) {
            h83 mo21970e = mo21970e();
            this.f20069p = mo21970e;
            return mo21970e;
        }
        return h83Var;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    @Override // java.util.Map
    /* renamed from: h */
    public final h83 keySet() {
        h83 h83Var = this.f20070q;
        if (h83Var == null) {
            h83 mo21971f = mo21971f();
            this.f20070q = mo21971f;
            return mo21971f;
        }
        return h83Var;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return x93.m27868a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        a73.m20019a(size, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb2.append('{');
        boolean z11 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z11) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z11 = false;
        }
        sb2.append('}');
        return sb2.toString();
    }
}
