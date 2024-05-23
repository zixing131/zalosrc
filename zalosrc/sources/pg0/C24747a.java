package pg0;

import ah0.C0860a;
import am.AbstractC0924m0;
import ch0.AbstractC3489d;
import com.zing.zalo.backuprestore.encryption.DataProtectionCode;
import com.zing.zalo.zalocloud.configs.C16805b;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hc0.EnumC19985o;
import ho0.AbstractC20110a;
import is.EnumC20799i;
import og0.C24252c;
import og0.EnumC24251b;
import on0.AbstractC24341v;
import p348mi.AbstractC23306f;
import p363nh.C23744a;
import pm.C24832c;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import si.C26263i;
import tg0.C26676b;

/* renamed from: pg0.a */
/* loaded from: classes7.dex */
public final class C24747a {
    public static final b Companion = new b(null);

    /* renamed from: b */
    private static final InterfaceC24854k f118824b;

    /* renamed from: a */
    private boolean f118825a;

    /* renamed from: pg0.a$a */
    /* loaded from: classes7.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f118826q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C24747a mo12V4() {
            return c.f118827a.m128542a();
        }
    }

    /* renamed from: pg0.a$b */
    /* loaded from: classes7.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C24747a m128541a() {
            return (C24747a) C24747a.f118824b.getValue();
        }
    }

    /* renamed from: pg0.a$c */
    /* loaded from: classes7.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f118827a = new c();

        /* renamed from: b */
        private static final C24747a f118828b = new C24747a();

        private c() {
        }

        /* renamed from: a */
        public final C24747a m128542a() {
            return f118828b;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f118826q);
        f118824b = m129210a;
    }

    /* renamed from: d */
    private final void m128504d() {
        m128514F(false);
        m128508y(false);
        m128516H(false);
        m128517I(false);
        m128519K(0L);
    }

    /* renamed from: e */
    private final void m128505e() {
        m128539z(false);
        m128515G(false);
        m128518J(0L);
    }

    /* renamed from: j */
    public static final C24747a m128506j() {
        return Companion.m128541a();
    }

    /* renamed from: v */
    private final boolean m128507v() {
        if (!m128529n() && !m128530o() && !m128532q() && AbstractC3489d.m17507o()) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    private final void m128508y(boolean z11) {
        AbstractC0924m0.m3673ar(z11);
    }

    /* renamed from: A */
    public final void m128509A(boolean z11) {
        m128539z(true);
        m128508y(false);
        m128511C(!z11);
        C23744a.Companion.m124119a().m124116d(150811, new Object[0]);
    }

    /* renamed from: B */
    public final void m128510B(EnumC19985o enumC19985o) {
        AbstractC19074t.m100208f(enumC19985o, "screen");
        AbstractC0924m0.m3585Xq(enumC19985o.m103754c());
    }

    /* renamed from: C */
    public final void m128511C(boolean z11) {
        AbstractC0924m0.m3853gr(z11);
    }

    /* renamed from: D */
    public final void m128512D(boolean z11) {
        this.f118825a = z11;
    }

    /* renamed from: E */
    public final void m128513E(int i11, String str) {
        AbstractC19074t.m100208f(str, "dataProtectionCode");
        DataProtectionCode dataProtectionCode = new DataProtectionCode(i11, str);
        C26676b.m136957g("SMLZCloudCriticalCaseManager", "setOldBackupTempKey(): " + dataProtectionCode, null, 4, null);
        AbstractC0924m0.m3093Gr(dataProtectionCode.m37264d());
    }

    /* renamed from: F */
    public final void m128514F(boolean z11) {
        AbstractC0924m0.m3354Pr(z11);
    }

    /* renamed from: G */
    public final void m128515G(boolean z11) {
        AbstractC0924m0.m3557Wr(z11);
    }

    /* renamed from: H */
    public final void m128516H(boolean z11) {
        C26676b.m136957g("SMLZCloudCriticalCaseManager", "setUsedToPressStartInSetupZCloud - " + z11, null, 4, null);
        AbstractC0924m0.m3704bs(z11);
    }

    /* renamed from: I */
    public final void m128517I(boolean z11) {
        AbstractC0924m0.m3325Or(z11);
    }

    /* renamed from: J */
    public final void m128518J(long j11) {
        AbstractC0924m0.m3499Ur(j11);
    }

    /* renamed from: K */
    public final void m128519K(long j11) {
        AbstractC0924m0.m3528Vr(j11);
    }

    /* renamed from: b */
    public final boolean m128520b() {
        if (C16805b.Companion.m89811a().m89807v() && EnumC20799i.f102200A.m108529c() && ((C24832c.m129121a() || C0860a.Companion.m2473a().m2468s()) && !AbstractC23306f.m120636Y1().m128507v())) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void m128521c() {
        C26676b.m136957g("SMLZCloudCriticalCaseManager", "cancelSubscriptionCallback()", null, 4, null);
        m128504d();
        m128505e();
        m128511C(false);
        m128514F(false);
        m128510B(EnumC19985o.f98288q);
        C23744a.Companion.m124119a().m124116d(150811, new Object[0]);
    }

    /* renamed from: f */
    public final void m128522f() {
        m128508y(false);
        m128539z(false);
        m128515G(false);
        m128511C(false);
    }

    /* renamed from: g */
    public final void m128523g() {
        m128504d();
        m128505e();
        m128511C(true);
        m128514F(false);
        m128510B(EnumC19985o.f98288q);
        C23744a.Companion.m124119a().m124116d(150811, new Object[0]);
    }

    /* renamed from: h */
    public final void m128524h() {
        String m127130z;
        String m127130z2;
        m127130z = AbstractC24341v.m127130z("─", 21);
        boolean m128529n = m128529n();
        boolean m128530o = m128530o();
        boolean m128536u = m128536u();
        boolean m128532q = m128532q();
        m127130z2 = AbstractC24341v.m127130z("─", 50);
        AbstractC20110a.f98889a.m104564x("SMLZCloudCriticalCaseManager").mo104556o(8, m127130z + "\nisCC6SetupInProgress: " + m128529n + "\nisCC9ConnectToZCloud: " + m128530o + "\nisUsedToPressStartInSetupZCloud: " + m128536u + "\nisExistZCloudLocalKey: " + m128532q + "\n" + m127130z2, new Object[0]);
    }

    /* renamed from: i */
    public final Object m128525i() {
        return EnumC19985o.Companion.m103755a(AbstractC0924m0.m3363Q7());
    }

    /* renamed from: k */
    public final DataProtectionCode m128526k() {
        DataProtectionCode.Companion companion = DataProtectionCode.Companion;
        String m4134q8 = AbstractC0924m0.m4134q8();
        AbstractC19074t.m100207e(m4134q8, "getZcloudKeepOldBackupTempKey(...)");
        return companion.m37265a(m4134q8);
    }

    /* renamed from: l */
    public final long m128527l() {
        return AbstractC0924m0.m2900A8();
    }

    /* renamed from: m */
    public final long m128528m() {
        return AbstractC0924m0.m2929B8();
    }

    /* renamed from: n */
    public final boolean m128529n() {
        return AbstractC0924m0.m3629Zc();
    }

    /* renamed from: o */
    public final boolean m128530o() {
        return AbstractC0924m0.m3659ad();
    }

    /* renamed from: p */
    public final boolean m128531p() {
        C24252c c24252c = C24252c.f117152a;
        EnumC24251b enumC24251b = EnumC24251b.f117148s;
        if ((!c24252c.m126600f(enumC24251b) && !c24252c.m126600f(EnumC24251b.f117146q)) || (!c24252c.m126600f(EnumC24251b.f117146q) && c24252c.m126600f(enumC24251b) && !C26263i.m135012E())) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public final boolean m128532q() {
        return AbstractC0924m0.m3719cd();
    }

    /* renamed from: r */
    public final boolean m128533r() {
        return this.f118825a;
    }

    /* renamed from: s */
    public final boolean m128534s() {
        return AbstractC0924m0.m3929jd();
    }

    /* renamed from: t */
    public final boolean m128535t() {
        if (AbstractC0924m0.m3989ld() && AbstractC23306f.m120691m2().m2468s()) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public final boolean m128536u() {
        return AbstractC0924m0.m4049nd();
    }

    /* renamed from: w */
    public final boolean m128537w() {
        return AbstractC0924m0.m3899id();
    }

    /* renamed from: x */
    public final void m128538x() {
        m128539z(false);
        m128508y(true);
        m128511C(false);
        C23744a.Companion.m124119a().m124116d(150811, new Object[0]);
    }

    /* renamed from: z */
    public final void m128539z(boolean z11) {
        AbstractC0924m0.m3703br(z11);
    }
}
