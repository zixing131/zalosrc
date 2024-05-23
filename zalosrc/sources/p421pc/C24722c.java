package p421pc;

import androidx.work.AbstractC2147g0;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import fn0.AbstractC19060k;
import ho0.AbstractC20110a;
import org.json.JSONObject;

/* renamed from: pc.c */
/* loaded from: classes3.dex */
public final class C24722c {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final int f118748a;

    /* renamed from: b */
    private final int f118749b;

    /* renamed from: c */
    private final int f118750c;

    /* renamed from: d */
    private final int f118751d;

    /* renamed from: e */
    private final int f118752e;

    /* renamed from: f */
    private final long f118753f;

    /* renamed from: g */
    private final int f118754g;

    /* renamed from: h */
    private final int f118755h;

    /* renamed from: i */
    private final int f118756i;

    /* renamed from: j */
    private final long f118757j;

    /* renamed from: k */
    private final long f118758k;

    /* renamed from: l */
    private final int f118759l;

    /* renamed from: m */
    private final int f118760m;

    /* renamed from: n */
    private final int f118761n;

    /* renamed from: o */
    private final int f118762o;

    /* renamed from: p */
    private final long f118763p;

    /* renamed from: pc.c$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C24722c m128458a(String str) {
            int i11;
            if (str != null && str.length() != 0) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    int optInt = jSONObject.optInt("zip_enable", 0);
                    int optInt2 = jSONObject.optInt("zip_maxitem", 50);
                    int optInt3 = jSONObject.optInt("zip_limit_file", 200);
                    int optInt4 = jSONObject.optInt("group_enable", 1);
                    int optInt5 = jSONObject.optInt("group_maxsize", 100);
                    long optLong = jSONObject.optLong("storage_delete_interval", 604800L);
                    int optInt6 = jSONObject.optInt("storage_min_delete", 200);
                    int optInt7 = jSONObject.optInt("storage_min_remaining", 1024);
                    if (optInt7 < 0) {
                        i11 = 1024;
                    } else {
                        i11 = optInt7;
                    }
                    return new C24722c(optInt, optInt2, optInt3, optInt4, optInt5, optLong, optInt6, i11, jSONObject.optInt("storage_min_used", 1024), jSONObject.optLong("auto_interval", 82800L), jSONObject.optLong("storage_quota_interval", 43200L), jSONObject.optInt("storage_limit_group", 0), jSONObject.optInt("storage_limit_single", 0), jSONObject.optInt("chunk_max_size_upload", 5), jSONObject.optInt("enable_resume_upload", 0), jSONObject.optLong("storage_stop_bk", 0L));
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                    return new C24722c(0, 0, 0, 0, 0, 0L, 0, 0, 0, 0L, 0L, 0, 0, 0, 0, 0L, 65535, null);
                }
            }
            return new C24722c(0, 0, 0, 0, 0, 0L, 0, 0, 0, 0L, 0L, 0, 0, 0, 0, 0L, 65535, null);
        }
    }

    public C24722c(int i11, int i12, int i13, int i14, int i15, long j11, int i16, int i17, int i18, long j12, long j13, int i19, int i21, int i22, int i23, long j14) {
        this.f118748a = i11;
        this.f118749b = i12;
        this.f118750c = i13;
        this.f118751d = i14;
        this.f118752e = i15;
        this.f118753f = j11;
        this.f118754g = i16;
        this.f118755h = i17;
        this.f118756i = i18;
        this.f118757j = j12;
        this.f118758k = j13;
        this.f118759l = i19;
        this.f118760m = i21;
        this.f118761n = i22;
        this.f118762o = i23;
        this.f118763p = j14;
    }

    /* renamed from: a */
    public final long m128442a() {
        return this.f118757j;
    }

    /* renamed from: b */
    public final int m128443b() {
        return this.f118761n;
    }

    /* renamed from: c */
    public final int m128444c() {
        return this.f118762o;
    }

    /* renamed from: d */
    public final int m128445d() {
        return this.f118751d;
    }

    /* renamed from: e */
    public final int m128446e() {
        return this.f118752e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24722c)) {
            return false;
        }
        C24722c c24722c = (C24722c) obj;
        return this.f118748a == c24722c.f118748a && this.f118749b == c24722c.f118749b && this.f118750c == c24722c.f118750c && this.f118751d == c24722c.f118751d && this.f118752e == c24722c.f118752e && this.f118753f == c24722c.f118753f && this.f118754g == c24722c.f118754g && this.f118755h == c24722c.f118755h && this.f118756i == c24722c.f118756i && this.f118757j == c24722c.f118757j && this.f118758k == c24722c.f118758k && this.f118759l == c24722c.f118759l && this.f118760m == c24722c.f118760m && this.f118761n == c24722c.f118761n && this.f118762o == c24722c.f118762o && this.f118763p == c24722c.f118763p;
    }

    /* renamed from: f */
    public final int m128447f() {
        return this.f118750c;
    }

    /* renamed from: g */
    public final long m128448g() {
        return this.f118753f;
    }

    /* renamed from: h */
    public final long m128449h() {
        return this.f118758k;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((this.f118748a * 31) + this.f118749b) * 31) + this.f118750c) * 31) + this.f118751d) * 31) + this.f118752e) * 31) + AbstractC2147g0.m11521a(this.f118753f)) * 31) + this.f118754g) * 31) + this.f118755h) * 31) + this.f118756i) * 31) + AbstractC2147g0.m11521a(this.f118757j)) * 31) + AbstractC2147g0.m11521a(this.f118758k)) * 31) + this.f118759l) * 31) + this.f118760m) * 31) + this.f118761n) * 31) + this.f118762o) * 31) + AbstractC2147g0.m11521a(this.f118763p);
    }

    /* renamed from: i */
    public final int m128450i() {
        return this.f118759l;
    }

    /* renamed from: j */
    public final int m128451j() {
        return this.f118760m;
    }

    /* renamed from: k */
    public final int m128452k() {
        return this.f118754g;
    }

    /* renamed from: l */
    public final int m128453l() {
        return this.f118755h;
    }

    /* renamed from: m */
    public final int m128454m() {
        return this.f118756i;
    }

    /* renamed from: n */
    public final long m128455n() {
        return this.f118763p;
    }

    /* renamed from: o */
    public final int m128456o() {
        return this.f118748a;
    }

    /* renamed from: p */
    public final int m128457p() {
        return this.f118749b;
    }

    public String toString() {
        return "SyncDriveConfig(zipEnable=" + this.f118748a + ", zipMaxItem=" + this.f118749b + ", maxZipFileBackup=" + this.f118750c + ", groupEnable=" + this.f118751d + ", groupMaxSize=" + this.f118752e + ", storageDeleteIntervalTime=" + this.f118753f + ", storageMinDelete=" + this.f118754g + ", storageMinRemaining=" + this.f118755h + ", storageMinUsed=" + this.f118756i + ", autoBackupIntervalTime=" + this.f118757j + ", storageIntervalTimeGetStorageQuota=" + this.f118758k + ", storageLimitGroupSize=" + this.f118759l + ", storageLimitSingleSize=" + this.f118760m + ", chunkMaxSizeUpload=" + this.f118761n + ", enableResumeUpload=" + this.f118762o + ", thresholdStopBkMedia=" + this.f118763p + ")";
    }

    public /* synthetic */ C24722c(int i11, int i12, int i13, int i14, int i15, long j11, int i16, int i17, int i18, long j12, long j13, int i19, int i21, int i22, int i23, long j14, int i24, AbstractC19060k abstractC19060k) {
        this((i24 & 1) != 0 ? 0 : i11, (i24 & 2) != 0 ? 50 : i12, (i24 & 4) != 0 ? 200 : i13, (i24 & 8) != 0 ? 1 : i14, (i24 & 16) != 0 ? 100 : i15, (i24 & 32) != 0 ? 604800L : j11, (i24 & 64) == 0 ? i16 : 200, (i24 & 128) != 0 ? 1024 : i17, (i24 & 256) == 0 ? i18 : 1024, (i24 & 512) != 0 ? 82800L : j12, (i24 & 1024) != 0 ? 43200L : j13, (i24 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) != 0 ? 0 : i19, (i24 & 4096) != 0 ? 0 : i21, (i24 & 8192) != 0 ? 5 : i22, (i24 & 16384) != 0 ? 0 : i23, (i24 & 32768) != 0 ? 0L : j14);
    }
}
