package p718zj;

import fn0.AbstractC19060k;
import ho0.AbstractC20110a;
import org.json.JSONObject;

/* renamed from: zj.a */
/* loaded from: classes3.dex */
public final class C32218a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final boolean f148615a;

    /* renamed from: b */
    private final boolean f148616b;

    /* renamed from: c */
    private final long f148617c;

    /* renamed from: d */
    private final long f148618d;

    /* renamed from: e */
    private final long f148619e;

    /* renamed from: zj.a$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C32218a m155348a(String str) {
            boolean z11;
            boolean z12;
            if (str != null && str.length() != 0) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.optInt("enable_parse_background", 0) == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (jSONObject.optInt("enable_suggest_link", 0) == 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    long j11 = 1000;
                    return new C32218a(z11, z12, jSONObject.optLong("suggest_spam_time", 30L) * j11, jSONObject.optLong("suggest_expired_time", 30L) * j11, jSONObject.optLong("suggest_duration", 15L) * j11);
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                    return new C32218a(false, false, 0L, 0L, 0L, 31, null);
                }
            }
            return new C32218a(false, false, 0L, 0L, 0L, 31, null);
        }
    }

    public C32218a(boolean z11, boolean z12, long j11, long j12, long j13) {
        this.f148615a = z11;
        this.f148616b = z12;
        this.f148617c = j11;
        this.f148618d = j12;
        this.f148619e = j13;
    }

    /* renamed from: a */
    public final long m155343a() {
        return this.f148618d;
    }

    /* renamed from: b */
    public final long m155344b() {
        return this.f148617c;
    }

    /* renamed from: c */
    public final long m155345c() {
        return this.f148619e;
    }

    /* renamed from: d */
    public final boolean m155346d() {
        return this.f148615a;
    }

    /* renamed from: e */
    public final boolean m155347e() {
        return this.f148616b;
    }

    public /* synthetic */ C32218a(boolean z11, boolean z12, long j11, long j12, long j13, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) == 0 ? z12 : false, (i11 & 4) != 0 ? 30000L : j11, (i11 & 8) == 0 ? j12 : 30000L, (i11 & 16) != 0 ? 15000L : j13);
    }
}
