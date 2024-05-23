package p020ak;

import androidx.work.AbstractC2144f;
import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import ho0.AbstractC20110a;
import org.json.JSONObject;

/* renamed from: ak.b */
/* loaded from: classes3.dex */
public final class C0883b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final boolean f3336a;

    /* renamed from: b */
    private final int f3337b;

    /* renamed from: c */
    private final long f3338c;

    /* renamed from: d */
    private final int f3339d;

    /* renamed from: ak.b$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C0883b m2726a(String str) {
            boolean z11;
            if (str != null && str.length() != 0) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.optInt("enable", 0) == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    return new C0883b(z11, Math.max(jSONObject.optInt("min_photo_to_notify", 3), 1), Math.max(jSONObject.optLong("expired_time", 86400L), 0L), Math.max(jSONObject.optInt("animation_count", 5), 0));
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                    return new C0883b(false, 0, 0L, 0, 15, null);
                }
            }
            return new C0883b(false, 0, 0L, 0, 15, null);
        }
    }

    public C0883b(boolean z11, int i11, long j11, int i12) {
        this.f3336a = z11;
        this.f3337b = i11;
        this.f3338c = j11;
        this.f3339d = i12;
    }

    /* renamed from: a */
    public final int m2722a() {
        return this.f3339d;
    }

    /* renamed from: b */
    public final long m2723b() {
        return this.f3338c;
    }

    /* renamed from: c */
    public final int m2724c() {
        return this.f3337b;
    }

    /* renamed from: d */
    public final boolean m2725d() {
        return this.f3336a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0883b)) {
            return false;
        }
        C0883b c0883b = (C0883b) obj;
        return this.f3336a == c0883b.f3336a && this.f3337b == c0883b.f3337b && this.f3338c == c0883b.f3338c && this.f3339d == c0883b.f3339d;
    }

    public int hashCode() {
        return (((((AbstractC2144f.m11520a(this.f3336a) * 31) + this.f3337b) * 31) + AbstractC2147g0.m11521a(this.f3338c)) * 31) + this.f3339d;
    }

    public String toString() {
        return "PhotoNotifySetting(isEnable=" + this.f3336a + ", minPhotoToNotify=" + this.f3337b + ", expiredTime=" + this.f3338c + ", animationCount=" + this.f3339d + ")";
    }

    public /* synthetic */ C0883b(boolean z11, int i11, long j11, int i12, int i13, AbstractC19060k abstractC19060k) {
        this((i13 & 1) != 0 ? false : z11, (i13 & 2) != 0 ? 3 : i11, (i13 & 4) != 0 ? 86400L : j11, (i13 & 8) != 0 ? 5 : i12);
    }
}
