package un0;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: un0.f */
/* loaded from: classes7.dex */
public final class C27328f {

    /* renamed from: a */
    private final boolean f128596a;

    /* renamed from: b */
    private final boolean f128597b;

    /* renamed from: c */
    private final boolean f128598c;

    /* renamed from: d */
    private final boolean f128599d;

    /* renamed from: e */
    private final boolean f128600e;

    /* renamed from: f */
    private final boolean f128601f;

    /* renamed from: g */
    private final String f128602g;

    /* renamed from: h */
    private final boolean f128603h;

    /* renamed from: i */
    private final boolean f128604i;

    /* renamed from: j */
    private final String f128605j;

    /* renamed from: k */
    private final boolean f128606k;

    /* renamed from: l */
    private final boolean f128607l;

    public C27328f(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, String str, boolean z17, boolean z18, String str2, boolean z19, boolean z21, InterfaceC27340r interfaceC27340r) {
        AbstractC19074t.m100208f(str, "prettyPrintIndent");
        AbstractC19074t.m100208f(str2, "classDiscriminator");
        this.f128596a = z11;
        this.f128597b = z12;
        this.f128598c = z13;
        this.f128599d = z14;
        this.f128600e = z15;
        this.f128601f = z16;
        this.f128602g = str;
        this.f128603h = z17;
        this.f128604i = z18;
        this.f128605j = str2;
        this.f128606k = z19;
        this.f128607l = z21;
    }

    /* renamed from: a */
    public final boolean m139884a() {
        return this.f128606k;
    }

    /* renamed from: b */
    public final boolean m139885b() {
        return this.f128599d;
    }

    /* renamed from: c */
    public final String m139886c() {
        return this.f128605j;
    }

    /* renamed from: d */
    public final boolean m139887d() {
        return this.f128603h;
    }

    /* renamed from: e */
    public final boolean m139888e() {
        return this.f128596a;
    }

    /* renamed from: f */
    public final boolean m139889f() {
        return this.f128601f;
    }

    /* renamed from: g */
    public final boolean m139890g() {
        return this.f128597b;
    }

    /* renamed from: h */
    public final InterfaceC27340r m139891h() {
        return null;
    }

    /* renamed from: i */
    public final boolean m139892i() {
        return this.f128600e;
    }

    /* renamed from: j */
    public final String m139893j() {
        return this.f128602g;
    }

    /* renamed from: k */
    public final boolean m139894k() {
        return this.f128607l;
    }

    /* renamed from: l */
    public final boolean m139895l() {
        return this.f128604i;
    }

    /* renamed from: m */
    public final boolean m139896m() {
        return this.f128598c;
    }

    public String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f128596a + ", ignoreUnknownKeys=" + this.f128597b + ", isLenient=" + this.f128598c + ", allowStructuredMapKeys=" + this.f128599d + ", prettyPrint=" + this.f128600e + ", explicitNulls=" + this.f128601f + ", prettyPrintIndent='" + this.f128602g + "', coerceInputValues=" + this.f128603h + ", useArrayPolymorphism=" + this.f128604i + ", classDiscriminator='" + this.f128605j + "', allowSpecialFloatingPointValues=" + this.f128606k + ", useAlternativeNames=" + this.f128607l + ", namingStrategy=" + ((Object) null) + ')';
    }

    public /* synthetic */ C27328f(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, String str, boolean z17, boolean z18, String str2, boolean z19, boolean z21, InterfaceC27340r interfaceC27340r, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12, (i11 & 4) != 0 ? false : z13, (i11 & 8) != 0 ? false : z14, (i11 & 16) != 0 ? false : z15, (i11 & 32) != 0 ? true : z16, (i11 & 64) != 0 ? "    " : str, (i11 & 128) != 0 ? false : z17, (i11 & 256) != 0 ? false : z18, (i11 & 512) != 0 ? ZinstantMetaConstant.IMPRESSION_META_TYPE : str2, (i11 & 1024) == 0 ? z19 : false, (i11 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) == 0 ? z21 : true, (i11 & 4096) != 0 ? null : interfaceC27340r);
    }
}
