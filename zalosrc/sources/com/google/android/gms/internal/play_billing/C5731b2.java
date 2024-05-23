package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.play_billing.b2 */
/* loaded from: classes2.dex */
public final class C5731b2 extends LinkedHashMap {

    /* renamed from: q */
    private static final C5731b2 f33243q;

    /* renamed from: p */
    private boolean f33244p;

    static {
        C5731b2 c5731b2 = new C5731b2();
        f33243q = c5731b2;
        c5731b2.f33244p = false;
    }

    private C5731b2() {
        this.f33244p = true;
    }

    /* renamed from: a */
    public static C5731b2 m30174a() {
        return f33243q;
    }

    /* renamed from: g */
    private static int m30175g(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = AbstractC5804n1.f33378d;
            int length = bArr.length;
            int m30376b = AbstractC5804n1.m30376b(length, bArr, 0, length);
            if (m30376b == 0) {
                return 1;
            }
            return m30376b;
        }
        return obj.hashCode();
    }

    /* renamed from: h */
    private final void m30176h() {
        if (this.f33244p) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: b */
    public final C5731b2 m30177b() {
        if (isEmpty()) {
            return new C5731b2();
        }
        return new C5731b2(this);
    }

    /* renamed from: c */
    public final void m30178c() {
        this.f33244p = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m30176h();
        super.clear();
    }

    /* renamed from: e */
    public final void m30179e(C5731b2 c5731b2) {
        m30176h();
        if (!c5731b2.isEmpty()) {
            putAll(c5731b2);
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
    public final boolean m30180f() {
        return this.f33244p;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            i11 += m30175g(entry.getValue()) ^ m30175g(entry.getKey());
        }
        return i11;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m30176h();
        byte[] bArr = AbstractC5804n1.f33378d;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m30176h();
        for (Object obj : map.keySet()) {
            byte[] bArr = AbstractC5804n1.f33378d;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m30176h();
        return super.remove(obj);
    }

    private C5731b2(Map map) {
        super(map);
        this.f33244p = true;
    }
}
