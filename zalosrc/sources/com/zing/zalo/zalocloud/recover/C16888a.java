package com.zing.zalo.zalocloud.recover;

import ac.C0732w;
import am.AbstractC0924m0;
import ch0.AbstractC3489d;
import com.zing.zalo.MainApplication;
import com.zing.zalo.zalocloud.recover.AbstractC16889b;
import com.zing.zalo.zalocloud.recover.ZaloCloudRecoverCloudMediaWorker;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import hu.C20128b;
import ln0.AbstractC22543l;
import nl.C23870a;
import og0.C24252c;
import og0.EnumC24251b;
import on0.AbstractC24341v;
import p348mi.AbstractC23306f;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import tg0.C26676b;
import yg0.EnumC30980a;

/* renamed from: com.zing.zalo.zalocloud.recover.a */
/* loaded from: classes7.dex */
public final class C16888a {
    public static final b Companion = new b(null);

    /* renamed from: a */
    private static final InterfaceC24854k f85921a;

    /* renamed from: com.zing.zalo.zalocloud.recover.a$a */
    /* loaded from: classes7.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f85922q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C16888a mo12V4() {
            return c.f85923a.m90257a();
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.recover.a$b */
    /* loaded from: classes7.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C16888a m90256a() {
            return (C16888a) C16888a.f85921a.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.zalocloud.recover.a$c */
    /* loaded from: classes7.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f85923a = new c();

        /* renamed from: b */
        private static final C16888a f85924b = new C16888a();

        private c() {
        }

        /* renamed from: a */
        public final C16888a m90257a() {
            return f85924b;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f85922q);
        f85921a = m129210a;
    }

    /* renamed from: b */
    private final void m90215b() {
        if (AbstractC3489d.m17506n()) {
            int m4398z8 = AbstractC0924m0.m4398z8();
            if (m4398z8 != 0) {
                if (m4398z8 == 2) {
                    C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_grace_downloading_log_out", null, null, null, 14, null);
                }
            } else {
                C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_grace_status_log_out", null, null, null, 14, null);
            }
        }
        m90223F(false);
        m90220C(false);
        m90219B(Integer.MAX_VALUE);
        ZaloCloudRecoverCloudMediaWorker.Companion.m90199e();
    }

    /* renamed from: h */
    public static final C16888a m90216h() {
        return Companion.m90256a();
    }

    /* renamed from: z */
    private final void m90217z() {
        AbstractC0924m0.m2948Br(0L);
        AbstractC0924m0.m2919Ar(0L);
        AbstractC0924m0.m2977Cr(0L);
    }

    /* renamed from: A */
    public final void m90218A() {
        m90222E(AbstractC16889b.c.f85930d.m90258a());
        m90224G(false);
        m90223F(false);
        ZaloCloudRecoverCloudMediaWorker.Companion.m90206r();
    }

    /* renamed from: B */
    public final void m90219B(int i11) {
        AbstractC0924m0.m3763dr(i11);
    }

    /* renamed from: C */
    public final void m90220C(boolean z11) {
        AbstractC0924m0.m3470Tr(z11);
    }

    /* renamed from: D */
    public final void m90221D(long j11) {
        AbstractC0924m0.m4272ur(j11);
    }

    /* renamed from: E */
    public final void m90222E(int i11) {
        AbstractC0924m0.m3823fr(i11);
    }

    /* renamed from: F */
    public final void m90223F(boolean z11) {
        AbstractC0924m0.m3035Er(z11);
    }

    /* renamed from: G */
    public final void m90224G(boolean z11) {
        AbstractC0924m0.m3006Dr(z11);
    }

    /* renamed from: H */
    public final void m90225H(int i11) {
        C26676b.m136957g("ZCloudGracePeriodManager", "setRecoverState = " + i11, null, 4, null);
        AbstractC0924m0.m3441Sr(i11);
    }

    /* renamed from: I */
    public final void m90226I(boolean z11) {
        AbstractC0924m0.m3064Fr(z11);
    }

    /* renamed from: J */
    public final void m90227J(int i11) {
        AbstractC0924m0.m4243tr(i11);
    }

    /* renamed from: K */
    public final void m90228K(boolean z11) {
        AbstractC0924m0.m3793er(z11);
    }

    /* renamed from: L */
    public final void m90229L(long j11) {
        AbstractC0924m0.m4301vr(j11);
    }

    /* renamed from: M */
    public final void m90230M(boolean z11) {
        AbstractC0924m0.m4359xr(z11);
    }

    /* renamed from: N */
    public final void m90231N(int i11) {
        AbstractC0924m0.m4388yr(i11);
    }

    /* renamed from: O */
    public final void m90232O(int i11) {
        AbstractC0924m0.m4417zr(i11);
    }

    /* renamed from: c */
    public final void m90233c() {
        String m127130z;
        String m127130z2;
        m127130z = AbstractC24341v.m127130z("─", 25);
        boolean m90248s = m90248s();
        boolean m90246q = m90246q();
        boolean m90247r = m90247r();
        int m90239j = m90239j();
        int m90237g = m90237g();
        int m90239j2 = m90239j();
        int m90238i = m90238i();
        int m90242m = m90242m();
        int m90243n = m90243n();
        long m90240k = m90240k();
        int m90243n2 = m90243n();
        long m90236f = m90236f();
        boolean m90249t = m90249t();
        boolean m90245p = m90245p();
        m127130z2 = AbstractC24341v.m127130z("─", 50);
        AbstractC20110a.f98889a.m104564x("ZCloudGracePeriodManager").mo104556o(8, m127130z + "\nisRecovering: " + m90248s + "\nisDismissedBanner: " + m90246q + "\nisDismissedSuccessBanner: " + m90247r + "\ngetRecoveringErrorCode: " + m90239j + "\ngetErrorCodeDismissedRecoverBanner: " + m90237g + "\ngetRecoveringErrorCode: " + m90239j2 + "\ngetRecoverState: " + m90238i + "\ngetTotalDownloadItem: " + m90242m + "\ngetTotalRemainItem: " + m90243n + "\ngetRemainDownloadSize: " + m90240k + "\ngetTotalRemainItem: " + m90243n2 + "\ngetDownloadSize: " + m90236f + "\nisRegenMsgConfigEnable: " + m90249t + "\nisDismissRedDotMainTab: " + m90245p + "\n" + m127130z2, new Object[0]);
    }

    /* renamed from: d */
    public final ZaloCloudRecoverCloudMediaWorker.AbstractC16884f m90234d() {
        ZaloCloudRecoverCloudMediaWorker.C16883e c16883e = ZaloCloudRecoverCloudMediaWorker.Companion;
        if (AbstractC19074t.m100204b(c16883e.m90201h().getValue(), ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.c.f85905b)) {
            return m90241l();
        }
        return (ZaloCloudRecoverCloudMediaWorker.AbstractC16884f) c16883e.m90201h().getValue();
    }

    /* renamed from: e */
    public final int m90235e() {
        int m3479U7 = AbstractC0924m0.m3479U7();
        if (m3479U7 == -1) {
            return Integer.MAX_VALUE;
        }
        return m3479U7;
    }

    /* renamed from: f */
    public final long m90236f() {
        return AbstractC0924m0.m3894i8();
    }

    /* renamed from: g */
    public final int m90237g() {
        return AbstractC0924m0.m3508V7();
    }

    /* renamed from: i */
    public final int m90238i() {
        return AbstractC0924m0.m4398z8();
    }

    /* renamed from: j */
    public final int m90239j() {
        return AbstractC0924m0.m3864h8();
    }

    /* renamed from: k */
    public final long m90240k() {
        return AbstractC0924m0.m3924j8();
    }

    /* renamed from: l */
    public final ZaloCloudRecoverCloudMediaWorker.AbstractC16884f m90241l() {
        float m116579b;
        float m116579b2;
        int m90238i = m90238i();
        if (m90238i != 0) {
            if (m90238i != 1) {
                if (m90238i != 2) {
                    if (m90238i != 3) {
                        if (m90238i != 4) {
                            if (m90238i != 5) {
                                return ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.c.f85905b;
                            }
                            return new ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.d(5);
                        }
                        return new ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.d(4);
                    }
                    float m90243n = m90243n();
                    m116579b2 = AbstractC22543l.m116579b(m90242m(), 1.0f);
                    float f11 = 100.0f - ((m90243n / m116579b2) * 100);
                    int m90239j = m90239j();
                    if (m90239j != 1) {
                        if (m90239j != 2) {
                            if (m90239j != 3) {
                                if (m90239j != 4) {
                                    if (m90239j != 5) {
                                        return ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.c.f85905b;
                                    }
                                    return new ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.b(new AbstractC16889b.f(f11));
                                }
                                return new ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.b(new AbstractC16889b.b(f11));
                            }
                            return new ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.b(new AbstractC16889b.a(f11));
                        }
                        return new ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.b(new AbstractC16889b.e(f11));
                    }
                    return new ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.b(new AbstractC16889b.d(m90240k() - C20128b.m104764k(), f11));
                }
                float m90243n2 = m90243n();
                m116579b = AbstractC22543l.m116579b(m90242m(), 1.0f);
                return new ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.a(100.0f - ((m90243n2 / m116579b) * 100));
            }
            return new ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.d(1);
        }
        return ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.c.f85905b;
    }

    /* renamed from: m */
    public final int m90242m() {
        return AbstractC0924m0.m3984l8();
    }

    /* renamed from: n */
    public final int m90243n() {
        return AbstractC0924m0.m4014m8();
    }

    /* renamed from: o */
    public final boolean m90244o() {
        if (AbstractC23306f.m120691m2().m2464o() && C24252c.f117152a.m126600f(EnumC24251b.f117146q)) {
            C23870a m120679j2 = AbstractC23306f.m120679j2();
            AbstractC19074t.m100207e(m120679j2, "provideZaloCloudRepo(...)");
            if (C23870a.m124718I0(m120679j2, false, null, null, 6, null).m41251i().m41265a() > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    public final boolean m90245p() {
        return AbstractC0924m0.m3959kd();
    }

    /* renamed from: q */
    public final boolean m90246q() {
        return AbstractC0924m0.m3839gd();
    }

    /* renamed from: r */
    public final boolean m90247r() {
        return AbstractC0924m0.m3809fd();
    }

    /* renamed from: s */
    public final boolean m90248s() {
        return AbstractC0924m0.m3869hd();
    }

    /* renamed from: t */
    public final boolean m90249t() {
        return AbstractC0924m0.m3689bd();
    }

    /* renamed from: u */
    public final void m90250u() {
        C26676b.m136957g("ZCloudGracePeriodManager", "onClearAllData()", null, 4, null);
        m90251v(ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.c.f85905b);
        AbstractC0924m0.m4330wr(EnumC30980a.f142925q.m150597c());
    }

    /* renamed from: v */
    public final void m90251v(ZaloCloudRecoverCloudMediaWorker.AbstractC16884f abstractC16884f) {
        AbstractC19074t.m100208f(abstractC16884f, "state");
        ZaloCloudRecoverCloudMediaWorker.C16883e c16883e = ZaloCloudRecoverCloudMediaWorker.Companion;
        c16883e.m90199e();
        m90215b();
        m90226I(false);
        c16883e.m90207s(abstractC16884f);
        m90222E(AbstractC16889b.c.f85930d.m90258a());
        m90230M(false);
        m90221D(0L);
        m90232O(0);
        m90231N(0);
        m90229L(0L);
        m90217z();
    }

    /* renamed from: w */
    public final void m90252w() {
        C26676b.m136957g("ZCloudGracePeriodManager", "onReLogin()", null, 4, null);
        m90215b();
    }

    /* renamed from: x */
    public final void m90253x() {
        if (!AbstractC3489d.m17512t() && !AbstractC3489d.m17505m()) {
            m90250u();
        } else if (m90248s()) {
            C26676b.m136957g("ZCloudGracePeriodManager", "onFinishGracePeriod() - end grace when recovering", null, 4, null);
            m90251v(new ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.d(4));
        } else {
            C26676b.m136957g("ZCloudGracePeriodManager", "onFinishGracePeriod() - expire grace", null, 4, null);
            m90251v(ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.c.f85905b);
        }
    }

    /* renamed from: y */
    public final void m90254y() {
        ZaloCloudRecoverCloudMediaWorker.Companion.m90205q(MainApplication.Companion.m35500c());
    }
}
