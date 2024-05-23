package p618wq;

import androidx.work.AbstractC2147g0;
import bo.C3020p0;
import bo.C3039t0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import nh0.C23793c;
import org.json.JSONObject;

/* renamed from: wq.a */
/* loaded from: classes4.dex */
public final class C29190a {

    /* renamed from: f */
    public static final a f135245f = new a(null);

    /* renamed from: a */
    private final String f135246a;

    /* renamed from: b */
    private final C29193d f135247b;

    /* renamed from: c */
    private final int f135248c;

    /* renamed from: d */
    private final long f135249d;

    /* renamed from: e */
    private final long f135250e;

    /* renamed from: wq.a$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C29190a m145743a(C3020p0 c3020p0, long j11) {
            AbstractC19074t.m100208f(c3020p0, "feedItem");
            C3039t0 c3039t0 = c3020p0.f12025E;
            if (c3039t0 != null) {
                int i11 = c3039t0.f12243a;
                long mo124314i = C23793c.Companion.m124321a().mo124314i();
                C29193d m145759a = C29193d.f135260e.m145759a(c3020p0);
                String str = c3020p0.f12057p;
                AbstractC19074t.m100207e(str, "fid");
                return new C29190a(str, m145759a, i11, j11, mo124314i);
            }
            String str2 = c3020p0.f12057p;
            AbstractC19074t.m100207e(str2, "fid");
            return new C29190a(str2, null, 0, 0L, 0L, 30, null);
        }

        /* renamed from: b */
        public final C29190a m145744b(String str, JSONObject jSONObject) {
            C29193d c29193d;
            AbstractC19074t.m100208f(str, "feedId");
            if (jSONObject != null) {
                try {
                    if (jSONObject.has("like_info")) {
                        c29193d = C29193d.f135260e.m145760b(jSONObject);
                    } else {
                        c29193d = new C29193d(0, null, false, null, 15, null);
                    }
                    return new C29190a(str, c29193d, jSONObject.optInt("tot_cmt", 0), 1000 * jSONObject.optInt("ttl", 1800), jSONObject.optLong("request_time", C23793c.Companion.m124321a().mo124314i()));
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                }
            }
            return new C29190a(str, null, 0, 0L, 0L, 30, null);
        }
    }

    public C29190a(String str, C29193d c29193d, int i11, long j11, long j12) {
        AbstractC19074t.m100208f(str, "feedId");
        AbstractC19074t.m100208f(c29193d, "likeInfo");
        this.f135246a = str;
        this.f135247b = c29193d;
        this.f135248c = i11;
        this.f135249d = j11;
        this.f135250e = j12;
    }

    /* renamed from: a */
    public final String m145737a() {
        return this.f135246a;
    }

    /* renamed from: b */
    public final C29193d m145738b() {
        return this.f135247b;
    }

    /* renamed from: c */
    public final long m145739c() {
        return this.f135250e;
    }

    /* renamed from: d */
    public final long m145740d() {
        return this.f135249d;
    }

    /* renamed from: e */
    public final int m145741e() {
        return this.f135248c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29190a)) {
            return false;
        }
        C29190a c29190a = (C29190a) obj;
        return AbstractC19074t.m100204b(this.f135246a, c29190a.f135246a) && AbstractC19074t.m100204b(this.f135247b, c29190a.f135247b) && this.f135248c == c29190a.f135248c && this.f135249d == c29190a.f135249d && this.f135250e == c29190a.f135250e;
    }

    /* renamed from: f */
    public final JSONObject m145742f() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("like_info", this.f135247b.m145758e());
        jSONObject.put("tot_cmt", this.f135248c);
        jSONObject.put("ttl", this.f135249d / 1000);
        jSONObject.put("request_time", this.f135250e);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(this.f135246a, jSONObject);
        return jSONObject2;
    }

    public int hashCode() {
        return (((((((this.f135246a.hashCode() * 31) + this.f135247b.hashCode()) * 31) + this.f135248c) * 31) + AbstractC2147g0.m11521a(this.f135249d)) * 31) + AbstractC2147g0.m11521a(this.f135250e);
    }

    public String toString() {
        return "RealTimeLikeCommentInfo(feedId=" + this.f135246a + ", likeInfo=" + this.f135247b + ", totalComment=" + this.f135248c + ", timeToLive=" + this.f135249d + ", requestedTime=" + this.f135250e + ")";
    }

    public /* synthetic */ C29190a(String str, C29193d c29193d, int i11, long j11, long j12, int i12, AbstractC19060k abstractC19060k) {
        this(str, (i12 & 2) != 0 ? new C29193d(0, null, false, null, 15, null) : c29193d, (i12 & 4) != 0 ? -1 : i11, (i12 & 8) != 0 ? 1800000L : j11, (i12 & 16) != 0 ? C23793c.Companion.m124321a().mo124314i() : j12);
    }
}
