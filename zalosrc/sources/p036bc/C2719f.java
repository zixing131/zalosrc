package p036bc;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19074t;

/* renamed from: bc.f */
/* loaded from: classes3.dex */
public final class C2719f {

    /* renamed from: a */
    private final String f10823a;

    /* renamed from: b */
    private final long f10824b;

    /* renamed from: c */
    private final String f10825c;

    /* renamed from: d */
    private final long f10826d;

    /* renamed from: e */
    private long f10827e;

    /* renamed from: f */
    private long f10828f;

    /* renamed from: g */
    private int f10829g;

    /* renamed from: h */
    private String f10830h;

    public C2719f(String str, long j11, String str2, long j12) {
        AbstractC19074t.m100208f(str, "screenId");
        AbstractC19074t.m100208f(str2, "startSource");
        this.f10823a = str;
        this.f10824b = j11;
        this.f10825c = str2;
        this.f10826d = j12;
        this.f10830h = "{}";
    }

    /* renamed from: a */
    public final int m13241a() {
        return this.f10829g;
    }

    /* renamed from: b */
    public final long m13242b() {
        return this.f10828f;
    }

    /* renamed from: c */
    public final String m13243c() {
        return this.f10830h;
    }

    /* renamed from: d */
    public final long m13244d() {
        return this.f10827e;
    }

    /* renamed from: e */
    public final String m13245e() {
        return this.f10823a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2719f)) {
            return false;
        }
        C2719f c2719f = (C2719f) obj;
        return AbstractC19074t.m100204b(this.f10823a, c2719f.f10823a) && this.f10824b == c2719f.f10824b && AbstractC19074t.m100204b(this.f10825c, c2719f.f10825c) && this.f10826d == c2719f.f10826d;
    }

    /* renamed from: f */
    public final long m13246f() {
        return this.f10826d;
    }

    /* renamed from: g */
    public final String m13247g() {
        return this.f10825c;
    }

    /* renamed from: h */
    public final long m13248h() {
        return this.f10824b;
    }

    public int hashCode() {
        return (((((this.f10823a.hashCode() * 31) + AbstractC2147g0.m11521a(this.f10824b)) * 31) + this.f10825c.hashCode()) * 31) + AbstractC2147g0.m11521a(this.f10826d);
    }

    /* renamed from: i */
    public final void m13249i(int i11) {
        this.f10829g = i11;
    }

    /* renamed from: j */
    public final void m13250j(long j11) {
        this.f10828f = j11;
    }

    /* renamed from: k */
    public final void m13251k(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f10830h = str;
    }

    /* renamed from: l */
    public final void m13252l(long j11) {
        this.f10827e = j11;
    }

    public String toString() {
        return "ScreenEntity(screenId=" + this.f10823a + ", startTime=" + this.f10824b + ", startSource=" + this.f10825c + ", sessionId=" + this.f10826d + ')';
    }
}
