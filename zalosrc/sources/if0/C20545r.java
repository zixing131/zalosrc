package if0;

import androidx.work.AbstractC2144f;
import androidx.work.AbstractC2147g0;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19074t;
import if0.InterfaceC20544q;
import od0.C24230h;
import od0.EnumC24229g;

/* renamed from: if0.r */
/* loaded from: classes5.dex */
public final class C20545r {

    /* renamed from: a */
    private final long f100892a;

    /* renamed from: b */
    private String f100893b;

    /* renamed from: c */
    private final int f100894c;

    /* renamed from: d */
    private final EnumC24229g f100895d;

    /* renamed from: e */
    private final String f100896e;

    /* renamed from: f */
    private final String f100897f;

    /* renamed from: g */
    private final boolean f100898g;

    /* renamed from: h */
    private final boolean f100899h;

    /* renamed from: i */
    private String f100900i;

    /* renamed from: j */
    private InterfaceC20544q.a f100901j;

    /* renamed from: k */
    private long f100902k;

    /* renamed from: l */
    private int f100903l;

    /* renamed from: m */
    private C24230h f100904m;

    /* renamed from: n */
    private boolean f100905n;

    /* renamed from: o */
    private InterfaceC20544q f100906o;

    /* renamed from: p */
    private InterfaceC20546s f100907p;

    public C20545r(long j11, String str, int i11, EnumC24229g enumC24229g, String str2, String str3, boolean z11, boolean z12) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(enumC24229g, "uploadFeature");
        AbstractC19074t.m100208f(str2, "localPath");
        AbstractC19074t.m100208f(str3, "uidTo");
        this.f100892a = j11;
        this.f100893b = str;
        this.f100894c = i11;
        this.f100895d = enumC24229g;
        this.f100896e = str2;
        this.f100897f = str3;
        this.f100898g = z11;
        this.f100899h = z12;
        this.f100901j = InterfaceC20544q.a.f100884p;
    }

    /* renamed from: a */
    public final InterfaceC20544q.a m106750a() {
        return this.f100901j;
    }

    /* renamed from: b */
    public final long m106751b() {
        return this.f100892a;
    }

    /* renamed from: c */
    public final String m106752c() {
        return this.f100896e;
    }

    /* renamed from: d */
    public final InterfaceC20544q m106753d() {
        return this.f100906o;
    }

    /* renamed from: e */
    public final long m106754e() {
        return this.f100902k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20545r)) {
            return false;
        }
        C20545r c20545r = (C20545r) obj;
        return this.f100892a == c20545r.f100892a && AbstractC19074t.m100204b(this.f100893b, c20545r.f100893b) && this.f100894c == c20545r.f100894c && this.f100895d == c20545r.f100895d && AbstractC19074t.m100204b(this.f100896e, c20545r.f100896e) && AbstractC19074t.m100204b(this.f100897f, c20545r.f100897f) && this.f100898g == c20545r.f100898g && this.f100899h == c20545r.f100899h;
    }

    /* renamed from: f */
    public final int m106755f() {
        return this.f100903l;
    }

    /* renamed from: g */
    public final String m106756g() {
        return this.f100900i;
    }

    /* renamed from: h */
    public final String m106757h() {
        return this.f100897f;
    }

    public int hashCode() {
        return (((((((((((((AbstractC2147g0.m11521a(this.f100892a) * 31) + this.f100893b.hashCode()) * 31) + this.f100894c) * 31) + this.f100895d.hashCode()) * 31) + this.f100896e.hashCode()) * 31) + this.f100897f.hashCode()) * 31) + AbstractC2144f.m11520a(this.f100898g)) * 31) + AbstractC2144f.m11520a(this.f100899h);
    }

    /* renamed from: i */
    public final EnumC24229g m106758i() {
        return this.f100895d;
    }

    /* renamed from: j */
    public final int m106759j() {
        return this.f100894c;
    }

    /* renamed from: k */
    public final C24230h m106760k() {
        return this.f100904m;
    }

    /* renamed from: l */
    public final InterfaceC20546s m106761l() {
        return this.f100907p;
    }

    /* renamed from: m */
    public final String m106762m() {
        return this.f100893b;
    }

    /* renamed from: n */
    public final boolean m106763n() {
        return this.f100898g;
    }

    /* renamed from: o */
    public final boolean m106764o() {
        return this.f100899h;
    }

    /* renamed from: p */
    public final boolean m106765p() {
        return this.f100905n;
    }

    /* renamed from: q */
    public final void m106766q(InterfaceC20544q.a aVar) {
        AbstractC19074t.m100208f(aVar, "<set-?>");
        this.f100901j = aVar;
    }

    /* renamed from: r */
    public final void m106767r(InterfaceC20544q interfaceC20544q) {
        this.f100906o = interfaceC20544q;
    }

    /* renamed from: s */
    public final void m106768s(long j11) {
        this.f100902k = j11;
    }

    /* renamed from: t */
    public final void m106769t(int i11) {
        this.f100903l = i11;
    }

    public String toString() {
        return "VoiceToTextProcessingContent(id=" + this.f100892a + ", url=" + this.f100893b + ", uploadId=" + this.f100894c + ", uploadFeature=" + this.f100895d + ", localPath=" + this.f100896e + ", uidTo=" + this.f100897f + ", isE2EE=" + this.f100898g + ", isMaybeRolled=" + this.f100899h + ")";
    }

    /* renamed from: u */
    public final void m106770u(String str) {
        this.f100900i = str;
    }

    /* renamed from: v */
    public final void m106771v(C24230h c24230h) {
        this.f100904m = c24230h;
    }

    /* renamed from: w */
    public final void m106772w(InterfaceC20546s interfaceC20546s) {
        this.f100907p = interfaceC20546s;
    }

    /* renamed from: x */
    public final void m106773x(boolean z11) {
        this.f100905n = z11;
    }

    /* renamed from: y */
    public final void m106774y(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f100893b = str;
    }
}
