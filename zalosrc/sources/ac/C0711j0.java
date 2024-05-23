package ac;

import ac.C0722p;
import ag0.AbstractC0837p0;
import android.content.Context;
import bg0.C2797c;
import com.zing.zalo.analytics.ZaloAnalytics;
import com.zing.zalo.analytics.p059db.AnalyticsRoomDatabase;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import nh0.InterfaceC23792b;
import org.json.JSONObject;
import p036bc.C2722i;
import p036bc.InterfaceC2720g;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: ac.j0 */
/* loaded from: classes.dex */
public final class C0711j0 {
    public static final b Companion = new b(null);

    /* renamed from: h */
    private static final InterfaceC24854k f2333h;

    /* renamed from: a */
    private boolean f2334a;

    /* renamed from: b */
    private boolean f2335b;

    /* renamed from: c */
    private long f2336c;

    /* renamed from: d */
    private long f2337d;

    /* renamed from: e */
    private C0722p f2338e;

    /* renamed from: f */
    private final C2797c f2339f;

    /* renamed from: g */
    private InterfaceC23792b f2340g;

    /* renamed from: ac.j0$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f2341q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C0711j0 mo12V4() {
            return c.f2342a.m1105a();
        }
    }

    /* renamed from: ac.j0$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C0711j0 m1104a() {
            return (C0711j0) C0711j0.f2333h.getValue();
        }
    }

    /* renamed from: ac.j0$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f2342a = new c();

        /* renamed from: b */
        private static final C0711j0 f2343b = new C0711j0(null);

        private c() {
        }

        /* renamed from: a */
        public final C0711j0 m1105a() {
            return f2343b;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f2341q);
        f2333h = m129210a;
    }

    public /* synthetic */ C0711j0(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: j */
    public static final void m1086j(long j11, C0711j0 c0711j0) {
        long j12;
        AbstractC19074t.m100208f(c0711j0, "this$0");
        try {
            AnalyticsRoomDatabase.C7304a c7304a = AnalyticsRoomDatabase.Companion;
            Context appContext = CoreUtility.getAppContext();
            AbstractC19074t.m100207e(appContext, "getAppContext()");
            InterfaceC2720g mo37243K = c7304a.m37245a(appContext).mo37243K();
            C0722p c0722p = c0711j0.f2338e;
            if (c0722p != null) {
                j12 = c0722p.m1152c();
            } else {
                j12 = -1;
            }
            c0711j0.f2337d -= mo37243K.mo13258f(j11, j12);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: l */
    public static final void m1087l(C0711j0 c0711j0, C0722p.a aVar, long j11) {
        AbstractC19074t.m100208f(c0711j0, "this$0");
        AbstractC19074t.m100208f(aVar, "$endReason");
        try {
            C0722p c0722p = c0711j0.f2338e;
            if (c0722p == null || !c0722p.m1154e()) {
                return;
            }
            c0722p.m1160k(false);
            if (aVar == C0722p.a.CRASH) {
                j11 = 0;
            }
            c0722p.m1158i(j11);
            c0722p.m1157h(aVar);
            C2722i c2722i = new C2722i(c0722p.m1156g(), c0722p.m1155f().m1165c());
            c2722i.m13274j(c0722p.m1152c());
            c2722i.m13272h(c0722p.m1151b());
            c2722i.m13271g(c0722p.m1150a().m1163c());
            AnalyticsRoomDatabase.C7304a c7304a = AnalyticsRoomDatabase.Companion;
            Context appContext = CoreUtility.getAppContext();
            AbstractC19074t.m100207e(appContext, "getAppContext()");
            AbstractC20110a.m104542k(8, "[Session] EndSession [start: " + c2722i.m13270f() + " - end: " + c2722i.m13266b() + " - id: " + c2722i.m13268d() + "] ... " + aVar + " - result - " + c7304a.m37245a(appContext).mo37243K().mo13257e(c2722i), new Object[0]);
            ZaloAnalytics.Companion.m37219b().m37194J().clear();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: n */
    public static final void m1088n(C0711j0 c0711j0, ZaloAnalytics.C7296e c7296e, long j11) {
        AbstractC19074t.m100208f(c0711j0, "this$0");
        try {
            C0722p c0722p = c0711j0.f2338e;
            if (c0722p == null) {
                if (c7296e != null) {
                    c7296e.mo37225b();
                    return;
                }
                return;
            }
            AbstractC19074t.m100205c(c0722p);
            if (!c0722p.m1154e()) {
                if (c7296e != null) {
                    c7296e.mo37225b();
                    return;
                }
                return;
            }
            c0722p.m1160k(false);
            c0722p.m1157h(C0722p.a.NORMAL_END);
            c0722p.m1158i(j11);
            C2722i c2722i = new C2722i(c0722p.m1156g(), c0722p.m1155f().m1165c());
            c2722i.m13274j(c0722p.m1152c());
            c2722i.m13272h(c0722p.m1151b());
            c2722i.m13271g(c0722p.m1150a().m1163c());
            AnalyticsRoomDatabase.C7304a c7304a = AnalyticsRoomDatabase.Companion;
            Context appContext = CoreUtility.getAppContext();
            AbstractC19074t.m100207e(appContext, "getAppContext()");
            c7304a.m37245a(appContext).mo37243K().mo13257e(c2722i);
            AbstractC20110a.m104542k(8, "[Session] forceEndSession [start: " + c2722i.m13270f() + " - end: " + c2722i.m13266b() + " - id: " + c2722i.m13268d() + "] ... " + c0722p.m1150a(), new Object[0]);
            if (c7296e != null) {
                c7296e.mo37225b();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: r */
    public static final void m1089r(C0711j0 c0711j0) {
        AbstractC19074t.m100208f(c0711j0, "this$0");
        try {
            AnalyticsRoomDatabase.C7304a c7304a = AnalyticsRoomDatabase.Companion;
            Context appContext = CoreUtility.getAppContext();
            AbstractC19074t.m100207e(appContext, "getAppContext()");
            c0711j0.f2337d = c7304a.m37245a(appContext).mo37243K().mo13254b();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: u */
    public static final void m1090u(C0711j0 c0711j0, C0722p.a aVar, long j11) {
        long j12;
        AbstractC19074t.m100208f(c0711j0, "this$0");
        AbstractC19074t.m100208f(aVar, "$reason");
        try {
            C0722p c0722p = c0711j0.f2338e;
            if (c0722p == null || !c0722p.m1154e()) {
                return;
            }
            if (aVar == C0722p.a.CRASH) {
                j12 = 0;
            } else {
                j12 = j11;
            }
            c0722p.m1158i(j12);
            c0722p.m1157h(aVar);
            C2722i c2722i = new C2722i(c0722p.m1156g(), c0722p.m1155f().m1165c());
            c2722i.m13274j(c0722p.m1152c());
            c2722i.m13272h(c0722p.m1151b());
            c2722i.m13271g(c0722p.m1150a().m1163c());
            AnalyticsRoomDatabase.C7304a c7304a = AnalyticsRoomDatabase.Companion;
            Context appContext = CoreUtility.getAppContext();
            AbstractC19074t.m100207e(appContext, "getAppContext()");
            c7304a.m37245a(appContext).mo37243K().mo13257e(c2722i);
            AbstractC20110a.m104542k(8, "[Session] [setEndReason : " + aVar + " - time : " + j11 + ']', new Object[0]);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: x */
    public static final void m1091x(C0711j0 c0711j0, long j11, C0722p.b bVar) {
        AbstractC19074t.m100208f(c0711j0, "this$0");
        AbstractC19074t.m100208f(bVar, "$startSource");
        try {
            C0722p c0722p = c0711j0.f2338e;
            if (c0722p != null) {
                AbstractC19074t.m100205c(c0722p);
                if (c0722p.m1154e()) {
                    return;
                }
                if (Math.abs(j11 - c0722p.m1151b()) > c0711j0.f2336c) {
                    AbstractC20110a.m104542k(8, "[Session] [Tracking session timeout - create new session]", new Object[0]);
                    c0711j0.f2338e = null;
                } else {
                    if (c0722p.m1154e()) {
                        return;
                    }
                    c0722p.m1160k(true);
                    C2722i c2722i = new C2722i(c0722p.m1156g(), c0722p.m1155f().m1165c());
                    c2722i.m13274j(c0722p.m1152c());
                    C0722p.a aVar = C0722p.a.NORMAL_END;
                    c2722i.m13271g(aVar.m1163c());
                    AnalyticsRoomDatabase.C7304a c7304a = AnalyticsRoomDatabase.Companion;
                    Context appContext = CoreUtility.getAppContext();
                    AbstractC19074t.m100207e(appContext, "getAppContext()");
                    int mo13257e = c7304a.m37245a(appContext).mo37243K().mo13257e(c2722i);
                    c0722p.m1157h(aVar);
                    AbstractC20110a.m104542k(8, "[Session] Update current session [start: " + c0722p.m1156g() + " - end: " + c0722p.m1151b() + " - id: " + c0722p.m1152c() + " - result: " + mo13257e + ']', new Object[0]);
                    return;
                }
            }
            C0722p c0722p2 = new C0722p(j11);
            c0722p2.m1160k(true);
            c0722p2.m1161l(bVar);
            C2722i c2722i2 = new C2722i(c0722p2.m1156g(), c0722p2.m1155f().m1165c());
            c2722i2.m13271g(c0722p2.m1150a().m1163c());
            AnalyticsRoomDatabase.C7304a c7304a2 = AnalyticsRoomDatabase.Companion;
            Context appContext2 = CoreUtility.getAppContext();
            AbstractC19074t.m100207e(appContext2, "getAppContext()");
            c0722p2.m1159j(c7304a2.m37245a(appContext2).mo37243K().mo13260h(c2722i2));
            c0711j0.f2338e = c0722p2;
            c0711j0.f2337d++;
            AbstractC20110a.m104542k(8, "[Session] Create new session [start: " + c0722p2.m1156g() + " - end: " + c0722p2.m1151b() + " - id: " + c0722p2.m1152c() + "] .... source: " + bVar, new Object[0]);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: h */
    public final void m1092h() {
        this.f2335b = false;
    }

    /* renamed from: i */
    public final void m1093i(long j11) {
        this.f2339f.mo13474a(new Runnable() { // from class: ac.g0

            /* renamed from: p */
            public final /* synthetic */ long f2319p;

            /* renamed from: q */
            public final /* synthetic */ C0711j0 f2320q;

            public /* synthetic */ RunnableC0705g0(long j112, C0711j0 this) {
                r1 = j112;
                r3 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0711j0.m1086j(r1, r3);
            }
        });
    }

    /* renamed from: k */
    public final void m1094k(C0722p.a aVar) {
        long currentTimeMillis;
        AbstractC19074t.m100208f(aVar, "endReason");
        if (!m1099s()) {
            return;
        }
        InterfaceC23792b interfaceC23792b = this.f2340g;
        InterfaceC23792b interfaceC23792b2 = null;
        if (interfaceC23792b == null) {
            AbstractC19074t.m100223u("timeProvider");
            interfaceC23792b = null;
        }
        if (interfaceC23792b.mo124314i() != 0) {
            InterfaceC23792b interfaceC23792b3 = this.f2340g;
            if (interfaceC23792b3 == null) {
                AbstractC19074t.m100223u("timeProvider");
            } else {
                interfaceC23792b2 = interfaceC23792b3;
            }
            currentTimeMillis = interfaceC23792b2.mo124314i();
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        this.f2339f.mo13474a(new Runnable() { // from class: ac.e0

            /* renamed from: q */
            public final /* synthetic */ C0722p.a f2307q;

            /* renamed from: r */
            public final /* synthetic */ long f2308r;

            public /* synthetic */ RunnableC0701e0(C0722p.a aVar2, long currentTimeMillis2) {
                r2 = aVar2;
                r3 = currentTimeMillis2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0711j0.m1087l(C0711j0.this, r2, r3);
            }
        });
    }

    /* renamed from: m */
    public final void m1095m(ZaloAnalytics.C7296e c7296e) {
        long currentTimeMillis;
        InterfaceC23792b interfaceC23792b = this.f2340g;
        InterfaceC23792b interfaceC23792b2 = null;
        if (interfaceC23792b == null) {
            AbstractC19074t.m100223u("timeProvider");
            interfaceC23792b = null;
        }
        if (interfaceC23792b.mo124314i() != 0) {
            InterfaceC23792b interfaceC23792b3 = this.f2340g;
            if (interfaceC23792b3 == null) {
                AbstractC19074t.m100223u("timeProvider");
            } else {
                interfaceC23792b2 = interfaceC23792b3;
            }
            currentTimeMillis = interfaceC23792b2.mo124314i();
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        this.f2339f.mo13474a(new Runnable() { // from class: ac.i0

            /* renamed from: q */
            public final /* synthetic */ ZaloAnalytics.C7296e f2330q;

            /* renamed from: r */
            public final /* synthetic */ long f2331r;

            public /* synthetic */ RunnableC0709i0(ZaloAnalytics.C7296e c7296e2, long currentTimeMillis2) {
                r2 = c7296e2;
                r3 = currentTimeMillis2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0711j0.m1088n(C0711j0.this, r2, r3);
            }
        });
    }

    /* renamed from: o */
    public final C0722p m1096o() {
        return this.f2338e;
    }

    /* renamed from: p */
    public final long m1097p() {
        return this.f2337d;
    }

    /* renamed from: q */
    public final void m1098q(JSONObject jSONObject, boolean z11) {
        AbstractC19074t.m100208f(jSONObject, "config");
        if (this.f2335b) {
            return;
        }
        this.f2335b = true;
        this.f2340g = ZaloAnalytics.Companion.m37219b().m37198O();
        this.f2334a = z11;
        if (!z11) {
            return;
        }
        this.f2336c = jSONObject.optLong("timeout");
        this.f2339f.mo13474a(new Runnable() { // from class: ac.f0
            public /* synthetic */ RunnableC0703f0() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0711j0.m1089r(C0711j0.this);
            }
        });
    }

    /* renamed from: s */
    public final boolean m1099s() {
        return this.f2335b && this.f2334a;
    }

    /* renamed from: t */
    public final void m1100t(C0722p.a aVar) {
        long currentTimeMillis;
        AbstractC19074t.m100208f(aVar, "reason");
        if (!m1099s()) {
            return;
        }
        InterfaceC23792b interfaceC23792b = this.f2340g;
        InterfaceC23792b interfaceC23792b2 = null;
        if (interfaceC23792b == null) {
            AbstractC19074t.m100223u("timeProvider");
            interfaceC23792b = null;
        }
        if (interfaceC23792b.mo124314i() != 0) {
            InterfaceC23792b interfaceC23792b3 = this.f2340g;
            if (interfaceC23792b3 == null) {
                AbstractC19074t.m100223u("timeProvider");
            } else {
                interfaceC23792b2 = interfaceC23792b3;
            }
            currentTimeMillis = interfaceC23792b2.mo124314i();
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        this.f2339f.mo13474a(new Runnable() { // from class: ac.h0

            /* renamed from: q */
            public final /* synthetic */ C0722p.a f2326q;

            /* renamed from: r */
            public final /* synthetic */ long f2327r;

            public /* synthetic */ RunnableC0707h0(C0722p.a aVar2, long currentTimeMillis2) {
                r2 = aVar2;
                r3 = currentTimeMillis2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0711j0.m1090u(C0711j0.this, r2, r3);
            }
        });
    }

    /* renamed from: v */
    public final void m1101v(long j11) {
        this.f2337d = j11;
    }

    /* renamed from: w */
    public final void m1102w(C0722p.b bVar) {
        long currentTimeMillis;
        AbstractC19074t.m100208f(bVar, "startSource");
        if (!m1099s()) {
            return;
        }
        InterfaceC23792b interfaceC23792b = this.f2340g;
        InterfaceC23792b interfaceC23792b2 = null;
        if (interfaceC23792b == null) {
            AbstractC19074t.m100223u("timeProvider");
            interfaceC23792b = null;
        }
        if (interfaceC23792b.mo124314i() != 0) {
            InterfaceC23792b interfaceC23792b3 = this.f2340g;
            if (interfaceC23792b3 == null) {
                AbstractC19074t.m100223u("timeProvider");
            } else {
                interfaceC23792b2 = interfaceC23792b3;
            }
            currentTimeMillis = interfaceC23792b2.mo124314i();
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        this.f2339f.mo13474a(new Runnable() { // from class: ac.d0

            /* renamed from: q */
            public final /* synthetic */ long f2303q;

            /* renamed from: r */
            public final /* synthetic */ C0722p.b f2304r;

            public /* synthetic */ RunnableC0699d0(long currentTimeMillis2, C0722p.b bVar2) {
                r2 = currentTimeMillis2;
                r4 = bVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0711j0.m1091x(C0711j0.this, r2, r4);
            }
        });
    }

    private C0711j0() {
        this.f2336c = 10000L;
        this.f2339f = new C2797c(AbstractC0837p0.Companion.m2237f());
    }
}
