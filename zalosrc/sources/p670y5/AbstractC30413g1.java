package p670y5;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* renamed from: y5.g1 */
/* loaded from: classes2.dex */
public abstract class AbstractC30413g1 implements Map, Serializable {

    /* renamed from: p */
    private transient AbstractC30432h1 f141160p;

    /* renamed from: q */
    private transient AbstractC30432h1 f141161q;

    /* renamed from: r */
    private transient AbstractC30754y0 f141162r;

    /* renamed from: c */
    public static AbstractC30413g1 m149505c(Object obj, Object obj2) {
        AbstractC30469j0.m149552b("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return C30736x1.m149686g(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    }

    /* renamed from: a */
    abstract AbstractC30754y0 mo149506a();

    @Override // java.util.Map
    /* renamed from: b */
    public final AbstractC30754y0 values() {
        AbstractC30754y0 abstractC30754y0 = this.f141162r;
        if (abstractC30754y0 == null) {
            AbstractC30754y0 mo149506a = mo149506a();
            this.f141162r = mo149506a;
            return mo149506a;
        }
        return abstractC30754y0;
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
    abstract AbstractC30432h1 mo149508d();

    /* renamed from: e */
    abstract AbstractC30432h1 mo149509e();

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
    public final AbstractC30432h1 entrySet() {
        AbstractC30432h1 abstractC30432h1 = this.f141160p;
        if (abstractC30432h1 == null) {
            AbstractC30432h1 mo149508d = mo149508d();
            this.f141160p = mo149508d;
            return mo149508d;
        }
        return abstractC30432h1;
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
        return AbstractC30774z1.m149737a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        AbstractC30432h1 abstractC30432h1 = this.f141161q;
        if (abstractC30432h1 == null) {
            AbstractC30432h1 mo149509e = mo149509e();
            this.f141161q = mo149509e;
            return mo149509e;
        }
        return abstractC30432h1;
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
        AbstractC30469j0.m149551a(size, "size");
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
