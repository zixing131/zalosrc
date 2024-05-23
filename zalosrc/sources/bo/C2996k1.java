package bo;

import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.feed.mvp.profile.model.SmartCropInfo;
import com.zing.zalo.feed.mvp.profile.model.theme.ThemeItem;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: bo.k1 */
/* loaded from: classes4.dex */
public final class C2996k1 {

    /* renamed from: a */
    private String f11831a;

    /* renamed from: b */
    private String f11832b;

    /* renamed from: c */
    private float f11833c;

    /* renamed from: d */
    private ThemeItem f11834d;

    /* renamed from: e */
    private SmartCropInfo f11835e;

    /* renamed from: f */
    private String f11836f;

    /* renamed from: g */
    private PrivacyInfo f11837g;

    /* renamed from: h */
    private boolean f11838h;

    /* renamed from: i */
    private boolean f11839i;

    /* renamed from: j */
    private String f11840j;

    /* renamed from: k */
    private boolean f11841k;

    /* renamed from: l */
    private boolean f11842l;

    /* renamed from: m */
    private boolean f11843m;

    /* renamed from: n */
    private boolean f11844n;

    public C2996k1(String str, String str2) {
        AbstractC19074t.m100208f(str, "title");
        AbstractC19074t.m100208f(str2, "desc");
        this.f11831a = str;
        this.f11832b = str2;
        this.f11833c = 0.33333334f;
        this.f11834d = ThemeItem.Companion.m46365a();
        this.f11835e = new SmartCropInfo(0, 0, 0, 0, 15, (AbstractC19060k) null);
        this.f11836f = "";
        this.f11837g = new PrivacyInfo();
        this.f11838h = true;
        this.f11840j = "";
        this.f11844n = true;
    }

    /* renamed from: a */
    public final String m14201a() {
        return this.f11832b;
    }

    /* renamed from: b */
    public final String m14202b() {
        return this.f11836f;
    }

    /* renamed from: c */
    public final PrivacyInfo m14203c() {
        return this.f11837g;
    }

    /* renamed from: d */
    public final float m14204d() {
        return this.f11833c;
    }

    /* renamed from: e */
    public final String m14205e() {
        return this.f11840j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2996k1)) {
            return false;
        }
        C2996k1 c2996k1 = (C2996k1) obj;
        return AbstractC19074t.m100204b(this.f11831a, c2996k1.f11831a) && AbstractC19074t.m100204b(this.f11832b, c2996k1.f11832b);
    }

    /* renamed from: f */
    public final ThemeItem m14206f() {
        return this.f11834d;
    }

    /* renamed from: g */
    public final String m14207g() {
        return this.f11831a;
    }

    /* renamed from: h */
    public final boolean m14208h() {
        return this.f11842l;
    }

    public int hashCode() {
        return (this.f11831a.hashCode() * 31) + this.f11832b.hashCode();
    }

    /* renamed from: i */
    public final boolean m14209i() {
        return this.f11838h;
    }

    /* renamed from: j */
    public final boolean m14210j() {
        return this.f11841k;
    }

    /* renamed from: k */
    public final boolean m14211k() {
        return this.f11839i;
    }

    /* renamed from: l */
    public final boolean m14212l() {
        return this.f11843m;
    }

    /* renamed from: m */
    public final boolean m14213m() {
        return this.f11844n;
    }

    /* renamed from: n */
    public final void m14214n(SmartCropInfo smartCropInfo) {
        AbstractC19074t.m100208f(smartCropInfo, "<set-?>");
        this.f11835e = smartCropInfo;
    }

    /* renamed from: o */
    public final void m14215o(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f11832b = str;
    }

    /* renamed from: p */
    public final void m14216p(boolean z11) {
        this.f11842l = z11;
    }

    /* renamed from: q */
    public final void m14217q(boolean z11) {
        this.f11838h = z11;
    }

    /* renamed from: r */
    public final void m14218r(boolean z11) {
        this.f11841k = z11;
    }

    /* renamed from: s */
    public final void m14219s(boolean z11) {
        this.f11839i = z11;
    }

    /* renamed from: t */
    public final void m14220t(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f11836f = str;
    }

    public String toString() {
        return "HeaderAlbumDetailData(title=" + this.f11831a + ", desc=" + this.f11832b + ")";
    }

    /* renamed from: u */
    public final void m14221u(PrivacyInfo privacyInfo) {
        AbstractC19074t.m100208f(privacyInfo, "<set-?>");
        this.f11837g = privacyInfo;
    }

    /* renamed from: v */
    public final void m14222v(float f11) {
        this.f11833c = f11;
    }

    /* renamed from: w */
    public final void m14223w(boolean z11) {
        this.f11843m = z11;
    }

    /* renamed from: x */
    public final void m14224x(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f11840j = str;
    }

    /* renamed from: y */
    public final void m14225y(ThemeItem themeItem) {
        AbstractC19074t.m100208f(themeItem, "<set-?>");
        this.f11834d = themeItem;
    }

    /* renamed from: z */
    public final void m14226z(boolean z11) {
        this.f11844n = z11;
    }

    public /* synthetic */ C2996k1(String str, String str2, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2);
    }
}
