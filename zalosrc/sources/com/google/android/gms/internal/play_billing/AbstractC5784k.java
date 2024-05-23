package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.play_billing.k */
/* loaded from: classes2.dex */
public abstract class AbstractC5784k implements Map, Serializable {

    /* renamed from: p */
    private transient AbstractC5790l f33340p;

    /* renamed from: q */
    private transient AbstractC5790l f33341q;

    /* renamed from: r */
    private transient AbstractC5748e f33342r;

    /* renamed from: a */
    abstract AbstractC5748e mo30303a();

    @Override // java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC5748e values() {
        AbstractC5748e abstractC5748e = this.f33342r;
        if (abstractC5748e == null) {
            AbstractC5748e mo30303a = mo30303a();
            this.f33342r = mo30303a;
            return mo30303a;
        }
        return abstractC5748e;
    }

    /* renamed from: c */
    abstract AbstractC5790l mo30305c();

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

    /* renamed from: d */
    abstract AbstractC5790l mo30306d();

    @Override // java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final AbstractC5790l entrySet() {
        AbstractC5790l abstractC5790l = this.f33340p;
        if (abstractC5790l == null) {
            AbstractC5790l mo30305c = mo30305c();
            this.f33340p = mo30305c;
            return mo30305c;
        }
        return abstractC5790l;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return entrySet().equals(((Map) obj).entrySet());
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
    public final int hashCode() {
        return AbstractC5838t.m30478a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        AbstractC5790l abstractC5790l = this.f33341q;
        if (abstractC5790l == null) {
            AbstractC5790l mo30306d = mo30306d();
            this.f33341q = mo30306d;
            return mo30306d;
        }
        return abstractC5790l;
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
        if (size >= 0) {
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
        throw new IllegalArgumentException("size cannot be negative but was: " + size);
    }
}
