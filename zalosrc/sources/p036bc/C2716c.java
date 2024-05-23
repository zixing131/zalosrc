package p036bc;

import fn0.AbstractC19074t;
import p535u2.AbstractC26974u;

/* renamed from: bc.c */
/* loaded from: classes.dex */
public final class C2716c {

    /* renamed from: a */
    private final String f10804a;

    /* renamed from: b */
    private final long f10805b;

    /* renamed from: c */
    private final long f10806c;

    /* renamed from: d */
    private long f10807d;

    /* renamed from: e */
    private String f10808e;

    /* renamed from: f */
    private String f10809f;

    /* renamed from: g */
    private String f10810g;

    /* renamed from: h */
    private String f10811h;

    public C2716c(String str, long j11, long j12) {
        AbstractC19074t.m100208f(str, "actionId");
        this.f10804a = str;
        this.f10805b = j11;
        this.f10806c = j12;
        this.f10808e = "";
        this.f10809f = "[]";
        this.f10810g = "[]";
        this.f10811h = "{}";
    }

    /* renamed from: a */
    public final String m13218a() {
        return this.f10804a;
    }

    /* renamed from: b */
    public final String m13219b() {
        return this.f10810g;
    }

    /* renamed from: c */
    public final long m13220c() {
        return this.f10805b;
    }

    /* renamed from: d */
    public final String m13221d() {
        return this.f10811h;
    }

    /* renamed from: e */
    public final long m13222e() {
        return this.f10807d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2716c)) {
            return false;
        }
        C2716c c2716c = (C2716c) obj;
        return AbstractC19074t.m100204b(this.f10804a, c2716c.f10804a) && this.f10805b == c2716c.f10805b && this.f10806c == c2716c.f10806c;
    }

    /* renamed from: f */
    public final String m13223f() {
        return this.f10809f;
    }

    /* renamed from: g */
    public final long m13224g() {
        return this.f10806c;
    }

    /* renamed from: h */
    public final String m13225h() {
        return this.f10808e;
    }

    public int hashCode() {
        return (((this.f10804a.hashCode() * 31) + AbstractC26974u.m138969a(this.f10805b)) * 31) + AbstractC26974u.m138969a(this.f10806c);
    }

    /* renamed from: i */
    public final void m13226i(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f10810g = str;
    }

    /* renamed from: j */
    public final void m13227j(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f10811h = str;
    }

    /* renamed from: k */
    public final void m13228k(long j11) {
        this.f10807d = j11;
    }

    /* renamed from: l */
    public final void m13229l(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f10809f = str;
    }

    /* renamed from: m */
    public final void m13230m(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f10808e = str;
    }

    public String toString() {
        return "EventEntity(actionId=" + this.f10804a + ", eventTime=" + this.f10805b + ", sessionId=" + this.f10806c + ')';
    }
}
