package com.google.protobuf;

import com.google.protobuf.AbstractC6830s;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.protobuf.c0 */
/* loaded from: classes3.dex */
public final class C6791c0 extends LinkedHashMap {

    /* renamed from: q */
    private static final C6791c0 f37248q;

    /* renamed from: p */
    private boolean f37249p;

    static {
        C6791c0 c6791c0 = new C6791c0();
        f37248q = c6791c0;
        c6791c0.m34749k();
    }

    private C6791c0() {
        this.f37249p = true;
    }

    /* renamed from: a */
    static int m34741a(Map map) {
        int i11 = 0;
        for (Map.Entry entry : map.entrySet()) {
            i11 += m34742b(entry.getValue()) ^ m34742b(entry.getKey());
        }
        return i11;
    }

    /* renamed from: b */
    private static int m34742b(Object obj) {
        if (obj instanceof byte[]) {
            return AbstractC6830s.m35132d((byte[]) obj);
        }
        if (!(obj instanceof AbstractC6830s.a)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    private static void m34743c(Map map) {
        for (Object obj : map.keySet()) {
            AbstractC6830s.m35129a(obj);
            AbstractC6830s.m35129a(map.get(obj));
        }
    }

    /* renamed from: e */
    public static C6791c0 m34744e() {
        return f37248q;
    }

    /* renamed from: f */
    private void m34745f() {
        if (m34748i()) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: g */
    private static boolean m34746g(Object obj, Object obj2) {
        if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
            return Arrays.equals((byte[]) obj, (byte[]) obj2);
        }
        return obj.equals(obj2);
    }

    /* renamed from: h */
    static boolean m34747h(Map map, Map map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !m34746g(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        m34745f();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (isEmpty()) {
            return Collections.emptySet();
        }
        return super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if ((obj instanceof Map) && m34747h(this, (Map) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return m34741a(this);
    }

    /* renamed from: i */
    public boolean m34748i() {
        return this.f37249p;
    }

    /* renamed from: k */
    public void m34749k() {
        this.f37249p = false;
    }

    /* renamed from: l */
    public void m34750l(C6791c0 c6791c0) {
        m34745f();
        if (!c6791c0.isEmpty()) {
            putAll(c6791c0);
        }
    }

    /* renamed from: n */
    public C6791c0 m34751n() {
        if (isEmpty()) {
            return new C6791c0();
        }
        return new C6791c0(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        m34745f();
        AbstractC6830s.m35129a(obj);
        AbstractC6830s.m35129a(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        m34745f();
        m34743c(map);
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        m34745f();
        return super.remove(obj);
    }

    private C6791c0(Map map) {
        super(map);
        this.f37249p = true;
    }
}
