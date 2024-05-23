package p113dw;

import androidx.work.AbstractC2144f;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import fn0.AbstractC19060k;

/* renamed from: dw.a */
/* loaded from: classes4.dex */
public final class C18072a {

    /* renamed from: a */
    private boolean f91477a;

    /* renamed from: b */
    private boolean f91478b;

    /* renamed from: c */
    private boolean f91479c;

    /* renamed from: d */
    private boolean f91480d;

    /* renamed from: e */
    private int f91481e;

    /* renamed from: f */
    private int f91482f;

    /* renamed from: g */
    private int f91483g;

    /* renamed from: h */
    private int f91484h;

    /* renamed from: i */
    private int f91485i;

    /* renamed from: j */
    private int f91486j;

    /* renamed from: k */
    private int f91487k;

    /* renamed from: l */
    private int f91488l;

    /* renamed from: m */
    private int f91489m;

    /* renamed from: n */
    private int f91490n;

    /* renamed from: o */
    private int f91491o;

    /* renamed from: p */
    private int f91492p;

    /* renamed from: q */
    private int f91493q;

    public C18072a(boolean z11, boolean z12, boolean z13, boolean z14, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int i23, int i24) {
        this.f91477a = z11;
        this.f91478b = z12;
        this.f91479c = z13;
        this.f91480d = z14;
        this.f91481e = i11;
        this.f91482f = i12;
        this.f91483g = i13;
        this.f91484h = i14;
        this.f91485i = i15;
        this.f91486j = i16;
        this.f91487k = i17;
        this.f91488l = i18;
        this.f91489m = i19;
        this.f91490n = i21;
        this.f91491o = i22;
        this.f91492p = i23;
        this.f91493q = i24;
    }

    /* renamed from: a */
    public final C18072a m96102a(boolean z11, boolean z12, boolean z13, boolean z14, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int i23, int i24) {
        return new C18072a(z11, z12, z13, z14, i11, i12, i13, i14, i15, i16, i17, i18, i19, i21, i22, i23, i24);
    }

    /* renamed from: c */
    public final int m96103c() {
        return this.f91493q;
    }

    /* renamed from: d */
    public final int m96104d() {
        return this.f91488l;
    }

    /* renamed from: e */
    public final int m96105e() {
        return this.f91487k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18072a)) {
            return false;
        }
        C18072a c18072a = (C18072a) obj;
        return this.f91477a == c18072a.f91477a && this.f91478b == c18072a.f91478b && this.f91479c == c18072a.f91479c && this.f91480d == c18072a.f91480d && this.f91481e == c18072a.f91481e && this.f91482f == c18072a.f91482f && this.f91483g == c18072a.f91483g && this.f91484h == c18072a.f91484h && this.f91485i == c18072a.f91485i && this.f91486j == c18072a.f91486j && this.f91487k == c18072a.f91487k && this.f91488l == c18072a.f91488l && this.f91489m == c18072a.f91489m && this.f91490n == c18072a.f91490n && this.f91491o == c18072a.f91491o && this.f91492p == c18072a.f91492p && this.f91493q == c18072a.f91493q;
    }

    /* renamed from: f */
    public final int m96106f() {
        return this.f91484h;
    }

    /* renamed from: g */
    public final boolean m96107g() {
        return this.f91480d;
    }

    /* renamed from: h */
    public final int m96108h() {
        return this.f91485i;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((AbstractC2144f.m11520a(this.f91477a) * 31) + AbstractC2144f.m11520a(this.f91478b)) * 31) + AbstractC2144f.m11520a(this.f91479c)) * 31) + AbstractC2144f.m11520a(this.f91480d)) * 31) + this.f91481e) * 31) + this.f91482f) * 31) + this.f91483g) * 31) + this.f91484h) * 31) + this.f91485i) * 31) + this.f91486j) * 31) + this.f91487k) * 31) + this.f91488l) * 31) + this.f91489m) * 31) + this.f91490n) * 31) + this.f91491o) * 31) + this.f91492p) * 31) + this.f91493q;
    }

    /* renamed from: i */
    public final int m96109i() {
        return this.f91489m;
    }

    /* renamed from: j */
    public final int m96110j() {
        return this.f91486j;
    }

    /* renamed from: k */
    public final int m96111k() {
        return this.f91491o;
    }

    /* renamed from: l */
    public final int m96112l() {
        return this.f91490n;
    }

    /* renamed from: m */
    public final int m96113m() {
        return this.f91492p;
    }

    /* renamed from: n */
    public final boolean m96114n() {
        return this.f91477a;
    }

    /* renamed from: o */
    public final int m96115o() {
        return this.f91483g;
    }

    /* renamed from: p */
    public final boolean m96116p() {
        return this.f91479c;
    }

    /* renamed from: q */
    public final int m96117q() {
        return this.f91482f;
    }

    /* renamed from: r */
    public final boolean m96118r() {
        return this.f91478b;
    }

    /* renamed from: s */
    public final int m96119s() {
        return this.f91481e;
    }

    public String toString() {
        return "FaceEffectPreset(lipEnable=" + this.f91477a + ", vLineEnable=" + this.f91478b + ", skinSmoothEnable=" + this.f91479c + ", colorFilterEnable=" + this.f91480d + ", vLineLevel=" + this.f91481e + ", skinSmoothLevel=" + this.f91482f + ", skinSmoothBright=" + this.f91483g + ", colorExposure=" + this.f91484h + ", colorHighlights=" + this.f91485i + ", colorShadows=" + this.f91486j + ", colorContrast=" + this.f91487k + ", colorBrightness=" + this.f91488l + ", colorSaturation=" + this.f91489m + ", colorVibrance=" + this.f91490n + ", colorSharpness=" + this.f91491o + ", colorVignette=" + this.f91492p + ", colorAvgLum=" + this.f91493q + ")";
    }

    public /* synthetic */ C18072a(boolean z11, boolean z12, boolean z13, boolean z14, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int i23, int i24, int i25, AbstractC19060k abstractC19060k) {
        this((i25 & 1) != 0 ? false : z11, (i25 & 2) != 0 ? false : z12, (i25 & 4) != 0 ? false : z13, (i25 & 8) != 0 ? false : z14, (i25 & 16) != 0 ? 0 : i11, (i25 & 32) != 0 ? 0 : i12, (i25 & 64) != 0 ? 0 : i13, (i25 & 128) != 0 ? 0 : i14, (i25 & 256) != 0 ? 0 : i15, (i25 & 512) != 0 ? 0 : i16, (i25 & 1024) != 0 ? 0 : i17, (i25 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) != 0 ? 0 : i18, (i25 & 4096) != 0 ? 0 : i19, (i25 & 8192) != 0 ? 0 : i21, (i25 & 16384) != 0 ? 0 : i22, (i25 & 32768) != 0 ? 0 : i23, (i25 & 65536) != 0 ? 0 : i24);
    }
}
