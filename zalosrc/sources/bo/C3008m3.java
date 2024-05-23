package bo;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: bo.m3 */
/* loaded from: classes4.dex */
public final class C3008m3 {

    /* renamed from: a */
    private String f11977a;

    /* renamed from: b */
    private String f11978b;

    /* renamed from: c */
    private boolean f11979c;

    /* renamed from: d */
    private String f11980d;

    /* renamed from: e */
    private int f11981e;

    public C3008m3(String str, String str2) {
        AbstractC19074t.m100208f(str, "title");
        AbstractC19074t.m100208f(str2, "desc");
        this.f11977a = str;
        this.f11978b = str2;
        this.f11980d = "";
    }

    /* renamed from: a */
    public final String m14419a() {
        return this.f11978b;
    }

    /* renamed from: b */
    public final int m14420b() {
        return this.f11981e;
    }

    /* renamed from: c */
    public final String m14421c() {
        return this.f11977a;
    }

    /* renamed from: d */
    public final String m14422d() {
        return this.f11980d;
    }

    /* renamed from: e */
    public final void m14423e(int i11) {
        this.f11981e = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3008m3)) {
            return false;
        }
        C3008m3 c3008m3 = (C3008m3) obj;
        return AbstractC19074t.m100204b(this.f11977a, c3008m3.f11977a) && AbstractC19074t.m100204b(this.f11978b, c3008m3.f11978b);
    }

    /* renamed from: f */
    public final void m14424f(String str) {
        AbstractC19074t.m100208f(str, "value");
        this.f11980d = str;
        this.f11979c = true;
    }

    public int hashCode() {
        return (this.f11977a.hashCode() * 31) + this.f11978b.hashCode();
    }

    public String toString() {
        return "TitleDividerData(title=" + this.f11977a + ", desc=" + this.f11978b + ")";
    }

    public /* synthetic */ C3008m3(String str, String str2, int i11, AbstractC19060k abstractC19060k) {
        this(str, (i11 & 2) != 0 ? "" : str2);
    }
}
