package us;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19074t;

/* renamed from: us.a */
/* loaded from: classes4.dex */
public final class C27363a {

    /* renamed from: a */
    private final String f128918a;

    /* renamed from: b */
    private final String f128919b;

    /* renamed from: c */
    private int f128920c;

    /* renamed from: d */
    private long f128921d;

    /* renamed from: e */
    private long f128922e;

    public C27363a(String str, String str2, int i11, long j11, long j12) {
        AbstractC19074t.m100208f(str, "threadName");
        AbstractC19074t.m100208f(str2, "threadId");
        this.f128918a = str;
        this.f128919b = str2;
        this.f128920c = i11;
        this.f128921d = j11;
        this.f128922e = j12;
    }

    /* renamed from: a */
    public final int m140201a() {
        return this.f128920c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27363a)) {
            return false;
        }
        C27363a c27363a = (C27363a) obj;
        return AbstractC19074t.m100204b(this.f128918a, c27363a.f128918a) && AbstractC19074t.m100204b(this.f128919b, c27363a.f128919b) && this.f128920c == c27363a.f128920c && this.f128921d == c27363a.f128921d && this.f128922e == c27363a.f128922e;
    }

    public int hashCode() {
        return (((((((this.f128918a.hashCode() * 31) + this.f128919b.hashCode()) * 31) + this.f128920c) * 31) + AbstractC2147g0.m11521a(this.f128921d)) * 31) + AbstractC2147g0.m11521a(this.f128922e);
    }

    public String toString() {
        return "AutoSyncCandidate(threadName=" + this.f128918a + ", threadId=" + this.f128919b + ", messageCount=" + this.f128920c + ", latestMsgTimestamp=" + this.f128921d + ", oldestMsgTimestamp=" + this.f128922e + ")";
    }
}
