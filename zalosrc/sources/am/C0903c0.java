package am;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: am.c0 */
/* loaded from: classes3.dex */
public final class C0903c0 {

    /* renamed from: a */
    private final String f3379a;

    /* renamed from: b */
    private final String f3380b;

    /* renamed from: c */
    private int f3381c;

    /* renamed from: d */
    private int f3382d;

    public C0903c0(String str, String str2, int i11, int i12) {
        AbstractC19074t.m100208f(str, "appId");
        AbstractC19074t.m100208f(str2, "permissionId");
        this.f3379a = str;
        this.f3380b = str2;
        this.f3381c = i11;
        this.f3382d = i12;
    }

    /* renamed from: a */
    public final int m2791a() {
        return this.f3382d;
    }

    /* renamed from: b */
    public final int m2792b() {
        return this.f3381c;
    }

    /* renamed from: c */
    public final String m2793c() {
        return this.f3380b;
    }

    /* renamed from: d */
    public final void m2794d(int i11) {
        this.f3381c = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0903c0)) {
            return false;
        }
        C0903c0 c0903c0 = (C0903c0) obj;
        return AbstractC19074t.m100204b(this.f3379a, c0903c0.f3379a) && AbstractC19074t.m100204b(this.f3380b, c0903c0.f3380b) && this.f3381c == c0903c0.f3381c && this.f3382d == c0903c0.f3382d;
    }

    public int hashCode() {
        return (((((this.f3379a.hashCode() * 31) + this.f3380b.hashCode()) * 31) + this.f3381c) * 31) + this.f3382d;
    }

    public String toString() {
        return "MPPermission(appId=" + this.f3379a + ", permissionId=" + this.f3380b + ", consentType=" + this.f3381c + ", clientHandle=" + this.f3382d + ")";
    }

    public /* synthetic */ C0903c0(String str, String str2, int i11, int i12, int i13, AbstractC19060k abstractC19060k) {
        this(str, str2, i11, (i13 & 8) != 0 ? 1 : i12);
    }
}
