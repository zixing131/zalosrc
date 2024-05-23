package p633x5;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* renamed from: x5.p */
/* loaded from: classes2.dex */
public abstract class AbstractC29362p implements Map, Serializable {

    /* renamed from: p */
    private transient AbstractC29364q f135851p;

    /* renamed from: q */
    private transient AbstractC29364q f135852q;

    /* renamed from: r */
    private transient AbstractC29350j f135853r;

    /* renamed from: c */
    public static AbstractC29362p m146503c(Object obj, Object obj2) {
        AbstractC29342f.m146483a("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return C29378x.m146517g(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    }

    /* renamed from: a */
    abstract AbstractC29350j mo146504a();

    @Override // java.util.Map
    /* renamed from: b */
    public final AbstractC29350j values() {
        AbstractC29350j abstractC29350j = this.f135853r;
        if (abstractC29350j == null) {
            AbstractC29350j mo146504a = mo146504a();
            this.f135853r = mo146504a;
            return mo146504a;
        }
        return abstractC29350j;
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

    /* renamed from: d */
    abstract AbstractC29364q mo146506d();

    /* renamed from: e */
    abstract AbstractC29364q mo146507e();

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
    /* renamed from: f */
    public final AbstractC29364q entrySet() {
        AbstractC29364q abstractC29364q = this.f135851p;
        if (abstractC29364q == null) {
            AbstractC29364q mo146506d = mo146506d();
            this.f135851p = mo146506d;
            return mo146506d;
        }
        return abstractC29364q;
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
        return AbstractC29380y.m146520a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        AbstractC29364q abstractC29364q = this.f135852q;
        if (abstractC29364q == null) {
            AbstractC29364q mo146507e = mo146507e();
            this.f135852q = mo146507e;
            return mo146507e;
        }
        return abstractC29364q;
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
