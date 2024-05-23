package ac;

import ac.C0711j0;
import ac.C0732w;
import ag0.AbstractC0837p0;
import android.content.Context;
import android.text.TextUtils;
import bg0.C2797c;
import com.zing.zalo.analytics.ZaloAnalytics;
import com.zing.zalo.analytics.p059db.AnalyticsRoomDatabase;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Collection;
import nh0.InterfaceC23792b;
import on0.C24321d;
import org.json.JSONArray;
import org.json.JSONObject;
import p036bc.C2716c;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: ac.w */
/* loaded from: classes.dex */
public final class C0732w {
    public static final b Companion = new b(null);

    /* renamed from: g */
    private static final InterfaceC24854k f2442g;

    /* renamed from: a */
    private boolean f2443a;

    /* renamed from: b */
    private boolean f2444b;

    /* renamed from: c */
    private boolean f2445c;

    /* renamed from: d */
    private long f2446d;

    /* renamed from: e */
    private final C2797c f2447e;

    /* renamed from: f */
    private InterfaceC23792b f2448f;

    /* renamed from: ac.w$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f2449q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C0732w mo12V4() {
            return d.f2452a.m1194a();
        }
    }

    /* renamed from: ac.w$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C0732w m1189a() {
            return (C0732w) C0732w.f2442g.getValue();
        }
    }

    /* renamed from: ac.w$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        private int f2450a;

        /* renamed from: b */
        private final ArrayList f2451b = new ArrayList();

        /* renamed from: a */
        private final void m1190a(Object obj) {
            this.f2451b.add(obj);
        }

        /* renamed from: d */
        private final boolean m1191d(int i11) {
            if (i11 > ZaloAnalytics.Companion.m37219b().m37202S()) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public final void m1192b(String str) {
            AbstractC19074t.m100208f(str, "value");
            byte[] bytes = str.getBytes(C24321d.f117408b);
            AbstractC19074t.m100207e(bytes, "this as java.lang.String).getBytes(charset)");
            int length = bytes.length;
            if (m1191d(this.f2450a + length)) {
                AbstractC20110a.m104542k(8, "[Event] [CustomData] Add String with size=" + length + ", total_custom_data_size=" + (this.f2450a + length) + " is out of limit size=" + ZaloAnalytics.Companion.m37219b().m37202S(), new Object[0]);
                return;
            }
            m1190a(str);
            this.f2450a += length;
        }

        /* renamed from: c */
        public final ArrayList m1193c() {
            return this.f2451b;
        }
    }

    /* renamed from: ac.w$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        public static final d f2452a = new d();

        /* renamed from: b */
        private static final C0732w f2453b = new C0732w(null);

        private d() {
        }

        /* renamed from: a */
        public final C0732w m1194a() {
            return f2453b;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f2449q);
        f2442g = m129210a;
    }

    public /* synthetic */ C0732w(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: g */
    private final void m1173g() {
        if (this.f2445c) {
            return;
        }
        this.f2445c = true;
        this.f2447e.mo13474a(new Runnable() { // from class: ac.t
            public /* synthetic */ RunnableC0729t() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0732w.m1174h(C0732w.this);
            }
        });
    }

    /* renamed from: h */
    public static final void m1174h(C0732w c0732w) {
        AbstractC19074t.m100208f(c0732w, "this$0");
        try {
            AnalyticsRoomDatabase.C7304a c7304a = AnalyticsRoomDatabase.Companion;
            Context appContext = CoreUtility.getAppContext();
            AbstractC19074t.m100207e(appContext, "getAppContext()");
            AnalyticsRoomDatabase m37245a = c7304a.m37245a(appContext);
            long mo13207b = m37245a.mo37241I().mo13207b();
            double d11 = mo13207b;
            ZaloAnalytics.C7293b c7293b = ZaloAnalytics.Companion;
            if (d11 > c7293b.m37219b().m37196M() * 1.2d) {
                m37245a.mo37241I().mo13208c(m37245a.mo37241I().mo13210e(mo13207b - c7293b.m37219b().m37196M()));
            }
            c0732w.f2446d = m37245a.mo37241I().mo13207b();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: k */
    public static final void m1175k(long j11, C0732w c0732w) {
        AbstractC19074t.m100208f(c0732w, "this$0");
        try {
            AnalyticsRoomDatabase.C7304a c7304a = AnalyticsRoomDatabase.Companion;
            AbstractC19074t.m100207e(CoreUtility.getAppContext(), "getAppContext()");
            c0732w.f2446d -= c7304a.m37245a(r1).mo37241I().mo13212g(j11);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: n */
    public static final void m1176n(C0732w c0732w) {
        AbstractC19074t.m100208f(c0732w, "this$0");
        try {
            AnalyticsRoomDatabase.C7304a c7304a = AnalyticsRoomDatabase.Companion;
            Context appContext = CoreUtility.getAppContext();
            AbstractC19074t.m100207e(appContext, "getAppContext()");
            c0732w.f2446d = c7304a.m37245a(appContext).mo37241I().mo13207b();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: r */
    public static /* synthetic */ void m1177r(C0732w c0732w, String str, String str2, C0708i c0708i, c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = "";
        }
        if ((i11 & 4) != 0) {
            c0708i = null;
        }
        if ((i11 & 8) != 0) {
            cVar = null;
        }
        c0732w.m1187q(str, str2, c0708i, cVar);
    }

    /* renamed from: s */
    public static final void m1178s(C0732w c0732w, String str, String str2, C0708i c0708i, c cVar, long j11) {
        AbstractC19074t.m100208f(c0732w, "this$0");
        AbstractC19074t.m100208f(str, "$actionId");
        AbstractC19074t.m100208f(str2, "$source");
        try {
            C0711j0.b bVar = C0711j0.Companion;
            if (bVar.m1104a().m1096o() == null) {
                c0732w.m1179t(str, str2, c0708i, cVar);
                return;
            }
            C0722p m1096o = bVar.m1104a().m1096o();
            if (m1096o == null || !m1096o.m1154e()) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(C0697c0.Companion.m1048b().m1038m());
            C2716c c2716c = new C2716c(str, j11, m1096o.m1153d());
            c2716c.m13230m(str2);
            String jSONArray = new JSONArray((Collection) arrayList).toString();
            AbstractC19074t.m100207e(jSONArray, "JSONArray(screenList).toString()");
            c2716c.m13229l(jSONArray);
            if (c0708i != null) {
                String jSONObject = c0708i.m1071b().toString();
                AbstractC19074t.m100207e(jSONObject, "this.getExtraData().toString()");
                c2716c.m13227j(jSONObject);
            }
            if (cVar != null) {
                String jSONArray2 = new JSONArray((Collection) cVar.m1193c()).toString();
                AbstractC19074t.m100207e(jSONArray2, "JSONArray(this.getCustomData()).toString()");
                c2716c.m13226i(jSONArray2);
            }
            AnalyticsRoomDatabase.C7304a c7304a = AnalyticsRoomDatabase.Companion;
            Context appContext = CoreUtility.getAppContext();
            AbstractC19074t.m100207e(appContext, "getAppContext()");
            c7304a.m37245a(appContext).mo37241I().mo13211f(c2716c);
            c0732w.f2446d++;
            AbstractC20110a.m104542k(8, "[Event] TrackEvent ... id = " + c2716c.m13218a() + ", source = " + c2716c.m13225h() + ", screens = " + c2716c.m13223f() + ", extraData = " + c2716c.m13221d() + ", data = " + c2716c.m13219b() + ", time = " + c2716c.m13220c() + ", sessionId = " + c2716c.m13224g(), new Object[0]);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: t */
    private final void m1179t(String str, String str2, C0708i c0708i, c cVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f2447e.mo13474a(new Runnable() { // from class: ac.u

            /* renamed from: p */
            public final /* synthetic */ String f2434p;

            /* renamed from: q */
            public final /* synthetic */ long f2435q;

            /* renamed from: r */
            public final /* synthetic */ String f2436r;

            /* renamed from: s */
            public final /* synthetic */ C0708i f2437s;

            /* renamed from: t */
            public final /* synthetic */ C0732w.c f2438t;

            /* renamed from: u */
            public final /* synthetic */ C0732w f2439u;

            public /* synthetic */ RunnableC0730u(String str3, long j11, String str22, C0708i c0708i2, C0732w.c cVar2, C0732w this) {
                r1 = str3;
                r2 = j11;
                r4 = str22;
                r5 = c0708i2;
                r6 = cVar2;
                r7 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0732w.m1180u(r1, r2, r4, r5, r6, r7);
            }
        });
    }

    /* renamed from: u */
    public static final void m1180u(String str, long j11, String str2, C0708i c0708i, c cVar, C0732w c0732w) {
        AbstractC19074t.m100208f(str, "$actionId");
        AbstractC19074t.m100208f(str2, "$source");
        AbstractC19074t.m100208f(c0732w, "this$0");
        try {
            C2716c c2716c = new C2716c(str, j11, 0L);
            c2716c.m13230m(str2);
            String jSONArray = new JSONArray().toString();
            AbstractC19074t.m100207e(jSONArray, "JSONArray().toString()");
            c2716c.m13229l(jSONArray);
            if (c0708i != null) {
                String jSONObject = c0708i.m1071b().toString();
                AbstractC19074t.m100207e(jSONObject, "this.getExtraData().toString()");
                c2716c.m13227j(jSONObject);
            }
            if (cVar != null) {
                String jSONArray2 = new JSONArray((Collection) cVar.m1193c()).toString();
                AbstractC19074t.m100207e(jSONArray2, "JSONArray(this.getCustomData()).toString()");
                c2716c.m13226i(jSONArray2);
            }
            AnalyticsRoomDatabase.C7304a c7304a = AnalyticsRoomDatabase.Companion;
            Context appContext = CoreUtility.getAppContext();
            AbstractC19074t.m100207e(appContext, "getAppContext()");
            c7304a.m37245a(appContext).mo37241I().mo13211f(c2716c);
            c0732w.f2446d++;
            AbstractC20110a.m104542k(8, "[Event] TrackEventLocal ... id = " + c2716c.m13218a() + ", source = " + c2716c.m13225h() + ", screens = " + c2716c.m13223f() + ", extraData = " + c2716c.m13221d() + ", data = " + c2716c.m13219b() + ", time = " + c2716c.m13220c() + ", sessionId = " + c2716c.m13224g(), new Object[0]);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: i */
    public final void m1181i() {
        this.f2444b = false;
        this.f2443a = false;
    }

    /* renamed from: j */
    public final void m1182j(long j11) {
        this.f2447e.mo13474a(new Runnable() { // from class: ac.v

            /* renamed from: p */
            public final /* synthetic */ long f2440p;

            /* renamed from: q */
            public final /* synthetic */ C0732w f2441q;

            public /* synthetic */ RunnableC0731v(long j112, C0732w this) {
                r1 = j112;
                r3 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0732w.m1175k(r1, r3);
            }
        });
    }

    /* renamed from: l */
    public final long m1183l() {
        return this.f2446d;
    }

    /* renamed from: m */
    public final void m1184m(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "config");
        if (this.f2444b) {
            return;
        }
        this.f2444b = true;
        this.f2448f = ZaloAnalytics.Companion.m37219b().m37198O();
        boolean optBoolean = jSONObject.optBoolean("enable");
        this.f2443a = optBoolean;
        if (!optBoolean) {
            return;
        }
        this.f2447e.mo13474a(new Runnable() { // from class: ac.r
            public /* synthetic */ RunnableC0726r() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0732w.m1176n(C0732w.this);
            }
        });
    }

    /* renamed from: o */
    public final boolean m1185o() {
        return this.f2444b && this.f2443a;
    }

    /* renamed from: p */
    public final void m1186p(long j11) {
        this.f2446d = j11;
    }

    /* renamed from: q */
    public final void m1187q(String str, String str2, C0708i c0708i, c cVar) {
        long currentTimeMillis;
        AbstractC19074t.m100208f(str, "actionId");
        AbstractC19074t.m100208f(str2, "source");
        m1173g();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!this.f2444b && !this.f2443a) {
            m1179t(str, str2, c0708i, cVar);
            return;
        }
        if (!m1185o()) {
            return;
        }
        InterfaceC23792b interfaceC23792b = this.f2448f;
        InterfaceC23792b interfaceC23792b2 = null;
        if (interfaceC23792b == null) {
            AbstractC19074t.m100223u("timeProvider");
            interfaceC23792b = null;
        }
        if (interfaceC23792b.mo124314i() != 0) {
            InterfaceC23792b interfaceC23792b3 = this.f2448f;
            if (interfaceC23792b3 == null) {
                AbstractC19074t.m100223u("timeProvider");
            } else {
                interfaceC23792b2 = interfaceC23792b3;
            }
            currentTimeMillis = interfaceC23792b2.mo124314i();
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        this.f2447e.mo13474a(new Runnable() { // from class: ac.s

            /* renamed from: q */
            public final /* synthetic */ String f2428q;

            /* renamed from: r */
            public final /* synthetic */ String f2429r;

            /* renamed from: s */
            public final /* synthetic */ C0708i f2430s;

            /* renamed from: t */
            public final /* synthetic */ C0732w.c f2431t;

            /* renamed from: u */
            public final /* synthetic */ long f2432u;

            public /* synthetic */ RunnableC0728s(String str3, String str22, C0708i c0708i2, C0732w.c cVar2, long currentTimeMillis2) {
                r2 = str3;
                r3 = str22;
                r4 = c0708i2;
                r5 = cVar2;
                r6 = currentTimeMillis2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0732w.m1178s(C0732w.this, r2, r3, r4, r5, r6);
            }
        });
    }

    private C0732w() {
        this.f2447e = new C2797c(AbstractC0837p0.Companion.m2237f());
    }
}
