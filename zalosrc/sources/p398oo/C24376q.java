package p398oo;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19074t;

/* renamed from: oo.q */
/* loaded from: classes4.dex */
public final class C24376q {

    /* renamed from: a */
    private final long f117725a;

    /* renamed from: b */
    private final long f117726b;

    /* renamed from: c */
    private final String f117727c;

    /* renamed from: d */
    private final String f117728d;

    public C24376q(long j11, long j12, String str, String str2) {
        AbstractC19074t.m100208f(str, "feedLastLocal");
        AbstractC19074t.m100208f(str2, "feedLastRemote");
        this.f117725a = j11;
        this.f117726b = j12;
        this.f117727c = str;
        this.f117728d = str2;
    }

    /* renamed from: a */
    public final String m127491a() {
        return this.f117727c;
    }

    /* renamed from: b */
    public final String m127492b() {
        return this.f117728d;
    }

    /* renamed from: c */
    public final long m127493c() {
        return this.f117726b;
    }

    /* renamed from: d */
    public final long m127494d() {
        return this.f117725a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24376q)) {
            return false;
        }
        C24376q c24376q = (C24376q) obj;
        return this.f117725a == c24376q.f117725a && this.f117726b == c24376q.f117726b && AbstractC19074t.m100204b(this.f117727c, c24376q.f117727c) && AbstractC19074t.m100204b(this.f117728d, c24376q.f117728d);
    }

    public int hashCode() {
        return (((((AbstractC2147g0.m11521a(this.f117725a) * 31) + AbstractC2147g0.m11521a(this.f117726b)) * 31) + this.f117727c.hashCode()) * 31) + this.f117728d.hashCode();
    }

    public String toString() {
        return "LoadFeedParam(feedVersion=" + this.f117725a + ", feedMax=" + this.f117726b + ", feedLastLocal=" + this.f117727c + ", feedLastRemote=" + this.f117728d + ")";
    }
}
