package de0;

import ag0.AbstractC0837p0;
import ag0.AbstractC0852x;
import ag0.C0804b;
import ag0.C0808c0;
import ag0.C0814e0;
import ag0.C0824j;
import ag0.C0829l0;
import ag0.C0833n0;
import ag0.C0856z;
import am.AbstractC0924m0;
import am.AbstractC0939u;
import am.C0943w;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions;
import au.C2352i0;
import b40.C2535j;
import b40.C2549x;
import b50.C2556d;
import bi.C2804c;
import bm.AbstractC2844b;
import bs.C3140c;
import c30.C3233c;
import ck.C3560a;
import com.zing.zalo.MainApplication;
import com.zing.zalo.analytics.ZaloAnalytics;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.feed.formpostfeed.data.TimelineFpfEntrySetting;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.libwebview.browser.p067ui.ZaloSystemWebView;
import com.zing.zalo.location.C8967m;
import com.zing.zalo.p062db.C7959d;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p062db.C7967l;
import com.zing.zalo.p077ui.ZaloBubbleActivity;
import com.zing.zalo.p077ui.ZaloLauncherActivity;
import com.zing.zalo.p077ui.floatingmp3.C11891a;
import com.zing.zalo.p077ui.maintab.me.C12159b;
import com.zing.zalo.p077ui.settings.SettingAccountAndSecurityV2View;
import com.zing.zalo.p077ui.zviews.SearchDiscoverView;
import com.zing.zalo.p077ui.zviews.VipMessagesView;
import com.zing.zalo.p077ui.zviews.ZaloListView;
import com.zing.zalo.upload.video.C16727a;
import com.zing.zalo.webview.C16786d;
import com.zing.zalo.webview.C16792j;
import com.zing.zalo.zinstant.AbstractC17148f0;
import com.zing.zalocore.CoreUtility;
import d60.C17797f;
import dh0.C17933b;
import ee.C18408p;
import eg0.AbstractC18429d;
import fi.C18953k;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ga0.C19322f1;
import ga0.C19357r0;
import gg0.AbstractC19444a;
import gw.C19610a;
import gw.C19636i1;
import gw.C19637j;
import gw.C19669z;
import hf0.AbstractC20049k;
import ho0.AbstractC20110a;
import hu.C20131e;
import in.AbstractC20631e;
import java.util.ArrayList;
import java.util.List;
import jf0.C21242e;
import kn.AbstractC21777d;
import kz.AbstractC21970a;
import l30.AbstractC22055v0;
import l30.C22018d;
import l30.C22021e0;
import l30.C22052u;
import me0.AbstractC23041d2;
import me0.AbstractC23152n3;
import me0.AbstractC23165o5;
import me0.AbstractC23179p8;
import me0.AbstractC23188q6;
import me0.AbstractC23195r2;
import me0.C23177p6;
import mg.C23288a;
import mm0.AbstractC23350e;
import nh0.C23793c;
import od0.C24226d;
import p055ce.C3432a;
import p131ei.C18434b;
import p142ey.C18631a;
import p142ey.C18644n;
import p161fg.C18922m;
import p162fh.C18935d;
import p164fn.C19027a;
import p173fz.C19172a;
import p185gc.AbstractC19383g;
import p187gk.C19464a;
import p207he.C20024r;
import p221hy.C20166b;
import p246iw.C20843c0;
import p263jc.C21216s;
import p296kc.C21661h;
import p304ks.C21912a;
import p304ks.C21914b;
import p304ks.C21927m;
import p304ks.C21928n;
import p304ks.C21932r;
import p304ks.C21933s;
import p304ks.C21937w;
import p320ld.C22436h;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p379o3.C23999j;
import p392oh.C24261h;
import p392oh.C24265l;
import p398oo.C24369l0;
import p398oo.C24371m0;
import p401or.C24417g;
import p405ov.C24559a;
import p409oz.C24585b;
import p444qd.C25227e;
import p458qr.C25482o;
import p459qs.C25489b;
import p479rc.C25727d;
import p495rx.C25994h;
import p583vq.C28594q;
import p588vw.C28644j;
import p589vx.C28669n;
import p604wb.C28905e;
import p621wu.C29249f;
import p641xd.C29583g;
import p645xh.C29628e;
import p645xh.C29630g;
import p645xh.C29632i;
import p651xn.C30169a;
import p654xq.C30196f;
import p691yr.C31060j;
import p716zh.C31849b1;
import p716zh.C31948ha;
import p716zh.C31986k3;
import p716zh.C31994kb;
import p716zh.C32026md;
import p716zh.C32036n8;
import p716zh.C32037n9;
import p716zh.C32065p8;
import p716zh.C32100s1;
import p716zh.C32119t6;
import p732zy.C32600p;
import pd0.C24730d;
import pm0.C24848g0;
import pr.C24906b;
import r30.AbstractC25636f;
import r30.C25641k;
import s00.AbstractC26080o;
import s00.C26076k;
import si.C26263i;
import ss.C26379k;
import th.C26688i;
import th.C26691l;
import tn.C26747f0;
import tn.C26761p;
import tn.C26767v;
import tr.C26883g;
import u00.C26939u;
import v00.C27415j;
import vg.AbstractC28025b8;
import vg.C28023b6;
import vg.C28176r6;
import vg.C28203u6;
import vg.C28208v2;
import vg.C28213v7;
import ws.C29210k;
import yf0.C30930b;
import yf0.C30939f0;
import yf0.C30940g;
import yf0.C30946k;
import zm.voip.service.C32246a;

/* renamed from: de0.e */
/* loaded from: classes4.dex */
public final class C17907e extends AbstractC19383g {
    public static final a Companion = new a(null);

    /* renamed from: de0.e$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: de0.e$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private final boolean f90423a;

        /* renamed from: b */
        private final C3560a f90424b;

        /* renamed from: c */
        private final boolean f90425c;

        /* renamed from: d */
        private final C2352i0 f90426d;

        public b(boolean z11, C3560a c3560a, boolean z12, C2352i0 c2352i0) {
            this.f90423a = z11;
            this.f90424b = c3560a;
            this.f90425c = z12;
            this.f90426d = c2352i0;
        }

        /* renamed from: a */
        public final boolean m94475a() {
            return this.f90423a;
        }

        /* renamed from: b */
        public final C3560a m94476b() {
            return this.f90424b;
        }

        /* renamed from: c */
        public final C2352i0 m94477c() {
            return this.f90426d;
        }

        /* renamed from: d */
        public final boolean m94478d() {
            return this.f90425c;
        }
    }

    /* renamed from: de0.e$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC0939u {

        /* renamed from: b */
        final /* synthetic */ C2352i0 f90428b;

        c(C2352i0 c2352i0) {
            this.f90428b = c2352i0;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C17907e.this.m94441G();
            C17907e.this.m94456i(this.f90428b, "LOGOUT-Task-10-waitLogoutDone-DatabaseBackgroundWorker", 123116);
        }
    }

    /* renamed from: de0.e$d */
    /* loaded from: classes4.dex */
    public static final class d extends ZaloAnalytics.C7296e {
        d() {
        }

        @Override // com.zing.zalo.analytics.ZaloAnalytics.C7296e
        /* renamed from: e */
        public void mo2312e() {
            AbstractC0924m0.m3317Oj(System.currentTimeMillis());
        }

        @Override // com.zing.zalo.analytics.ZaloAnalytics.C7296e
        /* renamed from: f */
        public void mo2313f() {
            AbstractC0924m0.m3317Oj(System.currentTimeMillis());
        }
    }

    /* renamed from: A */
    private final void m94435A(Context context) {
        C0943w.f3447a.m4468b();
        C28176r6.m141702d().m141703a();
        C19637j.f97466a.m102852j();
        AbstractC23306f.m120569C0().m17789l();
        AbstractC28025b8.m141433D();
        C0804b.m2025g().m2031e();
        C8967m.m47867E().m47932q(true);
        AbstractC23309i.m122478ur(0L);
        C18408p.Companion.m97554t();
        AbstractC23309i.m121170Lq(0L);
        C25994h.f124017a.m133917e();
        C2804c.f11236a.m13564t();
        AbstractC0924m0.m3229Li(0L);
        AbstractC0924m0.m3258Mi(0L);
        C18935d.Companion.m99234a().m99225i();
        C29210k.Companion.m145896a().m145831F();
        C26688i.f126427a.m137067a();
        C25489b.f122105a.m132044d();
        C32600p.f150676a.m157896c();
        AbstractC0924m0.m3848gm(0L);
        C26379k.f125351a.m135933d();
        AbstractC0924m0.m3398Rd(0L);
        C28669n.Companion.m143559a().m143536J();
        C29583g.f136521a.m146995e();
        AbstractC23306f.m120720v1().m120474g();
    }

    /* renamed from: B */
    private final void m94436B() {
        C28023b6.m141250h0().m141370p();
        C28023b6.m141262r2();
        C28023b6.m141250h0().m141359m();
    }

    /* renamed from: C */
    private final void m94437C(Context context) {
        AbstractC23304d.f113266D0 = false;
        AbstractC23304d.f113270E0 = false;
        AbstractC23304d.f113306N0 = 0;
        AbstractC23304d.f113298L0 = "";
        AbstractC23304d.f113302M0 = "";
        AbstractC23304d.f113310O0 = 0L;
        AbstractC23309i.m122020ih();
        AbstractC23309i.m122523vz(false);
        AbstractC23309i.m121137Ku(context, "");
        AbstractC23309i.m122505vh(AbstractC26080o.a.f124275b);
    }

    /* renamed from: D */
    private final void m94438D() {
        C19027a.m100086c().m100087a();
        C28208v2.m142128t().m142147z();
        AbstractC20049k.m104110c();
        C16727a.m89194o();
        C23999j.m125713W1();
    }

    /* renamed from: E */
    private final void m94439E(Context context) {
        C26747f0.m137582I().m137673Z0();
        C24730d.m128465h().m128475n();
        C26767v.m137782d().m137784b();
        C26761p.m137741q().m137762j();
        C24371m0.Companion.m127483a().mo127469a();
        C30169a.f140177a.m148801a().m44997e(TimelineFpfEntrySetting.Companion.m44990a());
        C22052u.m115085y().m115099s();
        C22052u.m115085y().m115098r();
        C22021e0.m114963p().m114977J(context);
        AbstractC22055v0.m115135Y();
        C22021e0.m114963p().m114976I();
        C7960e.m41971c6().m42548u3();
        C7960e.m41971c6().m42059A4();
        C28594q.m143005j().m143007e();
        C32036n8.m154515e().m154524l();
        C26883g.a aVar = C26883g.Companion;
        aVar.m138535a(0).m138525c();
        aVar.m138535a(1).m138525c();
        C31060j.f143193a.m150939e();
        C3140c.f13243a.m15793c();
        C24369l0.Companion.m127458b();
        C25482o.f122075a.m131998S();
        C22018d.f108408a.m114949d();
    }

    /* renamed from: F */
    private final void m94440F() {
        AbstractC23306f.m120692n().m133044c();
        AbstractC23306f.m120688m().m132991f();
        AbstractC23306f.m120684l().m126157i();
        AbstractC23306f.m120676j().m128409d();
        AbstractC23306f.m120591J1().m107232b();
        AbstractC23306f.m120594K1().m93890b();
        AbstractC23306f.m120732z1().m109398b();
        AbstractC23306f.m120567B1().m99698b();
        AbstractC23306f.m120572D0().m103211X0(false);
        AbstractC23306f.m120605O0().m124380c();
        C17933b.f90533a.m94578c();
        AbstractC23306f.m120633X1().m89797c();
        AbstractC23306f.m120643a2().m89836d();
        AbstractC23306f.m120687l2().m152928e();
        AbstractC23306f.m120655d2().m112076h();
        AbstractC23306f.m120577F().m137506h();
        AbstractC23306f.m120679j2().m124843y();
        AbstractC23306f.m120667g2().m144762m(true);
        AbstractC23306f.m120636Y1().m128522f();
        AbstractC23306f.m120627V1().m90252w();
        AbstractC23306f.m120663f2().m90142g(true);
        AbstractC0924m0.m3467To(false);
        C25727d.Companion.m132788l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public final void m94441G() {
        C7960e.m41971c6().m42596yb();
        C7960e.m41971c6().m42365d0();
        C7960e.m41971c6().m42535sb();
        AbstractC23309i.m120837Cq(0L);
        C7960e.m41971c6().m42545tb();
        AbstractC23309i.m120874Dq(0L);
        Object obj = AbstractC23304d.f113423p1;
        AbstractC19074t.m100207e(obj, "lockLogout");
        synchronized (obj) {
            AbstractC23304d.f113419o1 = true;
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type java.lang.Object");
            obj.notifyAll();
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: H */
    private final void m94442H(Context context) {
        C29249f.Companion.m146032b().m146028c();
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: de0.a
            @Override // java.lang.Runnable
            public final void run() {
                C17907e.m94443I();
            }
        });
        AbstractC23309i.m121838dp("");
        C23177p6.m119386c().m119390b();
        AbstractC23309i.m122477uq(0L);
        AbstractC23309i.m122178mo(0L);
        AbstractC23309i.m121844dv(0);
        C16792j.m89700i().m89704f();
        C21242e.m110043o();
        C30939f0.Companion.m150483j(context);
        C30940g.Companion.m150490a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public static final void m94443I() {
        try {
            ZaloSystemWebView.Companion.m47844a();
            CookieManager.getInstance().flush();
            C30930b.Companion.m150239a().m150237i();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("LogOutUseCase", e11);
        }
    }

    /* renamed from: J */
    private final void m94444J() {
        AbstractC17148f0.m91693l();
        AbstractC23309i.m121936gA("");
        AbstractC23309i.m121974hA("");
    }

    /* renamed from: L */
    private final void m94445L(C2352i0 c2352i0) {
        try {
            C24559a.m127933c("LogOutUseCase", "tryResetDataOnCaughtException()");
            m94456i(c2352i0, "LOGOUT-Task-21-HasException-Start", 123127);
            m94473z();
            AbstractC23306f.m120584H0().m2627j();
            AbstractC23306f.m120562A().m2544k();
            C29210k.Companion.m145896a().m145831F();
            C18935d.Companion.m99234a().m99225i();
            C20843c0.Companion.m109092a().m109084o0();
            C0808c0.m2045a();
            C0829l0.m2172a();
            MainApplication.Companion.m35499b();
            C19027a.m100086c().m100087a();
            C24730d.m128465h().m128475n();
            m94456i(c2352i0, "LOGOUT-Task-22-HasException-End", 123128);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("LogOutUseCase", e11);
        }
    }

    /* renamed from: M */
    private final void m94446M() {
        try {
            C26263i.m135051q0();
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: de0.d
                @Override // java.lang.Runnable
                public final void run() {
                    C17907e.m94447N();
                }
            });
        } catch (Exception e11) {
            AbstractC23350e.m122776f("LogOutUseCase", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public static final void m94447N() {
        try {
            AbstractC2844b.m13730f(31457280L, 20971520L);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("LogOutUseCase", e11);
        }
    }

    /* renamed from: O */
    private final void m94448O() {
        C7853b.Companion.m40150a().m40144o1();
        C31948ha.m153587d().m153599m();
        C32065p8.m154684c().m154698n();
    }

    /* renamed from: P */
    private final void m94449P() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            Object obj = AbstractC23304d.f113423p1;
            AbstractC19074t.m100207e(obj, "lockLogout");
            synchronized (obj) {
                do {
                    try {
                        if (AbstractC23304d.f113415n1 && AbstractC23304d.f113419o1) {
                            break;
                        }
                        long max = Math.max(0L, Math.min(5000 - (System.currentTimeMillis() - currentTimeMillis), 5000L));
                        if (max <= 0) {
                            break;
                        }
                        Object obj2 = AbstractC23304d.f113423p1;
                        AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type java.lang.Object");
                        obj2.wait(max);
                    } finally {
                    }
                } while (System.currentTimeMillis() - currentTimeMillis <= 4500);
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("LogOutUseCase", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public final void m94456i(C2352i0 c2352i0, String str, int i11) {
        AbstractC23179p8.m119427m(c2352i0, str, i11);
    }

    /* renamed from: j */
    private final Intent m94457j(Context context, C3560a c3560a) {
        String m18087a;
        Intent intent = new Intent(context, (Class<?>) ZaloLauncherActivity.class);
        intent.addFlags(67108864);
        intent.setFlags(32768);
        intent.addFlags(268435456);
        if (c3560a != null && (m18087a = c3560a.m18087a()) != null && m18087a.length() != 0) {
            intent.putExtra("EXTRA_KICK_OUT_DATA", c3560a.m18092f().toString());
        }
        intent.putExtra("BOL_EXTRA_LOGOUT_GET_FLOW_LOGIN", true);
        return intent;
    }

    /* renamed from: k */
    private final void m94458k() {
        if (C29630g.m147300J0() && C29630g.m147299E0().m93374B()) {
            C29630g.m147299E0().mo93411k();
        }
        if (C29632i.m147327J0() && C29632i.m147326E0().m93374B()) {
            C29632i.m147326E0().mo93411k();
        }
    }

    /* renamed from: l */
    private final void m94459l() {
        try {
            C24559a.m127933c("LogOutUseCase", "Chat queue size: " + C23288a.f113033a.m120389f() + ", DB queue size: " + C0824j.m2154c());
        } catch (Exception e11) {
            AbstractC23350e.m122776f("LogOutUseCase", e11);
        }
    }

    /* renamed from: m */
    private final void m94460m(final C2352i0 c2352i0, String str) {
        C23288a c23288a = C23288a.f113033a;
        AbstractC18429d.m97660a(c23288a, new Runnable() { // from class: de0.b
            @Override // java.lang.Runnable
            public final void run() {
                C17907e.m94461n(C17907e.this, c2352i0);
            }
        });
        C0824j.m2153b(new c(c2352i0));
        m94456i(c2352i0, "LOGOUT-Task-11", 123117);
        C21661h.f105066a.m111634l();
        m94449P();
        C0814e0.m2066l();
        m94456i(c2352i0, "LOGOUT-Task-12-waitLogoutDone", 123118);
        m94473z();
        m94456i(c2352i0, "LOGOUT-Task-13-clearGlobalData", 123119);
        c23288a.m120387b();
        C7967l.Companion.m42748b().m42732G();
        m94466s();
        C0808c0.m2045a();
        C0829l0.m2172a();
        m94456i(c2352i0, "LOGOUT-Task-14-ZaloChatControl-closeAllChats", 123120);
        MainApplication.C6895a c6895a = MainApplication.Companion;
        c6895a.m35499b();
        m94456i(c2352i0, "LOGOUT-Task-15", 123121);
        m94438D();
        m94435A(c6895a.m35500c());
        C20843c0.Companion.m109092a().m109084o0();
        m94469v();
        m94472y();
        m94456i(c2352i0, "LOGOUT-Task-16", 123122);
        PrivacyInfo.m45131c();
        PrivacyInfo.m45130b();
        C24417g c24417g = C24417g.f117907a;
        c24417g.m127701b();
        c24417g.m127700a();
        C28905e.m144373n().m144388g();
        C32026md.f147453a.m154441m();
        m94448O();
        m94456i(c2352i0, "LOGOUT-Task-17", 123123);
        m94436B();
        AbstractC23309i.m121747bA(true);
        AbstractC23309i.m121060Ir(0L);
        m94456i(c2352i0, "LOGOUT-Task-18", 123124);
        List m114303A = C21927m.m114302u().m114303A();
        AbstractC19074t.m100207e(m114303A, "getOnlineFriend(...)");
        synchronized (m114303A) {
            C21927m.m114302u().m114303A().clear();
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
        C28213v7.f131603a.m142174b();
        AbstractC23304d.f113297L = null;
        AbstractC23304d.f113313P = null;
        m94465r();
        m94456i(c2352i0, "LOGOUT-Task-19-hangupCallWhenLogout", 123125);
        SettingAccountAndSecurityV2View.Companion.m73674d(false);
        VipMessagesView.f79314A1 = 0L;
        C19357r0.f96152a.m101450d();
        SearchDiscoverView.f77091N1 = 0L;
        SearchDiscoverView.f77092O1 = new ArrayList();
        C19322f1.m101119K();
        C26691l.m137139n();
        C31849b1.m153097n().m153113p();
        AbstractC23309i.m122400sn(false);
        C26076k.m134208q().m134224w();
        GeolocationPermissions.getInstance().clearAll();
        AbstractC23195r2.m119521h();
        if (Build.VERSION.SDK_INT >= 25 && AbstractC21777d.m112317h()) {
            m94471x();
        }
        ZaloBubbleActivity.Companion.m57055i();
        C24906b.f119505a.m129549L(true);
        C30196f.a.m148915c(C30196f.Companion, null, null, null, null, null, 31, null).m148913u();
        C30946k.a aVar = C30946k.Companion;
        if (aVar.m150530c()) {
            aVar.m150528a().m150516j();
        }
        C19172a.m100592c();
        m94456i(c2352i0, "LOGOUT-Task-20", 123126);
        AbstractC19444a.m101697e(new Runnable() { // from class: de0.c
            @Override // java.lang.Runnable
            public final void run() {
                C17907e.m94462o();
            }
        });
        m94456i(c2352i0, "LOGOUT-Task-21", 123127);
        AbstractC23309i.m121393Rr(0L);
        C32037n9.f147516a.m154554l();
        C0833n0.f2934p.m2207c();
        C31986k3.f147083a.m154089G0();
        m94456i(c2352i0, "LOGOUT-Task-22", 123128);
        C17797f.f90007a.m94004g();
        AbstractC20631e.Companion.m107510g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static final void m94461n(C17907e c17907e, C2352i0 c2352i0) {
        AbstractC19074t.m100208f(c17907e, "this$0");
        if (C23288a.f113033a.m120389f() == 0) {
            C7959d.Companion.m41848a();
        }
        Object obj = AbstractC23304d.f113423p1;
        AbstractC19074t.m100207e(obj, "lockLogout");
        synchronized (obj) {
            AbstractC23304d.f113415n1 = true;
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type java.lang.Object");
            obj.notifyAll();
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
        c17907e.m94456i(c2352i0, "LOGOUT-Task-9-waitLogoutDone-ChatTaskDispatcher", 123115);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static final void m94462o() {
        C16786d.Companion.m89645a();
        C27415j.Companion.m140374a();
        C11891a.Companion.m66084d();
    }

    /* renamed from: p */
    private final void m94463p(boolean z11, C2352i0 c2352i0) {
        ZaloAnalytics.C7293b c7293b = ZaloAnalytics.Companion;
        if (c7293b.m37219b().m37204W()) {
            try {
                ZaloAnalytics m37219b = c7293b.m37219b();
                String m120926F4 = AbstractC23309i.m120926F4();
                AbstractC19074t.m100207e(m120926F4, "getHttpHeaderViewerKeyFromServer(...)");
                m37219b.m37192C(m120926F4, new d());
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
        ZaloAnalytics.Companion.m37218a();
        AbstractC0924m0.m4329wq("");
        m94446M();
        C24226d.Companion.m126435b();
        AbstractC23152n3.m118991D0();
        m94456i(c2352i0, "LOGOUT-Task-1", 123107);
        AbstractC0852x.m2333J();
        AbstractC23309i.m122181mr(0L);
        C2556d.m12981o().m13008z();
        C22436h.f109760a.m115919o();
        C18631a.m98446i().m98459q();
        C18631a.m98450u();
        C21932r.f107858a.m114399d();
        AbstractC0924m0.m4356xo(0);
        AbstractC0924m0.m3941jp(-1L);
        m94456i(c2352i0, "LOGOUT-Task-2", 123108);
        AbstractC23309i.m121132Kp(AbstractC23309i.m122158m5());
        MainApplication.C6895a c6895a = MainApplication.Companion;
        m94468u(c6895a.m35500c());
        m94456i(c2352i0, "LOGOUT-Task-3", 123109);
        try {
            m94467t(c6895a.m35500c());
            m94456i(c2352i0, "LOGOUT-Task-4", 123110);
        } catch (Exception e12) {
            AbstractC23350e.m122776f("LogOutUseCase", e12);
        }
        try {
            m94442H(MainApplication.Companion.m35500c());
            m94456i(c2352i0, "LOGOUT-Task-5", 123111);
        } catch (Exception e13) {
            AbstractC23350e.m122776f("LogOutUseCase", e13);
        }
        C21928n.Companion.m114389a().m114374c();
        C7960e.m41971c6().m42249R();
        C7960e.m41971c6().m42355c0();
        C18644n.m98531l().m98547i();
        C21933s.m114404I().m114472j();
        C21933s.m114404I().m114430M0();
        m94444J();
        if (C29628e.m147249E0() != null) {
            C29628e.m147249E0().m93412k0(-51);
            C29628e.m147249E0().m147286o1();
        }
        m94456i(c2352i0, "LOGOUT-Task-6", 123112);
        m94458k();
        C7960e.m41971c6().m42528s3();
        C7960e.m41971c6().m42467mb();
        m94456i(c2352i0, "LOGOUT-Task-7", 123113);
        C31994kb.m154233h().m154250s();
        m94470w();
        C21912a.m114159g().m114168i();
        C21937w.f108027a.m114573l();
        C21914b.f107731a.m114199j();
        C25641k.m132506o().m132526v();
        m94456i(c2352i0, "LOGOUT-Task-8", 123114);
        if (AbstractC23165o5.m119333b() && z11) {
            m94437C(MainApplication.Companion.m35500c());
        }
        AbstractC23304d.f113341W = 0;
        AbstractC23304d.f113337V = false;
        AbstractC0924m0.m2915An("");
        m94439E(MainApplication.Companion.m35500c());
        m94440F();
        C0856z.Companion.m2416b().m2410v();
        C3233c.f13805a.m16423b();
    }

    /* renamed from: q */
    private final void m94464q() {
        C18922m.m99141t().m99156p();
        AbstractC25636f.m132474d();
        C26263i.m135055u().m135088v0();
    }

    /* renamed from: r */
    private final void m94465r() {
        C32100s1.m154953d().m154959c();
        C20024r.m103940i();
        C32246a.f148777h.m155689a().m155686S();
    }

    /* renamed from: s */
    private final void m94466s() {
        AbstractC23306f.m120584H0().m2627j();
        AbstractC23306f.m120562A().m2544k();
        C28644j.m143233Y().m143287T0();
        C7960e.m41971c6().m42065Ab();
        C19610a.m102633j().m102637g();
        C18953k.Companion.m99426f().m99382F0();
        C18434b.Companion.m97695b().m97689u();
        C24261h.Companion.m126656b().m126638L();
        C24265l.Companion.m126709b().m126688O();
        AbstractC23304d.f113412m2 = null;
        AbstractC23304d.f113280G2 = null;
        AbstractC23304d.f113284H2 = null;
        AbstractC23304d.f113288I2.clear();
        C32119t6.m155009c().m155011a();
        C0856z.Companion.m2416b().m2411w();
        ((C21216s) C21216s.Companion.m122672a()).m109891r1();
    }

    /* renamed from: t */
    private final void m94467t(Context context) {
        C20166b.Companion.m105162b().m105160l(context);
        AbstractC23309i.m120764Ar(0L);
        AbstractC23309i.m121582Wv("");
        AbstractC23309i.m121319Pr(0L);
        AbstractC23309i.m121686Zo("");
        AbstractC23309i.m121356Qr(0L);
    }

    /* renamed from: u */
    private final void m94468u(Context context) {
        AbstractC23309i.m121467Tr(0L);
        AbstractC23309i.m121728as(0L);
        AbstractC23309i.m121615Xr(0L);
        AbstractC23309i.m121541Vr(0L);
        AbstractC23309i.m121252Ny(604800000L);
        AbstractC23309i.m121578Wr(0L);
        AbstractC23309i.m121318Pq(0L);
        AbstractC23309i.m121469Tt(0);
        AbstractC23309i.m121363Qy(0L);
        AbstractC23309i.m121765br(-1L);
        AbstractC23309i.m120807Bx(false);
        AbstractC23309i.m121430Sr(0L);
        AbstractC23309i.m121922fx(true);
        AbstractC23309i.m120792Bi(0);
        AbstractC21970a.m114741j(0L);
        AbstractC21970a.m114742k(0L);
        AbstractC21970a.m114738g(0);
        AbstractC23309i.m121311Pj("");
        AbstractC23188q6.f112416a = "";
        AbstractC23188q6.f112417b = "";
        AbstractC23309i.m121348Qj(0L);
        AbstractC23309i.m121210Mt(0);
        AbstractC23309i.m122669zx(6);
        AbstractC23309i.m120800Bq(0L);
        AbstractC23309i.m120763Aq(0L);
        AbstractC23309i.m121836dn(false);
        AbstractC23309i.m121502Up(0);
        AbstractC23309i.m122475uo(false);
        AbstractC23309i.m122031is(2);
        AbstractC23309i.m122293pr(0L);
        AbstractC23309i.m121993hs(2);
        AbstractC23309i.m122256or(0L);
        AbstractC23309i.m122068js(2);
        AbstractC23309i.m122367rr(0L);
        AbstractC23309i.m121620Xw(0);
        AbstractC23309i.m121102Jw(0);
        AbstractC23309i.m121388Rm(false);
        AbstractC23309i.m121059Iq(0L);
        AbstractC23309i.m120978Gj(0);
        AbstractC23309i.m122374ry(System.currentTimeMillis());
        AbstractC23309i.m122558wx(true);
        AbstractC23309i.m122551wq(0L);
        AbstractC23309i.m121133Kq(0L);
        AbstractC23309i.m121649Yo("");
        AbstractC23309i.m120985Gq(0L);
        int m121376Ra = AbstractC23309i.m121376Ra();
        if (m121376Ra == -1 || m121376Ra == 0) {
            AbstractC23309i.m121249Nv(0);
            AbstractC23309i.m121949gm(false);
            AbstractC23309i.m121129Km(false);
        }
        AbstractC23309i.m121688Zq(0L);
        AbstractC23309i.m122411sy(0L);
        AbstractC23309i.m122662zq(0L);
        AbstractC23309i.m120761Ao("");
        AbstractC23309i.m120798Bo("");
        AbstractC23309i.m120835Co("");
        AbstractC23309i.m121103Jx(0);
        AbstractC23309i.m120956Fy(0);
        AbstractC23309i.m121771bx(true);
        AbstractC23309i.m122590xs("{}");
        if (!ZaloListView.m86977gN()) {
            AbstractC0924m0.m3693bh(AbstractC23304d.f113337V);
            AbstractC23309i.m122370ru(context, AbstractC23304d.f113341W);
            AbstractC23309i.m120913Es("");
            AbstractC23309i.m120876Ds("");
        }
        AbstractC23309i.m120987Gs("");
        AbstractC23309i.m121659Yy(0);
        AbstractC23309i.m122589xr(0L);
        AbstractC23309i.m121847dy(0L);
        AbstractC23309i.m121355Qq(0L);
        AbstractC23309i.m122222nu(0);
        AbstractC23309i.m122095kh();
        AbstractC23309i.m121734ay(0L);
        AbstractC23309i.m122073jx("");
        AbstractC23309i.m121209Ms(false);
        AbstractC0924m0.m3784ei(false);
        AbstractC0924m0.m3177Jo("");
        AbstractC0924m0.m4242tq("");
        AbstractC0924m0.m4001lp(0L);
        AbstractC0924m0.m3721cf("");
        AbstractC0924m0.m3287Ni("");
        AbstractC0924m0.m3403Ri(0L);
        AbstractC0924m0.m3316Oi(0L);
        AbstractC0924m0.m3900ie("");
    }

    /* renamed from: v */
    private final void m94469v() {
        C3432a.f14402a.m17232a();
        C28203u6.f131407a.m141807a();
        C24585b.Companion.m128049a().m128032g();
        C12159b.f63441a.m67997a();
        C25227e.Companion.m130506a().m130497d();
    }

    /* renamed from: w */
    private final void m94470w() {
        C7960e.m41971c6().m42460m3();
        AbstractC23309i.m120941Fj(0L);
        AbstractC23041d2.m118208g(C20131e.f99303a.m104934P());
        AbstractC23309i.m121914fp(0);
        C7960e.m41971c6().m42477nb();
    }

    /* renamed from: x */
    private final void m94471x() {
        C26939u.m138770q().m138777B();
        C26939u.m138770q().m138785z();
    }

    /* renamed from: y */
    private final void m94472y() {
        AbstractC23306f.m120583H().m110201c();
    }

    /* renamed from: z */
    private final void m94473z() {
        AbstractC23304d.m120533d();
        C23793c.Companion.m124321a().mo124312g();
        C19636i1.Companion.m102800a().m102784r();
        C19669z.Companion.m103232a().m103192G();
        C19464a.m101782a();
        C2535j.f10308a.m12767A();
        C2549x.f10397a.m12855l();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ef  */
    @Override // p185gc.AbstractC19383g
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo12006b(b bVar) {
        boolean z11;
        AbstractC19074t.m100208f(bVar, "params");
        boolean m94475a = bVar.m94475a();
        C3560a m94476b = bVar.m94476b();
        boolean m94478d = bVar.m94478d();
        C2352i0 m94477c = bVar.m94477c();
        AbstractC20110a.a aVar = AbstractC20110a.f98889a;
        aVar.m104564x("LogOutUseCase").mo104556o(8, "\nBegin logout current user (" + CoreUtility.f89233i + "). Kick out: " + m94475a + ", reset pass code: " + m94478d + "\n", new Object[0]);
        m94459l();
        m94464q();
        try {
            m94463p(m94478d, m94477c);
            String str = CoreUtility.f89233i;
            if (str == null) {
                str = "";
            }
            MainApplication.C6895a c6895a = MainApplication.Companion;
            AbstractC23309i.m122057jh(c6895a.m35500c());
            m94460m(m94477c, str);
            if (m94475a) {
                c6895a.m35500c().startActivity(m94457j(c6895a.m35500c(), m94476b));
                m94456i(m94477c, "LOGOUT-Task-FINALLY-kickout", 123129);
            }
            aVar.m104564x("LogOutUseCase").mo104556o(8, "\nFinished logout current user (" + CoreUtility.f89233i + ").\n", new Object[0]);
        } catch (Exception e11) {
            z11 = true;
            try {
                AbstractC23350e.m122776f("LogOutUseCase", e11);
                m94445L(m94477c);
                if (m94475a) {
                    MainApplication.C6895a c6895a2 = MainApplication.Companion;
                    c6895a2.m35500c().startActivity(m94457j(c6895a2.m35500c(), m94476b));
                    m94456i(m94477c, "LOGOUT-Task-FINALLY-kickout", 123129);
                }
                AbstractC20110a.f98889a.m104564x("LogOutUseCase").mo104556o(8, "\nFinished logout current user (" + CoreUtility.f89233i + ").\n", new Object[0]);
            } catch (Throwable th2) {
                th = th2;
                if (z11) {
                    m94445L(m94477c);
                }
                if (m94475a) {
                    MainApplication.C6895a c6895a3 = MainApplication.Companion;
                    c6895a3.m35500c().startActivity(m94457j(c6895a3.m35500c(), m94476b));
                    m94456i(m94477c, "LOGOUT-Task-FINALLY-kickout", 123129);
                }
                AbstractC20110a.f98889a.m104564x("LogOutUseCase").mo104556o(8, "\nFinished logout current user (" + CoreUtility.f89233i + ").\n", new Object[0]);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            z11 = false;
            if (z11) {
            }
            if (m94475a) {
            }
            AbstractC20110a.f98889a.m104564x("LogOutUseCase").mo104556o(8, "\nFinished logout current user (" + CoreUtility.f89233i + ").\n", new Object[0]);
            throw th;
        }
    }
}
