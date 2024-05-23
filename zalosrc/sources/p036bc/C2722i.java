package p036bc;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19074t;

/* renamed from: bc.i */
/* loaded from: classes3.dex */
public final class C2722i {

    /* renamed from: a */
    private final long f10842a;

    /* renamed from: b */
    private final int f10843b;

    /* renamed from: c */
    private long f10844c;

    /* renamed from: d */
    private long f10845d;

    /* renamed from: e */
    private int f10846e;

    /* renamed from: f */
    private String f10847f = "{}";

    public C2722i(long j11, int i11) {
        this.f10842a = j11;
        this.f10843b = i11;
    }

    /* renamed from: a */
    public final int m13265a() {
        return this.f10846e;
    }

    /* renamed from: b */
    public final long m13266b() {
        return this.f10845d;
    }

    /* renamed from: c */
    public final String m13267c() {
        return this.f10847f;
    }

    /* renamed from: d */
    public final long m13268d() {
        return this.f10844c;
    }

    /* renamed from: e */
    public final int m13269e() {
        return this.f10843b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2722i)) {
            return false;
        }
        C2722i c2722i = (C2722i) obj;
        return this.f10842a == c2722i.f10842a && this.f10843b == c2722i.f10843b;
    }

    /* renamed from: f */
    public final long m13270f() {
        return this.f10842a;
    }

    /* renamed from: g */
    public final void m13271g(int i11) {
        this.f10846e = i11;
    }

    /* renamed from: h */
    public final void m13272h(long j11) {
        this.f10845d = j11;
    }

    public int hashCode() {
        return (AbstractC2147g0.m11521a(this.f10842a) * 31) + this.f10843b;
    }

    /* renamed from: i */
    public final void m13273i(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f10847f = str;
    }

    /* renamed from: j */
    public final void m13274j(long j11) {
        this.f10844c = j11;
    }

    public String toString() {
        return "SessionEntity(startTime=" + this.f10842a + ", startSource=" + this.f10843b + ')';
    }
}
