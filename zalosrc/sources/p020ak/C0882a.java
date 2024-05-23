package p020ak;

import fn0.AbstractC19060k;
import ho0.AbstractC20110a;
import org.json.JSONObject;

/* renamed from: ak.a */
/* loaded from: classes3.dex */
public final class C0882a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final long f3327a;

    /* renamed from: b */
    private final int f3328b;

    /* renamed from: c */
    private final int f3329c;

    /* renamed from: d */
    private final boolean f3330d;

    /* renamed from: e */
    private final int f3331e;

    /* renamed from: f */
    private final int f3332f;

    /* renamed from: g */
    private final int f3333g;

    /* renamed from: h */
    private final int f3334h;

    /* renamed from: i */
    private final int f3335i;

    /* renamed from: ak.a$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C0882a m2721a(String str) {
            boolean z11;
            if (str != null && str.length() != 0) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.optInt("enable", 1) == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    return new C0882a(jSONObject.optLong("seqTime", 5L), jSONObject.optInt("radius", 5), jSONObject.optInt("maxPhoto", 20), z11, jSONObject.optInt("duration", 10), jSONObject.optInt("spamTime", 120), jSONObject.optInt("expiredTime", 300), jSONObject.optInt("max_member_group_suggest", 50), jSONObject.optInt("mode", 0));
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                    return new C0882a(0L, 0, 0, false, 0, 0, 0, 0, 0, 511, null);
                }
            }
            return new C0882a(0L, 0, 0, false, 0, 0, 0, 0, 0, 511, null);
        }
    }

    public C0882a(long j11, int i11, int i12, boolean z11, int i13, int i14, int i15, int i16, int i17) {
        this.f3327a = j11;
        this.f3328b = i11;
        this.f3329c = i12;
        this.f3330d = z11;
        this.f3331e = i13;
        this.f3332f = i14;
        this.f3333g = i15;
        this.f3334h = i16;
        this.f3335i = i17;
    }

    /* renamed from: a */
    public final int m2712a() {
        return this.f3331e;
    }

    /* renamed from: b */
    public final int m2713b() {
        return this.f3333g;
    }

    /* renamed from: c */
    public final int m2714c() {
        return this.f3334h;
    }

    /* renamed from: d */
    public final int m2715d() {
        return this.f3329c;
    }

    /* renamed from: e */
    public final int m2716e() {
        return this.f3328b;
    }

    /* renamed from: f */
    public final long m2717f() {
        return this.f3327a;
    }

    /* renamed from: g */
    public final int m2718g() {
        return this.f3332f;
    }

    /* renamed from: h */
    public final int m2719h() {
        return this.f3335i;
    }

    /* renamed from: i */
    public final boolean m2720i() {
        return this.f3330d;
    }

    public /* synthetic */ C0882a(long j11, int i11, int i12, boolean z11, int i13, int i14, int i15, int i16, int i17, int i18, AbstractC19060k abstractC19060k) {
        this((i18 & 1) != 0 ? 5L : j11, (i18 & 2) != 0 ? 5 : i11, (i18 & 4) != 0 ? 20 : i12, (i18 & 8) != 0 ? true : z11, (i18 & 16) != 0 ? 10 : i13, (i18 & 32) != 0 ? 120 : i14, (i18 & 64) != 0 ? 300 : i15, (i18 & 128) != 0 ? 50 : i16, (i18 & 256) != 0 ? 0 : i17);
    }
}
