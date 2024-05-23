package p535u2;

import fn0.AbstractC19074t;

/* renamed from: u2.n */
/* loaded from: classes.dex */
public final class C26967n {

    /* renamed from: a */
    private final String f127478a;

    /* renamed from: b */
    private final int f127479b;

    public C26967n(String str, int i11) {
        AbstractC19074t.m100208f(str, "workSpecId");
        this.f127478a = str;
        this.f127479b = i11;
    }

    /* renamed from: a */
    public final int m138954a() {
        return this.f127479b;
    }

    /* renamed from: b */
    public final String m138955b() {
        return this.f127478a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26967n)) {
            return false;
        }
        C26967n c26967n = (C26967n) obj;
        return AbstractC19074t.m100204b(this.f127478a, c26967n.f127478a) && this.f127479b == c26967n.f127479b;
    }

    public int hashCode() {
        return (this.f127478a.hashCode() * 31) + this.f127479b;
    }

    public String toString() {
        return "WorkGenerationalId(workSpecId=" + this.f127478a + ", generation=" + this.f127479b + ')';
    }
}
