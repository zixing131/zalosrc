package ah0;

import am.AbstractC0924m0;
import ch0.AbstractC3489d;
import com.zing.zalo.data.zalocloud.model.api.CloudSubscriptionInfo;
import com.zing.zalo.data.zalocloud.model.api.SubscriptionInfo;
import com.zing.zalo.zalocloud.configs.C16805b;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import java.util.concurrent.TimeUnit;
import kg0.C21719b;
import nh0.InterfaceC23792b;
import nl.C23870a;
import on0.AbstractC24341v;
import org.json.JSONObject;
import p348mi.AbstractC23306f;
import p613wl.C29085a;
import pg0.C24747a;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import tg0.C26676b;
import un0.AbstractC27323a;
import zm.AbstractC32236a;

/* renamed from: ah0.a */
/* loaded from: classes7.dex */
public final class C0860a {
    public static final b Companion = new b(null);

    /* renamed from: d */
    private static final InterfaceC24854k f3156d;

    /* renamed from: a */
    private final C23870a f3157a;

    /* renamed from: b */
    private final C16805b f3158b;

    /* renamed from: c */
    private final InterfaceC23792b f3159c;

    /* renamed from: ah0.a$a */
    /* loaded from: classes7.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f3160q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C0860a mo12V4() {
            return c.f3161a.m2474a();
        }
    }

    /* renamed from: ah0.a$b */
    /* loaded from: classes7.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C0860a m2473a() {
            return (C0860a) C0860a.f3156d.getValue();
        }
    }

    /* renamed from: ah0.a$c */
    /* loaded from: classes7.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f3161a = new c();

        /* renamed from: b */
        private static final C0860a f3162b;

        static {
            C23870a m120679j2 = AbstractC23306f.m120679j2();
            AbstractC19074t.m100207e(m120679j2, "provideZaloCloudRepo(...)");
            C16805b m120633X1 = AbstractC23306f.m120633X1();
            AbstractC19074t.m100207e(m120633X1, "provideZaloCloudConfigs(...)");
            InterfaceC23792b m120579F1 = AbstractC23306f.m120579F1();
            AbstractC19074t.m100207e(m120579F1, "provideTimeProvider(...)");
            f3162b = new C0860a(m120679j2, m120633X1, m120579F1);
        }

        private c() {
        }

        /* renamed from: a */
        public final C0860a m2474a() {
            return f3162b;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f3160q);
        f3156d = m129210a;
    }

    public C0860a(C23870a c23870a, C16805b c16805b, InterfaceC23792b interfaceC23792b) {
        AbstractC19074t.m100208f(c23870a, "cloudRepo");
        AbstractC19074t.m100208f(c16805b, "cloudConfigs");
        AbstractC19074t.m100208f(interfaceC23792b, "timeProvider");
        this.f3157a = c23870a;
        this.f3158b = c16805b;
        this.f3159c = interfaceC23792b;
    }

    /* renamed from: c */
    private final void m2451c() {
        C26676b.m136955e("SMLZCloudSubscription", "clearSubscriptionInfo()", C26676b.b.f126331p);
        this.f3157a.m124810g1(null);
    }

    /* renamed from: e */
    public static final C0860a m2452e() {
        return Companion.m2473a();
    }

    /* renamed from: g */
    public static /* synthetic */ long m2453g(C0860a c0860a, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return c0860a.m2457f(z11);
    }

    /* renamed from: k */
    public static /* synthetic */ void m2454k(C0860a c0860a, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        c0860a.m2460j(i11, z11);
    }

    /* renamed from: b */
    public final void m2455b() {
        C26676b.m136957g("SMLZCloudSubscription", "clearAllCacheData()", null, 4, null);
        m2451c();
    }

    /* renamed from: d */
    public final void m2456d() {
        String m127130z;
        String m127130z2;
        m127130z = AbstractC24341v.m127130z("─", 28);
        int m2459i = m2459i();
        CloudSubscriptionInfo m2458h = m2458h();
        m127130z2 = AbstractC24341v.m127130z("─", 50);
        AbstractC20110a.f98889a.m104564x("SMLZCloudSubscription").mo104556o(8, m127130z + "\nPlan: " + m2459i + "\nSubscription Info: " + m2458h + "\n" + m127130z2, new Object[0]);
    }

    /* renamed from: f */
    public final long m2457f(boolean z11) {
        long j11;
        CloudSubscriptionInfo m2458h = AbstractC23306f.m120691m2().m2458h();
        if (m2458h != null) {
            long m41317a = m2458h.m41317a();
            if (z11) {
                j11 = TimeUnit.DAYS.toMillis(30L);
            } else {
                j11 = 30;
                m41317a = TimeUnit.MILLISECONDS.toDays(m41317a - AbstractC3489d.m17498f());
            }
            return j11 + m41317a;
        }
        return 0L;
    }

    /* renamed from: h */
    public final CloudSubscriptionInfo m2458h() {
        return this.f3157a.m124818m0();
    }

    /* renamed from: i */
    public final int m2459i() {
        return AbstractC0924m0.m3392R7();
    }

    /* renamed from: j */
    public final void m2460j(int i11, boolean z11) {
        if (!this.f3158b.m89807v()) {
            C26676b.m136956f("handlePlanFromServer(" + i11 + "): Feature disabled!", C26676b.b.f126335t);
            return;
        }
        try {
            C21719b m120655d2 = AbstractC23306f.m120655d2();
            AbstractC19074t.m100207e(m120655d2, "provideZaloCloudManager(...)");
            int m2459i = m2459i();
            if (m2459i != i11) {
                m2470u(i11);
                if (i11 == 100) {
                    m120655d2.m112084t(m2459i);
                } else {
                    if (i11 != -1 && i11 != 69) {
                        if (m2459i != -1 && m2459i != 100 && m2459i != 69) {
                            throw new IllegalArgumentException("Invalid zCloud plans: prevPlan=" + m2459i + ", plan=" + i11);
                        }
                        m120655d2.m112081q(m2459i, i11);
                    }
                    m120655d2.m112083s(m2459i, i11);
                }
            }
            if (m2459i != i11 || z11) {
                m120655d2.m112085u(m2459i, i11);
            }
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudSubscription", e11);
        }
    }

    /* renamed from: l */
    public final boolean m2461l() {
        C24747a m120636Y1 = AbstractC23306f.m120636Y1();
        AbstractC19074t.m100207e(m120636Y1, "provideZaloCloudCriticalCaseManager(...)");
        if (m2466q() && m120636Y1.m128532q()) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final boolean m2462m() {
        return AbstractC32236a.m155478d();
    }

    /* renamed from: n */
    public final boolean m2463n() {
        if (m2459i() == -1) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public final boolean m2464o() {
        if (m2459i() == 100) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public final boolean m2465p() {
        if (m2466q() && !m2464o()) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public final boolean m2466q() {
        int m2459i = m2459i();
        if (m2459i != -1 && m2459i != 69) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public final boolean m2467r() {
        if (m2459i() == 69) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public final boolean m2468s() {
        return !m2463n();
    }

    /* renamed from: t */
    public final void m2469t(SubscriptionInfo subscriptionInfo) {
        if (subscriptionInfo != null && subscriptionInfo.m41388b()) {
            CloudSubscriptionInfo m124818m0 = this.f3157a.m124818m0();
            CloudSubscriptionInfo.Companion companion = CloudSubscriptionInfo.Companion;
            AbstractC27323a m145315b = C29085a.f134890a.m145315b();
            m145315b.mo131586a();
            CloudSubscriptionInfo m41323a = companion.m41323a(m145315b.mo131597b(SubscriptionInfo.Companion.serializer(), subscriptionInfo));
            C26676b.m136957g("SMLZCloudSubscription", "onFetchSubscriptionInfoSuccess(): cachedInfo=" + m124818m0 + ", serverResponse=" + subscriptionInfo, null, 4, null);
            this.f3157a.m124810g1(m41323a);
            return;
        }
        C26676b.m136955e("SMLZCloudSubscription", "onFetchSubscriptionInfoSuccess(): INVALID", C26676b.b.f126335t);
    }

    /* renamed from: u */
    public final void m2470u(int i11) {
        C26676b.m136955e("SMLZCloudSubscription", "setSubscriptionPlan(" + i11 + ")", C26676b.b.f126331p);
        AbstractC0924m0.m3614Yq(i11);
    }

    /* renamed from: v */
    public final void m2471v(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "json");
        C26676b.m136957g("SMLZCloudSubscription", "subscriptionIAP(" + jSONObject + "): Invalid build type", null, 4, null);
    }
}
