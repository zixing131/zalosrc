package p585vs;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19074t;

/* renamed from: vs.d */
/* loaded from: classes4.dex */
public final class C28612d {

    /* renamed from: a */
    private final String f132666a;

    /* renamed from: b */
    private final long f132667b;

    /* renamed from: c */
    private final long f132668c;

    public C28612d(String str, long j11, long j12) {
        AbstractC19074t.m100208f(str, "threadId");
        this.f132666a = str;
        this.f132667b = j11;
        this.f132668c = j12;
    }

    /* renamed from: a */
    public final long m143077a() {
        return this.f132667b;
    }

    /* renamed from: b */
    public final String m143078b() {
        return this.f132666a;
    }

    /* renamed from: c */
    public final long m143079c() {
        return this.f132668c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28612d)) {
            return false;
        }
        C28612d c28612d = (C28612d) obj;
        return AbstractC19074t.m100204b(this.f132666a, c28612d.f132666a) && this.f132667b == c28612d.f132667b && this.f132668c == c28612d.f132668c;
    }

    public int hashCode() {
        return (((this.f132666a.hashCode() * 31) + AbstractC2147g0.m11521a(this.f132667b)) * 31) + AbstractC2147g0.m11521a(this.f132668c);
    }

    public String toString() {
        return "PullPreviewMsgOfflineParam(threadId=" + this.f132666a + ", globalMsgId=" + this.f132667b + ", tsJoinGroup=" + this.f132668c + ")";
    }
}
