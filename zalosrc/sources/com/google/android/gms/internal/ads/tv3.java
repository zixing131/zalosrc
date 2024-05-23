package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class tv3 extends LinkedHashMap {

    /* renamed from: q */
    private static final tv3 f28554q;

    /* renamed from: p */
    private boolean f28555p;

    static {
        tv3 tv3Var = new tv3();
        f28554q = tv3Var;
        tv3Var.f28555p = false;
    }

    private tv3() {
        this.f28555p = true;
    }

    /* renamed from: a */
    public static tv3 m26781a() {
        return f28554q;
    }

    /* renamed from: g */
    private static int m26782g(Object obj) {
        if (obj instanceof byte[]) {
            return dv3.m21547b((byte[]) obj);
        }
        if (!(obj instanceof vu3)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: h */
    private final void m26783h() {
        if (this.f28555p) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: b */
    public final tv3 m26784b() {
        if (isEmpty()) {
            return new tv3();
        }
        return new tv3(this);
    }

    /* renamed from: c */
    public final void m26785c() {
        this.f28555p = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m26783h();
        super.clear();
    }

    /* renamed from: e */
    public final void m26786e(tv3 tv3Var) {
        m26783h();
        if (!tv3Var.isEmpty()) {
            putAll(tv3Var);
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (isEmpty()) {
            return Collections.emptySet();
        }
        return super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean equals;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    Iterator it = entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (map.containsKey(entry.getKey())) {
                            Object value = entry.getValue();
                            Object obj2 = map.get(entry.getKey());
                            if ((value instanceof byte[]) && (obj2 instanceof byte[])) {
                                equals = Arrays.equals((byte[]) value, (byte[]) obj2);
                            } else {
                                equals = value.equals(obj2);
                            }
                            if (!equals) {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m26787f() {
        return this.f28555p;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            i11 += m26782g(entry.getValue()) ^ m26782g(entry.getKey());
        }
        return i11;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m26783h();
        dv3.m21550e(obj);
        dv3.m21550e(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m26783h();
        for (Object obj : map.keySet()) {
            dv3.m21550e(obj);
            dv3.m21550e(map.get(obj));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m26783h();
        return super.remove(obj);
    }

    private tv3(Map map) {
        super(map);
        this.f28555p = true;
    }
}
