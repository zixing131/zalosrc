package p036bc;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19074t;

/* renamed from: bc.l */
/* loaded from: classes3.dex */
public final class C2725l {

    /* renamed from: a */
    private final String f10859a;

    /* renamed from: b */
    private final long f10860b;

    /* renamed from: c */
    private final String f10861c;

    /* renamed from: d */
    private final long f10862d;

    /* renamed from: e */
    private long f10863e;

    /* renamed from: f */
    private int f10864f;

    /* renamed from: g */
    private String f10865g;

    /* renamed from: h */
    private String f10866h;

    public C2725l(String str, long j11, String str2, long j12) {
        AbstractC19074t.m100208f(str, "name");
        AbstractC19074t.m100208f(str2, "screenName");
        this.f10859a = str;
        this.f10860b = j11;
        this.f10861c = str2;
        this.f10862d = j12;
        this.f10865g = "";
        this.f10866h = "{}";
    }

    /* renamed from: a */
    public final String m13283a() {
        return this.f10865g;
    }

    /* renamed from: b */
    public final long m13284b() {
        return this.f10860b;
    }

    /* renamed from: c */
    public final int m13285c() {
        return this.f10864f;
    }

    /* renamed from: d */
    public final String m13286d() {
        return this.f10866h;
    }

    /* renamed from: e */
    public final long m13287e() {
        return this.f10863e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2725l)) {
            return false;
        }
        C2725l c2725l = (C2725l) obj;
        return AbstractC19074t.m100204b(this.f10859a, c2725l.f10859a) && this.f10860b == c2725l.f10860b && AbstractC19074t.m100204b(this.f10861c, c2725l.f10861c) && this.f10862d == c2725l.f10862d;
    }

    /* renamed from: f */
    public final String m13288f() {
        return this.f10859a;
    }

    /* renamed from: g */
    public final String m13289g() {
        return this.f10861c;
    }

    /* renamed from: h */
    public final long m13290h() {
        return this.f10862d;
    }

    public int hashCode() {
        return (((((this.f10859a.hashCode() * 31) + AbstractC2147g0.m11521a(this.f10860b)) * 31) + this.f10861c.hashCode()) * 31) + AbstractC2147g0.m11521a(this.f10862d);
    }

    /* renamed from: i */
    public final void m13291i(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f10865g = str;
    }

    /* renamed from: j */
    public final void m13292j(int i11) {
        this.f10864f = i11;
    }

    /* renamed from: k */
    public final void m13293k(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f10866h = str;
    }

    /* renamed from: l */
    public final void m13294l(long j11) {
        this.f10863e = j11;
    }

    public String toString() {
        return "ViewEntity(name=" + this.f10859a + ", actionTime=" + this.f10860b + ", screenName=" + this.f10861c + ", sessionId=" + this.f10862d + ')';
    }
}
