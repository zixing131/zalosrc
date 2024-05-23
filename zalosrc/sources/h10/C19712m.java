package h10;

import androidx.work.AbstractC2147g0;
import com.zing.zalo.shortvideo.data.remote.ws.response.GetCommentLiveRes;
import fn0.AbstractC19060k;

/* renamed from: h10.m */
/* loaded from: classes5.dex */
public final class C19712m {

    /* renamed from: a */
    private long f97838a;

    /* renamed from: b */
    private int f97839b;

    /* renamed from: c */
    private int f97840c;

    public C19712m(long j11, int i11, int i12) {
        this.f97838a = j11;
        this.f97839b = i11;
        this.f97840c = i12;
    }

    /* renamed from: a */
    public final int m103452a() {
        return this.f97840c;
    }

    /* renamed from: b */
    public final long m103453b() {
        return this.f97838a;
    }

    /* renamed from: c */
    public final int m103454c() {
        return this.f97839b;
    }

    /* renamed from: d */
    public final void m103455d() {
        this.f97838a = 0L;
        this.f97839b = 0;
    }

    /* renamed from: e */
    public final void m103456e(GetCommentLiveRes getCommentLiveRes) {
        Long l11;
        if (getCommentLiveRes != null) {
            l11 = getCommentLiveRes.m51639c();
        } else {
            l11 = null;
        }
        if (l11 != null && getCommentLiveRes.m51640d() != null) {
            this.f97838a = getCommentLiveRes.m51639c().longValue();
            this.f97839b = getCommentLiveRes.m51640d().intValue();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19712m)) {
            return false;
        }
        C19712m c19712m = (C19712m) obj;
        return this.f97838a == c19712m.f97838a && this.f97839b == c19712m.f97839b && this.f97840c == c19712m.f97840c;
    }

    public int hashCode() {
        return (((AbstractC2147g0.m11521a(this.f97838a) * 31) + this.f97839b) * 31) + this.f97840c;
    }

    public String toString() {
        return "LastParamToLoadCmt(lastId=" + this.f97838a + ", lastIndex=" + this.f97839b + ", count=" + this.f97840c + ")";
    }

    public /* synthetic */ C19712m(long j11, int i11, int i12, int i13, AbstractC19060k abstractC19060k) {
        this((i13 & 1) != 0 ? 0L : j11, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? 20 : i12);
    }
}
