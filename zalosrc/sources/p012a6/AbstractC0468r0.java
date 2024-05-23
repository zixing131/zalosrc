package p012a6;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* renamed from: a6.r0 */
/* loaded from: classes2.dex */
public abstract class AbstractC0468r0 implements Map, Serializable {

    /* renamed from: p */
    private transient AbstractC0487s0 f1835p;

    /* renamed from: q */
    private transient AbstractC0487s0 f1836q;

    /* renamed from: r */
    private transient AbstractC0335k0 f1837r;

    /* renamed from: c */
    public static AbstractC0468r0 m860c(Object obj, Object obj2) {
        AbstractC0524u.m877b("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return C0412o1.m791g(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    }

    /* renamed from: a */
    abstract AbstractC0335k0 mo792a();

    @Override // java.util.Map
    /* renamed from: b */
    public final AbstractC0335k0 values() {
        AbstractC0335k0 abstractC0335k0 = this.f1837r;
        if (abstractC0335k0 == null) {
            AbstractC0335k0 mo792a = mo792a();
            this.f1837r = mo792a;
            return mo792a;
        }
        return abstractC0335k0;
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
    abstract AbstractC0487s0 mo793d();

    /* renamed from: e */
    abstract AbstractC0487s0 mo794e();

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
    public final AbstractC0487s0 entrySet() {
        AbstractC0487s0 abstractC0487s0 = this.f1835p;
        if (abstractC0487s0 == null) {
            AbstractC0487s0 mo793d = mo793d();
            this.f1835p = mo793d;
            return mo793d;
        }
        return abstractC0487s0;
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
        return AbstractC0450q1.m843a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        AbstractC0487s0 abstractC0487s0 = this.f1836q;
        if (abstractC0487s0 == null) {
            AbstractC0487s0 mo794e = mo794e();
            this.f1836q = mo794e;
            return mo794e;
        }
        return abstractC0487s0;
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
        AbstractC0524u.m876a(size, "size");
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
