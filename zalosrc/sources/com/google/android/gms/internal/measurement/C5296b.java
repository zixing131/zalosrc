package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.b */
/* loaded from: classes2.dex */
public final class C5296b {

    /* renamed from: a */
    private String f32266a;

    /* renamed from: b */
    private final long f32267b;

    /* renamed from: c */
    private final Map f32268c;

    public C5296b(String str, long j11, Map map) {
        this.f32266a = str;
        this.f32267b = j11;
        HashMap hashMap = new HashMap();
        this.f32268c = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    /* renamed from: a */
    public final long m28898a() {
        return this.f32267b;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C5296b clone() {
        return new C5296b(this.f32266a, this.f32267b, new HashMap(this.f32268c));
    }

    /* renamed from: c */
    public final Object m28900c(String str) {
        if (this.f32268c.containsKey(str)) {
            return this.f32268c.get(str);
        }
        return null;
    }

    /* renamed from: d */
    public final String m28901d() {
        return this.f32266a;
    }

    /* renamed from: e */
    public final Map m28902e() {
        return this.f32268c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5296b)) {
            return false;
        }
        C5296b c5296b = (C5296b) obj;
        if (this.f32267b != c5296b.f32267b || !this.f32266a.equals(c5296b.f32266a)) {
            return false;
        }
        return this.f32268c.equals(c5296b.f32268c);
    }

    /* renamed from: f */
    public final void m28903f(String str) {
        this.f32266a = str;
    }

    /* renamed from: g */
    public final void m28904g(String str, Object obj) {
        if (obj == null) {
            this.f32268c.remove(str);
        } else {
            this.f32268c.put(str, obj);
        }
    }

    public final int hashCode() {
        int hashCode = this.f32266a.hashCode() * 31;
        long j11 = this.f32267b;
        return ((hashCode + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f32268c.hashCode();
    }

    public final String toString() {
        return "Event{name='" + this.f32266a + "', timestamp=" + this.f32267b + ", params=" + this.f32268c.toString() + "}";
    }
}
