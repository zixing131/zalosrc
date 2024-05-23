package ik0;

import fn0.AbstractC19074t;

/* renamed from: ik0.n */
/* loaded from: classes7.dex */
public final class C20591n {

    /* renamed from: a */
    private final Object f101293a;

    /* renamed from: b */
    private final int f101294b;

    public C20591n(Object obj, int i11) {
        AbstractC19074t.m100208f(obj, "resource");
        this.f101293a = obj;
        this.f101294b = i11;
    }

    /* renamed from: a */
    public final Object m107150a() {
        return this.f101293a;
    }

    /* renamed from: b */
    public final int m107151b() {
        return this.f101294b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20591n)) {
            return false;
        }
        C20591n c20591n = (C20591n) obj;
        return AbstractC19074t.m100204b(this.f101293a, c20591n.f101293a) && this.f101294b == c20591n.f101294b;
    }

    public int hashCode() {
        return (this.f101293a.hashCode() * 31) + this.f101294b;
    }

    public String toString() {
        return "ResourcePreloadHolder(resource=" + this.f101293a + ", type=" + this.f101294b + ')';
    }
}
