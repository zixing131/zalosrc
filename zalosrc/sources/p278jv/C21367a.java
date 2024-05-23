package p278jv;

import androidx.work.AbstractC2144f;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: jv.a */
/* loaded from: classes4.dex */
public final class C21367a {

    /* renamed from: a */
    private final boolean f104198a;

    /* renamed from: b */
    private final boolean f104199b;

    /* renamed from: c */
    private final boolean f104200c;

    /* renamed from: d */
    private final boolean f104201d;

    /* renamed from: e */
    private final boolean f104202e;

    /* renamed from: f */
    private final boolean f104203f;

    /* renamed from: g */
    private final boolean f104204g;

    /* renamed from: h */
    private final boolean f104205h;

    /* renamed from: i */
    private final boolean f104206i;

    /* renamed from: j */
    private final boolean f104207j;

    /* renamed from: k */
    private final boolean f104208k;

    /* renamed from: l */
    private final boolean f104209l;

    /* renamed from: m */
    private final boolean f104210m;

    /* renamed from: n */
    private final String f104211n;

    /* renamed from: o */
    private String f104212o;

    /* renamed from: p */
    private boolean f104213p;

    public C21367a(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z21, boolean z22, boolean z23, boolean z24, String str, String str2, boolean z25) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(str2, "title");
        this.f104198a = z11;
        this.f104199b = z12;
        this.f104200c = z13;
        this.f104201d = z14;
        this.f104202e = z15;
        this.f104203f = z16;
        this.f104204g = z17;
        this.f104205h = z18;
        this.f104206i = z19;
        this.f104207j = z21;
        this.f104208k = z22;
        this.f104209l = z23;
        this.f104210m = z24;
        this.f104211n = str;
        this.f104212o = str2;
        this.f104213p = z25;
    }

    /* renamed from: a */
    public final C21367a m110735a(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z21, boolean z22, boolean z23, boolean z24, String str, String str2, boolean z25) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(str2, "title");
        return new C21367a(z11, z12, z13, z14, z15, z16, z17, z18, z19, z21, z22, z23, z24, str, str2, z25);
    }

    /* renamed from: c */
    public final boolean m110736c() {
        return this.f104207j;
    }

    /* renamed from: d */
    public final boolean m110737d() {
        return this.f104208k;
    }

    /* renamed from: e */
    public final String m110738e() {
        return this.f104212o;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21367a)) {
            return false;
        }
        C21367a c21367a = (C21367a) obj;
        return this.f104198a == c21367a.f104198a && this.f104199b == c21367a.f104199b && this.f104200c == c21367a.f104200c && this.f104201d == c21367a.f104201d && this.f104202e == c21367a.f104202e && this.f104203f == c21367a.f104203f && this.f104204g == c21367a.f104204g && this.f104205h == c21367a.f104205h && this.f104206i == c21367a.f104206i && this.f104207j == c21367a.f104207j && this.f104208k == c21367a.f104208k && this.f104209l == c21367a.f104209l && this.f104210m == c21367a.f104210m && AbstractC19074t.m100204b(this.f104211n, c21367a.f104211n) && AbstractC19074t.m100204b(this.f104212o, c21367a.f104212o) && this.f104213p == c21367a.f104213p;
    }

    /* renamed from: f */
    public final String m110739f() {
        return this.f104211n;
    }

    /* renamed from: g */
    public final boolean m110740g() {
        return this.f104213p;
    }

    /* renamed from: h */
    public final void m110741h(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f104212o = str;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((AbstractC2144f.m11520a(this.f104198a) * 31) + AbstractC2144f.m11520a(this.f104199b)) * 31) + AbstractC2144f.m11520a(this.f104200c)) * 31) + AbstractC2144f.m11520a(this.f104201d)) * 31) + AbstractC2144f.m11520a(this.f104202e)) * 31) + AbstractC2144f.m11520a(this.f104203f)) * 31) + AbstractC2144f.m11520a(this.f104204g)) * 31) + AbstractC2144f.m11520a(this.f104205h)) * 31) + AbstractC2144f.m11520a(this.f104206i)) * 31) + AbstractC2144f.m11520a(this.f104207j)) * 31) + AbstractC2144f.m11520a(this.f104208k)) * 31) + AbstractC2144f.m11520a(this.f104209l)) * 31) + AbstractC2144f.m11520a(this.f104210m)) * 31) + this.f104211n.hashCode()) * 31) + this.f104212o.hashCode()) * 31) + AbstractC2144f.m11520a(this.f104213p);
    }

    /* renamed from: i */
    public final void m110742i(boolean z11) {
        this.f104213p = z11;
    }

    public String toString() {
        return "BrowserViewState(browserShowing=" + this.f104198a + ", isDesktopBrowsingMode=" + this.f104199b + ", canChangeBrowsingMode=" + this.f104200c + ", showPrivacyGrade=" + this.f104201d + ", showSearchIcon=" + this.f104202e + ", showClearButton=" + this.f104203f + ", showTabsButton=" + this.f104204g + ", showMenuButton=" + this.f104205h + ", canSharePage=" + this.f104206i + ", canGoBack=" + this.f104207j + ", canGoForward=" + this.f104208k + ", addToHomeEnabled=" + this.f104209l + ", addToHomeVisible=" + this.f104210m + ", url=" + this.f104211n + ", title=" + this.f104212o + ", isUseSubTitle=" + this.f104213p + ")";
    }

    public /* synthetic */ C21367a(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z21, boolean z22, boolean z23, boolean z24, String str, String str2, boolean z25, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12, (i11 & 4) != 0 ? true : z13, (i11 & 8) != 0 ? false : z14, (i11 & 16) != 0 ? false : z15, (i11 & 32) != 0 ? false : z16, (i11 & 64) != 0 ? true : z17, (i11 & 128) != 0 ? true : z18, (i11 & 256) != 0 ? false : z19, (i11 & 512) != 0 ? false : z21, (i11 & 1024) != 0 ? false : z22, (i11 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) != 0 ? false : z23, (i11 & 4096) == 0 ? z24 : false, (i11 & 8192) != 0 ? "" : str, (i11 & 16384) == 0 ? str2 : "", (i11 & 32768) != 0 ? true : z25);
    }
}
