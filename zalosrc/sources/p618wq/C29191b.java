package p618wq;

import androidx.work.AbstractC2144f;
import androidx.work.AbstractC2147g0;
import fn0.AbstractC19074t;

/* renamed from: wq.b */
/* loaded from: classes4.dex */
public final class C29191b {

    /* renamed from: a */
    private final String f135251a;

    /* renamed from: b */
    private final String f135252b;

    /* renamed from: c */
    private final boolean f135253c;

    /* renamed from: d */
    private final int f135254d;

    /* renamed from: e */
    private final long f135255e;

    public C29191b(String str, String str2, boolean z11, int i11, long j11) {
        AbstractC19074t.m100208f(str, "feedId");
        AbstractC19074t.m100208f(str2, "feedOwnerId");
        this.f135251a = str;
        this.f135252b = str2;
        this.f135253c = z11;
        this.f135254d = i11;
        this.f135255e = j11;
    }

    /* renamed from: a */
    public final long m145745a() {
        return this.f135255e;
    }

    /* renamed from: b */
    public final String m145746b() {
        return this.f135251a;
    }

    /* renamed from: c */
    public final String m145747c() {
        return this.f135252b;
    }

    /* renamed from: d */
    public final int m145748d() {
        return this.f135254d;
    }

    /* renamed from: e */
    public final boolean m145749e() {
        return this.f135253c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29191b)) {
            return false;
        }
        C29191b c29191b = (C29191b) obj;
        return AbstractC19074t.m100204b(this.f135251a, c29191b.f135251a) && AbstractC19074t.m100204b(this.f135252b, c29191b.f135252b) && this.f135253c == c29191b.f135253c && this.f135254d == c29191b.f135254d && this.f135255e == c29191b.f135255e;
    }

    public int hashCode() {
        return (((((((this.f135251a.hashCode() * 31) + this.f135252b.hashCode()) * 31) + AbstractC2144f.m11520a(this.f135253c)) * 31) + this.f135254d) * 31) + AbstractC2147g0.m11521a(this.f135255e);
    }

    public String toString() {
        return "RealTimeLikeCommentLoaderInfo(feedId=" + this.f135251a + ", feedOwnerId=" + this.f135252b + ", isHighPriority=" + this.f135253c + ", feedType=" + this.f135254d + ", feedCreatedTime=" + this.f135255e + ")";
    }
}
