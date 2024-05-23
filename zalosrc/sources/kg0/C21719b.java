package kg0;

import ah0.C0860a;
import am.AbstractC0924m0;
import ch0.AbstractC3489d;
import com.zing.zalo.data.zalocloud.model.api.CloudMediaItemResponse;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.zalocloud.configs.C16805b;
import com.zing.zalo.zalocloud.info.C16806a;
import com.zing.zalo.zalocloud.offload.C16874a;
import com.zing.zalo.zalocloud.recover.ZaloCloudRecoverCloudMediaWorker;
import com.zing.zalocore.CoreUtility;
import dg0.AbstractC17930e;
import dh0.C17933b;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import me0.C23055e5;
import nl.C23870a;
import on0.AbstractC24341v;
import p348mi.AbstractC23306f;
import p363nh.C23744a;
import p479rc.C25727d;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qg0.C25268c;
import tb0.C26626l;
import tg0.C26676b;
import vm0.AbstractC28298d;
import wg0.C28989l;
import wm0.AbstractC29104l;
import xg0.C29623a;
import zg0.C31831a;

/* renamed from: kg0.b */
/* loaded from: classes7.dex */
public final class C21719b {
    public static final b Companion = new b(null);

    /* renamed from: h */
    private static final InterfaceC24854k f105457h;

    /* renamed from: a */
    private final C23870a f105458a;

    /* renamed from: b */
    private final C16805b f105459b;

    /* renamed from: c */
    private final C29623a f105460c;

    /* renamed from: d */
    private final C0860a f105461d;

    /* renamed from: e */
    private final C16806a f105462e;

    /* renamed from: f */
    private final C31831a f105463f;

    /* renamed from: g */
    private final InterfaceC24854k f105464g;

    /* renamed from: kg0.b$a */
    /* loaded from: classes7.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f105465q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C21719b mo12V4() {
            return c.f105466a.m112090a();
        }
    }

    /* renamed from: kg0.b$b */
    /* loaded from: classes7.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C21719b m112089a() {
            return (C21719b) C21719b.f105457h.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kg0.b$c */
    /* loaded from: classes7.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f105466a = new c();

        /* renamed from: b */
        private static final C21719b f105467b;

        static {
            C23870a m120679j2 = AbstractC23306f.m120679j2();
            AbstractC19074t.m100207e(m120679j2, "provideZaloCloudRepo(...)");
            C16805b m120633X1 = AbstractC23306f.m120633X1();
            AbstractC19074t.m100207e(m120633X1, "provideZaloCloudConfigs(...)");
            C29623a m120675i2 = AbstractC23306f.m120675i2();
            AbstractC19074t.m100207e(m120675i2, "provideZaloCloudQueueVerifier(...)");
            C0860a m120691m2 = AbstractC23306f.m120691m2();
            AbstractC19074t.m100207e(m120691m2, "provideZaloCloudSubscriptionManager(...)");
            C16806a m120643a2 = AbstractC23306f.m120643a2();
            AbstractC19074t.m100207e(m120643a2, "provideZaloCloudInfoManager(...)");
            C31831a m120687l2 = AbstractC23306f.m120687l2();
            AbstractC19074t.m100207e(m120687l2, "provideZaloCloudSettings(...)");
            f105467b = new C21719b(m120679j2, m120633X1, m120675i2, m120691m2, m120643a2, m120687l2);
        }

        private c() {
        }

        /* renamed from: a */
        public final C21719b m112090a() {
            return f105467b;
        }
    }

    /* renamed from: kg0.b$d */
    /* loaded from: classes7.dex */
    static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f105468q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C25268c mo12V4() {
            C25268c m120647b2 = AbstractC23306f.m120647b2();
            AbstractC19074t.m100207e(m120647b2, "provideZaloCloudKeyManager(...)");
            return m120647b2;
        }
    }

    /* renamed from: kg0.b$e */
    /* loaded from: classes7.dex */
    static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f105469t;

        /* renamed from: v */
        final /* synthetic */ int f105471v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i11, Continuation continuation) {
            super(2, continuation);
            this.f105471v = i11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new e(this.f105471v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f105469t;
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    if (!C21719b.this.m112072m()) {
                        return C24848g0.f119245a;
                    }
                    C26676b.m136957g("SMLZCloud", "forceVerifyCloudQueue(): source=" + this.f105471v, null, 4, null);
                    C21719b.this.f105458a.m124812h1(false);
                    C21719b.this.f105458a.m124827q1(this.f105471v);
                    C21719b.this.f105458a.m124817l1("");
                    C23870a c23870a = C21719b.this.f105458a;
                    this.f105469t = 1;
                    if (c23870a.m124760C(this) == m142578e) {
                        return m142578e;
                    }
                }
                C21719b.this.f105460c.m147236h();
            } catch (Exception e11) {
                C26676b.m136954d("SMLZCloud", e11);
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f105465q);
        f105457h = m129210a;
    }

    public C21719b(C23870a c23870a, C16805b c16805b, C29623a c29623a, C0860a c0860a, C16806a c16806a, C31831a c31831a) {
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(c23870a, "zaloCloudRepo");
        AbstractC19074t.m100208f(c16805b, "zaloCloudConfigs");
        AbstractC19074t.m100208f(c29623a, "cloudQueueVerifier");
        AbstractC19074t.m100208f(c0860a, "subscriptionManager");
        AbstractC19074t.m100208f(c16806a, "cloudInfoManager");
        AbstractC19074t.m100208f(c31831a, "cloudSettings");
        this.f105458a = c23870a;
        this.f105459b = c16805b;
        this.f105460c = c29623a;
        this.f105461d = c0860a;
        this.f105462e = c16806a;
        this.f105463f = c31831a;
        m129210a = AbstractC24856m.m129210a(d.f105468q);
        this.f105464g = m129210a;
    }

    /* renamed from: k */
    private final C25268c m112070k() {
        return (C25268c) this.f105464g.getValue();
    }

    /* renamed from: l */
    public static final C21719b m112071l() {
        return Companion.m112089a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public final boolean m112072m() {
        String str = CoreUtility.f89233i;
        if (str != null && str.length() != 0) {
            if (!this.f105459b.m89806u()) {
                C26676b.m136955e("SMLZCloudQueue", "checkVerifyCloudQueue(): Feature disabled!", C26676b.b.f126335t);
                return false;
            }
            if (this.f105458a.m124786P0()) {
                return false;
            }
            if (this.f105461d.m2466q() && !m112070k().m130757A()) {
                C26676b.m136955e("SMLZCloudQueue", "checkVerifyCloudQueue(): Cloud Key not initialized", C26676b.b.f126335t);
                return false;
            }
            if (C23055e5.m118273h(false, 1, null)) {
                return true;
            }
            C26676b.m136955e("SMLZCloudQueue", "checkVerifyCloudQueue(): Network not available", C26676b.b.f126335t);
            return false;
        }
        C26676b.m136955e("SMLZCloudQueue", "checkVerifyCloudQueue(): Empty current UID", C26676b.b.f126335t);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static final void m112073p(C21719b c21719b) {
        AbstractC19074t.m100208f(c21719b, "this$0");
        c21719b.m112075g();
    }

    /* renamed from: f */
    public final boolean m112074f(String str) {
        AbstractC19074t.m100208f(str, "ownerId");
        if (!this.f105459b.m89806u()) {
            return false;
        }
        if (this.f105461d.m2466q() && C31831a.Companion.m152940a().m152935p(str)) {
            return true;
        }
        if (!AbstractC19074t.m100204b(str, "204278670") || !this.f105459b.m89809x()) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final void m112075g() {
        try {
            if (!m112072m()) {
                return;
            }
            this.f105460c.m147236h();
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloud", e11);
        }
    }

    /* renamed from: h */
    public final void m112076h() {
        C26676b.m136957g("SMLZCloud", "clearAllMemCache()", null, 4, null);
        AbstractC23306f.m120659e2().m130814f();
        this.f105460c.m147234d();
    }

    /* renamed from: i */
    public final void m112077i() {
        String m127130z;
        String m127130z2;
        m127130z = AbstractC24341v.m127130z("─", 40);
        Object value = C28989l.Companion.m144769a().m144765r().getValue();
        Object value2 = C25727d.Companion.m132783f().getValue();
        Object value3 = ZaloCloudRecoverCloudMediaWorker.Companion.m90201h().getValue();
        m127130z2 = AbstractC24341v.m127130z("─", 50);
        AbstractC20110a.f98889a.m104564x("SMLZCloud").mo104556o(8, m127130z + "\nUI OnboardingState: " + value + "\nUI ChangeKeyState: " + value2 + "\nUI Recover State: " + value3 + "\n" + m127130z2, new Object[0]);
    }

    /* renamed from: j */
    public final void m112078j(int i11) {
        BuildersKt__Builders_commonKt.m112540d(C17933b.f90533a.m94579d(), Dispatchers.m112680b(), null, new e(i11, null), 2, null);
    }

    /* renamed from: n */
    public final boolean m112079n() {
        return this.f105460c.m147235g();
    }

    /* renamed from: o */
    public final void m112080o() {
        AbstractC17930e.Companion.m94551d().mo94530d("CHECK_VERIFY_CLOUD_MEDIA_ITEMS", new Runnable() { // from class: kg0.a
            @Override // java.lang.Runnable
            public final void run() {
                C21719b.m112073p(C21719b.this);
            }
        }, 1000L);
    }

    /* renamed from: q */
    public final void m112081q(int i11, int i12) {
        MainTabView m67645lM;
        C26676b.m136956f("onNewSubscriptionRegistered(" + i12 + ")", C26676b.b.f126331p);
        if (i11 == 100 && (m67645lM = MainTabView.m67645lM()) != null) {
            m67645lM.m67679ON();
        }
    }

    /* renamed from: r */
    public final void m112082r() {
        C26676b.m136956f("onOnboardingSetupCompleted()", C26676b.b.f126331p);
        this.f105462e.m89838g();
        this.f105463f.m152930g();
        m112075g();
    }

    /* renamed from: s */
    public final void m112083s(int i11, int i12) {
        C26676b.m136956f("onSubscriptionCancelled(): prevPlan=" + i11 + ", plan=" + i12, C26676b.b.f126331p);
        if (i12 == -1) {
            this.f105461d.m2455b();
        }
        this.f105462e.m89836d();
        C26626l.Companion.m136712a().m136708u();
        AbstractC0924m0.m3734cs(false);
        C28989l m120667g2 = AbstractC23306f.m120667g2();
        AbstractC19074t.m100207e(m120667g2, "provideZaloCloudOnboardingJobManager(...)");
        C28989l.m144745n(m120667g2, false, 1, null);
        AbstractC23306f.m120636Y1().m128521c();
        C16874a m120663f2 = AbstractC23306f.m120663f2();
        AbstractC19074t.m100207e(m120663f2, "provideZaloCloudOffloadScheduler(...)");
        C16874a.m90134h(m120663f2, false, 1, null);
    }

    /* renamed from: t */
    public final void m112084t(int i11) {
        C26676b.m136956f("onSubscriptionExpired(): prevPlan=" + i11, C26676b.b.f126331p);
        MainTabView m67645lM = MainTabView.m67645lM();
        if (m67645lM != null) {
            m67645lM.m67679ON();
        }
        C26626l.Companion.m136712a().m136708u();
        AbstractC23306f.m120667g2().m144752B();
        C16874a m120663f2 = AbstractC23306f.m120663f2();
        AbstractC19074t.m100207e(m120663f2, "provideZaloCloudOffloadScheduler(...)");
        C16874a.m90133f(m120663f2, null, 1, null);
    }

    /* renamed from: u */
    public final void m112085u(int i11, int i12) {
        C26676b.m136956f("onSubscriptionPlanChanged(): prevPlan=" + i11 + ", plan=" + i12, C26676b.b.f126331p);
        this.f105462e.m89838g();
        this.f105463f.m152930g();
        this.f105458a.m124802b0();
        this.f105458a.m124800a0();
        AbstractC23306f.m120627V1().m90253x();
        C23744a.Companion.m124119a().m124116d(150803, Integer.valueOf(i11), Integer.valueOf(i12));
    }

    /* renamed from: v */
    public final void m112086v() {
        if (!AbstractC3489d.m17501i()) {
            return;
        }
        C28989l.Companion.m144769a().m144754D();
    }

    /* renamed from: w */
    public final void m112087w(CloudMediaItemResponse cloudMediaItemResponse) {
        AbstractC19074t.m100208f(cloudMediaItemResponse, "cloudMediaItemResponse");
        this.f105460c.m147237j(cloudMediaItemResponse);
    }
}
