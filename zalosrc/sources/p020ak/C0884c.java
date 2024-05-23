package p020ak;

import androidx.work.AbstractC2144f;
import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import ho0.AbstractC20110a;
import org.json.JSONObject;

/* renamed from: ak.c */
/* loaded from: classes3.dex */
public final class C0884c {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final long f3340a;

    /* renamed from: b */
    private final long f3341b;

    /* renamed from: c */
    private final long f3342c;

    /* renamed from: d */
    private final boolean f3343d;

    /* renamed from: e */
    private final boolean f3344e;

    /* renamed from: ak.c$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final C0884c m2733a(String str) {
            boolean z11;
            if (str != null && str.length() != 0) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    long optLong = jSONObject.optLong("spamTime");
                    long optLong2 = jSONObject.optLong("expiredTime");
                    long optLong3 = jSONObject.optLong("duration");
                    boolean z12 = true;
                    if (jSONObject.has("instantSend") && jSONObject.optInt("instantSend") != 1) {
                        z11 = false;
                        if (jSONObject.optInt("enable") == 1) {
                            z12 = false;
                        }
                        return new C0884c(optLong, optLong2, optLong3, z12, z11);
                    }
                    z11 = true;
                    if (jSONObject.optInt("enable") == 1) {
                    }
                    return new C0884c(optLong, optLong2, optLong3, z12, z11);
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                    return new C0884c(0L, 0L, 0L, false, false, 31, null);
                }
            }
            return new C0884c(0L, 0L, 0L, false, false, 31, null);
        }
    }

    public C0884c(long j11, long j12, long j13, boolean z11, boolean z12) {
        this.f3340a = j11;
        this.f3341b = j12;
        this.f3342c = j13;
        this.f3343d = z11;
        this.f3344e = z12;
    }

    /* renamed from: a */
    public static final C0884c m2727a(String str) {
        return Companion.m2733a(str);
    }

    /* renamed from: b */
    public final long m2728b() {
        return this.f3342c;
    }

    /* renamed from: c */
    public final long m2729c() {
        return this.f3341b;
    }

    /* renamed from: d */
    public final boolean m2730d() {
        return this.f3344e;
    }

    /* renamed from: e */
    public final long m2731e() {
        return this.f3340a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0884c)) {
            return false;
        }
        C0884c c0884c = (C0884c) obj;
        return this.f3340a == c0884c.f3340a && this.f3341b == c0884c.f3341b && this.f3342c == c0884c.f3342c && this.f3343d == c0884c.f3343d && this.f3344e == c0884c.f3344e;
    }

    /* renamed from: f */
    public final boolean m2732f() {
        return this.f3343d;
    }

    public int hashCode() {
        return (((((((AbstractC2147g0.m11521a(this.f3340a) * 31) + AbstractC2147g0.m11521a(this.f3341b)) * 31) + AbstractC2147g0.m11521a(this.f3342c)) * 31) + AbstractC2144f.m11520a(this.f3343d)) * 31) + AbstractC2144f.m11520a(this.f3344e);
    }

    public String toString() {
        return "PhotoSuggestSetting(spamTime=" + this.f3340a + ", expiredTime=" + this.f3341b + ", durationTime=" + this.f3342c + ", isEnable=" + this.f3343d + ", instantSend=" + this.f3344e + ")";
    }

    public /* synthetic */ C0884c(long j11, long j12, long j13, boolean z11, boolean z12, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? 0L : j11, (i11 & 2) != 0 ? 0L : j12, (i11 & 4) == 0 ? j13 : 0L, (i11 & 8) != 0 ? false : z11, (i11 & 16) == 0 ? z12 : false);
    }
}
