package p535u2;

import fn0.AbstractC19074t;

/* renamed from: u2.i */
/* loaded from: classes.dex */
public final class C26962i {

    /* renamed from: a */
    public final String f127468a;

    /* renamed from: b */
    private final int f127469b;

    /* renamed from: c */
    public final int f127470c;

    public C26962i(String str, int i11, int i12) {
        AbstractC19074t.m100208f(str, "workSpecId");
        this.f127468a = str;
        this.f127469b = i11;
        this.f127470c = i12;
    }

    /* renamed from: a */
    public final int m138937a() {
        return this.f127469b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26962i)) {
            return false;
        }
        C26962i c26962i = (C26962i) obj;
        return AbstractC19074t.m100204b(this.f127468a, c26962i.f127468a) && this.f127469b == c26962i.f127469b && this.f127470c == c26962i.f127470c;
    }

    public int hashCode() {
        return (((this.f127468a.hashCode() * 31) + this.f127469b) * 31) + this.f127470c;
    }

    public String toString() {
        return "SystemIdInfo(workSpecId=" + this.f127468a + ", generation=" + this.f127469b + ", systemId=" + this.f127470c + ')';
    }
}
