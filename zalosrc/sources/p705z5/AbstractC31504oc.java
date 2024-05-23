package p705z5;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* renamed from: z5.oc */
/* loaded from: classes2.dex */
public abstract class AbstractC31504oc implements Map, Serializable {

    /* renamed from: p */
    private transient AbstractC31518pc f145019p;

    /* renamed from: q */
    private transient AbstractC31518pc f145020q;

    /* renamed from: r */
    private transient AbstractC31460la f145021r;

    /* renamed from: c */
    public static AbstractC31504oc m152330c(Object obj, Object obj2) {
        AbstractC31415i7.m152250a("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return C31616wc.m152363g(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    }

    /* renamed from: a */
    abstract AbstractC31460la mo152331a();

    @Override // java.util.Map
    /* renamed from: b */
    public final AbstractC31460la values() {
        AbstractC31460la abstractC31460la = this.f145021r;
        if (abstractC31460la == null) {
            AbstractC31460la mo152331a = mo152331a();
            this.f145021r = mo152331a;
            return mo152331a;
        }
        return abstractC31460la;
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
    abstract AbstractC31518pc mo152333d();

    /* renamed from: e */
    abstract AbstractC31518pc mo152334e();

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
    public final AbstractC31518pc entrySet() {
        AbstractC31518pc abstractC31518pc = this.f145019p;
        if (abstractC31518pc == null) {
            AbstractC31518pc mo152333d = mo152333d();
            this.f145019p = mo152333d;
            return mo152333d;
        }
        return abstractC31518pc;
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
        return AbstractC31309b.m152216a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        AbstractC31518pc abstractC31518pc = this.f145020q;
        if (abstractC31518pc == null) {
            AbstractC31518pc mo152334e = mo152334e();
            this.f145020q = mo152334e;
            return mo152334e;
        }
        return abstractC31518pc;
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
