package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.measurement.pa */
/* loaded from: classes2.dex */
public final class C5545pa extends LinkedHashMap {

    /* renamed from: q */
    private static final C5545pa f32721q;

    /* renamed from: p */
    private boolean f32722p;

    static {
        C5545pa c5545pa = new C5545pa();
        f32721q = c5545pa;
        c5545pa.f32722p = false;
    }

    private C5545pa() {
        this.f32722p = true;
    }

    /* renamed from: a */
    public static C5545pa m29529a() {
        return f32721q;
    }

    /* renamed from: g */
    private static int m29530g(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = AbstractC5290aa.f32259d;
            int length = bArr.length;
            int m28883b = AbstractC5290aa.m28883b(length, bArr, 0, length);
            if (m28883b == 0) {
                return 1;
            }
            return m28883b;
        }
        return obj.hashCode();
    }

    /* renamed from: h */
    private final void m29531h() {
        if (this.f32722p) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: b */
    public final C5545pa m29532b() {
        if (isEmpty()) {
            return new C5545pa();
        }
        return new C5545pa(this);
    }

    /* renamed from: c */
    public final void m29533c() {
        this.f32722p = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m29531h();
        super.clear();
    }

    /* renamed from: e */
    public final void m29534e(C5545pa c5545pa) {
        m29531h();
        if (!c5545pa.isEmpty()) {
            putAll(c5545pa);
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
    public final boolean m29535f() {
        return this.f32722p;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            i11 += m29530g(entry.getValue()) ^ m29530g(entry.getKey());
        }
        return i11;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m29531h();
        byte[] bArr = AbstractC5290aa.f32259d;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m29531h();
        for (Object obj : map.keySet()) {
            byte[] bArr = AbstractC5290aa.f32259d;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m29531h();
        return super.remove(obj);
    }

    private C5545pa(Map map) {
        super(map);
        this.f32722p = true;
    }
}
