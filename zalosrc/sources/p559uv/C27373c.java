package p559uv;

import androidx.work.AbstractC2144f;
import androidx.work.AbstractC2147g0;
import cg.AbstractC3460h;
import com.zing.zalo.media.pojo.VideoBlendingParam;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.io.Serializable;

/* renamed from: uv.c */
/* loaded from: classes4.dex */
public final class C27373c implements Serializable {
    public static final a Companion = new a(null);

    /* renamed from: A */
    private int f128928A;

    /* renamed from: B */
    private int f128929B;

    /* renamed from: C */
    private int f128930C;

    /* renamed from: D */
    private int f128931D;

    /* renamed from: E */
    private int f128932E;

    /* renamed from: F */
    private int f128933F;

    /* renamed from: G */
    private int f128934G;

    /* renamed from: H */
    private int f128935H;

    /* renamed from: I */
    private String f128936I;

    /* renamed from: J */
    private float f128937J;

    /* renamed from: K */
    private float f128938K;

    /* renamed from: L */
    private long f128939L;

    /* renamed from: M */
    private long f128940M;

    /* renamed from: N */
    private long f128941N;

    /* renamed from: O */
    public boolean f128942O;

    /* renamed from: P */
    public boolean f128943P;

    /* renamed from: Q */
    public boolean f128944Q;

    /* renamed from: R */
    public boolean f128945R;

    /* renamed from: S */
    public boolean f128946S;

    /* renamed from: T */
    public VideoBlendingParam f128947T;

    /* renamed from: U */
    public int f128948U;

    /* renamed from: V */
    public boolean f128949V;

    /* renamed from: W */
    public String f128950W;

    /* renamed from: X */
    private int f128951X;

    /* renamed from: Y */
    private long f128952Y;

    /* renamed from: p */
    private String f128953p;

    /* renamed from: q */
    private String f128954q;

    /* renamed from: r */
    private String f128955r;

    /* renamed from: s */
    private String f128956s;

    /* renamed from: t */
    private String f128957t;

    /* renamed from: u */
    private String f128958u;

    /* renamed from: v */
    private long f128959v;

    /* renamed from: w */
    private String f128960w;

    /* renamed from: x */
    private String f128961x;

    /* renamed from: y */
    private int f128962y;

    /* renamed from: z */
    private int f128963z;

    /* renamed from: uv.c$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C27373c() {
        this(null, null, null, null, null, null, 0L, null, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0.0f, 0.0f, 0L, 0L, 0L, false, false, false, false, false, null, 0, false, null, 0, -1, 7, null);
    }

    /* renamed from: c */
    public static /* synthetic */ C27373c m140215c(C27373c c27373c, String str, String str2, String str3, String str4, String str5, String str6, long j11, String str7, String str8, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, String str9, float f11, float f12, long j12, long j13, long j14, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, VideoBlendingParam videoBlendingParam, int i22, boolean z16, String str10, int i23, int i24, int i25, Object obj) {
        return c27373c.m140244b((i24 & 1) != 0 ? c27373c.f128953p : str, (i24 & 2) != 0 ? c27373c.f128954q : str2, (i24 & 4) != 0 ? c27373c.f128955r : str3, (i24 & 8) != 0 ? c27373c.f128956s : str4, (i24 & 16) != 0 ? c27373c.f128957t : str5, (i24 & 32) != 0 ? c27373c.f128958u : str6, (i24 & 64) != 0 ? c27373c.f128959v : j11, (i24 & 128) != 0 ? c27373c.f128960w : str7, (i24 & 256) != 0 ? c27373c.f128961x : str8, (i24 & 512) != 0 ? c27373c.f128962y : i11, (i24 & 1024) != 0 ? c27373c.f128963z : i12, (i24 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) != 0 ? c27373c.f128928A : i13, (i24 & 4096) != 0 ? c27373c.f128929B : i14, (i24 & 8192) != 0 ? c27373c.f128930C : i15, (i24 & 16384) != 0 ? c27373c.f128931D : i16, (i24 & 32768) != 0 ? c27373c.f128932E : i17, (i24 & 65536) != 0 ? c27373c.f128933F : i18, (i24 & 131072) != 0 ? c27373c.f128934G : i19, (i24 & 262144) != 0 ? c27373c.f128935H : i21, (i24 & 524288) != 0 ? c27373c.f128936I : str9, (i24 & ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE) != 0 ? c27373c.f128937J : f11, (i24 & 2097152) != 0 ? c27373c.f128938K : f12, (i24 & 4194304) != 0 ? c27373c.f128939L : j12, (i24 & 8388608) != 0 ? c27373c.f128940M : j13, (i24 & 16777216) != 0 ? c27373c.f128941N : j14, (i24 & 33554432) != 0 ? c27373c.f128942O : z11, (67108864 & i24) != 0 ? c27373c.f128943P : z12, (i24 & 134217728) != 0 ? c27373c.f128944Q : z13, (i24 & 268435456) != 0 ? c27373c.f128945R : z14, (i24 & 536870912) != 0 ? c27373c.f128946S : z15, (i24 & 1073741824) != 0 ? c27373c.f128947T : videoBlendingParam, (i24 & Integer.MIN_VALUE) != 0 ? c27373c.f128948U : i22, (i25 & 1) != 0 ? c27373c.f128949V : z16, (i25 & 2) != 0 ? c27373c.f128950W : str10, (i25 & 4) != 0 ? c27373c.f128951X : i23);
    }

    /* renamed from: A */
    public final int m140216A() {
        return this.f128933F;
    }

    /* renamed from: B */
    public final int m140217B() {
        return this.f128963z;
    }

    /* renamed from: C */
    public final int m140218C() {
        return this.f128962y;
    }

    /* renamed from: D */
    public final int m140219D() {
        return this.f128932E;
    }

    /* renamed from: E */
    public final String m140220E() {
        return this.f128953p;
    }

    /* renamed from: F */
    public final int m140221F() {
        return this.f128928A;
    }

    /* renamed from: G */
    public final void m140222G(int i11) {
        this.f128934G = i11;
    }

    /* renamed from: H */
    public final void m140223H(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f128961x = str;
    }

    /* renamed from: I */
    public final void m140224I(long j11) {
        this.f128939L = j11;
    }

    /* renamed from: J */
    public final void m140225J(String str) {
        this.f128958u = str;
    }

    /* renamed from: K */
    public final void m140226K(long j11) {
        this.f128959v = j11;
    }

    /* renamed from: L */
    public final void m140227L(long j11) {
        this.f128940M = j11;
    }

    /* renamed from: M */
    public final void m140228M(long j11) {
        this.f128941N = j11;
    }

    /* renamed from: N */
    public final void m140229N(float f11) {
        this.f128937J = f11;
    }

    /* renamed from: O */
    public final void m140230O(float f11) {
        this.f128938K = f11;
    }

    /* renamed from: P */
    public final void m140231P(String str) {
        this.f128936I = str;
    }

    /* renamed from: Q */
    public final void m140232Q(String str) {
        this.f128954q = str;
    }

    /* renamed from: R */
    public final void m140233R(String str) {
        this.f128957t = str;
    }

    /* renamed from: S */
    public final void m140234S(int i11) {
        this.f128935H = i11;
    }

    /* renamed from: T */
    public final void m140235T(int i11) {
        this.f128951X = i11;
    }

    /* renamed from: U */
    public final void m140236U(String str) {
        this.f128956s = str;
    }

    /* renamed from: V */
    public final void m140237V(String str) {
        this.f128955r = str;
    }

    /* renamed from: W */
    public final void m140238W(int i11) {
        this.f128930C = i11;
    }

    /* renamed from: X */
    public final void m140239X(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f128960w = str;
    }

    /* renamed from: Y */
    public final void m140240Y(int i11) {
        this.f128931D = i11;
    }

    /* renamed from: Z */
    public final void m140241Z(int i11) {
        this.f128929B = i11;
    }

    /* renamed from: a */
    public final C27373c m140242a() {
        return m140215c(this, null, null, null, null, null, null, 0L, null, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0.0f, 0.0f, 0L, 0L, 0L, false, false, false, false, false, null, 0, false, null, 0, -1, 7, null);
    }

    /* renamed from: a0 */
    public final void m140243a0(int i11) {
        this.f128933F = i11;
    }

    /* renamed from: b */
    public final C27373c m140244b(String str, String str2, String str3, String str4, String str5, String str6, long j11, String str7, String str8, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, String str9, float f11, float f12, long j12, long j13, long j14, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, VideoBlendingParam videoBlendingParam, int i22, boolean z16, String str10, int i23) {
        AbstractC19074t.m100208f(str7, "videoCodec");
        AbstractC19074t.m100208f(str8, "audioCodec");
        return new C27373c(str, str2, str3, str4, str5, str6, j11, str7, str8, i11, i12, i13, i14, i15, i16, i17, i18, i19, i21, str9, f11, f12, j12, j13, j14, z11, z12, z13, z14, z15, videoBlendingParam, i22, z16, str10, i23);
    }

    /* renamed from: b0 */
    public final void m140245b0(int i11) {
        this.f128963z = i11;
    }

    /* renamed from: c0 */
    public final void m140246c0(int i11) {
        this.f128962y = i11;
    }

    /* renamed from: d */
    public final int m140247d() {
        return this.f128934G;
    }

    /* renamed from: d0 */
    public final void m140248d0(int i11) {
        this.f128932E = i11;
    }

    /* renamed from: e */
    public final String m140249e() {
        return this.f128961x;
    }

    /* renamed from: e0 */
    public final void m140250e0(String str) {
        this.f128953p = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27373c)) {
            return false;
        }
        C27373c c27373c = (C27373c) obj;
        return AbstractC19074t.m100204b(this.f128953p, c27373c.f128953p) && AbstractC19074t.m100204b(this.f128954q, c27373c.f128954q) && AbstractC19074t.m100204b(this.f128955r, c27373c.f128955r) && AbstractC19074t.m100204b(this.f128956s, c27373c.f128956s) && AbstractC19074t.m100204b(this.f128957t, c27373c.f128957t) && AbstractC19074t.m100204b(this.f128958u, c27373c.f128958u) && this.f128959v == c27373c.f128959v && AbstractC19074t.m100204b(this.f128960w, c27373c.f128960w) && AbstractC19074t.m100204b(this.f128961x, c27373c.f128961x) && this.f128962y == c27373c.f128962y && this.f128963z == c27373c.f128963z && this.f128928A == c27373c.f128928A && this.f128929B == c27373c.f128929B && this.f128930C == c27373c.f128930C && this.f128931D == c27373c.f128931D && this.f128932E == c27373c.f128932E && this.f128933F == c27373c.f128933F && this.f128934G == c27373c.f128934G && this.f128935H == c27373c.f128935H && AbstractC19074t.m100204b(this.f128936I, c27373c.f128936I) && Float.compare(this.f128937J, c27373c.f128937J) == 0 && Float.compare(this.f128938K, c27373c.f128938K) == 0 && this.f128939L == c27373c.f128939L && this.f128940M == c27373c.f128940M && this.f128941N == c27373c.f128941N && this.f128942O == c27373c.f128942O && this.f128943P == c27373c.f128943P && this.f128944Q == c27373c.f128944Q && this.f128945R == c27373c.f128945R && this.f128946S == c27373c.f128946S && AbstractC19074t.m100204b(this.f128947T, c27373c.f128947T) && this.f128948U == c27373c.f128948U && this.f128949V == c27373c.f128949V && AbstractC19074t.m100204b(this.f128950W, c27373c.f128950W) && this.f128951X == c27373c.f128951X;
    }

    /* renamed from: f */
    public final long m140251f() {
        return this.f128939L;
    }

    /* renamed from: f0 */
    public final void m140252f0(int i11) {
        this.f128928A = i11;
    }

    /* renamed from: g */
    public final String m140253g() {
        return this.f128958u;
    }

    /* renamed from: h */
    public final long m140254h() {
        return this.f128959v;
    }

    public int hashCode() {
        String str = this.f128953p;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f128954q;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f128955r;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f128956s;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f128957t;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f128958u;
        int hashCode6 = (((((((((((((((((((((((((((hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31) + AbstractC2147g0.m11521a(this.f128959v)) * 31) + this.f128960w.hashCode()) * 31) + this.f128961x.hashCode()) * 31) + this.f128962y) * 31) + this.f128963z) * 31) + this.f128928A) * 31) + this.f128929B) * 31) + this.f128930C) * 31) + this.f128931D) * 31) + this.f128932E) * 31) + this.f128933F) * 31) + this.f128934G) * 31) + this.f128935H) * 31;
        String str7 = this.f128936I;
        int hashCode7 = (((((((((((((((((((((hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31) + Float.floatToIntBits(this.f128937J)) * 31) + Float.floatToIntBits(this.f128938K)) * 31) + AbstractC2147g0.m11521a(this.f128939L)) * 31) + AbstractC2147g0.m11521a(this.f128940M)) * 31) + AbstractC2147g0.m11521a(this.f128941N)) * 31) + AbstractC2144f.m11520a(this.f128942O)) * 31) + AbstractC2144f.m11520a(this.f128943P)) * 31) + AbstractC2144f.m11520a(this.f128944Q)) * 31) + AbstractC2144f.m11520a(this.f128945R)) * 31) + AbstractC2144f.m11520a(this.f128946S)) * 31;
        VideoBlendingParam videoBlendingParam = this.f128947T;
        int hashCode8 = (((((hashCode7 + (videoBlendingParam == null ? 0 : videoBlendingParam.hashCode())) * 31) + this.f128948U) * 31) + AbstractC2144f.m11520a(this.f128949V)) * 31;
        String str8 = this.f128950W;
        return ((hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31) + this.f128951X;
    }

    /* renamed from: i */
    public final long m140255i() {
        long j11 = 1000;
        return (this.f128959v / j11) * j11;
    }

    /* renamed from: j */
    public final long m140256j() {
        return this.f128940M;
    }

    /* renamed from: k */
    public final long m140257k() {
        return this.f128941N;
    }

    /* renamed from: l */
    public final float m140258l() {
        return this.f128937J;
    }

    /* renamed from: m */
    public final float m140259m() {
        return this.f128938K;
    }

    /* renamed from: n */
    public final String m140260n() {
        return this.f128936I;
    }

    /* renamed from: o */
    public final long m140261o() {
        String str;
        if (this.f128952Y == 0 && (str = this.f128953p) != null && str.length() > 0) {
            this.f128952Y = AbstractC3460h.m17442j(this.f128953p);
        }
        return this.f128952Y;
    }

    /* renamed from: p */
    public final String m140262p() {
        return this.f128954q;
    }

    /* renamed from: q */
    public final String m140263q() {
        return this.f128957t;
    }

    /* renamed from: r */
    public final long m140264r() {
        long j11;
        VideoBlendingParam videoBlendingParam = this.f128947T;
        if (videoBlendingParam != null) {
            AbstractC19074t.m100205c(videoBlendingParam);
            if (videoBlendingParam.f48265Q > 0) {
                VideoBlendingParam videoBlendingParam2 = this.f128947T;
                AbstractC19074t.m100205c(videoBlendingParam2);
                j11 = videoBlendingParam2.f48265Q;
                long j12 = 1000;
                return (j11 / j12) * j12;
            }
        }
        j11 = this.f128959v;
        long j122 = 1000;
        return (j11 / j122) * j122;
    }

    /* renamed from: s */
    public final int m140265s() {
        return this.f128935H;
    }

    /* renamed from: t */
    public final int m140266t() {
        return this.f128951X;
    }

    public String toString() {
        return "VideoInfo(videoUrl=" + this.f128953p + ", originalPath=" + this.f128954q + ", thumbUrl=" + this.f128955r + ", thumbURLFromGallery=" + this.f128956s + ", overlayUrl=" + this.f128957t + ", description=" + this.f128958u + ", duration=" + this.f128959v + ", videoCodec=" + this.f128960w + ", audioCodec=" + this.f128961x + ", videoOriginalWidth=" + this.f128962y + ", videoOriginalHeight=" + this.f128963z + ", videoWidth=" + this.f128928A + ", videoHeight=" + this.f128929B + ", videoBitrate=" + this.f128930C + ", videoFrameRate=" + this.f128931D + ", videoProfile=" + this.f128932E + ", videoLevel=" + this.f128933F + ", audioBitrate=" + this.f128934G + ", rotation=" + this.f128935H + ", mediaId=" + this.f128936I + ", latitude=" + this.f128937J + ", longitude=" + this.f128938K + ", createdTime=" + this.f128939L + ", fileSize=" + this.f128940M + ", fileSizeInByte=" + this.f128941N + ", needToCompressVideo=" + this.f128942O + ", needToBlendVideo=" + this.f128943P + ", needFlipping=" + this.f128944Q + ", alwaysGenThumb=" + this.f128945R + ", isFromZaloRecorder=" + this.f128946S + ", videoBlendingParam=" + this.f128947T + ", messageLayoutType=" + this.f128948U + ", isGif=" + this.f128949V + ", ext=" + this.f128950W + ", section=" + this.f128951X + ")";
    }

    /* renamed from: u */
    public final String m140267u() {
        return this.f128956s;
    }

    /* renamed from: v */
    public final String m140268v() {
        return this.f128955r;
    }

    /* renamed from: w */
    public final int m140269w() {
        return this.f128930C;
    }

    /* renamed from: x */
    public final String m140270x() {
        return this.f128960w;
    }

    /* renamed from: y */
    public final int m140271y() {
        return this.f128931D;
    }

    /* renamed from: z */
    public final int m140272z() {
        return this.f128929B;
    }

    public C27373c(String str, String str2, String str3, String str4, String str5, String str6, long j11, String str7, String str8, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, String str9, float f11, float f12, long j12, long j13, long j14, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, VideoBlendingParam videoBlendingParam, int i22, boolean z16, String str10, int i23) {
        AbstractC19074t.m100208f(str7, "videoCodec");
        AbstractC19074t.m100208f(str8, "audioCodec");
        this.f128953p = str;
        this.f128954q = str2;
        this.f128955r = str3;
        this.f128956s = str4;
        this.f128957t = str5;
        this.f128958u = str6;
        this.f128959v = j11;
        this.f128960w = str7;
        this.f128961x = str8;
        this.f128962y = i11;
        this.f128963z = i12;
        this.f128928A = i13;
        this.f128929B = i14;
        this.f128930C = i15;
        this.f128931D = i16;
        this.f128932E = i17;
        this.f128933F = i18;
        this.f128934G = i19;
        this.f128935H = i21;
        this.f128936I = str9;
        this.f128937J = f11;
        this.f128938K = f12;
        this.f128939L = j12;
        this.f128940M = j13;
        this.f128941N = j14;
        this.f128942O = z11;
        this.f128943P = z12;
        this.f128944Q = z13;
        this.f128945R = z14;
        this.f128946S = z15;
        this.f128947T = videoBlendingParam;
        this.f128948U = i22;
        this.f128949V = z16;
        this.f128950W = str10;
        this.f128951X = i23;
    }

    public /* synthetic */ C27373c(String str, String str2, String str3, String str4, String str5, String str6, long j11, String str7, String str8, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, String str9, float f11, float f12, long j12, long j13, long j14, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, VideoBlendingParam videoBlendingParam, int i22, boolean z16, String str10, int i23, int i24, int i25, AbstractC19060k abstractC19060k) {
        this((i24 & 1) != 0 ? null : str, (i24 & 2) != 0 ? null : str2, (i24 & 4) != 0 ? null : str3, (i24 & 8) != 0 ? null : str4, (i24 & 16) != 0 ? null : str5, (i24 & 32) != 0 ? null : str6, (i24 & 64) != 0 ? 0L : j11, (i24 & 128) != 0 ? "" : str7, (i24 & 256) == 0 ? str8 : "", (i24 & 512) != 0 ? 0 : i11, (i24 & 1024) != 0 ? 0 : i12, (i24 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) != 0 ? 0 : i13, (i24 & 4096) != 0 ? 0 : i14, (i24 & 8192) != 0 ? -1 : i15, (i24 & 16384) != 0 ? 0 : i16, (i24 & 32768) != 0 ? 0 : i17, (i24 & 65536) != 0 ? 0 : i18, (i24 & 131072) != 0 ? 0 : i19, (i24 & 262144) != 0 ? 0 : i21, (i24 & 524288) != 0 ? null : str9, (i24 & ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE) != 0 ? 0.0f : f11, (i24 & 2097152) == 0 ? f12 : 0.0f, (i24 & 4194304) != 0 ? 0L : j12, (i24 & 8388608) != 0 ? 0L : j13, (i24 & 16777216) != 0 ? 0L : j14, (i24 & 33554432) != 0 ? false : z11, (i24 & 67108864) != 0 ? false : z12, (i24 & 134217728) != 0 ? false : z13, (i24 & 268435456) != 0 ? false : z14, (i24 & 536870912) != 0 ? false : z15, (i24 & 1073741824) != 0 ? null : videoBlendingParam, (i24 & Integer.MIN_VALUE) != 0 ? -1 : i22, (i25 & 1) != 0 ? false : z16, (i25 & 2) != 0 ? null : str10, (i25 & 4) == 0 ? i23 : -1);
    }
}
